package X;

import java.util.Map;

/* renamed from: X.5Py  reason: invalid class name and case insensitive filesystem */
public class C104175Py {
    public final C56612sH A00;
    public final AnonymousClass4FV A01;
    public final Map A02 = AnonymousClass001.A0t();

    public final void A00(int i, String str, boolean z) {
        C94684rk r1 = new C94684rk();
        r1.A02 = Integer.valueOf(i);
        r1.A04 = (Long) this.A02.get(str);
        r1.A00 = Boolean.valueOf(z);
        this.A01.BhD(r1);
    }

    public void A01(String str, boolean z) {
        C94684rk r1 = new C94684rk();
        r1.A02 = C18290x4.A0c();
        r1.A04 = (Long) this.A02.get(str);
        r1.A00 = Boolean.TRUE;
        r1.A01 = Boolean.valueOf(z);
        this.A01.BhD(r1);
    }

    public C104175Py(C56612sH r2, AnonymousClass4FV r3) {
        this.A00 = r2;
        this.A01 = r3;
    }
}
