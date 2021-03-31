package com.tingyu.tieba.user.convertor;

import com.tingyu.tieba.domain.user.model.User;
import com.tingyu.tieba.user.dataobject.UserDO;

import org.springframework.beans.BeanUtils;

public class UserConvertor{

    public static User toDomainEntity(UserDO userDO){
        User user = new User();
        BeanUtils.copyProperties(userDO, user);
        return user;
    }
}
