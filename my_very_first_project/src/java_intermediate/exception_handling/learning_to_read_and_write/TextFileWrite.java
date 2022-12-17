package java_intermediate.exception_handling.learning_to_read_and_write;

import java.io.FileWriter;
import java.io.IOException;

public class TextFileWrite {
    public static void main(String[] args) throws IOException {
        FileWriter writeMyFile = new FileWriter("C:\\Users\\tezir\\abc.txt");
        writeMyFile.write("Hello This is Turgut Tezir HOW ARE YOU");
        writeMyFile.close();
    }
}
