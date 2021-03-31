package com.tingyu.tieba.comment.convertor;

import com.tingyu.tieba.comment.dataobject.CommentDO;
import com.tingyu.tieba.domain.comment.model.Comment;

import org.springframework.beans.BeanUtils;

public class CommentConvertor{

    public static Comment toDomainEntity(CommentDO commentDO){
        Comment comment = new Comment();
        BeanUtils.copyProperties(commentDO, comment);
        return comment;
    }
}
