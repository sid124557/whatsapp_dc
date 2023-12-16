package X;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.6Oz  reason: invalid class name and case insensitive filesystem */
public final class C126706Oz extends C1689287h {
    public C153267ax A00;
    public final C160807oL A01 = new C160807oL();
    public final C161467pi A02 = new C161467pi();

    public C166547ys A06(AnonymousClass6OZ r31, ByteBuffer byteBuffer) {
        C187368x6 r12;
        boolean z;
        long j;
        boolean z2;
        long j2;
        int i;
        int i2;
        int i3;
        boolean z3;
        boolean z4;
        boolean z5;
        long j3;
        boolean z6;
        long j4;
        int i4;
        int i5;
        int i6;
        boolean z7;
        List list;
        long j5;
        ArrayList arrayList;
        C153267ax r0 = this.A00;
        AnonymousClass6OZ r6 = r31;
        if (r0 == null || r6.A00 != r0.A00()) {
            long j6 = r6.A00;
            C153267ax r2 = new C153267ax(j6);
            this.A00 = r2;
            r2.A01(j6 - r6.A00);
        }
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        C161467pi r7 = this.A02;
        r7.A0U(array, limit);
        C160807oL r62 = this.A01;
        r62.A03 = array;
        r62.A02 = 0;
        r62.A00 = 0;
        r62.A01 = limit;
        r62.A09(39);
        long A04 = (((long) r62.A04(1)) << 32) | ((long) r62.A04(32));
        r62.A09(20);
        int A042 = r62.A04(12);
        int A043 = r62.A04(8);
        r7.A0T(14);
        if (A043 == 0) {
            r12 = new AnonymousClass6PD();
        } else if (A043 == 255) {
            long A0I = r7.A0I();
            int i7 = A042 - 4;
            byte[] bArr = new byte[i7];
            r7.A0V(bArr, 0, i7);
            r12 = new AnonymousClass6PG(bArr, A0I, A04);
        } else if (A043 == 4) {
            int A0C = r7.A0C();
            ArrayList A0I2 = AnonymousClass002.A0I(A0C);
            for (int i8 = 0; i8 < A0C; i8++) {
                long A0I3 = r7.A0I();
                boolean A1S = AnonymousClass000.A1S(r7.A0C() & 128);
                ArrayList A0s = AnonymousClass001.A0s();
                if (!A1S) {
                    int A0C2 = r7.A0C();
                    z = AnonymousClass000.A1S(A0C2 & 128);
                    z3 = AnonymousClass000.A1S(A0C2 & 64);
                    boolean A1S2 = AnonymousClass000.A1S(A0C2 & 32);
                    if (z3) {
                        j = r7.A0I();
                    } else {
                        j = -9223372036854775807L;
                        int A0C3 = r7.A0C();
                        A0s = AnonymousClass002.A0I(A0C3);
                        for (int i9 = 0; i9 < A0C3; i9++) {
                            A0s.add(new AnonymousClass7G3(r7.A0C(), r7.A0I()));
                        }
                    }
                    if (A1S2) {
                        long A0C4 = (long) r7.A0C();
                        z2 = AnonymousClass000.A1S(((128 & A0C4) > 0 ? 1 : ((128 & A0C4) == 0 ? 0 : -1)));
                        j2 = ((((A0C4 & 1) << 32) | r7.A0I()) * 1000) / 90;
                    } else {
                        z2 = false;
                        j2 = -9223372036854775807L;
                    }
                    i = r7.A0F();
                    i2 = r7.A0C();
                    i3 = r7.A0C();
                } else {
                    z = false;
                    j = -9223372036854775807L;
                    z2 = false;
                    j2 = -9223372036854775807L;
                    i = 0;
                    i2 = 0;
                    i3 = 0;
                    z3 = false;
                }
                A0I2.add(new C156987hX(A0s, i, i2, i3, A0I3, j, j2, A1S, z, z3, z2));
            }
            r12 = new AnonymousClass6PE((List) A0I2);
        } else if (A043 == 5) {
            C153267ax r8 = this.A00;
            long A0I4 = r7.A0I();
            boolean A1S3 = AnonymousClass000.A1S(r7.A0C() & 128);
            List emptyList = Collections.emptyList();
            if (!A1S3) {
                int A0C5 = r7.A0C();
                z4 = AnonymousClass000.A1S(A0C5 & 128);
                z7 = AnonymousClass000.A1S(A0C5 & 64);
                boolean A1S4 = AnonymousClass000.A1S(A0C5 & 32);
                z5 = AnonymousClass000.A1S(A0C5 & 16);
                if (!z7 || z5) {
                    j3 = -9223372036854775807L;
                    arrayList = emptyList;
                    if (!z7) {
                        int A0C6 = r7.A0C();
                        ArrayList A0I5 = AnonymousClass002.A0I(A0C6);
                        for (int i10 = 0; i10 < A0C6; i10++) {
                            int A0C7 = r7.A0C();
                            if (!z5) {
                                j5 = AnonymousClass6PF.A00(r7, A04);
                            } else {
                                j5 = -9223372036854775807L;
                            }
                            A0I5.add(new C148617Jb(A0C7, j5, r8.A02(j5)));
                        }
                        arrayList = A0I5;
                    }
                } else {
                    j3 = AnonymousClass6PF.A00(r7, A04);
                    arrayList = emptyList;
                }
                if (A1S4) {
                    long A0C8 = (long) r7.A0C();
                    z6 = AnonymousClass000.A1S(((128 & A0C8) > 0 ? 1 : ((128 & A0C8) == 0 ? 0 : -1)));
                    j4 = ((((A0C8 & 1) << 32) | r7.A0I()) * 1000) / 90;
                } else {
                    z6 = false;
                    j4 = -9223372036854775807L;
                }
                i4 = r7.A0F();
                i5 = r7.A0C();
                i6 = r7.A0C();
                list = arrayList;
            } else {
                z4 = false;
                z5 = false;
                j3 = -9223372036854775807L;
                z6 = false;
                j4 = -9223372036854775807L;
                i4 = 0;
                i5 = 0;
                i6 = 0;
                z7 = false;
                list = emptyList;
            }
            r12 = new AnonymousClass6PH(list, i4, i5, i6, A0I4, j3, r8.A02(j3), j4, A1S3, z4, z7, z5, z6);
        } else if (A043 != 6) {
            r12 = null;
        } else {
            C153267ax r4 = this.A00;
            long A002 = AnonymousClass6PF.A00(r7, A04);
            r12 = new AnonymousClass6PF(A002, r4.A02(A002));
        }
        return new C166547ys(r12 == null ? new C187368x6[0] : new C187368x6[]{r12});
    }
}
