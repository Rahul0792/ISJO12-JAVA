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
        Interface1 traditional = new A();
        traditional.m1();

//  2 Annonymous  way  Method --  1
         new Interface1() {
            @Override
            public void m1() {
                System.out.println("Annonymous way Method 1");
            }
        }.m1();

//  2 Annonymous  way  Method --  2
        Interface1 annonymous2 = new Interface1() {
            @Override
            public void m1() {
                System.out.println("Annonymous way Method 2");
            }
        };
        annonymous2.m1();

//  3 Lambda  way  method- 1
        Interface1 lambda = ()-> {
                System.out.println("Annonymous way Method 2");
                System.out.println("Heyy Darling");
        };
        lambda.m1();
//  3 Lambda  way  method- 2
        Interface1 lambda2 = ()-> System.out.println("Annonymous way Method 2"); lambda2.m1();


//  4  Method reference way
        Interface1 lambda3 = Demo1::data;
        lambda3.m1();
    }

//  hich method cha reference deun vrti use keli
// Instead of writing logic from the scratch use another
// referenced method which is already written
    public static void data(){
        System.out.println("Heyy Darling");
    }
}
