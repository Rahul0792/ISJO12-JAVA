package _14_FileHandeling.FileClass;

import java.io.File;
import java.io.IOException;

public class Demo1 {
    public static void main(String[] args) throws IOException {

        //File will be created inside in the same folder
        File file = new File("Rahul.txt");

        boolean isNewFileCreated = file.createNewFile();   // Creating File
        System.out.println("Is New File Created  ? " +isNewFileCreated );

    }
}
