package org.ayushshukla;
import java.sql.*;

public class JDBC {
    private final Connection con;
    JDBC() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/ayush";
        String user = "laravel";
        String password = "Ayush@39";
        con= DriverManager.getConnection(url,user,password);
        System.out.println("connection successful");
    }

    public void insertStudent(String name,int marks) throws SQLException {
        String sql ="INSERT INTO students(name,marks) VALUES(?,?)";
        prepareAndExecute(sql,name,marks);
    }
    public void showAllStudents() throws SQLException {
        String sql ="SELECT  * FROM students";
        ResultSet rs= prepareAndExecuteQuery(sql);
        showResults(rs);
    }
    public void search(int id) throws SQLException {
        String sql ="SELECT  * FROM students where id= ?";
        ResultSet rs= prepareAndExecuteQuery(sql,id);
        showResults(rs);
    }
    public void search(String name) throws SQLException {
        String sql ="SELECT  * FROM students where name like ? limit 1";
        ResultSet rs = prepareAndExecuteQuery(sql,"%"+name+"%");
        showResults(rs);
    }
    public void update(int id,String name,int marks) throws SQLException {
        String sql ="UPDATE students SET name=? , marks=? where id=?";
        prepareAndExecute(sql,name,marks,id);
    }
    public void deleteStudent(int id) throws SQLException {
        String sql ="DELETE FROM students where id=?";
        prepareAndExecute(sql,id);
    }
    public void exit() throws SQLException {
        con.close();
        System.out.println("Connection Closed");
    }
    public void prepareAndExecute(String sql, Object... params) throws SQLException {
        PreparedStatement statement = con.prepareStatement(sql);

        for (int i = 0; i < params.length; i++) {
            statement.setObject(i + 1, params[i]);
        }

        statement.execute();
    }

    public ResultSet prepareAndExecuteQuery(String sql,Object... params) throws SQLException{
        PreparedStatement statement = con.prepareStatement(sql);

        for (int i = 0; i < params.length; i++) {
            statement.setObject(i + 1, params[i]);
        }
        return statement.executeQuery();
    }

    public void showResults(ResultSet rs) throws SQLException {
        System.out.println();
        System.out.println("ID | NAME | MARKS");
        while(rs.next()){
            int id = rs.getInt(1);
            String name = rs.getString(2);
            int marks = rs.getInt(3);
            System.out.println(id+" | "+name+" | "+marks);
        }
    }
}
