package com.springboot.zdy.entity.dto;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;


public class LoginDto implements Serializable {

    @NotBlank(message = "昵称不能为空")
    private String ultraname;

    @NotBlank(message = "密码不能为空")
    private String ultrapassword;

    public String getUltraname() {
        return ultraname;
    }

    public void setUltraname(String ultraname) {
        this.ultraname = ultraname;
    }

    public String getUltrapassword() {
        return ultrapassword;
    }

    public void setUltrapassword(String ultrapassword) {
        this.ultrapassword = ultrapassword;
    }

    @Override
    public String toString() {
        return "LoginDto{" +
                "ultraname='" + ultraname + '\'' +
                ", ultrapassword='" + ultrapassword + '\'' +
                '}';
    }
}
