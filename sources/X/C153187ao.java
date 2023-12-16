package X;

/* renamed from: X.7ao  reason: invalid class name and case insensitive filesystem */
public abstract class C153187ao {
    public void A00(C160067my r2, C160067my r3) {
        if (this instanceof C130036bH) {
            r2.next = r3;
        } else {
            ((C130046bI) this).A02.lazySet(r2, r3);
        }
    }

    public void A01(C160067my r2, Thread thread) {
        if (this instanceof C130036bH) {
            r2.thread = thread;
        } else {
            ((C130046bI) this).A03.lazySet(r2, thread);
        }
    }

    public boolean A02(C160107n3 r2, C160107n3 r3, C130076bL r4) {
        if (!(this instanceof C130036bH)) {
            return AnonymousClass0H6.A00(r4, r2, r3, ((C130046bI) this).A00);
        }
        synchronized (r4) {
            if (r4.listeners != r2) {
                return false;
            }
            r4.listeners = r3;
            return true;
        }
    }

    public boolean A03(C160067my r2, C160067my r3, C130076bL r4) {
        if (!(this instanceof C130036bH)) {
            return AnonymousClass0H6.A00(r4, r2, r3, ((C130046bI) this).A04);
        }
        synchronized (r4) {
            if (r4.waiters != r2) {
                return false;
            }
            r4.waiters = r3;
            return true;
        }
    }

    public boolean A04(C130076bL r3, Object obj, Object obj2) {
        if (!(this instanceof C130036bH)) {
            return AnonymousClass0H6.A00(r3, (Object) null, obj2, ((C130046bI) this).A01);
        }
        synchronized (r3) {
            if (r3.value != null) {
                return false;
            }
            r3.value = obj2;
            return true;
        }
    }
}
