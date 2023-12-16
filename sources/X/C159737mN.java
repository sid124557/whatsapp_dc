package X;

import android.util.Log;
import com.whatsapp.R;
import java.util.Map;

/* renamed from: X.7mN  reason: invalid class name and case insensitive filesystem */
public class C159737mN {
    public static volatile AnonymousClass84G A00;

    public static void A00(C153427bI r10, String str, String str2, Throwable th) {
        C181918nZ r2;
        String str3;
        String str4;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("[");
        String str5 = str;
        A0o.append(str);
        Log.e("Whatsapp", AnonymousClass000.A0X("] ", A0o), th);
        Log.e("Whatsapp", C18260x0.A06("[", str, "] "), th);
        if (A00 != null && (r2 = A00.A00) != null) {
            if (r10 == null) {
                str3 = null;
            } else {
                str3 = (String) r10.A01.get(R.id.bk_context_key_logging_id);
            }
            if (th != null) {
                str4 = th.toString();
            } else {
                str4 = "Undefined error";
            }
            if (str3 == null) {
                str3 = null;
            }
            r2.Bje(str2, str4, str3, "", "", str5, (Map) null, 0);
        }
    }

    public static void A01(String str, String str2) {
        StringBuilder A0p = AnonymousClass001.A0p();
        A0p.append(str);
        Log.e("Whatsapp", AnonymousClass000.A0V("] ", str2, A0p));
        A00((C153427bI) null, str, str2, (Throwable) null);
    }

    public static void A02(String str, Throwable th) {
        StringBuilder A0p = AnonymousClass001.A0p();
        A0p.append(str);
        Log.e("Whatsapp", AnonymousClass000.A0P(th, "] ", A0p));
        A00((C153427bI) null, str, "", th);
    }
}
