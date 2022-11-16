package ObjectedOrientedProgramming.encapsulation;

public class CallingGettersAndSetters {
    public static void main(String[] args) {
        GettersAndSetters obj = new GettersAndSetters(); // to access variable in GettersAndSetters class

        obj.setSsn(565656565);
        System.out.println(obj.getSsn());
        obj.setAcc(111144444);
        System.out.println(obj.getAcc());
    }

}
