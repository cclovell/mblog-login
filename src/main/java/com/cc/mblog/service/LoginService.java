package com.cc.mblog.service;


import com.cc.mblog.base.BaseReq;
import com.cc.mblog.base.BaseResp;

/**
 * Created by chenchao on 2017/9/18.
 */

public interface LoginService {
    String test();

    BaseResp login(BaseReq baseReq);
}
