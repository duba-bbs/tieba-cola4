package com.tingyu.tieba.user.executor.command;

import javax.annotation.Resource;

import com.alibaba.cola.dto.Response;
import com.tingyu.tieba.mappers.UserMapper;
import com.tingyu.tieba.user.dto.command.UserDeleteCmd;

import org.springframework.stereotype.Component;

@Component
public class UserDeleteCmdExe {

    @Resource
    private UserMapper userMapper;

    public Response execute(UserDeleteCmd cmd) {
        userMapper.delete(cmd.getId());
        return Response.buildSuccess();
    }

}