package X;

/* renamed from: X.3cf  reason: invalid class name and case insensitive filesystem */
public abstract class C71783cf implements Runnable, Comparable, AnonymousClass4C7, C834648m {
    public int A00 = -1;
    public long A01;
    public volatile Object _heap;

    public final void dispose() {
        AnonymousClass479 r3;
        synchronized (this) {
            Object obj = this._heap;
            AnonymousClass2XH r2 = C39422Bx.A01;
            if (obj != r2) {
                if ((obj instanceof AnonymousClass479) && (r3 = (AnonymousClass479) obj) != null) {
                    synchronized (r3) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof C60632ys) && ((C60632ys) obj2) != null) {
                            r3.A01(this.A00);
                        }
                    }
                }
                this._heap = r2;
            }
        }
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int i = ((this.A01 - ((C71783cf) obj).A01) > 0 ? 1 : ((this.A01 - ((C71783cf) obj).A01) == 0 ? 0 : -1));
        if (i > 0) {
            return 1;
        }
        if (i < 0) {
            return -1;
        }
        return 0;
    }

    public C71783cf(long j) {
        this.A01 = j;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Delayed[nanos=");
        A0o.append(this.A01);
        return AnonymousClass0x2.A0f(A0o);
    }
}
