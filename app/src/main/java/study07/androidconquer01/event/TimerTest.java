package study07.androidconquer01.event;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import butterknife.BindView;
import study07.androidconquer01.R;

/**
 * Created by hyunji on 2016. 8. 15..
 */

public class TimerTest extends AppCompatActivity {

    private int value = 0;
    private Handler mHandler;
    @BindView(R.id.timer_text)
    TextView mTextView;


    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.timertest);
        /** public CountDownTimer(long millisInFuture, long countDownInterval) {
            throw new RuntimeException("Stub!");*/
        new CountDownTimer(10 * 1000, 1000){

            @Override
            public void onTick(long l) {
                value++;
                mTextView.setText("Value !! = " + value);
                if(value < 5){
                    cancel();
                }
            }
            /** onCreate 에서 CountDownTimer 객체를 생성하자 마자 start메서드를 바로 호출
             *  onTick메서드에서 주기적 작업을 수행*/

            @Override
            public void onFinish() {

            }
        }.start();

        /* // 1.
        mHandler = new Handler(){
            public void handleMessage(Message message){
                value++;
                mTextView.setText("Value = " + value);
                if (value<5){
                    mHandler.sendEmptyMessageDelayed(0, 1000);
                }
            }
        };
        mHandler.sendEmptyMessage(0);*/
        /**
         * 핸들러 초기화문 onCreate에 작성됨
         * 이코드는최초 빈 메세지를 보내는 문장과 나란히 둘 수 있다
         * 핸들러가 자신의 재귀호출
         * - 핸들러로도 Timer흉내를 낸것 , 하지만 Handler는 스레드간의 통신을 위해 제공되는 클래스라 원래 용도와는 맞지 않는다
         * */
    }
}
