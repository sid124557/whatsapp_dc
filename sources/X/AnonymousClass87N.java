package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;

/* renamed from: X.87N  reason: invalid class name */
public final class AnonymousClass87N implements C184908sk {
    public static final int[] A0C = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    public static final int[] A0D = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public final int A04;
    public final int A05;
    public final C166527yp A06;
    public final C187028wK A07;
    public final C185598tw A08;
    public final AnonymousClass7OS A09;
    public final C161467pi A0A;
    public final byte[] A0B;

    public void Bju(long j) {
        this.A00 = 0;
        this.A03 = j;
        this.A01 = 0;
        this.A02 = 0;
    }

    public final void A00(int i) {
        long j = this.A03;
        long j2 = this.A02;
        AnonymousClass7OS r2 = this.A09;
        long A052 = j + C162387ry.A05(j2, SearchActionVerificationClientService.MS_TO_NS, (long) r2.A03);
        int i2 = i * 2 * r2.A04;
        this.A08.Bkh((AnonymousClass7WZ) null, 1, i2, this.A01 - i2, A052);
        this.A02 += (long) i;
        this.A01 -= i2;
    }

    public void BFp(int i, long j) {
        this.A07.Bl0(new C1687286n(this.A09, this.A04, (long) i, j));
        this.A08.B3T(this.A06);
    }

    public boolean Bke(C187648xa r25, long j) {
        int i;
        int i2 = this.A05;
        int i3 = this.A01;
        AnonymousClass7OS r1 = this.A09;
        int i4 = r1.A04;
        int i5 = i4 * 2;
        int i6 = this.A04;
        int i7 = r1.A01;
        int i8 = ((((i2 - (i3 / i5)) + i6) - 1) / i6) * i7;
        long j2 = j;
        boolean z = false;
        if (j != 0) {
            while (true) {
                int i9 = this.A00;
                if (i9 < i8) {
                    int read = r25.read(this.A0B, i9, AnonymousClass6CA.A02((long) (i8 - i9), j2));
                    if (read == -1) {
                        break;
                    }
                    this.A00 += read;
                } else {
                    break;
                }
            }
        }
        z = true;
        int i10 = this.A00 / i7;
        if (i10 > 0) {
            byte[] bArr = this.A0B;
            C161467pi r12 = this.A0A;
            int i11 = 0;
            do {
                for (int i12 = 0; i12 < i4; i12++) {
                    byte[] bArr2 = r12.A02;
                    int i13 = (i11 * i7) + (i12 * 4);
                    int i14 = (i4 * 4) + i13;
                    int i15 = (i7 / i4) - 4;
                    int A0C2 = (short) AnonymousClass6CA.A0C(bArr, i13, AnonymousClass6C9.A0F(bArr, i13 + 1));
                    int min = Math.min(bArr[i13 + 2] & 255, 88);
                    int[] iArr = A0D;
                    int i16 = iArr[min];
                    int i17 = ((i11 * i6 * i4) + i12) * 2;
                    AnonymousClass6C9.A1G(bArr2, A0C2, i17);
                    bArr2[i17 + 1] = (byte) (A0C2 >> 8);
                    for (int i18 = 0; i18 < i15 * 2; i18++) {
                        byte b = bArr[((i18 / 8) * i4 * 4) + i14 + ((i18 / 2) % 4)] & 255;
                        int i19 = b >> 4;
                        if (i18 % 2 == 0) {
                            i19 = b & 15;
                        }
                        int i20 = ((((i19 & 7) * 2) + 1) * i16) >> 3;
                        if ((i19 & 8) != 0) {
                            i20 = -i20;
                        }
                        A0C2 = Math.max(-32768, Math.min(A0C2 + i20, 32767));
                        i17 += i5;
                        AnonymousClass6C9.A1G(bArr2, A0C2, i17);
                        bArr2[i17 + 1] = (byte) (A0C2 >> 8);
                        min = Math.max(0, Math.min(min + A0C[i19], iArr.length - 1));
                        i16 = iArr[min];
                    }
                }
                i11++;
            } while (i11 < i10);
            r12.A0S(0);
            r12.A0R(i6 * i10 * 2 * i4);
            this.A00 -= i10 * i7;
            int i21 = r12.A00;
            this.A08.Bkc(r12, i21);
            int i22 = this.A01 + i21;
            this.A01 = i22;
            int i23 = i2;
            if (i22 / i5 >= i23) {
                A00(i23);
            }
        }
        if (z && (i = this.A01 / i5) > 0) {
            A00(i);
        }
        return z;
    }

    public AnonymousClass87N(C187028wK r9, C185598tw r10, AnonymousClass7OS r11) {
        this.A07 = r9;
        this.A08 = r10;
        this.A09 = r11;
        int i = r11.A03;
        int max = Math.max(1, i / 10);
        this.A05 = max;
        C161467pi r0 = new C161467pi(r11.A05);
        r0.A0A();
        int A0A2 = r0.A0A();
        this.A04 = A0A2;
        int i2 = r11.A04;
        int i3 = r11.A01;
        int i4 = (((i3 - (i2 * 4)) * 8) / (r11.A00 * i2)) + 1;
        if (A0A2 == i4) {
            int i5 = ((max + A0A2) - 1) / A0A2;
            this.A0B = new byte[(i3 * i5)];
            this.A0A = C161467pi.A05(i5 * A0A2 * 2 * i2);
            int i6 = ((i * i3) * 8) / A0A2;
            C157057he A002 = C157057he.A00();
            A002.A0R = "audio/raw";
            A002.A03 = i6;
            A002.A0A = i6;
            A002.A08 = max * 2 * i2;
            A002.A04 = i2;
            A002.A0D = i;
            A002.A09 = 2;
            this.A06 = C166527yp.A00(A002);
            return;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Expected frames per block: ");
        A0o.append(i4);
        throw AnonymousClass6u7.A02("; got: ", A0o, A0A2);
    }
}
