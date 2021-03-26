package com.tingyu.tieba.ba.dto.data;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class BaDTO{

    private Long baId;
    private Long parentId;
    private String level;
    @NotEmpty
    private String baName;
    private String description;
    private String remark;
}
