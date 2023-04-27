package User;
import java.util.*;
public class login {
    Scanner entry = new Scanner(System.in);
    private String nickname;
    private String password;

    public void enterData(){
        nickname = entry.nextLine();
        password = entry.nextLine();
    }
    public String getNickname() {
        return nickname;
    }

    public String getPassword() {
        return password;
    }

}
