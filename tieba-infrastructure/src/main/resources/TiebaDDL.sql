-- ----------------------------
-- 用户信息表
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `user_name` varchar(30) NOT NULL COMMENT '登录账号',
  `nick_name` varchar(30) NOT NULL COMMENT '用户昵称',
  `user_type` varchar(2) NOT NULL COMMENT '用户类型（01超级管理员 02普通用户 03吧主）',
  `email` varchar(50) NOT NULL COMMENT '用户邮箱',
  `motto` varchar(200) NOT NULL COMMENT '座右铭',
  `phonenum` varchar(11) NOT NULL COMMENT '手机号码',
  `sex` char(1) NOT NULL COMMENT '用户性别（0男 1女 2未知）',
  `avatar` varchar(100) NOT NULL COMMENT '头像路径',
  `password` varchar(50) NOT NULL COMMENT '密码',
  `salt` varchar(20) NOT NULL COMMENT '盐加密',
  `login_ip` varchar(50) NOT NULL COMMENT '最后登录IP',
  `status` char(1) NOT NULL DEFAULT '0' COMMENT '帐号状态（0正常 1停用）',
  `creator` varchar(30) NOT NULL COMMENT '创建者',
  `modifier` varchar(30) NOT NULL COMMENT '修改人',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `modify_time` datetime NOT NULL COMMENT '修改时间',
  `login_time` datetime NOT NULL COMMENT '最后登录时间',
  `modify_pwd_time` datetime NOT NULL COMMENT '最后更新密码时间',
  `remark` varchar(500) NOT NULL COMMENT '备注',
  `is_deleted` char(1) NOT NULL DEFAULT 'n' COMMENT '逻辑删除（y代表已删除 n代表未删除）',
  PRIMARY KEY (`id`),
  UNIQUE (`user_name`),
  KEY `idx_user_name` (`user_name`)
) ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8mb4 COMMENT='用户信息表';

-- ----------------------------
-- 角色信息表
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `role_name` varchar(30) NOT NULL COMMENT '角色名称',
  `role_key` varchar(100) NOT NULL COMMENT '角色权限字符串',
  `role_sort` int(4) NOT NULL COMMENT '显示顺序',
  `data_scope` char(1) NOT NULL DEFAULT '1' COMMENT '数据范围（1全部数据权限 2自定数据权限）',
  `status` char(1) NOT NULL DEFAULT '0' COMMENT '角色状态（0正常 1停用）',
  `creator` varchar(30) NOT NULL COMMENT '创建者',
  `modifier` varchar(30) NOT NULL COMMENT '修改人',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `modify_time` datetime NOT NULL COMMENT '修改时间',
  `remark` varchar(500) NOT NULL COMMENT '备注',
  `is_deleted` char(1) NOT NULL DEFAULT 'n' COMMENT '逻辑删除（y代表已删除 n代表未删除）',
  PRIMARY KEY (`id`),
  KEY `idx_role_name` (`role_name`)
) ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8mb4 COMMENT='用户信息表';

-- ----------------------------
-- 用户和角色关联表 用户N-1角色
-- ----------------------------
DROP TABLE IF EXISTS sys_user_role;
CREATE TABLE sys_user_role (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `user_id` bigint(20) unsigned NOT NULL COMMENT '用户ID',
  `role_id` bigint(20) unsigned NOT NULL COMMENT '角色ID',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户和角色关联表';

-- ----------------------------
-- 操作日志记录（待定）
-- ----------------------------
-- DROP TABLE IF EXISTS sys_oper_log;
-- CREATE TABLE sys_oper_log (
--   `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
--   `oper_type` int(2) NOT NULL COMMENT '操作类别（0其它 1新增 2修改 3删除）',
--   `title` varchar(100) NOT NULL COMMENT '方法名称',
--   `method` varchar(100) NOT NULL COMMENT '方法名称',
--   `req_method` varchar(10) NOT NULL COMMENT '请求方式',
--   `req_url` varchar(255) NOT NULL COMMENT '请求URL',
--   `req_ip` varchar(50) NOT NULL COMMENT '主机地址',
--   `req_location` varchar(255) NOT NULL COMMENT '操作地点',
--   `req_param` varchar(2000) NOT NULL COMMENT '请求参数',
--   `json_result` varchar(2000) NOT NULL COMMENT '返回参数',
--   `client_type` char(1) NOT NULL COMMENT '终端类型（0其它 1管理后台 2app端 3pc端 4小程序端）',
--   `operator` varchar(50) NOT NULL COMMENT '操作人员',
--   `status` char(1) NOT NULL DEFAULT '0' COMMENT '操作状态（0正常 1异常）',
--   `error_msg` varchar(2000) NOT NULL DEFAULT '0' COMMENT '错误消息',
--   `gmt_operated` datetime NOT NULL COMMENT '操作时间',
--   PRIMARY KEY (`id`)
-- ) ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8mb4 COMMENT='操作日志记录';

-- ----------------------------
-- 字典类型表
-- ----------------------------
DROP TABLE IF EXISTS sys_dict_type;
CREATE TABLE sys_dict_type (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `dict_name` varchar(100) NOT NULL COMMENT '字典名称',
  `dict_type` varchar(100) NOT NULL COMMENT '字典类型',
  `status` char(1) NOT NULL DEFAULT '0' COMMENT '状态（0正常 1停用）',
  `creator` varchar(30) NOT NULL COMMENT '创建者',
  `modifier` varchar(30) NOT NULL COMMENT '修改人',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `modify_time` datetime NOT NULL COMMENT '修改时间',
  `remark` varchar(500) NOT NULL COMMENT '备注',
  PRIMARY KEY (`id`),
  UNIQUE (`dict_type`)
) ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8mb4 COMMENT='字典类型表';

-- ----------------------------
-- 字典数据表
-- ----------------------------
DROP TABLE IF EXISTS sys_dict_data;
CREATE TABLE sys_dict_data (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `dict_sort` int(4) NOT NULL COMMENT '字典排序',
  `dict_label` varchar(100) NOT NULL COMMENT '字典标签',
  `dict_value` varchar(100) NOT NULL COMMENT '字典键值',
  `dict_type` varchar(100) NOT NULL COMMENT '字典类型',
  `css_class` varchar(100) NOT NULL COMMENT '样式属性（其他样式扩展）',
  `list_class` varchar(100) NOT NULL COMMENT '表格回显样式',
  `status` char(1) NOT NULL DEFAULT '0' COMMENT '状态（0正常 1停用）',
  `is_default` char(1) NOT NULL DEFAULT 'n' COMMENT '是否默认（y是 n否）',
  `creator` varchar(30) NOT NULL COMMENT '创建者',
  `modifier` varchar(30) NOT NULL COMMENT '修改人',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `modify_time` datetime NOT NULL COMMENT '修改时间',
  `remark` varchar(500) NOT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8mb4 COMMENT='字典数据表';

-- ----------------------------
-- 系统访问记录
-- ----------------------------
DROP TABLE IF EXISTS sys_login_info;
CREATE TABLE sys_login_info (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `user_name` varchar(50) NOT NULL COMMENT '登录账号',
  `login_ip` varchar(50) NOT NULL COMMENT '登录IP地址',
  `login_location` varchar(255) NOT NULL COMMENT '登录地点',
  `browser` varchar(50) NOT NULL COMMENT '浏览器类型',
  `os` varchar(50) NOT NULL COMMENT '操作系统',
  `status` char(1) NOT NULL DEFAULT '0' COMMENT '登录状态（0成功 1失败）',
  `msg` varchar(255) NOT NULL COMMENT '提示消息',
  `login_time` datetime NOT NULL COMMENT '访问时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8mb4 COMMENT='系统访问记录';

-- ----------------------------
-- 在线用户记录
-- ----------------------------
DROP TABLE IF EXISTS sys_user_online;
CREATE TABLE sys_user_online (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `sessionid` varchar(50) NOT NULL COMMENT '用户会话ID',
  `user_name` varchar(50) NOT NULL COMMENT '登录账号',
  `login_ip` varchar(50) NOT NULL COMMENT '登录IP地址',
  `login_location` varchar(255) NOT NULL COMMENT '登录地点',
  `browser` varchar(50) NOT NULL COMMENT '浏览器类型',
  `os` varchar(50) NOT NULL COMMENT '操作系统',
  `status` char(1) NOT NULL COMMENT '在线状态（0在线 1离线）',
  `create_time` datetime NOT NULL COMMENT 'session创建时间',
  `last_access_time` datetime NOT NULL COMMENT 'session最后访问时间',
  `expired_time` int(5) NOT NULL COMMENT '超时时间，单位为分钟',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='在线用户记录';

-- ----------------------------
-- 吧表
-- ----------------------------
DROP TABLE IF EXISTS sys_ba;
CREATE TABLE sys_ba (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `parent_id` bigint(20) unsigned NOT NULL COMMENT '上级ID，级别是版时为0',
  `level` char(1) NOT NULL COMMENT '级别（0版 1吧）',
  `ba_name` varchar(50) NOT NULL COMMENT '吧名称',
  `description` varchar(200) NOT NULL COMMENT '吧描述',
  `creator` varchar(30) NOT NULL COMMENT '创建者',
  `modifier` varchar(30) NOT NULL COMMENT '修改人',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `modify_time` datetime NOT NULL COMMENT '修改时间',
  `status` char(1) NOT NULL DEFAULT '0' COMMENT '吧状态（0正常 1停用）',
  `remark` varchar(500) NOT NULL COMMENT '备注',
  `is_deleted` char(1) NOT NULL DEFAULT 'n' COMMENT '逻辑删除（y代表已删除 n代表未删除）',
  PRIMARY KEY (`id`),
  UNIQUE (`ba_name`)
) ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8mb4 COMMENT='吧表';

-- ----------------------------
-- 吧主表 吧N-1用户
-- ----------------------------
DROP TABLE IF EXISTS sys_ba_owner;
CREATE TABLE sys_ba_owner (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `ba_id` bigint(20) unsigned NOT NULL COMMENT '吧ID',
  `user_id` bigint(20) unsigned NOT NULL COMMENT '用户ID',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='吧主表';

-- ----------------------------
-- 贴子表
-- ----------------------------
DROP TABLE IF EXISTS sys_tie;
CREATE TABLE sys_tie (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `ba_id` bigint(20) unsigned NOT NULL COMMENT '所属吧',
  `title` varchar(64) NOT NULL COMMENT '贴子标题',
  `content` varchar(500) NOT NULL COMMENT '贴子内容',
  `user_id` bigint(20) unsigned NOT NULL COMMENT '发帖人ID',
  `creator` varchar(30) NOT NULL COMMENT '发帖人',
  `modifier` varchar(30) NOT NULL COMMENT '修改人',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `modify_time` datetime NOT NULL COMMENT '修改时间',
  `view_times` bigint(20) unsigned NOT NULL COMMENT '阅读量',
  `status` char(1) NOT NULL DEFAULT '0' COMMENT '贴子状态（0正常 1停用）',
  `remark` varchar(500) NOT NULL COMMENT '备注',
  `is_top_quality` char(1) NOT NULL DEFAULT 'n' COMMENT '是否精品（y是 n否）',
  `is_deleted` char(1) NOT NULL DEFAULT 'n' COMMENT '逻辑删除（y代表已删除 n代表未删除）',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8mb4 COMMENT='贴子表';

-- ----------------------------
-- 评论表
-- ----------------------------
DROP TABLE IF EXISTS sys_comment;
CREATE TABLE sys_comment (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `tie_id` bigint(20) unsigned NOT NULL COMMENT '所属贴',
  `parent_id` bigint(20) unsigned NOT NULL DEFAULT 0 COMMENT '上级评论，如果是0表示主楼',
  `content` varchar(500) NOT NULL COMMENT '评论内容',
  `user_id` bigint(20) unsigned NOT NULL COMMENT '评论者ID',
  `creator` varchar(30) NOT NULL COMMENT '评论者',
  `modifier` varchar(30) NOT NULL COMMENT '修改人',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `modify_time` datetime NOT NULL COMMENT '修改时间',
  `likes` bigint(20) unsigned NOT NULL COMMENT '点赞数',
  `status` char(1) NOT NULL DEFAULT '0' COMMENT '评论状态（0正常 1停用）',
  `remark` varchar(500) NOT NULL COMMENT '备注',
  `is_deleted` char(1) NOT NULL DEFAULT 'n' COMMENT '逻辑删除（y代表已删除 n代表未删除）',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8mb4 COMMENT='评论表';

-- ----------------------------
-- 用户关系表
-- ----------------------------
DROP TABLE IF EXISTS sys_follow;
CREATE TABLE sys_follow (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `from_id` bigint(20) unsigned NOT NULL COMMENT '用户ID',
  `to_id` bigint(20) unsigned NOT NULL COMMENT '目标ID',
  `rel_type` char(1) NOT NULL DEFAULT '0' COMMENT '关系类型（0关注 1拉黑）',
  `creator` varchar(30) NOT NULL COMMENT '创建者',
  `modifier` varchar(30) NOT NULL COMMENT '修改人',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `modify_time` datetime NOT NULL COMMENT '修改时间',
  `is_deleted` char(1) NOT NULL DEFAULT 'n' COMMENT '逻辑删除（y代表已删除 n代表未删除）',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户关系表';

-- ----------------------------
-- 收藏表
-- ----------------------------
DROP TABLE IF EXISTS sys_follow;
CREATE TABLE sys_follow (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `user_id` bigint(20) unsigned NOT NULL COMMENT '用户ID',
  `favor_id` bigint(20) unsigned NOT NULL COMMENT '收藏实体ID',
  `favor_type` char(1) NOT NULL COMMENT '收藏实体类型（0吧 1贴子）',
  `status` char(1) NOT NULL DEFAULT '0' COMMENT '数据状态（0正常 1停用）',
  `creator` varchar(30) NOT NULL COMMENT '创建者',
  `modifier` varchar(30) NOT NULL COMMENT '修改人',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `modify_time` datetime NOT NULL COMMENT '修改时间',
  `is_deleted` char(1) NOT NULL DEFAULT 'n' COMMENT '逻辑删除（y代表已删除 n代表未删除）',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='收藏表';