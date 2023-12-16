package X;

import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: X.6Os  reason: invalid class name and case insensitive filesystem */
public final class C126636Os extends C153157al {
    public int A00;
    public AnonymousClass7BH A01;
    public AnonymousClass7P0 A02;
    public C149617Nd A03;
    public boolean A04;

    public boolean A01(AnonymousClass7G1 r22, C161467pi r23, long j) {
        int i;
        AnonymousClass7G1 r20 = r22;
        if (this.A03 != null) {
            r20.A00.getClass();
            return false;
        }
        AnonymousClass7P0 r0 = this.A02;
        AnonymousClass7P0 r18 = r0;
        C149617Nd r4 = null;
        C161467pi r6 = r23;
        if (r0 == null) {
            C154007cQ.A00(r6, 1, false);
            r6.A09();
            int A0C = r6.A0C();
            int A09 = r6.A09();
            int A08 = r6.A08();
            if (A08 <= 0) {
                A08 = -1;
            }
            int A082 = r6.A08();
            if (A082 <= 0) {
                A082 = -1;
            }
            r6.A08();
            int A0C2 = r6.A0C();
            int pow = (int) Math.pow(2.0d, (double) (A0C2 & 15));
            int pow2 = (int) Math.pow(2.0d, (double) ((A0C2 & 240) >> 4));
            r6.A0C();
            this.A02 = new AnonymousClass7P0(Arrays.copyOf(r6.A02, r6.A00), A0C, A09, A08, A082, pow, pow2);
        } else {
            AnonymousClass7BH r02 = this.A01;
            AnonymousClass7BH r17 = r02;
            if (r02 == null) {
                C154007cQ.A00(r6, 3, false);
                r6.A0O((int) r6.A0G());
                long A0G = r6.A0G();
                String[] strArr = new String[((int) A0G)];
                for (int i2 = 0; ((long) i2) < A0G; i2++) {
                    strArr[i2] = r6.A0O((int) r6.A0G());
                }
                if ((r6.A0C() & 1) != 0) {
                    this.A01 = new AnonymousClass7BH(strArr);
                } else {
                    throw AnonymousClass6u7.A01("framing bit expected to be set");
                }
            } else {
                int i3 = r6.A00;
                byte[] bArr = new byte[i3];
                byte[] bArr2 = bArr;
                System.arraycopy(r6.A02, 0, bArr, 0, i3);
                int i4 = r18.A04;
                int i5 = 0;
                C154007cQ.A00(r6, 5, false);
                int A0C3 = r6.A0C() + 1;
                AnonymousClass7Z6 r42 = new AnonymousClass7Z6(r6.A02);
                r42.A01(r6.A01 * 8);
                int i6 = 0;
                while (i6 < A0C3) {
                    if (r42.A00(24) == 5653314) {
                        int A002 = r42.A00(16);
                        int A003 = r42.A00(24);
                        long j2 = 0;
                        if (!r42.A02()) {
                            boolean A022 = r42.A02();
                            for (int i7 = 0; i7 < A003; i7++) {
                                if (!A022 || r42.A02()) {
                                    r42.A00(5);
                                }
                            }
                        } else {
                            r42.A00(5);
                            int i8 = 0;
                            while (i8 < A003) {
                                int i9 = 0;
                                for (int i10 = A003 - i8; i10 > 0; i10 >>>= 1) {
                                    i9++;
                                }
                                int A004 = r42.A00(i9);
                                for (int i11 = 0; i11 < A004 && i8 < A003; i11++) {
                                    i8++;
                                }
                            }
                        }
                        int A005 = r42.A00(4);
                        if (A005 <= 2) {
                            if (A005 == 1 || A005 == 2) {
                                r42.A01(32);
                                r42.A01(32);
                                int A006 = r42.A00(4) + 1;
                                r42.A01(1);
                                if (A005 != 1) {
                                    j2 = ((long) A003) * ((long) A002);
                                } else if (A002 != 0) {
                                    j2 = (long) Math.floor(Math.pow((double) ((long) A003), 1.0d / ((double) ((long) A002))));
                                }
                                r42.A01((int) (j2 * ((long) A006)));
                            }
                            i6++;
                        } else {
                            throw AnonymousClass6u7.A02("lookup type greater than 2 not decodable: ", AnonymousClass001.A0o(), A005);
                        }
                    } else {
                        StringBuilder A0o = AnonymousClass001.A0o();
                        A0o.append("expected code book to start with [0x56, 0x43, 0x42] at ");
                        throw AnonymousClass6u7.A01(AnonymousClass000.A0h(A0o, (r42.A01 * 8) + r42.A00));
                    }
                }
                int A007 = r42.A00(6) + 1;
                while (i5 < A007) {
                    if (r42.A00(16) == 0) {
                        i5++;
                    } else {
                        throw AnonymousClass6u7.A01("placeholder of time domain transforms not zeroed out");
                    }
                }
                int A008 = r42.A00(6) + 1;
                for (int i12 = 0; i12 < A008; i12++) {
                    int A009 = r42.A00(16);
                    if (A009 == 0) {
                        r42.A01(8);
                        r42.A01(16);
                        r42.A01(16);
                        r42.A01(6);
                        r42.A01(8);
                        int A0010 = r42.A00(4) + 1;
                        for (int i13 = 0; i13 < A0010; i13++) {
                            r42.A01(8);
                        }
                    } else if (A009 == 1) {
                        int A0011 = r42.A00(5);
                        int[] iArr = new int[A0011];
                        int i14 = -1;
                        for (int i15 = 0; i15 < A0011; i15++) {
                            int A0012 = r42.A00(4);
                            iArr[i15] = A0012;
                            if (A0012 > i14) {
                                i14 = A0012;
                            }
                        }
                        int i16 = i14 + 1;
                        int[] iArr2 = new int[i16];
                        for (int i17 = 0; i17 < i16; i17++) {
                            iArr2[i17] = r42.A00(3) + 1;
                            int A0013 = r42.A00(2);
                            if (A0013 > 0) {
                                r42.A01(8);
                            }
                            for (int i18 = 0; i18 < (1 << A0013); i18++) {
                                r42.A01(8);
                            }
                        }
                        r42.A01(2);
                        int A0014 = r42.A00(4);
                        int i19 = 0;
                        int i20 = 0;
                        for (int i21 = 0; i21 < A0011; i21++) {
                            i19 += iArr2[iArr[i21]];
                            while (i20 < i19) {
                                r42.A01(A0014);
                                i20++;
                            }
                        }
                    } else {
                        throw AnonymousClass6u7.A02("floor type greater than 1 not decodable: ", AnonymousClass001.A0o(), A009);
                    }
                }
                int A0015 = r42.A00(6) + 1;
                int i22 = 0;
                while (i22 < A0015) {
                    if (r42.A00(16) <= 2) {
                        r42.A01(24);
                        r42.A01(24);
                        r42.A01(24);
                        int A0016 = r42.A00(6) + 1;
                        r42.A01(8);
                        int[] iArr3 = new int[A0016];
                        for (int i23 = 0; i23 < A0016; i23++) {
                            int A0017 = r42.A00(3);
                            int i24 = 0;
                            if (r42.A02()) {
                                i24 = r42.A00(5);
                            }
                            iArr3[i23] = (i24 * 8) + A0017;
                        }
                        for (int i25 = 0; i25 < A0016; i25++) {
                            int i26 = 0;
                            do {
                                if ((iArr3[i25] & (1 << i26)) != 0) {
                                    r42.A01(8);
                                }
                                i26++;
                            } while (i26 < 8);
                        }
                        i22++;
                    } else {
                        throw AnonymousClass6u7.A01("residueType greater than 2 is not decodable");
                    }
                }
                int A0018 = r42.A00(6) + 1;
                for (int i27 = 0; i27 < A0018; i27++) {
                    int A0019 = r42.A00(16);
                    if (A0019 != 0) {
                        Log.e("VorbisUtil", AnonymousClass000.A0Y("mapping type other than 0 not supported: ", AnonymousClass001.A0o(), A0019));
                    } else {
                        if (r42.A02()) {
                            i = r42.A00(4) + 1;
                        } else {
                            i = 1;
                        }
                        if (r42.A02()) {
                            int A0020 = r42.A00(8) + 1;
                            for (int i28 = 0; i28 < A0020; i28++) {
                                int i29 = 0;
                                for (int i30 = i4 - 1; i30 > 0; i30 >>>= 1) {
                                    i29++;
                                }
                                r42.A01(i29);
                                r42.A01(i29);
                            }
                        }
                        if (r42.A00(2) == 0) {
                            if (i > 1) {
                                for (int i31 = 0; i31 < i4; i31++) {
                                    r42.A01(4);
                                }
                            }
                            for (int i32 = 0; i32 < i; i32++) {
                                r42.A01(8);
                                r42.A01(8);
                                r42.A01(8);
                            }
                        } else {
                            throw AnonymousClass6u7.A01("to reserved bits must be zero after mapping coupling steps");
                        }
                    }
                }
                int A0021 = r42.A00(6) + 1;
                AnonymousClass7BI[] r3 = new AnonymousClass7BI[A0021];
                for (int i33 = 0; i33 < A0021; i33++) {
                    boolean A023 = r42.A02();
                    r42.A00(16);
                    r42.A00(16);
                    r42.A00(8);
                    r3[i33] = new AnonymousClass7BI(A023);
                }
                if (r42.A02()) {
                    int i34 = 0;
                    for (int i35 = A0021 - 1; i35 > 0; i35 >>>= 1) {
                        i34++;
                    }
                    r4 = new C149617Nd(r17, r18, bArr2, r3, i34);
                } else {
                    throw AnonymousClass6u7.A01("framing bit after modes not set as expected");
                }
            }
        }
        this.A03 = r4;
        if (r4 != null) {
            AnonymousClass7P0 r32 = r4.A02;
            ArrayList A0s = AnonymousClass001.A0s();
            A0s.add(r32.A06);
            A0s.add(r4.A03);
            C157057he A0022 = C157057he.A00();
            A0022.A0R = "audio/vorbis";
            A0022.A03 = r32.A01;
            A0022.A0A = r32.A00;
            A0022.A04 = r32.A04;
            A0022.A0D = r32.A05;
            A0022.A0S = A0s;
            r20.A00 = C166527yp.A00(A0022);
        }
        return true;
    }

    public void A00(boolean z) {
        super.A00(z);
        if (z) {
            this.A03 = null;
            this.A02 = null;
            this.A01 = null;
        }
        this.A00 = 0;
        this.A04 = false;
    }
}
