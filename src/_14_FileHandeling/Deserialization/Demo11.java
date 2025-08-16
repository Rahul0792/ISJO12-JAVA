package _14_FileHandeling.Deserialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Demo11 {
    public static void main(String[] args) throws IOException ,ClassNotFoundException{
        File file = new File("Employee details.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Employee2 employee = (Employee2) objectInputStream.readObject();
        fileInputStream.close();
        objectInputStream.close();
        System.out.println(employee);
    }
}
