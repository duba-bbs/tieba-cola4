package com.tingyu.tieba.ba.executor.command;

import com.alibaba.cola.dto.Response;
import com.tingyu.tieba.ba.converter.AppBaConverter;
import com.tingyu.tieba.ba.dto.command.BaUpdateCmd;
import com.tingyu.tieba.domain.ba.gateway.BaGateway;
import com.tingyu.tieba.domain.ba.model.BaEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BaUpdateCmdExe {

    @Autowired
    private BaGateway baGateway;

    public Response execute(BaUpdateCmd cmd) {
        BaEntity ba = AppBaConverter.toDomainEntity(cmd.getBaDTO());
        baGateway.update(ba);
        return Response.buildSuccess();
    }

}