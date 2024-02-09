package com.deployment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeploymentController {

	@GetMapping("msg")
	public String getMsg() {
		return "helooo world";
	}
}
