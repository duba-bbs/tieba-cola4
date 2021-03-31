package com.tingyu.tieba.comment.executor.command;

import com.alibaba.cola.dto.Response;
import com.tingyu.tieba.comment.dto.command.CommentAddCmd;
import org.springframework.stereotype.Component;

@Component
public class CommentAddCmdExe{

    public Response execute(CommentAddCmd cmd) {
        //The flow of usecase is defined here.
        //The core ablility should be implemented in Domain. or sink to Domian gradually
        return Response.buildSuccess();
    }

}