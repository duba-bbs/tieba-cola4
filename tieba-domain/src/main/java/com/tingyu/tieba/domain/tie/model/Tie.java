package com.tingyu.tieba.domain.tie.model;

import java.math.BigInteger;
import java.time.LocalDateTime;

import com.alibaba.cola.domain.Entity;

import lombok.Data;

//Domain Entity can choose to extends the domain model which is used for DTO
@Data
@Entity
public class Tie{

    private BigInteger id;
    /**
     * 所属吧
     */
    private BigInteger baId;

    /**
     * 贴子标题
     */
    private String title;

    /**
     * 贴子内容
     */
    private String content;

    /**
     * 发帖人ID
     */
    private BigInteger userId;

    /**
     * 发帖人
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
     * 阅读量
     */
    private BigInteger viewTimes;

    /**
     * 贴子状态（0正常 1停用）
     */
    private String status;

    /**
     * 备注
     */
    private String remark;

    /**
     * 是否精品（y是 n否）
     */
    private String isTopQuality;

    /**
     * 逻辑删除（y代表已删除 n代表未删除）
     */
    private String isDeleted;

    public Tie() {
    }

    public boolean isValidTie() {
        return "n".equals(this.isDeleted) && "0".equals(this.status);
    }

}
