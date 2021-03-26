package com.tingyu.tieba.ba;

import javax.annotation.Resource;

import com.alibaba.cola.catchlog.CatchAndLog;
import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.tingyu.tieba.ba.api.BaServiceI;
import com.tingyu.tieba.ba.dto.command.BaAddCmd;
import com.tingyu.tieba.ba.dto.data.BaDTO;
import com.tingyu.tieba.ba.dto.query.BaListByNameQry;
import com.tingyu.tieba.ba.executor.command.BaAddCmdExe;
import com.tingyu.tieba.ba.executor.query.BaListByNameQryExe;

import org.springframework.stereotype.Service;

@Service
@CatchAndLog
public class BaServiceImpl implements BaServiceI {

    @Resource
    private BaAddCmdExe baAddCmdExe;

    @Resource
    private BaListByNameQryExe baListByNameQryExe;

    public Response addBa(BaAddCmd baAddCmd) {
        return baAddCmdExe.execute(baAddCmd);
    }

    @Override
    public MultiResponse<BaDTO> listByName(BaListByNameQry baListByNameQry) {
        return baListByNameQryExe.execute(baListByNameQry);
    }

}