package X;

import android.util.LongSparseArray;

/* renamed from: X.0OS  reason: invalid class name */
public final class AnonymousClass0OS {
    public final LongSparseArray A00;
    public final LongSparseArray A01;
    public final C152987aU A02;

    public AnonymousClass0OS(C152987aU r5, AnonymousClass84O r6) {
        this.A02 = r5;
        int A0C = r6.A0C();
        LongSparseArray longSparseArray = new LongSparseArray(r6.A0Q().size());
        long j = (long) A0C;
        r5.A03().A01(j, longSparseArray);
        this.A01 = longSparseArray;
        this.A00 = (LongSparseArray) r5.A03().A00(j);
    }

    public final C160247nJ A00(AnonymousClass84O r5) {
        LongSparseArray longSparseArray;
        long A0C = (long) r5.A0C();
        C151627Vn r0 = (C151627Vn) this.A01.get(A0C);
        if (r0 == null && ((longSparseArray = this.A00) == null || (r0 = (C151627Vn) longSparseArray.get(A0C)) == null)) {
            return null;
        }
        return r0.A01().A01();
    }

    public final C151627Vn A01(AnonymousClass6NK r5, AnonymousClass84O r6) {
        long A0C = (long) r6.A0C();
        C151627Vn r3 = new C151627Vn(r5, r6);
        this.A01.put(A0C, r3);
        return r3;
    }
}
