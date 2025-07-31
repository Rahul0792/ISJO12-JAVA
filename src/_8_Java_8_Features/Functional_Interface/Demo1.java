package _8_Java_8_Features.Functional_Interface;

public class Demo1 {
    public static void main(String[] args) {

        @FunctionalInterface
        interface Interface1{
            void m1();
        }

//        to create subclass of a functional interface?

//  1 Traditional way
        class A implements Interface1{
            @Override
            public void m1() {
                System.out.println("Traditional Way");
            }
        }
        Interface1 interface1 = new A();
        interface1.m1();
        
//  2 Annonymous  way  Method --  1
         new Interface1() {
            @Override
            public void m1() {
                System.out.println("Annonymous way Method 1");
            }
        }.m1();

//  2 Annonymous  way  Method --  2
        Interface1 interface2 = new Interface1() {
            @Override
            public void m1() {
                System.out.println("Annonymous way Method 2");
            }
        };
        interface2.m1();
    }
}
