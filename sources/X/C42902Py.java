package X;

import android.util.Pair;
import com.whatsapp.jid.UserJid;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.2Py  reason: invalid class name and case insensitive filesystem */
public class C42902Py {
    public final Pair A00;
    public final AnonymousClass8OQ A01;
    public final AnonymousClass8OQ A02;
    public final UserJid A03;

    public C42902Py(Pair pair, UserJid userJid, HashMap hashMap, HashMap hashMap2) {
        this.A03 = userJid;
        this.A00 = pair;
        this.A01 = AnonymousClass8OQ.copyOf((Map) hashMap);
        this.A02 = AnonymousClass8OQ.copyOf((Map) hashMap2);
    }
}
