package ObjectedOrientedProgramming.inheritance.inheritanceWithConstructor;

public class SeaFoodTest {
    public static void main(String[] args) {
        SeaFoodFish fish = new SeaFoodFish(true, 2,
                "Atlantic Ocean", 30, "Stripe Bass",
                "Fish", true);
        System.out.println("Is it Organic  : " + fish.isItOrganic);
        System.out.println("Mercury Level  : " + fish.mercuryLevel);
        System.out.println("Where it lives : " + fish.whereLives);
        System.out.println("Size           : " + fish.size);
        System.out.println("Name           : " + fish.nameOfSeaFood);
        System.out.println("Type           : " + fish.typeOfSeafood);
        System.out.println(" Is it fresh   : " + fish.isItFresh);

        fish.eatMyFish();
        fish.eatSeaFood();
    }
}
