package com.dc.mysite.service.impl;

import com.dc.mysite.entity.UserEntity;
import com.dc.mysite.mapper.UserMapper;
import com.dc.mysite.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author:magician
 * Date:2022-12-2022/12/21 13:50
 * Description:
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public List<UserEntity> findAll() {

        return userMapper.findAll();
    }
}
