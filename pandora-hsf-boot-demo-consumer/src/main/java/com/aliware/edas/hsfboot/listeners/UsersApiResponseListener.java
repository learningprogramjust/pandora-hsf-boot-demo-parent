package com.aliware.edas.hsfboot.listeners;

import com.alibaba.boot.hsf.annotation.AsyncOn;
import com.aliware.edas.hsfboot.api.UsersApi;
import com.aliware.edas.hsfboot.api.VersionInfoApi;
import com.taobao.hsf.exception.HSFException;
import com.taobao.hsf.tbremoting.invoke.HSFResponseCallback;

/**
 * @author Hofoo
 * @since 2017-12-05 18:38
 */
@AsyncOn(interfaceName=UsersApi.class,methodName="getNameByUserId")
public class UsersApiResponseListener implements HSFResponseCallback {

    public UsersApiResponseListener(){
        System.out.println("UsersApiResponseListener");
    }

    @Override
    public void onAppException(Throwable throwable) {
        System.out.println("onAppException");
    }

    @Override
    public void onAppResponse(Object o) {
        System.out.println("onAppResponse");

    }

    @Override
    public void onHSFException(HSFException e) {
        System.out.println("HSFException");

    }
}
