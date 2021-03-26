package com.tingyu.tieba.web;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.tingyu.tieba.comment.api.CommentServiceI;
import com.tingyu.tieba.comment.dto.command.CommentAddCmd;
import com.tingyu.tieba.comment.dto.data.CommentDTO;
import com.tingyu.tieba.comment.dto.query.CommentListByTieIdQry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommentController {

    @Autowired
    private CommentServiceI commentService;

    @GetMapping(value = "/comment")
    public MultiResponse<CommentDTO> listCommentByTieId(@RequestParam(required = false) Long tieId){
        CommentListByTieIdQry commentListByTieIdQry = new CommentListByTieIdQry();
        commentListByTieIdQry.setTieId(tieId);
        return commentService.listByTieId(commentListByTieIdQry);
    }

    @PostMapping(value = "/comment")
    public Response addComment(@RequestBody CommentAddCmd commentAddCmd){
        return commentService.addComment(commentAddCmd);
    }
}
