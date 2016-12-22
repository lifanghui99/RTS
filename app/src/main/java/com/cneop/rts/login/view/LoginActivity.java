package com.cneop.rts.login.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.cneop.rts.Aplication.GlobalParas;
import com.cneop.rts.R;
import com.cneop.rts.set.view.SystemSettingActivity;

public class LoginActivity extends Activity implements View.OnClickListener {
    private EditText et_login_username;
    private EditText et_login_pwd;
    private TextView tv_login_version;
    private TextView tv_login_machineID;
    private Button btn_sysconfig;
    private Button btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.login);
        initView();


    }
    void initView()
    {
        et_login_username=(EditText)findViewById(R.id.et_login_username);
        et_login_pwd = (EditText)findViewById(R.id.et_login_pwd);
        tv_login_version = (TextView) findViewById(R.id.tv_login_version);
        tv_login_machineID = (TextView) findViewById(R.id.tv_login_machineID);
        tv_login_version.setText(String.format("中光远V%s", GlobalParas.getGlobalParas().getVersion()));
        tv_login_machineID.setText(GlobalParas.getGlobalParas().getDeviceId());

        btn_sysconfig = (Button)findViewById(R.id.btn_sysconfig);
        btn_login = (Button)findViewById(R.id.btn_login);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_sysconfig:
                Intent intent = new Intent(LoginActivity.this, SystemSettingActivity.class);
                startActivity(intent);

                break;
            case R.id.btn_login:


                break;

        }
    }
}
