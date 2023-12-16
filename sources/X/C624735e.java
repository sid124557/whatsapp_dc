package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;

/* renamed from: X.35e  reason: invalid class name and case insensitive filesystem */
public class C624735e {
    public static final boolean A00 = C107385bE.A02();
    public static final boolean A01 = C107385bE.A09();

    public static PendingIntent A02(Context context, Intent intent) {
        int i = 0;
        if (A00) {
            i = 67108864;
        }
        return PendingIntent.getForegroundService(context, 0, intent, i);
    }

    public static PendingIntent A05(Context context, Intent intent, int i) {
        if (A00) {
            i |= 67108864;
        }
        return PendingIntent.getService(context, 0, intent, i);
    }

    public static PendingIntent A00(Context context, int i, Intent intent, int i2) {
        if (A00) {
            i2 |= 67108864;
        }
        return PendingIntent.getActivity(context, i, intent, i2);
    }

    public static PendingIntent A01(Context context, int i, Intent intent, int i2) {
        if (A00) {
            i2 |= 67108864;
        }
        return PendingIntent.getBroadcast(context, i, intent, i2);
    }

    public static PendingIntent A03(Context context, Intent intent, int i) {
        return A01(context, i, intent, 134217728);
    }

    public static PendingIntent A04(Context context, Intent intent, int i) {
        return A00(context, i, intent, 134217728);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if ((r6 & androidx.core.view.inputmethod.EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING) != 16777216) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0025, code lost:
        if (android.text.TextUtils.isEmpty(r5.getPackage()) == false) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A06(android.content.Intent r5, int r6) {
        /*
            boolean r0 = X.C107385bE.A0B()
            r4 = 1
            if (r0 == 0) goto L_0x000e
            r1 = 16777216(0x1000000, float:2.3509887E-38)
            r0 = r6 & r1
            r3 = 1
            if (r0 == r1) goto L_0x000f
        L_0x000e:
            r3 = 0
        L_0x000f:
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r6 = r6 & r0
            boolean r2 = X.AnonymousClass000.A1U(r6, r0)
            android.content.ComponentName r0 = r5.getComponent()
            if (r0 != 0) goto L_0x0027
            java.lang.String r0 = r5.getPackage()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r0 = 1
            if (r1 != 0) goto L_0x0028
        L_0x0027:
            r0 = 0
        L_0x0028:
            if (r2 != 0) goto L_0x002f
            if (r3 != 0) goto L_0x002f
            if (r0 == 0) goto L_0x002f
            r4 = 0
        L_0x002f:
            java.lang.String r0 = "Apps targeting Android API 34+ (Android 14+) disallow creating or retrieving a PendingIntent with FLAG_MUTABLE with an implicit intent for security reasons. Apps will throw IllegalArgumentException on Android API 34+ devices.\nMore information in https://fburl.com/wiki/0dizbi5l"
            X.C626936e.A0D(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C624735e.A06(android.content.Intent, int):void");
    }
}
