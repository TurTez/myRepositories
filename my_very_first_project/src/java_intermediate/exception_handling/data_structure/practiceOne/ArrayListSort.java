package java_intermediate.exception_handling.data_structure.practiceOne;

import java.util.Collections;
import java.util.ArrayList;
public class ArrayListSort {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        Collections.sort(cars);  // Sort cars
        for (String i : cars) {
            System.out.println(i);
        }
    }
}

