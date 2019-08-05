package movie_characteristics;

import java.util.ArrayList;
import java.util.List;

public class PlacementGenerator {
    public static List<Placement> createPlacements(){
        List<Placement>listOfPlacements = new ArrayList<>();
        listOfPlacements.add(new Placement(new Cinema("Linia Kino", "Kyiv, Gryshka St, 5 ", (int)((Math.random()*5)+1), MovieCreator.createListOfMovie())));
        listOfPlacements.add(new Placement(new Cinema("Kyiv", "Kyiv, Vasylkyvska St, 19 ", (int)((Math.random()*5)+1), MovieCreator.createListOfMovie())));
        listOfPlacements.add(new Placement(new Cinema("Wizoria", "Kyiv, Verbytskogo St, 1 ", (int)((Math.random()*5)+1), MovieCreator.createListOfMovie())));
        listOfPlacements.add(new Placement(new Cinema("Fakel", "Kyiv, Bazhana St, 3A ", (int)((Math.random()*5)+1), MovieCreator.createListOfMovie())));
        listOfPlacements.add(new Placement(new Cinema("Multiplex", "Kyiv, Sheptitskogo St, 4 ", (int)((Math.random()*5)+1), MovieCreator.createListOfMovie())));
        return listOfPlacements;
    }
//
//    public static void main(String[] args) {
//        System.out.print(createPlacements());
//    }
}
