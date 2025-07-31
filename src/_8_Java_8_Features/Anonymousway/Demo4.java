package _8_Java_8_Features.Anonymousway;

public class Demo4 {
    public static void main(String[] args) {
        interface People{
            public abstract void rahul(String Sirname);
        }

//        1 st way
        People people = new People() {
            public void rahul(String Sirname) {
                System.out.println("Name is " + Sirname);
            }
        };

        people.rahul("Khilari");
    }
}

