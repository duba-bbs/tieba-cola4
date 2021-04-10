package com.tingyu.tieba.domain.user.gateway;

import java.math.BigInteger;

import com.tingyu.tieba.domain.user.model.UserEntity;

public interface UserGateway {
    public void create(UserEntity user);

    public void update(UserEntity user);

    public void delete(BigInteger id);
}
