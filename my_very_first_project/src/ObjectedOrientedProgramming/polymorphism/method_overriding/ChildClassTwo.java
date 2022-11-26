package ObjectedOrientedProgramming.polymorphism.method_overriding;

public class ChildClassTwo extends ParentClass{
    void method(){
        System.out.println("This is Child Class 2");
        ChildClassOne one = new ChildClassOne();
        one.method();
    }
}
