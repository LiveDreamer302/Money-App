package User;
import java.util.Scanner;

public class signUp {
    Scanner scanner = new Scanner(System.in);
    protected String nickname;
    protected String password;

    public String setNickname(){
        System.out.println("Enter your nickname: ");
        nickname = scanner.nextLine();
        return nickname;
    }
    public String setPassword(){
        System.out.println("Enter your password: ");
        password = scanner.nextLine();
        return password;
    }
}
