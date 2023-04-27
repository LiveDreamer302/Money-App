package Actions;

import java.sql.*;

public class insertData {
    public void insert(String nickname, String password){
        String url = "jdbc:mysql://localhost:3306/userdata?serverTimezone=UTC";
        String username = "root";
        String pass = "Casper#123";

        ///Setup driver

        try (Connection connection = DriverManager.getConnection(url, username, pass)) {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String insertSql = "INSERT INTO userdata (nickname, password, balance) VALUES (?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insertSql);

            preparedStatement.setString(1, nickname);
            preparedStatement.setString(2, password);
            preparedStatement.setInt(3, 0);
            int rowsAffected = preparedStatement.executeUpdate();

        } catch (ClassNotFoundException | SQLException ex){
            if (ex instanceof SQLIntegrityConstraintViolationException) {
                System.out.println("User already exists!");
            } else {
                System.out.println("Sorry. Something went wrong");
                ex.printStackTrace();
            }
        }


    }

    }

