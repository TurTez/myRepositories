package java_intermediate.exception_handling.learning_to_read_and_write.FfileHandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        try {
            //File myObj = new File("TurgutTezir.txt");
            File myObj = new File("C:\\Users\\tezir\\IdeaProjects\\TezirTurgut.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            System.out.println(e.getMessage());
            //e.printStackTrace();
        }
    }
}
