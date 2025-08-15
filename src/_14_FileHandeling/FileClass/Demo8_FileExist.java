package _14_FileHandeling.FileClass;

import java.io.File;
import java.io.IOException;

public class Demo8_FileExist {
    public static void main(String[] args)throws IOException {
        File file = new File("YYZ.txt");
        System.out.println(file.createNewFile());


        System.out.println("File exist or not " + file.exists());
    }
}
