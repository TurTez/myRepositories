package java_intermediate.exception_handling.learning_to_read_and_write.fileHandling;

import java.io.File;

public class FileInfo {
    public static void main(String[] args) {
        File myObj = new File("C:\\Users\\tezir\\IdeaProjects\\TezirTurgut.txt");
        //File myObj = new File("TurgutTezir");
        if(myObj.exists()){
            System.out.println("File Name: " + myObj.getName());
            System.out.println("Absolute Path: " + myObj.getAbsolutePath());
            System.out.println("Writeable: " + myObj.canWrite());
            System.out.println("Readable: " + myObj.canRead());
            System.out.println("File Size in Byte: " + myObj.length());
        }else {
            System.out.println("file is not exist in this computer");
        }
    }
}
