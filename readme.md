# 简介
该文档记录学习《微服务架构实战 第二版》的一些知识点。

# 1、微服务架构概述
大概讲述了微服务与单体架构的区别，以及为什么选择微服务，微服务有哪些特点。

微服务的最佳实现是什么？

# 2、微服务开发框架——Spring Cloud

# 3、开始使用Spring Cloud实战微服务
编写了一个传统的分模块开发的项目，电影案例。

# 4、微服务注册与发现
Eureka Server

* 微服务发现的简介
* Eureka原理
* 编写Eureka Service
* 将微服务注册到Eureka Server上
* Eureka Server高可用
* 用户认证：注意新老版本的Security之间的区别
* Eureka Server的REST端点
* Eureka的自我保护模式
* 多网卡环境下IP的选择
* Eureka监控检查
* 排除Jersey依赖

# 5、使用Ribbon实现客户端侧负载均衡
1、Ribbon简介：为Ribbon配置服务提供者地址列表后，Ribbon就可给予某种负载均衡算法，自动地帮助服务消费者去请求。

2、为消费者整合Ribbon：其中，在movie-service-ticket-ribbon包中加入ribbon依赖，并在template bean上添加相关配置，最后进行user的服务调用。
* user服务开启两个端口，这样可以测试负载均衡能力；
* 最后可以看到输出如下
```
2019-09-24 10:47:37.695  INFO 5660 --- [nio-8800-exec-4] c.j.m.ticket.web.TicketController        : 192.168.30.191:8702:192.168.30.191:8702
2019-09-24 10:47:39.589  INFO 5660 --- [nio-8800-exec-6] c.j.m.ticket.web.TicketController        : 192.168.30.191:8701:192.168.30.191:8701
2019-09-24 10:47:39.751  INFO 5660 --- [nio-8800-exec-7] c.j.m.ticket.web.TicketController        : 192.168.30.191:8702:192.168.30.191:8702
2019-09-24 10:47:39.915  INFO 5660 --- [io-8800-exec-10] c.j.m.ticket.web.TicketController        : 192.168.30.191:8701:192.168.30.191:8701
2019-09-24 10:47:40.084  INFO 5660 --- [nio-8800-exec-3] c.j.m.ticket.web.TicketController        : 192.168.30.191:8702:192.168.30.191:8702
2019-09-24 10:47:40.207  INFO 5660 --- [nio-8800-exec-5] c.j.m.ticket.web.TicketController        : 192.168.30.191:8701:192.168.30.191:8701
...
```
可以看到peer1、peer2都进行了调用。

3、Ribbon配置自定义
* 使用java代码自定义Ribbon配置
* 使用属性自定义配置Ribbon

4、脱离Eureka使用Ribbon

5、饥饿加载

# 6、使用Feign实现自定义声明式REST调用
1、 Feign简介 

2、为服务消费者整合Feign
* 加依赖 spring-cloud-starter-openfeign；
* 创建Feign接口，添加`@FeignClient`注解；
* 修改启动类，添加`@EnableFeignClients`注解；

3、自定义Feign配置
* 使用Java代码自定义Feign配置
* 使用属性自定义Feign配置

4、手动创建Feign
* 修改用户微服务
* 修改电影微服务

5、Feign对继承的支持

6、Feign对压缩的支持

7、Feign的日志
* 编码方式设置日志级别
* 使用属性配置方式设置日志级别

8、使用Feign构造多参数请求
* Get请求多参数：参数一一展现、以及Map类型接收
* Post请求包含多参数：@RequestBody

# 7、使用Hystrix实现微服务的容错处理
1、实现容错的手段
* 雪崩效应
* 如何容错
    * 为网络请求设置超时
    * 使用断路器模式

2、使用Hystrix实现容错
* hystrix简介
    * 包裹请求
    * 跳闸机制
    * 资源隔离
    * 监控
    * 回退机制
* 通用方式整合Hystrix
 






