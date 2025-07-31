package _8_Java_8_Features.Anonymousway;

public class Demo1 {
    public static void main(String[] args) {
       class messageService{
            void send(String Message){};
        }

//        Traditional way...................................................
//        class Whatsapp extends messageService{
//            public void send(String Message) {
//                System.out.println("Hello sir "+ Message);
//            }
//        }



//      Annonymous way of printing method..................................
        messageService Service = new  messageService(){
            public void send(String Message) {
                System.out.println("Hello sir "+ Message);
            }
        };
        Service.send("Good Morning");
    }
}
