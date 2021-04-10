package com.tingyu.tieba.mappers;

import java.math.BigInteger;
import java.util.List;
import com.tingyu.tieba.ba.dataobject.BaDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BaMapper {

  public Long create(BaDO baDO);

  public Long update(BaDO baDO);

  public Long delete(@Param("id") BigInteger id);

  public List<BaDO> list(BaDO baDO);

}
