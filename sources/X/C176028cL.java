package X;

/* renamed from: X.8cL  reason: invalid class name and case insensitive filesystem */
public final class C176028cL extends C153757bu {
    public static final int[] A0n = {0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 1, 1, 1, 2, 2, 1, 1, 1, 0, 0, 1, 2, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, -1, 0, -1, -1, -1, -1, -1, -2, -1, -2, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, -4, -3, -4, -3, -3, -3, -3, -1, -2, 1, 1, 1, 2, 2, 2, 0, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -2, -1, -2, -1, -2, 0, 1, 0, 1, -1, -1, 0, 0, 1, 1, -1, 0, -1, 0, 0, 0, -3, -1, -1, -3, -3, -1, -1, -1, -1, -1, -1, -2, -2, -2, -2, -2, -2, -2, -2, 0, 1, 0, -1, -1, -1, -2, -1, -2, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, -1, -1, 0, 0, -1, -1, 0, 0};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public C161907qo A0E;
    public C161907qo A0F;
    public C161907qo A0G;
    public C161907qo A0H;
    public C161907qo A0I;
    public C161907qo A0J;
    public C160407na A0K;
    public C159077l4 A0L;
    public C159077l4 A0M;
    public C159077l4 A0N;
    public C159077l4 A0O;
    public C159077l4 A0P;
    public C159077l4 A0Q;
    public AnonymousClass7OB A0R;
    public AnonymousClass7OB A0S;
    public C158877kh A0T;
    public C158877kh A0U;
    public C158877kh A0V;
    public boolean A0W;
    public boolean A0X;
    public int[] A0Y;
    public int[] A0Z;
    public C161907qo[] A0a;
    public C161907qo[] A0b;
    public final int A0c;
    public final int A0d;
    public final int A0e;
    public final int A0f;
    public final int A0g;
    public final int A0h;
    public final String A0i;
    public final String A0j;
    public final C159077l4 A0k = new C159077l4();
    public final C153727bq A0l;
    public final int[] A0m;

    public void A0D(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        C159077l4 r2;
        int i4;
        int i5 = this.A0d;
        if (i5 == 3) {
            C158877kh r0 = this.A0T;
            C161437pf r4 = r0.A02;
            if (r4 == null) {
                C176018cK r3 = new C176018cK(r0);
                r0.A02 = r3;
                r3.A0B(this.A0i, this.A0l, this.A0c, i2);
            } else if (i == -1) {
                C153727bq r5 = this.A0l;
                int i6 = 0;
                for (int i7 = 0; i7 < i2; i7++) {
                    int i8 = i6 + 1;
                    r4.A05[i6] = C161437pf.A00(objArr[i7], r5);
                    Integer num = objArr[i7];
                    if (num == C186758vt.A03 || num == C186758vt.A00) {
                        i6 = i8 + 1;
                        r4.A05[i8] = 4194304;
                    } else {
                        i6 = i8;
                    }
                }
                while (true) {
                    int[] iArr = r4.A05;
                    if (i6 >= iArr.length) {
                        break;
                    }
                    iArr[i6] = 4194304;
                    i6++;
                }
                int i9 = 0;
                for (int i10 = 0; i10 < i3; i10++) {
                    Integer num2 = objArr2[i10];
                    if (num2 == C186758vt.A03 || num2 == C186758vt.A00) {
                        i9++;
                    }
                }
                r4.A06 = new int[(i9 + i3)];
                int i11 = 0;
                for (int i12 = 0; i12 < i3; i12++) {
                    int i13 = i11 + 1;
                    r4.A06[i11] = C161437pf.A00(objArr2[i12], r5);
                    Integer num3 = objArr2[i12];
                    if (num3 == C186758vt.A03 || num3 == C186758vt.A00) {
                        i11 = i13 + 1;
                        r4.A06[i13] = 4194304;
                    } else {
                        i11 = i13;
                    }
                }
                r4.A03 = 0;
                r4.A00 = 0;
            }
            this.A0T.A02.A0C(this);
        } else {
            if (i == -1) {
                if (this.A0Z == null) {
                    String str = this.A0i;
                    C161437pf r22 = new C161437pf(new C158877kh());
                    r22.A0B(str, this.A0l, this.A0c, C162147rL.A00(str) >> 2);
                    r22.A0C(this);
                }
                this.A00 = i2;
                int i14 = this.A0k.A00;
                int i15 = i2 + 3 + i3;
                int[] iArr2 = this.A0Y;
                if (iArr2 == null || iArr2.length < i15) {
                    iArr2 = new int[i15];
                    this.A0Y = iArr2;
                }
                iArr2[0] = i14;
                iArr2[1] = i2;
                iArr2[2] = i3;
                int i16 = 3;
                int i17 = 0;
                while (i17 < i2) {
                    this.A0Y[i16] = C161437pf.A00(objArr[i17], this.A0l);
                    i17++;
                    i16++;
                }
                int i18 = 0;
                while (i18 < i3) {
                    this.A0Y[i16] = C161437pf.A00(objArr2[i18], this.A0l);
                    i18++;
                    i16++;
                }
                A0E();
            } else if (this.A0l.A03 >= 50) {
                C159077l4 r6 = this.A0Q;
                if (r6 == null) {
                    r6 = new C159077l4();
                    this.A0Q = r6;
                    r2 = this.A0k;
                    i4 = r2.A00;
                } else {
                    r2 = this.A0k;
                    i4 = (r2.A00 - this.A0A) - 1;
                    if (i4 < 0) {
                        if (i != 3) {
                            throw AnonymousClass6CA.A0O();
                        }
                        return;
                    }
                }
                if (i == 0) {
                    this.A00 = i2;
                    r6.A02(255);
                    r6.A04(i4);
                    r6.A04(i2);
                    for (int i19 = 0; i19 < i2; i19++) {
                        A0H(objArr[i19]);
                    }
                    this.A0Q.A04(i3);
                    for (int i20 = 0; i20 < i3; i20++) {
                        A0H(objArr2[i20]);
                    }
                } else if (i != 1) {
                    int i21 = 251;
                    if (i == 2) {
                        this.A00 -= i2;
                        i21 = 251 - i2;
                    } else if (i != 3) {
                        if (i == 4) {
                            if (i4 < 64) {
                                r6.A02(i4 + 64);
                            } else {
                                r6.A02(247);
                                r6.A04(i4);
                            }
                            A0H(objArr2[0]);
                        } else {
                            throw AnonymousClass6CA.A0N();
                        }
                    } else if (i4 < 64) {
                        r6.A02(i4);
                    }
                    r6.A02(i21);
                    r6.A04(i4);
                } else {
                    this.A00 += i2;
                    r6.A02(i2 + 251);
                    r6.A04(i4);
                    for (int i22 = 0; i22 < i2; i22++) {
                        A0H(objArr[i22]);
                    }
                }
                this.A0A = r2.A00;
                this.A0C++;
            } else {
                throw AnonymousClass001.A0c("Class versions V1_5 or less must use F_NEW frames.");
            }
            if (i5 == 2) {
                this.A0B = i3;
                int i23 = i3;
                for (int i24 = 0; i24 < i3; i24++) {
                    Integer num4 = objArr2[i24];
                    if (num4 == C186758vt.A03 || num4 == C186758vt.A00) {
                        i23++;
                        this.A0B = i23;
                    }
                }
                if (i23 > this.A07) {
                    this.A07 = i23;
                }
            }
        }
        this.A08 = Math.max(this.A08, i3);
        this.A06 = Math.max(this.A06, this.A00);
    }

    public void A0E() {
        char c;
        int i;
        int[] iArr = this.A0Z;
        if (iArr != null) {
            C159077l4 r11 = this.A0Q;
            if (r11 == null) {
                r11 = new C159077l4();
                this.A0Q = r11;
            }
            int[] iArr2 = this.A0Y;
            int i2 = iArr2[1];
            int i3 = iArr2[2];
            int i4 = 0;
            if (this.A0l.A03 < 50) {
                r11.A04(iArr2[0]);
                r11.A04(i2);
                int i5 = i2 + 3;
                A0G(3, i5);
                this.A0Q.A04(i3);
                A0G(i5, i3 + i5);
            } else {
                int i6 = this.A0C;
                int i7 = iArr2[0];
                if (i6 != 0) {
                    i7 = (i7 - iArr[0]) - 1;
                }
                int i8 = iArr[1];
                int i9 = i2 - i8;
                if (i3 == 0) {
                    switch (i9) {
                        case -3:
                        case -2:
                        case -1:
                            c = 248;
                            break;
                        case 0:
                            c = 251;
                            if (i7 < 64) {
                                c = 0;
                                break;
                            }
                            break;
                        case 1:
                        case 2:
                        case 3:
                            c = 252;
                            break;
                    }
                    i = 3;
                    while (true) {
                        if (i4 < i8 || i4 >= i2) {
                            if (c != 0) {
                                if (c == '@') {
                                    r11.A02(i7 + 64);
                                } else if (c == 247) {
                                    r11.A02(247);
                                    r11.A04(i7);
                                } else if (c == 248) {
                                    r11.A02(i9 + 251);
                                    r11.A04(i7);
                                } else if (c == 251) {
                                    r11.A02(251);
                                    r11.A04(i7);
                                } else if (c == 252) {
                                    r11.A02(i9 + 251);
                                    r11.A04(i7);
                                    A0G(i8 + 3, i2 + 3);
                                }
                                A0G(i2 + 3, i2 + 4);
                            } else {
                                r11.A02(i7);
                            }
                        } else if (iArr2[i] == iArr[i]) {
                            i++;
                            i4++;
                        }
                    }
                } else if (i9 == 0 && i3 == 1) {
                    c = 247;
                    if (i7 < 63) {
                        c = '@';
                    }
                    i = 3;
                    while (true) {
                        if (i4 < i8) {
                        }
                        i++;
                        i4++;
                    }
                }
                r11.A02(255);
                r11.A04(i7);
                r11.A04(i2);
                int i10 = i2 + 3;
                A0G(3, i10);
                this.A0Q.A04(i3);
                A0G(i10, i3 + i10);
            }
            this.A0C++;
        }
        this.A0Z = this.A0Y;
        this.A0Y = null;
    }

    public final void A0F() {
        if (this.A0d == 1) {
            this.A0T.A08 = (short) this.A07;
            this.A0T = null;
        }
    }

    public final void A0G(int i, int i2) {
        String str;
        int i3;
        char c;
        while (i < i2) {
            C153727bq r4 = this.A0l;
            int i4 = this.A0Y[i];
            C159077l4 r3 = this.A0Q;
            int i5 = (-67108864 & i4) >> 26;
            if (i5 == 0) {
                int i6 = i4 & 1048575;
                int i7 = i4 & 62914560;
                if (i7 == 4194304) {
                    r3.A02(i6);
                    i++;
                } else if (i7 == 8388608) {
                    r3.A02(7);
                    str = r4.A09[i6].A08;
                    i3 = r4.A0A(str, 7).A03;
                } else if (i7 == 12582912) {
                    r3.A02(8);
                    i3 = (int) r4.A09[i6].A05;
                } else {
                    throw new AssertionError();
                }
            } else {
                StringBuilder A0o = AnonymousClass001.A0o();
                while (true) {
                    int i8 = i5 - 1;
                    if (i5 <= 0) {
                        break;
                    }
                    A0o.append('[');
                    i5 = i8;
                }
                if ((i4 & 62914560) == 8388608) {
                    A0o.append('L');
                    A0o.append(r4.A09[i4 & 1048575].A08);
                    c = ';';
                } else {
                    int i9 = i4 & 1048575;
                    c = 'I';
                    if (i9 != 1) {
                        c = 'F';
                        if (i9 != 2) {
                            c = 'D';
                            if (i9 != 3) {
                                if (i9 != 4) {
                                    switch (i9) {
                                        case 9:
                                            c = 'Z';
                                            break;
                                        case 10:
                                            c = 'B';
                                            break;
                                        case 11:
                                            c = 'C';
                                            break;
                                        case 12:
                                            c = 'S';
                                            break;
                                        default:
                                            throw new AssertionError();
                                    }
                                } else {
                                    c = 'J';
                                }
                            }
                        }
                    }
                }
                A0o.append(c);
                r3.A02(7);
                str = A0o.toString();
                i3 = r4.A0A(str, 7).A03;
            }
            r3.A04(i3);
            i++;
        }
    }

    public final void A0H(Object obj) {
        int i;
        if (obj instanceof Integer) {
            this.A0Q.A02(AnonymousClass001.A0K(obj));
            return;
        }
        boolean z = obj instanceof String;
        C159077l4 r2 = this.A0Q;
        if (z) {
            r2.A02(7);
            i = this.A0l.A0A((String) obj, 7).A03;
        } else {
            r2.A02(8);
            i = ((C158877kh) obj).A00;
        }
        r2.A04(i);
    }

    public final void A0I(C158877kh r4, int i) {
        C158877kh r2 = this.A0T;
        r2.A01 = new AnonymousClass7LW(r2.A01, r4, i);
    }

    public final void A0J(C158877kh r5, C158877kh[] r6) {
        if (this.A0T != null) {
            if (this.A0d == 1) {
                int i = this.A0B - 1;
                this.A0B = i;
                A0I(r5, i);
                for (C158877kh A0I2 : r6) {
                    A0I(A0I2, i);
                }
            }
            A0F();
        }
    }

    public C176028cL(String str, String str2, String str3, C153727bq r8, String[] strArr, int i, int i2) {
        int A022;
        int length;
        this.A0l = r8;
        this.A0c = "<init>".equals(str) ? 262144 | i : i;
        this.A0f = r8.A02(str);
        this.A0j = str;
        this.A0e = r8.A02(str2);
        this.A0i = str2;
        if (str3 == null) {
            A022 = 0;
        } else {
            A022 = r8.A02(str3);
        }
        this.A0h = A022;
        if (strArr != null && (length = strArr.length) > 0) {
            this.A0g = length;
            this.A0m = new int[length];
            for (int i3 = 0; i3 < this.A0g; i3++) {
                this.A0m[i3] = r8.A0A(strArr[i3], 7).A03;
            }
        }
        this.A0d = i2;
        if (i2 != 0) {
            int A002 = C162147rL.A00(str2) >> 2;
            A002 = (i & 8) != 0 ? A002 - 1 : A002;
            this.A06 = A002;
            this.A00 = A002;
            C158877kh r0 = new C158877kh();
            this.A0U = r0;
            A0A(r0);
        }
    }
}
