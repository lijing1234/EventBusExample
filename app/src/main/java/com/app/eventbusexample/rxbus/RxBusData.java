package com.app.eventbusexample.rxbus;

/**
 * Created by 王立强 on 2016/10/15.
 */

public class RxBusData {
    private String mMsg;//消息内容
    private String tag; //消息类型

    public RxBusData(String mMsg, String tag) {
        super();
        this.mMsg = mMsg;
        this.tag = tag;
    }
    public String getTag() {
        return tag;
    }
    public void setTag(String tag) {
        this.tag = tag;
    }
    public RxBusData(String msg) {
        mMsg = msg;
    }
    public String getMsg(){
        return mMsg;
    }
}
