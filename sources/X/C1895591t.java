package X;

import android.view.Choreographer;

/* renamed from: X.91t  reason: invalid class name and case insensitive filesystem */
public class C1895591t implements Choreographer.FrameCallback {
    public Object A00;
    public final int A01;

    public C1895591t(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01cf, code lost:
        if (r6 > r2) goto L_0x01d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01d7, code lost:
        if (r6 < r2) goto L_0x01d9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01fb  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01ff  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x020d  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x021c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void doFrame(long r46) {
        /*
            r45 = this;
            r12 = r45
            int r0 = r12.A01
            switch(r0) {
                case 0: goto L_0x0056;
                case 1: goto L_0x0019;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r2 = r12.A00
            X.7hI r2 = (X.C156837hI) r2
            X.66R r0 = r2.A05
            java.lang.Object r1 = r0.getValue()
            android.os.Handler r1 = (android.os.Handler) r1
            java.lang.Runnable r0 = r2.A03
            r1.postAtFrontOfQueue(r0)
        L_0x0018:
            return
        L_0x0019:
            java.lang.Object r0 = r12.A00
            r40 = r0
            r0 = r40
            X.7h4 r0 = (X.C156707h4) r0
            r40 = r0
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0018
            r0 = r40
            X.7jV r0 = r0.A01
            r39 = r0
            if (r0 == 0) goto L_0x0018
            long r29 = android.os.SystemClock.uptimeMillis()
            r0 = r40
            long r0 = r0.A00
            long r2 = r29 - r0
            double r0 = (double) r2
            r35 = r0
            r0 = r39
            java.util.concurrent.CopyOnWriteArraySet r0 = r0.A04
            r44 = r0
            java.util.Iterator r1 = r44.iterator()
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00b6
            r1.next()
            java.lang.String r0 = "onBeforeIntegrate"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x0056:
            java.lang.Object r9 = r12.A00
            X.7OJ r9 = (X.AnonymousClass7OJ) r9
            boolean r0 = r9.A03
            if (r0 != 0) goto L_0x0064
            android.view.Choreographer r0 = r9.A05
            r0.removeFrameCallback(r12)
            return
        L_0x0064:
            long r3 = r9.A00
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r5 = r46
            if (r0 != 0) goto L_0x0078
            r9.A00 = r5
            r9.A01 = r5
        L_0x0072:
            android.view.Choreographer r0 = r9.A05
            r0.postFrameCallback(r12)
            return
        L_0x0078:
            long r0 = r9.A01
            long r3 = r46 - r0
            r9.A01 = r5
            X.7AG r2 = r9.A02
            double r0 = (double) r3
            X.7hP r8 = r2.A00
            double r6 = r8.A04
            double r0 = r0 / r6
            long r2 = java.lang.Math.round(r0)
            r0 = 1
            long r10 = java.lang.Math.max(r2, r0)
            long r2 = r10 - r0
            r0 = 100
            long r4 = java.lang.Math.min(r2, r0)
            double r2 = (double) r4
            double r0 = r8.A01
            double r0 = r0 + r2
            r8.A01 = r0
            r13 = 4
            int r0 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x00ac
            r0 = 4616189618054758400(0x4010000000000000, double:4.0)
            double r2 = r2 / r0
            double r0 = r8.A00
            double r0 = r0 + r2
            r8.A00 = r0
        L_0x00ac:
            double r0 = (double) r10
            double r6 = r6 * r0
            long r0 = r8.A02
            double r2 = (double) r0
            double r2 = r2 + r6
            long r0 = (long) r2
            r8.A02 = r0
            goto L_0x0072
        L_0x00b6:
            r0 = r39
            java.util.Set r0 = r0.A03
            r43 = r0
            java.util.Iterator r38 = r43.iterator()
        L_0x00c0:
            boolean r0 = r38.hasNext()
            if (r0 == 0) goto L_0x0223
            java.lang.Object r14 = r38.next()
            X.7b2 r14 = (X.C153317b2) r14
            boolean r37 = r14.A04()
            if (r37 == 0) goto L_0x00dc
            boolean r0 = r14.A06
            if (r0 == 0) goto L_0x00dc
            r0 = r43
            r0.remove(r14)
            goto L_0x00c0
        L_0x00dc:
            r0 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r3 = r35 / r0
            if (r37 == 0) goto L_0x00ea
            boolean r0 = r14.A06
            if (r0 == 0) goto L_0x00ea
            goto L_0x00c0
        L_0x00ea:
            r1 = 4589276106681592316(0x3fb0624dd2f1a9fc, double:0.064)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x00f4
            r1 = r3
        L_0x00f4:
            double r10 = r14.A02
            double r10 = r10 + r1
            r14.A02 = r10
            X.7gC r0 = r14.A03
            double r8 = r0.A01
            double r15 = r0.A00
            X.7Fc r0 = r14.A07
            r42 = r0
            double r6 = r0.A00
            double r4 = r0.A01
            X.7Fc r0 = r14.A09
            r41 = r0
            double r12 = r0.A00
            double r2 = r0.A01
        L_0x010f:
            r33 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            int r0 = (r10 > r33 ? 1 : (r10 == r33 ? 0 : -1))
            if (r0 < 0) goto L_0x018b
            double r10 = r10 - r33
            r14.A02 = r10
            int r0 = (r10 > r33 ? 1 : (r10 == r33 ? 0 : -1))
            if (r0 >= 0) goto L_0x0126
            X.7Fc r0 = r14.A08
            r0.A00 = r6
            r0.A01 = r4
        L_0x0126:
            double r0 = r14.A00
            double r31 = r0 - r12
            double r31 = r31 * r8
            double r2 = r15 * r4
            double r31 = r31 - r2
            double r12 = r4 * r33
            r17 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r12 = r12 * r17
            double r12 = r12 + r6
            double r2 = r31 * r33
            double r2 = r2 * r17
            double r27 = r4 + r2
            double r25 = r0 - r12
            double r25 = r25 * r8
            double r2 = r15 * r27
            double r25 = r25 - r2
            double r2 = r27 * r33
            double r2 = r2 * r17
            double r12 = r6 + r2
            double r2 = r25 * r33
            double r2 = r2 * r17
            double r19 = r4 + r2
            double r23 = r0 - r12
            double r23 = r23 * r8
            double r2 = r15 * r19
            double r23 = r23 - r2
            double r2 = r19 * r33
            double r12 = r6 + r2
            double r17 = r23 * r33
            double r2 = r4 + r17
            double r0 = r0 - r12
            double r0 = r0 * r8
            double r17 = r15 * r2
            double r0 = r0 - r17
            double r27 = r27 + r19
            r21 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r27 = r27 * r21
            double r19 = r4 + r27
            double r19 = r19 + r2
            r17 = 4595172819793696085(0x3fc5555555555555, double:0.16666666666666666)
            double r19 = r19 * r17
            double r25 = r25 + r23
            double r25 = r25 * r21
            double r31 = r31 + r25
            double r31 = r31 + r0
            double r31 = r31 * r17
            double r19 = r19 * r33
            double r6 = r6 + r19
            double r31 = r31 * r33
            double r4 = r4 + r31
            goto L_0x010f
        L_0x018b:
            r0 = r41
            r0.A00 = r12
            r0.A01 = r2
            r0 = r42
            r0.A00 = r6
            r0.A01 = r4
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x01b6
            double r10 = r10 / r33
            double r6 = r6 * r10
            X.7Fc r12 = r14.A08
            double r2 = r12.A00
            r15 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r15 = r15 - r10
            double r2 = r2 * r15
            double r6 = r6 + r2
            r2 = r42
            r2.A00 = r6
            double r4 = r4 * r10
            double r2 = r12.A01
            double r2 = r2 * r15
            double r4 = r4 + r2
            r2 = r42
            r2.A01 = r4
        L_0x01b6:
            boolean r2 = r14.A04()
            r12 = 1
            if (r2 != 0) goto L_0x01d9
            boolean r2 = r14.A05
            if (r2 == 0) goto L_0x01f6
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x01f6
            double r10 = r14.A01
            double r2 = r14.A00
            int r13 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r13 >= 0) goto L_0x01d1
            int r13 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r13 > 0) goto L_0x01d9
        L_0x01d1:
            int r13 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r13 <= 0) goto L_0x01f6
            int r10 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r10 >= 0) goto L_0x01f6
        L_0x01d9:
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x021e
            double r6 = r14.A00
            r14.A01 = r6
            r2 = r42
            r2.A00 = r6
        L_0x01e5:
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x01f4
            r2 = r42
            r2.A01 = r0
            X.7jV r1 = r14.A0A
            java.lang.String r0 = r14.A0B
            r1.A02(r0)
        L_0x01f4:
            r37 = 1
        L_0x01f6:
            boolean r1 = r14.A06
            r0 = 0
            if (r1 == 0) goto L_0x01fd
            r14.A06 = r0
        L_0x01fd:
            if (r37 == 0) goto L_0x021c
            r14.A06 = r12
        L_0x0201:
            java.util.concurrent.CopyOnWriteArraySet r0 = r14.A04
            java.util.Iterator r1 = r0.iterator()
        L_0x0207:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00c0
            java.lang.Object r0 = r1.next()
            X.8qd r0 = (X.C183778qd) r0
            r0.Bbv(r14)
            if (r12 == 0) goto L_0x0207
            r0.Bbu(r14)
            goto L_0x0207
        L_0x021c:
            r12 = 0
            goto L_0x0201
        L_0x021e:
            r14.A00 = r6
            r14.A01 = r6
            goto L_0x01e5
        L_0x0223:
            boolean r0 = r43.isEmpty()
            if (r0 == 0) goto L_0x022e
            r1 = 1
            r0 = r39
            r0.A00 = r1
        L_0x022e:
            java.util.Iterator r1 = r44.iterator()
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0242
            r1.next()
            java.lang.String r0 = "onAfterIntegrate"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x0242:
            r0 = r39
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x0256
            r0 = r39
            X.7h4 r2 = r0.A01
            r0 = 0
            r2.A02 = r0
            android.view.Choreographer r1 = r2.A04
            android.view.Choreographer$FrameCallback r0 = r2.A03
            r1.removeFrameCallback(r0)
        L_0x0256:
            r1 = r29
            r0 = r40
            r0.A00 = r1
            android.view.Choreographer r1 = r0.A04
            android.view.Choreographer$FrameCallback r0 = r0.A03
            r1.postFrameCallback(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1895591t.doFrame(long):void");
    }
}
