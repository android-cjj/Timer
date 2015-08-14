package com.cjj.timertest;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private DownTimer timer;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView tv_scend = (TextView) findViewById(R.id.text1);
        tv_scend.setText("总共一分钟");
        timer = new DownTimer();//实例化
        timer.setTotalTime(60*1000);//设置毫秒数
        timer.setIntervalTime(1000);//设置间隔数
        timer.setTimerLiener(new DownTimer.TimeListener() {
            @Override
            public void onFinish() {
                Toast.makeText(MainActivity.this, "完成倒计时", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onInterval(long remainTime) {
                tv_scend.setText("还剩" + remainTime / 1000+"秒就完成了");//剩余多少秒
            }
        });

    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.start:
                timer.start();
                break;
            case R.id.pause:
                timer.pause();
                break;
            case R.id.cancel:
                timer.cancel();
                break;
            case R.id.resume:
                timer.resume();
                break;
        }
    }
}
