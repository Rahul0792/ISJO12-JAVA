package _12_Exception_Handeling;

import java.util.Scanner;

public class Demo8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Age : ");
        int age = scanner.nextInt();
        if(age<18){
            try{
                throw new InvalidageException("Age is less than 18");
            }catch (InvalidageException ae){
                System.out.println("Invalid age .. please try again .. ");
            }
        }else{
            System.out.println("You are elligible to vote ");
        }


    }
}
