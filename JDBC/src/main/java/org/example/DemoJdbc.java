package org.example;
import java.sql.*;
public class DemoJdbc {
    public static void main(String args[]) throws ClassNotFoundException, SQLException {
        //import the package
        // load and register
        // create connection
        // create statement
        // execute statement
        // close connection
        //Class.forName("org.mysql.Driver");

        String url ="jdbc:mysql://127.0.0.1:3306/SpringBoot";
        String uname="root";
        String password = "Ayush@39";
        Connection con = DriverManager.getConnection(url,uname,password);
        System.out.println("Connection Created");
        Statement st = con.createStatement();
        String sql = "select * from students where id =";
//        System.out.println(done);
        for(int i=1;i<=50;i++){
            ResultSet rs= st.executeQuery(sql+i);
            if(rs.next()) System.out.println(i+")"+rs.getString("name"));
        }
        String sql2= "insert into students(name,age,email) values(?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql2);
        ps.setString(1,"Kushal");
        ps.setInt(2,22);
        ps.setString(3,"ayush@gmail.com");
        ps.execute();
        //System.out.println(rs.next());
        con.close();
        System.out.println("Connection closed");
    }
}
