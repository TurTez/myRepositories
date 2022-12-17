package javaExamSubmission;

public class Eight_SingeltonClassMain {
    public static void main(String[] args) {
        Eight_SingeltonClass tur = new Eight_SingeltonClass.getInstance(10);
        Eight_SingeltonClass tur2 = new Eight_SingeltonClass.getInstance(20);
        System.out.println(tur.x);
        System.out.println(tur2.x);
    }
}
