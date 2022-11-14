package FirstPackage;

public class CastingLearn {
    public static void main(String[] args){
        String A = "10";
        System.out.println("String value is: " + A);
        int B = Integer.parseInt(A);
        System.out.println("Integer value is: " + B);
        int i = 50;
        short s= 5;
        long l=10L;
        float f=5.5F;
        double d=7.774;

        int x=(int) (d);
        double z=(double) i;
        float j=(long) f;
        System.out.println(x);
        System.out.println(z);
        System.out.println(j);

        boolean bl = false;
        char ch ='H';

        String RR="Hello";
        char ch2 =RR.charAt(0);

        System.out.println(String.valueOf(bl));
        System.out.println(String.valueOf(ch));
        System.out.println(RR.charAt(1));

    }
}
