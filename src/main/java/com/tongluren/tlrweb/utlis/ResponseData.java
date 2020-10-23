package com.tongluren.tlrweb.utlis;

import lombok.AllArgsConstructor;

/**
 * @Description detail
 * Created by Hwhhhh on 2020/10/23 15:24
 */

@AllArgsConstructor
public class ResponseData {
    private ResponseCode code;
    private Object data;

    public ResponseData(ResponseCode responseCode) {
        this.code = responseCode;
    }

    @AllArgsConstructor
    private enum  ResponseCode {
        SUCCESS(200, "请求成功！"),
        BAD_REQUEST(400, "错误的请求！"),
        SERVER_ERROR(500, "服务器出错！");
        int code;
        String msg;
    }
}
