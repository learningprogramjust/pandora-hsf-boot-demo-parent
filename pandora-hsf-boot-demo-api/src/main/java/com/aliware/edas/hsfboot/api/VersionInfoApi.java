package com.aliware.edas.hsfboot.api;

import com.aliware.edas.hsfboot.domain.VersionInfo;

/**
 * 一个测试Api接口，用于做Spring Boot+Pandora Boot测试
 * @author Jason
 *
 */
public interface VersionInfoApi<T> {
	
	/**
	 * 获取版本信息
	 * @return
	 */
	public String getVersionInfo();
	
	/**
	 * 更新版本信息
	 * @param info
	 */
	public void updateVersionInfo(VersionInfo info); 
	
	/**
	 * 统计存在多少个版本信息
	 * @return
	 */
	public int countVersionInfo();
}
