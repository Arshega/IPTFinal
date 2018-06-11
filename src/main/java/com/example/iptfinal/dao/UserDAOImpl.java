package com.example.iptfinal.dao;

import com.example.iptfinal.entity.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class UserDAOImpl implements UserDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<User> getUser() {
        Session session = sessionFactory.getCurrentSession();
        Query theQuery = session.createQuery("from User");
        List<User> users= theQuery.list();
        return users;
    }


    @Override
    public void saveUser(User user) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(user);
    }

    @Override
    public boolean loginUser(User user) {
        Session session = sessionFactory.getCurrentSession();
        Query theQuery = session.createQuery("from User users where users.username =:name and users.password =:pass");
        theQuery.setString("name", user.getUsername());
        theQuery.setString("pass", user.getPassword());
        if(theQuery.list().isEmpty()){
            return false;
        }
        return true;
    }
}
