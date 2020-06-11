package com.dreamer.service.impl;

import com.dreamer.service.IUserService;
import com.dreamer.dao.IUserDao;
import com.dreamer.domain.IUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("iUserService")
@Transactional
public class IUserServiceImpl implements IUserService {

    @Autowired
    public IUserDao iUserDao;

    @Override
    public List<IUser> findAll() {
        return iUserDao.findAll();
    }
}
