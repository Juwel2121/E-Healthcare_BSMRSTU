package net.codejava.e_health;

//import all package when needed
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

//declare a main class
public class E_health {

    //declare main function
    public static void main(String[] args) {
        
         
        try {
            //new welcome.setVisible(true);
                    
        //declare the parameter of connection
        String url = "jdbc:mysql://localhost:3307/connectdb";
        String user = "root";
        String password = "juwelmallick";
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        //for a new connection with database
        Connection c  = DriverManager.getConnection(url,user, password);
        
        Statement statement = c.createStatement();
        
        
        //(start) display the database info(database read)
        String query1 = "SELECT * FROM table1";
        ResultSet result= statement.executeQuery(query1);
         
         while(result.next())
         {
            String id, name;
            id = result.getString("id");
            name = result.getString("name");
            System.out.println(id+" "+name);
         }
         System.out.println("\n");
        //(end) display the database info(database read)
         
        /*
        //(start) insert data in database (database write)
        String query2 = "INSERT INTO `connectdb`.`table1` (`id`, `name`) VALUES ('13', 'jahid')";
        statement.executeUpdate(query2);
        //(end) insert data in database (database write)
        String q3 = "INSERT INTO `bsmrstu_community`.`admin` (`name`, `username`, `password`) VALUES ('"+name+"', '"+us+"', '"+pas+"')";
        s1.executeUpdate(q3);
        */
        
        //(start) delete data from database (database uodate)
        String query3 = "DELETE FROM `connectdb`.`table1` WHERE (`id` = '5')";
        statement.executeUpdate(query3);
        //(end) delete data from database (database uodate)
        
        
        
        //(start) display the final database info(database read)
        result= statement.executeQuery(query1);
         
         while(result.next())
         {
            String id, name;
            id = result.getString("id");
            name = result.getString("name");
            System.out.println(id+" "+name);
         }
         System.out.println("\n");
       //(end) display the final database info(database read)
       
       
       //close all connection
        c.close();
        statement.close();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(E_health.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        
    }
}
