package _8_Java_8_Features.Lambda;

public class Demo2 {
    public static void main(String[] args) {

//      Generic Type  means data type declare inside      <...>
        interface Interface1<X>{
            int m1( X name);
        }
        Interface1<String> lambda =( X) -> {
            System.out.println("My name is "+X);
            return 2;
        };
        lambda.m1("Rahul");


//      Generic Type  means data type declare inside      <...>
        interface Interface2<X,Y>{
            int m2( X name,Y Sirname);
        }
        Interface2<String , String> lambda2 = (A,B) -> {
            System.out.println("My name is "+A+B);
            return 2;
        };
        lambda2.m2("Rahul","Khilari");

    }
}
