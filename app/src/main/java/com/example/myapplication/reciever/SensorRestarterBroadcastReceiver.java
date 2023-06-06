package com.example.myapplication.reciever;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.example.myapplication.service.SensorService;


public class SensorRestarterBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i(SensorRestarterBroadcastReceiver.class.getSimpleName(), "Service Stops!");
        context.startService(new Intent(context, SensorService.class));
    }
}