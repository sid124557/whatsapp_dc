package X;

import java.io.EOFException;

/* renamed from: X.0Bw  reason: invalid class name and case insensitive filesystem */
public final class C01700Bw extends C10470hz {
    public static final AnonymousClass8Lk A06 = AnonymousClass8Lk.A00("*/");
    public static final AnonymousClass8Lk A07 = AnonymousClass8Lk.A00("\"\\");
    public static final AnonymousClass8Lk A08 = AnonymousClass8Lk.A00("\n\r");
    public static final AnonymousClass8Lk A09 = AnonymousClass8Lk.A00("'\\");
    public static final AnonymousClass8Lk A0A = AnonymousClass8Lk.A00("{}[]:, \n\t\r\f/\\;#=");
    public int A00 = 0;
    public int A01;
    public long A02;
    public String A03;
    public final C172278Kj A04;
    public final C188558z5 A05;

    public static void A02(C01700Bw r3) {
        r3.A00 = 0;
        int[] iArr = r3.A01;
        int i = r3.A00 - 1;
        iArr[i] = iArr[i] + 1;
    }

    public void A0L() {
        AnonymousClass8Lk r0;
        int i = 0;
        do {
            int A002 = A00(this);
            if (A002 == 3) {
                A0M(1);
            } else if (A002 == 1) {
                A0M(3);
            } else {
                if (A002 == 4) {
                    i--;
                    if (i < 0) {
                        StringBuilder A0o = AnonymousClass001.A0o();
                        C10470hz.A05(this, "Expected a value but was ", A0o);
                        throw A01(this, " at path ", A0o);
                    }
                } else if (A002 == 2) {
                    i--;
                    if (i < 0) {
                        StringBuilder A0o2 = AnonymousClass001.A0o();
                        C10470hz.A05(this, "Expected a value but was ", A0o2);
                        throw A01(this, " at path ", A0o2);
                    }
                } else if (A002 == 14 || A002 == 10) {
                    A0X();
                    this.A00 = 0;
                } else {
                    if (A002 == 9 || A002 == 13) {
                        r0 = A07;
                    } else if (A002 == 8 || A002 == 12) {
                        r0 = A09;
                    } else {
                        if (A002 == 17) {
                            this.A04.A0B((long) this.A01);
                        } else if (A002 == 18) {
                            StringBuilder A0o3 = AnonymousClass001.A0o();
                            C10470hz.A05(this, "Expected a value but was ", A0o3);
                            throw A01(this, " at path ", A0o3);
                        }
                        this.A00 = 0;
                    }
                    A0Y(r0);
                    this.A00 = 0;
                }
                this.A00--;
                this.A00 = 0;
            }
            i++;
            this.A00 = 0;
        } while (i != 0);
        int[] iArr = this.A01;
        int i2 = this.A00;
        int i3 = i2 - 1;
        iArr[i3] = iArr[i3] + 1;
        this.A03[i2 - 1] = "null";
    }

    public final int A0T(boolean z) {
        int i = 0;
        while (true) {
            C188558z5 r3 = this.A05;
            int i2 = i + 1;
            if (r3.Bjk((long) i2)) {
                C172278Kj r4 = this.A04;
                byte A002 = r4.A00((long) i);
                if (A002 == 10 || A002 == 32 || A002 == 13 || A002 == 9) {
                    i = i2;
                } else {
                    r4.A0B((long) (i2 - 1));
                    if (A002 == 47) {
                        if (r3.Bjk(2)) {
                            A0W();
                            throw AnonymousClass000.A0L();
                        }
                    } else if (A002 == 35) {
                        A0W();
                        throw AnonymousClass000.A0L();
                    }
                    return A002;
                }
            } else if (!z) {
                return -1;
            } else {
                throw new EOFException("End of input");
            }
        }
    }

    public final String A0V(AnonymousClass8Lk r8) {
        StringBuilder sb = null;
        while (true) {
            long BFk = this.A05.BFk(r8);
            if (BFk != -1) {
                C172278Kj r4 = this.A04;
                if (r4.A00(BFk) == 92) {
                    if (sb == null) {
                        sb = AnonymousClass001.A0o();
                    }
                    sb.append(r4.A04(BFk));
                    r4.readByte();
                    sb.append(A0P());
                } else {
                    String A042 = r4.A04(BFk);
                    if (sb == null) {
                        r4.readByte();
                        return A042;
                    }
                    sb.append(A042);
                    r4.readByte();
                    return sb.toString();
                }
            } else {
                throw A0B("Unterminated string");
            }
        }
    }

    public void close() {
        this.A00 = 0;
        this.A02[0] = 8;
        this.A00 = 1;
        this.A04.A08();
        this.A05.close();
    }

    public static int A00(C01700Bw r1) {
        int i = r1.A00;
        if (i == 0) {
            return r1.A0Q();
        }
        return i;
    }

    public final char A0P() {
        String str;
        StringBuilder A0o;
        int i;
        C188558z5 r3 = this.A05;
        if (r3.Bjk(1)) {
            C172278Kj r6 = this.A04;
            byte readByte = r6.readByte();
            if (readByte == 10 || readByte == 34 || readByte == 39 || readByte == 47 || readByte == 92) {
                return (char) readByte;
            }
            if (readByte == 98) {
                return 8;
            }
            if (readByte == 102) {
                return 12;
            }
            if (readByte == 110) {
                return 10;
            }
            if (readByte == 114) {
                return 13;
            }
            if (readByte == 116) {
                return 9;
            }
            if (readByte != 117) {
                A0o = AnonymousClass001.A0o();
                A0o.append("Invalid escape sequence: \\");
                A0o.append((char) readByte);
            } else if (r3.Bjk(4)) {
                int i2 = 0;
                char c = 0;
                do {
                    byte A002 = r6.A00((long) i2);
                    char c2 = (char) (c << 4);
                    if (A002 >= 48) {
                        int i3 = A002 - 48;
                        if (A002 > 57) {
                            if (A002 >= 97) {
                                if (A002 <= 102) {
                                    i = A002 - 97;
                                }
                            } else if (A002 >= 65 && A002 <= 70) {
                                i = A002 - 65;
                            }
                            i3 = i + 10;
                        }
                        c = (char) (c2 + i3);
                        i2++;
                    }
                    A0o = AnonymousClass001.A0o();
                    A0o.append("\\u");
                    A0o.append(r6.A04(4));
                } while (i2 < 4);
                r6.A0B(4);
                return c;
            } else {
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append("Unterminated escape sequence at path ");
                throw new EOFException(AnonymousClass000.A0X(A0D(), A0o2));
            }
            str = A0o.toString();
        } else {
            str = "Unterminated escape sequence";
        }
        throw A0B(str);
    }

    public final int A0Q() {
        String str;
        int i;
        int[] iArr = this.A02;
        int i2 = this.A00;
        int i3 = iArr[i2 - 1];
        if (i3 == 1) {
            iArr[i2 - 1] = 2;
        } else if (i3 == 2) {
            int A0T = A0T(true);
            this.A04.readByte();
            if (A0T != 44) {
                if (A0T == 59) {
                    A0W();
                    throw AnonymousClass000.A0L();
                } else if (A0T == 93) {
                    this.A00 = 4;
                    return 4;
                } else {
                    str = "Unterminated array";
                    throw A0B(str);
                }
            }
        } else if (i3 == 3 || i3 == 5) {
            iArr[i2 - 1] = 4;
            if (i3 == 5) {
                int A0T2 = A0T(true);
                this.A04.readByte();
                if (A0T2 != 44) {
                    if (A0T2 != 59) {
                        if (A0T2 != 125) {
                            str = "Unterminated object";
                            throw A0B(str);
                        }
                        i = 2;
                        this.A00 = i;
                        return i;
                    }
                    A0W();
                    throw AnonymousClass000.A0L();
                }
            }
            int A0T3 = A0T(true);
            if (A0T3 == 34) {
                this.A04.readByte();
                i = 13;
                this.A00 = i;
                return i;
            } else if (A0T3 != 39) {
                str = "Expected name";
                if (A0T3 != 125) {
                    A0W();
                    throw AnonymousClass000.A0L();
                }
                if (i3 != 5) {
                    this.A04.readByte();
                    i = 2;
                    this.A00 = i;
                    return i;
                }
                throw A0B(str);
            } else {
                this.A04.readByte();
                A0W();
                throw AnonymousClass000.A0L();
            }
        } else if (i3 == 4) {
            iArr[i2 - 1] = 5;
            int A0T4 = A0T(true);
            this.A04.readByte();
            if (A0T4 != 58) {
                if (A0T4 == 61) {
                    A0W();
                    throw AnonymousClass000.A0L();
                }
                str = "Expected ':'";
                throw A0B(str);
            }
        } else if (i3 == 6) {
            iArr[i2 - 1] = 7;
        } else if (i3 == 7) {
            if (A0T(false) == -1) {
                i = 18;
                this.A00 = i;
                return i;
            }
            A0W();
            throw AnonymousClass000.A0L();
        } else if (i3 == 8) {
            throw AnonymousClass001.A0e("JsonReader is closed");
        }
        int A0T5 = A0T(true);
        if (A0T5 == 34) {
            this.A04.readByte();
            i = 9;
        } else if (A0T5 != 39) {
            if (!(A0T5 == 44 || A0T5 == 59)) {
                if (A0T5 == 91) {
                    this.A04.readByte();
                    this.A00 = 3;
                    return 3;
                } else if (A0T5 != 93) {
                    if (A0T5 != 123) {
                        i = A0R();
                        if (i == 0 && (i = A0S()) == 0) {
                            if (A0Z(this.A04.A00(0))) {
                                A0W();
                                throw AnonymousClass000.A0L();
                            }
                            str = "Expected value";
                            throw A0B(str);
                        }
                        return i;
                    }
                    this.A04.readByte();
                    this.A00 = 1;
                    return 1;
                } else if (i3 == 1) {
                    this.A04.readByte();
                    i = 4;
                }
            }
            if (i3 == 1 || i3 == 2) {
                A0W();
                throw AnonymousClass000.A0L();
            }
            str = "Unexpected value";
            throw A0B(str);
        } else {
            A0W();
            throw AnonymousClass000.A0L();
        }
        this.A00 = i;
        return i;
    }

    public final int A0R() {
        String str;
        String str2;
        int i;
        byte A002;
        C172278Kj r2 = this.A04;
        byte A003 = r2.A00(0);
        if (A003 == 116 || A003 == 84) {
            str = "true";
            str2 = "TRUE";
            i = 5;
        } else if (A003 == 102 || A003 == 70) {
            str = "false";
            str2 = "FALSE";
            i = 6;
        } else {
            if (A003 == 110 || A003 == 78) {
                str = "null";
                str2 = "NULL";
                i = 7;
            }
            return 0;
        }
        int length = str.length();
        int i2 = 1;
        while (i2 < length) {
            int i3 = i2 + 1;
            if (this.A05.Bjk((long) i3) && ((A002 = r2.A00((long) i2)) == str.charAt(i2) || A002 == str2.charAt(i2))) {
                i2 = i3;
            }
            return 0;
        }
        if (this.A05.Bjk((long) (length + 1)) && A0Z(r2.A00((long) length))) {
            return 0;
        }
        r2.A0B((long) length);
        this.A00 = i;
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x008d, code lost:
        if (A0Z(r4) != false) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x008f, code lost:
        if (r6 != 2) goto L_0x00b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0091, code lost:
        if (r11 == false) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0097, code lost:
        if (r1 != Long.MIN_VALUE) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0099, code lost:
        if (r10 == false) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x009d, code lost:
        if (r1 != 0) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x009f, code lost:
        if (r10 != false) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00a1, code lost:
        r1 = -r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00a2, code lost:
        r15.A02 = r1;
        r15.A04.A0B((long) r7);
        r0 = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00ac, code lost:
        r15.A00 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00ae, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00af, code lost:
        if (r10 == false) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00b2, code lost:
        if (r6 == 2) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00b5, code lost:
        if (r6 == 4) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00b8, code lost:
        if (r6 != 7) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00ba, code lost:
        r15.A01 = r7;
        r0 = 17;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A0S() {
        /*
            r15 = this;
            r13 = 0
            r12 = 0
            r8 = 1
            r1 = 0
            r7 = 0
            r6 = 0
            r11 = 1
            r10 = 0
        L_0x000a:
            X.8z5 r0 = r15.A05
            int r5 = r7 + 1
            long r3 = (long) r5
            boolean r0 = r0.Bjk(r3)
            r9 = 2
            if (r0 == 0) goto L_0x008f
            X.8Kj r0 = r15.A04
            long r3 = (long) r7
            byte r4 = r0.A00(r3)
            r0 = 43
            if (r4 == r0) goto L_0x0084
            r0 = 69
            if (r4 == r0) goto L_0x007d
            r0 = 101(0x65, float:1.42E-43)
            if (r4 == r0) goto L_0x007d
            r0 = 45
            if (r4 == r0) goto L_0x0078
            r0 = 46
            r3 = 3
            if (r4 == r0) goto L_0x0074
            r0 = 48
            if (r4 < r0) goto L_0x0089
            r0 = 57
            if (r4 > r0) goto L_0x0089
            if (r6 == r8) goto L_0x006e
            if (r6 == 0) goto L_0x006e
            if (r6 != r9) goto L_0x0062
            int r0 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r0 == 0) goto L_0x00bf
            r7 = 10
            long r7 = r7 * r1
            int r0 = r4 + -48
            long r3 = (long) r0
            long r7 = r7 - r3
            r3 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x005a
            if (r0 != 0) goto L_0x0060
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0060
        L_0x005a:
            r0 = 1
        L_0x005b:
            r11 = r11 & r0
            r1 = r7
        L_0x005d:
            r7 = r5
            r8 = 1
            goto L_0x000a
        L_0x0060:
            r0 = 0
            goto L_0x005b
        L_0x0062:
            if (r6 != r3) goto L_0x0066
            r6 = 4
            goto L_0x005d
        L_0x0066:
            r0 = 5
            if (r6 == r0) goto L_0x006c
            r0 = 6
            if (r6 != r0) goto L_0x005d
        L_0x006c:
            r6 = 7
            goto L_0x005d
        L_0x006e:
            int r0 = r4 + -48
            int r0 = -r0
            long r1 = (long) r0
            r6 = 2
            goto L_0x005d
        L_0x0074:
            if (r6 != r9) goto L_0x00bf
            r6 = 3
            goto L_0x005d
        L_0x0078:
            if (r6 != 0) goto L_0x0084
            r6 = 1
            r10 = 1
            goto L_0x005d
        L_0x007d:
            if (r6 == r9) goto L_0x0082
            r0 = 4
            if (r6 != r0) goto L_0x00bf
        L_0x0082:
            r6 = 5
            goto L_0x005d
        L_0x0084:
            r0 = 5
            if (r6 != r0) goto L_0x00bf
            r6 = 6
            goto L_0x005d
        L_0x0089:
            boolean r0 = r15.A0Z(r4)
            if (r0 != 0) goto L_0x00bf
        L_0x008f:
            if (r6 != r9) goto L_0x00b2
            if (r11 == 0) goto L_0x00ba
            r3 = -9223372036854775808
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x009b
            if (r10 == 0) goto L_0x00ba
        L_0x009b:
            int r0 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r0 != 0) goto L_0x00af
            if (r10 != 0) goto L_0x00ba
        L_0x00a1:
            long r1 = -r1
        L_0x00a2:
            r15.A02 = r1
            X.8Kj r2 = r15.A04
            long r0 = (long) r7
            r2.A0B(r0)
            r0 = 16
        L_0x00ac:
            r15.A00 = r0
            return r0
        L_0x00af:
            if (r10 == 0) goto L_0x00a1
            goto L_0x00a2
        L_0x00b2:
            if (r6 == r9) goto L_0x00ba
            r0 = 4
            if (r6 == r0) goto L_0x00ba
            r0 = 7
            if (r6 != r0) goto L_0x00bf
        L_0x00ba:
            r15.A01 = r7
            r0 = 17
            goto L_0x00ac
        L_0x00bf:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C01700Bw.A0S():int");
    }

    public final String A0U() {
        long BFk = this.A05.BFk(A0A);
        if (BFk != -1) {
            return this.A04.A04(BFk);
        }
        return this.A04.A03();
    }

    public final void A0W() {
        throw A0B("Use JsonReader.setLenient(true) to accept malformed JSON");
    }

    public final void A0X() {
        long BFk = this.A05.BFk(A0A);
        C172278Kj r3 = this.A04;
        if (BFk == -1) {
            BFk = r3.A02();
        }
        r3.A0B(BFk);
    }

    public final void A0Y(AnonymousClass8Lk r8) {
        while (true) {
            long BFk = this.A05.BFk(r8);
            if (BFk != -1) {
                C172278Kj r6 = this.A04;
                byte A002 = r6.A00(BFk);
                long j = BFk + 1;
                if (A002 == 92) {
                    r6.A0B(j);
                    A0P();
                } else {
                    r6.A0B(j);
                    return;
                }
            } else {
                throw A0B("Unterminated string");
            }
        }
    }

    public final boolean A0Z(int i) {
        if (i == 9 || i == 10 || i == 12 || i == 13 || i == 32) {
            return false;
        }
        if (i != 35) {
            if (i == 44) {
                return false;
            }
            if (!(i == 47 || i == 61)) {
                if (i == 123 || i == 125 || i == 58) {
                    return false;
                }
                if (i != 59) {
                    switch (i) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        A0W();
        throw AnonymousClass000.A0L();
    }

    public C01700Bw(C188558z5 r2) {
        this.A05 = r2;
        this.A04 = r2.Ay8();
        A0M(6);
    }

    public static C13830no A01(C10470hz r0, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(r0.A0D());
        return new C13830no(sb.toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0069  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public double A08() {
        /*
            r6 = this;
            int r1 = A00(r6)
            r0 = 16
            if (r1 != r0) goto L_0x000f
            A02(r6)
            long r0 = r6.A02
            double r2 = (double) r0
            return r2
        L_0x000f:
            r0 = 17
            java.lang.String r5 = "Expected a double but was "
            r3 = 11
            java.lang.String r4 = " at path "
            if (r1 != r0) goto L_0x0027
            X.8Kj r2 = r6.A04
            int r0 = r6.A01
            long r0 = (long) r0
            java.lang.String r0 = r2.A04(r0)
        L_0x0022:
            r6.A03 = r0
        L_0x0024:
            r6.A00 = r3
            goto L_0x0050
        L_0x0027:
            r0 = 9
            if (r1 != r0) goto L_0x0032
            X.8Lk r0 = A07
        L_0x002d:
            java.lang.String r0 = r6.A0V(r0)
            goto L_0x0022
        L_0x0032:
            r0 = 8
            if (r1 != r0) goto L_0x0039
            X.8Lk r0 = A09
            goto L_0x002d
        L_0x0039:
            r0 = 10
            if (r1 != r0) goto L_0x0042
            java.lang.String r0 = r6.A0U()
            goto L_0x0022
        L_0x0042:
            if (r1 == r3) goto L_0x0024
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()
            X.C10470hz.A05(r6, r5, r0)
            X.0no r0 = A01(r6, r4, r0)
            throw r0
        L_0x0050:
            java.lang.String r0 = r6.A03     // Catch:{ NumberFormatException -> 0x0086 }
            double r2 = java.lang.Double.parseDouble(r0)     // Catch:{ NumberFormatException -> 0x0086 }
            boolean r0 = java.lang.Double.isNaN(r2)
            if (r0 != 0) goto L_0x0069
            boolean r0 = java.lang.Double.isInfinite(r2)
            if (r0 != 0) goto L_0x0069
            r0 = 0
            r6.A03 = r0
            A02(r6)
            return r2
        L_0x0069:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "JSON forbids NaN and infinities: "
            r1.append(r0)
            r1.append(r2)
            r1.append(r4)
            java.lang.String r0 = r6.A0D()
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)
            X.0FC r0 = new X.0FC
            r0.<init>(r1)
            throw r0
        L_0x0086:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r5)
            java.lang.String r0 = r6.A03
            r1.append(r0)
            X.0no r0 = A01(r6, r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C01700Bw.A08():double");
    }

    public int A09() {
        AnonymousClass8Lk r0;
        int A002 = A00(this);
        if (A002 == 16) {
            long j = this.A02;
            int i = (int) j;
            if (j == ((long) i)) {
                A02(this);
                return i;
            }
            StringBuilder A0l = AnonymousClass000.A0l("Expected an int but was ");
            A0l.append(j);
            throw A01(this, " at path ", A0l);
        }
        if (A002 == 17) {
            this.A03 = this.A04.A04((long) this.A01);
        } else {
            if (A002 == 9) {
                r0 = A07;
            } else if (A002 == 8) {
                r0 = A09;
            } else if (A002 != 11) {
                StringBuilder A0o = AnonymousClass001.A0o();
                C10470hz.A05(this, "Expected an int but was ", A0o);
                throw A01(this, " at path ", A0o);
            }
            String A0V = A0V(r0);
            this.A03 = A0V;
            try {
                int parseInt = Integer.parseInt(A0V);
                A02(this);
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.A00 = 11;
        try {
            String str = this.A03;
            double parseDouble = Double.parseDouble(str);
            int i2 = (int) parseDouble;
            if (((double) i2) == parseDouble) {
                this.A03 = null;
                A02(this);
                return i2;
            }
            throw A01(this, " at path ", AnonymousClass000.A0m("Expected an int but was ", str));
        } catch (NumberFormatException unused2) {
            StringBuilder A0l2 = AnonymousClass000.A0l("Expected an int but was ");
            A0l2.append(this.A03);
            throw A01(this, " at path ", A0l2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006d, code lost:
        if (r6 == -1) goto L_0x006f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A0A(X.AnonymousClass0T2 r10) {
        /*
            r9 = this;
            int r1 = A00(r9)
            r0 = 12
            r8 = -1
            if (r1 < r0) goto L_0x0083
            r7 = 15
            if (r1 > r7) goto L_0x0083
            if (r1 != r7) goto L_0x002e
            java.lang.String r4 = r9.A03
            java.lang.String[] r3 = r10.A01
            int r2 = r3.length
            r1 = 0
            r6 = 0
        L_0x0016:
            if (r6 >= r2) goto L_0x0081
            r0 = r3[r6]
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x002b
            r9.A00 = r1
            java.lang.String[] r1 = r9.A03
            int r0 = r9.A00
            int r0 = r0 + -1
            r1[r0] = r4
        L_0x002a:
            return r6
        L_0x002b:
            int r6 = r6 + 1
            goto L_0x0016
        L_0x002e:
            X.8z5 r1 = r9.A05
            X.8TA r0 = r10.A00
            int r6 = r1.Bl7(r0)
            if (r6 == r8) goto L_0x0048
            r0 = 0
            r9.A00 = r0
            java.lang.String[] r2 = r9.A03
            int r0 = r9.A00
            int r1 = r0 + -1
            java.lang.String[] r0 = r10.A01
            r0 = r0[r6]
            r2[r1] = r0
            return r6
        L_0x0048:
            java.lang.String[] r1 = r9.A03
            int r0 = r9.A00
            int r0 = r0 + -1
            r5 = r1[r0]
            java.lang.String r4 = r9.A0E()
            java.lang.String[] r3 = r10.A01
            int r2 = r3.length
            r1 = 0
            r6 = 0
        L_0x0059:
            if (r6 >= r2) goto L_0x007f
            r0 = r3[r6]
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x007c
            r9.A00 = r1
            java.lang.String[] r1 = r9.A03
            int r0 = r9.A00
            int r0 = r0 + -1
            r1[r0] = r4
            if (r6 != r8) goto L_0x002a
        L_0x006f:
            r9.A00 = r7
            r9.A03 = r4
            java.lang.String[] r1 = r9.A03
            int r0 = r9.A00
            int r0 = r0 + -1
            r1[r0] = r5
            return r6
        L_0x007c:
            int r6 = r6 + 1
            goto L_0x0059
        L_0x007f:
            r6 = -1
            goto L_0x006f
        L_0x0081:
            r6 = -1
            return r6
        L_0x0083:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C01700Bw.A0A(X.0T2):int");
    }

    public AnonymousClass0G4 A0C() {
        switch (A00(this)) {
            case 1:
                return AnonymousClass0G4.BEGIN_OBJECT;
            case 2:
                return AnonymousClass0G4.END_OBJECT;
            case 3:
                return AnonymousClass0G4.BEGIN_ARRAY;
            case 4:
                return AnonymousClass0G4.END_ARRAY;
            case 5:
            case 6:
                return AnonymousClass0G4.BOOLEAN;
            case 7:
                return AnonymousClass0G4.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return AnonymousClass0G4.STRING;
            case 16:
            case 17:
                return AnonymousClass0G4.NUMBER;
            case 18:
                return AnonymousClass0G4.END_DOCUMENT;
            default:
                return AnonymousClass0G4.NAME;
        }
    }

    public String A0E() {
        String str;
        AnonymousClass8Lk r0;
        int A002 = A00(this);
        if (A002 == 14) {
            str = A0U();
        } else {
            if (A002 == 13) {
                r0 = A07;
            } else if (A002 == 12) {
                r0 = A09;
            } else if (A002 == 15) {
                str = this.A03;
            } else {
                StringBuilder A0o = AnonymousClass001.A0o();
                C10470hz.A05(this, "Expected a name but was ", A0o);
                throw A01(this, " at path ", A0o);
            }
            str = A0V(r0);
        }
        this.A00 = 0;
        this.A03[this.A00 - 1] = str;
        return str;
    }

    public String A0F() {
        String A042;
        int A002 = A00(this);
        if (A002 == 10) {
            A042 = A0U();
        } else if (A002 == 9) {
            A042 = A0V(A07);
        } else if (A002 == 8) {
            A042 = A0V(A09);
        } else if (A002 == 11) {
            A042 = this.A03;
            this.A03 = null;
        } else if (A002 == 16) {
            A042 = Long.toString(this.A02);
        } else if (A002 == 17) {
            A042 = this.A04.A04((long) this.A01);
        } else {
            StringBuilder A0o = AnonymousClass001.A0o();
            C10470hz.A05(this, "Expected a string but was ", A0o);
            throw A01(this, " at path ", A0o);
        }
        A02(this);
        return A042;
    }

    public void A0G() {
        if (A00(this) == 3) {
            A0M(1);
            this.A01[this.A00 - 1] = 0;
            this.A00 = 0;
            return;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        C10470hz.A05(this, "Expected BEGIN_ARRAY but was ", A0o);
        throw A01(this, " at path ", A0o);
    }

    public void A0H() {
        if (A00(this) == 1) {
            A0M(3);
            this.A00 = 0;
            return;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        C10470hz.A05(this, "Expected BEGIN_OBJECT but was ", A0o);
        throw A01(this, " at path ", A0o);
    }

    public void A0I() {
        if (A00(this) == 4) {
            int i = this.A00 - 1;
            this.A00 = i;
            int[] iArr = this.A01;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
            this.A00 = 0;
            return;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        C10470hz.A05(this, "Expected END_ARRAY but was ", A0o);
        throw A01(this, " at path ", A0o);
    }

    public void A0J() {
        if (A00(this) == 2) {
            int i = this.A00 - 1;
            this.A00 = i;
            this.A03[i] = null;
            int[] iArr = this.A01;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
            this.A00 = 0;
            return;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        C10470hz.A05(this, "Expected END_OBJECT but was ", A0o);
        throw A01(this, " at path ", A0o);
    }

    public void A0K() {
        AnonymousClass8Lk r0;
        int A002 = A00(this);
        if (A002 == 14) {
            A0X();
        } else {
            if (A002 == 13) {
                r0 = A07;
            } else if (A002 == 12) {
                r0 = A09;
            } else if (A002 != 15) {
                StringBuilder A0o = AnonymousClass001.A0o();
                C10470hz.A05(this, "Expected a name but was ", A0o);
                throw A01(this, " at path ", A0o);
            }
            A0Y(r0);
        }
        this.A00 = 0;
        this.A03[this.A00 - 1] = "null";
    }

    public boolean A0N() {
        int A002 = A00(this);
        if (A002 == 2 || A002 == 4 || A002 == 18) {
            return false;
        }
        return true;
    }

    public boolean A0O() {
        int A002 = A00(this);
        if (A002 == 5) {
            this.A00 = 0;
            int[] iArr = this.A01;
            int i = this.A00 - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        } else if (A002 == 6) {
            this.A00 = 0;
            int[] iArr2 = this.A01;
            int i2 = this.A00 - 1;
            iArr2[i2] = iArr2[i2] + 1;
            return false;
        } else {
            StringBuilder A0o = AnonymousClass001.A0o();
            C10470hz.A05(this, "Expected a boolean but was ", A0o);
            throw A01(this, " at path ", A0o);
        }
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("JsonReader(");
        A0o.append(this.A05);
        return AnonymousClass000.A0e(A0o);
    }
}
