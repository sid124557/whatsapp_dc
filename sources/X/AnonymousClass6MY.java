package X;

/* renamed from: X.6MY  reason: invalid class name */
public class AnonymousClass6MY extends C1679783n {
    public AnonymousClass7AP A00;

    public void close() {
        synchronized (this) {
            AnonymousClass7AP r1 = this.A00;
            if (r1 != null) {
                this.A00 = null;
                synchronized (r1) {
                }
            }
        }
    }

    public void finalize() {
        boolean A1X;
        synchronized (this) {
            A1X = AnonymousClass000.A1X(this.A00);
        }
        if (!A1X) {
            Object[] A0M = AnonymousClass002.A0M();
            A0M[0] = C18310x6.A0n(this);
            AnonymousClass000.A1M(A0M, System.identityHashCode(this));
            C161577py.A04("CloseableImage", "finalize: %s %x still open.", A0M);
            try {
                close();
            } finally {
                super.finalize();
            }
        }
    }

    public synchronized int getSizeInBytes() {
        int i;
        AnonymousClass7AP r0 = this.A00;
        if (r0 == null) {
            i = 0;
        } else {
            i = r0.A00.getSizeInBytes();
        }
        return i;
    }

    public AnonymousClass6MY(AnonymousClass7AP r1) {
        this.A00 = r1;
    }

    public AnonymousClass6MY() {
    }
}
