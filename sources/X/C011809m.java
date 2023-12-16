package X;

import android.view.View;

/* renamed from: X.09m  reason: invalid class name and case insensitive filesystem */
public class C011809m extends AnonymousClass09Z {
    public C05590Uc A00;
    public C05590Uc A01;

    public int[] A07(View view, C06440Xs r7) {
        int[] iArr = new int[2];
        if (r7.A17()) {
            C05590Uc r1 = this.A00;
            if (r1 == null || r1.A02 != r7) {
                r1 = new C17600vq(r7, 0);
                this.A00 = r1;
            }
            iArr[0] = AnonymousClass09Z.A00(view, r1);
        } else {
            iArr[0] = 0;
        }
        if (r7.A18()) {
            C05590Uc r12 = this.A01;
            if (r12 == null || r12.A02 != r7) {
                r12 = new C17600vq(r7, 1);
                this.A01 = r12;
            }
            iArr[1] = AnonymousClass09Z.A00(view, r12);
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0093  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A08(X.C05590Uc r21, X.C06440Xs r22, int r23, int r24) {
        /*
            r20 = this;
            r0 = 2
            int[] r3 = new int[r0]
            r1 = r20
            android.widget.Scroller r11 = r1.A00
            r12 = 0
            r16 = -2147483648(0xffffffff80000000, float:-0.0)
            r17 = 2147483647(0x7fffffff, float:NaN)
            r10 = 0
            r14 = r23
            r15 = r24
            r13 = r12
            r18 = r16
            r19 = r17
            r11.fling(r12, r13, r14, r15, r16, r17, r18, r19)
            android.widget.Scroller r0 = r1.A00
            int r0 = r0.getFinalX()
            r3[r12] = r0
            android.widget.Scroller r0 = r1.A00
            int r1 = r0.getFinalY()
            r0 = 1
            r3[r0] = r1
            r11 = r22
            int r9 = r11.A08()
            r8 = 1065353216(0x3f800000, float:1.0)
            if (r9 == 0) goto L_0x0082
            r7 = 0
            r6 = r7
            r5 = 2147483647(0x7fffffff, float:NaN)
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x003c:
            if (r10 >= r9) goto L_0x0054
            android.view.View r2 = r11.A0Q(r10)
            int r1 = X.C06440Xs.A03(r2)
            r0 = -1
            if (r1 == r0) goto L_0x0051
            if (r1 >= r5) goto L_0x004d
            r7 = r2
            r5 = r1
        L_0x004d:
            if (r1 <= r4) goto L_0x0051
            r6 = r2
            r4 = r1
        L_0x0051:
            int r10 = r10 + 1
            goto L_0x003c
        L_0x0054:
            if (r7 == 0) goto L_0x0082
            if (r6 == 0) goto L_0x0082
            r9 = r21
            int r1 = r9.A09(r7)
            int r0 = r9.A09(r6)
            int r2 = java.lang.Math.min(r1, r0)
            int r1 = r9.A06(r7)
            int r0 = r9.A06(r6)
            int r0 = java.lang.Math.max(r1, r0)
            int r0 = r0 - r2
            if (r0 == 0) goto L_0x0082
            float r1 = (float) r0
            float r1 = r1 * r8
            int r4 = r4 - r5
            int r0 = r4 + 1
            float r0 = (float) r0
            float r1 = r1 / r0
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0084
            return r12
        L_0x0082:
            r1 = 1065353216(0x3f800000, float:1.0)
        L_0x0084:
            r5 = r3[r12]
            int r4 = java.lang.Math.abs(r5)
            r0 = 1
            r2 = r3[r0]
            int r0 = java.lang.Math.abs(r2)
            if (r4 > r0) goto L_0x0094
            r5 = r2
        L_0x0094:
            float r0 = (float) r5
            float r0 = r0 / r1
            int r0 = java.lang.Math.round(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C011809m.A08(X.0Uc, X.0Xs, int, int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        r3 = r5 - 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A02(X.C06440Xs r11, int r12, int r13) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof X.C16040sN
            r6 = -1
            if (r0 == 0) goto L_0x007a
            int r5 = r11.A09()
            if (r5 == 0) goto L_0x007a
            android.view.View r0 = r10.A03(r11)
            if (r0 == 0) goto L_0x007a
            int r4 = X.C06440Xs.A03(r0)
            if (r4 == r6) goto L_0x007a
            r0 = r11
            X.0sN r0 = (X.C16040sN) r0
            int r3 = r5 + -1
            android.graphics.PointF r8 = r0.AzL(r3)
            if (r8 == 0) goto L_0x007a
            boolean r0 = r11.A17()
            r9 = 0
            r2 = 0
            if (r0 == 0) goto L_0x0077
            X.0Uc r1 = r10.A00
            if (r1 == 0) goto L_0x0032
            X.0Xs r0 = r1.A02
            if (r0 == r11) goto L_0x0039
        L_0x0032:
            X.0vq r1 = new X.0vq
            r1.<init>(r11, r2)
            r10.A00 = r1
        L_0x0039:
            int r7 = r10.A08(r1, r11, r12, r2)
            float r0 = r8.x
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x0044
            int r7 = -r7
        L_0x0044:
            boolean r0 = r11.A18()
            if (r0 == 0) goto L_0x0075
            X.0Uc r1 = r10.A01
            if (r1 == 0) goto L_0x0052
            X.0Xs r0 = r1.A02
            if (r0 == r11) goto L_0x005a
        L_0x0052:
            r0 = 1
            X.0vq r1 = new X.0vq
            r1.<init>(r11, r0)
            r10.A01 = r1
        L_0x005a:
            int r1 = r10.A08(r1, r11, r2, r13)
            float r0 = r8.y
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x0065
            int r1 = -r1
        L_0x0065:
            boolean r0 = r11.A18()
            if (r0 == 0) goto L_0x006c
            r7 = r1
        L_0x006c:
            if (r7 == 0) goto L_0x007a
            int r4 = r4 + r7
            if (r4 < 0) goto L_0x0072
            r2 = r4
        L_0x0072:
            if (r2 >= r5) goto L_0x0079
            return r2
        L_0x0075:
            r1 = 0
            goto L_0x0065
        L_0x0077:
            r7 = 0
            goto L_0x0044
        L_0x0079:
            return r3
        L_0x007a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C011809m.A02(X.0Xs, int, int):int");
    }

    public View A03(C06440Xs r10) {
        C05590Uc r7;
        if (r10.A18()) {
            r7 = this.A01;
            if (r7 == null || r7.A02 != r10) {
                r7 = new C17600vq(r10, 1);
                this.A01 = r7;
            }
        } else if (!r10.A17()) {
            return null;
        } else {
            r7 = this.A00;
            if (r7 == null || r7.A02 != r10) {
                r7 = new C17600vq(r10, 0);
                this.A00 = r7;
            }
        }
        int A08 = r10.A08();
        View view = null;
        if (A08 == 0) {
            return null;
        }
        int A04 = r7.A04() + (r7.A05() / 2);
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < A08; i2++) {
            View A0Q = r10.A0Q(i2);
            int A0A = AnonymousClass001.A0A(r7.A09(A0Q) + (r7.A07(A0Q) / 2), A04);
            if (A0A < i) {
                view = A0Q;
                i = A0A;
            }
        }
        return view;
    }
}
