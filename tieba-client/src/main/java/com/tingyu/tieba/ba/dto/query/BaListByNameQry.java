package com.tingyu.tieba.ba.dto.query;

import com.alibaba.cola.dto.Query;
import lombok.Data;

@Data
public class BaListByNameQry extends Query{
   private String name;
}
