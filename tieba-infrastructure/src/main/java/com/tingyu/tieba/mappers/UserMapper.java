package com.tingyu.tieba.mappers;

import com.tingyu.tieba.user.dataobject.UserDO;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper{

  public UserDO getUserById(String userId);
}
