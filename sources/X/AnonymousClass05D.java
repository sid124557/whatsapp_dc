package X;

/* renamed from: X.05D  reason: invalid class name */
public final class AnonymousClass05D extends AnonymousClass0QM {
    public boolean A02(AnonymousClass0T9 r2, AnonymousClass0T9 r3, C10080hM r4) {
        synchronized (r4) {
            if (r4.listeners != r2) {
                return false;
            }
            r4.listeners = r3;
            return true;
        }
    }

    public boolean A03(C05950Vp r2, C05950Vp r3, C10080hM r4) {
        synchronized (r4) {
            if (r4.waiters != r2) {
                return false;
            }
            r4.waiters = r3;
            return true;
        }
    }

    public boolean A04(C10080hM r3, Object obj, Object obj2) {
        synchronized (r3) {
            if (r3.value != null) {
                return false;
            }
            r3.value = obj2;
            return true;
        }
    }

    public void A00(C05950Vp r1, C05950Vp r2) {
        r1.next = r2;
    }

    public void A01(C05950Vp r1, Thread thread) {
        r1.thread = thread;
    }
}
