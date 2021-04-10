package com.tingyu.tieba.user.dto.query;

import java.math.BigInteger;

import com.alibaba.cola.dto.PageQuery;
import lombok.Data;

@Data
public class UserListQry extends PageQuery {

   private BigInteger id;
   private String userName;
   private String nickName;
   private String userType;
   private String sex;
}
