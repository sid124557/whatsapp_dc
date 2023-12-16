package X;

/* renamed from: X.6MZ  reason: invalid class name */
public class AnonymousClass6MZ extends AnonymousClass6Ma {
    public void finalize() {
        boolean A1X;
        synchronized (this) {
            A1X = AnonymousClass000.A1X(this.A00);
        }
        if (!A1X) {
            Object[] A0M = AnonymousClass002.A0M();
            A0M[0] = C18310x6.A0n(this);
            AnonymousClass000.A1M(A0M, System.identityHashCode(this));
            C161577py.A04("DefaultCloseableStaticBitmap", "finalize: %s %x still open.", A0M);
            try {
                close();
            } finally {
                super.finalize();
            }
        }
    }

    public AnonymousClass6MZ(C172258Kh r1, C157847iz r2) {
        super(r1, r2);
    }
}
