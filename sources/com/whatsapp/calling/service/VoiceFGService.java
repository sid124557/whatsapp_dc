package com.whatsapp.calling.service;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass660;
import X.C106645Zu;
import X.C107385bE;
import X.C112515jr;
import X.C18260x0;
import X.C18400xH;
import X.C32451qQ;
import X.C61102zi;
import X.C64333Db;
import X.C97074xa;
import android.app.Notification;
import android.content.Intent;
import android.os.IBinder;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.Locale;

public final class VoiceFGService extends C32451qQ {
    public static volatile Notification A03;
    public C112515jr A00;
    public C97074xa A01;
    public boolean A02 = false;

    public void A00() {
        if (!this.A02) {
            this.A02 = true;
            C64333Db A002 = C18400xH.A00(this);
            this.A00 = A002.Ai5();
            this.A01 = (C97074xa) A002.A00.ABy.get();
        }
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public VoiceFGService() {
        super("voicefgservice", true);
    }

    public void onCreate() {
        Log.i("voicefgservice/onCreate");
        A00();
        super.onCreate();
    }

    public void onDestroy() {
        Log.i("voicefgservice/onDestroy");
        Iterator A032 = C61102zi.A03(this.A01);
        while (A032.hasNext()) {
            ((AnonymousClass660) A032.next()).Bcs();
        }
        stopForeground(true);
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        C112515jr r2;
        C106645Zu r1;
        boolean A022;
        C18260x0.A1R(AnonymousClass001.A0o(), "voicefgservice/onStartCommand:", intent);
        if (intent != null) {
            String action = intent.getAction();
            if ("hangup_call".equals(action) || "reject_call".equals(action)) {
                r2 = this.A00;
                r1 = new C106645Zu(action, intent.getExtras());
            } else if ("recreate_notification".equals(action)) {
                r2 = this.A00;
                r1 = new C106645Zu("refresh_notification");
            } else if (!"com.whatsapp.service.VoiceFgService.START".equals(action) || A03 == null) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("voicefgservice/onStartCommand service started with unknown action:");
                C18260x0.A1K(A0o, intent.getAction());
                return 2;
            } else {
                boolean z = false;
                if (intent.getBooleanExtra("com.whatsapp.service.VoiceFgService.EXTRA_STOP_FOREGROUND_STATE", false)) {
                    Iterator A032 = C61102zi.A03(this.A01);
                    while (A032.hasNext()) {
                        ((AnonymousClass660) A032.next()).Bcs();
                    }
                    stopForeground(true);
                }
                if (C107385bE.A0B()) {
                    int i3 = 128;
                    if (intent.getBooleanExtra("com.whatsapp.service.VoiceFgService.EXTRA_IS_VIDEO_ENABLED", false)) {
                        i3 = 192;
                    }
                    boolean booleanExtra = intent.getBooleanExtra("com.whatsapp.service.VoiceFgService.EXTRA_IS_MEDIA_PROJECTION", false);
                    if (booleanExtra) {
                        i3 |= 32;
                    }
                    Locale locale = Locale.US;
                    Object[] A0L = AnonymousClass002.A0L();
                    Integer valueOf = Integer.valueOf(i3);
                    A0L[0] = valueOf;
                    Log.d(String.format(locale, "voicefgservice/onStartCommand: Starting fg service. Type: %d", A0L));
                    A022 = A02(A03, valueOf, i2, intent.getIntExtra("com.whatsapp.service.VoiceFgService.EXTRA_NOTIFICATION_ID", 23));
                    z = booleanExtra;
                } else {
                    A022 = A02(A03, (Integer) null, i2, intent.getIntExtra("com.whatsapp.service.VoiceFgService.EXTRA_NOTIFICATION_ID", 23));
                }
                if (A022) {
                    Iterator A033 = C61102zi.A03(this.A01);
                    while (A033.hasNext()) {
                        ((AnonymousClass660) A033.next()).BcH(z);
                    }
                }
            }
            r2.A00(r1);
        }
        return 2;
    }
}
