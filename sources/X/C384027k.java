package X;

import android.os.Bundle;
import com.whatsapp.jid.Jid;

/* renamed from: X.27k  reason: invalid class name and case insensitive filesystem */
public final class C384027k {
    public static void A00(Bundle bundle, Jid jid, String str) {
        if (!bundle.containsKey(str)) {
            bundle.putString(str, C627336j.A07(jid));
            return;
        }
        throw AnonymousClass000.A0F(" already used", AnonymousClass000.A0l(str));
    }
}
