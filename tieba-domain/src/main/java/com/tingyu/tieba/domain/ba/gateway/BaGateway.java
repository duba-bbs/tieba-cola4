package com.tingyu.tieba.domain.ba.gateway;

import java.math.BigInteger;
import com.tingyu.tieba.domain.ba.model.BaEntity;

public interface BaGateway {

    public void create(BaEntity ba);

    public void update(BaEntity ba);

    public void delete(BigInteger id);
}
