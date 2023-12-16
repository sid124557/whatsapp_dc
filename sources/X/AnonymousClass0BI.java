package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;

/* renamed from: X.0BI  reason: invalid class name */
public final class AnonymousClass0BI extends AnonymousClass0BL {
    public /* bridge */ /* synthetic */ Object A03() {
        Intent registerReceiver = this.A01.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            C06240Wu.A00();
            Log.e(C03210Jg.A00, "getInitialState - null intent received");
            return Boolean.FALSE;
        }
        int intExtra = registerReceiver.getIntExtra("status", -1);
        float intExtra2 = ((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1));
        boolean z = true;
        if (intExtra != 1 && intExtra2 <= 0.15f) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public IntentFilter A06() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    public AnonymousClass0BI(Context context, C16180sb r2) {
        super(context, r2);
    }

    public void A07(Intent intent) {
        Boolean bool;
        if (intent.getAction() != null) {
            C06240Wu A00 = C06240Wu.A00();
            String str = C03210Jg.A00;
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Received ");
            C06240Wu.A03(A00, intent.getAction(), str, A0o);
            String action = intent.getAction();
            if (action != null) {
                int hashCode = action.hashCode();
                if (hashCode != -1980154005) {
                    if (hashCode == 490310653 && action.equals("android.intent.action.BATTERY_LOW")) {
                        bool = Boolean.FALSE;
                    } else {
                        return;
                    }
                } else if (action.equals("android.intent.action.BATTERY_OKAY")) {
                    bool = Boolean.TRUE;
                } else {
                    return;
                }
                A02(bool);
            }
        }
    }
}
