package X;

import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: X.6Jr  reason: invalid class name and case insensitive filesystem */
public final class C125836Jr extends C153147ak {
    public int A00;
    public AnonymousClass7NS A01;
    public AnonymousClass7A2 A02;
    public AnonymousClass7OG A03;
    public boolean A04;

    public boolean A01(AnonymousClass7F6 r21, C161457ph r22, long j) {
        int i;
        if (this.A01 != null) {
            return false;
        }
        AnonymousClass7NS r14 = null;
        C161457ph r6 = r22;
        if (this.A03 == null) {
            AnonymousClass710.A00(r6, 1, false);
            r6.A07();
            int A042 = r6.A04();
            long A07 = r6.A07();
            byte[] bArr = r6.A02;
            int i2 = r6.A01 + 1 + 1 + 1 + 1;
            r6.A01 = i2;
            int i3 = i2 + 1;
            int i4 = i3 + 1;
            int A0G = AnonymousClass6C8.A0G(bArr, i3, bArr[i2] & 255);
            int i5 = i4 + 1;
            int A0G2 = AnonymousClass6C9.A0G(bArr, i4, A0G);
            int i6 = i5 + 1;
            r6.A01 = i6;
            int i7 = ((bArr[i5] & 255) << 24) | A0G2;
            r6.A01 = i6 + 1 + 1 + 1 + 1;
            int A043 = r6.A04();
            int pow = (int) Math.pow(2.0d, (double) (A043 & 15));
            int pow2 = (int) Math.pow(2.0d, (double) ((A043 & 240) >> 4));
            r6.A04();
            this.A03 = new AnonymousClass7OG(Arrays.copyOf(bArr, r6.A00), A042, i7, pow, pow2, A07);
        } else if (this.A02 == null) {
            AnonymousClass710.A00(r6, 3, false);
            r6.A0D((int) r6.A07());
            long A072 = r6.A07();
            String[] strArr = new String[((int) A072)];
            for (int i8 = 0; ((long) i8) < A072; i8++) {
                strArr[i8] = r6.A0D((int) r6.A07());
            }
            if ((r6.A04() & 1) != 0) {
                this.A02 = new AnonymousClass7A2(strArr);
            } else {
                throw C140626uD.A00("framing bit expected to be set");
            }
        } else {
            int i9 = r6.A00;
            byte[] bArr2 = new byte[i9];
            byte[] bArr3 = bArr2;
            System.arraycopy(r6.A02, 0, bArr2, 0, i9);
            int i10 = this.A03.A03;
            int i11 = 0;
            AnonymousClass710.A00(r6, 5, false);
            int A044 = r6.A04() + 1;
            AnonymousClass7Z1 r9 = new AnonymousClass7Z1(r6.A02);
            r9.A01(r6.A01 * 8);
            int i12 = 0;
            while (i12 < A044) {
                if (r9.A00(24) == 5653314) {
                    int A002 = r9.A00(16);
                    int A003 = r9.A00(24);
                    long j2 = 0;
                    if (!r9.A02()) {
                        boolean A022 = r9.A02();
                        for (int i13 = 0; i13 < A003; i13++) {
                            if (!A022 || r9.A02()) {
                                r9.A00(5);
                            }
                        }
                    } else {
                        r9.A00(5);
                        int i14 = 0;
                        while (i14 < A003) {
                            int i15 = 0;
                            for (int i16 = A003 - i14; i16 > 0; i16 >>>= 1) {
                                i15++;
                            }
                            int A004 = r9.A00(i15);
                            for (int i17 = 0; i17 < A004 && i14 < A003; i17++) {
                                i14++;
                            }
                        }
                    }
                    int A005 = r9.A00(4);
                    if (A005 <= 2) {
                        if (A005 == 1 || A005 == 2) {
                            r9.A01(32);
                            r9.A01(32);
                            int A006 = r9.A00(4) + 1;
                            r9.A01(1);
                            if (A005 != 1) {
                                j2 = ((long) A003) * ((long) A002);
                            } else if (A002 != 0) {
                                j2 = (long) Math.floor(Math.pow((double) ((long) A003), 1.0d / ((double) ((long) A002))));
                            }
                            r9.A01((int) (j2 * ((long) A006)));
                        }
                        i12++;
                    } else {
                        throw C140626uD.A00(AnonymousClass000.A0Y("lookup type greater than 2 not decodable: ", AnonymousClass001.A0o(), A005));
                    }
                } else {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("expected code book to start with [0x56, 0x43, 0x42] at ");
                    throw C140626uD.A00(AnonymousClass000.A0h(A0o, (r9.A01 * 8) + r9.A00));
                }
            }
            int A007 = r9.A00(6) + 1;
            while (i11 < A007) {
                if (r9.A00(16) == 0) {
                    i11++;
                } else {
                    throw C140626uD.A00("placeholder of time domain transforms not zeroed out");
                }
            }
            int A008 = r9.A00(6) + 1;
            for (int i18 = 0; i18 < A008; i18++) {
                int A009 = r9.A00(16);
                if (A009 == 0) {
                    r9.A01(8);
                    r9.A01(16);
                    r9.A01(16);
                    r9.A01(6);
                    r9.A01(8);
                    int A0010 = r9.A00(4) + 1;
                    for (int i19 = 0; i19 < A0010; i19++) {
                        r9.A01(8);
                    }
                } else if (A009 == 1) {
                    int A0011 = r9.A00(5);
                    int[] iArr = new int[A0011];
                    int i20 = -1;
                    for (int i21 = 0; i21 < A0011; i21++) {
                        int A0012 = r9.A00(4);
                        iArr[i21] = A0012;
                        if (A0012 > i20) {
                            i20 = A0012;
                        }
                    }
                    int i22 = i20 + 1;
                    int[] iArr2 = new int[i22];
                    for (int i23 = 0; i23 < i22; i23++) {
                        iArr2[i23] = r9.A00(3) + 1;
                        int A0013 = r9.A00(2);
                        if (A0013 > 0) {
                            r9.A01(8);
                        }
                        for (int i24 = 0; i24 < (1 << A0013); i24++) {
                            r9.A01(8);
                        }
                    }
                    r9.A01(2);
                    int A0014 = r9.A00(4);
                    int i25 = 0;
                    int i26 = 0;
                    for (int i27 = 0; i27 < A0011; i27++) {
                        i25 += iArr2[iArr[i27]];
                        while (i26 < i25) {
                            r9.A01(A0014);
                            i26++;
                        }
                    }
                } else {
                    throw C140626uD.A00(AnonymousClass000.A0Y("floor type greater than 1 not decodable: ", AnonymousClass001.A0o(), A009));
                }
            }
            int A0015 = r9.A00(6) + 1;
            int i28 = 0;
            while (i28 < A0015) {
                if (r9.A00(16) <= 2) {
                    r9.A01(24);
                    r9.A01(24);
                    r9.A01(24);
                    int A0016 = r9.A00(6) + 1;
                    r9.A01(8);
                    int[] iArr3 = new int[A0016];
                    for (int i29 = 0; i29 < A0016; i29++) {
                        int A0017 = r9.A00(3);
                        int i30 = 0;
                        if (r9.A02()) {
                            i30 = r9.A00(5);
                        }
                        iArr3[i29] = (i30 * 8) + A0017;
                    }
                    for (int i31 = 0; i31 < A0016; i31++) {
                        int i32 = 0;
                        do {
                            if ((iArr3[i31] & (1 << i32)) != 0) {
                                r9.A01(8);
                            }
                            i32++;
                        } while (i32 < 8);
                    }
                    i28++;
                } else {
                    throw C140626uD.A00("residueType greater than 2 is not decodable");
                }
            }
            int A0018 = r9.A00(6) + 1;
            for (int i33 = 0; i33 < A0018; i33++) {
                int A0019 = r9.A00(16);
                if (A0019 != 0) {
                    Log.e("VorbisUtil", AnonymousClass000.A0Y("mapping type other than 0 not supported: ", AnonymousClass001.A0o(), A0019));
                } else {
                    if (r9.A02()) {
                        i = r9.A00(4) + 1;
                    } else {
                        i = 1;
                    }
                    if (r9.A02()) {
                        int A0020 = r9.A00(8) + 1;
                        for (int i34 = 0; i34 < A0020; i34++) {
                            int i35 = 0;
                            for (int i36 = i10 - 1; i36 > 0; i36 >>>= 1) {
                                i35++;
                            }
                            r9.A01(i35);
                            r9.A01(i35);
                        }
                    }
                    if (r9.A00(2) == 0) {
                        if (i > 1) {
                            for (int i37 = 0; i37 < i10; i37++) {
                                r9.A01(4);
                            }
                        }
                        for (int i38 = 0; i38 < i; i38++) {
                            r9.A01(8);
                            r9.A01(8);
                            r9.A01(8);
                        }
                    } else {
                        throw C140626uD.A00("to reserved bits must be zero after mapping coupling steps");
                    }
                }
            }
            int A0021 = r9.A00(6) + 1;
            AnonymousClass7A3[] r3 = new AnonymousClass7A3[A0021];
            for (int i39 = 0; i39 < A0021; i39++) {
                boolean A023 = r9.A02();
                r9.A00(16);
                r9.A00(16);
                r9.A00(8);
                r3[i39] = new AnonymousClass7A3(A023);
            }
            if (r9.A02()) {
                int i40 = 0;
                for (int i41 = A0021 - 1; i41 > 0; i41 >>>= 1) {
                    i40++;
                }
                r14 = new AnonymousClass7NS(this.A02, this.A03, bArr3, r3, i40);
            } else {
                throw C140626uD.A00("framing bit after modes not set as expected");
            }
        }
        this.A01 = r14;
        if (r14 != null) {
            ArrayList A0s = AnonymousClass001.A0s();
            AnonymousClass7OG r1 = r14.A02;
            A0s.add(r1.A05);
            A0s.add(r14.A03);
            int i42 = r1.A00;
            int i43 = r1.A03;
            C157797it r12 = new C157797it();
            r12.A0P = null;
            r12.A0R = "audio/vorbis";
            r12.A0N = null;
            r12.A03 = i42;
            r12.A09 = -1;
            r12.A04 = i43;
            r12.A0E = (int) r1.A04;
            r12.A0S = A0s;
            r12.A0K = null;
            r12.A0F = 0;
            r12.A0Q = null;
            r21.A00 = new C166637z1(r12);
        }
        return true;
    }

    public void A00(boolean z) {
        super.A00(z);
        if (z) {
            this.A01 = null;
            this.A03 = null;
            this.A02 = null;
        }
        this.A00 = 0;
        this.A04 = false;
    }
}
