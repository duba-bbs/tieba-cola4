package com.tingyu.tieba.ba.converter;

import com.tingyu.tieba.ba.dataobject.BaDO;
import com.tingyu.tieba.ba.dto.data.BaDTO;
import com.tingyu.tieba.ba.dto.query.BaListQry;
import com.tingyu.tieba.domain.ba.model.BaEntity;
import org.springframework.beans.BeanUtils;

public class AppBaConverter {

    public static BaEntity toDomainEntity(BaDTO baDTO) {
        BaEntity ba = new BaEntity();
        BeanUtils.copyProperties(baDTO, ba);
        return ba;
    }

    public static BaEntity toDomainEntity(BaListQry qry) {
        BaEntity ba = new BaEntity();
        BeanUtils.copyProperties(qry, ba);
        return ba;
    }

    public static BaDO toDataObject(BaDTO baDTO) {
        BaDO baDO = new BaDO();
        BeanUtils.copyProperties(baDTO, baDO);
        return baDO;
    }

    public static BaDO toDataObject(BaListQry qry) {
        BaDO baDO = new BaDO();
        BeanUtils.copyProperties(qry, baDO);
        return baDO;
    }

    public static BaDTO toClientObject(BaDO baDO) {
        BaDTO baDTO = new BaDTO();
        BeanUtils.copyProperties(baDO, baDTO);
        return baDTO;
    }

    public static BaDTO toClientObject(BaEntity baEntity) {
        BaDTO baDTO = new BaDTO();
        BeanUtils.copyProperties(baEntity, baDTO);
        return baDTO;
    }
}
