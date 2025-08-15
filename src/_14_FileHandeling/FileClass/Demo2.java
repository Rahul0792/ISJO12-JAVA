package _14_FileHandeling.FileClass;

import java.io.File;
import java.io.IOException;

public class Demo2 {
    public static void main(String[] args) throws IOException {
        //File created inside laptop with path
        String path = "D:\\D\\Placement\\ATS RESUME\\kiran.txt";
        File file = new File(path);
        System.out.println("file created "+file.createNewFile());
    }
}
