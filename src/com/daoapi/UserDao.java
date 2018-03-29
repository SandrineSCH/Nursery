package com.daoapi;

import com.entities.UsersEntity;

import java.util.List;


public interface UserDao {
    public boolean saveOrUpdate(UsersEntity user);
    public List<UsersEntity> list();
    public boolean delete(UsersEntity user);
}
