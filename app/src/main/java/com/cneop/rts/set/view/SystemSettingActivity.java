package com.cneop.rts.set.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.widget.TextView;

import com.cneop.rts.R;
import com.cneop.rts.login.view.LoginActivity;

public class SystemSettingActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_system_config);
        initView();


    }
    void initView()
    {
        TextView toolbar_tittle=(TextView)findViewById(R.id.toolbar_tittle);
        toolbar_tittle.setText("系统设置");


    }
}
