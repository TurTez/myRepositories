package ObjectedOrientedProgramming.inheritance.inheritanceWithConstructor;

public class FoodChildTuna extends FoodParent{
    boolean isItFrozen;
    int weight;

    public FoodChildTuna(boolean isItFrozen, int weight, int size, String nameOfFood){
        super(size, nameOfFood);
        this.isItFrozen = isItFrozen;
        this.weight = weight;
    }
    void eatMyTuna(){
        super.eatFood();
        System.out.println("Eating Tuna");
    }
}
