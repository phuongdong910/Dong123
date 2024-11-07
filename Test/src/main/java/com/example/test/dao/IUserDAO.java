package com.example.test.dao;

import com.example.test.model.User;

import java.sql.SQLException;
import java.util.ArrayList;

public interface IUserDAO {
    public void insertUser(User user) throws SQLException;

    public User selectUser(int id);

    public ArrayList<Object> selectAllUsers();

    public boolean deleteUser(int id) throws SQLException;

    public boolean updateUser(User user) throws SQLException;
}