package com.tingyu.tieba.user.dto.event;

import static com.tingyu.tieba.user.dto.event.DomainEventConstant.USER_CREATED_TOPIC;
import lombok.Data;

@Data
public class UserCreatedEvent{

    private String userId;
}
