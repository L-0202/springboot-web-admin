package com.atguigu.admin.mapper;

import com.atguigu.admin.bean.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 继承BaseMapper
 * */
@Mapper
public interface UserMapper extends BaseMapper<User> {


}
