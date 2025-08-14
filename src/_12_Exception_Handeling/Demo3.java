package _12_Exception_Handeling;

public class Demo3 {
    public static void main(String[] args) {
        try{
            int division = 10/0;
        }catch (ArithmeticException exe){
            System.out.println(exe.getMessage());
        }
        finally {
            System.out.println("==============");
        }
    }
}
