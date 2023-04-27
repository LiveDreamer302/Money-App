package User;

import java.sql.*;

public class checkUser {

    public boolean checkData(String nickname, String password){
        String url = "jdbc:mysql://localhost:3306/userdata?serverTimezone=UTC";
        String username = "root";
        String pass = "Casper#123";
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try (Connection connection = DriverManager.getConnection(url, username, pass)) {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String user = "SELECT * FROM userdata WHERE nickname = ?";

            // Preparing the statement
            stmt = connection.prepareStatement(user);

            // Setting the value to check
            stmt.setString(1, nickname);

            // Executing the query
            rs = stmt.executeQuery();

            // Checking if the value is in the table
            if (rs.next()) {
                String checkPass = "SELECT * FROM userdata WHERE password = ?";

                // Preparing the statement
                stmt = connection.prepareStatement(checkPass);

                // Setting the value to check
                stmt.setString(1, password);

                // Executing the query
                rs = stmt.executeQuery();
                if(rs.next()){
                    return true;
                } else {
                    System.out.println("Wrong Password");
                    return false;
                }
            } else {
                System.out.println("No such user!");
                return false;
            }

        } catch (ClassNotFoundException | SQLException ex){
            ex.printStackTrace();
        } finally {
            // Closing the resources
            try { rs.close(); } catch (Exception e) { /* ignored */ }
            try { stmt.close(); } catch (Exception e) { /* ignored */ }
            try { conn.close(); } catch (Exception e) { /* ignored */ }
        }

        return false;
    }
}
