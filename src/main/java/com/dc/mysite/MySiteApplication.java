package com.dc.mysite;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j  // 日志
@MapperScan(value = "com.dc.**.mapper")   // Mapper扫描
public class MySiteApplication {

    public static void main(String[] args) {

        SpringApplication.run(MySiteApplication.class, args);

        log.info("DemoApplication start!!!");

    }

}
