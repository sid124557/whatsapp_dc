package X;

import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: X.2lK  reason: invalid class name and case insensitive filesystem */
public class C52342lK {
    public int A00 = 0;
    public final C04840Qw A01 = new C85624Gz(this);
    public final Map A02 = AnonymousClass001.A0t();

    public synchronized C624134x A00(AnonymousClass2z0 r5) {
        C624134x r2;
        C04840Qw r3 = this.A01;
        r2 = (C624134x) r3.A04(r5);
        if (r2 == null) {
            Map map = this.A02;
            WeakReference weakReference = (WeakReference) map.get(r5);
            if (weakReference != null) {
                r2 = (C624134x) weakReference.get();
                map.remove(r5);
                if (r2 != null) {
                    r3.A08(r5, r2);
                }
            }
        }
        return r2;
    }

    public synchronized void A01(C624134x r2, AnonymousClass2z0 r3) {
        this.A02.remove(r3);
        this.A01.A08(r3, r2);
    }

    public synchronized void A02(AnonymousClass2z0 r2) {
        this.A02.remove(r2);
        this.A01.A05(r2);
    }
}
