package FirstPackage;
/** Q6.	Create a class with attributes as username and password and hide them from other classes,
 * use encapsulation to set the data and get the data in another class
 **/
public class MidtermQ6 {
    private int password;
    private String useName;

    public void setPassword(int password){
        this.password = password;
    }
    public int getPassword(){
        return password;
    }
    public void setUseName(String newUserName){
        this.useName = newUserName;
    }
    public String getUseName(){
        return useName;
    }

    public static void main(String[] args) {
        MidtermQ6 obj = new MidtermQ6();
        obj.setPassword(123456789);
        System.out.println(obj.getPassword());
    }

}
