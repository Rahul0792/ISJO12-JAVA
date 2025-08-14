package _12_Exception_Handeling;

public class Demo7 {
    public static void main(String[] args) {
        try {
            m1();
        }
        catch (ArithmeticException ae){
            System.out.println("Catch");
        }
        finally {
            System.out.println("Rest");
        }
    }
    static void m1(){
        m2();
    }
    static void m2(){
        m3();
    }
    static void m3(){
        System.out.println(10/0);
    }
}
