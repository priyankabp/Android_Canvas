package com.example.m_alrajab.week10_demo3;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/**
 * Created by m_alrajab on 3/28/16.
 */
public class myPanel extends View {

    Paint paint=new Paint();

    public myPanel(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawARGB(255, 255, 255, 0);
        paint.setARGB(255, 0, 0, 255);
        canvas.drawRect(

                Math.min(SharedValuesXY.startX, SharedValuesXY.endX) ,
                Math.min(SharedValuesXY.startY, SharedValuesXY.endY),
                Math.max(SharedValuesXY.startX, SharedValuesXY.endX),
                Math.max(SharedValuesXY.startY, SharedValuesXY.endY)
                , paint);

        invalidate();

    }
}
