package com.tingyu.tieba.tie.dto.data;

import java.math.BigInteger;
import java.time.LocalDateTime;

import javax.validation.constraints.NotEmpty;

import lombok.Data;

@Data
public class TieDTO{

    private BigInteger id;
    @NotEmpty
    private String title;
    private String content;
    private BigInteger userId;
    private String creator;
    private LocalDateTime createTime;
    private LocalDateTime modifyTime;
    private BigInteger viewTimes;
    private String status;
    private String remark;
    private String isTopQuality;
}
