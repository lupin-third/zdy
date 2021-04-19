package com.springboot.zdy.exception;

import com.springboot.zdy.entity.result.Result;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.ShiroException;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.io.IOException;

/**
 * @author dengyuan zhang
 * @date 2021/2/26 - 16:17
 * 全局异常处理器
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {
    //捕捉shiro的异常   ShiroException：shiro抛出的异常，比如没有权限，用户登录异常
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    @ExceptionHandler(ShiroException.class)
    public Result handle401(ShiroException e){
        return Result.fail(401, e.getMessage(),null);
    }
    //处理Assert的异常
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(value = IllegalArgumentException.class)
    public Result hanlder(IllegalArgumentException e) throws IOException{
        log.error("Assert异常:-------------->{}",e.getMessage());
        return Result.fail(e.getMessage());
    }
    //@validated 校验错误异常处理
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public Result handler(MethodArgumentNotValidException e) throws IOException{
        log.error("运行时异常:-------------->",e);
        BindingResult bindingResult = e.getBindingResult();
        ObjectError objectError = bindingResult.getAllErrors().stream().findFirst().get();
        return Result.fail(objectError.getDefaultMessage());
    }

    //捕捉其他异常
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(value = RuntimeException.class)
    public Result handler(RuntimeException e) throws IOException{
        log.error("运行时异常:-------------->",e);
        return Result.fail(e.getMessage());
    }
}
