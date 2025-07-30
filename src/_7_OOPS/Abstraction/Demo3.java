package _7_OOPS.Abstraction;

public class Demo3 {
    public static void main(String[] args) {
        interface I1{
             void m4(String Message);
             default void m1(){}
            static void m2(){}
        }

//      when Abstract class implements interface then Optional to override abstract method which is present in interface
        abstract class A implements I1{

        }

        class C implements I1{
//          when concrete class implements interface then mandatory to override abstract method which is present in interface
            @Override
            public void m4(String Message) {
                System.out.println(" Heyy Sir "+Message);

            }
        }

        C c = new C();
        c.m4("Good Morning");
    }
}
