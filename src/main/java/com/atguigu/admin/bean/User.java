package com.atguigu.admin.bean;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    /**
     * 批注一下不在数据库表中的属性
     * */
    @TableField(exist = false)
    private String username;
    @TableField(exist = false)
    private  String password;

    //数据库字段
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
