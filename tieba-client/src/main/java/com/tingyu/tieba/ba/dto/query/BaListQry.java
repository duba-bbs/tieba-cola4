package com.tingyu.tieba.ba.dto.query;

import java.math.BigInteger;

import com.alibaba.cola.dto.Query;
import lombok.Data;

@Data
public class BaListQry extends Query{

   private BigInteger id;
   private BigInteger parentId;
   private String baName;
   private String level;
}
