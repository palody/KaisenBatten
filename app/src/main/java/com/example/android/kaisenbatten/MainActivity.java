package com.example.android.kaisenbatten;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.android.kaisenbatten.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void open(View view) {
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://r.gnavi.co.jp/plan/f325800/plan-reserve/plan/plan_list/"));
        startActivity(browserIntent);
    }
}