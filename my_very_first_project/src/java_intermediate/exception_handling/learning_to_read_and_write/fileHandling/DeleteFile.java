package java_intermediate.exception_handling.learning_to_read_and_write.FfileHandling;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        //File myObj = new File("TurgutTezir.txt");
        File myObj = new File("C:\\Users\\tezir\\IdeaProjects\\TezirTurgut.txt");
        if(myObj.delete()){
            System.out.println("Delete the File" + myObj.getName());
        }else{
            System.out.println("Fail to delete the file.");
        }
    }
}
