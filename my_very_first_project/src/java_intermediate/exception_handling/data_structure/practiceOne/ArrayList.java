package java_intermediate.exception_handling.data_structure.practiceOne;

import static FirstPackage.LearnKeyWords2.i;

public class ArrayList {
    public static void main(String[] args) {

        java.util.ArrayList<String> cars = new java.util.ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        //loop through an ArrayList with the for-each loop:
        for (String i:cars){
            System.out.println(i);
        }

        //for loop, and use the size() method to specify how many times the loop should run
        //for (int i = 0; i < cars.size(); i++) {
            //System.out.println(cars.get(i));
       // }
        //System.out.println(cars.get(0));//Access an Item use the get() method and refer to the index number

       // System.out.println(cars.set(0, "Opel"));//Change an Item use the set() method and refer to the index number
        //System.out.println(cars);
        //cars.remove(0); // Remove an Item use the remove() method and refer to the index number
       // cars.clear();// To remove all the elements in the ArrayList, use the clear() method
        //cars.size();//array List Size To find out how many elements an ArrayList have, use the size method

    }
}
