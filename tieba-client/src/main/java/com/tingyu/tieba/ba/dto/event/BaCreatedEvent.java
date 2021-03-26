package com.tingyu.tieba.ba.dto.event;

import static com.tingyu.tieba.ba.dto.event.DomainEventConstant.BA_CREATED_TOPIC;
import lombok.Data;

@Data
public class BaCreatedEvent{

    private String baId;
}
