package com.sabithpkcmnr.onesignal;

import android.app.Application;

import com.onesignal.OneSignal;

public class ActivityBase extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        OneSignal.initWithContext(this);
        OneSignal.setAppId(ActivityConfig.ONESIGNAL_APP_ID);
        OneSignal.unsubscribeWhenNotificationsAreDisabled(true);
    }

}