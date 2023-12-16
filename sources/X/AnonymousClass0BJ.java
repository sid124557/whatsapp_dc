package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: X.0BJ  reason: invalid class name */
public final class AnonymousClass0BJ extends AnonymousClass0BL {
    public /* bridge */ /* synthetic */ Object A03() {
        String action;
        int hashCode;
        Intent registerReceiver = this.A01.registerReceiver((BroadcastReceiver) null, A06());
        boolean z = true;
        if (!(registerReceiver == null || registerReceiver.getAction() == null || ((action = registerReceiver.getAction()) != null && (hashCode = action.hashCode()) != -1181163412 && hashCode == -730838620 && action.equals("android.intent.action.DEVICE_STORAGE_OK")))) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public IntentFilter A06() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    public AnonymousClass0BJ(Context context, C16180sb r2) {
        super(context, r2);
    }

    public void A07(Intent intent) {
        Boolean bool;
        if (intent.getAction() != null) {
            C06240Wu A00 = C06240Wu.A00();
            String str = C03240Jj.A00;
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Received ");
            C06240Wu.A03(A00, intent.getAction(), str, A0o);
            String action = intent.getAction();
            if (action != null) {
                int hashCode = action.hashCode();
                if (hashCode != -1181163412) {
                    if (hashCode == -730838620 && action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                        bool = Boolean.TRUE;
                    } else {
                        return;
                    }
                } else if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                    bool = Boolean.FALSE;
                } else {
                    return;
                }
                A02(bool);
            }
        }
    }
}
