import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DbExam4_Insert {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement stmt = null;
        
        int price_param =200;
        String name_param = "ボールペン";
       

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
            String sql = "insert into products (product_name, price) values ( ? , ? )";
            
            // create statement
            stmt = con.prepareStatement(sql); 
            stmt.setString(1, name_param);
            stmt.setInt(2, price_param);
            
            // execute
            stmt.executeUpdate();
            System.out.println("登録されました");
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