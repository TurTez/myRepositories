package java_intermediate.exception_handling.learning_to_read_and_write;

import java.io.File;
import java.util.Scanner;

public class NewWayToAccessFile {
    public static void main(String[] args) {

        //String path ="C:\\Users\\tezir\\abc.txt";
        String path = "C:" + File.separator +"User" + File.separator +"tezir" + File.separator + "abc.txt";
        System.out.println(path);


        Scanner s = new Scanner(path);

        while(s.hasNextLine()){
            System.out.println(s.nextLine());
        }
    }
}
