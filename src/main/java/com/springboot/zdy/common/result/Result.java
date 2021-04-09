package com.springboot.zdy.common.result;

/**
 * @author dengyuan zhang
 * @date 2021/2/26 - 11:30
 * 统一结果封装
 */

public class Result {
    private Integer code;
    private String msg;
    private Object data;

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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static com.springboot.zdy.common.result.Result successful(Object data){
        com.springboot.zdy.common.result.Result r = new com.springboot.zdy.common.result.Result();
        r.setCode(0);
        r.setData(data);
        r.setMsg("操作成功");
        return r;
    }

    public static com.springboot.zdy.common.result.Result successful(String msg, Object data){
        com.springboot.zdy.common.result.Result r = new com.springboot.zdy.common.result.Result();
        r.setCode(0);
        r.setData(data);
        r.setMsg(msg);
        return r;
    }
    public static com.springboot.zdy.common.result.Result fail(String msg){
        com.springboot.zdy.common.result.Result r = new com.springboot.zdy.common.result.Result();
        r.setCode(-1);
        r.setData(null);
        r.setMsg(msg);
        return r;
    }
    public static com.springboot.zdy.common.result.Result fail(String msg, Object data){
        com.springboot.zdy.common.result.Result r = new com.springboot.zdy.common.result.Result();
        r.setCode(-1);
        r.setData(data);
        r.setMsg(msg);
        return r;
    }
    public static com.springboot.zdy.common.result.Result fail(int code, String msg, Object data) {
        com.springboot.zdy.common.result.Result r = new com.springboot.zdy.common.result.Result();
        r.setCode(code);
        r.setMsg(msg);
        r.setData(data);
        return r;
    }










}
