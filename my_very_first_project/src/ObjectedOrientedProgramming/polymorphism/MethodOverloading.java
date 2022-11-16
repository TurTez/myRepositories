package ObjectedOrientedProgramming.polymorphism;

public class MethodOverloading {

    public int add(int one, int two){

        return one + two;
    }

    public int add(int one, int two, int three){

        return one + two +three;
    }

    public double add(double one, int two, int three){

        return  one + two +three;
    }

    public double add(int one, double two, int three, String str){
        System.out.println(str);
        return one +two;
    }
    public int add(int one, int two, int three, String str){
        System.out.println(str);
        return one+ two +three;
    }
    public static void main(String[] args){

       MethodOverloading obj = new MethodOverloading();

        System.out.println(obj.add(10,20));
        System.out.println(obj.add(10,20,30));

        System.out.println(obj.add(10.33,20,30));
        System.out.println(obj.add(40,50,30,"This is method overloading"));
        System.out.println(obj.add(50,60.6,70,"This is overloading 2"));
    }
}