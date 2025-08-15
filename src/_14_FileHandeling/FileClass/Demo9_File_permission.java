package _14_FileHandeling.FileClass;

import java.io.File;

public class Demo9_File_permission {
    public static void main(String[] args) {
        File file = new File("AAA.txt");

        //if setwritable false then can not edit file
        file.setWritable(false);
    }
}
