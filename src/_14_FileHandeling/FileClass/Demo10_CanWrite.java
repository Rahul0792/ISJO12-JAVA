package _14_FileHandeling.FileClass;

import java.io.File;
import java.io.IOException;

public class Demo10_CanWrite {
    public static void main(String[] args) throws IOException {
        File file = new File("Hpp.txt");
        System.out.println(file.createNewFile());
        System.out.println("Can we write ? " + file.canWrite());
    }
}
