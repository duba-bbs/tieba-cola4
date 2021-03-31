package com.tingyu.tieba.tie.api;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.tingyu.tieba.tie.dto.command.TieAddCmd;
import com.tingyu.tieba.tie.dto.data.TieDTO;
import com.tingyu.tieba.tie.dto.query.TieListByTitleQry;

public interface TieServiceI {

    public Response addTie(TieAddCmd tieAddCmd);

    public MultiResponse<TieDTO> listByTitle(TieListByTitleQry tieListByTitleQry);
}
