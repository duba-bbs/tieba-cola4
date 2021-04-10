package com.tingyu.tieba.user;

import javax.annotation.Resource;
import com.alibaba.cola.catchlog.CatchAndLog;
import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.PageResponse;
import com.alibaba.cola.dto.Response;
import com.tingyu.tieba.user.api.UserServiceI;
import com.tingyu.tieba.user.dto.command.UserAddCmd;
import com.tingyu.tieba.user.dto.command.UserDeleteCmd;
import com.tingyu.tieba.user.dto.command.UserUpdateCmd;
import com.tingyu.tieba.user.dto.data.UserDTO;
import com.tingyu.tieba.user.dto.query.UserListQry;
import com.tingyu.tieba.user.executor.command.UserAddCmdExe;
import com.tingyu.tieba.user.executor.command.UserDeleteCmdExe;
import com.tingyu.tieba.user.executor.command.UserUpdateCmdExe;
import com.tingyu.tieba.user.executor.query.UserListQryExe;

import org.springframework.stereotype.Service;

@Service
@CatchAndLog
public class UserServiceImpl implements UserServiceI {

    @Resource
    private UserAddCmdExe userAddCmdExe;

    @Resource
    private UserDeleteCmdExe userDeleteCmdExe;

    @Resource
    private UserUpdateCmdExe userUpdateCmdExe;

    @Resource
    private UserListQryExe userListQryExe;

    @Override
    public PageResponse<UserDTO> list(UserListQry userListQry) {
        return userListQryExe.execute(userListQry);
    }

    @Override
    public Response addUser(UserAddCmd userAddCmd) {
        return userAddCmdExe.execute(userAddCmd);
    }

    @Override
    public Response deleteUser(UserDeleteCmd userDeleteCmd) {
        return userDeleteCmdExe.execute(userDeleteCmd);
    }

    @Override
    public Response updateUser(UserUpdateCmd userUpdateCmd) {
        return userUpdateCmdExe.execute(userUpdateCmd);
    }

    @Override
    public Response partialUpdateUser(UserUpdateCmd userUpdateCmd) {
        return userUpdateCmdExe.execute(userUpdateCmd);
    }

}