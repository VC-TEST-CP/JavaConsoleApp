package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Database connection details
        String url = "jdbc:mysql://localhost:3306/your_database";
        String user = "your_username";
        String password = "your_password";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a username: ");
        String inputUsername = scanner.nextLine();

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();

            // SQL Injection vulnerability here
            String query = "SELECT * FROM users WHERE username = '" + inputUsername + "'";
            ResultSet resultSet = statement.executeQuery(query);

            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
