package X;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: X.6WC  reason: invalid class name */
public final class AnonymousClass6WC extends AnonymousClass6WD implements Cloneable {
    public int A00 = 0;
    public long A01 = 0;
    public long A02 = 0;
    public long A03;
    public C128416Vz A04;
    public C128406Vy A05;
    public AnonymousClass6WB A06;
    public AnonymousClass6WA A07;
    public boolean A08;
    public byte[] A09;
    public byte[] A0A;
    public byte[] A0B;
    public int[] A0C;
    public AnonymousClass6W9[] A0D;

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003a, code lost:
        if (r0 != null) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0093, code lost:
        if (r1.length != 0) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r6 = 1
            if (r8 == r7) goto L_0x00c2
            boolean r0 = r8 instanceof X.AnonymousClass6WC
            r5 = 0
            if (r0 == 0) goto L_0x003c
            X.6WC r8 = (X.AnonymousClass6WC) r8
            long r3 = r7.A01
            long r1 = r8.A01
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x003c
            long r3 = r7.A02
            long r1 = r8.A02
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x003c
            int r1 = r7.A00
            int r0 = r8.A00
            if (r1 != r0) goto L_0x003c
            X.6W9[] r1 = r7.A0D
            X.6W9[] r0 = r8.A0D
            boolean r0 = X.C159867mb.A00(r1, r0)
            if (r0 == 0) goto L_0x003c
            byte[] r1 = r7.A09
            byte[] r0 = r8.A09
            boolean r0 = java.util.Arrays.equals(r1, r0)
            if (r0 == 0) goto L_0x003c
            X.6Vz r1 = r7.A04
            X.6Vz r0 = r8.A04
            if (r1 != 0) goto L_0x003d
            if (r0 == 0) goto L_0x0044
        L_0x003c:
            return r5
        L_0x003d:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0044
            return r5
        L_0x0044:
            byte[] r1 = r7.A0A
            byte[] r0 = r8.A0A
            boolean r0 = java.util.Arrays.equals(r1, r0)
            if (r0 == 0) goto L_0x003c
            X.6WB r1 = r7.A06
            X.6WB r0 = r8.A06
            if (r1 != 0) goto L_0x0057
            if (r0 == 0) goto L_0x005e
            return r5
        L_0x0057:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x005e
            return r5
        L_0x005e:
            long r3 = r7.A03
            long r1 = r8.A03
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x003c
            X.6WA r1 = r7.A07
            X.6WA r0 = r8.A07
            if (r1 != 0) goto L_0x006f
            if (r0 == 0) goto L_0x0076
            return r5
        L_0x006f:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0076
            return r5
        L_0x0076:
            byte[] r1 = r7.A0B
            byte[] r0 = r8.A0B
            boolean r0 = java.util.Arrays.equals(r1, r0)
            if (r0 == 0) goto L_0x003c
            int[] r2 = r7.A0C
            int[] r1 = r8.A0C
            if (r2 == 0) goto L_0x0090
            int r0 = r2.length
            if (r0 == 0) goto L_0x0090
            boolean r0 = java.util.Arrays.equals(r2, r1)
            if (r0 != 0) goto L_0x0095
            return r5
        L_0x0090:
            if (r1 == 0) goto L_0x0095
            int r0 = r1.length
            if (r0 != 0) goto L_0x003c
        L_0x0095:
            X.6Vy r1 = r7.A05
            X.6Vy r0 = r8.A05
            if (r1 != 0) goto L_0x009e
            if (r0 == 0) goto L_0x00a5
            return r5
        L_0x009e:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00a5
            return r5
        L_0x00a5:
            boolean r1 = r7.A08
            boolean r0 = r8.A08
            if (r1 != r0) goto L_0x003c
            X.8LR r1 = r7.A00
            if (r1 == 0) goto L_0x00ba
            int r0 = r1.A00
            if (r0 == 0) goto L_0x00ba
            X.8LR r0 = r8.A00
            boolean r0 = r1.equals(r0)
            return r0
        L_0x00ba:
            X.8LR r0 = r8.A00
            if (r0 == 0) goto L_0x00c2
            int r0 = r0.A00
            if (r0 != 0) goto L_0x003c
        L_0x00c2:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6WC.equals(java.lang.Object):boolean");
    }

    public final void A04(C161777qQ r11) {
        long j = this.A01;
        if (j != 0) {
            r11.A03(8);
            r11.A07(j);
        }
        AnonymousClass6W9[] r0 = this.A0D;
        int i = 0;
        if (r0 != null && r0.length > 0) {
            int i2 = 0;
            while (true) {
                AnonymousClass6W9[] r1 = this.A0D;
                if (i2 >= r1.length) {
                    break;
                }
                AnonymousClass6W9 r12 = r1[i2];
                if (r12 != null) {
                    r11.A09(r12, 3);
                }
                i2++;
            }
        }
        byte[] bArr = this.A09;
        byte[] bArr2 = AnonymousClass79M.A00;
        if (!Arrays.equals(bArr, bArr2)) {
            r11.A06(4, bArr);
        }
        if (!Arrays.equals(this.A0A, bArr2)) {
            r11.A06(6, this.A0A);
        }
        AnonymousClass6WB r13 = this.A06;
        if (r13 != null) {
            r11.A09(r13, 7);
        }
        C128416Vz r14 = this.A04;
        if (r14 != null) {
            r11.A08(r14, 9);
        }
        int i3 = this.A00;
        if (i3 != 0) {
            r11.A03(88);
            r11.A04(i3);
        }
        long j2 = this.A03;
        if (j2 != 180000) {
            r11.A03(120);
            r11.A07(AnonymousClass6C7.A0F(j2));
        }
        AnonymousClass6WA r15 = this.A07;
        if (r15 != null) {
            r11.A09(r15, 16);
        }
        long j3 = this.A02;
        if (j3 != 0) {
            r11.A04(136);
            r11.A07(j3);
        }
        byte[] bArr3 = this.A0B;
        if (!Arrays.equals(bArr3, bArr2)) {
            r11.A06(18, bArr3);
        }
        int[] iArr = this.A0C;
        if (iArr != null && iArr.length > 0) {
            while (true) {
                int[] iArr2 = this.A0C;
                if (i >= iArr2.length) {
                    break;
                }
                int i4 = iArr2[i];
                r11.A04(160);
                if (i4 >= 0) {
                    r11.A04(i4);
                } else {
                    r11.A07((long) i4);
                }
                i++;
            }
        }
        C128406Vy r16 = this.A05;
        if (r16 != null) {
            r11.A08(r16, 23);
        }
        if (this.A08) {
            r11.A04(200);
            byte b = (byte) 1;
            ByteBuffer byteBuffer = r11.A02;
            if (byteBuffer.hasRemaining()) {
                byteBuffer.put(b);
            } else {
                throw new C140506tq(byteBuffer.position(), byteBuffer.limit());
            }
        }
        super.A04(r11);
    }

    public final int hashCode() {
        int length;
        int i;
        int i2 = 0;
        int i3 = 1237;
        int A012 = (AnonymousClass6CA.A01(AnonymousClass6C7.A03(AnonymousClass6C7.A03((AnonymousClass6WC.class.getName().hashCode() + 527) * 31, this.A01), this.A02) * 31 * 31, this.A00) + 1237) * 31;
        AnonymousClass6W9[] r4 = this.A0D;
        if (r4 == null) {
            length = 0;
        } else {
            length = r4.length;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5++) {
            AnonymousClass6W9 r1 = r4[i5];
            if (r1 != null) {
                i4 = AnonymousClass002.A02(r1, i4 * 31);
            }
        }
        int A092 = AnonymousClass6CA.A09(this.A09, (A012 + i4) * 31);
        int A093 = AnonymousClass6CA.A09(this.A0A, ((A092 * 31) + AnonymousClass000.A07(this.A04)) * 31) * 31 * 31;
        long j = this.A03;
        int A013 = AnonymousClass6CA.A01(((((((A093 * 31) + AnonymousClass000.A07(this.A06)) * 31 * 31) + ((int) (j ^ (j >>> 32)))) * 31) + AnonymousClass000.A07(this.A07)) * 31, Arrays.hashCode(this.A0B));
        int[] iArr = this.A0C;
        if (iArr == null || iArr.length == 0) {
            i = 0;
        } else {
            i = Arrays.hashCode(iArr);
        }
        int A072 = (((A013 + i) * 31 * 31) + AnonymousClass000.A07(this.A05)) * 31;
        if (this.A08) {
            i3 = 1231;
        }
        int i6 = (A072 + i3) * 31;
        AnonymousClass8LR r12 = this.A00;
        if (!(r12 == null || r12.A00 == 0)) {
            i2 = r12.hashCode();
        }
        return i6 + i2;
    }

    public AnonymousClass6WC() {
        if (AnonymousClass6W9.A00 == null) {
            synchronized (C159867mb.A00) {
                if (AnonymousClass6W9.A00 == null) {
                    AnonymousClass6W9.A00 = new AnonymousClass6W9[0];
                }
            }
        }
        this.A0D = AnonymousClass6W9.A00;
        byte[] bArr = AnonymousClass79M.A00;
        this.A09 = bArr;
        this.A04 = null;
        this.A0A = bArr;
        this.A06 = null;
        this.A03 = 180000;
        this.A07 = null;
        this.A0B = bArr;
        this.A0C = AnonymousClass79M.A01;
        this.A05 = null;
        this.A08 = false;
        this.A00 = null;
        this.A00 = -1;
    }

    public final int A02() {
        int length;
        int i;
        int A022 = super.A02();
        long j = this.A01;
        if (j != 0) {
            A022 += C161777qQ.A00(j) + 1;
        }
        AnonymousClass6W9[] r0 = this.A0D;
        int i2 = 0;
        if (r0 != null && r0.length > 0) {
            int i3 = 0;
            while (true) {
                AnonymousClass6W9[] r1 = this.A0D;
                if (i3 >= r1.length) {
                    break;
                }
                AnonymousClass6W9 r12 = r1[i3];
                if (r12 != null) {
                    int A023 = r12.A02();
                    r12.A00 = A023;
                    A022 += AnonymousClass6C7.A00(A023) + 1;
                }
                i3++;
            }
        }
        byte[] bArr = this.A09;
        byte[] bArr2 = AnonymousClass79M.A00;
        if (!Arrays.equals(bArr, bArr2)) {
            int length2 = bArr.length;
            A022 += AnonymousClass6C7.A00(length2) + length2 + 1;
        }
        if (!Arrays.equals(this.A0A, bArr2)) {
            int length3 = this.A0A.length;
            A022 += AnonymousClass6C7.A00(length3) + length3 + 1;
        }
        AnonymousClass6WB r02 = this.A06;
        if (r02 != null) {
            int A024 = r02.A02();
            r02.A00 = A024;
            A022 += AnonymousClass6C7.A00(A024) + A024 + 1;
        }
        C128416Vz r03 = this.A04;
        if (r03 != null) {
            int BtV = r03.BtV();
            A022 += AnonymousClass6C7.A00(BtV) + BtV + 1;
        }
        int i4 = this.A00;
        if (i4 != 0) {
            A022 += AnonymousClass6C7.A00(i4) + 1;
        }
        long j2 = this.A03;
        if (j2 != 180000) {
            A022 += 1 + C161777qQ.A00((j2 >> 63) ^ (j2 << 1));
        }
        AnonymousClass6WA r04 = this.A07;
        if (r04 != null) {
            int A025 = r04.A02();
            r04.A00 = A025;
            A022 += 2 + AnonymousClass6C7.A00(A025) + A025;
        }
        long j3 = this.A02;
        if (j3 != 0) {
            A022 += 2 + C161777qQ.A00(j3);
        }
        byte[] bArr3 = this.A0B;
        if (!Arrays.equals(bArr3, bArr2)) {
            int length4 = bArr3.length;
            A022 += 2 + AnonymousClass6C7.A00(length4) + length4;
        }
        int[] iArr = this.A0C;
        if (iArr != null && (length = iArr.length) > 0) {
            int i5 = 0;
            do {
                int i6 = iArr[i2];
                if (i6 >= 0) {
                    i = AnonymousClass6C7.A00(i6);
                } else {
                    i = 10;
                }
                i5 += i;
                i2++;
            } while (i2 < length);
            A022 = A022 + i5 + (length * 2);
        }
        C128406Vy r05 = this.A05;
        if (r05 != null) {
            A022 += C150347Qg.A04(r05.BtV(), 2);
        }
        if (this.A08) {
            return A022 + 3;
        }
        return A022;
    }

    public final /* synthetic */ Object clone() {
        int length;
        try {
            AnonymousClass6WC r2 = (AnonymousClass6WC) super.A05();
            AnonymousClass6W9[] r0 = this.A0D;
            if (r0 != null && (length = r0.length) > 0) {
                r2.A0D = new AnonymousClass6W9[length];
                int i = 0;
                while (true) {
                    AnonymousClass6W9[] r1 = this.A0D;
                    if (i >= r1.length) {
                        break;
                    }
                    AnonymousClass6W9 r02 = r1[i];
                    if (r02 != null) {
                        r2.A0D[i] = r02.clone();
                    }
                    i++;
                }
            }
            C128416Vz r03 = this.A04;
            if (r03 != null) {
                r2.A04 = r03;
            }
            AnonymousClass6WB r04 = this.A06;
            if (r04 != null) {
                r2.A06 = (AnonymousClass6WB) r04.clone();
            }
            AnonymousClass6WA r05 = this.A07;
            if (r05 != null) {
                r2.A07 = (AnonymousClass6WA) r05.clone();
            }
            int[] iArr = this.A0C;
            if (iArr != null && iArr.length > 0) {
                r2.A0C = (int[]) iArr.clone();
            }
            C128406Vy r06 = this.A05;
            if (r06 != null) {
                r2.A05 = r06;
            }
            return r2;
        } catch (CloneNotSupportedException e) {
            throw AnonymousClass0x9.A0i(e);
        }
    }
}
