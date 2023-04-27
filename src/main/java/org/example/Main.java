package org.example;
import Actions.*;
import User.*;

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
        check.checkData(nickname, password);

    }
}
