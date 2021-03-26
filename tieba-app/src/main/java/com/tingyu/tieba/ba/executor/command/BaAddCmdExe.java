package com.tingyu.tieba.ba.executor.command;

import com.alibaba.cola.dto.Response;
import com.alibaba.cola.exception.BizException;
import com.tingyu.tieba.ba.dto.command.BaAddCmd;
import com.tingyu.tieba.ba.dto.data.ErrorCode;

import org.springframework.stereotype.Component;

@Component
public class BaAddCmdExe{

    public Response execute(BaAddCmd cmd) {
        //The flow of usecase is defined here.
        //The core ablility should be implemented in Domain. or sink to Domian gradually
        if(cmd.getBaDTO().getBaName().equals("ConflictBaName")){
            throw new BizException(ErrorCode.B_BA_baNameConflict.getErrCode(), "吧名冲突");
        }
        return Response.buildSuccess();
    }

}