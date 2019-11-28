package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class secondpage extends AppCompatActivity {
     Button btn;
     TextView tv;
     RadioButton r1,r2;
     EditText et;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondpage);
        btn=(Button) findViewById(R.id.btn);
        tv=(TextView) findViewById(R.id.tv);
        r1=(RadioButton) findViewById(R.id.r1) ;
        r2=(RadioButton) findViewById(R.id.r2) ;
        et=(EditText) findViewById(R.id.et) ;
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(et.getText().toString()))
                {
                    Toast.makeText(getApplicationContext(),"enter value",Toast.LENGTH_LONG).show();
                }
                else {

                    if (r1.isChecked()) {
                        String str = et.getText().toString();
                        double d;
                        d = Double.parseDouble(str);
                        d = d / 84.4;
                        DecimalFormat df = new DecimalFormat("0.00");
                        String s;
                        s = df.format(d);
                        tv.setText(s);
                    } else if (r2.isChecked()) {
                        String str = et.getText().toString();
                        double d;
                        d = Double.parseDouble(str);
                        d = d / 64.6;
                        DecimalFormat df = new DecimalFormat("0.00");
                        String s;
                        s = df.format(d);
                        tv.setText(s);
                    } else {
                        Toast.makeText(getApplicationContext(), "Hello Javatpoint", Toast.LENGTH_SHORT).show();

                    }
                }


            }
        });
    }
    }