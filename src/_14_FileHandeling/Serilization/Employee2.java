package _14_FileHandeling.Serilization;

import java.io.Serializable;

public class Employee2 implements Serializable {
    int id;
    String name;
    double salary;
    String address;
    public Employee2(int id, String name , double salary , String address){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
