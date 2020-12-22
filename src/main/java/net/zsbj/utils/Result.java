package net.zsbj.utils;

import lombok.Data;

import java.io.Serializable;


@Data
public class Result implements Serializable {

    private Integer code;
    private String message;
    private Object data;

    public Result() {

    }

    public Result(ResultCode resultCode, Object data) {
        this.code = resultCode.getCode();
        this.message = resultCode.getMessage();
        this.data = data;
    }

    public static Result success(Object data) {
        Result result = new Result();
        result.code = ResultCode.SUCCESS.getCode();
        result.message = ResultCode.SUCCESS.getMessage();
        result.data = data;
        return result;
    }
}

