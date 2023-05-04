package org.example;
import User.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    public static void main(String[] args){

//    signUp signUp = new signUp();
//    String nickname = signUp.setNickname();
//    String password = signUp.setPassword();
//    insertData data = new insertData();
//    data.insert(nickname, password);
        checkUser check = new checkUser();
        login login = new login();
        login.enterData();
        String nickname = login.getNickname();
        String password = login.getPassword();
//        check.checkData(nickname, password);
        if (check.checkData(nickname, password)){
            System.out.println("Welcome back " + nickname +"!");
        } else {
            System.out.println("Gerara here men. Shit!. Im insane");
        }

        SpringApplication.run(Main.class, args);
    }
}
