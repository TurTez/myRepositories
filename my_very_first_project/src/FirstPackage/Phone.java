package FirstPackage;

import java.util.SortedMap;

public class Phone {
    //General function of the phones in the world
    String color;
    String brand;
    int size;
    int weight;

    static String typeOfPhone = "Smart Phone";

    void turnOn(){
        System.out.println("Turns on the phone");

    }
    void turnOff(){
        System.out.println("Turns off the phone");
    }
    void sendText(){
        System.out.println("Send text");

    }
    public static void main(String[] args){

        Phone myPhone = new Phone(); //  create Object to access phone atributes
        Phone myPhone2 = new Phone();

        myPhone.brand = "Apple";
        myPhone.color = "Grey";
        myPhone.size = 7;
        myPhone.weight = 238;

        //myPhone2
        // We are creating two instances based on the general phone atributes
        //
        myPhone2.brand = "Samsung";
        myPhone2.color = "Silver";
        myPhone2.weight = 300;
        myPhone2.size = 8;

        System.out.println(myPhone2.brand);


        typeOfPhone = "Regular Phone";
        //Static member of the class does not belong to any object or instances
        // rather it belong to class itself. We could change the assigned value we want
        // without calling the instance
        //to change any assigned value of non-static member of the class we need to create instance
        // and calling different instance we can change the value.

        System.out.println(typeOfPhone);

        /*
        When should we declare static variable / methods versus not to??
        Answer Static member we create if we want the value to be static or non changeble
         */





    }


}
