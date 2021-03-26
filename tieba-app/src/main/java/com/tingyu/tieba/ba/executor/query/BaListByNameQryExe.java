package com.tingyu.tieba.ba.executor.query;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import com.alibaba.cola.dto.MultiResponse;
import com.tingyu.tieba.ba.dto.data.BaDTO;
import com.tingyu.tieba.ba.dto.query.BaListByNameQry;
import com.tingyu.tieba.ba.mapper.BaMapper;
import org.springframework.stereotype.Component;

@Component
public class BaListByNameQryExe{

    @Resource
    private BaMapper baMapper;

    public MultiResponse<BaDTO> execute(BaListByNameQry cmd) {
        List<BaDTO> baDTOList = new ArrayList<>();
        BaDTO baDTO = new BaDTO();
        baDTO.setBaName("NormalName");
        baDTOList.add(baDTO);
        return MultiResponse.of(baDTOList);
    }
}
