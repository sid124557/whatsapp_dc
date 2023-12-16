package X;

import android.util.Log;

/* renamed from: X.72d  reason: invalid class name and case insensitive filesystem */
public class C1445872d {
    public static void A00(String str, Throwable th, Object... objArr) {
        if (Log.isLoggable("Vision", 6)) {
            boolean A1Q = AnonymousClass6C9.A1Q("Vision");
            String format = String.format(str, objArr);
            if (A1Q) {
                Log.e("Vision", format, th);
                return;
            }
            String valueOf = String.valueOf(th);
            StringBuilder A0o = AnonymousClass6C7.A0o(AnonymousClass6C7.A06(format) + 2, valueOf);
            A0o.append(format);
            A0o.append(": ");
            AnonymousClass000.A1D(valueOf, "Vision", A0o);
        }
    }
}
