package com.tingyu.tieba.ba.converter;

import com.tingyu.tieba.ba.dataobject.BaDO;
import com.tingyu.tieba.domain.ba.model.BaEntity;
import org.springframework.beans.BeanUtils;

public class InfraBaConverter {

    public static BaEntity toDomainEntity(BaDO baDO) {
        BaEntity ba = new BaEntity();
        BeanUtils.copyProperties(baDO, ba);
        return ba;
    }

    public static BaDO toDataObject(BaEntity ba) {
        BaDO baDO = new BaDO();
        BeanUtils.copyProperties(ba, baDO);
        return baDO;
    }
}
