package com.gushi.multiserver.model;

/**
 * @author Gushi1912 | gushiyang@sheca.com
 * @version 0.0.1
 * 2021/2/25
 */
public class ResponseDTO<T> {
    private int code = 200;
    private String msg = "成功";
    private T result;

    public static ResponseDTO<?> success() {
        return new ResponseDTO<>();
    }

    public static <T> ResponseDTO<T> success(T data) {
        ResponseDTO<T> dto = new ResponseDTO<>();
        dto.result = data;
        return dto;
    }

    public static <T> ResponseDTO<T> success(String msg,T data) {
        ResponseDTO<T> dto = new ResponseDTO<>();
        dto.msg = msg;
        dto.result = data;
        return dto;
    }

    public static ResponseDTO<?> error(int code, String msg) {
        ResponseDTO<?> dto = new ResponseDTO<>();
        dto.code = code;
        dto.msg = msg;
        return dto;
    }

    public static <T> ResponseDTO<T> error(int code ,String msg, T data) {
        ResponseDTO<T> dto = new ResponseDTO<>();
        dto.code = code;
        dto.msg = msg;
        dto.result = data;
        return dto;
    }
}
