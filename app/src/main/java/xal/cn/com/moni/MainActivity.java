package xal.cn.com.moni;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    int a = 3;
    @BindView(R.id.mimage)
    ImageView mimage;
    @BindView(R.id.mbut)
    Button mbut;
    @BindView(R.id.dao)
    TextView dao;

    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            int i = msg.what;
            dao.setText("倒计时" + i + "秒");
            if (i == 0) {
                startActivity(new Intent(MainActivity.this, Main2Activity.class));
                timer.cancel();
                finish();
            }
        }
    };
    private Timer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        initView();
    }

    private void initView() {
        timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {

                Message message = handler.obtainMessage();
                message.what = a--;
                handler.sendMessage(message);
            }
        };
        timer.schedule(task, 500, 1000);
    }


    @OnClick(R.id.mbut)
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.mbut:
                startActivity(new Intent(MainActivity.this, Main2Activity.class));
                timer.cancel();
                finish();
                break;
        }
    }
}
