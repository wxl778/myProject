package com.dreamer.service.impl;

import com.dreamer.dao.IUserDao;
import com.dreamer.domain.IUser;
import com.dreamer.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("iUserService")
public class IUserServiceImpl implements IUserService {

    @Autowired
    private IUserDao iUserDao;

    @Override
    public List<IUser> findAll() {
        System.out.println("serivce findall()");
        return iUserDao.findAll();
    }
}
