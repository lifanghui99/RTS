package com.cneop.rts.startup.model;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;

import com.cneop.rts.Aplication.GlobalParas;
import com.cneop.util.device.Imei;

/**
 * Created by Administrator on 2016/12/22 0022.
 */
public class SystemInitUtil {

    Context context;
    public SystemInitUtil(Context context) {

        this.context = context;
    }
    public void loadSystemInit() {
        // 加载IMEI号;并设置
        String deviceId = Imei.getImei(context);
        GlobalParas.getGlobalParas().setDeviceId(deviceId);
        GlobalParas.getGlobalParas().setVersion(getVersionName());
    }
    // 获得版本号
    private String getVersionName() {
        PackageManager packageManager = context.getPackageManager();
        PackageInfo packInfo;
        String version = "1.0";
        try {
            packInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
            version = packInfo.versionName;
        } catch (PackageManager.NameNotFoundException e) {
            Log.i("获取版本号", e.getMessage());
        }

        return version;
    }

}
