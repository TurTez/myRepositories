package ObjectedOrientedProgramming.inheritance.learning_inheritance;

public class TestInheritance {
    public static void main(String[] args) {

        Bread br = new Bread();//Bread is Type, br is reference, Bread is instance

        //We are buying new bread
        br.name = "Wonder";//These below comming from parent class, Food
        br.size = 12;
        br.weight = 500;
        br.madeBy = "Home Made";

        Apples ap = new Apples();// This come from child class

        // we are buying new apples
        ap.name = "Red Apple";
        ap.size = 5;
        ap. weight = 200;

        ap.isRed = true;//This comming from child class Apple
        ap.eatApple();

        Food fd = new Food(); // only access food class
        Food fd2 = new Salmon(); //data type determines what we can access
    }
}
