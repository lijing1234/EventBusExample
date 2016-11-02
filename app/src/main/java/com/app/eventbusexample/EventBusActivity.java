package com.app.eventbusexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.app.eventbusexample.eventbus.EventBusData;

import org.greenrobot.eventbus.EventBus;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class EventBusActivity extends AppCompatActivity {

    @Bind(R.id.event_click)
    Button eventClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_bus);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.event_click)
    public void onClick() {
        Log.e("time",System.currentTimeMillis()+"");
        EventBus.getDefault().post(new EventBusData("hello EventBus","1"));
        finish();
    }
}
