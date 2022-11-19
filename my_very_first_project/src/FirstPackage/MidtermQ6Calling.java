package FirstPackage;

public class MidtermQ6Calling {
    public static void main(String[] args){
        MidtermQ6 obj = new MidtermQ6();
        obj.setPassword(123456789);
        System.out.println(obj.getPassword());

        MidtermQ6 obj2 = new MidtermQ6();
        obj2.setUseName("Turgut");
        System.out.println(obj2.getUseName());
    }
}
