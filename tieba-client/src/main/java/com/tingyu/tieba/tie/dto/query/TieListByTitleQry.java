package com.tingyu.tieba.tie.dto.query;

import com.alibaba.cola.dto.Query;
import lombok.Data;

@Data
public class TieListByTitleQry extends Query{
   private String title;
}
