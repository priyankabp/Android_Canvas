package com.example.m_alrajab.week10_demo3;

import android.content.ClipData;
import android.graphics.Canvas;
import android.graphics.Point;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    StartDraggingLsntr myStartDraggingLsnr;
    Button rectBtn, ovalBtn, btn1, btn2;
    MyPanel panel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rectBtn=(Button) findViewById(R.id.rectBtn);
        myStartDraggingLsnr=new StartDraggingLsntr();

        rectBtn.setOnLongClickListener(myStartDraggingLsnr);

    }

    public void setRect(View view) {
        SharedValuesXY.drawingMode="RECT";
    }
    public void setOval(View view) {
        SharedValuesXY.drawingMode="OVAL";
    }

    private class StartDraggingLsntr implements View.OnLongClickListener{
        @Override
        public boolean onLongClick(View view) {
            WithDraggingShadow shadow = new WithDraggingShadow(view);
            ClipData data=ClipData.newPlainText("","");
            view.startDrag( data, shadow, view, 0);
            return false;
        }
    }

    private class WithDraggingShadow extends View.DragShadowBuilder{
        WithDraggingShadow(View view){
            super(view);
        }

        @Override
        public void onDrawShadow(Canvas canvas) {
            super.onDrawShadow(canvas);
        }

        @Override
        public void onProvideShadowMetrics(Point shadowSize, Point shadowTouchPoint) {
            super.onProvideShadowMetrics(shadowSize, shadowTouchPoint);
        }
    }
}
