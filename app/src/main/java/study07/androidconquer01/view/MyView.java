package study07.androidconquer01.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

/**
 * Created by infobank_mac on 8/5/16.
 */
public class MyView extends View {

    public MyView(Context context) {
        super(context); 
    }
    public void onDraw(Canvas canvas){
        canvas.drawColor(Color.GRAY);
        Paint paint = new Paint();
        paint.setColor(Color.DKGRAY);
        canvas.drawCircle(100,100,80,paint);
    }
}
