package com.cbank.android.activity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class InstallReferrerReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String referrer = "";
//        if(intent.getAction().equals("com.android.vending.INSTALL_REFERRER")) {
//            Bundle bundle = intent.getExtras();
//            referrer = bundle.getString("referrer");
//            Log.i("LOG", "Referrer: " + referrer);
//
//        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            referrer = extras.getString("referrer");

        }
        Log.i("referrer", "referrer is : " + referrer);
    }
}
