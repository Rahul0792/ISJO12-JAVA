package _14_FileHandeling.FileClass;

import java.io.File;
import java.io.IOException;

public class Demo5Length {

    public static File file = new File("India.txt");
    public static void main(String[] args) throws IOException {

        System.out.println(file.createNewFile());
        System.out.println(file.length());



    }
}
