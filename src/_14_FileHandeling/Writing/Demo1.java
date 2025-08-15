package _14_FileHandeling.Writing;

import java.io.File;
import java.io.FileOutputStream;

public class Demo1 {
    public static void main(String[] args) {
        File file = new File("India.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file,True);
    }
}
