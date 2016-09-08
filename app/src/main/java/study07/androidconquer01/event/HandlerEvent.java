package study07.androidconquer01.event;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import study07.androidconquer01.R;
import study07.androidconquer01.view.MyView;

/**
 * Created by hyunji on 2016. 8. 8..
 */

public class HandlerEvent extends AppCompatActivity {

    private MyView myView;
    @BindView(R.id.test_text)
    TextView mText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // myView = new MyView(this);
        // mText = (TextView) findViewById(R.id.test_text);
        // 이벤트 핸들러의 경우 인터페이스에 의해 원형이 고정되어있다. 인수 추가 방법이 없
        // 핸들러 내에서 참조할 수 있는 형태로 정달해야 하며 멤버에 의해 미리 조사해 놓는 방법을 사용한다.


       // 핸들러 우선순위 :  이벤트 핸들러가 중복 정의 되어 있을때 미리 정한 우선순위에 따라 적절한 핸들러를 선택하여 호출한다.
        /** 리스너 - 1순위 */
        myView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    Toast.makeText(HandlerEvent.this, "Event Test ", Toast.LENGTH_LONG).show();
                    mText.setText("Touched");
                    return true;
                }
                return false;
            }
        });

        setContentView(myView);
    }

    /*View.OnTouchListener touchListener = new View.OnTouchListener() {
        @Override
        public boolean onTouch(View view, MotionEvent motionEvent) {

            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                Toast.makeText(HandlerEvent.this, "Event Test ", Toast.LENGTH_LONG).show();

                return true;
            }
            return false;
        }
    };*/
}
    /*// 자신에게 발생되는 이벤트를 자기가 스스로 처리하게 함
    // 이벤트를 처리하는 메서드를 내부에 포함한다는 면에서 구조상 깔끔하고 뷰를 재활요하기도 유리하다
    class EventView extends View implements View.OnTouchListener {

        public EventView(Context context) {
            super(context);
        }

        @Override
        public boolean onTouch(View view, MotionEvent motionEvent) {

            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                Toast.makeText(HandlerEvent.this, "Event Test ", Toast.LENGTH_LONG).show();

                return true;
            }
            return false;
        }*/

/** 리스너 - 3순위 :  액티비티 콜백 메서드  */
    /*private class TouchListenerClass implements View.OnTouchListener {
        // 액티비티가 인터페이스를 자체 구현 하므로 별도의 클래스를 서언할 필요가 없다
        // 하지만 액티비티라는 큰 단위가 하위의 뷰를 위한 메서드를 제공한다는 면에서 구조적이지 못하다.
        // 부모가 구현해 주었기 때문에 독립성이 떨어진다
        // 문법적으로는 제일 완벽하나 리스너하나를 위해 클래스를 일일이 선언하기 번거롭다

        @Override
        public boolean onTouch(View view, MotionEvent motionEvent) {

            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                Toast.makeText(HandlerEvent.this, "Event Test ", Toast.LENGTH_LONG).show();

                return true;
            }
            return false;
        }
    }*/

//TouchListenerClass TouchListener = new TouchListenerClass();

/** 리스너 - 2순위 -  뷰의 콜백 메서드  */
    /*
    //콜백 메서드 시용 - 상속을 받아야만 재정의 가능
    class EventView extends View implements View.OnTouchListener {

        public EventView(Context context) {
            super(context);
        }


        public boolean onTouchEvent(MotionEvent event) {
            super.onTouchEvent(event);

            if (event.getAction() == MotionEvent.ACTION_DOWN) {
                Toast.makeText(HandlerEvent.this, "Event Test ", Toast.LENGTH_LONG).show();

                return true;
            }
            return false;
        }

    }*/


