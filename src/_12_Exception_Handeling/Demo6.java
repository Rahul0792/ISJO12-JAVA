package _12_Exception_Handeling;

import java.io.FileNotFoundException;
import java.sql.SQLOutput;

public class Demo6 {
    public static void main(String[] args) throws  FileNotFoundException{
        FileNotFoundException fileNotFoundException = new FileNotFoundException("abcd.txt");
        System.out.println("Rest...........");
        System.out.println( fileNotFoundException.getMessage());
    }
}
