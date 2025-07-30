package _7_OOPS.polymorphism;

public class demo1 {
    public static void main(String[] args) {
        class parent{
            int a;
            int b;
            public void m1(int a, int b, int c){
                System.out.println("Parent class M1 Method");
            }
            public void m2(int a, int b, int c){
                System.out.println("Parent class M1 Method");
            }
        }
        class Child extends parent{
            int a;
            int b;

//            Method Overloading
            public double m1(float a, float b, float c){
                System.out.println("Parent class M1 Method");
                return 1;
            }

//          Method Overloading
            public int m2(int a, float b){
                System.out.println("Parent class M1 Method");
                return 5;
            }
        }
        Child child = new Child();
        child.m1(100,200,300);
        child.m1(100.5f,200.5f,300.8f);
    }
}
