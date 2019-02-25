package com.service;
import com.entity.User;

public interface UserProcessService {
    public boolean login(User user);

    public boolean add(User user);

    public boolean delete(User user);
}
