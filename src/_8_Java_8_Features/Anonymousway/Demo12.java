package _8_Java_8_Features.Anonymousway;

public class Demo12 {
    public static void main(String[] args) {
        interface Interface1{
            void m1();

            default void display(){
                System.out.println("Default method Interface 1");

            }
        }
        interface Interface2{
            void m2();

            default void display(){
                System.out.println("Default method Interface 2");

            }
        }
        class A implements Interface1,Interface2{
            @Override
            public void m2() {

            }

            @Override
            public void m1() {

            }

            @Override
            public void display() {
//                Class A 2 interface implement karto .. display method donhi interface madhi available ahe mag
//                te confusion duur honyasathi method overide karun nakki kontya intercae madhli
//                method call karaychi he ithe logic lihile jate
                Interface2.super.display();
            }
        }
        A a = new A();
        a.m2();
        a.m1();
        a.display();
    }
}
