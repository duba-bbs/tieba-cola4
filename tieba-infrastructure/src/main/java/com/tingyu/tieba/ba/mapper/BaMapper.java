package com.tingyu.tieba.ba.mapper;

import com.tingyu.tieba.ba.dataobject.BaDO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BaMapper{

  public BaDO getBaById(String baId);
}
