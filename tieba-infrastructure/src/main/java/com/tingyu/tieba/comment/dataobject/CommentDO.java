package com.tingyu.tieba.comment.dataobject;

import java.time.LocalDateTime;
import lombok.Data;

/**
 * <p>
 * 评论表
 * </p>
 *
 * @author tingyu
 * @since 2021-03-25
 */
@Data
public class CommentDO {

    private Long id;
    /**
     * 所属贴
     */
    private Long commentId;

    /**
     * 上级评论，如果是0表示主楼
     */
    private Long parentId;

    /**
     * 评论内容
     */
    private String content;

    /**
     * 评论者ID
     */
    private Long userId;

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
    private Long likes;

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

}
