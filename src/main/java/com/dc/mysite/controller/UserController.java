package com.dc.mysite.controller;

import com.dc.mysite.entity.UserEntity;
import com.dc.mysite.service.UserService;
import io.swagger.annotations.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * Author:magician
 * Date:2022-12-2022/12/21 13:37
 * Description: 用户信息维护
 **/
@Api(tags = "用户管理") //  Swagger：你可以当作是这个组的名字

@Component
@RestController

@Slf4j
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService usersService;

    @GetMapping("/find")
    @ApiOperation(value = "查询用户信息",notes = "方法说明")
    @ApiResponses({
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    public List<UserEntity> findAll() {

        return usersService.findAll();

    }

    @PostMapping("/findUserByUserId")
    @ApiOperation(value ="根据用户Id查询用户信息",notes = "方法说明")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId",value = "用户ID" , dataType = "String", paramType = "query")
    })
    public UserEntity findUserByUserId(@RequestBody UserEntity entity) {  // @RequestBody的作用其实是将json格式的数据转为java对象

//        return UsersService.save(entity);
        return null;
    }

}
