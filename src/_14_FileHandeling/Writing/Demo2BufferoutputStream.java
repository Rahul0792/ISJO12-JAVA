package _14_FileHandeling.Writing;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo2BufferoutputStream {
    public static void main(String[] args) throws IOException {
        File file = new File("India.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file,true );
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        bufferedOutputStream.write('A');
        bufferedOutputStream.write('B');
        bufferedOutputStream.write('C');
        bufferedOutputStream.write('D');
        bufferedOutputStream.close();
        System.out.println("Wrote to the file ");
    }
}
