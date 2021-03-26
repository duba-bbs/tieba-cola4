package com.tingyu.tieba.comment.mapper;

import com.tingyu.tieba.comment.dataobject.CommentDO;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CommentMapper{

  public CommentDO getCommentById(String commentId);
}
