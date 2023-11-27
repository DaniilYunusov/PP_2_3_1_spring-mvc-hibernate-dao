package ru.yunusov.springmvchibernate.dao;

import ru.yunusov.springmvchibernate.models.User;

import java.util.List;

public interface UserDao {
     List<User> getUsers();
     User getUser(int id);
     void save(User user);
     void delete(int id);
}
