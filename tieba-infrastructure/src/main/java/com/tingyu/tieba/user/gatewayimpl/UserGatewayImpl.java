package com.tingyu.tieba.user.gatewayimpl;

import java.math.BigInteger;

import com.tingyu.tieba.domain.user.gateway.UserGateway;
import com.tingyu.tieba.domain.user.model.UserEntity;
import com.tingyu.tieba.mappers.UserMapper;
import com.tingyu.tieba.user.convertor.InfraUserConverter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserGatewayImpl implements UserGateway {
  @Autowired
  private UserMapper userMapper;

  @Override
  public void create(UserEntity user) {
    userMapper.create(InfraUserConverter.toDataObject(user));
  }

  @Override
  public void update(UserEntity user) {
    userMapper.update(InfraUserConverter.toDataObject(user));
  }

  @Override
  public void delete(BigInteger id) {
    userMapper.delete(id);
  }
}
