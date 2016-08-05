package study07.androidconquer01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import study07.androidconquer01.view.MyView;

public class MainActivity extends AppCompatActivity {
    private MyView myView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        myView = new MyView(this);
        setContentView(myView);
    }
}
