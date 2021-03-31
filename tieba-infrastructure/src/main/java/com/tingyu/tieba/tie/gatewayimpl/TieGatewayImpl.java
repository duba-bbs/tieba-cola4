package com.tingyu.tieba.tie.gatewayimpl;

import com.tingyu.tieba.domain.tie.gateway.TieGateway;
import com.tingyu.tieba.domain.tie.model.Tie;
import com.tingyu.tieba.mappers.TieMapper;
import com.tingyu.tieba.tie.convertor.TieConvertor;
import com.tingyu.tieba.tie.dataobject.TieDO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TieGatewayImpl implements TieGateway {
    @Autowired
    private TieMapper tieMapper;

    public Tie getTieById(String tieId){
      TieDO tieDO = tieMapper.getTieById(tieId);
      //Convert to Tie
      Tie tie = TieConvertor.toDomainEntity(tieDO);
      return tie;
    }
}

