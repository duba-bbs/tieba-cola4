package com.tingyu.tieba.ba.dataobject;

import java.time.LocalDateTime;
import lombok.Data;

/**
 * <p>
 * 吧表
 * </p>
 *
 * @author tingyu
 * @since 2021-03-25
 */
@Data
public class BaDO {

    private Long id;
    /**
     * 上级ID，级别是版时为0
     */
    private Long parentId;

    /**
     * 级别（0版 1吧）
     */
    private String level;

    /**
     * 吧名称
     */
    private String baName;

    /**
     * 吧描述
     */
    private String description;

    /**
     * 创建者
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
     * 吧状态（0正常 1停用）
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
