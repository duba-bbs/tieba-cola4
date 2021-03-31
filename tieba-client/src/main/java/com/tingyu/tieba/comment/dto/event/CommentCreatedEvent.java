package com.tingyu.tieba.comment.dto.event;

import static com.tingyu.tieba.comment.dto.event.DomainEventConstant.COMMENT_CREATED_TOPIC;
import lombok.Data;

@Data
public class CommentCreatedEvent{

    private String commentId;
}
