package X;

import android.util.Log;

/* renamed from: X.0Wu  reason: invalid class name and case insensitive filesystem */
public class C06240Wu {
    public static final Object A01 = AnonymousClass002.A0D();
    public static volatile C06240Wu A02;
    public final int A00;

    public static C06240Wu A00() {
        C06240Wu r0;
        synchronized (A01) {
            if (A02 == null) {
                A02 = new C06240Wu(3);
            }
            r0 = A02;
        }
        return r0;
    }

    public void A04(String str, String str2) {
        if (this.A00 <= 3) {
            Log.d(str, str2);
        }
    }

    public C06240Wu(int i) {
        this.A00 = i;
    }

    public static String A01(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            str = str.substring(0, 20);
        }
        return AnonymousClass000.A0X(str, sb);
    }

    public static void A02(C06240Wu r1, Object obj, String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(obj);
        r1.A04(str2, sb.toString());
    }

    public static void A03(C06240Wu r1, String str, String str2, StringBuilder sb) {
        sb.append(str);
        r1.A04(str2, sb.toString());
    }
}
