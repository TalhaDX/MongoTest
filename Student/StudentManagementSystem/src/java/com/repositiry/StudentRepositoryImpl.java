package com.repositiry;

import com.domain.Student;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.util.*;
import java.util.List;


public class StudentRepositoryImpl implements StudentRepository {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";

    static final String DB_URL = "jdbc:mysql://localhost:3306/School";

    //  Database credentials
    static final String USER = "username";
    static final String PASS = "password";

    Connection conn = null;
    java.sql.Statement stmnt = null;

    public void saveStudent(Student student) {

        System.out.println("-------- MySQL JDBC Connection Testing ------------");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Where is your MySQL JDBC Driver?");
            e.printStackTrace();
            return;
        }

        System.out.println("MySQL JDBC Driver Registered!");

        try {
            conn = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/school","root", "123456");

                        //STEP 4: Execute a query
            System.out.println("Inserting records into the table...");
            stmnt = conn.createStatement();

            String sql = "INSERT INTO student " +
                    "VALUES ('"+student.getId()+"', '"+ student.getName() +"', "+ student.getAge() +", '"+ student.getGender() +"', '"+ student.getAddress() +"' ,1)";

            stmnt.executeUpdate(sql);

        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
            return;
        }

        if (conn != null) {
            System.out.println("You made it, take control your database now!");
        } else {
            System.out.println("Failed to make conn!");
        }
    }


    @Override
    public List<Student> getAll() {

        ArrayList columnNames = new ArrayList();
        ArrayList data = new ArrayList();

        //  Connect to an MySQL Database, run query, get result set

        String sql = "SELECT * FROM student";

        // Java SE 7 has try-with-resources
        // This will ensure that the sql objects are closed when the program
        // is finished with them
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/school","root", "123456");

            stmnt = conn.createStatement();
            ResultSet rs = stmnt.executeQuery( sql );
            int count = rs.getMetaData().getColumnCount();

            for(int i=1 ; i <= count -1; i++ ){
               rs.getObject(i);
            }

        }
        catch (SQLException e)
        {
            System.out.println( e.getMessage() );
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }

}