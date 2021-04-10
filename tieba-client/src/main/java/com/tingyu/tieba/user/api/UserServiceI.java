package com.tingyu.tieba.user.api;

import com.alibaba.cola.dto.PageResponse;
import com.alibaba.cola.dto.Response;
import com.tingyu.tieba.user.dto.command.UserAddCmd;
import com.tingyu.tieba.user.dto.command.UserDeleteCmd;
import com.tingyu.tieba.user.dto.command.UserUpdateCmd;
import com.tingyu.tieba.user.dto.data.UserDTO;
import com.tingyu.tieba.user.dto.query.UserListQry;

public interface UserServiceI {

    public PageResponse<UserDTO> list(UserListQry userListQry);

    public Response addUser(UserAddCmd userAddCmd);

    public Response deleteUser(UserDeleteCmd userDeleteCmd);

    public Response updateUser(UserUpdateCmd userUpdateCmd);

    public Response partialUpdateUser(UserUpdateCmd userUpdateCmd);
}
