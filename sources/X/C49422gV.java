package X;

import java.util.Map;
import java.util.Set;

/* renamed from: X.2gV  reason: invalid class name and case insensitive filesystem */
public class C49422gV {
    public final C56612sH A00;
    public final Map A01 = AnonymousClass001.A0t();
    public final Set A02 = AnonymousClass002.A0K();
    public final Set A03 = AnonymousClass002.A0K();

    public void A00(String[] strArr) {
        Set set = this.A03;
        synchronized (set) {
            set.removeAll(C627336j.A0C(strArr));
        }
    }

    public boolean A01(AnonymousClass2z0 r3) {
        boolean add;
        Set set = this.A02;
        synchronized (set) {
            add = set.add(r3);
        }
        return add;
    }

    public C49422gV(C56612sH r2) {
        this.A00 = r2;
    }
}
