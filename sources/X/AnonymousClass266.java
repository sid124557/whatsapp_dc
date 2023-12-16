package X;

import com.whatsapp.util.Log;

/* renamed from: X.266  reason: invalid class name */
public class AnonymousClass266 {
    public static void A00(C55682qk r3, String str, String str2, Throwable th) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("migration-failed-");
        A0o.append(str2);
        String A0V = AnonymousClass000.A0V("-", str, A0o);
        Log.e(A0V, th);
        r3.A0A(A0V, true, th.toString());
    }
}
