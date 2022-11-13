/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc.classe;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author M@nU_LP
 */
public class JdbcClasse {

    /**
     * @param args the command line arguments
     */
       static final String DB_URL =
      "jdbc:mysql://127.0.0.1:/java_classe";
   static final String DB_DRV =
      "com.mysql.jdbc.Driver";
   static final String DB_USER = "root";
   static final String DB_PASSWD = "";
   
   
    public static void main(String[] args) {
        // TODO code application logic here
         Connection connection = null;
      Statement statement = null;
      ResultSet resultSet = null;

      try{
         connection=DriverManager.getConnection
            (DB_URL,DB_USER,DB_PASSWD);
         statement=connection.createStatement();
         resultSet=statement.executeQuery("SELECT * FROM etudiant");
         while(resultSet.next()){
            System.out.printf("%s\t%s\t%d\n",
            resultSet.getString(1),
            resultSet.getString(2),
            resultSet.getString(3));
         }

      }catch(SQLException ex){
      }
        
    }
    
}
