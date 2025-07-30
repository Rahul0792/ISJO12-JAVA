package _7_OOPS.Inheritance;

public class demo4 {
    public static void main(String[] args) {
        class A{

            int A=10;
            int B=20;

            void m1(){
                System.out.println("A Parent class M1 ");
            }
            void m2(){
                System.out.println("A Parent class M2 ");
            }
        }

        class B extends  A{
            int A=101;
            int C=301;
            int D=401;

            void m1(){
                System.out.println("A child class M1 ");
            }
            void m3(){
                System.out.println("B child class M3 ");
            }
        }
        A a = new B();
        a.m1();
        a.m2();

        System.out.println(a.A);
        System.out.println(a.B);

    }
}
