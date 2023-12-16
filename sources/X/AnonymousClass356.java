package X;

import com.whatsapp.util.Log;

/* renamed from: X.356  reason: invalid class name */
public final class AnonymousClass356 {
    public static final void A01(String str) {
        C162457s7.A0J(str, 0);
        Log.d(A00(str));
    }

    public static final void A02(String str) {
        C162457s7.A0J(str, 0);
        Log.e(A00(str));
    }

    public static final void A03(String str) {
        C162457s7.A0J(str, 0);
        Log.i(A00(str));
    }

    public static void A04(String str, Throwable th) {
        C162457s7.A0J(str, 0);
        Log.e(A00(str), th);
    }

    public static final String A00(String str) {
        return AnonymousClass000.A0V("[WAFFLE] ", str, AnonymousClass001.A0o());
    }

    public static void A05(StringBuilder sb, String str) {
        sb.append(str);
        A01(sb.toString());
    }
}
