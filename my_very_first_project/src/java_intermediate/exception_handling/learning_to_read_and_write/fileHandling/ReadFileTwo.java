package java_intermediate.exception_handling.learning_to_read_and_write.fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileTwo {
    public static void main(String[] args) throws FileNotFoundException {
        File myObj = new File("C:\\Users\\tezir\\IdeaProjects\\TurgutTezir.txt");
        Scanner myReader = new Scanner(myObj);

        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            System.out.println(data);
        }
        myReader.close();
    }
    }

