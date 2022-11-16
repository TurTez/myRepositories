package FirstPackage;

public class ConstructorOfClass {
    int x =200;
    String str ="Name";
    public ConstructorOfClass(int x2, String str2){
        x=x2;
        str=str2;
    }
    void mOne(){
        System.out.println("My name is Turgut");
    }
    // to access non-static variables in static method you need to create objects
    // creating object to call non static values
    public static void main(String[] args){

        ConstructorOfClass obj = new ConstructorOfClass(10, "Hello");

        System.out.println(obj.x);
        System.out.println(obj.str);
    }
}
