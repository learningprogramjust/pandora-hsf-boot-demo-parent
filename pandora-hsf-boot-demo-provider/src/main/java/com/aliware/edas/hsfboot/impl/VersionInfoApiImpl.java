package com.aliware.edas.hsfboot.impl;

import com.aliware.edas.hsfboot.api.VersionInfoApi;
import com.aliware.edas.hsfboot.domain.VersionInfo;
import org.springframework.stereotype.Service;

@Service("versionInfoApiImpl")
public class VersionInfoApiImpl implements VersionInfoApi<VersionInfo> {

	@Override
	public String getVersionInfo() {
		return "V1.0.0";
	}

	@Override
	public void updateVersionInfo(VersionInfo info) {
		if (info != null) {
			// 仅仅为了测试，打印一下
			System.out.println(info.toString());
		} else {
			System.err.println("err...");
		}

	}

	@Override
	public int countVersionInfo() {
		return 18;
	}

}
