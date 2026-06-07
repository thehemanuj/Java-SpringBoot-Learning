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

    public void addBook(String book_name,String author_name,int price) throws SQLException {
        String sql ="INSERT INTO books VALUES(?,?,?)";
        prepareAndExecute(sql,book_name,author_name,price);
    }
    public void issueBook(int book_id,int student_id) throws SQLException {
        String sql ="INSERT INTO issued_books(student_id,book_id) VALUES(?,?)";
        prepareAndExecute(sql,book_id,student_id);
    }
    public void returnBook(int book_id, int student_id) throws SQLException {
        String sql = "update issued_books set return_date=? where book_id=? and student_id=? and return_date is NULL";
        Date date = new Date(System.currentTimeMillis());
        prepareAndExecute(sql,date,book_id,student_id);

    }

    public int calculateFine(int book_id, int student_id,Date return_date) throws SQLException {
        String sql = "select datediff(return_date,issue_date) as `fine` from issued_books where book_id=? and student_id=? and return_date=?";
        ResultSet rs=prepareAndExecuteQuery(sql,book_id,student_id,return_date);
        int total= rs.next()?rs.getInt("fine"):0;
        return total>15?(total-15)*5:0;
    }

    public void showAllIssued() throws SQLException {
        String sql = "select * from issued_books where return_date is NULL";
        showResults(prepareAndExecuteQuery(sql));
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

        statement.executeUpdate();
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
