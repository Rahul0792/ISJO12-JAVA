package _9_Object_Class;

import org.w3c.dom.ls.LSOutput;

public class Demo1 {
    public static void main(String[] args) {
        class A{
            void m1(){
                System.out.println("Hello ");
            }
        }
        class B extends A{
            void m2(){
                System.out.println("Hello Dear : ");
            }
        }
        A a = new A();
        System.out.println(a.hashCode());
        a.hashCode();

        B b = new B();
        System.out.println(b.hashCode());
    }
}
