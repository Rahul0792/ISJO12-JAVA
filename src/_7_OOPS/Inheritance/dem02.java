package _7_OOPS.Inheritance;

public class dem02 {
    public static void main(String[] args) {
        class parent{
            int A = 101;
            int B = 202;
        }
        class child extends parent{
            int A = 1001;
            int B = 2002;
            void print(int a , int b){
                System.out.println("Local variable A = "+ a + " B = " + b);
                System.out.println("child class variable A = "+ this.A + " B = " + this.B);
                System.out.println("Parent variable A = "+ super.A + " B = " + super.B);
            }
        }
        child child = new child();
        child.print(10000,20000);
    }
}
