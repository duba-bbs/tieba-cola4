package com.tingyu.tieba.user.gatewayimpl;

import com.tingyu.tieba.domain.user.gateway.UserGateway;
import com.tingyu.tieba.domain.user.model.User;
import com.tingyu.tieba.user.convertor.UserConvertor;
import com.tingyu.tieba.user.dataobject.UserDO;
import com.tingyu.tieba.user.mapper.UserMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserGatewayImpl implements UserGateway {
    @Autowired
    private UserMapper userMapper;

    public User getUserById(String userId){
      UserDO userDO = userMapper.getUserById(userId);
      //Convert to User
      User user = UserConvertor.toDomainEntity(userDO);
      return user;
    }
}

