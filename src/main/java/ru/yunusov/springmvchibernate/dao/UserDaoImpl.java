package ru.yunusov.springmvchibernate.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.yunusov.springmvchibernate.models.User;

import java.util.List;

@Repository
@Transactional(readOnly = true)
public class UserDaoImpl implements UserDao{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> getUsers(){
        return entityManager.createQuery("select u from User u", User.class).getResultList();
    }

    @Override
    public User getUser(int id){
        return entityManager.find(User.class, id);
    }

    @Override
    @Transactional
    public void save(User user) {
        entityManager.merge(user);
    }

    @Override
    @Transactional
    public void update(User user) {
        User userToBeUpdated = entityManager.find(User.class, user.getId());

        userToBeUpdated.setAge(user.getAge());
        userToBeUpdated.setEmail(user.getEmail());
        userToBeUpdated.setName(user.getName());
    }
    @Override
    @Transactional
    public void delete(int id) {
        entityManager.remove(entityManager.find(User.class, id));
    }
}
