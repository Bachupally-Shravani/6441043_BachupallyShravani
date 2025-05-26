// 33_JDBCTransaction.java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBCTransaction {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/yourDatabase";
        String username = "yourUsername";
        String password = "yourPassword";
        
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, username, password);
            conn.setAutoCommit(false); // Begin transaction
            
            // Debit from account 1
            String debitSQL = "UPDATE accounts SET balance = balance - ? WHERE account_id = ?";
            PreparedStatement debitStmt = conn.prepareStatement(debitSQL);
            debitStmt.setDouble(1, 100.0);
            debitStmt.setInt(2, 1);
            debitStmt.executeUpdate();
            
            // Credit to account 2
            String creditSQL = "UPDATE accounts SET balance = balance + ? WHERE account_id = ?";
            PreparedStatement creditStmt = conn.prepareStatement(creditSQL);
            creditStmt.setDouble(1, 100.0);
            creditStmt.setInt(2, 2);
            creditStmt.executeUpdate();
            
            conn.commit();
            System.out.println("Transaction committed successfully.");
            
            debitStmt.close();
            creditStmt.close();
        } catch(Exception e) {
            System.out.println("Transaction failed: " + e.getMessage());
            try {
                if(conn != null) {
                    conn.rollback();
                    System.out.println("Rolled back transaction.");
                }
            } catch(Exception ex) {
                System.out.println("Rollback error: " + ex.getMessage());
            }
        } finally {
            try { if(conn != null) conn.close(); } catch(Exception e) {}
        }
    }
}
