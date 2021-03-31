package com.tingyu.tieba.tie.executor.command;

import com.alibaba.cola.dto.Response;
import com.tingyu.tieba.tie.dto.command.TieAddCmd;

import org.springframework.stereotype.Component;

@Component
public class TieAddCmdExe{

    public Response execute(TieAddCmd cmd) {
        //The flow of usecase is defined here.
        //The core ablility should be implemented in Domain. or sink to Domian gradually
       
        return Response.buildSuccess();
    }

}