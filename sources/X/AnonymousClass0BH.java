package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.util.Log;

/* renamed from: X.0BH  reason: invalid class name */
public final class AnonymousClass0BH extends AnonymousClass0BL {
    public /* bridge */ /* synthetic */ Object A03() {
        int intExtra;
        Intent registerReceiver = this.A01.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            C06240Wu.A00();
            Log.e(C03200Jf.A00, "getInitialState - null intent received");
            return Boolean.FALSE;
        }
        boolean z = true;
        if (Build.VERSION.SDK_INT < 23 ? registerReceiver.getIntExtra("plugged", 0) == 0 : !((intExtra = registerReceiver.getIntExtra("status", -1)) == 2 || intExtra == 5)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public IntentFilter A06() {
        String str;
        IntentFilter intentFilter = new IntentFilter();
        if (Build.VERSION.SDK_INT >= 23) {
            intentFilter.addAction("android.os.action.CHARGING");
            str = "android.os.action.DISCHARGING";
        } else {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            str = "android.intent.action.ACTION_POWER_DISCONNECTED";
        }
        intentFilter.addAction(str);
        return intentFilter;
    }

    public AnonymousClass0BH(Context context, C16180sb r2) {
        super(context, r2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0037, code lost:
        if (r4.equals(r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0039, code lost:
        r0 = java.lang.Boolean.TRUE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003b, code lost:
        A02(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0029, code lost:
        if (r4.equals(r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002b, code lost:
        r0 = java.lang.Boolean.FALSE;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(android.content.Intent r6) {
        /*
            r5 = this;
            java.lang.String r4 = r6.getAction()
            if (r4 == 0) goto L_0x001f
            X.0Wu r3 = X.C06240Wu.A00()
            java.lang.String r2 = X.C03200Jf.A00
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Received "
            r1.append(r0)
            X.C06240Wu.A03(r3, r4, r2, r1)
            int r0 = r4.hashCode()
            switch(r0) {
                case -1886648615: goto L_0x0020;
                case -54942926: goto L_0x0023;
                case 948344062: goto L_0x002e;
                case 1019184907: goto L_0x0031;
                default: goto L_0x001f;
            }
        L_0x001f:
            return
        L_0x0020:
            java.lang.String r0 = "android.intent.action.ACTION_POWER_DISCONNECTED"
            goto L_0x0025
        L_0x0023:
            java.lang.String r0 = "android.os.action.DISCHARGING"
        L_0x0025:
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x001f
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            goto L_0x003b
        L_0x002e:
            java.lang.String r0 = "android.os.action.CHARGING"
            goto L_0x0033
        L_0x0031:
            java.lang.String r0 = "android.intent.action.ACTION_POWER_CONNECTED"
        L_0x0033:
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x001f
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
        L_0x003b:
            r5.A02(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0BH.A07(android.content.Intent):void");
    }
}
