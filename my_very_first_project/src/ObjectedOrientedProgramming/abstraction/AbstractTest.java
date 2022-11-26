package ObjectedOrientedProgramming.abstraction;

//concreate Class
//We are calling an abstract class from concrete Class
//we have to implement abstract method in the abstract Class

public class AbstractTest extends AbstractClass{

    void methodTwo(){
        System.out.println("Hello");
    }

    @Override
    void UseNPass() {

    }

    void useNPass(){
        System.out.println("Print my use name and psw");
    }
}
