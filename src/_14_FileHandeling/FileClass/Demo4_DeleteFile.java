package _14_FileHandeling.FileClass;

import java.io.File;
import java.io.IOException;

public class Demo4_DeleteFile {
    public static void main(String[] args) throws IOException {

        File file = new File("Rahull.txt");
        System.out.println(file.createNewFile());
        System.out.println("Files Created ");

        file.delete();
        System.out.println("Files Deleted ");


    }
}
