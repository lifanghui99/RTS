package com.cneop.rts.Aplication;

import android.app.Application;

/**
 * Created by Administrator on 2016/12/22 0022.
 */
public class GlobalParas extends Application {
    private static GlobalParas sAppContext = null;

    private String userName; // 用户名
    private String userNo; // 用户工号
    private String version; // 程序版本号
    private String deviceId = ""; // 设备编号




    public static GlobalParas getGlobalParas(){
        if (sAppContext == null) {
            sAppContext = new GlobalParas();
        }
        return sAppContext;
    }
    public static GlobalParas getAppContext() {
        return getGlobalParas();
    }


    /**
     * @return 获得用户名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName 设置用户名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return 获得用户工号
     */
    public String getUserNo() {
        return userNo;
    }

    /**
     * @param userNo 设置用户工号
     */
    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    /**
     * @return 获得程序版本号
     */
    public String getVersion() {
        return version;
    }

    /** 设置程序版本号
     * @param version 版本号
     */
    public void setVersion(String version) {
        this.version = version;
    }


    /**
     * @return 获得设备IMEI
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * @param deviceId 设置设备IMEI
     */
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }



}
