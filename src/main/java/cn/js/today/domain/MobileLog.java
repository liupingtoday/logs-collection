package cn.js.today.domain;

/**
 * Simple to Introduction
 *
 * @Description: 一句话描述该类的功能
 * @Author: liuping
 * @Since 2019-12-21
 * @UpdateUser: liuping
 * @UpdateDate: 2019-12-21
 * @UpdateRemark: 说明本次修改内容
 * @Version: v1.0
 */
public class MobileLog {

    private String id; //日志编码
    private String errorType;// 1、网络接口；2、播放器;
    private String errorCode;//错误码
    private String msg;//错误描述
    private String url;//接口Url；
    private String playUrl;//播放地址
    private String playType;//播放器类型；
    private String contentId;//播放内容Id
    private String platFormType;//ios or andriod
    private String deviceType;//设备型号，如iphoneX,xiaomi6
    private String systemVersion;//系统版本，如 iOS12，andriod8.0

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getErrorType() {
        return errorType;
    }

    public void setErrorType(String errorType) {
        this.errorType = errorType;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPlayUrl() {
        return playUrl;
    }

    public void setPlayUrl(String playUrl) {
        this.playUrl = playUrl;
    }

    public String getPlayType() {
        return playType;
    }

    public void setPlayType(String playType) {
        this.playType = playType;
    }

    public String getContentId() {
        return contentId;
    }

    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    public String getPlatFormType() {
        return platFormType;
    }

    public void setPlatFormType(String platFormType) {
        this.platFormType = platFormType;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getSystemVersion() {
        return systemVersion;
    }

    public void setSystemVersion(String systemVersion) {
        this.systemVersion = systemVersion;
    }

    @Override
    public String toString() {
        return "MobileLog{" +
            "id='" + id + '\'' +
            ", errorType='" + errorType + '\'' +
            ", errorCode='" + errorCode + '\'' +
            ", msg='" + msg + '\'' +
            ", url='" + url + '\'' +
            ", playUrl='" + playUrl + '\'' +
            ", playType='" + playType + '\'' +
            ", contentId='" + contentId + '\'' +
            ", platFormType='" + platFormType + '\'' +
            ", deviceType='" + deviceType + '\'' +
            ", systemVersion='" + systemVersion + '\'' +
            '}';
    }
}
