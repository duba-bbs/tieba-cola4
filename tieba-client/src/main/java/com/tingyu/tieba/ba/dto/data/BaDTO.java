package com.tingyu.tieba.ba.dto.data;

import lombok.Data;

import java.math.BigInteger;
import java.time.LocalDateTime;

import javax.validation.constraints.NotEmpty;

@Data
public class BaDTO {

    private BigInteger id;
    private BigInteger parentId;
    private String level;
    @NotEmpty(message = "吧名不能为空")
    private String baName;
    private String description;
    private String creator;
    private String modifier;
    private LocalDateTime createTime;
    private LocalDateTime modifyTime;
    private String status;
    private String remark;
}
