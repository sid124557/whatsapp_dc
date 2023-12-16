package com.whatsapp.wabloks.ui;

import X.AnonymousClass9HW;
import X.C154317cy;
import X.C1899993l;
import X.C197959e9;
import X.C54522or;
import X.C58152un;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;

public class WaFcsPreloadedBloksActivity extends AnonymousClass9HW {
    public final BroadcastReceiver A00 = new C1899993l(this);

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C154317cy.A00(this.A00, this, new IntentFilter("com.whatsapp.payments.phoenix.action.launch_activity_for_phoenix_result"), (Handler) null, C58152un.A0C, true);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Bundle bundle;
        super.onActivityResult(i, i2, intent);
        if (i == 100) {
            if (intent != null) {
                bundle = intent.getExtras();
            } else {
                bundle = null;
            }
            C54522or r1 = this.A00;
            if (r1 != null) {
                r1.A01(new C197959e9(i2, bundle));
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.A00);
    }
}
