import booking_characteristics.Booking;
import booking_characteristics.PaymentStatus;
import client_database.Client;
import client_database.ClientAccount;
import movie_characteristics.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class COORDINATOR {
    public static void main(String[] args) {
        List<Movie>booked = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Hi! Please, register on our site to make booking!Please, enter\nYour name: ");
        String name = sc.nextLine();
        System.out.print("Your surname: ");
        String surname = sc.nextLine();
        System.out.print("Your email: ");
        String email= sc.nextLine();
        System.out.print("Your phone: ");
        String phone= sc.nextLine();
        System.out.print("Your age: ");
        int age= sc.nextInt();
        Client newClient = new Client(name, surname,age, email, phone);
        System.out.println("You are now our new client! "+ newClient.toString());

        System.out.print("Enter your password: ");
        String password = sc.nextLine();
        ClientAccount newClientAccount = new ClientAccount(email,password);
        newClient.setAccount(newClientAccount);
        System.out.println("Your account is created! \nNow enter the number of the placement you want to go!");
        List<Placement>listOfPlaces = PlacementGenerator.createPlacements();
        System.out.println(listOfPlaces);
        String placeNumber = sc.nextLine();

        if(isNumeric(placeNumber)) {
            switch (placeNumber) {
                case "1":
                    newClientAccount.setPlacement(listOfPlaces.get(0));
                    break;
                case "2":
                    newClientAccount.setPlacement(listOfPlaces.get(1));
                    break;
                case "3":
                    newClientAccount.setPlacement(listOfPlaces.get(2));
                    break;
                case "4":
                    newClientAccount.setPlacement(listOfPlaces.get(3));
                    break;
                case "5":
                    newClientAccount.setPlacement(listOfPlaces.get(4));
                    break;
            }
        }
//        }else{
//            while(!isNumeric(placeNumber)){
//                System.out.println("Wrong key!");
//                placeNumber = sc.nextLine();
//            }
//            switch (placeNumber) {
//                case "1":
//                    newClientAccount.setPlacement(listOfPlaces.get(0));
//                    break;
//                case "2":
//                    newClientAccount.setPlacement(listOfPlaces.get(1));
//                    break;
//                case "3":
//                    newClientAccount.setPlacement(listOfPlaces.get(2));
//                    break;
//                case "4":
//                    newClientAccount.setPlacement(listOfPlaces.get(3));
//                    break;
//                case "5":
//                    newClientAccount.setPlacement(listOfPlaces.get(4));
//                    break;
//            }
//        }

        System.out.println("Now tou can see the list of films in " + newClientAccount.getPlacement().getCinema().getName()+". Would you like to sort them before &(y/n)");
        String answer = sc.nextLine();
        List<Movie>sortedMovie = null;
        switch (answer) {
                case "y":
            case "Y":
                System.out.println("How you can sort?\na) by rating\nb) by genre");
                String answer2 = sc.nextLine();
                if(answer2.equals("a")){
                    System.out.println("Would you like to see \na) popular \nb) best rating movies?");
                    String answer3 = sc.nextLine();
                    if(answer3.equals("a")){
                        sortedMovie = MovieSorter.filterByPopular();
                    }else if(answer3.equals("b")){
                        sortedMovie = MovieSorter.filterByPopular();
                    }
                }else if(answer2.equals("b")){
                    System.out.println("Which genre you would like? \na) Comedy \nb) Horror \n" +
                            "c) Thriller \nd) Drama \ne) Fantasy \nf) Sci-fi");
                    String answer4 = sc.nextLine();
                    switch (answer4) {
                        case "a":
                            sortedMovie = MovieSorter.filterComedies();

                            break;
                        case "b":
                            sortedMovie = MovieSorter.filterHorrors();
                            break;
                        case "c":
                            sortedMovie = MovieSorter.filterThriller();
                            break;
                        case "d":
                            sortedMovie = MovieSorter.filterDramas();
                            break;
                        case "e":
                            sortedMovie = MovieSorter.filterFantasy();
                            break;
                        case "f":
                            sortedMovie = MovieSorter.filterSciFi();
                            break;
                    }
                }
                    break;

                case "n":
            case "N":
                System.out.println("Popular films: ");
                sortedMovie = MovieSorter.filterByPopular();

                    break;
        }
        assert sortedMovie != null;
        MovieCreator.printMovies(sortedMovie);
        System.out.println("Enter the number of movie, you want to watch");
        int chosenMovie = sc.nextInt();
        booked.add(sortedMovie.get(chosenMovie-1));
        Booking first = new Booking(LocalDate.now(), PaymentStatus.UNPAID, booked);
        newClientAccount.setBooking(first);
//        System.out.println(newClient.toString());
        System.out.println("Choose your seats: ");
        System.out.println("-------------------SCREEN-------------------");
        System.out.println(" | 1A 2A 3A 4A 5A 6A 7A 8A 9A 10A 11A 12A 13A 14A 15A   |\n" +
                " |  1B 2B 3B 4B 5B 6B 7B 8B 9B 10B 11B 12B 13B 14B 15B   |\n" +
                " |  1C 2C 3C 4C 5C 6C 7C 8C 9C 10C 11C 12C 13C 14C 15C   |\n" +
                " |  1D 2D 3D 4D 5D 6D 7D 8D 9D 10D 11D 12D 13D 14D 15D   | NORMAL\n" +
                " |  1E 2E 3E 4E 5E 6E 7E 8E 9E 10E 11E 12E 13E 14E 15E   |\n" +
                " |  1F 2F 3F 4F 5F 6F 7F 8F 9F 10F 11F 12F 13F 14F 15F   |\n" +
                " |  1G 2G 3G 4G 5G 6G 7G 8G 9G 10G 11G 12G 13G 14G 15G   |\n" +
                " <  1H 2H 3H 4H 5H 6H 7H 8H 9H 10H 11H 12H 13H 14H 15H   >\n" +
                " <  1I 2I 3I 4I 5I 6I 7I 8I 9I 10I 11I 12I 13I 14I 15I   > VIP\n" +
                " *  1J 2J 3J 4J 5J 6J 7J 8J 9J 10J 11J 12J 13J 14J 15J   * PREMIUM\n");

    }
    private static boolean isNumeric(String str)
    {
        try
        {
            int d = Integer.parseInt(str);
            if(d<=1 & d<=5){
                return true;
            }
        }
        catch(NumberFormatException nfe)
        {
            return false;
        }
        return true;
    }
}
