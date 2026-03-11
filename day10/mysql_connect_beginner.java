package day10;

import java.sql.*;

public class mysql_connect_beginner{
    public static void main(String args[]){
        String url = "jdbc:mysql://localhost:3306/java_practice";
        String user = "root";
        String pass = "root";
        String query = "select * from books";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,user,pass);
            System.out.println("Connected Successfully");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            System.out.println("BID | BName");
            System.out.println("-----------");
            while(rs.next()){
                int id = rs.getInt("bid");
                String name = rs.getString("bname");
                System.out.println(id+" | "+name);
            }

       }
       catch(Exception e){
           System.out.println("Not Able To Connect");   
           e.printStackTrace();
       }
   }
}