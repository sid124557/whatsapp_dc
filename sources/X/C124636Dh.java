package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.6Dh  reason: invalid class name and case insensitive filesystem */
public class C124636Dh extends Handler {
    public final /* synthetic */ C153737br A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C124636Dh(Looper looper, C153737br r2) {
        super(looper);
        this.A00 = r2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x00da A[LOOP:5: B:47:0x00d4->B:49:0x00da, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleMessage(android.os.Message r18) {
        /*
            r17 = this;
            r0 = r17
            X.7br r6 = r0.A00
            r3 = r18
            int r1 = r3.what
            r10 = 1
            if (r1 == 0) goto L_0x0120
            if (r1 == r10) goto L_0x00ec
            r0 = 2
            if (r1 == r0) goto L_0x00a4
            r0 = 3
            if (r1 == r0) goto L_0x0077
            r0 = 4
            if (r1 == r0) goto L_0x0067
            r0 = 5
            if (r1 != r0) goto L_0x0062
            java.util.concurrent.CopyOnWriteArraySet r0 = r6.A0R
            java.util.Iterator r6 = r0.iterator()
        L_0x001f:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0182
            java.lang.Object r0 = r6.next()
            X.7Ww r0 = (X.C151937Ww) r0
            java.lang.Object r5 = r3.obj
            java.lang.String r5 = (java.lang.String) r5
            X.7qS r4 = r0.A05
            X.8v7 r2 = r4.A02
            boolean r0 = r2 instanceof X.C1672880m
            if (r0 == 0) goto L_0x004a
            java.lang.String r0 = "LoadControl debug info: "
            java.lang.StringBuilder r1 = X.C18330xA.A0A(r0)
            X.80m r2 = (X.C1672880m) r2
            X.7Tm r0 = r2.A0A
            r1.append(r0)
            java.lang.String r0 = ". Player debug info: "
            java.lang.String r5 = X.AnonymousClass000.A0V(r0, r5, r1)
        L_0x004a:
            java.util.List r0 = r4.A0U
            java.util.Iterator r2 = r0.iterator()
        L_0x0050:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x001f
            java.lang.Object r1 = r2.next()
            X.8ub r1 = (X.C186008ub) r1
            X.6xt r0 = X.C142846xt.A08
            r1.Bfi(r0, r5)
            goto L_0x0050
        L_0x0062:
            java.lang.IllegalStateException r0 = X.AnonymousClass6CA.A0O()
            throw r0
        L_0x0067:
            java.util.concurrent.CopyOnWriteArraySet r0 = r6.A0R
            java.util.Iterator r1 = r0.iterator()
        L_0x006d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0182
            r1.next()
            goto L_0x006d
        L_0x0077:
            int r0 = r6.A03
            int r0 = r0 - r10
            r6.A03 = r0
            if (r0 != 0) goto L_0x0182
            java.lang.Object r0 = r3.obj
            boolean r0 = X.AnonymousClass001.A1Z(r0)
            r6.A0G = r0
            java.util.concurrent.CopyOnWriteArraySet r0 = r6.A0R
            java.util.Iterator r3 = r0.iterator()
        L_0x008c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0182
            java.lang.Object r2 = r3.next()
            X.7Ww r2 = (X.C151937Ww) r2
            boolean r1 = r6.A0G
            if (r1 == 0) goto L_0x008c
            X.7nh r0 = r6.A08
            int r0 = r0.A00
            r2.A01(r1, r0)
            goto L_0x008c
        L_0x00a4:
            java.lang.Object r5 = r3.obj
            X.6JW r5 = (X.AnonymousClass6JW) r5
            r6.A07 = r5
            java.util.concurrent.CopyOnWriteArraySet r0 = r6.A0R
            java.util.Iterator r4 = r0.iterator()
        L_0x00b0:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0182
            java.lang.Object r0 = r4.next()
            X.7Ww r0 = (X.C151937Ww) r0
            X.7qS r3 = r0.A05
            if (r5 == 0) goto L_0x00ea
            int r1 = r5.type
            if (r1 == 0) goto L_0x00e7
            if (r1 == r10) goto L_0x00e4
            r0 = 2
            if (r1 != r0) goto L_0x00ea
            X.6xt r2 = X.C142846xt.A07
        L_0x00cb:
            r5.getCause()
            java.util.List r0 = r3.A0U
            java.util.Iterator r1 = r0.iterator()
        L_0x00d4:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00b0
            java.lang.Object r0 = r1.next()
            X.8ub r0 = (X.C186008ub) r0
            r0.BYL(r5, r2)
            goto L_0x00d4
        L_0x00e4:
            X.6xt r2 = X.C142846xt.A05
            goto L_0x00cb
        L_0x00e7:
            X.6xt r2 = X.C142846xt.A06
            goto L_0x00cb
        L_0x00ea:
            r2 = 0
            goto L_0x00cb
        L_0x00ec:
            java.lang.Object r4 = r3.obj
            X.7jX r4 = (X.C158167jX) r4
            X.7jX r0 = r6.A09
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x0182
            r6.A09 = r4
            java.util.concurrent.CopyOnWriteArraySet r0 = r6.A0R
            java.util.Iterator r3 = r0.iterator()
        L_0x0100:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0182
            java.lang.Object r0 = r3.next()
            X.7Ww r0 = (X.C151937Ww) r0
            X.7qS r2 = r0.A05
            float r0 = r2.A00
            float r1 = r4.A01
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0100
            r2.A00 = r1
            X.7t5 r0 = r2.A0P
            X.85L r0 = r0.A0o
            r0.BYF(r1)
            goto L_0x0100
        L_0x0120:
            java.lang.Object r7 = r3.obj
            X.7nh r7 = (X.C160477nh) r7
            int r1 = r3.arg1
            int r8 = r3.arg2
            r0 = -1
            if (r8 != r0) goto L_0x012c
            r10 = 0
        L_0x012c:
            int r0 = r6.A02
            int r0 = r0 - r1
            r6.A02 = r0
            if (r0 != 0) goto L_0x0182
            long r1 = r7.A02
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x014a
            X.7Z2 r12 = r7.A04
            r13 = 0
            long r0 = r7.A01
            r11 = r7
            r15 = r0
            X.7nh r7 = r11.A01(r12, r13, r15)
        L_0x014a:
            X.7nh r0 = r6.A08
            com.facebook.android.exoplayer2.Timeline r0 = r0.A03
            int r0 = r0.A01()
            boolean r0 = X.AnonymousClass000.A1T(r0)
            r2 = 0
            if (r0 == 0) goto L_0x015d
            boolean r0 = r6.A0D
            if (r0 == 0) goto L_0x0173
        L_0x015d:
            com.facebook.android.exoplayer2.Timeline r0 = r7.A03
            int r0 = r0.A01()
            boolean r0 = X.AnonymousClass000.A1T(r0)
            if (r0 == 0) goto L_0x0173
            r6.A00 = r2
            r6.A01 = r2
            r0 = 0
            r6.A06 = r0
            r6.A05 = r0
        L_0x0173:
            boolean r0 = r6.A0D
            r9 = 2
            if (r0 == 0) goto L_0x0179
            r9 = 0
        L_0x0179:
            boolean r11 = r6.A0E
            r6.A0D = r2
            r6.A0E = r2
            r6.A09(r7, r8, r9, r10, r11)
        L_0x0182:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C124636Dh.handleMessage(android.os.Message):void");
    }
}
