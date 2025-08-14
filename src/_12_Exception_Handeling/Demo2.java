package _12_Exception_Handeling;
import java.util.Scanner;
public class Demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Two Numbers ");
        int number3;
        try{
            int number2 = scanner.nextInt();
            int number1 = scanner.nextInt();
            number3 = number1 / number2;
            System.out.println("Try.............");
        }
        catch (ArithmeticException e) {
            throw new RuntimeException(e);
        }
        System.out.println(" Rest ");
        System.out.println(number3);
    }
}
