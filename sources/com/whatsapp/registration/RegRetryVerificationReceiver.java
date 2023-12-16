package com.whatsapp.registration;

import X.AnonymousClass002;
import X.AnonymousClass2A1;
import X.AnonymousClass33T;
import X.C05610Ue;
import X.C18270x1;
import X.C51072jE;
import X.C54292oU;
import X.C624735e;
import X.C627736r;
import X.C66553Lw;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.R;
import com.whatsapp.util.Log;

public class RegRetryVerificationReceiver extends BroadcastReceiver {
    public C54292oU A00;
    public AnonymousClass33T A01;
    public C51072jE A02;
    public final Object A03;
    public volatile boolean A04;

    public void onReceive(Context context, Intent intent) {
        if (!this.A04) {
            synchronized (this.A03) {
                if (!this.A04) {
                    AnonymousClass2A1.A00(context).ARi(this);
                    this.A04 = true;
                }
            }
        }
        Log.i("reg-retry-verification-receiver/timeout");
        if (this.A02.A02() || this.A02.A00() == 10) {
            Log.i("app-init/async/registrationretry/verified");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        String string = this.A00.A00.getString(R.string.f11nameremoved);
        String A0F = AnonymousClass002.A0F(this.A00.A00, string, new Object[1], 0, R.string.f11nameremoved);
        String string2 = this.A00.A00.getString(R.string.f11nameremoved);
        PendingIntent A002 = C624735e.A00(context, 1, C627736r.A03(context), 0);
        C05610Ue A012 = C66553Lw.A01(context);
        A012.A0K = "critical_app_alerts@1";
        A012.A0C(A0F);
        A012.A05(currentTimeMillis);
        C18270x1.A0s(A012, string, string2);
        C18270x1.A0r(A012, string2);
        AnonymousClass33T.A01(A002, A012);
        AnonymousClass33T.A03(A012, this.A01, 1);
    }

    public RegRetryVerificationReceiver(int i) {
        this.A04 = false;
        this.A03 = AnonymousClass002.A0D();
    }

    public RegRetryVerificationReceiver() {
        this(0);
    }
}
