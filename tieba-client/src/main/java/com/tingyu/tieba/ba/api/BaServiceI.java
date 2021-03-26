package com.tingyu.tieba.ba.api;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.tingyu.tieba.ba.dto.command.BaAddCmd;
import com.tingyu.tieba.ba.dto.command.BaDeleteCmd;
import com.tingyu.tieba.ba.dto.command.BaUpdateCmd;
import com.tingyu.tieba.ba.dto.data.BaDTO;
import com.tingyu.tieba.ba.dto.query.BaListQry;

public interface BaServiceI {

    public MultiResponse<BaDTO> list(BaListQry baListQry);
    
    public Response addBa(BaAddCmd baAddCmd);

    public Response deleteBa(BaDeleteCmd baDeleteCmd);

    public Response updateBa(BaUpdateCmd baUpdateCmd);

    public Response partialUpdateBa(BaUpdateCmd baUpdateCmd);

}
