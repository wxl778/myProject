package com.dreamer.dao;

import com.dreamer.domain.IUser;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository("iUserDao")
public interface IUserDao {
    /*
    查询
     */
    List<IUser> findAll();

    IUser findById(String id);

    List<IUser> findByUser(IUser iUser);

    /*
    添加
     */
    void addIUser(IUser iUser);

    /*
    修改
     */
    IUser updateIUser(IUser iUser);

    /*
    删除
     */
    void deleteIUser(String id);
}
