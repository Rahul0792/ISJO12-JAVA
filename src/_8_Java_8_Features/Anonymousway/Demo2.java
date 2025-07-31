package _8_Java_8_Features.Anonymousway;

import _7_OOPS.Abstraction.Demo3;

public class Demo2 {
    public static void main(String[] args) {

        abstract class Employee{
            public abstract void printName(String Name);
        }

//      1st way of writing anonymous way
//      Anonymous way used with abstract class
        Employee employee = new Employee(){
            public  void printName(String Name){
                System.out.println("Name is "+Name);
                System.out.println("Good Morning ");
            };
        };
        employee.printName("Rahul Khilari");





    }
}
