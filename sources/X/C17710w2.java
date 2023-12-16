package X;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.0w2  reason: invalid class name and case insensitive filesystem */
public class C17710w2 extends C04150Mz {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public C17710w2(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj2;
        this.A01 = obj;
        this.A02 = obj3;
    }

    public static /* synthetic */ void A00(C17710w2 r5, long j) {
        AnonymousClass0YL r52 = (AnonymousClass0YL) r5.A00;
        AtomicLong atomicLong = r52.A0j;
        atomicLong.addAndGet(j);
        if (j >= 10240) {
            r52.A0H.A0R(atomicLong.get(), r52.A0h.get());
        }
    }

    public /* bridge */ /* synthetic */ Object A01(int i) {
        AnonymousClass0JQ r4;
        AnonymousClass0Y7 r3;
        C05580Ub r6;
        AnonymousClass0UO r7;
        C04710Qi r5;
        if (this.A03 != 0) {
            AnonymousClass0WK r2 = (AnonymousClass0WK) this.A00;
            r3 = r2.A06;
            r6 = (C05580Ub) this.A01;
            r7 = (AnonymousClass0UO) this.A02;
            AtomicLong atomicLong = r2.A0Q;
            Objects.requireNonNull(atomicLong);
            r4 = new AnonymousClass0JQ(atomicLong, 1);
            r5 = r2.A05;
        } else {
            r4 = new AnonymousClass0JQ(this, 0);
            AnonymousClass0YL r0 = (AnonymousClass0YL) this.A00;
            r3 = r0.A0L;
            r6 = (C05580Ub) this.A01;
            r7 = (AnonymousClass0UO) this.A02;
            r5 = r0.A0K;
        }
        AnonymousClass0UI A0A = r3.A0A(r4, r5, r6, r7, i);
        r7.A03();
        return A0A;
    }
}
