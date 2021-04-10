package com.tingyu.tieba.user.dto.command;

import javax.validation.constraints.NotNull;
import com.tingyu.tieba.user.dto.data.UserDTO;
import lombok.Data;

@Data
public class UserUpdateCmd {

    @NotNull
    private UserDTO userDTO;

}
