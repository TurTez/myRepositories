package ObjectedOrientedProgramming.encapsulation;

public class GettersAndSetters {

        private int ssn; //create variable access modifier is private
        private int acc;

        // To hide important information you can make it private also call get and set
    public int getSsn(){ //  create a methods getSsn return (called) to ssn value

        return ssn;
    }
    public void setSsn( int ssn){ // 565656565--creating methods setSsn when it calls will provide ssn value
        this.ssn=ssn;
    }
     public int getAcc(){ // creating method grtAcc return (called) to acc value
        return acc;
     }

     public void setAcc(int acc){ //111144444 --ceating methods setAcc when it calls will provide acc value
        this.acc=acc;
     }
}
