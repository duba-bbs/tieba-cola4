package com.tingyu.tieba.user.api;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.tingyu.tieba.user.dto.command.UserAddCmd;
import com.tingyu.tieba.user.dto.data.UserDTO;
import com.tingyu.tieba.user.dto.query.UserListByNickNameQry;

public interface UserServiceI {

    public Response addUser(UserAddCmd userAddCmd);

    public MultiResponse<UserDTO> listByNickName(UserListByNickNameQry userListByNickNameQry);
}
