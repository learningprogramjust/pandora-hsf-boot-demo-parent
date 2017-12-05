package com.aliware.edas.hsfboot.controller;

import com.alibaba.boot.hsf.annotation.HSFConsumer;

import com.aliware.edas.hsfboot.api.ApplicationApi;
import com.aliware.edas.hsfboot.api.UsersApi;
import com.aliware.edas.hsfboot.api.VersionInfoApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("demo")
public class DemoController {

	@Autowired
	private VersionInfoApi<?> versionInfoApi;

	@Autowired
	private ApplicationApi applicationApi;
	
	@HSFConsumer(serviceGroup="HSF",serviceVersion="1.0.0")
	private UsersApi usersApi;

	@RequestMapping(method = RequestMethod.GET)
	public String testVersion() {
		int v = versionInfoApi.countVersionInfo();
		return "version:" + v;
	}

	@RequestMapping(value="user",method = RequestMethod.GET)
	public String testName() {
		return usersApi.getNameByUserId(10);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String testApp() {
		String appName = applicationApi.getApplicationName();
		return appName;
	}

}
