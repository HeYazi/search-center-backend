# SpringBoot 项目初始模板

基于 Java SpringBoot 的项目初始模板，整合了常用框架和主流业务的示例代码。

[toc]

## 模板特点

### 主流框架 & 特性

- Spring Boot 2.7.x
- Spring MVC
- MyBatis + MyBatis Plus 数据访问（开启分页）
- Spring Boot 调试工具和项目处理器
- Spring AOP 切面编程
- Spring 事务注解
- Logback 日志框架

### 数据存储

- MySQL 数据库
- Redis 内存数据库

### 工具类

- Hutool 工具库
- Apache Commons Lang3 工具类
- Lombok 注解

### 业务特性

- 全局异常处理器
- 自定义错误码
- 封装通用响应类
- Swagger + Knife4j 接口文档
- 自定义权限注解 + 全局校验
- 日志自定义存储


## 业务功能

- 用户登录、注册、注销、更新、检索、权限管理
- 管理员对数据新增、删除、修改、查询


### 架构设计

- 合理分层

### 使用前提
- 修改 src/resource/logback-application.xml 配置文件中的文件保存信息
- 修改 src/resource/application.yml 配置文件中的数据库信息、redis 信息和端口号