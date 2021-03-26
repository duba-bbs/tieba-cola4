package com.tingyu.tieba.ba.convertor;

import com.tingyu.tieba.ba.dataobject.BaDO;
import com.tingyu.tieba.domain.ba.model.Ba;
import org.springframework.beans.BeanUtils;

public class BaConvertor{

    public static Ba toDomainEntity(BaDO baDO){
        Ba ba = new Ba();
        BeanUtils.copyProperties(baDO, ba);
        return ba;
    }
}
