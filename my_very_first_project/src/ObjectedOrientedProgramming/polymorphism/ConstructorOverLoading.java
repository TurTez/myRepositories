package ObjectedOrientedProgramming.polymorphism;

public class ConstructorOverLoading {
    int one;
    double two;
    String three;
   public ConstructorOverLoading(int one){

       this.one=one;
   }
   public double ConstructorOverLoading(int one, double two, String three){
       this.one=one;
       this.two=two;
       this.three=three;

       System.out.println(three);

     return one+two;
   }
   public static void main(String[] args){

       ConstructorOverLoading obj = new ConstructorOverLoading(50);
       System.out.println(obj.one);
   }
}
