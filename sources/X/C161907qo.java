package X;

/* renamed from: X.7qo  reason: invalid class name and case insensitive filesystem */
public final class C161907qo {
    public int A00;
    public C161907qo A01;
    public final int A02;
    public final C161907qo A03;
    public final C159077l4 A04;
    public final C153727bq A05;
    public final boolean A06;

    public static int A00(C161907qo r2, C161907qo r3, C161907qo r4, C161907qo r5) {
        int i = 0;
        if (r2 != null) {
            i = 0 + r2.A06("RuntimeVisibleAnnotations");
        }
        if (r3 != null) {
            i += r3.A06("RuntimeInvisibleAnnotations");
        }
        if (r4 != null) {
            i += r4.A06("RuntimeVisibleTypeAnnotations");
        }
        if (r5 != null) {
            return i + r5.A06("RuntimeInvisibleTypeAnnotations");
        }
        return i;
    }

    public static void A04(C159077l4 r1, C153727bq r2, int i, int i2) {
        r1.A07(i2, r2.A07(3, i).A03);
    }

    public void A0A(C159077l4 r6, int i) {
        int i2 = 2;
        C161907qo r3 = null;
        int i3 = 0;
        for (C161907qo r1 = this; r1 != null; r1 = r1.A03) {
            r1.A08();
            i2 += r1.A04.A00;
            i3++;
            r3 = r1;
        }
        r6.A04(i);
        r6.A03(i2);
        r6.A04(i3);
        while (r3 != null) {
            C159077l4.A00(r3.A04, r6);
            r3 = r3.A01;
        }
    }

    public static C161907qo A01(String str, C161907qo r4, C153727bq r5) {
        C159077l4 r2 = new C159077l4();
        C153727bq.A01(str, r2, r5);
        r2.A04(0);
        return new C161907qo(r4, r2, r5, true);
    }

    public static C161907qo A02(String str, C161907qo r5, C153727bq r6, C150757Sc r7, int i) {
        C159077l4 r3 = new C159077l4();
        int i2 = i >>> 24;
        if (!(i2 == 0 || i2 == 1)) {
            switch (i2) {
                case 16:
                case 17:
                case 18:
                case 23:
                    r3.A07(i2, (i & 16776960) >> 8);
                    break;
                case 19:
                case 20:
                case 21:
                    r3.A02(i2);
                    break;
                case 22:
                    break;
                default:
                    switch (i2) {
                        case AnonymousClass1EU.PTV_MESSAGE_FIELD_NUMBER:
                        case AnonymousClass1EU.BOT_INVOKE_MESSAGE_FIELD_NUMBER:
                        case 68:
                        case AnonymousClass1EU.CALL_LOG_MESSSAGE_FIELD_NUMBER:
                        case AnonymousClass1EU.MESSAGE_HISTORY_BUNDLE_FIELD_NUMBER:
                            break;
                        case AnonymousClass1EU.ENC_COMMENT_MESSAGE_FIELD_NUMBER:
                        case 72:
                        case 73:
                        case AnonymousClass1EU.LOTTIE_STICKER_MESSAGE_FIELD_NUMBER:
                        case AnonymousClass1EU.EVENT_MESSAGE_FIELD_NUMBER:
                            r3.A03(i);
                            break;
                        default:
                            throw AnonymousClass6CA.A0N();
                    }
                    r3.A07(i2, (i & 16776960) >> 8);
                    break;
            }
        }
        r3.A04(i >>> 16);
        if (r7 == null) {
            r3.A02(0);
        } else {
            byte[] bArr = r7.A01;
            int i3 = r7.A00;
            r3.A0A(bArr, i3, (bArr[i3] * 2) + 1);
        }
        C153727bq.A01(str, r3, r6);
        r3.A04(0);
        return new C161907qo(r5, r3, r6, true);
    }

    public static void A03(C161907qo r1, C161907qo r2, C161907qo r3, C161907qo r4, C159077l4 r5, C153727bq r6) {
        if (r1 != null) {
            r1.A0A(r5, r6.A02("RuntimeVisibleAnnotations"));
        }
        if (r2 != null) {
            r2.A0A(r5, r6.A02("RuntimeInvisibleAnnotations"));
        }
        if (r3 != null) {
            r3.A0A(r5, r6.A02("RuntimeVisibleTypeAnnotations"));
        }
        if (r4 != null) {
            r4.A0A(r5, r6.A02("RuntimeInvisibleTypeAnnotations"));
        }
    }

    public static void A05(C159077l4 r6, C161907qo[] r7, int i, int i2) {
        int A062;
        int i3 = (i2 * 2) + 1;
        for (int i4 = 0; i4 < i2; i4++) {
            C161907qo r0 = r7[i4];
            if (r0 == null) {
                A062 = 0;
            } else {
                A062 = r0.A06((String) null) - 8;
            }
            i3 += A062;
        }
        r6.A04(i);
        r6.A03(i3);
        r6.A02(i2);
        for (int i5 = 0; i5 < i2; i5++) {
            C161907qo r2 = null;
            int i6 = 0;
            for (C161907qo r3 = r7[i5]; r3 != null; r3 = r3.A03) {
                r3.A08();
                i6++;
                r2 = r3;
            }
            r6.A04(i6);
            while (r2 != null) {
                C159077l4.A00(r2.A04, r6);
                r2 = r2.A01;
            }
        }
    }

    public int A06(String str) {
        if (str != null) {
            this.A05.A02(str);
        }
        int i = 8;
        for (C161907qo r1 = this; r1 != null; r1 = r1.A03) {
            i += r1.A04.A00;
        }
        return i;
    }

    public C161907qo A07(String str) {
        this.A00++;
        if (this.A06) {
            C153727bq.A01(str, this.A04, this.A05);
        }
        C159077l4 r4 = this.A04;
        r4.A07(91, 0);
        return new C161907qo((C161907qo) null, r4, this.A05, false);
    }

    public void A08() {
        int i = this.A02;
        if (i != -1) {
            byte[] bArr = this.A04.A01;
            int i2 = this.A00;
            AnonymousClass6CA.A0f(bArr, i2, i);
            bArr[i + 1] = (byte) i2;
        }
    }

    public void A09(String str, Object obj) {
        int i;
        C159077l4 r3;
        int A022;
        this.A00++;
        if (this.A06) {
            C153727bq.A01(str, this.A04, this.A05);
        }
        if (obj instanceof String) {
            r3 = this.A04;
            A022 = this.A05.A02((String) obj);
            i = 115;
        } else {
            i = 66;
            if (obj instanceof Byte) {
                r3 = this.A04;
                A022 = this.A05.A07(3, ((Number) obj).byteValue()).A03;
            } else if (obj instanceof Boolean) {
                A04(this.A04, this.A05, AnonymousClass001.A1Z(obj) ? 1 : 0, 90);
                return;
            } else if (obj instanceof Character) {
                A04(this.A04, this.A05, ((Character) obj).charValue(), 67);
                return;
            } else if (obj instanceof Short) {
                A04(this.A04, this.A05, ((Number) obj).shortValue(), 83);
                return;
            } else if (obj instanceof C162147rL) {
                r3 = this.A04;
                A022 = this.A05.A02(((C162147rL) obj).A06());
                i = 99;
            } else {
                int i2 = 0;
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    C159077l4 r32 = this.A04;
                    int length = bArr.length;
                    r32.A07(91, length);
                    while (i2 < length) {
                        A04(r32, this.A05, bArr[i2], 66);
                        i2++;
                    }
                    return;
                } else if (obj instanceof boolean[]) {
                    boolean[] zArr = (boolean[]) obj;
                    C159077l4 r33 = this.A04;
                    int length2 = zArr.length;
                    r33.A07(91, length2);
                    while (i2 < length2) {
                        A04(r33, this.A05, zArr[i2] ? 1 : 0, 90);
                        i2++;
                    }
                    return;
                } else if (obj instanceof short[]) {
                    short[] sArr = (short[]) obj;
                    C159077l4 r34 = this.A04;
                    int length3 = sArr.length;
                    r34.A07(91, length3);
                    while (i2 < length3) {
                        A04(r34, this.A05, sArr[i2], 83);
                        i2++;
                    }
                    return;
                } else if (obj instanceof char[]) {
                    char[] cArr = (char[]) obj;
                    C159077l4 r35 = this.A04;
                    int length4 = cArr.length;
                    r35.A07(91, length4);
                    while (i2 < length4) {
                        A04(r35, this.A05, cArr[i2], 67);
                        i2++;
                    }
                    return;
                } else if (obj instanceof int[]) {
                    int[] iArr = (int[]) obj;
                    C159077l4 r4 = this.A04;
                    int length5 = iArr.length;
                    r4.A07(91, length5);
                    while (i2 < length5) {
                        r4.A07(73, this.A05.A07(3, iArr[i2]).A03);
                        i2++;
                    }
                    return;
                } else if (obj instanceof long[]) {
                    long[] jArr = (long[]) obj;
                    C159077l4 r5 = this.A04;
                    int length6 = jArr.length;
                    r5.A07(91, length6);
                    while (i2 < length6) {
                        r5.A07(74, this.A05.A08(5, jArr[i2]).A03);
                        i2++;
                    }
                    return;
                } else if (obj instanceof float[]) {
                    float[] fArr = (float[]) obj;
                    C159077l4 r42 = this.A04;
                    int length7 = fArr.length;
                    r42.A07(91, length7);
                    while (i2 < length7) {
                        r42.A07(70, this.A05.A07(4, Float.floatToRawIntBits(fArr[i2])).A03);
                        i2++;
                    }
                    return;
                } else if (obj instanceof double[]) {
                    double[] dArr = (double[]) obj;
                    C159077l4 r52 = this.A04;
                    int length8 = dArr.length;
                    r52.A07(91, length8);
                    while (i2 < length8) {
                        r52.A07(68, this.A05.A08(6, Double.doubleToRawLongBits(dArr[i2])).A03);
                        i2++;
                    }
                    return;
                } else {
                    C161677qE A09 = this.A05.A09(obj);
                    this.A04.A07(".s.IFJDCS".charAt(A09.A04), A09.A03);
                    return;
                }
            }
        }
        r3.A07(i, A022);
    }

    public C161907qo(C161907qo r3, C159077l4 r4, C153727bq r5, boolean z) {
        this.A05 = r5;
        this.A06 = z;
        this.A04 = r4;
        int i = r4.A00;
        this.A02 = i == 0 ? -1 : i - 2;
        this.A03 = r3;
        if (r3 != null) {
            r3.A01 = this;
        }
    }
}
