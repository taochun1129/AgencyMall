package com.sy.taochun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Import;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
//JPA接口依赖
@EnableJpaRepositories(basePackages = {"com.sy.taochun.mapper"})
//持久化类扫描
@EntityScan(basePackages = {"com.sy.taochun.model"})
//容器启动优先级(可以不加)
//@Order(Ordered.HIGHEST_PRECEDENCE)
//开启注解事务(可以不加)
//@EnableTransactionManagement
//引入子配置项
//@Import(value = {SpringShiroConfig.class,SpringEsConfig.class, InterceptorRules.class})
//扫描ES包
//@EnableElasticsearchRepositories(basePackages= "com.sy.taochun.es")
public class SyshoppingApplication {

    public static void main(String[] args) {
        SpringApplication.run(SyshoppingApplication.class, args);
    }

}
