package _12_Exception_Handeling;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Demo4 {
    public static void main(String[] args) {
        try{
            int div = 10/0;
            String str = null;
            System.out.println(str.length());
            int array[] = {};
            System.out.println(array[0]);
        } catch (ArithmeticException  | NullPointerException | ArrayIndexOutOfBoundsException e ) {
            if( e instanceof  ArithmeticException){
                System.out.println("Arithmetic");
            }
            if( e instanceof  NullPointerException){
                System.out.println("Nullpointer");
            }
            if( e instanceof  ArrayIndexOutOfBoundsException){
                System.out.println("ArrayIndexOutOfBoundsException");
            }
            if(e instanceof  Exception){
                System.out.println("ArrayIndexOutOfBoundsException");  // Generic exception handler :
            }
        }
        finally {
            System.out.println("This is Finally ==========");
        }
    }
}
