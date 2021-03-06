package com.example.marci.boundservice_actividad10;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

import java.util.Random;

public class MyService extends Service {
    private final IBinder iBinder = new LocalBinder();
    private final Random mGenerator = new Random();

    public class LocalBinder extends Binder {
        MyService getService () {
            return MyService.this;
        }
    }
    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return iBinder;
    }

    public int gerRandom() {
        return mGenerator.nextInt(200);
    }
}
