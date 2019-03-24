/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Jaideep
 */
public class DbConnection {
     public static Connection connect()
	{
		Connection con=null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql:///Car";
			con=DriverManager.getConnection(url,"root","");
			return con;
		}
		catch(Exception e){System.out.println(e);}
		return con;
	}
}
