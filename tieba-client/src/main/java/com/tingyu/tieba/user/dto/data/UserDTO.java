package com.tingyu.tieba.user.dto.data;

import java.math.BigInteger;

import javax.validation.constraints.NotEmpty;

import lombok.Data;

@Data
public class UserDTO{

    private BigInteger id;
    @NotEmpty
    private String userName;
    private String nickName;
    private String userType;
    private String email;
    private String motto;
    private String phonenum;
    private String sex;
    private String avatar;
    private String status;
    private String remark;
}
