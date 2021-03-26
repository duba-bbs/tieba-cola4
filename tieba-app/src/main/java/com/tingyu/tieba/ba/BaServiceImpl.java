package com.tingyu.tieba.ba;

import javax.annotation.Resource;
import com.alibaba.cola.catchlog.CatchAndLog;
import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.tingyu.tieba.ba.api.BaServiceI;
import com.tingyu.tieba.ba.dto.command.BaAddCmd;
import com.tingyu.tieba.ba.dto.command.BaDeleteCmd;
import com.tingyu.tieba.ba.dto.command.BaUpdateCmd;
import com.tingyu.tieba.ba.dto.data.BaDTO;
import com.tingyu.tieba.ba.dto.query.BaListQry;
import com.tingyu.tieba.ba.executor.command.BaAddCmdExe;
import com.tingyu.tieba.ba.executor.command.BaDeleteCmdExe;
import com.tingyu.tieba.ba.executor.command.BaUpdateCmdExe;
import com.tingyu.tieba.ba.executor.query.BaListQryExe;
import org.springframework.stereotype.Service;

@Service
@CatchAndLog
public class BaServiceImpl implements BaServiceI {

    @Resource
    private BaAddCmdExe baAddCmdExe;

    @Resource
    private BaDeleteCmdExe baDeleteCmdExe;

    @Resource
    private BaUpdateCmdExe baUpdateCmdExe;

    @Resource
    private BaListQryExe baListQryExe;

    @Override
    public MultiResponse<BaDTO> list(BaListQry baListQry) {
        return baListQryExe.execute(baListQry);
    }

    @Override
    public Response addBa(BaAddCmd baAddCmd) {
        return baAddCmdExe.execute(baAddCmd);
    }

    @Override
    public Response deleteBa(BaDeleteCmd baDeleteCmd) {
        return baDeleteCmdExe.execute(baDeleteCmd);
    }

    @Override
    public Response updateBa(BaUpdateCmd baUpdateCmd) {
        return baUpdateCmdExe.execute(baUpdateCmd);
    }

    @Override
    public Response partialUpdateBa(BaUpdateCmd baUpdateCmd) {
        return baUpdateCmdExe.execute(baUpdateCmd);
    }

}