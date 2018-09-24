package com.bdt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;


// 开启组建扫描和自动配置, 此注解将Configuration、ComponentScan、EnableAutoConfiguration整合
@SpringBootApplication
@MapperScan("com.bdt.dao")
@EnableScheduling
@EnableCaching
public class DemoApplication {    // 启动程序的引导类
    // 负责启动引导应用程序
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}



