package X;

import android.view.View;

/* renamed from: X.7lS  reason: invalid class name and case insensitive filesystem */
public final class C159227lS {
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003d, code lost:
        if (X.AnonymousClass71Z.A00(X.C86664Kz.A06(r11)).A02(r11) < r5) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004e, code lost:
        if (r1 > r5) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0070, code lost:
        if (r4 != ((int) (r13 & 4294967295L))) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0087, code lost:
        if (X.AnonymousClass71Z.A00((int) r11).A01(r11) < r4) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0094, code lost:
        if (r1 > r4) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0023, code lost:
        if (r5 != ((int) ((r13 >> 32) & 4294967295L))) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A02(long r9, long r11, long r13) {
        /*
            r8 = 1
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r0 == 0) goto L_0x00a2
            int r0 = X.C86664Kz.A06(r9)
            X.7at r0 = X.AnonymousClass71Z.A00(r0)
            int r5 = r0.A02(r9)
            int r0 = r0.A04(r9)
            if (r5 != r0) goto L_0x0025
            r0 = 32
            long r1 = r13 >> r0
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r3
            int r0 = (int) r1
            r7 = 1
            if (r5 == r0) goto L_0x0026
        L_0x0025:
            r7 = 0
        L_0x0026:
            int r0 = X.C153927cH.A01(r11)
            int r6 = X.C153927cH.A01(r9)
            if (r0 > r6) goto L_0x003f
            int r0 = X.C86664Kz.A06(r11)
            X.7at r0 = X.AnonymousClass71Z.A00(r0)
            int r0 = r0.A02(r11)
            r4 = 1
            if (r0 >= r5) goto L_0x0040
        L_0x003f:
            r4 = 0
        L_0x0040:
            r0 = 32
            long r2 = r13 >> r0
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r0
            int r1 = (int) r2
            if (r6 > r1) goto L_0x0050
            r0 = 1
            if (r1 <= r5) goto L_0x0051
        L_0x0050:
            r0 = 0
        L_0x0051:
            if (r7 != 0) goto L_0x0057
            if (r4 == 0) goto L_0x00a5
            if (r0 == 0) goto L_0x00a5
        L_0x0057:
            r7 = 1
        L_0x0058:
            int r0 = (int) r9
            X.7at r0 = X.AnonymousClass71Z.A00(r0)
            int r4 = r0.A01(r9)
            int r0 = r0.A03(r9)
            if (r4 != r0) goto L_0x0072
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r13 & r5
            int r0 = (int) r1
            r5 = 1
            if (r4 == r0) goto L_0x0073
        L_0x0072:
            r5 = 0
        L_0x0073:
            int r0 = X.C153927cH.A00(r11)
            int r3 = X.C153927cH.A00(r9)
            if (r0 > r3) goto L_0x0089
            int r0 = (int) r11
            X.7at r0 = X.AnonymousClass71Z.A00(r0)
            int r0 = r0.A01(r11)
            r2 = 1
            if (r0 >= r4) goto L_0x008a
        L_0x0089:
            r2 = 0
        L_0x008a:
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r13 = r13 & r0
            int r1 = (int) r13
            if (r3 > r1) goto L_0x0096
            r0 = 1
            if (r1 <= r4) goto L_0x0097
        L_0x0096:
            r0 = 0
        L_0x0097:
            if (r5 != 0) goto L_0x009d
            if (r2 == 0) goto L_0x00a3
            if (r0 == 0) goto L_0x00a3
        L_0x009d:
            r0 = 1
        L_0x009e:
            if (r7 == 0) goto L_0x00a7
            if (r0 == 0) goto L_0x00a7
        L_0x00a2:
            return r8
        L_0x00a3:
            r0 = 0
            goto L_0x009e
        L_0x00a5:
            r7 = 0
            goto L_0x0058
        L_0x00a7:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C159227lS.A02(long, long, long):boolean");
    }

    public static final int A00(long j) {
        int A00 = C153927cH.A00(j);
        int A01 = AnonymousClass71Z.A00((int) j).A01(j);
        int i = 1073741824;
        if (A00 != A01) {
            i = Integer.MIN_VALUE;
            if (A01 == Integer.MAX_VALUE) {
                return View.MeasureSpec.makeMeasureSpec(0, 0);
            }
        }
        return View.MeasureSpec.makeMeasureSpec(A01, i);
    }

    public static final int A01(long j) {
        int A01 = C153927cH.A01(j);
        int A02 = AnonymousClass71Z.A00(C86664Kz.A06(j)).A02(j);
        int i = 1073741824;
        if (A01 != A02) {
            i = Integer.MIN_VALUE;
            if (A02 == Integer.MAX_VALUE) {
                return View.MeasureSpec.makeMeasureSpec(0, 0);
            }
        }
        return View.MeasureSpec.makeMeasureSpec(A02, i);
    }
}
