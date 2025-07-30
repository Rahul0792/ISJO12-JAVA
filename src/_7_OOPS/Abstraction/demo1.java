package _7_OOPS.Abstraction;

public class demo1 {
    public static void main(String[] args) {
        class A{        // Concrete class
            void main(){
                System.out.println("Concrete method ");
            }
        }

        abstract class B{
            int a=101;
            abstract void m2();
        }
//        abstract method acces karayla subclass create karun nntr extend karun abstract method karavi lagte

        class C extends  B{

            @Override
            void m2() {
            }
        }
        B b = new C();
        b.m2();

    }
}
