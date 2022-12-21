package com.dc.mysite.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Author:magician
 * Date:2022-12-2022/12/21 13:35
 * Description:
 **/
@Data
@ApiModel("用户实体类")
public class UserEntity {

    private Integer id;
    @ApiModelProperty(value = "用户名",required = true,example = "root")
    private String user;
    private String password;
    private String address;
    private String Email;
}
