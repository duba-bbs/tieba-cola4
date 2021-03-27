package com.tingyu.tieba.user.dataobject;

import java.math.BigInteger;
import java.time.LocalDateTime;

import lombok.Data;

/**
 * <p>
 * 用户信息表
 * </p>
 *
 * @author tingyu
 * @since 2021-03-25
 */
@Data
public class UserDO{

  private BigInteger id;
  /**
   * 登录账号
   */
  private String userName;

  /**
   * 用户昵称
   */
  private String nickName;

  /**
   * 用户类型（01超级管理员 02普通用户 03版主 04吧主）
   */
  private String userType;

  /**
   * 用户邮箱
   */
  private String email;

  /**
   * 座右铭
   */
  private String motto;

  /**
   * 手机号码
   */
  private String phonenum;

  /**
   * 用户性别（0男 1女 2未知）
   */
  private String sex;

  /**
   * 头像路径
   */
  private String avatar;

  /**
   * 密码
   */
  private String password;

  /**
   * 盐加密
   */
  private String salt;

  /**
   * 最后登录IP
   */
  private String loginIp;

  /**
   * 帐号状态（0正常 1停用）
   */
  private String status;

  /**
   * 创建者
   */
  private String creator;

  /**
   * 修改人
   */
  private String modifier;

  /**
   * 创建时间
   */
  private LocalDateTime createTime;

  /**
   * 修改时间
   */
  private LocalDateTime modifyTime;

  /**
   * 最后登录时间
   */
  private LocalDateTime loginTime;

  /**
   * 最后更新密码时间
   */
  private LocalDateTime modifyPwdTime;

  /**
   * 备注
   */
  private String remark;

  /**
   * 逻辑删除（y代表已删除 n代表未删除）
   */
  private String isDeleted;
}
