package _14_FileHandeling.Reading;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Demo3BufferInputStream {
    public static void main(String[] args) throws IOException {
        File file = new File("India.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        int value = bufferedInputStream.read();
        while( value != -1){
            System.out.print((char) value);
            value = bufferedInputStream.read();
        }
        bufferedInputStream.close();
        fileInputStream.close();
    }
}
