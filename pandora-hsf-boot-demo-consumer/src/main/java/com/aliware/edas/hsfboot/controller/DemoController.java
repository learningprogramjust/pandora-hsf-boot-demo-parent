package com.aliware.edas.hsfboot.controller;

import com.aliware.edas.hsfboot.api.ApplicationApi;
import com.aliware.edas.hsfboot.api.UsersApi;
import com.aliware.edas.hsfboot.api.VersionInfoApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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

    @Autowired
    private UsersApi usersApi;

    @RequestMapping(method = RequestMethod.GET)
    public String testVersion() {
        int v = versionInfoApi.countVersionInfo();
        return "version:" + v;
    }

    /**
     * annotation
     * @return
     */
    @GetMapping("user")
    public String testName() {
        return usersApi.getNameByUserId(10);
    }

    @GetMapping("app")
    public String getApplicationName() {
        String appName = applicationApi.getApplicationName();
        return appName;
    }

    @GetMapping("version")
    public String getVersionInfo() {
        String version = versionInfoApi.getVersionInfo();
        System.out.println("version from consumer:" + version);
        return version;
    }

}
