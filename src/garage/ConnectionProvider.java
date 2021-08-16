 
import java.io.FileInputStream;
//import java.io.InputStream;
import java.sql.*;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kk
 */
public class ConnectionProvider {
    public static Connection con=null;
    public static Connection getConnection()  {
    try {
    String user="sa";
    String pass="admin";
    String dbURL = "jdbc:sqlserver://TRUONGHUY1111:1433;databaseName=db_cargarage";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectionProvider.class.getName()).log(Level.SEVERE, null, ex);
        }
    con = DriverManager.getConnection(dbURL, "sa", "admin");
    if (con != null) {
      System.out.println("Connected");
    }
   } catch (SQLException ex) {
     System.err.println("Cannot connect database, " + ex);
//     System.out.println("statis  "+getConnection());
   }
return con;
}
    


   
        

       
//       private Connection DBConnection;
//    public Connection connect(){
//    try{
//        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//        System.out.println("Connecting Sucsessfuly");
//        
//    }
//    
//   catch(ClassNotFoundException cdds){
//       System.out.println("Connection Fail"+cdds);
//   }
//      String dbURL="jdbc:sqlserver://TRUONGHUY1111:1433;databaseName=db_cargarage";
//      try{
//          DBConnection = (Connection) DriverManager.getConnection(dbURL, "sa", "admin");
//         //DBConnection = (Connection) DriverManager.getConnection(url,"Admin","$oft@rapid");
//           System.out.println("Database connect");
//           
//       }
//       catch(SQLException se){
//           System.out.println("No Database"+se);
//           
//       }
//       return  DBConnection;
//    }
//       
    }

