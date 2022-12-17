package javaExamSubmission;

public class Eight_SingeltonClass {
    /*
    Create a singleton class and create another class to
     show an example of the usage of a singleton class.
    */
    int x = 10;
    static Eight_SingeltonClass obj = new Eight_SingeltonClass();
    private Eight_SingeltonClass(){
    }
    public static Eight_SingeltonClass getInstance(int x){
        return obj;
    }
}
