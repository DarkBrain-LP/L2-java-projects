/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc.classe;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author M@nU_LP
 */
public class Test {
    public static void main(String[] args) throws SQLException{
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/java_classe", "root", "");
        PreparedStatement pst = conn.prepareStatement("SELECT * FROM etudiant");
        ResultSet rs = pst.executeQuery();
        
        while(rs.next()){
            System.out.printf("%s\t%s\t%d\t\n",
                    rs.getString(1),
                    rs.getString(2),
                    rs.getInt(3));
        }
    }

}
