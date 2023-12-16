package X;

import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.7l8  reason: invalid class name and case insensitive filesystem */
public abstract class C159107l8 {
    public static boolean[] A0J;
    public static boolean[] A0K;
    public static boolean[] A0L;
    public static boolean[] A0M;
    public static boolean[] A0N;
    public char A00;
    public int A01;
    public Object A02;
    public String A03;
    public String A04;
    public AnonymousClass7TE A05;
    public final C151697Vy A06 = new C151697Vy();
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;

    public static C143816zW A00(C159107l8 r4, char c) {
        return new C143816zW(Character.valueOf(c), r4.A01, 0);
    }

    public void A06() {
        char charAt;
        C175808Zu r2 = (C175808Zu) this;
        int i = r2.A01 + 1;
        r2.A01 = i;
        if (i >= r2.A00) {
            charAt = 26;
        } else {
            charAt = r2.A01.charAt(i);
        }
        r2.A00 = charAt;
    }

    public void A07() {
        char charAt;
        C175808Zu r2 = (C175808Zu) this;
        int i = r2.A01 + 1;
        r2.A01 = i;
        if (i >= r2.A00) {
            charAt = 26;
        } else {
            charAt = r2.A01.charAt(i);
        }
        r2.A00 = charAt;
    }

    public void A08() {
        int i;
        char c;
        int i2;
        int i3;
        char c2;
        C175808Zu r3 = (C175808Zu) this;
        if (r3.A0A || (c2 = r3.A00) != '\'') {
            char c3 = r3.A00;
            int i4 = r3.A01 + 1;
            String str = r3.A01;
            int indexOf = str.indexOf(c3, i4);
            if (indexOf != -1) {
                String substring = str.substring(i4, indexOf);
                r3.A04 = substring;
                if (substring.indexOf(92) == -1) {
                    if (!r3.A0E) {
                        int length = substring.length();
                        for (int i5 = 0; i5 < length; i5++) {
                            char charAt = r3.A04.charAt(i5);
                            if (charAt >= 0) {
                                if (charAt <= 31) {
                                    throw new C143816zW(Character.valueOf(charAt), r3.A01 + i5, 0);
                                } else if (charAt == 127 && r3.A0F) {
                                    throw new C143816zW(Character.valueOf(charAt), r3.A01 + i5, 0);
                                }
                            }
                        }
                    }
                    r3.A01 = indexOf;
                    r3.A06();
                    return;
                }
                C151697Vy r4 = r3.A06;
                r4.A00 = -1;
                char c4 = r3.A00;
                while (true) {
                    r3.A06();
                    char c5 = r3.A00;
                    char c6 = '\"';
                    if (c5 == '\"' || c5 == '\'') {
                        if (c4 == c5) {
                            r3.A06();
                            r3.A04 = r4.toString();
                            return;
                        }
                    } else if (c5 == '\\') {
                        r3.A06();
                        char c7 = r3.A00;
                        if (c7 != '\"') {
                            if (c7 != '\'') {
                                c6 = '/';
                                if (c7 != '/') {
                                    if (c7 == '\\') {
                                        r4.A00('\\');
                                    } else if (c7 == 'b') {
                                        c6 = 8;
                                    } else if (c7 == 'f') {
                                        c6 = 12;
                                    } else if (c7 == 'n') {
                                        c6 = 10;
                                    } else if (c7 != 'r') {
                                        if (c7 == 'x') {
                                            i = 2;
                                        } else if (c7 == 't') {
                                            c6 = 9;
                                        } else if (c7 == 'u') {
                                            i = 4;
                                        } else {
                                            continue;
                                        }
                                        int i6 = 0;
                                        int i7 = 0;
                                        do {
                                            int i8 = i7 * 16;
                                            r3.A06();
                                            c = r3.A00;
                                            if (c <= '9') {
                                                i2 = c - '0';
                                                if (c < '0') {
                                                    if (c == 26) {
                                                        throw new C143816zW("EOF", r3.A01, 3);
                                                    }
                                                }
                                            } else {
                                                if (c <= 'F') {
                                                    if (c >= 'A') {
                                                        i3 = c - 'A';
                                                    }
                                                } else if (c >= 'a' && c <= 'f') {
                                                    i3 = c - 'a';
                                                }
                                                i2 = i3 + 10;
                                            }
                                            i7 = i8 + i2;
                                            i6++;
                                        } while (i6 < i);
                                        c6 = (char) i7;
                                    } else {
                                        c6 = 13;
                                    }
                                }
                            } else {
                                r4.A00('\'');
                            }
                        }
                        r4.A00(c6);
                    } else if (c5 != 127) {
                        switch (c5) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 13:
                            case 14:
                            case 15:
                            case 16:
                            case 17:
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                                if (!r3.A0E) {
                                    throw A00(r3, c5);
                                }
                                continue;
                            case 26:
                                throw new C143816zW((Object) null, r3.A01 - 1, 3);
                        }
                    } else if (r3.A0E) {
                        continue;
                    } else if (r3.A0F) {
                        throw A00(r3, c5);
                    }
                    r4.A00(c5);
                }
                throw new C143816zW(Character.valueOf(c), r3.A01, 4);
            }
            throw new C143816zW((Object) null, r3.A00, 3);
        } else if (r3.A09) {
            r3.A0A(A0J);
        } else {
            throw new C143816zW(Character.valueOf(c2), r3.A01, 0);
        }
    }

    public void A0A(boolean[] zArr) {
        C175808Zu r2 = (C175808Zu) this;
        int i = r2.A01;
        r2.A0B(zArr);
        r2.A0E(i, r2.A01);
    }

    public abstract Object A0C(boolean[] zArr);

    static {
        boolean[] zArr = new boolean[126];
        A0J = zArr;
        boolean[] zArr2 = new boolean[126];
        A0K = zArr2;
        boolean[] zArr3 = new boolean[126];
        A0L = zArr3;
        boolean[] zArr4 = new boolean[126];
        A0M = zArr4;
        boolean[] zArr5 = new boolean[126];
        A0N = zArr5;
        zArr3[26] = true;
        zArr3[58] = true;
        zArr4[26] = true;
        zArr4[125] = true;
        zArr4[44] = true;
        zArr2[26] = true;
        zArr2[93] = true;
        zArr2[44] = true;
        zArr5[26] = true;
        zArr[58] = true;
        zArr[44] = true;
        zArr[26] = true;
        zArr[125] = true;
        zArr[93] = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0125, code lost:
        throw A00(r13, r2);
     */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0119 A[EDGE_INSN: B:85:0x0119->B:78:0x0119 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A03(X.C153467bN r14) {
        /*
            r13 = this;
            char r0 = r13.A00
            r8 = 123(0x7b, float:1.72E-43)
            if (r0 != r8) goto L_0x0126
            java.lang.Object r7 = r14.A02()
            r6 = 0
            r3 = 0
        L_0x000c:
            r13.A06()
            char r2 = r13.A00
            r0 = 9
            if (r2 == r0) goto L_0x000c
            r0 = 10
            if (r2 == r0) goto L_0x000c
            r0 = 13
            if (r2 == r0) goto L_0x000c
            r0 = 32
            if (r2 == r0) goto L_0x000c
            r9 = 44
            r5 = 1
            if (r2 == r9) goto L_0x00c8
            r1 = 58
            if (r2 == r1) goto L_0x0121
            r0 = 91
            if (r2 == r0) goto L_0x0121
            r0 = 93
            if (r2 == r0) goto L_0x0121
            if (r2 == r8) goto L_0x0121
            r4 = 125(0x7d, float:1.75E-43)
            if (r2 == r4) goto L_0x010e
            r0 = 34
            if (r2 == r0) goto L_0x004e
            r0 = 39
            if (r2 == r0) goto L_0x004e
            boolean[] r0 = A0L
            r13.A0A(r0)
            boolean r0 = r13.A09
            if (r0 != 0) goto L_0x0051
            X.6zW r3 = X.C175808Zu.A01(r13, r5)
            throw r3
        L_0x004e:
            r13.A08()
        L_0x0051:
            java.lang.String r3 = r13.A04
            r13.A09()
            char r0 = r13.A00
            r2 = 3
            r11 = 26
            r10 = 0
            if (r0 == r1) goto L_0x0069
            int r1 = r13.A01
            int r1 = r1 - r5
            if (r0 != r11) goto L_0x00d6
            X.6zW r3 = new X.6zW
            r3.<init>(r10, r1, r2)
            throw r3
        L_0x0069:
            r1 = r13
            X.8Zu r1 = (X.C175808Zu) r1
            int r0 = r1.A01
            int r12 = r0 + 1
            r1.A01 = r12
            int r0 = r1.A00
            if (r12 >= r0) goto L_0x0102
            java.lang.String r0 = r1.A01
            char r0 = r0.charAt(r12)
            r1.A00 = r0
            r13.A03 = r3
            boolean[] r0 = A0M
            java.lang.Object r1 = r13.A04(r14, r0)
            boolean r0 = r14 instanceof X.C175968aA
            if (r0 != 0) goto L_0x00c1
            boolean r0 = r14 instanceof X.C175978aB
            if (r0 != 0) goto L_0x00c1
            boolean r0 = r14 instanceof X.C175958a9
            if (r0 == 0) goto L_0x00b2
            r0 = r7
            java.util.AbstractMap r0 = (java.util.AbstractMap) r0
            r0.put(r3, r1)
        L_0x0098:
            r13.A03 = r10
            r13.A09()
            char r0 = r13.A00
            if (r0 == r4) goto L_0x0119
            if (r0 == r11) goto L_0x00e0
            if (r0 == r9) goto L_0x00d3
            int r1 = r13.A01
            int r1 = r1 - r5
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            X.6zW r3 = new X.6zW
            r3.<init>(r0, r1, r5)
            throw r3
        L_0x00b2:
            boolean r0 = r14 instanceof X.C175948a8
            if (r0 != 0) goto L_0x00c1
            boolean r0 = r14 instanceof X.C175928a6
            if (r0 == 0) goto L_0x00e9
            java.lang.String r0 = "set"
            java.lang.NullPointerException r3 = X.AnonymousClass001.A0g(r0)
            throw r3
        L_0x00c1:
            r0 = r7
            java.util.Map r0 = (java.util.Map) r0
            r0.put(r3, r1)
            goto L_0x0098
        L_0x00c8:
            if (r3 == 0) goto L_0x00d3
            boolean r0 = r13.A0B
            if (r0 != 0) goto L_0x00d3
            X.6zW r3 = A00(r13, r2)
            throw r3
        L_0x00d3:
            r3 = 1
            goto L_0x000c
        L_0x00d6:
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            X.6zW r3 = new X.6zW
            r3.<init>(r0, r1, r6)
            throw r3
        L_0x00e0:
            int r0 = r13.A01
            int r0 = r0 - r5
            X.6zW r3 = new X.6zW
            r3.<init>(r10, r0, r2)
            throw r3
        L_0x00e9:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Invalid or non Implemented status"
            r1.append(r0)
            java.lang.String r0 = " setValue in "
            X.AnonymousClass6C7.A1O(r1, r0, r14)
            java.lang.String r0 = " key="
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r3, r1)
            java.lang.RuntimeException r3 = X.AnonymousClass002.A0E(r0)
            throw r3
        L_0x0102:
            r1.A00 = r11
            int r1 = r12 + -1
            java.lang.String r0 = "EOF"
            X.6zW r3 = new X.6zW
            r3.<init>(r0, r1, r2)
            throw r3
        L_0x010e:
            if (r3 == 0) goto L_0x0119
            boolean r0 = r13.A0B
            if (r0 != 0) goto L_0x0119
            X.6zW r3 = A00(r13, r2)
            throw r3
        L_0x0119:
            r13.A06()
            java.lang.Object r0 = r14.A03(r7)
            return r0
        L_0x0121:
            X.6zW r3 = A00(r13, r2)
            throw r3
        L_0x0126:
            java.lang.String r0 = "Internal Error"
            java.lang.RuntimeException r3 = X.AnonymousClass002.A0E(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C159107l8.A03(X.7bN):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00e1, code lost:
        throw new X.C143816zW(java.lang.Character.valueOf(r1), r4.A01, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0164, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A04(X.C153467bN r5, boolean[] r6) {
        /*
            r4 = this;
        L_0x0000:
            char r1 = r4.A00
            r0 = 9
            if (r1 == r0) goto L_0x001b
            r0 = 10
            if (r1 == r0) goto L_0x001b
            r2 = 1
            switch(r1) {
                case 13: goto L_0x001b;
                case 32: goto L_0x001b;
                case 34: goto L_0x016f;
                case 39: goto L_0x016f;
                case 45: goto L_0x016a;
                case 78: goto L_0x0140;
                case 91: goto L_0x00e2;
                case 93: goto L_0x00d5;
                case 102: goto L_0x00b9;
                case 110: goto L_0x009e;
                case 116: goto L_0x0082;
                case 123: goto L_0x0024;
                case 125: goto L_0x00d5;
                default: goto L_0x000e;
            }
        L_0x000e:
            switch(r1) {
                case 48: goto L_0x016a;
                case 49: goto L_0x016a;
                case 50: goto L_0x016a;
                case 51: goto L_0x016a;
                case 52: goto L_0x016a;
                case 53: goto L_0x016a;
                case 54: goto L_0x016a;
                case 55: goto L_0x016a;
                case 56: goto L_0x016a;
                case 57: goto L_0x016a;
                case 58: goto L_0x00d5;
                default: goto L_0x0011;
            }
        L_0x0011:
            r4.A0A(r6)
            boolean r0 = r4.A09
            if (r0 == 0) goto L_0x001f
            java.lang.String r0 = r4.A04
            return r0
        L_0x001b:
            r4.A06()
            goto L_0x0000
        L_0x001f:
            X.6zW r0 = X.C175808Zu.A01(r4, r2)
            throw r0
        L_0x0024:
            java.lang.String r2 = r4.A03
            boolean r0 = r5 instanceof X.C175968aA
            if (r0 == 0) goto L_0x0033
            X.7TE r0 = r5.A00
            X.7bN r5 = r0.A01
        L_0x002e:
            java.lang.Object r0 = r4.A03(r5)
            return r0
        L_0x0033:
            boolean r0 = r5 instanceof X.C175978aB
            if (r0 != 0) goto L_0x002e
            boolean r0 = r5 instanceof X.C175958a9
            if (r0 != 0) goto L_0x0064
            boolean r0 = r5 instanceof X.C175948a8
            if (r0 != 0) goto L_0x0064
            boolean r0 = r5 instanceof X.C175938a7
            if (r0 != 0) goto L_0x0064
            boolean r0 = r5 instanceof X.C175928a6
            if (r0 == 0) goto L_0x004e
            java.lang.String r0 = "get"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x004e:
            boolean r0 = r5 instanceof X.C175818Zv
            if (r0 == 0) goto L_0x0069
            r2 = r5
            X.8Zv r2 = (X.C175818Zv) r2
            X.7bN r5 = r2.A00
            if (r5 != 0) goto L_0x002e
            X.7TE r1 = r2.A00
            java.lang.Class r0 = r2.A01
            X.7bN r5 = r1.A00(r0)
            r2.A00 = r5
            goto L_0x002e
        L_0x0064:
            X.7TE r0 = r5.A00
            X.7bN r5 = r0.A00
            goto L_0x002e
        L_0x0069:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Invalid or non Implemented status"
            r1.append(r0)
            java.lang.String r0 = " startObject(String key) in "
            X.AnonymousClass6C7.A1O(r1, r0, r5)
            java.lang.String r0 = " key="
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r2, r1)
            java.lang.RuntimeException r0 = X.AnonymousClass002.A0E(r0)
            throw r0
        L_0x0082:
            r4.A0A(r6)
            java.lang.String r0 = "true"
            java.lang.String r3 = r4.A04
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0092
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L_0x0092:
            boolean r0 = r4.A09
            if (r0 != 0) goto L_0x0164
            int r1 = r4.A01
            X.6zW r0 = new X.6zW
            r0.<init>(r3, r1, r2)
            throw r0
        L_0x009e:
            r4.A0A(r6)
            java.lang.String r0 = "null"
            java.lang.String r3 = r4.A04
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x00ad
            r0 = 0
            return r0
        L_0x00ad:
            boolean r0 = r4.A09
            if (r0 != 0) goto L_0x0164
            int r1 = r4.A01
            X.6zW r0 = new X.6zW
            r0.<init>(r3, r1, r2)
            throw r0
        L_0x00b9:
            r4.A0A(r6)
            java.lang.String r0 = "false"
            java.lang.String r3 = r4.A04
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x00c9
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L_0x00c9:
            boolean r0 = r4.A09
            if (r0 != 0) goto L_0x0164
            int r1 = r4.A01
            X.6zW r0 = new X.6zW
            r0.<init>(r3, r1, r2)
            throw r0
        L_0x00d5:
            int r3 = r4.A01
            java.lang.Character r2 = java.lang.Character.valueOf(r1)
            r1 = 0
            X.6zW r0 = new X.6zW
            r0.<init>(r2, r3, r1)
            throw r0
        L_0x00e2:
            java.lang.String r2 = r4.A03
            boolean r0 = r5 instanceof X.C175968aA
            if (r0 == 0) goto L_0x00f1
            X.7TE r0 = r5.A00
            X.7bN r5 = r0.A01
        L_0x00ec:
            java.lang.Object r0 = r4.A02(r5)
            return r0
        L_0x00f1:
            boolean r0 = r5 instanceof X.C175978aB
            if (r0 != 0) goto L_0x00ec
            boolean r0 = r5 instanceof X.C175958a9
            if (r0 != 0) goto L_0x0122
            boolean r0 = r5 instanceof X.C175948a8
            if (r0 != 0) goto L_0x0122
            boolean r0 = r5 instanceof X.C175938a7
            if (r0 != 0) goto L_0x0122
            boolean r0 = r5 instanceof X.C175928a6
            if (r0 == 0) goto L_0x010c
            java.lang.String r0 = "get"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x010c:
            boolean r0 = r5 instanceof X.C175818Zv
            if (r0 == 0) goto L_0x0127
            r2 = r5
            X.8Zv r2 = (X.C175818Zv) r2
            X.7bN r5 = r2.A00
            if (r5 != 0) goto L_0x00ec
            X.7TE r1 = r2.A00
            java.lang.Class r0 = r2.A01
            X.7bN r5 = r1.A00(r0)
            r2.A00 = r5
            goto L_0x00ec
        L_0x0122:
            X.7TE r0 = r5.A00
            X.7bN r5 = r0.A00
            goto L_0x00ec
        L_0x0127:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Invalid or non Implemented status"
            r1.append(r0)
            java.lang.String r0 = " startArray in "
            X.AnonymousClass6C7.A1O(r1, r0, r5)
            java.lang.String r0 = " key="
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r2, r1)
            java.lang.RuntimeException r0 = X.AnonymousClass002.A0E(r0)
            throw r0
        L_0x0140:
            r4.A0A(r6)
            boolean r0 = r4.A08
            if (r0 == 0) goto L_0x0165
            java.lang.String r0 = "NaN"
            java.lang.String r3 = r4.A04
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0158
            r0 = 2143289344(0x7fc00000, float:NaN)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            return r0
        L_0x0158:
            boolean r0 = r4.A09
            if (r0 != 0) goto L_0x0164
            int r1 = r4.A01
            X.6zW r0 = new X.6zW
            r0.<init>(r3, r1, r2)
            throw r0
        L_0x0164:
            return r3
        L_0x0165:
            X.6zW r0 = X.C175808Zu.A01(r4, r2)
            throw r0
        L_0x016a:
            java.lang.Object r0 = r4.A0C(r6)
            return r0
        L_0x016f:
            r4.A08()
            java.lang.String r0 = r4.A04
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C159107l8.A04(X.7bN, boolean[]):java.lang.Object");
    }

    public void A05() {
        String str = this.A04;
        int length = str.length();
        if (length == 1) {
            return;
        }
        if (length != 2) {
            char A002 = AnonymousClass6C9.A00(str);
            char charAt = this.A04.charAt(1);
            if (A002 == '-') {
                char charAt2 = this.A04.charAt(2);
                if (charAt == '0' && charAt2 >= '0' && charAt2 <= '9') {
                    throw C175808Zu.A01(this, 6);
                }
            } else if (A002 == '0' && charAt >= '0' && charAt <= '9') {
                throw C175808Zu.A01(this, 6);
            }
        } else if (str.equals("00")) {
            throw new C143816zW(str, this.A01, 6);
        }
    }

    public void A09() {
        while (true) {
            char c = this.A00;
            if (c <= ' ' && c != 26) {
                A07();
            } else {
                return;
            }
        }
    }

    public void A0B(boolean[] zArr) {
        while (true) {
            char c = this.A00;
            if (c == 26) {
                return;
            }
            if (c < 0 || c >= '~' || !zArr[c]) {
                A07();
            } else {
                return;
            }
        }
    }

    public C159107l8(int i) {
        boolean z = false;
        this.A08 = AnonymousClass001.A1W(i & 4);
        this.A09 = AnonymousClass001.A1W(i & 2);
        this.A0A = AnonymousClass001.A1W(i & 1);
        this.A0E = AnonymousClass001.A1W(i & 8);
        this.A0I = AnonymousClass001.A1W(i & 16);
        this.A07 = AnonymousClass001.A1W(i & 32);
        this.A0B = AnonymousClass001.A1W(i & 64);
        this.A0H = AnonymousClass001.A1W(i & 128);
        this.A0C = AnonymousClass001.A1X(i & 768, 768);
        this.A0D = AnonymousClass000.A1T(i & 512);
        this.A0F = AnonymousClass001.A1W(i & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH);
        this.A0G = (i & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH) > 0 ? true : z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0038, code lost:
        if (r4 == ':') goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003c, code lost:
        if (r4 == ']') goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0040, code lost:
        if (r4 == '}') goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0042, code lost:
        r1 = A04(r7, A0K);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004a, code lost:
        if ((r7 instanceof X.C175968aA) != false) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004e, code lost:
        if ((r7 instanceof X.C175978aB) != false) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0052, code lost:
        if ((r7 instanceof X.C175958a9) != false) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0056, code lost:
        if ((r7 instanceof X.C175938a7) != false) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x005a, code lost:
        if ((r7 instanceof X.C175988aC) != false) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x005c, code lost:
        r1 = X.AnonymousClass001.A0o();
        r1.append("Invalid or non Implemented status");
        X.AnonymousClass6C7.A1O(r1, " addValue(Object current, Object value) in ", r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x006e, code lost:
        throw X.AnonymousClass6C7.A0e(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x006f, code lost:
        ((java.util.List) r2).add(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0076, code lost:
        ((java.util.AbstractCollection) r2).add(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0091, code lost:
        if (r5 == false) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0095, code lost:
        if (r6.A0B != false) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x009b, code lost:
        throw A00(r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x009c, code lost:
        A06();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00a3, code lost:
        return r7.A03(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A02(X.C153467bN r7) {
        /*
            r6 = this;
            java.lang.Object r2 = r7.A01()
            char r1 = r6.A00
            r0 = 91
            if (r1 != r0) goto L_0x00b5
            r6.A06()
            char r1 = r6.A00
            r3 = 44
            if (r1 != r3) goto L_0x001c
            boolean r0 = r6.A0B
            if (r0 != 0) goto L_0x001c
            X.6zW r3 = A00(r6, r1)
            throw r3
        L_0x001c:
            r5 = 0
        L_0x001d:
            char r4 = r6.A00
            r0 = 9
            if (r4 == r0) goto L_0x008d
            r0 = 10
            if (r4 == r0) goto L_0x008d
            r0 = 13
            if (r4 == r0) goto L_0x008d
            r1 = 26
            r0 = 1
            if (r4 == r1) goto L_0x00a9
            r0 = 32
            if (r4 == r0) goto L_0x008d
            if (r4 == r3) goto L_0x007d
            r0 = 58
            if (r4 == r0) goto L_0x00a4
            r0 = 93
            if (r4 == r0) goto L_0x0091
            r0 = 125(0x7d, float:1.75E-43)
            if (r4 == r0) goto L_0x00a4
            boolean[] r0 = A0K
            java.lang.Object r1 = r6.A04(r7, r0)
            boolean r0 = r7 instanceof X.C175968aA
            if (r0 != 0) goto L_0x0076
            boolean r0 = r7 instanceof X.C175978aB
            if (r0 != 0) goto L_0x006f
            boolean r0 = r7 instanceof X.C175958a9
            if (r0 != 0) goto L_0x0076
            boolean r0 = r7 instanceof X.C175938a7
            if (r0 != 0) goto L_0x006f
            boolean r0 = r7 instanceof X.C175988aC
            if (r0 != 0) goto L_0x006f
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Invalid or non Implemented status"
            r1.append(r0)
            java.lang.String r0 = " addValue(Object current, Object value) in "
            X.AnonymousClass6C7.A1O(r1, r0, r7)
            java.lang.RuntimeException r3 = X.AnonymousClass6C7.A0e(r1)
            throw r3
        L_0x006f:
            r0 = r2
            java.util.List r0 = (java.util.List) r0
            r0.add(r1)
            goto L_0x001c
        L_0x0076:
            r0 = r2
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            r0.add(r1)
            goto L_0x001c
        L_0x007d:
            if (r5 == 0) goto L_0x0088
            boolean r0 = r6.A0B
            if (r0 != 0) goto L_0x0088
            X.6zW r3 = A00(r6, r4)
            throw r3
        L_0x0088:
            r6.A06()
            r5 = 1
            goto L_0x001d
        L_0x008d:
            r6.A06()
            goto L_0x001d
        L_0x0091:
            if (r5 == 0) goto L_0x009c
            boolean r0 = r6.A0B
            if (r0 != 0) goto L_0x009c
            X.6zW r3 = A00(r6, r4)
            throw r3
        L_0x009c:
            r6.A06()
            java.lang.Object r0 = r7.A03(r2)
            return r0
        L_0x00a4:
            X.6zW r3 = A00(r6, r4)
            throw r3
        L_0x00a9:
            int r2 = r6.A01
            int r2 = r2 - r0
            r1 = 3
            java.lang.String r0 = "EOF"
            X.6zW r3 = new X.6zW
            r3.<init>(r0, r2, r1)
            throw r3
        L_0x00b5:
            java.lang.String r0 = "Internal Error"
            java.lang.RuntimeException r3 = X.AnonymousClass002.A0E(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C159107l8.A02(X.7bN):java.lang.Object");
    }
}
