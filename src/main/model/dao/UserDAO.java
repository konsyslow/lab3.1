package main.model.dao;

import main.model.pojo.Users;

import java.util.List;

/**
 * Created by admin on 20.04.2017.
 */
public interface UserDAO {

    Users findUserByLoginAndPassword(String login, String password);
    //void insertUser(Users user);
    void insertUser(String login, String password);
    List<Users> getAll();
    Users get(Integer id);
    void updateUser(Users user);
    void deleteUser(Integer id);

}