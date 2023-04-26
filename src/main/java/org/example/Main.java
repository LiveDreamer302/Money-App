package org.example;
import Actions.insertData;
import User.signUp;
import java.sql.*;

public class Main {
    public static void main(String[] args){

    signUp signUp = new signUp();
    String nickname = signUp.setNickname();
    String password = signUp.setPassword();
    insertData data = new insertData();
    data.insert(nickname, password);

    }
}
