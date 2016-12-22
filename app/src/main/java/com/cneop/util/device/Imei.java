package com.cneop.util.device;

import android.content.Context;
import android.telephony.TelephonyManager;

/**
 * Created by lfh on 2016/12/22 0022.
 */
public class Imei {
    public static String getImei(Context context){
        TelephonyManager tm= (TelephonyManager)context.getSystemService(Context.TELEPHONY_SERVICE);
        return tm.getDeviceId();
    }
}
