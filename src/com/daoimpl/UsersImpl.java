package com.daoimpl;

import com.daoapi.UserDao;
import com.entities.UsersEntity;

import java.util.ArrayList;
import java.util.List;

@Repository("UsersDao")
@Transactional
public class UsersImpl implements UserDao {

    @Autowired

    public boolean sevaOrUpdate(UsersEntity user){
        return true;
    }
    public List<UsersEntity> list()
    {
        return new ArrayList<UsersEntity>();
    }
    public boolean delete(UsersEntity user){
        return true;
    }
}