package com.tingyu.tieba.comment.api;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.tingyu.tieba.comment.dto.command.CommentAddCmd;
import com.tingyu.tieba.comment.dto.data.CommentDTO;
import com.tingyu.tieba.comment.dto.query.CommentListByTieIdQry;

public interface CommentServiceI {

    public Response addComment(CommentAddCmd commentAddCmd);

    public MultiResponse<CommentDTO> listByTieId(CommentListByTieIdQry commentListByTieIdQry);
}
