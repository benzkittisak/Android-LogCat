package com.bbgun.hellologcatapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "My_App";
    private int data = 10;

    Button btnError , btnWarning , btnInformation  , btnDebug , btnVerbose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnError = (Button) findViewById(R.id.btnError);
        btnError.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Show Logcat Error" , Toast.LENGTH_LONG).show();
                Log.e(TAG , "Test log.e data = " + data);
            }
        });

        btnWarning = (Button) findViewById(R.id.btnWarning);
        btnWarning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Show Logcat Warning" , Toast.LENGTH_LONG).show();
                Log.w(TAG , "Test log.w data = " + data);
            }
        });

        btnInformation = (Button) findViewById(R.id.btnInformation);
        btnInformation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Show Logcat Information" , Toast.LENGTH_LONG).show();
                Log.i(TAG , "Test log.i data = " + data);
            }
        });

        btnDebug = (Button) findViewById(R.id.btnDebug);
        btnDebug.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Show Logcat Debug" , Toast.LENGTH_LONG).show();
                Log.d(TAG , "Test log.d data = " + data);
            }
        });

        btnVerbose = (Button) findViewById(R.id.btnVerbose);
        btnVerbose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Show Logcat Verbose" , Toast.LENGTH_LONG).show();
                Log.v(TAG , "Test log.v data = " + data);
            }
        });


    }
}

/*
* V => ใช้สำหรับแสดงข้อความที่ไม่สำคัญอะไรมวก
* D => ใช้สำหรับแสดง Debug
* I => ใช้สำหรับแสดงข้อมูลการทำงานอะไรก็ได้ info
* W => ใช้สำหรับแสดงข้อผิดพลาด
* E => Error !!!
* */