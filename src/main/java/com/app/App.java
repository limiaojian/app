package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 此处@SpringBootApplication注解包含了@ComponentScan注解
 * 需要将本启动类放在包的根目录下，即和controller,service,dao包在同一层
 */
@SpringBootApplication
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
