import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        String [] toys = new String [9];
        toys[0] = "Buzz Lightyear";
        toys[1] = "Sheriff Woody";
        toys[2] = "Mr. Potato Head";
        toys[3] = "Barbie";
        toys[4] = "Troll doll";
        toys[5] = "Tonka Truck";
        toys[6] = "Elmo";
        toys[7] = "Big bird";
        toys[8] = "Cookie Monster";

        // Make a list of lists or hashmap to classify the toys.
        ArrayList<String> actionFigures = new ArrayList<>();
        actionFigures.add(toys[0]);
        actionFigures.add(toys[1]);

        ArrayList<String> dolls = new ArrayList<>();
        dolls.add(toys[2]);
        dolls.add(toys[3]);
        dolls.add(toys[4]);

        ArrayList<String> vehicles = new ArrayList<>();
        vehicles.add(toys[5]);

        ArrayList<String> stuffedToys = new ArrayList<>();
        stuffedToys.add(toys[6]);
        stuffedToys.add(toys[7]);
        stuffedToys.add(toys[8]);

        ArrayList<ArrayList<String>> toysInStore = new ArrayList<>();
        toysInStore.add(actionFigures);
        toysInStore.add(dolls);
        toysInStore.add(vehicles);
        toysInStore.add(stuffedToys);

        // Then sort the list of lists or hashmap in an ascending order
        // you have to sort each list within the lists
        for (ArrayList<String> toyList : toysInStore) {
            Collections.sort(toyList);
        }

        //Print each value
        for (ArrayList<String> toyList : toysInStore) {
            for (String eachToy : toyList) {
                System.out.println(eachToy);
            }
            // add a line after each toy category
            System.out.println();
        }



    }
}
