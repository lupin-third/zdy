package com.springboot.zdy.entity;

import java.io.Serializable;

/**
 * @author dengyuan zhang
 * @date 2021/4/15 - 18:46
 */
public class Test implements Serializable {
    private static final long serialVersionUID = 1L;
    public Integer id;

    private String username;

    private Integer age;

    private String sex;

    private String adress;
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Test{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", adress='" + adress + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
