package com.firstapp.visibility_login_task;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class VisibilityActivity extends AppCompatActivity {

    LinearLayout l1,l2;

    Button login,signup;

    View v1,v2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visibility);


        l1=findViewById(R.id.l1);
        l2=findViewById(R.id.l2);
        login=findViewById(R.id.btn_login);
        signup=findViewById(R.id.btn_signup);

        v1=findViewById(R.id.view1);
        v2=findViewById(R.id.view2);



        login.setBackgroundColor(getResources().getColor(R.color.yellow));
        signup.setBackgroundColor(getResources().getColor(R.color.green));
        l1.setVisibility(View.VISIBLE);
        l2.setVisibility(View.GONE);

        login.setTextColor(getResources().getColor(R.color.white));
        signup.setTextColor(getResources().getColor(R.color.black));

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login.setBackgroundColor(getResources().getColor(R.color.yellow));
                login.setTextColor(getResources().getColor(R.color.black));
                signup.setTextColor(getResources().getColor(R.color.white));

                v1.setBackgroundColor(getResources().getColor(R.color.gray));

                v1.setVisibility(View.VISIBLE);
                v2.setVisibility(View.GONE);

                

                signup.setBackgroundColor(getResources().getColor(R.color.gray));
                l1.setVisibility(View.VISIBLE);
                l2.setVisibility(View.GONE);

                Toast.makeText(VisibilityActivity.this, "Selected LoginPage", Toast.LENGTH_LONG).show();

            }
        });

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                signup.setBackgroundColor(getResources().getColor(R.color.pink));
                signup.setTextColor(getResources().getColor(R.color.black));
                login.setTextColor(getResources().getColor(R.color.white));


                login.setBackgroundColor(getResources().getColor(R.color.gray));

                v2.setBackgroundColor(getResources().getColor(R.color.gray));

                l2.setVisibility(View.VISIBLE);
                l1.setVisibility(View.GONE);

                v2.setVisibility(View.VISIBLE);
                v1.setVisibility(View.GONE);

                Toast.makeText(VisibilityActivity.this, "Selected Signup Page", Toast.LENGTH_LONG).show();


            }
        });

    }
}