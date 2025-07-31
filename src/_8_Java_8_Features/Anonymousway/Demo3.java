package _8_Java_8_Features.Anonymousway;

public class Demo3 {
    public static void main(String[] args) {
        class People{
            void rahul(String Sirname){
                System.out.println("Name is "+Sirname);
            }
        }

//        1 st way
        People people = new People(){
            void rahul(String Sirname){
                System.out.println("Name is "+Sirname);
            }
        };

//        2nd way
        new People().rahul("Rahul Khilari");
        new People().rahul("Rahul Khilari");
    }


}
