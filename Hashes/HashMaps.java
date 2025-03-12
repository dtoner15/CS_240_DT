package Hashes;

import java.util.*;


//Hashmaps look like this HashMap<key, Value>. You can all types in them, and the types don't have to match
public class HashMaps {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<Integer, String> fruits = new HashMap<>();//create hashmap

        //insert values
        fruits.put(1, "Apple");
        fruits.put(2, "Bannana");
        fruits.put(3, "Orange");
        fruits.put(4, "Grape");

        //Practice problem begins here

        System.out.println("Intial HashMap Contents: " + fruits);
        System.out.printf("Enter the key (integer) to search for a fruit:%n");
        int pickOne = input.nextInt();
        System.out.printf("The fruit corresponding to the key %d is: %s%n",pickOne,  fruits.get(pickOne));

        System.out.println("Enter a key (integer) to remove from from the HashMap: ");
        pickOne = input.nextInt();
        System.out.printf("The fruit corresponding to the key %d is: %s%n", pickOne, fruits.remove(pickOne));
        System.out.printf("After removing key %d, the HashMap looks like this: %s%n",pickOne, fruits);

        input.close();
    }
}
