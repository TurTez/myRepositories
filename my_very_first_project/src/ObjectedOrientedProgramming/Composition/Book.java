package ObjectedOrientedProgramming.Composition;

public class Book {
    //in this class general info about all books
    String title;
    String author;
    int pages;


    //Creating Constructor and pass the parameter
    public Book(String title, String author, int pages){
        this.title = title;
        this.author = author;
        this.pages = pages;
    }
    void literature(){
        System.out.println("I am reading Literature");
    }

    void textbook(){
        System.out.println("I am reading Text Book");
    }
    void artBook(){
        System.out.println("I am reading Art Book");
    }
}
