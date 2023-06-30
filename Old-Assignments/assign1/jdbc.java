package assignments.assign1;

// import java.sql.SQLException;
// import java.sql.DriverManager;
import java.sql.*;

public class jdbc {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // Loading the driver
        Class.forName("oracle.jdbc.driver.OracleDriver");
        // Connecting to a database
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521", "system", "packageN-name"); 
        // create statement:
        // There are 3 types of them
        // 1. Normal 2. Prepared 3. Gullible
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from db_cse"); // rs always points at data record-1
        // we need to move this rs pointer using a method rs.next(); to iterate over
        while (rs.next()) {
            System.out.println("Name: " + rs.getString(1));
            System.out.println("Name: " + rs.getInt(2));
            System.out.println("Name: " + rs.getString(3));
        }
        // close the connection
        con.close();
    }
}

// Load the driver
// connect to a DB
// create a statement
// execute the statement
// do operation
// close the connection