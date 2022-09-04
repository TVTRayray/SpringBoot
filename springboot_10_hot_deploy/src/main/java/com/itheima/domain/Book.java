package com.itheima.domain;

import lombok.Data;

//lombok
@Data
/**
 * @Data
 *      提供get/set toString hashCode equals方法
 */
public class Book {
    private Integer id;
    private String type;
    private String name;
    private String description;

}
