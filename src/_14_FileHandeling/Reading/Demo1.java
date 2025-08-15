package _14_FileHandeling.Reading;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Demo1 {
    public static void main(String[] args)throws IOException {
        File file = new File("India.TXT");
        FileInputStream fileInputStream = new FileInputStream(file);
        int value = fileInputStream.read();
        while(value != -1 ){
            System.out.print((char)value);
            value = fileInputStream.read();
        }
        fileInputStream.close();
    }
}
