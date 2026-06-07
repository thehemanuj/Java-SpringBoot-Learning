package org.ayushshukla;

import java.sql.SQLException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws SQLException {
        JDBC db = new JDBC();
        db.insertStudent("Ayush",100);
        db.showAllStudents();
        db.search(1);
        db.search("Ayush");
        db.update(1,"Kushal",500);
        db.deleteStudent(10);
        db.exit();
    }
}