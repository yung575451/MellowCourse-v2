package com.hungphamcom.mellowcourse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    private EditText email;
    private EditText password;

    private Button signInButton;
    private ImageView changePassword;

    private TextView forgetPasswordButton;
    private TextView createAccount;

    private String savePassword;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createAccount=findViewById(R.id.registerNow_login);
        changePassword=findViewById(R.id.change_input_password_login);
        password=findViewById(R.id.password_login);
        createAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,CreateAccountActivity.class));
                finish();
            }
        });
        changePassword.setOnClickListener(changeInput);


    }


    View.OnClickListener changeInput=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            int check=password.getInputType();

            if(password.getInputType()== 129){
                Log.d("main", "onClick: "+password.getInputType());
                password.setInputType(144);
                Picasso.get().load(R.drawable.ic_akar_icons_eye_open)
                        .placeholder(R.drawable.ic_akar_icons_eye_slashed)
                        .fit()
                        .into(changePassword);
            }else {
                Log.d("main", "onClick: "+password.getInputType());
                password.setInputType(129);
                Picasso.get().load(R.drawable.ic_akar_icons_eye_slashed)
                        .placeholder(R.drawable.ic_akar_icons_eye_open)
                        .fit()
                        .into(changePassword);
            }
        }
    };
}