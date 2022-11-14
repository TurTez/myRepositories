package FirstPackage;

public class LearnKeyWords2 {
    public static int x=500;

    public static int i=200;

    public static void myMethots() {

        System.out.println("Hello Everyone and Turgut");
    }

    static int myAddition(int a, int b){
        return a+b;

    }


    protected static void myProtected(){

        System.out.println("Hi! This is protected method example");


    }
    private static void myPrivate(){

        System.out.println("This is PRIVATE method example");
    }
    static void myDefault(){
        System.out.println("This is DDDDEFAULT example from Birsen");


    }
    public static int myVoidExample(){
        int x =5;
        int y =10;
       // System.out.println(x+y);
        return x+y;

    }
    public static boolean myMethod(){
        int x = 20;
        int y = 30;

        return x<y;
    }
    public static int tea2(){
        int x=100;
        int y=200;
        return x+y;

    }

    public static void main(String[] args){
        myMethots();
        myProtected();
        myPrivate();
        myDefault();
        System.out.println(myVoidExample());
        System.out.println(myMethod());
        int z=700+tea2();
        System.out.println(z);
        System.out.println(myAddition(500, 600));


    }


}