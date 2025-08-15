package _14_FileHandeling.FileClass;

import java.io.IOException;

public class Demo6_Path {
    public static void main(String[] args) throws IOException {

        //File which is present in demo5 is acces here
        System.out.println("File Path: " + Demo5Length.file.getPath());
        System.out.println("Absolute Path: " + Demo5Length.file.getAbsolutePath());
    }

}
