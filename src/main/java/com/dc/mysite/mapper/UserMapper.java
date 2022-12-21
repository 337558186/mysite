package com.dc.mysite.mapper;

import com.dc.mysite.entity.UserEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Author:magician
 * Date:2022-12-2022/12/21 13:36
 * Description:
 **/
@Mapper
public interface UserMapper {

    /**
     * 查询所有用户
    */
    @Select("SELECT * FROM demo")
    List<UserEntity> findAll();

    /**
     * 新增用户用户
     */
    @Insert("INSERT into demo (username,password,address,email)VALUES(#{username},#{password},#{address},#{email})")
    Integer addUser(UserEntity entity);

    /**
     * 更新用户数据
     */
    Integer updateUser(UserEntity entity);

}
