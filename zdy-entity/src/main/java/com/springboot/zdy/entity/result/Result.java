package com.springboot.zdy.entity.result;

import java.util.List;

/**
 * @author dengyuan zhang
 * @date 2021/2/26 - 11:30
 * 统一结果封装
 */

public class Result<T> {
    private Integer code;
    private String msg;
    private T data;
    private List<T> list;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static <T>Result<T> successful(T data){
        Result<T> r = new Result<>();
        r.setCode(0);
        r.setData(data);
        r.setMsg("操作成功");
        return r;
    }

    public static <T>Result<T> successful(String msg, T data){
        Result<T> r = new Result<>();
        r.setCode(0);
        r.setData(data);
        r.setMsg(msg);
        return r;
    }
    public static <T>Result<T> fail(String msg){
        Result<T> r = new Result<>();
        r.setCode(-1);
        r.setData(null);
        r.setMsg(msg);
        return r;
    }
    public static <T>Result<T> fail(String msg, T data){
        Result<T> r = new Result<>();
        r.setCode(-1);
        r.setData(data);
        r.setMsg(msg);
        return r;
    }
    public static <T>Result<T> fail(int code, String msg, T data) {
        Result<T> r = new Result();
        r.setCode(code);
        r.setMsg(msg);
        r.setData(data);
        return r;
    }










}
