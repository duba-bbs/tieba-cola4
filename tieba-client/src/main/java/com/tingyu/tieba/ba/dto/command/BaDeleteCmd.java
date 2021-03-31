package com.tingyu.tieba.ba.dto.command;

import java.math.BigInteger;
import javax.validation.constraints.NotNull;
import lombok.Data;

@Data
public class BaDeleteCmd{

    @NotNull
    private BigInteger id;

}
