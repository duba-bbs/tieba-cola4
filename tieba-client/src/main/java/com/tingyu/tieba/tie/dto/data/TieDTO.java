package com.tingyu.tieba.tie.dto.data;

import java.time.LocalDateTime;
import javax.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class TieDTO{

    private Long id;
    @NotEmpty
    private String title;
    private String content;
    private Long userId;
    private String creator;
    private LocalDateTime createTime;
    private LocalDateTime modifyTime;
    private Long viewTimes;
    private String status;
    private String remark;
    private String isTopQuality;
}
