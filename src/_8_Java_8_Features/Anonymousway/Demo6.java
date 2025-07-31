package _8_Java_8_Features.Anonymousway;

public class Demo6 {
    public static void main(String[] args) {
        interface Human {
            void rahul(String Sirname);

            public abstract void Nickname(String Nickname);
        }

        Human human = new Human() {
            @Override
            public void rahul(String Sirname) {
                System.out.println("Sirname is "+Sirname);

            }

            @Override
            public void Nickname(String Nickname) {
                System.out.println("Nickname is "+Nickname);
            }
        };

//      Function call
        human.rahul("Khilari");
        human.Nickname("Rahul");
    }
}
