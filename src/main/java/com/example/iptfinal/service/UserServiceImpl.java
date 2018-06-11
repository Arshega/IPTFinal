package com.example.iptfinal.service;



import com.example.iptfinal.dao.UserDAO;
import com.example.iptfinal.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;



@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDAO userDAO;

    @Override
    public List<User> getUsers() {
        return userDAO.getUser();
    }


    @Override
    public void saveUser(User user) {
        userDAO.saveUser(user);
    }



    @Override
    public boolean login(User user) {
        return userDAO.loginUser(user);
    }
}
