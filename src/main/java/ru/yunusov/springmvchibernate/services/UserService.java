package ru.yunusov.springmvchibernate.services;

import ru.yunusov.springmvchibernate.models.User;

import java.util.List;

public interface UserService {
    public List<User> getUsers();
    public User getUser(int id);
    public void save(User user);
    public void update(User user);
    public void delete(int id);
}
