package com.cc.mblog.constants;

/**
 * Created by chenchao on 2017/9/21.
 */
public enum ResultCode {
    NORMAL("0","正常",0),
    FAILURE("1","失败",0),
    SYSTEM_ERROR("3","系统错误！",1),
    USERNAME_AND_PASSWORD_ERROR("4","用户名或者密码错误！",0)
    ;

    private String code;
    private String msg;
    private int type; //type: (1: 系统类型错误  0：逻辑上面的错误提示)

    ResultCode(String code, String msg, int type) {
        this.code = code;
        this.msg = msg;
        this.type = type;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
