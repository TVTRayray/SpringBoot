package com.itheima.util;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 作为springmvc的异常处理器
 */
//@ControllerAdvice
@RestControllerAdvice
public class ProjectExceptionAdvice {
    @ExceptionHandler(Exception.class)
    public R doException(Exception e){
        e.printStackTrace();
        return new R(false,"服务器故障，请稍后再试！");
    }
}
