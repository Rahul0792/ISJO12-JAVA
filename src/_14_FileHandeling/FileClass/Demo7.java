package _14_FileHandeling.FileClass;

import java.io.File;
import java.io.IOException;

public class Demo7 {
    public static void main(String[] args) throws IOException {
        File file = new File("xyz.txt");
        System.out.println(file.createNewFile());

        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getPath());
    }
}
