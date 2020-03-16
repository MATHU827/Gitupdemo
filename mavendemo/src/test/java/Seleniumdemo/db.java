package Seleniumdemo;
import java.io.IOException;
import  java.sql.Connection;		
import  java.sql.Statement;		
import  java.sql.ResultSet;		
import  java.sql.DriverManager;		
import  java.sql.SQLException;
public class db { 
public static void main(String[] args) throws IOException, ClassNotFoundException, 

SQLException { 	
String dburl = "jdbc:mysql://localhost:3306/emt"; 
String username = "root";
String password = "mathumitha1998"; 
String query = "Select * from students"; 
//connects to sql
Class.forName("com.mysql.jdbc.Driver"); 
Connection con= DriverManager.getConnection(dburl, username, password); 
//statement helps to look code in sql
Statement stmt = con.createStatement(); 
//used to retrive result based on queries used 
ResultSet rs = stmt.executeQuery(query); 
//code used for iteration (ie)comes to next set of values
while(rs.next());
{ 
String name = rs.getString("marks"); 
String rollno = rs.getString("Name"); 
String sal= rs.getString("Result"); 
System.out.println(name); 
System.out.println(rollno); 
System.out.println(sal); 

}con.close();  
} 
}
