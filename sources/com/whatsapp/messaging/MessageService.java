package com.whatsapp.messaging;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0x9;
import X.AnonymousClass3YV;
import X.AnonymousClass4GJ;
import X.AnonymousClass5XU;
import X.C18260x0;
import X.C18400xH;
import X.C22031Ec;
import X.C45502a7;
import X.C64323Da;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import com.whatsapp.util.Log;

public class MessageService extends C18400xH implements AnonymousClass4GJ {
    public AnonymousClass5XU A00;
    public boolean A01;
    public final Object A02;
    public volatile AnonymousClass3YV A03;

    public static void A02(Context context) {
        try {
            context.startService(AnonymousClass0x9.A08(context, MessageService.class).setAction("com.whatsapp.messaging.MessageService.START"));
            Log.i("messageservice/startService success");
        } catch (Exception e) {
            if (Build.VERSION.SDK_INT >= 26) {
                Log.d(AnonymousClass000.A0a("messageservice/startService failed:", AnonymousClass001.A0o(), e));
                return;
            }
            throw e;
        }
    }

    public static void A03(Context context, C45502a7 r3) {
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                context.startService(AnonymousClass0x9.A08(context, MessageService.class).setAction("com.whatsapp.messaging.MessageService.START"));
                Log.i("messageservice/startOnForeground success");
            } catch (Exception e) {
                C18260x0.A16("messageservice/startOnForeground failed:", AnonymousClass001.A0o(), e);
                r3.A00();
            }
        }
    }

    public final Object generatedComponent() {
        if (this.A03 == null) {
            synchronized (this.A02) {
                if (this.A03 == null) {
                    this.A03 = new AnonymousClass3YV(this);
                }
            }
        }
        return this.A03.generatedComponent();
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public MessageService(int i) {
        this.A02 = AnonymousClass002.A0D();
        this.A01 = false;
    }

    public void onCreate() {
        Log.i("messageservice/onCreate");
        if (!this.A01) {
            this.A01 = true;
            this.A00 = (AnonymousClass5XU) ((C22031Ec) ((C64323Da) generatedComponent())).A06.AU0.get();
        }
        super.onCreate();
    }

    public void onDestroy() {
        Log.i("messageservice/onDestroy");
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        String str;
        String action;
        if (AnonymousClass5XU.A00()) {
            str = "messageservice/unsupported";
        } else {
            if (intent == null || (action = intent.getAction()) == null || action.equals("com.whatsapp.messaging.MessageService.START")) {
                str = "messageservice/start";
            }
            return 1;
        }
        Log.d(str);
        return 1;
    }

    public MessageService() {
        this(0);
    }
}
