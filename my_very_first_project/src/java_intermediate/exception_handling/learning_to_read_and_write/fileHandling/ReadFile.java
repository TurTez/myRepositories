package java_intermediate.exception_handling.learning_to_read_and_write.fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

    public static void main(String[] args) {
        try{
            //File myObj = new File("TurgutTezir.txt");
            File myObj = new File("C:\\Users\\tezir\\IdeaProjects\\TezirTurgut.txt");
            Scanner myReader = new Scanner(myObj);

            while (myReader.hasNextLine()){
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("error !!! Please fix the error");
            throw new RuntimeException(e);
        }
    }
}
