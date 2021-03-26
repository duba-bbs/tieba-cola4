package com.tingyu.tieba.comment;

import javax.annotation.Resource;
import com.alibaba.cola.catchlog.CatchAndLog;
import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.tingyu.tieba.comment.api.CommentServiceI;
import com.tingyu.tieba.comment.dto.command.CommentAddCmd;
import com.tingyu.tieba.comment.dto.data.CommentDTO;
import com.tingyu.tieba.comment.dto.query.CommentListByTieIdQry;
import com.tingyu.tieba.comment.executor.command.CommentAddCmdExe;
import com.tingyu.tieba.comment.executor.query.CommentListByTieIdQryExe;
import org.springframework.stereotype.Service;

@Service
@CatchAndLog
public class CommentServiceImpl implements CommentServiceI {

    @Resource
    private CommentAddCmdExe commentAddCmdExe;

    @Resource
    private CommentListByTieIdQryExe commentListByTieIdQryExe;

    public Response addComment(CommentAddCmd commentAddCmd) {
        return commentAddCmdExe.execute(commentAddCmd);
    }

    @Override
    public MultiResponse<CommentDTO> listByTieId(CommentListByTieIdQry commentListByTieIdQry) {
        return commentListByTieIdQryExe.execute(commentListByTieIdQry);
    }

}