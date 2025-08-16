package _14_FileHandeling.Serilization;

import java.io.*;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        Employee employee = new Employee(1,"Rahul",5000,"Bharadi");
        File file= new File("Demo11");
        file.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(employee);
        fileOutputStream.close();
        objectOutputStream.close();
    }
}
