package ObjectedOrientedProgramming.inheritance.inheritanceWithConstructor;

public class ParentSeaFood {
    int size;
    String nameOfSeaFood;
    String typeOfSeafood;
    boolean isItFresh;

    ParentSeaFood(int size, String nameOfSeaFood, String typeOfSeafood, boolean isItFresh){
        this.size = size;
        this.nameOfSeaFood = nameOfSeaFood;
        this.typeOfSeafood = nameOfSeaFood;
        this.isItFresh = isItFresh;
    }
    void eatSeaFood(){
        System.out.println("I love Sea Food");
    }
}
