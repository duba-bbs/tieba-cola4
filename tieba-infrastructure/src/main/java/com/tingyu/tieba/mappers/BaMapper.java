package com.tingyu.tieba.mappers;

import java.math.BigInteger;
import java.util.List;
import com.tingyu.tieba.ba.dataobject.BaDO;
import com.tingyu.tieba.ba.dto.query.BaListQry;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BaMapper{

  public BigInteger create(BaDO baDO);

  public BigInteger update(BaDO baDO);

  public BigInteger delete(@Param("id") BigInteger id);
  
  public List<BaDO> list(BaListQry baListQry);

}
