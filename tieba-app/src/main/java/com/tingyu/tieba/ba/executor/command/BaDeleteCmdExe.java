package com.tingyu.tieba.ba.executor.command;

import javax.annotation.Resource;

import com.alibaba.cola.dto.Response;
import com.tingyu.tieba.ba.dto.command.BaDeleteCmd;
import com.tingyu.tieba.mappers.BaMapper;

import org.springframework.stereotype.Component;

@Component
public class BaDeleteCmdExe{

    @Resource
    private BaMapper baMapper;

    public Response execute(BaDeleteCmd cmd) {
        baMapper.delete(cmd.getId());
        return Response.buildSuccess();
    }

}