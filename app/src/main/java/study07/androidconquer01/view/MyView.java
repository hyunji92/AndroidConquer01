package study07.androidconquer01.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

/**
 * Created by infobank_mac on 8/5/16.
 */
public class MyView extends View {

    private  Paint mPnt;
    
    public MyView(Context context) {
        super(context);

        mPnt.setAntiAlias(true);
        mPnt.setColor(Color.BLUE);
        mPnt.setStrokeWidth(10);
        mPnt.setStyle(Paint.Style.STROKE);
        mPnt.setStrokeJoin(Paint.Join.BEVEL);
    }

    public void onDraw(Canvas canvas){
        
        /*Paint paint = new Paint();
        paint.setColor(Color.GRAY);
        canvas.drawCircle(100,100,80,paint);*/
        canvas.drawColor(Color.LTGRAY);
        canvas.drawRect(10,10,300,100,mPnt);

        Bitmap BackBit =  Bitmap.createBitmap(300, 200, Bitmap.Config.ARGB_8888);
        Canvas offscreen = new Canvas(BackBit);
        offscreen.drawColor(Color.DKGRAY);
        mPnt.setColor(Color.GREEN);
        for(int x = 0; x < 300; x+= 10){
            offscreen.drawLine(x, 0, 300 - x, 300, mPnt);
        }

        canvas.drawBitmap(BackBit, 10, 10, null);
    }
}
