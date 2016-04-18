package com.example.m_alrajab.week10_demo3;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by m_alrajab on 3/28/16.
 */
public class MyPanel extends View {

    Paint paint = new Paint();

    public MyPanel(Context context, AttributeSet set) {
        super(context, set);

        setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        SharedValuesXY.endX = SharedValuesXY.startX = event.getX();
                        SharedValuesXY.endY = SharedValuesXY.startY = event.getY();
                        break;
                    case MotionEvent.ACTION_UP:
                        SharedValuesXY.endX = event.getX();
                        SharedValuesXY.endY = event.getY();
                        break;
                    default:
                }


                return true;
            }
        });
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawARGB(255, 255, 255, 0);
        paint.setARGB(255, 0, 0, 255);
        if (SharedValuesXY.drawingMode.equals("RECT"))
            canvas.drawRect(

                    Math.min(SharedValuesXY.startX, SharedValuesXY.endX),
                    Math.min(SharedValuesXY.startY, SharedValuesXY.endY),
                    Math.max(SharedValuesXY.startX, SharedValuesXY.endX),
                    Math.max(SharedValuesXY.startY, SharedValuesXY.endY)
                    , paint);
        else
            canvas.drawOval(

                    Math.min(SharedValuesXY.startX, SharedValuesXY.endX),
                    Math.min(SharedValuesXY.startY, SharedValuesXY.endY),
                    Math.max(SharedValuesXY.startX, SharedValuesXY.endX),
                    Math.max(SharedValuesXY.startY, SharedValuesXY.endY)
                    , paint);

        invalidate();

    }

    public int getWidth(Canvas canvas)
    {
        return canvas.getWidth();
    }

    public int getHeight(Canvas canvas)
    {
        return canvas.getHeight();
    }
}
