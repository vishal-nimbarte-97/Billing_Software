/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbcon;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Administrator
 */
public class DBConnection 
{
    public static Connection getConnection()
    {
        Connection con = null;
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/billing_software","root","2001");
//            DriverManager.getConnection("jdbc:mysql://localhost:3306/billing_software");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return con;
    }
}
