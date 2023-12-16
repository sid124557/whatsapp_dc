package X;

/* renamed from: X.86L  reason: invalid class name */
public final class AnonymousClass86L implements C183858qm {
    public final C161467pi A00 = new C161467pi();
    public final C153267ax A01;

    public void Bb3() {
        C161467pi r2 = this.A00;
        byte[] bArr = C162387ry.A0A;
        r2.A0U(bArr, bArr.length);
    }

    public C156517gl Bkt(C187648xa r21, long j) {
        int A02;
        long j2;
        C187648xa r5 = r21;
        long BBW = r5.BBW();
        int A022 = AnonymousClass6CA.A02(20000, r5.getLength() - BBW);
        C161467pi r4 = this.A00;
        r4.A0Q(A022);
        r5.Bgd(r4.A02, 0, A022);
        int i = -1;
        long j3 = -9223372036854775807L;
        int i2 = -1;
        while (true) {
            int i3 = r4.A00;
            int i4 = r4.A01;
            if (i3 - i4 >= 4) {
                byte[] bArr = r4.A02;
                if (C18290x4.A07(bArr, bArr[i4], i4) != 442) {
                    r4.A0T(1);
                } else {
                    r4.A0T(4);
                    long A002 = C156937hS.A00(r4);
                    if (A002 != -9223372036854775807L) {
                        long A023 = this.A01.A02(A002);
                        if (A023 > j) {
                            if (j3 == -9223372036854775807L) {
                                return new C156517gl(-1, A023, BBW);
                            }
                            j2 = (long) i2;
                        } else if (100000 + A023 > j) {
                            j2 = (long) r4.A01;
                            break;
                        } else {
                            i2 = r4.A01;
                            j3 = A023;
                        }
                    }
                    int i5 = r4.A00;
                    if (i5 - r4.A01 >= 10 && C161467pi.A00(r4) >= (A02 = C161467pi.A02(r4, 9) & 7)) {
                        r4.A0T(A02);
                        int i6 = r4.A00;
                        int i7 = r4.A01;
                        if (i6 - i7 >= 4) {
                            byte[] bArr2 = r4.A02;
                            if (C18290x4.A07(bArr2, bArr2[i7], i7) == 443) {
                                r4.A0T(4);
                                int A0F = r4.A0F();
                                if (C161467pi.A00(r4) >= A0F) {
                                    r4.A0T(A0F);
                                }
                            }
                            while (true) {
                                int i8 = r4.A00;
                                int i9 = r4.A01;
                                if (i8 - i9 < 4) {
                                    break;
                                }
                                byte[] bArr3 = r4.A02;
                                int A07 = C18290x4.A07(bArr3, bArr3[i9], i9);
                                if (A07 != 442 && A07 != 441 && (A07 >>> 8) == 1) {
                                    r4.A0T(4);
                                    int i10 = r4.A00;
                                    if (i10 - r4.A01 < 2) {
                                        break;
                                    }
                                    r4.A0S(Math.min(i10, r4.A01 + r4.A0F()));
                                } else {
                                    break;
                                }
                            }
                            i = r4.A01;
                        }
                    }
                    r4.A0S(i5);
                    i = r4.A01;
                }
            } else if (j3 != -9223372036854775807L) {
                return new C156517gl(-2, j3, BBW + ((long) i));
            } else {
                return C156517gl.A03;
            }
        }
        return new C156517gl(0, -9223372036854775807L, BBW + j2);
    }

    public AnonymousClass86L(C153267ax r2) {
        this.A01 = r2;
    }
}
