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
    /**
     * 인스턴스 변수 : 클래스 영역에 선언, 클래스 인스턴스 생성해야한다.
     * 인스턴스는 독립적인 저장공간을 가지므로 서로 다른 값을 가질 수 있다.
     * */
    private  Paint mPnt;


    public MyView(Context context) {
        super(context);
        mPnt = new Paint();
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
