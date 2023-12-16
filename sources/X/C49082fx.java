package X;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2fx  reason: invalid class name and case insensitive filesystem */
public class C49082fx {
    public final HashSet A00 = AnonymousClass002.A0K();
    public final LinkedHashMap A01 = C18320x8.A0r();
    public final /* synthetic */ C54462ol A02;

    public synchronized void A00() {
        Iterator A0u = AnonymousClass001.A0u(this.A01);
        while (A0u.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0u);
            HashSet hashSet = this.A00;
            if (!hashSet.contains(A0w.getKey())) {
                break;
            }
            C624134x r4 = (C624134x) A0w.getValue();
            A0u.remove();
            hashSet.remove(A0w.getKey());
            C54462ol r3 = this.A02;
            AnonymousClass2z0 r2 = r4.A1J;
            boolean z = r2.A00 instanceof C95804uY;
            C66423Lj r0 = (C66423Lj) r3.A00.get();
            if (z) {
                r0.A02(r4);
            } else {
                r0.A01(r4);
            }
            C18260x0.A1P(AnonymousClass001.A0o(), "media-message-send-queue/send ", r2);
        }
    }

    public synchronized String toString() {
        StringBuilder A0o;
        A0o = AnonymousClass001.A0o();
        A0o.append("[pending:");
        A0o.append(this.A01.size());
        A0o.append(" ready:");
        A0o.append(this.A00.size());
        return AnonymousClass000.A0f(A0o);
    }

    public C49082fx(C54462ol r2) {
        this.A02 = r2;
    }
}
