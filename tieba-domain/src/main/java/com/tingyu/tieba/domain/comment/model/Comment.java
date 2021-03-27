package com.tingyu.tieba.domain.comment.model;

import java.math.BigInteger;
import java.time.LocalDateTime;

import com.alibaba.cola.domain.Entity;

import lombok.Data;

//Domain Entity can choose to extends the domain model which is used for DTO
@Data
@Entity
public class Comment{

    private BigInteger id;
    /**
     * 所属贴
     */
    private BigInteger tieId;

    /**
     * 上级评论，如果是0表示主楼
     */
    private BigInteger parentId;

    /**
     * 评论内容
     */
    private String content;

    /**
     * 评论者ID
     */
    private BigInteger userId;

    /**
     * 评论者
     */
    private String creator;

    /**
     * 修改人
     */
    private String modifier;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 修改时间
     */
    private LocalDateTime modifyTime;

    /**
     * 点赞数
     */
    private BigInteger likes;

    /**
     * 评论状态（0正常 1停用）
     */
    private String status;

    /**
     * 备注
     */
    private String remark;

    /**
     * 逻辑删除（y代表已删除 n代表未删除）
     */
    private String isDeleted;

    public Comment() {
    }

    public boolean isValidComment() {
        return "n".equals(this.isDeleted) && "0".equals(this.status);
    }

}
