package _14_FileHandeling.Serilization;

import java.io.Serializable;

public class Employee implements Serializable {
    int id;
    String name;
    double salary;
    String address;
    public Employee(int id,String name , double salary , String address){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", address='" + address + '\'' +
                '}';
    }
}
