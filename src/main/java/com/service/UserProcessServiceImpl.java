package com.service;

import com.dao.UserMapper;
import com.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserProcessServiceImpl implements UserProcessService {

    @Autowired
    private UserMapper userDao;
    public boolean login(User userParm) {
        User user = userDao.getUserById(userParm.id);
        boolean loginSuccess = user==null?false:true;
        return loginSuccess;
    }
}
