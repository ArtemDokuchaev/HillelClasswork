package com.hillel.les5;

import java.sql.*;

public class SchoolData {

    private Connection connection;

    public SchoolData() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/school?useSSL=false&serverTimezone=UTC&charachterEncoding=utf8",
                    "root", "root");
            System.out.println("Connection successful");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Can't connect to database");
        }
    }

    public void getStudents() {
        String sql = "Select * from students";

        try(Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(sql);
            while(resultSet.next()){
                String firstname = resultSet.getString("firstname");
                String lastname = resultSet.getString("lastname");
                int age = resultSet.getInt("age");
                System.out.println(firstname + " " + lastname + " " + age);
            }
        } catch(SQLException e){
            e.printStackTrace();
            //System.out.println("Error");
        }
    }

    public void addStudent(String firstname, String lastname, int age){
        String sql = "insert into students(firstname, lastname, age) values (?,?,?)";

        try(PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, firstname);
            preparedStatement.setString(2, lastname);
            preparedStatement.setInt(3, age);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


