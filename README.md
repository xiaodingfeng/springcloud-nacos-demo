## Spring Cloud Nacos Demo
### 环境
> jdk11+


### nacos-consume
> 消费者服务，通过feign 调用nacos-server

### nacos-server
> 服务

### nacos-gateway
> 网关


Data ID:  service

```yaml
spring:
  cloud:
    nacos:
      discovery:
        server-addr: 127.0.0.1:8848
```

Data ID:  gateway.yaml

```yaml
spring:
  cloud: #配置SpringCloudGateway的路由
    nacos:
      discovery:
        server-addr: 127.0.0.1:8848
    gateway:
      discovery:
        locator:
          enabled: true
      routes:
        # 路由的ID，没有固定规则，但要求唯一，建议配合服务名
        - id: nacos-consume
          # 匹配后提供服务的路由地址
          uri: lb://nacos-consume
          # 断言，路径相匹配的进行路由
          predicates:
            - Path=/consume/**
```