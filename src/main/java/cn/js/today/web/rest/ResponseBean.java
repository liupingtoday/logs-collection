package cn.js.today.web.rest;

import java.util.Map;

/**
 * Simple to Introduction
 *
 * @Description: 一句话描述该类的功能
 * @Author: liuping
 * @Since 2019-12-18
 * @UpdateUser: liuping
 * @UpdateDate: 2019-12-18
 * @UpdateRemark: 说明本次修改内容
 * @Version: v1.0
 */
public class ResponseBean {

    /**
     *  返回响应码
     */
    private String  code;

    /**
     *  返回消息
     */
    private String  msg;

    /**
     *  数据信息详情
     */
    private Map<String, Object> data;


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

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }
}
