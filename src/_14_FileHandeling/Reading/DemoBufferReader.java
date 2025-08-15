package _14_FileHandeling.Reading;

import java.io.*;

public class DemoBufferReader {
    public static void main(String[] args) throws IOException {
        File file = new File("India.txt");

        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        int value = bufferedReader.read();
        while( value != -1){
            System.out.print((char) value);
            value = bufferedReader.read();
        }
        fileReader.close();
        fileReader.close();
    }

}
