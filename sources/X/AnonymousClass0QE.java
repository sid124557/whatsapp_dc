package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.0QE  reason: invalid class name */
public abstract class AnonymousClass0QE {
    public final AnonymousClass0R5 A00;
    public final AtomicBoolean A01 = new AtomicBoolean(false);
    public final AnonymousClass66R A02 = C154517dI.A01(new C14060oZ(this));

    public abstract String A03();

    public void A04(C17320vK r3) {
        C162457s7.A0J(r3, 0);
        if (r3 == A02()) {
            this.A01.set(false);
        }
    }

    public C17320vK A01() {
        AnonymousClass0R5 r3 = this.A00;
        r3.A08();
        if (this.A01.compareAndSet(false, true)) {
            return A02();
        }
        return r3.A01(A03());
    }

    public final C17320vK A02() {
        return (C17320vK) this.A02.getValue();
    }

    public AnonymousClass0QE(AnonymousClass0R5 r3) {
        this.A00 = r3;
    }

    public static C17320vK A00(AnonymousClass0R5 r2, AnonymousClass0QE r3, String str) {
        C17320vK A012 = r3.A01();
        A012.Axu(1, str);
        r2.A0A();
        return A012;
    }
}
