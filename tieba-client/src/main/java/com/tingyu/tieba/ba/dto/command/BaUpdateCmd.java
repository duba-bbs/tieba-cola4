package com.tingyu.tieba.ba.dto.command;

import javax.validation.constraints.NotNull;
import com.tingyu.tieba.ba.dto.data.BaDTO;
import lombok.Data;

@Data
public class BaUpdateCmd{

    @NotNull
    private BaDTO baDTO;

}
