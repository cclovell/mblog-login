package com.cc.mblog.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.cc.mblog.base.BaseReq;
import com.cc.mblog.base.BaseResp;
import com.cc.mblog.constants.ResultCode;
import org.springframework.util.StringUtils;

/**
 * Created by chenchao on 2017/9/18.
 */
@Service(version = "1.0.0")
public class LoginServiceImpl implements LoginService {
    @Override
    public String test() {
        System.out.println("test");
        return "test";
    }

    @Override
    public BaseResp login(BaseReq baseReq) {
        String userName = baseReq.getUserName();
        String password = baseReq.getPassword();

        if (StringUtils.isEmpty(userName) || StringUtils.isEmpty(password)){
            return  BaseResp.create(ResultCode.USERNAME_AND_PASSWORD_ERROR);
        }

        if (!userName.equals("admin") || !password.equals("123456")){
            return BaseResp.create(ResultCode.USERNAME_AND_PASSWORD_ERROR);
        }

        return BaseResp.create();
    }
}
