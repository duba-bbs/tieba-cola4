package com.tingyu.tieba.user.executor.command;

import com.alibaba.cola.dto.Response;
import com.tingyu.tieba.user.dto.command.UserAddCmd;
import org.springframework.stereotype.Component;

@Component
public class UserAddCmdExe{

    public Response execute(UserAddCmd cmd) {
        //The flow of usecase is defined here.
        //The core ablility should be implemented in Domain. or sink to Domian gradually
       
        return Response.buildSuccess();
    }

}