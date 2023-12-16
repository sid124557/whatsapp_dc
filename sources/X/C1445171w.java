package X;

import android.text.TextUtils;

/* renamed from: X.71w  reason: invalid class name and case insensitive filesystem */
public class C1445171w {
    public static void A00(String str, String str2, Object... objArr) {
        C156507gk r2 = C156507gk.A03;
        if (!r2.A02 && !TextUtils.isEmpty("DEVICE_ID") && !TextUtils.isEmpty("player")) {
            r2.A00.offer(new C46282bN(str, str2, objArr));
        }
    }
}
