package com.tingyu.tieba.comment.executor.query;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import com.alibaba.cola.dto.MultiResponse;
import com.tingyu.tieba.comment.dto.data.CommentDTO;
import com.tingyu.tieba.comment.dto.query.CommentListByTieIdQry;

import org.springframework.stereotype.Component;

@Component
public class CommentListByTieIdQryExe{
    public MultiResponse<CommentDTO> execute(CommentListByTieIdQry cmd) {
        List<CommentDTO> commentDTOList = new ArrayList<>();
        CommentDTO commentDTO = new CommentDTO();
        commentDTO.setTieId(BigInteger.valueOf(1000));
        commentDTOList.add(commentDTO);
        return MultiResponse.of(commentDTOList);
    }
}
