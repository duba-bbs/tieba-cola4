# 度度贴吧

COLA 架构太难驾驭，放弃！！！

请跳转[https://github.com/dudu-tieba/tieba](https://github.com/dudu-tieba/tieba)。
## COLA目录

|    层次    |    包名     |                功能                 | 必选 |
| :--------: | :---------: | :---------------------------------: | :--: |
| Adapter 层 |     web     |      处理页面请求的 Controller      |  否  |
| Adapter 层 |   mobile    |          处理手机端的适配           |  否  |
| Adapter 层 |     wap     |          处理无线端的适配           |  否  |
|   App 层   |  executor   | 处理 request，包括 command 和 query |  是  |
|   App 层   |  consumer   |          处理外部 message           |  否  |
|   App 层   |  scheduler  |            处理定时任务             |  否  |
| Domain 层  |    model    |       领域模型 domain entity        |  否  |
| Domain 层  |   ability   |    领域能力，包括 DomainService     |  否  |
| Domain 层  |   gateway   |         领域网关，解耦利器          |  是  |
|  Infra 层  | gatewayimpl |              网关实现               |  否  |
|  Infra 层  |   mapper    |          ibatis 数据库映射          |  否  |
|  Infra 层  |   config    |              配置信息               |  否  |
| Client SDK |     api     |         服务对外透出的 API          |  是  |
| Client SDK |     dto     |           服务对外的 DTO            |  是  |

## 数据实体的转变

> COLA 是阿里的，阿里对数据模型的称呼和社区有偏差，要注意甄别。

**存储时**，外部的 DTO/VO/CO 在 app 层的 executor 中经过`convertor.toDomainEntity`转变为领域模型(放在`domain/model`)，领域模型除了字段可以有其他逻辑代码来计算数据，这是和 DTO 的不同之处，接着在 infrastructure 层的 gatewayimpl 中再将领域模型通过`convertor.toDataObject`转变成 DO(特指库表映射对象)，最后通过 DAO 接口(XXXMapper.java)持久化 DO。

**查询时**使用 Qry 对象接受查询参数，接着在 app 层中，可以选择经过 domain 层加工（即在 app 层调用 gateway），或者直接调用 infrastructure 层的 XXXMapper。

总结来看，domain 层只是对于复杂业务和数据结构的再分层，对于简单的 CRUD 是可以绕过 domain 层，直接在 app 层的 executor 中调用 infrastructure 层的 DAO 接口。可以参考 COLA 作者的原话[对于 domain，app，infra 的疑问](https://github.com/alibaba/COLA/issues/130)。

COLA 架构中，有 3 种数据结构：

1. client 层的 VO/CO/Qry/DTO
2. domain 层的 domain entity
3. infrastructure 层的 DO

要注意它们之间的转换。关联一个问题[infrastructure 中多个查询参数该怎么封装](https://github.com/alibaba/COLA/issues/177)。

infrastructure 层目前来看是不依赖 client 层的。

## 待完善部分

- HikariCP 数据库连接池
- 升级成 mybatis-plus
- 库表实体自动生成
- CQRS — Command Query Responsibility Segregation，故名思义是将 command 与 query 分离的一种模式。
- GraphQL 解决 RESTful 多参数查询问题

## Q&A

- application.properties 为什么没有指定 mybatis 的 mapper 路径

因为在 Application.java 中定义了`@MapperScan("com.tingyu.tieba.mappers")`自动扫描。

- DTO/Domain Entity/DO 之间的字段差异，比如 creator 字段应该在哪个阶段注入

- @RequestBody null

仔细检查字段名称是否正确

- Error setting non null for parameter #1 with JdbcType null

Caused by: org.apache.ibatis.type.TypeException: Could not set parameters for mapping: ParameterMapping{property='baName', mode=IN, javaType=class java.lang.String, jdbcType=null, numericScale=null, resultMapId='null', jdbcTypeName='null', expression='null'}. Cause: org.apache.ibatis.type.TypeException: Error setting non null for parameter #1 with JdbcType null . Try setting a different JdbcType for this parameter or a different configuration property. Cause: java.sql.SQLException: Parameter index out of range (1 > number of parameters, which is 0).

把`ba_name like '#{baName}%'`改为`ba_name like concat(#{baName}, '%')`
