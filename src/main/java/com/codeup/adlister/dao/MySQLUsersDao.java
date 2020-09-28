//package com.codeup.adlister.dao;
//
//import com.codeup.adlister.models.User;
//import com.mysql.cj.jdbc.Driver;
//
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.io.InputStream;
//import java.sql.*;
//import java.util.ArrayList;
//import java.util.List;
//import com.codeup.adlister.Config;
//
//public class MySQLUsersDao implements Users {
//    private Connection connection = null;
//
//    public MySQLUsersDao(Config config) {
//        try {
//            DriverManager.registerDriver(new Driver());
//            connection = DriverManager.getConnection(
//                    config.getUrl(),
//                    config.getUser(),
//                    config.getPassword()
//            );
//        } catch (SQLException e) {
//            throw new RuntimeException("Error connecting to the database!", e);
//        }
//    }
//
//    @Override
//    public User findByUsername(String username) {
//        PreparedStatement stmt = null;
//        try {
//            stmt connection = connection.prepareStatement("SELECT * FROM users WHERE username = ?");
//            stmt.setString(1,username);
//            ResultSet rs =stmt.executeQuery();
//            return extractFromResult(rs);
//        } catch (SQLException e) {
//            throw new RuntimeException("Error retrieving the user " + username + ".");
//        }
//    }
//
//    @Override
//    public Long insert(User user) {
//        try {
//            String sql = String.format("INSERT INTO Users(id, username, email, password) VALUES ('%d', '%s', '%s', '%s');",
//                    user.getId(), user.getUsername(), user.getEmail(), user.getPassword());
//
//            PreparedStatement stmt = connection.prepareStatement(getInsertQuery(), Statement.RETURN_GENERATED_KEYS);
//            stmt.setLong(1, user.getId());
//            stmt.setString(2, user.getUsername());
//            stmt.setString(3, user.getEmail());
//            stmt.setString(4, user.getPassword());
//
//            stmt.executeUpdate();
//            ResultSet rs = stmt.getGeneratedKeys();
//            rs.next();
//            return rs.getLong(1);
//        } catch (SQLException e) {
//            throw new RuntimeException("Error creating a new user.", e);
//        }
//    }
//    private String getInsertQuery() {
//        return "INSERT INTO Users(id, username, email, password) VALUES (?, ?, ?, ?);";
//    }
//}
