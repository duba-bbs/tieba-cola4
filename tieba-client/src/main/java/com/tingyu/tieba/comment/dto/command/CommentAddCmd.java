package com.tingyu.tieba.comment.dto.command;

import com.tingyu.tieba.comment.dto.data.CommentDTO;
import lombok.Data;

@Data
public class CommentAddCmd{

    private CommentDTO commentDTO;

}
