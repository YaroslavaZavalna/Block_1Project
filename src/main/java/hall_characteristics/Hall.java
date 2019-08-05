package hall_characteristics;

import java.util.ArrayList;
import java.util.List;

public class Hall {
    private int number;
    private int amountOfSeats;
    private List<Seat> seats;

    public Hall(int number, int amountOfSeats) {
        this.number = number;
        this.amountOfSeats = amountOfSeats;
        this.seats = createListOfSeats(amountOfSeats);
    }
    public List<Seat> bookSeat(int amount, SeatType seatType){
        List<Seat>bookedSeats = new ArrayList<>();
        new Hall(number, amountOfSeats);
        for (int i = 0; i < amount; i++) {
            bookedSeats.add(new Seat(seatType));
        }
        return bookedSeats;
    }
//    public Hall(){
//        List<Seat>list = bookSeat(4, SeatType.NORMAL);
//        System.out.print(list);
//    }

    public static void main(String[] args) {
    }
    public static List<Seat> createListOfSeats(int seatsQuantity){
        List<Seat>seats = new ArrayList<>();
        int vipSeatsQuantity = seatsQuantity/10;
        int premiumSeatsQuantitu = (seatsQuantity-vipSeatsQuantity)/10*3;
        int normalSeatsQuantity = seatsQuantity-(vipSeatsQuantity+premiumSeatsQuantitu);
        for (int i = 0; i < vipSeatsQuantity; i++) {
            seats.add(new Seat(SeatType.VIP));
        }
        for (int i = 0; i <premiumSeatsQuantitu ; i++) {
            seats.add(new Seat(SeatType.PREMIUM));
        }
        for (int i = 0; i < normalSeatsQuantity; i++) {
            seats.add(new Seat(SeatType.NORMAL));
        }
        return seats;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getAmountOfSeats() {
        return amountOfSeats;
    }

    public void setAmountOfSeats(int amountOfSeats) {
        this.amountOfSeats = amountOfSeats;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }

    @Override
    public String toString() {
        return "Hall " +
                "number=" + number +
                ", amountOfSeats=" + amountOfSeats;
    }
}
