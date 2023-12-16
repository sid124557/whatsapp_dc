package X;

import android.util.SparseIntArray;

/* renamed from: X.7i4  reason: invalid class name and case insensitive filesystem */
public final class C157297i4 {
    public C158267jh A00;
    public final SparseIntArray A01;

    public C157297i4(C158267jh r2) {
        this.A01 = new SparseIntArray();
        C162177rO.A02(r2);
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
        r3 = r6.B9m();
        r2 = r4.A01;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A00(android.content.Context r5, X.C187688xe r6) {
        /*
            r4 = this;
            X.C162177rO.A02(r5)
            X.C162177rO.A02(r6)
            boolean r0 = r6.Bjr()
            r1 = 0
            if (r0 == 0) goto L_0x0031
            int r3 = r6.B9m()
            android.util.SparseIntArray r2 = r4.A01
            r0 = -1
            int r1 = r2.get(r3, r0)
            if (r1 != r0) goto L_0x0031
            r1 = 0
        L_0x001b:
            int r0 = r2.size()
            if (r1 >= r0) goto L_0x0035
            int r0 = r2.keyAt(r1)
            if (r0 <= r3) goto L_0x0032
            int r0 = r2.get(r0)
            if (r0 != 0) goto L_0x0032
            r1 = 0
        L_0x002e:
            r2.put(r3, r1)
        L_0x0031:
            return r1
        L_0x0032:
            int r1 = r1 + 1
            goto L_0x001b
        L_0x0035:
            X.7jh r0 = r4.A00
            int r1 = r0.A04(r5, r3)
            goto L_0x002e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C157297i4.A00(android.content.Context, X.8xe):int");
    }

    public C157297i4() {
        this(AnonymousClass6Q8.A00);
    }
}
