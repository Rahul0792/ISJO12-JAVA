package _7_OOPS.Abstraction;

public class Demo2 {
    public static void main(String[] args) {
        interface I1{

//            Allowed Components
            int i = 101 ;   // By default variables are public static final
            void m1();      // By default methods are public abstract
            static void m2(){}  // Static methods alllowed
            default  void m3(){}  // Default methods are also allowed
        }
    }
}
