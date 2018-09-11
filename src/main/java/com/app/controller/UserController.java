package com.app.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

@Api("用户相关API")
@Controller
@RequestMapping("/user")
public class UserController {
	
	@Value("${age}")
	private int age;
	
	@ApiOperation(value="根据用户名查询用户信息",notes="查询数据库中某个用户的信息")
	@ApiImplicitParam(name="name",value="用户名",required=true,dataType="String")
	@ResponseBody
	@RequestMapping("/hello")
	public String hello(String name){
		return "hello," + name + ",your age is " + age;
	}

}
