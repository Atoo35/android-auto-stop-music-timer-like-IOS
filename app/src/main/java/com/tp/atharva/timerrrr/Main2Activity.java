package com.tp.atharva.timerrrr;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main2Activity extends BroadcastReceiver {

    long[] vibpattern={0,200,200,200};
    Vibrator vibrator;

    @Override
    public void onReceive(Context context, Intent intent) {

        vibrator=(Vibrator) context.getSystemService(Context.VIBRATOR_SERVICE);
        Intent i = new Intent();
        i.setClassName("com.tp.atharva.timerrrr","com.tp.atharva.timerrrr.MainActivity");
        context.startActivity(i);
    }
}
