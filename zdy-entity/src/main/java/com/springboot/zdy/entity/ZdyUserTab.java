package com.springboot.zdy.entity;
import com.baomidou.mybatisplus.annotation.Version;
import java.io.Serializable;
/**
 * <p>
 * 
 * </p>
 *
 * @author zhang dengyuan
 * @since 2021-04-27
 */
public class ZdyUserTab implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 用户头像
     */
    private String avatar;

    /**
     * 用户邮箱
     */
    private String email;

    /**
     * 用户状态(1为正常,0为未使用)
     */
    private Integer status;

    /**
     * 用户手机
     */
    private String phone;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "ZdyUserTab{" +
        ", id=" + id +
        ", username=" + username +
        ", password=" + password +
        ", avatar=" + avatar +
        ", email=" + email +
        ", status=" + status +
        ", phone=" + phone +
        "}";
    }
}
