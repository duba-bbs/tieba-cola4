package com.tingyu.tieba.comment.dto.query;

import com.alibaba.cola.dto.Query;
import lombok.Data;

@Data
public class CommentListByTieIdQry extends Query{
   private Long tieId;
}
