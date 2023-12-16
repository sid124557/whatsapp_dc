package X;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.0JQ  reason: invalid class name */
public class AnonymousClass0JQ implements C16410tE {
    public Object A00;
    public final int A01;

    public AnonymousClass0JQ(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BQe(long j) {
        int i = this.A01;
        Object obj = this.A00;
        if (i != 0) {
            ((AtomicLong) obj).addAndGet(j);
        } else {
            C17710w2.A00((C17710w2) obj, j);
        }
    }
}
