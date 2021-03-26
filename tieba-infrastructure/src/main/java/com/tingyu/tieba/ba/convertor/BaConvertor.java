package com.tingyu.tieba.ba.convertor;

import com.tingyu.tieba.ba.dataobject.BaDO;
import com.tingyu.tieba.ba.dto.data.BaDTO;
import com.tingyu.tieba.domain.ba.model.BaEntity;
import org.springframework.beans.BeanUtils;

public class BaConvertor{

    public static BaEntity toDomainEntity(BaDO baDO){
        BaEntity ba = new BaEntity();
        BeanUtils.copyProperties(baDO, ba);
        return ba;
    }

    public static BaEntity toDomainEntity(BaDTO baDTO){
        BaEntity ba = new BaEntity();
        BeanUtils.copyProperties(baDTO, ba);
        return ba;
    }

    public static BaDO toDataObject(BaEntity ba){
        BaDO baDO = new BaDO();
        BeanUtils.copyProperties(ba, baDO);
        return baDO;
    }
}
