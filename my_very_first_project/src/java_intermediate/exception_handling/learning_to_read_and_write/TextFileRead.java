package java_intermediate.exception_handling.learning_to_read_and_write;

import java.io.File;
import java.util.Scanner;

public class TextFileReadand {

    public static void main(String[] args)throws Exception{
        //System.out.println("Hello everyone, how are you today? \nThe weather is good in NYC");
        //System.out.println("The current weather is \"60F\""); //print special character in the quotation
        //escape - the next character will be treated as a regular character.
        //System.out.println("Exception Handling \n\t1. "); //new line and indentation
        // System.out.println("I want to delete the last characters\b");
        // System.out.println("My file is located\"C:\\Users\\tezir\\Documents");
        //scan is also can read your text and other files
/*
        File fl = new File("C:\\Users\\tezir\\myJavaTextFile.txt");
        Scanner s = new Scanner(fl);
        while(s.hasNextLine());
        {
            System.out.println(s.nextLine());
        }*/

        System.out.println(System.getProperty("user.dir")+"\\src\\files\\myFiles.txt");
        String absolutePath = System.getProperty("user.dir");
        String relativePath = "\\src\\files\\myFiles.txt";
        File myFile = new File("absolutePath + relativePath");
        Scanner sc = new Scanner(myFile);

        while (sc.hasNext()) {
            System.out.println(sc.nextLine());
        }
    }
}