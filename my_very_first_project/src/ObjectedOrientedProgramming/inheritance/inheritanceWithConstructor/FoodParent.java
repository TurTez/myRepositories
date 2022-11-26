package ObjectedOrientedProgramming.inheritance.inheritanceWithConstructor;

public class FoodParent {
    int size;
    String nameOfFood;
    public FoodParent(int size, String nameOfFood){// Parameter with constructor
        System.out.println("This is parent Class");

        this.size = size;
        this.nameOfFood = nameOfFood;
    }
    void eatFood(){
        System.out.println("What are you eating now this is FoodParent Class");
    }

    }


