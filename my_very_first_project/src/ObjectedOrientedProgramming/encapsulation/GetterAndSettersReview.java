package ObjectedOrientedProgramming.encapsulation;

public class GetterAndSettersReview {
    //purpose of using getter and setter is to hide sensetive information from others
    private int acc; //1111111111
    private int pass;

    public void setAcc(int acc){
        this.acc = acc; //asigned the value....access the class variable you should use this keyword 1111111111
    }
    public int getAcc() {
        return acc;
    }

    public static void main(String[] args ){
        GettersAndSetters obj = new GettersAndSetters();
        obj.setAcc(1111111111); //Set the value
        System.out.println(obj.getAcc());
    }
}
