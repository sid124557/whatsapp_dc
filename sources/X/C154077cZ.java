package X;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;

/* renamed from: X.7cZ  reason: invalid class name and case insensitive filesystem */
public class C154077cZ {
    public static boolean A01(Intent intent) {
        if (C18280x3.A1V(intent, "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT")) {
            return false;
        }
        return "1".equals(intent.getStringExtra("google.c.a.e"));
    }

    public static void A00(Intent intent, String str) {
        String str2;
        Bundle A08 = AnonymousClass002.A08();
        String stringExtra = intent.getStringExtra("google.c.a.c_id");
        if (stringExtra != null) {
            A08.putString("_nmid", stringExtra);
        }
        String stringExtra2 = intent.getStringExtra("google.c.a.c_l");
        if (stringExtra2 != null) {
            A08.putString("_nmn", stringExtra2);
        }
        String stringExtra3 = intent.getStringExtra("google.c.a.m_l");
        if (!TextUtils.isEmpty(stringExtra3)) {
            A08.putString("label", stringExtra3);
        }
        String stringExtra4 = intent.getStringExtra("google.c.a.m_c");
        if (!TextUtils.isEmpty(stringExtra4)) {
            A08.putString("message_channel", stringExtra4);
        }
        String stringExtra5 = intent.getStringExtra("from");
        if (stringExtra5 != null && stringExtra5.startsWith("/topics/")) {
            A08.putString("_nt", stringExtra5);
        }
        if (intent.hasExtra("google.c.a.ts")) {
            try {
                A08.putInt("_nmt", Integer.parseInt(intent.getStringExtra("google.c.a.ts")));
            } catch (NumberFormatException e) {
                Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e);
            }
        }
        if (intent.hasExtra("google.c.a.udt")) {
            try {
                A08.putInt("_ndt", Integer.parseInt(intent.getStringExtra("google.c.a.udt")));
            } catch (NumberFormatException e2) {
                Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e2);
            }
        }
        if ("_nr".equals(str) || "_nf".equals(str)) {
            if (intent.getExtras() == null || !C159007kw.A01(intent.getExtras())) {
                str2 = "data";
            } else {
                str2 = "display";
            }
            A08.putString("_nmc", str2);
        }
        if (AnonymousClass6C9.A1Q("FirebaseMessaging")) {
            String valueOf = String.valueOf(A08);
            StringBuilder A0o = AnonymousClass6C7.A0o(AnonymousClass6C7.A06(str) + 22, valueOf);
            A0o.append("Sending event=");
            A0o.append(str);
            AnonymousClass6C7.A1G(" params=", valueOf, "FirebaseMessaging", A0o);
        }
        C161757qO A00 = C161757qO.A00();
        A00.A02();
        A00.A02.A02(C178958iN.class);
        Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
    }
}
