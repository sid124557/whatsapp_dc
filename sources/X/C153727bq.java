package X;

/* renamed from: X.7bq  reason: invalid class name and case insensitive filesystem */
public final class C153727bq {
    public int A00;
    public int A01 = 1;
    public int A02;
    public int A03;
    public int A04;
    public String A05;
    public C159077l4 A06;
    public C159077l4 A07 = new C159077l4();
    public C161677qE[] A08 = new C161677qE[256];
    public C161677qE[] A09;
    public final C152807a9 A0A;

    public int A02(String str) {
        int hashCode = (str.hashCode() + 1) & Integer.MAX_VALUE;
        for (C161677qE A002 = A00(this, hashCode); A002 != null; A002 = A002.A01) {
            if (A002.A04 == 1 && A002.A02 == hashCode && A002.A08.equals(str)) {
                return A002.A03;
            }
        }
        C159077l4 r9 = this.A07;
        r9.A02(1);
        int length = str.length();
        if (length <= 65535) {
            int i = r9.A00;
            if (i + 2 + length > r9.A01.length) {
                r9.A05(length + 2);
            }
            byte[] bArr = r9.A01;
            int i2 = i + 1;
            AnonymousClass6CA.A0f(bArr, length, i);
            int i3 = i2 + 1;
            bArr[i2] = (byte) length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    r9.A00 = i3;
                    break;
                }
                char charAt = str.charAt(i4);
                if (charAt < 1 || charAt > 127) {
                    r9.A00 = i3;
                    r9.A09(str, i4, 65535);
                } else {
                    i4 = AnonymousClass6CA.A0D(bArr, charAt, i3, i4);
                    i3++;
                }
            }
            r9.A00 = i3;
            r9.A09(str, i4, 65535);
            int i5 = this.A01;
            this.A01 = i5 + 1;
            C161677qE r0 = new C161677qE(i5, 1, str, hashCode);
            A0F(r0);
            return r0.A03;
        }
        throw AnonymousClass001.A0c("UTF8 string too large");
    }

    public final C161677qE A08(int i, long j) {
        long j2 = j;
        int i2 = (int) j;
        int i3 = i;
        int A062 = C86664Kz.A06(j);
        int i4 = (i + i2 + A062) & Integer.MAX_VALUE;
        for (C161677qE A002 = A00(this, i4); A002 != null; A002 = A002.A01) {
            if (A002.A04 == i && A002.A02 == i4 && A002.A05 == j) {
                return A002;
            }
        }
        int i5 = this.A01;
        C159077l4 r4 = this.A07;
        r4.A02(i);
        int i6 = r4.A00;
        if (i6 + 8 > r4.A01.length) {
            r4.A05(8);
        }
        byte[] bArr = r4.A01;
        int i7 = i6 + 1;
        int A0D = AnonymousClass6CA.A0D(bArr, A062 >>> 24, i6, i7);
        int A0D2 = AnonymousClass6CA.A0D(bArr, A062 >>> 16, i7, A0D);
        AnonymousClass6CA.A0f(bArr, A062, A0D);
        int i8 = A0D2 + 1;
        int A0D3 = AnonymousClass6CA.A0D(bArr, A062, A0D2, i8);
        int A0D4 = AnonymousClass6CA.A0D(bArr, i2 >>> 24, i8, A0D3);
        bArr[A0D3] = (byte) (i2 >>> 16);
        C159077l4.A01(r4, bArr, A0D4, i2);
        this.A01 += 2;
        C161677qE r6 = new C161677qE(i5, i3, j2, i4);
        A0F(r6);
        return r6;
    }

    public final C161677qE A0B(String str, String str2, int i, int i2) {
        String str3 = str;
        String str4 = str2;
        int i3 = i2;
        int i4 = i;
        int hashCode = (i + (str.hashCode() * str4.hashCode() * (i2 + 1))) & Integer.MAX_VALUE;
        for (C161677qE A002 = A00(this, hashCode); A002 != null; A002 = A002.A01) {
            if (A002.A04 == i4 && A002.A02 == hashCode && A002.A05 == ((long) i3) && A002.A06.equals(str) && A002.A08.equals(str4)) {
                return A002;
            }
        }
        this.A07.A08(i4, i3, A05(str, str4));
        int i5 = this.A01;
        this.A01 = i5 + 1;
        C161677qE r5 = new C161677qE((String) null, str3, str4, i5, i4, hashCode, (long) i3);
        A0F(r5);
        return r5;
    }

    public final C161677qE A0C(String str, String str2, String str3, int i) {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        int i2 = i;
        int hashCode = (i + (str.hashCode() * str2.hashCode() * str3.hashCode())) & Integer.MAX_VALUE;
        for (C161677qE A002 = A00(this, hashCode); A002 != null; A002 = A002.A01) {
            if (A002.A04 == i && A002.A02 == hashCode && A002.A07.equals(str) && A002.A06.equals(str2) && A002.A08.equals(str3)) {
                return A002;
            }
        }
        this.A07.A08(i, A0A(str, 7).A03, A05(str2, str3));
        int i3 = this.A01;
        this.A01 = i3 + 1;
        C161677qE r2 = new C161677qE(str4, str5, str6, i3, i2, hashCode, 0);
        A0F(r2);
        return r2;
    }

    public static C161677qE A00(C153727bq r1, int i) {
        C161677qE[] r12 = r1.A08;
        return r12[i % r12.length];
    }

    public int A03(String str) {
        int A082 = AnonymousClass0x7.A08(str, 128) & Integer.MAX_VALUE;
        for (C161677qE A002 = A00(this, A082); A002 != null; A002 = A002.A01) {
            if (A002.A04 == 128 && A002.A02 == A082 && A002.A08.equals(str)) {
                return A002.A03;
            }
        }
        return A06(new C161677qE(this.A04, 128, str, A082));
    }

    public int A04(String str, int i) {
        String str2 = str;
        int A082 = (AnonymousClass0x7.A08(str, 129) + i) & Integer.MAX_VALUE;
        for (C161677qE A002 = A00(this, A082); A002 != null; A002 = A002.A01) {
            if (A002.A04 == 129 && A002.A02 == A082 && A002.A05 == ((long) i) && A002.A08.equals(str)) {
                return A002.A03;
            }
        }
        return A06(new C161677qE(this.A04, A082, str2, (long) i));
    }

    public int A05(String str, String str2) {
        int hashCode = ((str.hashCode() * str2.hashCode()) + 12) & Integer.MAX_VALUE;
        C161677qE A002 = A00(this, hashCode);
        while (true) {
            if (A002 != null) {
                if (A002.A04 == 12 && A002.A02 == hashCode && A002.A06.equals(str) && A002.A08.equals(str2)) {
                    break;
                }
                A002 = A002.A01;
            } else {
                this.A07.A08(12, A02(str), A02(str2));
                int i = this.A01;
                this.A01 = i + 1;
                A002 = new C161677qE(str, str2, i, hashCode);
                A0F(A002);
                break;
            }
        }
        return A002.A03;
    }

    public final int A06(C161677qE r5) {
        C161677qE[] r3 = this.A09;
        if (r3 == null) {
            r3 = new C161677qE[16];
            this.A09 = r3;
        }
        int i = this.A04;
        int length = r3.length;
        if (i == length) {
            C161677qE[] r1 = new C161677qE[(length * 2)];
            System.arraycopy(r3, 0, r1, 0, length);
            this.A09 = r1;
            r3 = r1;
        }
        int i2 = this.A04;
        this.A04 = i2 + 1;
        r3[i2] = r5;
        A0F(r5);
        return r5.A03;
    }

    public C161677qE A09(Object obj) {
        int intValue;
        if (!(obj instanceof Integer) && !(obj instanceof Byte)) {
            if (obj instanceof Character) {
                intValue = ((Character) obj).charValue();
            } else if (!(obj instanceof Short)) {
                if (obj instanceof Boolean) {
                    intValue = AnonymousClass001.A1Z(obj);
                } else if (obj instanceof Float) {
                    return A07(4, Float.floatToRawIntBits(AnonymousClass001.A05(obj)));
                } else {
                    if (obj instanceof Long) {
                        return A08(5, C18310x6.A0B(obj));
                    }
                    if (obj instanceof Double) {
                        return A08(6, Double.doubleToRawLongBits(AnonymousClass6C9.A02(obj)));
                    }
                    if (obj instanceof String) {
                        return A0A((String) obj, 8);
                    }
                    if (obj instanceof C162147rL) {
                        C162147rL r11 = (C162147rL) obj;
                        int i = r11.A00;
                        if (i == 12 || i == 10) {
                            return A0A(r11.A03.substring(r11.A01, r11.A02), 7);
                        }
                        String A062 = r11.A06();
                        if (i == 11) {
                            return A0A(A062, 16);
                        }
                        return A0A(A062, 7);
                    } else if (obj instanceof C152517Ze) {
                        C152517Ze r112 = (C152517Ze) obj;
                        return A0D(r112.A03, r112.A02, r112.A01, r112.A00, r112.A04);
                    } else if (obj instanceof AnonymousClass7ZU) {
                        AnonymousClass7ZU r113 = (AnonymousClass7ZU) obj;
                        return A0B(r113.A01, r113.A00, 17, A0E(r113.A02, r113.A03).A03);
                    } else {
                        throw AnonymousClass000.A0E(obj, "value ", AnonymousClass001.A0o());
                    }
                }
            }
            return A07(3, intValue);
        }
        intValue = ((Number) obj).intValue();
        return A07(3, intValue);
    }

    public C161677qE A0D(String str, String str2, String str3, int i, boolean z) {
        int i2;
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        int i3 = i;
        int hashCode = ((str4.hashCode() * str5.hashCode() * str6.hashCode() * i) + 15) & Integer.MAX_VALUE;
        for (C161677qE A002 = A00(this, hashCode); A002 != null; A002 = A002.A01) {
            if (A002.A04 == 15 && A002.A02 == hashCode && A002.A05 == ((long) i3) && A002.A07.equals(str4) && A002.A06.equals(str5) && A002.A08.equals(str6)) {
                return A002;
            }
        }
        C159077l4 r6 = this.A07;
        if (i3 <= 4) {
            i2 = 9;
        } else {
            i2 = 10;
            if (z) {
                i2 = 11;
            }
        }
        int i4 = A0C(str4, str5, str6, i2).A03;
        int i5 = r6.A00;
        if (i5 + 4 > r6.A01.length) {
            r6.A05(4);
        }
        byte[] bArr = r6.A01;
        int i6 = i5 + 1;
        int A0D = AnonymousClass6CA.A0D(bArr, 15, i5, i6);
        bArr[i6] = (byte) i3;
        C159077l4.A01(r6, bArr, A0D, i4);
        int i7 = this.A01;
        this.A01 = i7 + 1;
        C161677qE r8 = new C161677qE(str4, str5, str6, i7, 15, hashCode, (long) i3);
        A0F(r8);
        return r8;
    }

    public C161677qE A0E(C152517Ze r17, Object... objArr) {
        C159077l4 r7 = this.A06;
        if (r7 == null) {
            r7 = new C159077l4();
            this.A06 = r7;
        }
        int[] iArr = new int[r4];
        for (int i = 0; i < r4; i++) {
            iArr[i] = A09(objArr[i]).A03;
        }
        int i2 = r7.A00;
        C152517Ze r8 = r17;
        r7.A04(A0D(r8.A03, r8.A02, r8.A01, r8.A00, r8.A04).A03);
        r7.A04(r4);
        for (int i3 = 0; i3 < r4; i3++) {
            r7.A04(iArr[i3]);
        }
        int i4 = r7.A00 - i2;
        int hashCode = r8.hashCode();
        for (Object A052 : objArr) {
            hashCode = AnonymousClass6CA.A05(A052, hashCode);
        }
        int i5 = hashCode & Integer.MAX_VALUE;
        C159077l4 r6 = this.A06;
        byte[] bArr = r6.A01;
        for (C161677qE A002 = A00(this, i5); A002 != null; A002 = A002.A01) {
            if (A002.A04 == 64 && A002.A02 == i5) {
                int i6 = (int) A002.A05;
                int i7 = 0;
                while (i7 < i4) {
                    if (bArr[i2 + i7] == bArr[i6 + i7]) {
                        i7++;
                    }
                }
                r6.A00 = i2;
                return A002;
            }
        }
        int i8 = this.A00;
        this.A00 = i8 + 1;
        C161677qE r10 = new C161677qE(i8, 64, (long) i2, i5);
        A0F(r10);
        return r10;
    }

    public final void A0F(C161677qE r10) {
        int i = this.A02;
        C161677qE[] r7 = this.A08;
        int length = r7.length;
        if (i > (length * 3) / 4) {
            int i2 = (length * 2) + 1;
            C161677qE[] r5 = new C161677qE[i2];
            for (int i3 = length - 1; i3 >= 0; i3--) {
                C161677qE r3 = r7[i3];
                while (r3 != null) {
                    int i4 = r3.A02 % i2;
                    C161677qE r1 = r3.A01;
                    r3.A01 = r5[i4];
                    r5[i4] = r3;
                    r3 = r1;
                }
            }
            this.A08 = r5;
            r7 = r5;
        }
        this.A02 = i + 1;
        int length2 = r10.A02 % r7.length;
        r10.A01 = r7[length2];
        r7[length2] = r10;
    }

    public C153727bq(C152807a9 r2) {
        this.A0A = r2;
    }

    public static void A01(String str, C159077l4 r1, C153727bq r2) {
        r1.A04(r2.A02(str));
    }

    public final C161677qE A07(int i, int i2) {
        int i3 = i;
        int i4 = (i + i2) & Integer.MAX_VALUE;
        for (C161677qE A002 = A00(this, i4); A002 != null; A002 = A002.A01) {
            if (A002.A04 == i && A002.A02 == i4 && A002.A05 == ((long) i2)) {
                return A002;
            }
        }
        C159077l4 r0 = this.A07;
        r0.A02(i);
        r0.A03(i2);
        int i5 = this.A01;
        this.A01 = i5 + 1;
        C161677qE r4 = new C161677qE(i5, i3, (long) i2, i4);
        A0F(r4);
        return r4;
    }

    public final C161677qE A0A(String str, int i) {
        int A082 = AnonymousClass0x7.A08(str, i) & Integer.MAX_VALUE;
        for (C161677qE A002 = A00(this, A082); A002 != null; A002 = A002.A01) {
            if (A002.A04 == i && A002.A02 == A082 && A002.A08.equals(str)) {
                return A002;
            }
        }
        this.A07.A07(i, A02(str));
        int i2 = this.A01;
        this.A01 = i2 + 1;
        C161677qE r0 = new C161677qE(i2, i, str, A082);
        A0F(r0);
        return r0;
    }
}
