package com.tingyu.tieba.user.executor.command;

import com.alibaba.cola.dto.Response;
import com.tingyu.tieba.domain.user.gateway.UserGateway;
import com.tingyu.tieba.domain.user.model.UserEntity;
import com.tingyu.tieba.user.converter.AppUserConverter;
import com.tingyu.tieba.user.dto.command.UserUpdateCmd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserUpdateCmdExe {

    @Autowired
    private UserGateway userGateway;

    public Response execute(UserUpdateCmd cmd) {
        UserEntity user = AppUserConverter.toDomainEntity(cmd.getUserDTO());
        userGateway.update(user);
        return Response.buildSuccess();
    }

}