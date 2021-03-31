package com.tingyu.tieba.domain.user.gateway;

import com.tingyu.tieba.domain.user.model.User;

public interface UserGateway {
    public User getUserById(String userId);
}
