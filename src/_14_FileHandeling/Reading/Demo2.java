package _14_FileHandeling.Reading;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Demo2 {
    public static void main(String[] args) throws IOException {
        File file = new File("India.txt");
        FileReader fileReader = new FileReader(file);
        int value = fileReader.read();
        while(value != -1){
            System.out.print((char)value);
            value = fileReader.read();
        }
        fileReader.close();

    }
}
