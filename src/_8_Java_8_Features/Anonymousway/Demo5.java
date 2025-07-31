package _8_Java_8_Features.Anonymousway;

public class Demo5 {
    public static void main(String[] args) {
        interface Human {
            void rahul(String Sirname);

            public abstract void Nickname(String Nickname);
        }

        new Human() {

            @Override
            public void Nickname(String Nickname) {
                System.out.println("Nickname is " + Nickname);
            }

            public void rahul(String Sirname) {
                System.out.println("Sir name is " + Sirname);
            }
        }.rahul("Khilari");  //  First Method Call

        new Human() {
            @Override
            public void Nickname(String Nickname) {
                System.out.println("Nickname is " + Nickname);
            }
            public void rahul(String Sirname) {
                System.out.println("Sir name is " + Sirname);
            }

        }.Nickname("Rahul");      //  Second Method Call
    }
}
