package com.tingyu.tieba.ba.executor.query;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import com.alibaba.cola.dto.MultiResponse;
import com.tingyu.tieba.ba.dataobject.BaDO;
import com.tingyu.tieba.ba.dto.data.BaDTO;
import com.tingyu.tieba.ba.dto.query.BaListQry;
import com.tingyu.tieba.mappers.BaMapper;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class BaListQryExe{

    @Resource
    private BaMapper baMapper;

    public MultiResponse<BaDTO> execute(BaListQry cmd) {
        List<BaDO> baDOList = baMapper.list(cmd);
        List<BaDTO> baDTOList = new ArrayList<>();
        baDOList.forEach(baDO -> {
            BaDTO baDTO = new BaDTO();
            BeanUtils.copyProperties(baDO, baDTO);
            baDTOList.add(baDTO);
        });
        return MultiResponse.of(baDTOList);
    }
}
