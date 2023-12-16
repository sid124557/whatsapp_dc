package com.whatsapp.accountswitching.notifications;

import X.AnonymousClass002;
import X.AnonymousClass2A1;
import X.C162457s7;
import X.C175738Zn;
import X.C18260x0;
import X.C18270x1;
import X.C34171uL;
import X.C620633i;
import X.C626936e;
import X.C72333dY;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public final class InactiveAccountNotificationReceiver extends BroadcastReceiver {
    public C620633i A00;
    public C34171uL A01;
    public final Object A02;
    public volatile boolean A03;

    public void onReceive(Context context, Intent intent) {
        if (!this.A03) {
            synchronized (this.A02) {
                if (!this.A03) {
                    AnonymousClass2A1.A00(context).ARC(this);
                    this.A03 = true;
                }
            }
        }
        C18260x0.A0O(context, intent);
        if (C162457s7.A0P(intent.getAction(), "com.whatsapp.accountswitching.inactiveaccount.IgnoreCall")) {
            int intExtra = intent.getIntExtra("inactiveAccountNotificationId", -1);
            String stringExtra = intent.getStringExtra("inactiveAccountNotificationTag");
            if (intExtra != -1 && stringExtra != null && !C175738Zn.A0V(stringExtra)) {
                C620633i r0 = this.A00;
                if (r0 != null) {
                    NotificationManager A0A = r0.A0A();
                    C626936e.A06(A0A);
                    A0A.cancel(stringExtra, intExtra);
                    C34171uL r02 = this.A01;
                    if (r02 != null) {
                        C72333dY.A01(r02).A0A(stringExtra);
                        return;
                    }
                    throw C18270x1.A0S("workManagerLazy");
                }
                throw C18270x1.A0S("systemServices");
            }
        }
    }

    public InactiveAccountNotificationReceiver(int i) {
        this.A03 = false;
        this.A02 = AnonymousClass002.A0D();
    }

    public InactiveAccountNotificationReceiver() {
        this(0);
    }
}
