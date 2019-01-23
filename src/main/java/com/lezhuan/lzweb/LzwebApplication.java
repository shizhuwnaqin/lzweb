package com.lezhuan.lzweb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

@SpringBootApplication
@MapperScan("com.lezhuan.lzweb.mapper")
public class LzwebApplication {

	public static void main(String[] args) {

		SpringApplication.run(LzwebApplication.class, args);
	}
}
