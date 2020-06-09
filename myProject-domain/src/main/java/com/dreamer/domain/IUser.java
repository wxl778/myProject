package com.dreamer.domain;

import java.io.Serializable;

public class IUser implements Serializable {

    private static final long serialVersionUID = -8901343847869432797L;
    private Integer id;
    private String userid;
    private String password;
    private String username;
    private String sex;
    private String tel;
    private String is_admin;

    @Override
    public String toString() {
        return "IUser{" +
                "id=" + id +
                ", userid='" + userid + '\'' +
                ", password='" + password + '\'' +
                ", username='" + username + '\'' +
                ", sex='" + sex + '\'' +
                ", tel='" + tel + '\'' +
                ", is_admin='" + is_admin + '\'' +
                '}';
    }

    public IUser() {

    }

    public IUser(Integer id, String userid, String password, String username, String sex, String tel, String is_admin) {
        this.id = id;
        this.userid = userid;
        this.password = password;
        this.username = username;
        this.sex = sex;
        this.tel = tel;
        this.is_admin = is_admin;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getIs_admin() {
        return is_admin;
    }

    public void setIs_admin(String is_admin) {
        this.is_admin = is_admin;
    }
}
