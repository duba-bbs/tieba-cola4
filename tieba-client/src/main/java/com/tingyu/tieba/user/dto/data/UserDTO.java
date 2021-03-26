package com.tingyu.tieba.user.dto.data;

import lombok.Data;
import javax.validation.constraints.NotEmpty;

@Data
public class UserDTO{

    private Long id;
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
