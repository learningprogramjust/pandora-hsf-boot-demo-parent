package com.aliware.edas.hsfboot.impl;

import org.springframework.stereotype.Service;

import com.aliware.edas.hsfboot.api.ApplicationApi;

@Service("applicationApiImpl")
public class ApplicationApiImpl implements ApplicationApi {

	@Override
	public String getApplicationName() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return "##pandora-hsf-boot-demo-provider";
	}

}
