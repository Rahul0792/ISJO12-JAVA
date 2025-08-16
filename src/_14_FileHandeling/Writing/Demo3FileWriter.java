package _14_FileHandeling.Writing;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Demo3FileWriter {
    public static void main(String[] args) throws IOException {
        File file = new File("India.txt");
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("Hello Good Morning");
        fileWriter.close();
        System.out.println("Written Successfull");
    }
}
