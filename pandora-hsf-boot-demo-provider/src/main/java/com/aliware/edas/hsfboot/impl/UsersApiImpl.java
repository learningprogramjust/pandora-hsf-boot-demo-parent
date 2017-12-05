package com.aliware.edas.hsfboot.impl;

import com.alibaba.boot.hsf.annotation.HSFProvider;

import com.aliware.edas.hsfboot.api.UsersApi;

@HSFProvider(serviceInterface = UsersApi.class)
public class UsersApiImpl implements UsersApi {

	@Override
	public String getNameByUserId(int id) {
		String un = "test-" + id;
		return un;
	}

}
