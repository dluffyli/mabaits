package com.dao;

import com.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    public User getUserById(int id);

    public void deleteUser(int id);

    public void addUser();

}
