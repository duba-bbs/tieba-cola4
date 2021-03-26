package com.tingyu.tieba.tie;

import javax.annotation.Resource;
import com.alibaba.cola.catchlog.CatchAndLog;
import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.tingyu.tieba.tie.api.TieServiceI;
import com.tingyu.tieba.tie.dto.command.TieAddCmd;
import com.tingyu.tieba.tie.dto.data.TieDTO;
import com.tingyu.tieba.tie.dto.query.TieListByTitleQry;
import com.tingyu.tieba.tie.executor.command.TieAddCmdExe;
import com.tingyu.tieba.tie.executor.query.TieListByTitleQryExe;
import org.springframework.stereotype.Service;

@Service
@CatchAndLog
public class TieServiceImpl implements TieServiceI {

    @Resource
    private TieAddCmdExe tieAddCmdExe;

    @Resource
    private TieListByTitleQryExe tieListByTitleQryExe;

    public Response addTie(TieAddCmd tieAddCmd) {
        return tieAddCmdExe.execute(tieAddCmd);
    }

    @Override
    public MultiResponse<TieDTO> listByTitle(TieListByTitleQry tieListByNameQry) {
        return tieListByTitleQryExe.execute(tieListByNameQry);
    }

}