package com.app.eventbusexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.app.eventbusexample.rxbus.RxBus;
import com.app.eventbusexample.rxbus.RxBusData;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class RxBus1Activity extends AppCompatActivity {

    @Bind(R.id.rx_click)
    Button rxClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rx_bus);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.rx_click)
    public void onClick() {
        Log.e("time",System.currentTimeMillis()+"");
        RxBus.get().post("rxbus1",new RxBusData("hello RxBus1","1"));
        finish();
    }
}
