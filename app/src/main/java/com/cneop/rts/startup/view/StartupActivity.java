package com.cneop.rts.startup.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;

import com.cneop.rts.R;
import com.cneop.rts.login.view.LoginActivity;
import com.cneop.rts.startup.model.SystemInitUtil;

public class StartupActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_app_startup);
        initView();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //初始化系统
                SystemInitUtil systemInitUtil = new SystemInitUtil(StartupActivity.this);
                systemInitUtil.loadSystemInit();

                //跳转到登录界面
                Intent intent = new Intent(StartupActivity.this, LoginActivity.class);
                startActivity(intent);
                StartupActivity.this.finish();
            }
        },2000);

    }
    void initView()
    {

    }
}
