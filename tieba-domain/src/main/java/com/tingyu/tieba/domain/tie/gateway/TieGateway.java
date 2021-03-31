package com.tingyu.tieba.domain.tie.gateway;

import com.tingyu.tieba.domain.tie.model.Tie;

public interface TieGateway {
    public Tie getTieById(String tieId);
}
