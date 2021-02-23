package com.gushi.multipartserver.model.dto;

/**
 * @author Gushi1912 | gushiyang@sheca.com
 * @version 0.0.1
 * 2021/2/23
 */

/**
 * 返回数据格式
 * @param <T> 泛型，传入的数据类型
 */
public class ResponseDTO<T> {
    private int code = 200;
    private String msg = "成功";
    private T result;

    public static ResponseDTO<?> success() {
        return new ResponseDTO();
    }

    public static <T> ResponseDTO<T> success(T data) {
        ResponseDTO<T> responseDTO = new ResponseDTO<>();
        responseDTO.result = data;
        return responseDTO;
    }

    public static <T> ResponseDTO<T> success(String msg,T result) {
        ResponseDTO<T> responseDTO = new ResponseDTO<>();
        responseDTO.msg = msg;
        responseDTO.result = result;
        return responseDTO;
    }

    public static ResponseDTO<?> error(int code, String msg) {
        ResponseDTO<Object> responseDTO = new ResponseDTO<>();
        responseDTO.code = code;
        responseDTO.msg = msg;
        return responseDTO;
    }

    public static <T> ResponseDTO<T> error(int code, String msg,T result){
        ResponseDTO<T> responseDTO = new ResponseDTO<>();
        responseDTO.code = code;
        responseDTO.msg = msg;
        responseDTO.result = result;
        return responseDTO;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }
}
