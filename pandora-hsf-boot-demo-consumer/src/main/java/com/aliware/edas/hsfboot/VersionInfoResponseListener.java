package com.aliware.edas.hsfboot;

import com.alibaba.boot.hsf.annotation.AsyncOn;
import com.aliware.edas.hsfboot.api.VersionInfoApi;
import com.taobao.hsf.exception.HSFException;
import com.taobao.hsf.tbremoting.invoke.HSFResponseCallback;

/**
 * @author Hofoo
 * @since 2017-12-05 18:38
 */
@AsyncOn(interfaceName=VersionInfoApi.class,methodName="getVersionInfo")
public class VersionInfoResponseListener implements HSFResponseCallback {

    public VersionInfoResponseListener(){
        System.out.println("xxxxxxx");
    }

    @Override
    public void onAppException(Throwable throwable) {
        System.out.println("1111");
    }

    @Override
    public void onAppResponse(Object o) {
        System.out.println("2222");

    }

    @Override
    public void onHSFException(HSFException e) {
        System.out.println("3333");

    }
}
