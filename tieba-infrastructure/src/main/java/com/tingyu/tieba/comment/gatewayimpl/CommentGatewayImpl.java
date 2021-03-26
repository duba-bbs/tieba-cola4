package com.tingyu.tieba.comment.gatewayimpl;

import com.tingyu.tieba.comment.convertor.CommentConvertor;
import com.tingyu.tieba.comment.dataobject.CommentDO;
import com.tingyu.tieba.comment.mapper.CommentMapper;
import com.tingyu.tieba.domain.comment.gateway.CommentGateway;
import com.tingyu.tieba.domain.comment.model.Comment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CommentGatewayImpl implements CommentGateway {
    @Autowired
    private CommentMapper commentMapper;

    public Comment getCommentById(String commentId){
      CommentDO commentDO = commentMapper.getCommentById(commentId);
      //Convert to Comment
      Comment comment = CommentConvertor.toDomainEntity(commentDO);
      return comment;
    }
}

