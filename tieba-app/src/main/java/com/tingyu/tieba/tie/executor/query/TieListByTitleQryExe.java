package com.tingyu.tieba.tie.executor.query;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.cola.dto.MultiResponse;
import com.tingyu.tieba.tie.dto.data.TieDTO;
import com.tingyu.tieba.tie.dto.query.TieListByTitleQry;

import org.springframework.stereotype.Component;

@Component
public class TieListByTitleQryExe{
    public MultiResponse<TieDTO> execute(TieListByTitleQry cmd) {
        List<TieDTO> tieDTOList = new ArrayList<>();
        TieDTO tieDTO = new TieDTO();
        tieDTO.setTitle("NormalTitle");
        tieDTOList.add(tieDTO);
        return MultiResponse.of(tieDTOList);
    }
}
