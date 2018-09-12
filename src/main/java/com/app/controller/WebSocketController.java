package com.app.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebSocketController {

	@ResponseBody
	@MessageMapping("/welcome")
	@SendTo("/topic/getResponse")
	public String say(String msg){
		System.out.println(msg);
		return "welcome," + msg;
	}
}
