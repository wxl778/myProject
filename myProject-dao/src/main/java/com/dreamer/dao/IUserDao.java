package com.dreamer.dao;

import com.dreamer.domain.IUser;

import org.apache.ibatis.annotations.*;

import java.util.List;


public interface IUserDao {

    /*
     * 查询
     */
//    @Select("select * from iuser")
    List<IUser> findAll();

    IUser findById(String id);

    List<IUser> findByUser(IUser iUser);

    /*
     * 添加
     */
    void addIUser(IUser iUser);

    /*
     * 修改
     */
    IUser updateIUser(IUser iUser);

    /*
     * 删除
     */
    void deleteIUser(String id);
}
