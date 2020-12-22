package net.zsbj.utils;

public enum ResultCode {

    SUCCESS(200, "success"),
    FAILURE(201, "");

    private Integer code;
    private String message;

    ResultCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
    public Integer getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }
}
