package com.tingyu.tieba.tie.dto.event;

import static com.tingyu.tieba.tie.dto.event.DomainEventConstant.TIE_CREATED_TOPIC;
import lombok.Data;

@Data
public class TieCreatedEvent{

    private String tieId;
}
