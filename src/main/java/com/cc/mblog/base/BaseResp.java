package com.cc.mblog.base;

import com.cc.mblog.constants.ResultCode;

import java.io.Serializable;

/**
 * Created by chenchao on 2017/9/21.
 */
public class BaseResp<T> implements Serializable {
    private T result;
    private String code = "0";
    private String message;
    private int errorType;

    public BaseResp() {
        this.code = ResultCode.NORMAL.getCode();
        this.message = ResultCode.NORMAL.getMsg();
    }

    public BaseResp(T result) {
        this.message = ResultCode.NORMAL.getMsg();
        this.code = ResultCode.NORMAL.getCode();
        this.result = result;
    }

    public BaseResp(ResultCode resultCode){
        if (resultCode == null){
            this.code = ResultCode.SYSTEM_ERROR.getCode();
            this.message = ResultCode.SYSTEM_ERROR.getMsg();
        }else {
            this.code = resultCode.getCode();
            this.message = resultCode.getMsg();
        }
    }

    public static BaseResp create(ResultCode resultCode){
        return new BaseResp(resultCode);
    }

    public static BaseResp create(Object result){
        return new BaseResp(result);
    }

    public static BaseResp create() {
        return new BaseResp();
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getErrorType() {
        return errorType;
    }

    public void setErrorType(int errorType) {
        this.errorType = errorType;
    }
}
