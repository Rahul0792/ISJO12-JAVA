
//lECTURE Java 8 features
package _8_Java_8_Features.Anonymousway;

import java.sql.SQLOutput;

public class Demo8 {
    public static void main(String[] args) {

        interface UserService{
            void login();
            default void logout(){
                System.out.println("Log Out Successfull");
            };  // Default method no need to overide.....
        }
        class Authentication implements UserService {
            @Override
            public void login() {
                System.out.println("Login using username and passWord : ");
            }
        }
        class OtpService implements UserService{
            @Override
            public void login() {
                System.out.println("Login Using Otp ::");
            }
        }
        class TokenService implements UserService{
            @Override
            public void login() {
                System.out.println("Login Using Token :: ");
            }

            @Override
            public void logout() {
                System.out.println("Log out using Token ");
            }
        }

        UserService Authentication = new Authentication();
        UserService OtpService = new OtpService();
        UserService TokenService = new TokenService();

        Authentication.login();
        OtpService.login();;
        TokenService.login();

        Authentication.logout();
        OtpService.logout();
        TokenService.logout();





    }
}
