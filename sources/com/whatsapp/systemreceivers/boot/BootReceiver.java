package com.whatsapp.systemreceivers.boot;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0x2;
import X.AnonymousClass2A1;
import X.AnonymousClass5I0;
import X.C107695bk;
import X.C1226965j;
import X.C129496aP;
import X.C129526aS;
import X.C162457s7;
import X.C18260x0;
import X.C18270x1;
import X.C18280x3;
import X.C51072jE;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;

public final class BootReceiver extends BroadcastReceiver {
    public AnonymousClass5I0 A00;
    public final Object A01;
    public volatile boolean A02;

    public void onReceive(Context context, Intent intent) {
        if (!this.A02) {
            synchronized (this.A01) {
                if (!this.A02) {
                    C107695bk A002 = AnonymousClass2A1.A00(context);
                    C129496aP builderWithExpectedSize = C129526aS.builderWithExpectedSize(6);
                    builderWithExpectedSize.addAll(C107695bk.A68());
                    builderWithExpectedSize.add((Object) A002.AMf());
                    builderWithExpectedSize.add((Object) A002.AN6());
                    builderWithExpectedSize.add((Object) A002.AN0());
                    builderWithExpectedSize.add((Object) A002.ANt());
                    builderWithExpectedSize.add((Object) A002.AKa());
                    this.A00 = new AnonymousClass5I0((C51072jE) A002.ACP.ATh.get(), builderWithExpectedSize.build());
                    this.A02 = true;
                }
            }
        }
        C162457s7.A0J(context, 0);
        if (intent != null && C18280x3.A1V(intent, "android.intent.action.BOOT_COMPLETED")) {
            AnonymousClass5I0 r1 = this.A00;
            if (r1 == null) {
                throw C18270x1.A0S("bootManager");
            } else if (C18280x3.A1V(intent, "android.intent.action.BOOT_COMPLETED")) {
                Log.i("BootManager; boot completed.");
                if (r1.A00.A02()) {
                    for (C1226965j r2 : r1.A01) {
                        StringBuilder A0o = AnonymousClass001.A0o();
                        C18260x0.A1T(A0o, "BootManager; notifying ", r2);
                        AnonymousClass0x2.A18(A0o);
                        r2.BNk();
                    }
                    return;
                }
                Log.d("BootManager; user is not logged in, skipping...");
            }
        }
    }

    public BootReceiver(int i) {
        this.A02 = false;
        this.A01 = AnonymousClass002.A0D();
    }

    public BootReceiver() {
        this(0);
    }
}
