package _12_Exception_Handeling;

public class Demo5 {
    public static void main(String[] args) {
        try{
        System.out.println(add(100,0));

        }catch (ArithmeticException ae){
            System.out.println("Invalid Denominator : ");
        }
        System.out.println("Rest Of main");
    }
    public  static  int add(int a,int b) throws ArithmeticException{
        return a/b;
    }
}
