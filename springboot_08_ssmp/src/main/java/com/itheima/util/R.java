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

    public R(){}

    /**
     * 提供一个flag参数的构造器和所有参数的构造器，简化Controller代码的编写
     * @param flag
     */
    public R(boolean flag){
        this.flag=flag;
    }

    public R(boolean flag,Object data){
        this.flag=flag;
        this.data=data;
    }
}
