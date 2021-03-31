package com.tingyu.tieba.user.dto.command;

import com.tingyu.tieba.user.dto.data.UserDTO;
import lombok.Data;

@Data
public class UserAddCmd{

    private UserDTO userDTO;

}
