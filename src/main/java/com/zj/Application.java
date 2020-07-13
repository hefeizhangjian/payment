package com.zj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;
/**
 * @author 张建 119855181@qq.com
 * @date 2020/7/13 10:02
 * @version V1.0
 * @Copyright © 国网安徽省分公司
 * @description: springboot 启动类
 */
@SpringBootApplication
//扫描 mybatis mapper 包路径
@MapperScan(basePackages = "com.zj.mapper")
//扫描 所有需要的包, 包含一些自用的工具类包 所在的路径
@ComponentScan(basePackages= {"com.zj", "org.n3r.idworker"})
//@EnableConfigurationProperties
public class Application {
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
