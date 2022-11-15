package com.example.pigalev_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Next();
    }

    private void Next()
    {
        SystemClock.sleep(3000);
        startActivity(new Intent(this, Authorization.class));
    }
}