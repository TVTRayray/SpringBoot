package com.itheima.util;

import lombok.Data;

/**
 * 进行数据格式统一操作，全部返回为R类型
 * boolean flag:返回操作是否成功
 * Object data:返回数据集合
 */
@Data
public class R {
    private boolean flag;
    private Object data;
    //用来存放异常信息通知
    private String msg;
    public R(){}


    public R(boolean flag){
        this.flag=flag;
    }

    public R(boolean flag,Object data){
        this.flag=flag;
        this.data=data;
    }


    public R(boolean flag,String msg){
        this.flag=flag;
        this.msg=msg;
    }

    public R(boolean flag, Object data, String msg) {
        this.flag = flag;
        this.data = data;
        this.msg = msg;
    }
}
