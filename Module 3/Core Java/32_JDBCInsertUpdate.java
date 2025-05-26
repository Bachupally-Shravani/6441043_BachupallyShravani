// 32_JDBCInsertUpdate.java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBCInsertUpdate {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/yourDatabase";
        String username = "yourUsername";
        String password = "yourPassword";
        
        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            // Inserting a new student
            String insertSQL = "INSERT INTO students (id, name) VALUES (?, ?)";
            PreparedStatement insertStmt = conn.prepareStatement(insertSQL);
            insertStmt.setInt(1, 101);
            insertStmt.setString(2, "New Student");
            int rowsInserted = insertStmt.executeUpdate();
            System.out.println("Rows inserted: " + rowsInserted);
            
            // Updating student details
            String updateSQL = "UPDATE students SET name = ? WHERE id = ?";
            PreparedStatement updateStmt = conn.prepareStatement(updateSQL);
            updateStmt.setString(1, "Updated Student");
            updateStmt.setInt(2, 101);
            int rowsUpdated = updateStmt.executeUpdate();
            System.out.println("Rows updated: " + rowsUpdated);
            
            insertStmt.close();
            updateStmt.close();
            conn.close();
        } catch(Exception e) {
            System.out.println("JDBC Insert/Update error: " + e.getMessage());
        }
    }
}
