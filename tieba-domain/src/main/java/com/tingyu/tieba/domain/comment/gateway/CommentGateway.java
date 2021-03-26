package com.tingyu.tieba.domain.comment.gateway;

import com.tingyu.tieba.domain.comment.model.Comment;

public interface CommentGateway {
    public Comment getCommentById(String commentId);
}
