package com.companyname.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ShowData extends AppCompatActivity {

    String userStatus;
    String statusMsg;
    String statusCode;
    String fullName;
    Double currentBalance;

    TextView userStatusTv;
    TextView statusMsgTv;
    TextView statusCodeTv;
    TextView fullNameTv;
    TextView currentBalanceTv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_data);
        Intent intent = getIntent();
        userStatus=intent.getStringExtra("user status");
        statusMsg=intent.getStringExtra("status message");
        statusCode=intent.getStringExtra("status code");
        fullName=intent.getStringExtra("full name");
        currentBalance=intent.getDoubleExtra("current balance",5.2);

        userStatusTv = (TextView) findViewById(R.id.user_statusTextView);
        userStatusTv.setText(userStatus);
        statusMsgTv = (TextView) findViewById(R.id.status_description);
        statusMsgTv.setText(statusMsg);
        statusCodeTv = (TextView) findViewById(R.id.status_code);
        statusCodeTv.setText(statusCode);
        fullNameTv = (TextView) findViewById(R.id.full_name);
        fullNameTv.setText(fullName);
        currentBalanceTv = (TextView) findViewById(R.id.current_balance);
        currentBalanceTv.setText(currentBalance.toString()+"$");


    }
}