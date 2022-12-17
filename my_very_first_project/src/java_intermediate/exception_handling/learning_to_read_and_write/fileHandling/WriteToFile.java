package java_intermediate.exception_handling.learning_to_read_and_write.fileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {
        try{
            FileWriter myWriter = new FileWriter("C:\\Users\\tezir\\IdeaProjects\\TezirTurgut.txt");
            //FileWriter myWriter = new FileWriter("TurgutTezir.txt");
            myWriter.write("Hello This is Turgut I am Trying to write this text on my file");
            myWriter.close();

            System.out.println("You did a good job");

        } catch (IOException e) {
            System.out.println("Error!!! Please fix the error and try again");
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
