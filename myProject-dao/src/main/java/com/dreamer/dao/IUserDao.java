package com.dreamer.dao;

import com.dreamer.domain.IUser;
import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;


@CacheNamespace(blocking = true)
public interface IUserDao {
    /*
    查询
     */
    @Select("select * from user")
    @Results(id = "userMap", value = {
            @Result(id = true, column = "id", property = "id"),
            @Result(column = "userid", property = "userid"),
            @Result(column = "password", property = "password"),
            @Result(column = "username", property = "username"),
            @Result(column = "sex", property = "sex"),
            @Result(column = "tel", property = "tel"),
            @Result(column = "is_admin", property = "is_admin")
//            @Result(property = "accounts",column = "id",
//                    many = @Many(select = "com.itheima.dao.IAccountDao.findAccountByUid",
//                            fetchType = FetchType.LAZY))
    })
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
