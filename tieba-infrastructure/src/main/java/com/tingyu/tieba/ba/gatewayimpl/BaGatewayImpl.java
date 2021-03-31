package com.tingyu.tieba.ba.gatewayimpl;

import java.math.BigInteger;

import com.tingyu.tieba.ba.converter.InfraConverter;
import com.tingyu.tieba.domain.ba.gateway.BaGateway;
import com.tingyu.tieba.domain.ba.model.BaEntity;
import com.tingyu.tieba.mappers.BaMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BaGatewayImpl implements BaGateway {
    @Autowired
    private BaMapper baMapper;

    @Override
    public void create(BaEntity ba) {
      baMapper.create(InfraConverter.toDataObject(ba));
    }

    @Override
    public void update(BaEntity ba) {
      baMapper.update(InfraConverter.toDataObject(ba));
    }

    @Override
    public void delete(BigInteger id) {
      baMapper.delete(id);
    }
}

