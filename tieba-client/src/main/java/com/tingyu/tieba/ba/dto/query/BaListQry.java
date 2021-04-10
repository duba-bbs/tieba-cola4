package com.tingyu.tieba.ba.dto.query;

import java.math.BigInteger;

import com.alibaba.cola.dto.PageQuery;
import lombok.Data;

@Data
public class BaListQry extends PageQuery {

   private BigInteger id;
   private BigInteger parentId;
   private String baName;
   private String level;
}
