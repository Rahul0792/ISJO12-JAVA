package _14_FileHandeling.Writing;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Demo4BufferWriter {
    public static void main(String[] args) throws IOException {
        File file = new File("India.txt");
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("Hello Good Morning - Buffer Writer ");
        bufferedWriter.close();
        System.out.println("Written Successfull");
    }
}
