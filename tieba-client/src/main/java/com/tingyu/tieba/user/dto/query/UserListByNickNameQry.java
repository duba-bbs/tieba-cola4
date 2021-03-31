package com.tingyu.tieba.user.dto.query;

import com.alibaba.cola.dto.Query;
import lombok.Data;

@Data
public class UserListByNickNameQry extends Query{
   private String nickName;
}
