package com.tingyu.tieba.tie.mapper;

import com.tingyu.tieba.tie.dataobject.TieDO;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TieMapper{

  public TieDO getTieById(String tieId);
}
