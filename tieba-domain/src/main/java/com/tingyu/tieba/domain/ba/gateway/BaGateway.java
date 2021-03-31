package com.tingyu.tieba.domain.ba.gateway;

import java.math.BigInteger;
import java.util.List;

import com.tingyu.tieba.ba.dto.query.BaListQry;
import com.tingyu.tieba.domain.ba.model.BaEntity;

public interface BaGateway {

    public void create(BaEntity ba);

    public void update(BaEntity ba);

    public void delete(BigInteger id);
}
