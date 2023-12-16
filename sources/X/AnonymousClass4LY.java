package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.Collections;
import java.util.Set;

/* renamed from: X.4LY  reason: invalid class name */
public class AnonymousClass4LY extends BroadcastReceiver implements AnonymousClass66U {
    public boolean A00;
    public final Context A01;
    public final Set A02 = Collections.newSetFromMap(AnonymousClass0x9.A1D());

    public String BDW() {
        return "HeadsetPluggedStateMonitor";
    }

    public void BMd() {
        C154317cy.A01(this, this.A01, new IntentFilter("android.intent.action.HEADSET_PLUG"), true);
    }

    public /* synthetic */ void BMe() {
    }

    public void onReceive(Context context, Intent intent) {
        boolean z = false;
        int intExtra = intent.getIntExtra("state", 0);
        if (intExtra >= 1) {
            z = true;
        }
        if (z != this.A00) {
            this.A00 = z;
            for (C183158pa BUH : this.A02) {
                BUH.BUH(z);
            }
        }
        C18260x0.A0y("HeadsetPluggedStateMonitor/headset ", AnonymousClass001.A0o(), intExtra);
    }

    public AnonymousClass4LY(Context context) {
        this.A01 = context;
    }
}
