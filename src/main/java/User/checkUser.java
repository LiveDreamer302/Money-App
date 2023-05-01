package User;

import java.sql.*;

public class checkUser {

    public boolean checkData(String nickname, String password) {
        String url = "jdbc:mysql://localhost:3306/mydatabase?serverTimezone=UTC";
        String username = "root";
        String pass = "Casper#123";
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try (Connection connection = DriverManager.getConnection(url, username, pass)) {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String user = "SELECT * FROM users WHERE nickname = ? AND password = ?";

            // Preparing the statement
            stmt = connection.prepareStatement(user);

            // Setting the values to check
            stmt.setString(1, nickname);
            stmt.setString(2, password);

            // Executing the query
            rs = stmt.executeQuery();

            // Checking if the user exists and the password is correct
            if (rs.next()) {
                return true;
            } else {
                System.out.println("Wrong nickname or password!");
                return false;
            }

        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        } finally {
            // Closing the resources
            try {
                rs.close();
            } catch (Exception e) { /* ignored */ }
            try {
                stmt.close();
            } catch (Exception e) { /* ignored */ }
            try {
                conn.close();
            } catch (Exception e) { /* ignored*/ }
        }
        return false;
    }
}