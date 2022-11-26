package ObjectedOrientedProgramming.inheritance.inheritanceWithConstructor;

public class SeaFoodFish extends ParentSeaFood {
    boolean isItOrganic;
    int mercuryLevel;
    String whereLives;

    public SeaFoodFish(boolean isItOrganic, int mercuryLevel, String whereLives, int size,
                       String nameOfSeaFood, String typeOfSeaFood,boolean isItFresh) {

        super(size, nameOfSeaFood, typeOfSeaFood, isItFresh);
        this.isItOrganic = isItOrganic;
        this.mercuryLevel = mercuryLevel;
        this.whereLives = whereLives;
}
     void eatMyFish(){
        super.eatSeaFood();
         System.out.println("Yummy Fish");
}
}
