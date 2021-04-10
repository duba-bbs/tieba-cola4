package com.tingyu.tieba.mappers;

import java.math.BigInteger;
import java.util.List;

import com.tingyu.tieba.user.dataobject.UserDO;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {

  public Long create(UserDO userDO);

  public Long update(UserDO userDO);

  public Long delete(@Param("id") BigInteger id);

  public List<UserDO> list(UserDO userDO);
}
