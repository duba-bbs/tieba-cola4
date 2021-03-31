package com.tingyu.tieba.ba.executor.query;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import com.alibaba.cola.dto.MultiResponse;
import com.tingyu.tieba.ba.converter.AppConverter;
import com.tingyu.tieba.ba.dataobject.BaDO;
import com.tingyu.tieba.ba.dto.data.BaDTO;
import com.tingyu.tieba.ba.dto.query.BaListQry;
import com.tingyu.tieba.mappers.BaMapper;
import org.springframework.stereotype.Component;

@Component
public class BaListQryExe{

    @Resource
    private BaMapper baMapper;

    public MultiResponse<BaDTO> execute(BaListQry qry) {
        System.out.println(AppConverter.toDataObject(qry));
        List<BaDO> baDOList = baMapper.list(AppConverter.toDataObject(qry));
        List<BaDTO> baDTOList = new ArrayList<>();
        baDOList.forEach(baDO -> {
            baDTOList.add(AppConverter.toClientObject(baDO));
        });
        return MultiResponse.of(baDTOList);
    }
}
