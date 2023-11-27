package ru.yunusov.springmvchibernate.services;

import ru.yunusov.springmvchibernate.models.User;

import java.util.List;

public interface UserService {
     List<User> getUsers();
     User getUser(int id);
     void save(User user);
     void delete(int id);
}
