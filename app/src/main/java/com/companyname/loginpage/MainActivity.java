package com.companyname.loginpage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    // for disable button
    int counter = 3;

    // var for storing inputs
    String userName;
    String password;

    String rightUsername = "6598018601";
    //"Xutg54yy#"
    String rightPassword = "Xutg54yy#";

    // reference for binding the view from the activity
    TextView textViewForgetPassword;
    EditText editTextUserName;
    EditText editTextPassword;
    Button buttonLogin;
    CheckBox checkBox;
    TextView textViewWrong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // f for the more dark mode options
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        setContentView(R.layout.activity_main);


        // bind the views
        textViewForgetPassword = (TextView) findViewById(R.id.forgetPassword);
        editTextUserName = (EditText) findViewById(R.id.editTextTextPersonName);
        editTextPassword = (EditText) findViewById(R.id.inputPassword);
        buttonLogin = (Button) findViewById(R.id.btnLogin);
        textViewWrong = (TextView) findViewById(R.id.notAllRightTv);
        checkBox = (CheckBox) findViewById(R.id.ShowPasswordCheckBox);



        // on click listener for the btn
        buttonLogin.setOnClickListener(v -> {
            // getting the input from views and storing 'em
            userName = editTextUserName.getText().toString();
            password = editTextPassword.getText().toString();
            // checking that all fields are set
            if (inputsEmpty()) {
                counter--;
                textViewWrong.setText("U should fill both fields");
                if (counter == 0) {
                    buttonLogin.setEnabled(false);
                }
            } else {
                if (validate()) {
//                    Intent intent = new Intent(MainActivity.this, ShowData.class);
//                    startActivity(intent);
                    Toast.makeText(this, "Logged in successfully ", Toast.LENGTH_LONG).show();
                } else {
                    counter--;
                    if (counter == 0) {
                        buttonLogin.setEnabled(false);
                        Toast.makeText(this, " Check the password or user name ", Toast.LENGTH_SHORT).show();
                        textViewWrong.setText("Password or Username is incorrect");
                    }
                }
            }
            MainUserData mainUserData =
               new MainUserData(userName,password,"ANDROID.MOBILE","V25.6","","ANDROID.MOBILE");
            Call<UserInfo> call = ApiManager.getApi().setData(mainUserData);

            call.enqueue(new Callback<UserInfo>() {
                @Override
                public void onResponse(Call<UserInfo> call, Response<UserInfo> response) {
                    if (validate()) {
                    Intent intent = new Intent(MainActivity.this, ShowData.class);
                    intent.putExtra("user status",response.body().getUserStatus());
                    intent.putExtra("status message",response.body().getStatusMsg());
                    intent.putExtra("status code",response.body().getStatusCode());
                    intent.putExtra("full name",response.body().getFullName());
                    intent.putExtra("current balance",response.body().getCurrentBalance());
                    if(intent.resolveActivity(getPackageManager()) != null ){
                        startActivity(intent);
                    }

                    }
                }

                @Override
                public void onFailure(Call<UserInfo> call, Throwable t) {

                }
            });

        });

        // on click listener for the forgot password text
        textViewForgetPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // u shpuld here start new activity for the forget password
                // startActivity(new Intent(.this,.class));
            }
        });
    }

    boolean inputsEmpty() {
        if (userName.isEmpty() || password.isEmpty()) {
            return true;
        }
        return false;
    }

    boolean validate() {
        if (userName.equals(rightUsername) && password.equals(rightPassword)) {
            return true;
        }
        return false;
    }


    public void showPassword(View view) {
        if(checkBox.isChecked()){
        editTextPassword.setTransformationMethod(null);
        }else{
            editTextPassword.setTransformationMethod(new PasswordTransformationMethod());
        }
    }
}