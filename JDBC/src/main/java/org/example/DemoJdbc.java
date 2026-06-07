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

        String url="jdbc:mysql://localhost:3306/ayush";
        String user="laravel";
        String password="Ayush@39";
        //Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(url,user,password);
        System.out.println("Connection Established");

        String sql = "insert into students values(?,?,?)";
        PreparedStatement st= con.prepareStatement(sql);
        st.setInt(1,99);
        st.setString(2,"Ayush");
        st.setInt(3,2);
        st.execute();

//        System.out.println(done);
//        for(int i=0;i<=50;i++){
//            ResultSet rs= st.executeQuery(sql+i);
//            if(rs.next()) System.out.println(i+")"+rs.getString("name"));
//        }

        //System.out.println(rs.next());
        con.close();
        System.out.println("Connection closed");
    }
}
