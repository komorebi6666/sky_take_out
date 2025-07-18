package com.sky.dto;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@Api(tags = "新增员工时传递的数据模型")
public class EmployeeDTO implements Serializable {
    @ApiModelProperty("员工id")
    private Long id;
    @ApiModelProperty("员工用户名")
    private String username;
    @ApiModelProperty("员工姓名")
    private String name;
    @ApiModelProperty("手机号")
    private String phone;
    @ApiModelProperty("员工密码")
    private String sex;
    @ApiModelProperty("身份证号")
    private String idNumber;

}
