package com.tingyu.tieba.user.dto.command;

import java.math.BigInteger;
import javax.validation.constraints.NotNull;
import lombok.Data;

@Data
public class UserDeleteCmd {

    @NotNull
    private BigInteger id;

}
