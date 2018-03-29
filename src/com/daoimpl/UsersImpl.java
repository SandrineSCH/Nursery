package com.daoimpl;

import com.daoapi.UserDao;
import com.entities.UsersEntity;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Repository("UsersDao")
@Transactional
public class UsersImpl implements UserDao {

    @Autowired

    SessionFactory session;

    public boolean saveOrUpdate(UsersEntity users) {
        // TODO Auto-generated method stub
        session.getCurrentSession().saveOrUpdate(users);

        return true;
    }

    public List<UsersEntity> list() {

        return session.getCurrentSession().createQuery("from UsersEntity ").list();
    }

    public boolean delete(UsersEntity users) {
        try {
            session.getCurrentSession().delete(users);
        } catch (Exception ex) {
            return false;
        }

        return true;
    }


}
