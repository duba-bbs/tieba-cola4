package com.tingyu.tieba.user.convertor;

import com.tingyu.tieba.domain.user.model.UserEntity;
import com.tingyu.tieba.user.dataobject.UserDO;

import org.springframework.beans.BeanUtils;

public class InfraUserConverter {

    public static UserEntity toDomainEntity(UserDO userDO) {
        UserEntity user = new UserEntity();
        BeanUtils.copyProperties(userDO, user);
        return user;
    }

    public static UserDO toDataObject(UserEntity user) {
        UserDO userDO = new UserDO();
        BeanUtils.copyProperties(user, userDO);
        return userDO;
    }
}
