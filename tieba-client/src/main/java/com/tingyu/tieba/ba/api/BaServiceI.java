package com.tingyu.tieba.ba.api;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.tingyu.tieba.ba.dto.command.BaAddCmd;
import com.tingyu.tieba.ba.dto.data.BaDTO;
import com.tingyu.tieba.ba.dto.query.BaListByNameQry;

public interface BaServiceI {

    public Response addBa(BaAddCmd baAddCmd);

    public MultiResponse<BaDTO> listByName(BaListByNameQry baListByNameQry);
}
