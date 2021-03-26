package com.tingyu.tieba.comment.dto.data;

import java.time.LocalDateTime;

import javax.validation.constraints.NotEmpty;

import lombok.Data;

@Data
public class CommentDTO{

    private Long id;
    @NotEmpty
    private Long tieId;
    private Long parentId;
    private String content;
    private Long userId;
    private String creator;
    private LocalDateTime createTime;
    private LocalDateTime modifyTime;
    private Long likes;
    private String status;
    private String remark;
}
