package com.wbj.book.common;

import lombok.Data;

import java.io.Serializable;

/**
 * @author bingjie.wang
 * @version 1.0
 * @date 2021/12/2 16:40
 */
@Data
public class Result implements Serializable {
    private static final long serialVersionUID = 5911567422637004013L;
    // 200是正常，非200表示异常
    private int code;
    private String msg;
    private Object data;

    public static Result success(Object data) {
        return success(200, "操作成功", data);
    }

    public static Result success(int code, String msg, Object data) {
        Result r = new Result();
        r.setCode(code);
        r.setMsg(msg);
        r.setData(data);
        return r;
    }

    public static Result fail(String msg) {
        return fail(400, msg, null);
    }

    public static Result fail(String msg, Object data) {
        return fail(400, msg, data);
    }

    public static Result fail(int code, String msg, Object data) {
        Result r = new Result();
        r.setCode(code);
        r.setMsg(msg);
        r.setData(data);
        return r;
    }
}
