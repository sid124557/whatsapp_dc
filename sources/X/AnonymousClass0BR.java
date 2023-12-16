package X;

/* renamed from: X.0BR  reason: invalid class name */
public final class AnonymousClass0BR extends AnonymousClass0QP {
    public boolean A02(AnonymousClass0TD r2, AnonymousClass0TD r3, C10090hN r4) {
        synchronized (r4) {
            if (r4.listeners != r2) {
                return false;
            }
            r4.listeners = r3;
            return true;
        }
    }

    public boolean A03(C05970Vr r2, C05970Vr r3, C10090hN r4) {
        synchronized (r4) {
            if (r4.waiters != r2) {
                return false;
            }
            r4.waiters = r3;
            return true;
        }
    }

    public boolean A04(C10090hN r2, Object obj, Object obj2) {
        synchronized (r2) {
            if (r2.value != obj) {
                return false;
            }
            r2.value = obj2;
            return true;
        }
    }

    public void A00(C05970Vr r1, C05970Vr r2) {
        r1.next = r2;
    }

    public void A01(C05970Vr r1, Thread thread) {
        r1.thread = thread;
    }
}
