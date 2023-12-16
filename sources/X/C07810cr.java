package X;

import android.util.SparseArray;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.HashMap;

/* renamed from: X.0cr  reason: invalid class name and case insensitive filesystem */
public class C07810cr implements C15700rn {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public ConstraintLayout A06;
    public final /* synthetic */ ConstraintLayout A07;

    public static void A00(ConstraintLayout constraintLayout) {
        constraintLayout.A04 = 0;
        constraintLayout.A03 = 0;
        constraintLayout.A02 = Integer.MAX_VALUE;
        constraintLayout.A01 = Integer.MAX_VALUE;
        constraintLayout.A0F = true;
        constraintLayout.A05 = 263;
        constraintLayout.A0B = null;
        constraintLayout.A0A = null;
        constraintLayout.A00 = -1;
        constraintLayout.A0E = new HashMap();
        constraintLayout.A07 = new SparseArray();
        constraintLayout.A09 = new C07810cr(constraintLayout, constraintLayout);
    }

    public C07810cr(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.A07 = constraintLayout;
        this.A06 = constraintLayout2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005d, code lost:
        if (r10 == X.C02310Fr.FIXED) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0067, code lost:
        if (r11 == X.C02310Fr.FIXED) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0074, code lost:
        if (r13.A01 <= 0.0f) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007f, code lost:
        if (r13.A01 <= 0.0f) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00a2, code lost:
        if (r2 != r12.A04) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00be, code lost:
        if (r6 != false) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x013b, code lost:
        if (r4 == -1) goto L_0x009b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0126  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void BL5(X.AnonymousClass0R7 r23, X.C03990Mi r24) {
        /*
            r22 = this;
            r13 = r23
            int r2 = r13.A0N
            r1 = 8
            r0 = 0
            r12 = r24
            if (r2 != r1) goto L_0x0012
            r12.A03 = r0
            r12.A02 = r0
            r12.A01 = r0
            return
        L_0x0012:
            X.0Fr r11 = r12.A05
            X.0Fr r10 = r12.A06
            int r1 = r12.A00
            int r9 = r12.A04
            r8 = r22
            int r7 = r8.A04
            int r0 = r8.A02
            int r7 = r7 + r0
            int r14 = r8.A05
            java.lang.Object r6 = r13.A0e
            android.view.View r6 = (android.view.View) r6
            int r0 = r11.ordinal()
            r5 = 2
            r4 = 3
            r21 = 3
            r3 = 1
            r2 = 0
            if (r0 == r2) goto L_0x0207
            if (r0 == r3) goto L_0x01c8
            if (r0 == r4) goto L_0x020e
            if (r0 == r5) goto L_0x01d4
            r14 = 0
        L_0x003a:
            r20 = 0
        L_0x003c:
            int r0 = r10.ordinal()
            if (r0 == r2) goto L_0x019b
            if (r0 == r3) goto L_0x015d
            if (r0 == r4) goto L_0x01a6
            if (r0 == r5) goto L_0x0169
            r19 = 0
            r7 = 0
        L_0x004b:
            X.0Fr r0 = X.C02310Fr.MATCH_CONSTRAINT
            boolean r9 = X.AnonymousClass000.A1Y(r11, r0)
            boolean r4 = X.AnonymousClass000.A1Y(r10, r0)
            X.0Fr r1 = X.C02310Fr.MATCH_PARENT
            if (r10 == r1) goto L_0x005f
            X.0Fr r0 = X.C02310Fr.FIXED
            r18 = 0
            if (r10 != r0) goto L_0x0061
        L_0x005f:
            r18 = 1
        L_0x0061:
            if (r11 == r1) goto L_0x0069
            X.0Fr r0 = X.C02310Fr.FIXED
            r17 = 0
            if (r11 != r0) goto L_0x006b
        L_0x0069:
            r17 = 1
        L_0x006b:
            r1 = 0
            if (r9 == 0) goto L_0x0076
            float r0 = r13.A01
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r16 = 1
            if (r0 > 0) goto L_0x0078
        L_0x0076:
            r16 = 0
        L_0x0078:
            if (r4 == 0) goto L_0x0081
            float r0 = r13.A01
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r15 = 1
            if (r0 > 0) goto L_0x0082
        L_0x0081:
            r15 = 0
        L_0x0082:
            android.view.ViewGroup$LayoutParams r8 = r6.getLayoutParams()
            X.02c r8 = (X.C001702c) r8
            boolean r0 = r12.A09
            if (r0 != 0) goto L_0x00c1
            if (r9 == 0) goto L_0x00c1
            int r0 = r13.A0D
            if (r0 != 0) goto L_0x00c1
            if (r4 == 0) goto L_0x00c1
            int r0 = r13.A0C
            if (r0 != 0) goto L_0x00c1
            r5 = 0
            r4 = 0
        L_0x009a:
            r6 = 1
        L_0x009b:
            int r0 = r12.A00
            if (r5 != r0) goto L_0x00a4
            int r1 = r12.A04
            r0 = 0
            if (r2 == r1) goto L_0x00a5
        L_0x00a4:
            r0 = 1
        L_0x00a5:
            r12.A08 = r0
            boolean r0 = r8.A0z
            if (r0 == 0) goto L_0x00be
            r6 = 1
        L_0x00ac:
            r0 = -1
            if (r4 == r0) goto L_0x00b5
            int r0 = r13.A07
            if (r0 == r4) goto L_0x00b5
            r12.A08 = r3
        L_0x00b5:
            r12.A03 = r5
            r12.A02 = r2
            r12.A07 = r6
            r12.A01 = r4
            return
        L_0x00be:
            if (r6 == 0) goto L_0x00b5
            goto L_0x00ac
        L_0x00c1:
            boolean r0 = r6 instanceof X.C004605a
            if (r0 == 0) goto L_0x0158
            boolean r0 = r13 instanceof X.AnonymousClass05M
            if (r0 == 0) goto L_0x0158
            r1 = r13
            X.05M r1 = (X.AnonymousClass05M) r1
            r0 = r6
            X.05a r0 = (X.C004605a) r0
            r0.A09(r1, r14, r7)
        L_0x00d2:
            int r10 = r6.getMeasuredWidth()
            int r9 = r6.getMeasuredHeight()
            int r4 = r6.getBaseline()
            int[] r0 = r13.A0m
            if (r20 == 0) goto L_0x0153
            r0[r2] = r10
            r0[r5] = r9
        L_0x00e6:
            if (r19 == 0) goto L_0x014e
            r0[r3] = r9
            r0[r21] = r10
        L_0x00ec:
            int r0 = r13.A0H
            if (r0 <= 0) goto L_0x014c
            int r5 = java.lang.Math.max(r0, r10)
        L_0x00f4:
            int r0 = r13.A0F
            if (r0 <= 0) goto L_0x00fc
            int r5 = java.lang.Math.min(r0, r5)
        L_0x00fc:
            int r0 = r13.A0G
            if (r0 <= 0) goto L_0x014a
            int r2 = java.lang.Math.max(r0, r9)
        L_0x0104:
            int r0 = r13.A0E
            if (r0 <= 0) goto L_0x010c
            int r2 = java.lang.Math.min(r0, r2)
        L_0x010c:
            r11 = 1056964608(0x3f000000, float:0.5)
            if (r16 == 0) goto L_0x013f
            if (r18 == 0) goto L_0x013f
            float r1 = r13.A01
            float r0 = (float) r2
            float r0 = r0 * r1
            float r0 = r0 + r11
            int r5 = (int) r0
        L_0x0118:
            if (r10 != r5) goto L_0x011c
            if (r9 == r2) goto L_0x0139
        L_0x011c:
            r0 = 1073741824(0x40000000, float:2.0)
            if (r10 == r5) goto L_0x0124
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r0)
        L_0x0124:
            if (r9 == r2) goto L_0x012a
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
        L_0x012a:
            r6.measure(r14, r7)
            int r5 = r6.getMeasuredWidth()
            int r2 = r6.getMeasuredHeight()
            int r4 = r6.getBaseline()
        L_0x0139:
            r0 = -1
            r6 = 0
            if (r4 == r0) goto L_0x009b
            goto L_0x009a
        L_0x013f:
            if (r15 == 0) goto L_0x0118
            if (r17 == 0) goto L_0x0118
            float r1 = r13.A01
            float r0 = (float) r5
            float r0 = r0 / r1
            float r0 = r0 + r11
            int r2 = (int) r0
            goto L_0x0118
        L_0x014a:
            r2 = r9
            goto L_0x0104
        L_0x014c:
            r5 = r10
            goto L_0x00f4
        L_0x014e:
            r0[r3] = r2
            r0[r21] = r2
            goto L_0x00ec
        L_0x0153:
            r0[r2] = r2
            r0[r5] = r2
            goto L_0x00e6
        L_0x0158:
            r6.measure(r14, r7)
            goto L_0x00d2
        L_0x015d:
            int r0 = r8.A00
            r1 = -2
            int r7 = android.view.ViewGroup.getChildMeasureSpec(r0, r7, r1)
            int[] r0 = r13.A0m
            r0[r4] = r1
            goto L_0x018c
        L_0x0169:
            int r1 = r8.A00
            r0 = -2
            int r7 = android.view.ViewGroup.getChildMeasureSpec(r1, r7, r0)
            int r0 = r13.A0C
            boolean r8 = X.AnonymousClass000.A1U(r0, r3)
            int[] r1 = r13.A0m
            r1[r4] = r2
            boolean r0 = r12.A09
            if (r0 == 0) goto L_0x018c
            if (r8 == 0) goto L_0x0190
            r0 = r1[r5]
            if (r0 == 0) goto L_0x018c
            r1 = r1[r3]
            int r0 = r13.A04()
            if (r1 != r0) goto L_0x0190
        L_0x018c:
            r19 = 1
            goto L_0x004b
        L_0x0190:
            int r1 = r13.A04()
            r0 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            goto L_0x01c4
        L_0x019b:
            r0 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r0)
            int[] r0 = r13.A0m
            r0[r4] = r9
            goto L_0x01c4
        L_0x01a6:
            int r8 = r8.A00
            X.0Qs r0 = r13.A0W
            r1 = 0
            if (r0 == 0) goto L_0x01b1
            X.0Qs r0 = r13.A0Y
            int r1 = r0.A01
        L_0x01b1:
            X.0Qs r0 = r13.A0X
            if (r0 == 0) goto L_0x01ba
            X.0Qs r0 = r13.A0S
            int r0 = r0.A01
            int r1 = r1 + r0
        L_0x01ba:
            int r7 = r7 + r1
            r1 = -1
            int r7 = android.view.ViewGroup.getChildMeasureSpec(r8, r7, r1)
            int[] r0 = r13.A0m
            r0[r4] = r1
        L_0x01c4:
            r19 = 0
            goto L_0x004b
        L_0x01c8:
            int r0 = r8.A01
            r1 = -2
            int r14 = android.view.ViewGroup.getChildMeasureSpec(r0, r14, r1)
            int[] r0 = r13.A0m
            r0[r5] = r1
            goto L_0x01f7
        L_0x01d4:
            int r1 = r8.A01
            r0 = -2
            int r14 = android.view.ViewGroup.getChildMeasureSpec(r1, r14, r0)
            int r0 = r13.A0D
            boolean r15 = X.AnonymousClass000.A1U(r0, r3)
            int[] r1 = r13.A0m
            r1[r5] = r2
            boolean r0 = r12.A09
            if (r0 == 0) goto L_0x01f7
            if (r15 == 0) goto L_0x01fb
            r0 = r1[r4]
            if (r0 == 0) goto L_0x01f7
            r1 = r1[r2]
            int r0 = r13.A05()
            if (r1 != r0) goto L_0x01fb
        L_0x01f7:
            r20 = 1
            goto L_0x003c
        L_0x01fb:
            int r1 = r13.A05()
            r0 = 1073741824(0x40000000, float:2.0)
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            goto L_0x003a
        L_0x0207:
            r0 = 1073741824(0x40000000, float:2.0)
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            goto L_0x0224
        L_0x020e:
            int r15 = r8.A01
            X.0Qs r0 = r13.A0W
            r1 = 0
            if (r0 == 0) goto L_0x0217
            int r1 = r0.A01
        L_0x0217:
            X.0Qs r0 = r13.A0X
            if (r0 == 0) goto L_0x021e
            int r0 = r0.A01
            int r1 = r1 + r0
        L_0x021e:
            int r14 = r14 + r1
            r1 = -1
            int r14 = android.view.ViewGroup.getChildMeasureSpec(r15, r14, r1)
        L_0x0224:
            int[] r0 = r13.A0m
            r0[r5] = r1
            goto L_0x003a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07810cr.BL5(X.0R7, X.0Mi):void");
    }
}
