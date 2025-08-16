package _14_FileHandeling.Writing;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        File file = new File("India.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file,true );
        fileOutputStream.write('A');
        fileOutputStream.write('B');
        fileOutputStream.write('C');
        fileOutputStream.write('D');
        fileOutputStream.close();
        System.out.println("Wrote to the file ");

    }
}
