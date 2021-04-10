package com.tingyu.tieba.user.dto.data;

import java.math.BigInteger;
import java.time.LocalDateTime;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class UserDTO {

    private BigInteger id;
    @NotBlank(message = "用户名不能为空")
    @Size(min = 0, max = 30, message = "用户名长度不能超过30个字符")
    private String userName;
    @Size(min = 0, max = 30, message = "用户昵称长度不能超过30个字符")
    private String nickName;
    private String userType = UserTypeEnum.NORMAL_USER.getTypeCode();
    @Email(message = "邮箱格式不正确")
    @Size(min = 0, max = 50, message = "邮箱长度不能超过50个字符")
    private String email;
    private String motto;
    @Size(min = 0, max = 11, message = "手机号码长度不能超过11个字符")
    private String phonenum;
    private String sex;
    private String avatar;
    private String password;
    private String salt;
    private String loginIp;
    private String status;
    private String creator;
    private String modifier;
    private LocalDateTime createTime;
    private LocalDateTime modifyTime;
    private LocalDateTime loginTime;
    private LocalDateTime modifyPwdTime;
    private String remark;
}
