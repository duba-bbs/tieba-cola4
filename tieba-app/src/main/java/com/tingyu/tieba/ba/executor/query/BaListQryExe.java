package com.tingyu.tieba.ba.executor.query;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import com.alibaba.cola.dto.PageResponse;
import com.github.pagehelper.PageHelper;
import com.tingyu.tieba.ba.converter.AppBaConverter;
import com.tingyu.tieba.ba.dataobject.BaDO;
import com.tingyu.tieba.ba.dto.data.BaDTO;
import com.tingyu.tieba.ba.dto.query.BaListQry;
import com.tingyu.tieba.mappers.BaMapper;
import org.springframework.stereotype.Component;

@Component
public class BaListQryExe {

    @Resource
    private BaMapper baMapper;

    public PageResponse<BaDTO> execute(BaListQry qry) {
        PageHelper.startPage(qry.getPageIndex(), qry.getPageSize(), qry.getOrderBy());
        List<BaDO> baDOList = baMapper.list(AppBaConverter.toDataObject(qry));
        List<BaDTO> baDTOList = new ArrayList<>();
        baDOList.forEach(baDO -> {
            baDTOList.add(AppBaConverter.toClientObject(baDO));
        });
        if (!baDTOList.isEmpty()) {
            return PageResponse.of(baDTOList, baDTOList.size(), qry.getPageSize(), qry.getPageIndex());
        }
        return PageResponse.of(qry.getPageSize(), qry.getPageIndex());
    }
}
