package com.bysj.dao;

import com.bysj.model.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * Created by cxj on 2016/11/25.
 */

@Mapper
public interface UserMapper {

    @Select("select * from user where user =#{user}")
    User findUsersByName(@Param("user")String user);
}
