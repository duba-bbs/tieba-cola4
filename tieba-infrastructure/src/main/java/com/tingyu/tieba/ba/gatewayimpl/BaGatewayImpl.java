package com.tingyu.tieba.ba.gatewayimpl;

import com.tingyu.tieba.ba.convertor.BaConvertor;
import com.tingyu.tieba.ba.dataobject.BaDO;
import com.tingyu.tieba.ba.mapper.BaMapper;
import com.tingyu.tieba.domain.ba.gateway.BaGateway;
import com.tingyu.tieba.domain.ba.model.Ba;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BaGatewayImpl implements BaGateway {
    @Autowired
    private BaMapper baMapper;

    public Ba getBaById(String baId){
      BaDO baDO = baMapper.getBaById(baId);
      //Convert to Ba
      Ba ba = BaConvertor.toDomainEntity(baDO);
      return ba;
    }
}

