package X;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.Collections;
import java.util.List;

/* renamed from: X.86W  reason: invalid class name */
public final class AnonymousClass86W implements C185328tT {
    public int A00;
    public int A01;
    public int A02;
    public C187028wK A03;
    public C126536Oi A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final SparseArray A08;
    public final SparseBooleanArray A09;
    public final SparseBooleanArray A0A;
    public final SparseIntArray A0B;
    public final AnonymousClass7PQ A0C;
    public final C178108gz A0D;
    public final C161467pi A0E;
    public final List A0F;

    public AnonymousClass86W(int i, int i2, int i3) {
        C153267ax r1 = new C153267ax(0);
        this.A0D = new AnonymousClass87J(0);
        this.A0F = Collections.singletonList(r1);
        this.A0E = new C161467pi(new byte[9400], 0);
        this.A09 = new SparseBooleanArray();
        this.A0A = new SparseBooleanArray();
        this.A08 = AnonymousClass6CA.A0I();
        this.A0B = new SparseIntArray();
        this.A0C = new AnonymousClass7PQ();
        this.A01 = -1;
        this.A09.clear();
        SparseArray sparseArray = this.A08;
        sparseArray.clear();
        SparseArray A0I = AnonymousClass6CA.A0I();
        int size = A0I.size();
        for (int i4 = 0; i4 < size; i4++) {
            sparseArray.put(A0I.keyAt(i4), A0I.valueAt(i4));
        }
        sparseArray.put(0, new AnonymousClass87K(new AnonymousClass87G(this)));
    }

    public void Bkz(long j, long j2) {
        C126536Oi r0;
        long j3;
        List list = this.A0F;
        int size = list.size();
        int i = 0;
        while (true) {
            long j4 = j2;
            if (i < size) {
                Object obj = list.get(i);
                C153267ax r6 = (C153267ax) obj;
                if (r6.A00() != -9223372036854775807L) {
                    if (r6.A00() != 0) {
                        synchronized (obj) {
                            j3 = r6.A00;
                        }
                        if (j3 == j2) {
                            continue;
                        }
                    } else {
                        continue;
                    }
                    i++;
                }
                synchronized (obj) {
                    r6.A00 = j4;
                    r6.A01 = -9223372036854775807L;
                }
                i++;
            } else {
                if (!(j2 == 0 || (r0 = this.A04) == null)) {
                    r0.A01(j4);
                }
                this.A0E.A0Q(0);
                this.A0B.clear();
                int i2 = 0;
                while (true) {
                    SparseArray sparseArray = this.A08;
                    if (i2 < sparseArray.size()) {
                        ((C184898sj) sparseArray.valueAt(i2)).Bky();
                        i2++;
                    } else {
                        this.A00 = 0;
                        return;
                    }
                }
            }
        }
    }

    public void BFs(C187028wK r1) {
        this.A03 = r1;
    }

    public boolean BpS(C187648xa r7) {
        byte[] bArr = this.A0E.A02;
        r7.Bgd(bArr, 0, 940);
        int i = 0;
        do {
            int i2 = 0;
            while (bArr[(i2 * 188) + i] == 71) {
                i2++;
                if (i2 >= 5) {
                    r7.BpP(i);
                    return true;
                }
            }
            i++;
        } while (i < 188);
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01e3, code lost:
        if (r1 == false) goto L_0x01e5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int BiD(X.C187648xa r15, X.AnonymousClass7BG r16) {
        /*
            r14 = this;
            long r12 = r15.getLength()
            boolean r0 = r14.A07
            r4 = -1
            r3 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0127
            int r0 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            r6 = r16
            if (r0 == 0) goto L_0x00d8
            X.7PQ r5 = r14.A0C
            boolean r0 = r5.A03
            if (r0 != 0) goto L_0x00d8
            int r4 = r14.A01
            if (r4 <= 0) goto L_0x00ca
            boolean r0 = r5.A05
            if (r0 != 0) goto L_0x0066
            r0 = 112800(0x1b8a0, float:1.58066E-40)
            long r0 = (long) r0
            int r7 = X.AnonymousClass6CA.A02(r0, r12)
            long r0 = (long) r7
            long r12 = r12 - r0
            long r1 = r15.BBW()
            int r0 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r0 != 0) goto L_0x0154
            X.7pi r10 = r5.A06
            r10.A0Q(r7)
            r15.Bjy()
            X.C161467pi.A06(r15, r10, r7)
            int r9 = r10.A01
            int r8 = r10.A00
        L_0x0041:
            int r8 = r8 + -1
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r8 < r9) goto L_0x0060
            byte[] r0 = r10.A02
            byte r1 = r0[r8]
            r0 = 71
            if (r1 != r0) goto L_0x0041
            long r1 = X.AnonymousClass72B.A00(r10, r8, r4)
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0041
        L_0x005a:
            r5.A02 = r1
            r5.A05 = r3
        L_0x005e:
            r5 = 0
        L_0x005f:
            return r5
        L_0x0060:
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x005a
        L_0x0066:
            long r0 = r5.A02
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r7 == 0) goto L_0x00ca
            boolean r0 = r5.A04
            if (r0 != 0) goto L_0x00b5
            r0 = 112800(0x1b8a0, float:1.58066E-40)
            long r0 = (long) r0
            int r1 = X.AnonymousClass6CA.A02(r0, r12)
            long r7 = r15.BBW()
            long r12 = (long) r2
            int r0 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r0 != 0) goto L_0x0154
            X.7pi r8 = r5.A06
            r8.A0Q(r1)
            r15.Bjy()
            X.C161467pi.A06(r15, r8, r1)
            int r7 = r8.A01
            int r6 = r8.A00
        L_0x0095:
            if (r7 >= r6) goto L_0x00af
            byte[] r0 = r8.A02
            byte r1 = r0[r7]
            r0 = 71
            if (r1 != r0) goto L_0x00ac
            long r1 = X.AnonymousClass72B.A00(r8, r7, r4)
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x00ac
        L_0x00a7:
            r5.A01 = r1
            r5.A04 = r3
            goto L_0x005e
        L_0x00ac:
            int r7 = r7 + 1
            goto L_0x0095
        L_0x00af:
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x00a7
        L_0x00b5:
            long r0 = r5.A01
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r2 == 0) goto L_0x00ca
            X.7ax r2 = r5.A07
            long r6 = r2.A02(r0)
            long r0 = r5.A02
            long r0 = r2.A02(r0)
            long r0 = r0 - r6
            r5.A00 = r0
        L_0x00ca:
            X.7pi r2 = r5.A06
            byte[] r1 = X.C162387ry.A0A
            int r0 = r1.length
            r2.A0U(r1, r0)
            r5.A03 = r3
            r15.Bjy()
            goto L_0x005e
        L_0x00d8:
            boolean r0 = r14.A05
            if (r0 != 0) goto L_0x00fd
            r14.A05 = r3
            X.7PQ r1 = r14.A0C
            long r10 = r1.A00
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0113
            X.7ax r8 = r1.A07
            int r9 = r14.A01
            X.6Oi r7 = new X.6Oi
            r7.<init>(r8, r9, r10, r12)
            r14.A04 = r7
            X.8wK r1 = r14.A03
            X.86o r0 = r7.A02
        L_0x00fa:
            r1.Bl0(r0)
        L_0x00fd:
            boolean r0 = r14.A06
            if (r0 == 0) goto L_0x011a
            r14.A06 = r2
            r0 = 0
            r14.Bkz(r0, r0)
            long r7 = r15.BBW()
            int r4 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r4 == 0) goto L_0x011a
            r6.A00 = r0
            return r3
        L_0x0113:
            X.8wK r1 = r14.A03
            X.86k r0 = X.C1686986k.A00(r10)
            goto L_0x00fa
        L_0x011a:
            X.6Oi r1 = r14.A04
            if (r1 == 0) goto L_0x0127
            X.7hR r0 = r1.A00
            if (r0 == 0) goto L_0x0127
            int r5 = r1.A00(r15, r6)
            return r5
        L_0x0127:
            X.7pi r6 = r14.A0E
            byte[] r4 = r6.A02
            int r5 = r6.A01
            int r0 = 9400 - r5
            r1 = 188(0xbc, float:2.63E-43)
            if (r0 >= r1) goto L_0x013e
            int r0 = r6.A00
            int r0 = r0 - r5
            if (r0 <= 0) goto L_0x013b
            java.lang.System.arraycopy(r4, r5, r4, r2, r0)
        L_0x013b:
            r6.A0U(r4, r0)
        L_0x013e:
            int r8 = r6.A00
            int r9 = r6.A01
            int r0 = r8 - r9
            if (r0 >= r1) goto L_0x0158
            int r0 = 9400 - r8
            int r0 = r15.read(r4, r8, r0)
            r5 = -1
            if (r0 == r5) goto L_0x005f
            int r8 = r8 + r0
            r6.A0R(r8)
            goto L_0x013e
        L_0x0154:
            r6.A00 = r12
            r5 = 1
            return r5
        L_0x0158:
            byte[] r5 = r6.A02
            r4 = r9
        L_0x015b:
            if (r4 >= r8) goto L_0x0166
            byte r1 = r5[r4]
            r0 = 71
            if (r1 == r0) goto L_0x0166
            int r4 = r4 + 1
            goto L_0x015b
        L_0x0166:
            r6.A0S(r4)
            int r7 = r4 + 188
            if (r7 <= r8) goto L_0x01f5
            int r0 = r14.A00
            int r4 = r4 - r9
            int r0 = r0 + r4
            r14.A00 = r0
        L_0x0173:
            int r8 = r6.A00
            if (r7 > r8) goto L_0x01f4
            int r1 = r6.A07()
            r0 = 8388608(0x800000, float:1.17549435E-38)
            r0 = r0 & r1
            if (r0 != 0) goto L_0x01f1
            r0 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r1
            boolean r5 = X.AnonymousClass000.A1S(r0)
            r0 = 2096896(0x1fff00, float:2.938377E-39)
            r0 = r0 & r1
            int r9 = r0 >> 8
            r0 = r1 & 32
            boolean r11 = X.AnonymousClass000.A1S(r0)
            r0 = r1 & 16
            if (r0 == 0) goto L_0x01f1
            android.util.SparseArray r0 = r14.A08
            java.lang.Object r4 = r0.get(r9)
            X.8sj r4 = (X.C184898sj) r4
            if (r4 == 0) goto L_0x01f1
            r1 = r1 & 15
            android.util.SparseIntArray r10 = r14.A0B
            int r0 = r1 + -1
            int r0 = r10.get(r9, r0)
            r10.put(r9, r1)
            if (r0 == r1) goto L_0x01f1
            int r0 = r0 + 1
            r0 = r0 & 15
            if (r1 == r0) goto L_0x01b9
            r4.Bky()
        L_0x01b9:
            if (r11 == 0) goto L_0x01ce
            int r1 = r6.A0C()
            int r0 = r6.A0C()
            r0 = r0 & 64
            int r0 = X.C18310x6.A02(r0)
            r5 = r5 | r0
            int r1 = r1 - r3
            r6.A0T(r1)
        L_0x01ce:
            boolean r1 = r14.A07
            if (r1 != 0) goto L_0x01da
            android.util.SparseBooleanArray r0 = r14.A0A
            boolean r0 = r0.get(r9, r2)
            if (r0 != 0) goto L_0x01e5
        L_0x01da:
            r6.A0R(r7)
            r4.AzZ(r6, r5)
            r6.A0R(r8)
            if (r1 != 0) goto L_0x01f1
        L_0x01e5:
            boolean r0 = r14.A07
            if (r0 == 0) goto L_0x01f1
            r4 = -1
            int r0 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x01f1
            r14.A06 = r3
        L_0x01f1:
            r6.A0S(r7)
        L_0x01f4:
            return r2
        L_0x01f5:
            r14.A00 = r2
            goto L_0x0173
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass86W.BiD(X.8xa, X.7BG):int");
    }

    public AnonymousClass86W() {
        this(1, 0, 112800);
    }
}
