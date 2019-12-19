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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogType() {
        return logType;
    }

    public void setLogType(String logType) {
        this.logType = logType;
    }

    public String getLogTitle() {
        return logTitle;
    }

    public void setLogTitle(String logTitle) {
        this.logTitle = logTitle;
    }

    public String getRequestUri() {
        return requestUri;
    }

    public void setRequestUri(String requestUri) {
        this.requestUri = requestUri;
    }

    public String getRequestMethod() {
        return requestMethod;
    }

    public void setRequestMethod(String requestMethod) {
        this.requestMethod = requestMethod;
    }

    public String getRequestParams() {
        return requestParams;
    }

    public void setRequestParams(String requestParams) {
        this.requestParams = requestParams;
    }

    public String getBizKey() {
        return bizKey;
    }

    public void setBizKey(String bizKey) {
        this.bizKey = bizKey;
    }

    public String getBizType() {
        return bizType;
    }

    public void setBizType(String bizType) {
        this.bizType = bizType;
    }

    public String getRemoteAddr() {
        return remoteAddr;
    }

    public void setRemoteAddr(String remoteAddr) {
        this.remoteAddr = remoteAddr;
    }

    public String getServerAddr() {
        return serverAddr;
    }

    public void setServerAddr(String serverAddr) {
        this.serverAddr = serverAddr;
    }

    public String getIsException() {
        return isException;
    }

    public void setIsException(String isException) {
        this.isException = isException;
    }

    public String getExceptionInfo() {
        return exceptionInfo;
    }

    public void setExceptionInfo(String exceptionInfo) {
        this.exceptionInfo = exceptionInfo;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getBrowserName() {
        return browserName;
    }

    public void setBrowserName(String browserName) {
        this.browserName = browserName;
    }

    public Long getExecuteTime() {
        return executeTime;
    }

    public void setExecuteTime(Long executeTime) {
        this.executeTime = executeTime;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getCreateByName() {
        return createByName;
    }

    public void setCreateByName(String createByName) {
        this.createByName = createByName;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "Log{" +
            "id=" + id +
            ", logType='" + logType + '\'' +
            ", logTitle='" + logTitle + '\'' +
            ", requestUri='" + requestUri + '\'' +
            ", requestMethod='" + requestMethod + '\'' +
            ", requestParams='" + requestParams + '\'' +
            ", bizKey='" + bizKey + '\'' +
            ", bizType='" + bizType + '\'' +
            ", remoteAddr='" + remoteAddr + '\'' +
            ", serverAddr='" + serverAddr + '\'' +
            ", isException='" + isException + '\'' +
            ", exceptionInfo='" + exceptionInfo + '\'' +
            ", userAgent='" + userAgent + '\'' +
            ", deviceName='" + deviceName + '\'' +
            ", browserName='" + browserName + '\'' +
            ", executeTime=" + executeTime +
            ", createBy='" + createBy + '\'' +
            ", createByName='" + createByName + '\'' +
            ", createDate=" + createDate +
            '}';
    }
}
