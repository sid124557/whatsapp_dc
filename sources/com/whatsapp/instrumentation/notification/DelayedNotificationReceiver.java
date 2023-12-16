package com.whatsapp.instrumentation.notification;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0x2;
import X.AnonymousClass2A1;
import X.AnonymousClass2LA;
import X.AnonymousClass33T;
import X.C05610Ue;
import X.C107145am;
import X.C18260x0;
import X.C18270x1;
import X.C18280x3;
import X.C18320x8;
import X.C60692yy;
import X.C620733j;
import X.C624735e;
import X.C66553Lw;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.Iterator;

public class DelayedNotificationReceiver extends BroadcastReceiver {
    public AnonymousClass33T A00;
    public C620733j A01;
    public AnonymousClass2LA A02;
    public C60692yy A03;
    public final Object A04;
    public volatile boolean A05;

    public void onReceive(Context context, Intent intent) {
        int i;
        if (!this.A05) {
            synchronized (this.A04) {
                if (!this.A05) {
                    AnonymousClass2A1.A00(context).ARK(this);
                    this.A05 = true;
                }
            }
        }
        Log.d("DelayedNotificationReceiver/onReceive");
        Iterator it = this.A03.A02().iterator();
        while (it.hasNext()) {
            String A0m = AnonymousClass001.A0m(it);
            C60692yy r0 = this.A03;
            if (!C18280x3.A1W(r0.A01(), C60692yy.A00(A0m, "metadata/delayed_notification_shown"))) {
                C18260x0.A0q("DelayedNotificationReceiver/showDelayedNotification ", A0m, AnonymousClass001.A0o());
                C60692yy r2 = this.A03;
                long A0B = AnonymousClass0x2.A0B(r2.A01(), C60692yy.A00(A0m, "auth/token_ts"));
                Number number = (Number) this.A02.A01.get(A0m);
                if (number != null) {
                    i = number.intValue();
                } else {
                    i = R.string.f11nameremoved;
                }
                String string = context.getString(R.string.f11nameremoved);
                String A002 = C107145am.A00(this.A01, A0B);
                Object[] A0M = AnonymousClass002.A0M();
                C18280x3.A19(context.getString(i), A002, A0M);
                String string2 = context.getString(R.string.f11nameremoved, A0M);
                C05610Ue A003 = C66553Lw.A00(context);
                A003.A0C(string);
                A003.A0B(string);
                A003.A0A(string2);
                Intent A07 = C18320x8.A07();
                A07.setClassName(context.getPackageName(), "com.whatsapp.companiondevice.LinkedDevicesActivity");
                A003.A09 = C624735e.A00(context, 0, A07, 0);
                C18270x1.A0r(A003, string2);
                A003.A0E(true);
                AnonymousClass33T.A02(A003, R.drawable.notifybar);
                this.A00.A04(41, A003.A01());
                C60692yy r02 = this.A03;
                C18270x1.A0f(r02.A01().edit(), C60692yy.A00(A0m, "metadata/delayed_notification_shown"));
            }
        }
        PendingIntent A012 = C624735e.A01(context, 0, intent, 536870912);
        if (A012 != null) {
            A012.cancel();
        }
    }

    public DelayedNotificationReceiver(int i) {
        this.A05 = false;
        this.A04 = AnonymousClass002.A0D();
    }

    public DelayedNotificationReceiver() {
        this(0);
    }
}
