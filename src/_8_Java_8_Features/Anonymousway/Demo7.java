package _8_Java_8_Features.Anonymousway;

public class Demo7 {
    public static void main(String[] args) {

//      Annonymous with Static Method.......................

        interface Anonymous{
                static void m1(){
                System.out.print("I am static");
            }
        }
        Anonymous.m1();
    }
}
