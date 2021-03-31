package com.tingyu.tieba.comment.dto.data;

import java.math.BigInteger;
import java.time.LocalDateTime;

import javax.validation.constraints.NotEmpty;

import lombok.Data;

@Data
public class CommentDTO{

    private BigInteger id;
    @NotEmpty
    private BigInteger tieId;
    private BigInteger parentId;
    private String content;
    private BigInteger userId;
    private String creator;
    private LocalDateTime createTime;
    private LocalDateTime modifyTime;
    private BigInteger likes;
    private String status;
    private String remark;
}
