// 31_JDBCConnection.java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCConnection {
    public static void main(String[] args) {
        // Adjust the URL, username, and password as per your database configuration.
        String url = "jdbc:mysql://localhost:3306/yourDatabase";
        String username = "yourUsername";
        String password = "yourPassword";
        
        try {
            // Load MySQL JDBC driver (optional in newer versions)
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            Statement stmt = conn.createStatement();
            String query = "SELECT * FROM students";
            ResultSet rs = stmt.executeQuery(query);
            
            while(rs.next()) {
                System.out.println("ID: " + rs.getInt("id") +
                                   ", Name: " + rs.getString("name"));
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch(Exception e) {
            System.out.println("JDBC Connection error: " + e.getMessage());
        }
    }
}
