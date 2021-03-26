package com.tingyu.tieba.tie.convertor;

import com.tingyu.tieba.domain.tie.model.Tie;
import com.tingyu.tieba.tie.dataobject.TieDO;

import org.springframework.beans.BeanUtils;

public class TieConvertor{

    public static Tie toDomainEntity(TieDO tieDO){
        Tie tie = new Tie();
        BeanUtils.copyProperties(tieDO, tie);
        return tie;
    }
}
