package _8_Java_8_Features.Lambda;

public class Demo1 {
    public static void main(String[] args) {
//        1st Interface
        interface Interface1{
            void m1();
        }
        Interface1 lambda = () ->  System.out.println("Lambda Expression ");
        lambda.m1();

//      3rd Interface
        interface Interface2{
            void m2(int a);
        }
        Interface2 lambda2 = (int a) -> System.out.println("Value Of A " + a);
        Interface2 lambda22 =  a -> System.out.println("Value Of A " + a);
        lambda2.m2(101);
        lambda22.m2(10001);


//      4th Interface
        interface Interface4{
            int m3();
        }
        Interface4 lambda4 = () -> {return  5;};
        System.out.println("Value of return Number is " +lambda4.m3());


//      5th Interface
        interface Interface5{
            int m4();
        }
        Interface5 lambda5 = () -> 500;
        System.out.println("Value of return Number is " +lambda5.m4());

//      6th Interface
        interface Interface6{
            int m4(int x);
        }
        Interface6 lambda6 = x -> x * x;
        System.out.println("Value of return Number is " +lambda6.m4(10));
    }
}
