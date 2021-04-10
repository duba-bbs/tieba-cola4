package com.tingyu.tieba.user.converter;

import com.tingyu.tieba.domain.user.model.UserEntity;
import com.tingyu.tieba.user.dataobject.UserDO;
import com.tingyu.tieba.user.dto.data.UserDTO;
import com.tingyu.tieba.user.dto.query.UserListQry;
import org.springframework.beans.BeanUtils;

public class AppUserConverter {

    public static UserEntity toDomainEntity(UserDTO userDTO) {
        UserEntity user = new UserEntity();
        BeanUtils.copyProperties(userDTO, user);
        return user;
    }

    public static UserEntity toDomainEntity(UserListQry qry) {
        UserEntity user = new UserEntity();
        BeanUtils.copyProperties(qry, user);
        return user;
    }

    public static UserDO toDataObject(UserDTO userDTO) {
        UserDO userDO = new UserDO();
        BeanUtils.copyProperties(userDTO, userDO);
        return userDO;
    }

    public static UserDO toDataObject(UserListQry qry) {
        UserDO userDO = new UserDO();
        BeanUtils.copyProperties(qry, userDO);
        return userDO;
    }

    public static UserDTO toClientObject(UserDO userDO) {
        UserDTO userDTO = new UserDTO();
        BeanUtils.copyProperties(userDO, userDTO);
        return userDTO;
    }

    public static UserDTO toClientObject(UserEntity baEntity) {
        UserDTO userDTO = new UserDTO();
        BeanUtils.copyProperties(baEntity, userDTO);
        return userDTO;
    }
}
