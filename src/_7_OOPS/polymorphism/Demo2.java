package _7_OOPS.polymorphism;

import org.w3c.dom.ls.LSOutput;

public class Demo2 {
    public static void main(String[] args) {
        class SendingMessege{
//          Method Override
            void main(String message){
                System.out.println("sending message to email -- " + message);
            }
        }
        class whatsapp extends SendingMessege{

//          Method Overide
            @Override
            void main(String message){
                System.out.println("Sending message to whatsapp -- " + message);
            }
        }
        whatsapp whatsapp = new whatsapp();
        whatsapp.main("Good Morning");
    }
}
