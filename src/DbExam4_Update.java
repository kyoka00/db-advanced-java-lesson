import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DbExam4_Update {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement stmt = null;
        
        int id_param =101;
        int price_param = 60;
       

        try {
            // load JDBC Driver
            Class.forName("org.postgresql.Driver");
            

            // confirm
            System.out.println(" --- before connection --- ");

            // database connect
            con = DriverManager.getConnection("jdbc:postgresql:dbconnection", "axizuser", "axiz");

            // confirm
            System.out.println(" --- after connection --- ");

            // SQL query string
            String sql = "update products set price = ? where product_id = ?";
            
            // create statement
            stmt = con.prepareStatement(sql); 
            stmt.setInt(1, price_param);
            stmt.setInt(2, id_param);
            
            // execute
            stmt.executeUpdate();
            System.out.println("更新されました");
            // output
            
        } catch (Exception e) {
            e.printStackTrace();

        
        } finally {
            // close
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}