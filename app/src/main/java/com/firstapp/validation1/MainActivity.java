package com.firstapp.validation1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {


    EditText nam,pwd,emi,phm;
    Button sub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nam=findViewById(R.id.nameEdt);
        pwd=findViewById(R.id.Pass_edt);
        emi=findViewById(R.id.Email_id);
        phm=findViewById(R.id.phone_num);
        sub=findViewById(R.id.Sub_mit);


        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String nameStr=nam.getText().toString().trim();
                String pwdStr=pwd.getText().toString();
                String emiStr=emi.getText().toString().trim();
                String phmStr=phm.getText().toString();





                if(TextUtils.isEmpty(nameStr))

                {

                    nam.setError("Enter Name");
                }
                  if(nameStr.length()==0)
                {
                   nam.setError(("Enter Name"));
                }

                if(TextUtils.isEmpty(emiStr))
                    emiStr.trim().length();
                {
                    emi.setError("enter Mail");
                }

                if(TextUtils.isEmpty(pwdStr))
                {
                    pwd.setError("Enter password");
                }

                else if(TextUtils.isEmpty(phmStr))
                {
                    phm.setError("Enter Mobile number");
                }
                else if(phmStr.length()<10 || phmStr.length()!=10)
                {
                    phm.setError("Enter minimum 10 didgits");
                }
                else
                {
                    Toast.makeText(MainActivity.this, ""+nameStr+"\n"+emiStr+"\n"+pwdStr+"\n"+phmStr+"\n", Toast.LENGTH_LONG).show();
                }



            }
        });

    }
    private boolean isValidEmailId(String emiStr){

        return Pattern.compile("^(([\\w-]+\\.)+[\\w-]+|([a-zA-Z]{1}|[\\w-]{2,}))@"
                + "((([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?"
                + "[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\."
                + "([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?"
                + "[0-9]{1,2}|25[0-5]|2[0-4][0-9])){1,}|"
                + "([a-zA-Z]+[\\w-]+\\.)+[a-zA-Z]{2,4})$").matcher(emiStr).matches();

    }

}