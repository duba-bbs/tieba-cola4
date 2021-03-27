package com.tingyu.tieba.ba.dto.data;

import lombok.Data;

import java.math.BigInteger;

import javax.validation.constraints.NotEmpty;

@Data
public class BaDTO{

    private BigInteger id;
    private BigInteger parentId;
    private String level;
    @NotEmpty
    private String baName;
    private String description;
    private String status;
    private String remark;
}
