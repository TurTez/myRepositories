package FirstPackage.learn_final_keyword;

public class NewPhone {
    public static void main(String[] args) {
        Phone o = new Phone();
        //o.brand = "Android";
        o.size = 7;
        o.weight =228;
        o.color ="gray";

        System.out.println(o.brand);
        System.out.println(o.size);
        System.out.println(o.weight);
        System.out.println(o.color);
    }
}
