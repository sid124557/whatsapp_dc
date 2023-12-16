package X;

/* renamed from: X.7kh  reason: invalid class name and case insensitive filesystem */
public class C158877kh {
    public static final C158877kh A0D = new C158877kh();
    public int A00;
    public AnonymousClass7LW A01;
    public C161437pf A02;
    public C158877kh A03;
    public C158877kh A04;
    public short A05;
    public short A06;
    public short A07;
    public short A08;
    public short A09;
    public short A0A;
    public int[] A0B;
    public int[] A0C;

    public final void A00(int i, int i2, int i3) {
        int[] iArr = this.A0B;
        if (iArr == null) {
            iArr = new int[6];
            this.A0B = iArr;
        }
        int i4 = iArr[0];
        int i5 = i4 + 2;
        int length = iArr.length;
        if (i5 >= length) {
            int[] iArr2 = new int[(length + 6)];
            System.arraycopy(iArr, 0, iArr2, 0, length);
            this.A0B = iArr2;
            iArr = iArr2;
        }
        int i6 = i4 + 1;
        iArr[i6] = i;
        int i7 = i6 + 1;
        iArr[i7] = i2 | i3;
        iArr[0] = i7;
    }

    public final void A01(C159077l4 r4, int i, boolean z) {
        if ((this.A05 & 4) == 0) {
            int i2 = r4.A00;
            if (z) {
                A00(i, 536870912, i2);
                r4.A03(-1);
                return;
            }
            A00(i, 268435456, i2);
            r4.A04(-1);
            return;
        }
        int i3 = this.A00 - i;
        if (z) {
            r4.A03(i3);
        } else {
            r4.A04(i3);
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: LoopRegionVisitor
        jadx.core.utils.exceptions.JadxOverflowException: LoopRegionVisitor.assignOnlyInLoop endless recursion
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void A02(short r8) {
        /*
            r7 = this;
            X.7kh r6 = A0D
            r7.A04 = r6
            r5 = r7
        L_0x0005:
            if (r5 == r6) goto L_0x0030
            X.7kh r4 = r5.A04
            r0 = 0
            r5.A04 = r0
            short r0 = r5.A0A
            if (r0 != 0) goto L_0x002e
            r5.A0A = r8
            X.7LW r3 = r5.A01
            r2 = r3
        L_0x0015:
            if (r3 == 0) goto L_0x002e
            short r0 = r5.A05
            r0 = r0 & 16
            if (r0 == 0) goto L_0x0024
            X.7LW r0 = r2.A00
            if (r3 != r0) goto L_0x0024
        L_0x0021:
            X.7LW r3 = r3.A00
            goto L_0x0015
        L_0x0024:
            X.7kh r1 = r3.A02
            X.7kh r0 = r1.A04
            if (r0 != 0) goto L_0x0021
            r1.A04 = r4
            r4 = r1
            goto L_0x0021
        L_0x002e:
            r5 = r4
            goto L_0x0005
        L_0x0030:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C158877kh.A02(short):void");
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("L");
        return AnonymousClass000.A0h(A0o, System.identityHashCode(this));
    }
}
