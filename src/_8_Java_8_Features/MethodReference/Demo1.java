package _8_Java_8_Features.MethodReference;

public class Demo1 {
    public static void main(String[] args) {

        interface interface1{
            int m1(int num1,int num2);
        }

//      lambda way
        interface1 interface1 = (x,y) -> {
            System.out.println("Lambda way");
            return  1;
        };
        interface1.m1(101,202);


//      Method Ref way
        // Instead of writing logic from the scratch use another
        // referenced method which is already written
        interface1 interface2 = Demo1 ::add;
        interface2.m1(101,202);

    }

//  Hich method cha reference deun varti use keli
    public static int add(int num1 , int num2){
        return num1*num2;
    }
}
