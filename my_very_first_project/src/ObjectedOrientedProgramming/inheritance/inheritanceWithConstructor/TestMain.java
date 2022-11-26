package ObjectedOrientedProgramming.inheritance.inheritanceWithConstructor;

public class TestMain {
    public static void main(String[] args) {

        FoodChildTuna myTuna = new FoodChildTuna(true, 5, 10,"Pink Tuna");
        System.out.println(myTuna.isItFrozen);
        System.out.println(myTuna.weight);
        System.out.println(myTuna.size);
        System.out.println(myTuna.nameOfFood);

        myTuna.eatMyTuna();
    }
}
