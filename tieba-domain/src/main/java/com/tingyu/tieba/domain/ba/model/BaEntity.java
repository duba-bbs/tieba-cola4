package com.tingyu.tieba.domain.ba.model;

import java.math.BigInteger;
import java.time.LocalDateTime;
import com.alibaba.cola.domain.Entity;
import com.alibaba.cola.exception.BizException;
import lombok.Data;

//Domain Entity can choose to extends the domain model which is used for DTO
@Data
@Entity
public class BaEntity{

    private BigInteger id;
    /**
     * 上级ID，级别是版时为0
     */
    private BigInteger parentId;

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

    public BaEntity() {
    }

    public boolean isValidBa() {
        return "n".equals(this.isDeleted) && "0".equals(this.status);
    }

    public void checkConfilict(){
        //Per different biz, the check policy could be different, if so, use ExtensionPoint
        if("ConflictBaName".equals(this.baName)){
            throw new BizException(this.baName+" has already existed, you can not add it");
        }

    }

}
