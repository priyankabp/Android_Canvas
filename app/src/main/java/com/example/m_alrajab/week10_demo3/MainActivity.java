package com.example.m_alrajab.week10_demo3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    MyPanel panel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void setRect(View view) {
        SharedValuesXY.drawingMode="RECT";
    }
    public void setOval(View view) {
        SharedValuesXY.drawingMode="OVAL";
    }
}
