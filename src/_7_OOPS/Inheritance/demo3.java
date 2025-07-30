package _7_OOPS.Inheritance;

import java.sql.SQLOutput;

public class demo3 {
    public static void main(String[] args) {
        class A{
            {
                System.out.println("A class instance block");
            }
            static {
                System.out.println("A class static block");
            }
            A(){
                System.out.println("A class Constructor ");
            }
        }

        class B extends  A{
            {
                System.out.println("B class instance block");
            }
            static {
                System.out.println("B class static block");
            }
            B(){
                super();
                System.out.println("B class Constructor ");
            }
        }
    B b =  new B();

    }
}


//A class static block
//B class static block
//A class instance block
//A class Constructor
//B class instance block
//B class Constructor
