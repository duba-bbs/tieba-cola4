package com.tingyu.tieba.user;

import javax.annotation.Resource;
import com.alibaba.cola.catchlog.CatchAndLog;
import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.tingyu.tieba.user.api.UserServiceI;
import com.tingyu.tieba.user.dto.command.UserAddCmd;
import com.tingyu.tieba.user.dto.data.UserDTO;
import com.tingyu.tieba.user.dto.query.UserListByNickNameQry;
import com.tingyu.tieba.user.executor.command.UserAddCmdExe;
import com.tingyu.tieba.user.executor.query.UserListByNickNameQryExe;
import org.springframework.stereotype.Service;

@Service
@CatchAndLog
public class UserServiceImpl implements UserServiceI {

    @Resource
    private UserAddCmdExe userAddCmdExe;

    @Resource
    private UserListByNickNameQryExe userListByNickNameQryExe;

    public Response addUser(UserAddCmd userAddCmd) {
        return userAddCmdExe.execute(userAddCmd);
    }

    @Override
    public MultiResponse<UserDTO> listByNickName(UserListByNickNameQry userListByNickNameQry) {
        return userListByNickNameQryExe.execute(userListByNickNameQry);
    }

}