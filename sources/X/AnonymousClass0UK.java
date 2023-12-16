package X;

import android.view.View;

/* renamed from: X.0UK  reason: invalid class name */
public final class AnonymousClass0UK {
    public final int A00;
    public final C172498Lj A01;

    public final C172498Lj A02() {
        return this.A01;
    }

    public final boolean A03() {
        C172498Lj r1 = this.A01;
        if (r1 == null || !C172498Lj.A01(this.A00, r1)) {
            return false;
        }
        return true;
    }

    public final boolean A04() {
        C172498Lj r0 = this.A01;
        if (r0 == null || C154527dJ.A00(this.A00, r0.A02()) <= 0) {
            return true;
        }
        return false;
    }

    public final int A00() {
        int A02;
        int i;
        if (A03()) {
            A02 = this.A00;
            i = 1073741824;
        } else {
            C172498Lj r0 = this.A01;
            if (r0 == null) {
                return C159577m7.A00();
            }
            A02 = r0.A02();
            i = Integer.MIN_VALUE;
        }
        return View.MeasureSpec.makeMeasureSpec(A02, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003e, code lost:
        if (r5.compareTo(r2) > 0) goto L_0x0015;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0041, code lost:
        r2 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r5.compareTo(r3) < 0) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A01(int r7) {
        /*
            r6 = this;
            X.8Lj r5 = X.C172498Lj.A00(r7)
            int r4 = r6.A00
            X.8Lj r3 = X.C172498Lj.A00(r4)
            X.8Lj r0 = r6.A01
            if (r0 != 0) goto L_0x001a
            int r0 = r5.compareTo(r3)
            if (r0 >= 0) goto L_0x0041
        L_0x0014:
            r2 = r3
        L_0x0015:
            int r0 = r2.A02()
            return r0
        L_0x001a:
            int r2 = r0.A02()
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r4 ^ r0
            r0 = r0 ^ r2
            int r0 = java.lang.Integer.compare(r1, r0)
            if (r0 >= 0) goto L_0x002a
            r4 = r2
        L_0x002a:
            X.8Lj r2 = X.C172498Lj.A00(r4)
            int r0 = r3.compareTo(r2)
            if (r0 > 0) goto L_0x0043
            int r0 = r5.compareTo(r3)
            if (r0 < 0) goto L_0x0014
            int r0 = r5.compareTo(r2)
            if (r0 <= 0) goto L_0x0041
            goto L_0x0015
        L_0x0041:
            r2 = r5
            goto L_0x0015
        L_0x0043:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Cannot coerce value to an empty range: maximum "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " is less than minimum "
            r1.append(r0)
            r1.append(r3)
            r0 = 46
            java.lang.String r0 = X.AnonymousClass001.A0j(r1, r0)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0UK.A01(int):int");
    }

    public /* synthetic */ AnonymousClass0UK(C172498Lj r1, C378924l r2, int i) {
        this(r1, i);
    }

    public AnonymousClass0UK(C172498Lj r1, int i) {
        this.A00 = i;
        this.A01 = r1;
    }
}
