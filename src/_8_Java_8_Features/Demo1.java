package _8_Java_8_Features;

public class Demo1 {
    public static void main(String[] args) {
        abstract class messageService{
            public abstract void send(String Message);
        }
        class Whatsapp extends messageService{
            public void send(String Message) {
                System.out.println("Hello sir "+ Message);
            }
        }
        messageService Service = new Whatsapp();
        Service.send("Good Morning");
    }
}
