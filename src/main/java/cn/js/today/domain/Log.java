package cn.js.today.domain;

import java.util.Date;

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
public class Log {

    // 日志类型（access：接入日志；update：修改日志；select：查询日志；loginLogout：登录登出；）
    public static final String TYPE_ACCESS = "access";
    public static final String TYPE_UPDATE = "update";
    public static final String TYPE_SELECT = "select";
    public static final String TYPE_LOGIN_LOGOUT = "loginLogout";

    private Long id;			    // 日志编码
    private String logType;			// 日志类型
    private String logTitle;		// 日志标题
    private String requestUri;		// 请求URI
    private String requestMethod;	// 操作方式
    private String requestParams;	// 操作提交的数据
    private String bizKey;			// 业务主键
    private String bizType;			// 业务类型
    private String remoteAddr;		// 操作IP地址
    private String serverAddr;		// 请求服务器地址
    private String isException;		// 是否有异常
    private String exceptionInfo;	// 异常信息
    private String userAgent;		// 用户代理
    private String deviceName;		// 设备名称/操作系统
    private String browserName;		// 浏览器名称
    private Long executeTime;		// 执行时间

    private String createBy;		// 创建者
    private String createByName;		// 创建者名称
    private Date createDate;		// 创建时间



}
