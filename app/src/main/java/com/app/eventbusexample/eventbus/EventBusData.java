package com.app.eventbusexample.eventbus;

/**
 * Created by 王立强 on 2016/10/15.
 */

public class EventBusData {
    private String mMsg;//消息内容
    private String tag; //消息类型

    public EventBusData(String mMsg, String tag) {
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
    public EventBusData(String msg) {
        mMsg = msg;
    }
    public String getMsg(){
        return mMsg;
    }
}
