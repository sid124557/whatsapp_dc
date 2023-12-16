package X;

import android.util.LongSparseArray;

/* renamed from: X.0OT  reason: invalid class name */
public final class AnonymousClass0OT {
    public final LongSparseArray A00;
    public final C157997jG A01;
    public final C152987aU A02;

    public final C160247nJ A00(AnonymousClass84O r4, boolean z) {
        Object[] A0M = AnonymousClass002.A0M();
        AnonymousClass000.A1P(A0M, r4.A0C(), 0);
        long A0L = (long) AnonymousClass001.A0L(Boolean.valueOf(z), A0M, 1);
        C160247nJ r0 = (C160247nJ) this.A00.get(A0L);
        if (r0 == null) {
            return (C160247nJ) this.A01.A00(A0L);
        }
        return r0;
    }

    public final void A01(C160247nJ r5, AnonymousClass84O r6, boolean z) {
        C162457s7.A0J(r5, 1);
        Object[] A0M = AnonymousClass002.A0M();
        AnonymousClass000.A1P(A0M, r6.A0C(), 0);
        long A0L = (long) AnonymousClass001.A0L(Boolean.valueOf(z), A0M, 1);
        this.A00.put(A0L, r5);
        this.A01.A01(A0L, r5);
    }

    public AnonymousClass0OT(C152987aU r3, AnonymousClass84O r4) {
        this.A02 = r3;
        this.A00 = new LongSparseArray(r4.A0Q().size());
        this.A01 = r3.A03();
    }
}
