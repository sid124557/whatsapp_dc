package X;

/* renamed from: X.3FC  reason: invalid class name */
public class AnonymousClass3FC implements C836349e {
    public final C56982ss A00;

    public boolean B3H(C95814uZ r4) {
        boolean z;
        Boolean valueOf;
        Boolean bool = Boolean.TRUE;
        AnonymousClass31A A01 = C56982ss.A01(this.A00, r4);
        if (A01 == null) {
            valueOf = null;
        } else {
            synchronized (A01) {
                z = A01.A0l;
            }
            valueOf = Boolean.valueOf(z);
        }
        return bool.equals(valueOf);
    }

    public AnonymousClass3FC(C56982ss r1) {
        this.A00 = r1;
    }
}
