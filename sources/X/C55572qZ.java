package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;

/* renamed from: X.2qZ  reason: invalid class name and case insensitive filesystem */
public final class C55572qZ {
    public final C64393Dh A00;
    public final C66663Mh A01;
    public final C29441ip A02;
    public final AnonymousClass33p A03;
    public final C61072zf A04;
    public final C56982ss A05;
    public final AnonymousClass1VX A06;
    public final C55972rD A07;
    public final C47022ca A08;
    public final C47032cb A09;
    public final C46032ay A0A;
    public final C55852r1 A0B;

    public final boolean A00(C95814uZ r9) {
        if (r9 == null) {
            return false;
        }
        C56982ss r2 = this.A05;
        if (r2.A03(r9) < 5) {
            return false;
        }
        long A0B2 = AnonymousClass0x2.A0B(AnonymousClass0x2.A0F(this.A03), "last_read_conversation_time");
        AnonymousClass31A A012 = C56982ss.A01(r2, r9);
        if (A012 == null) {
            return false;
        }
        long j = A012.A0Y;
        return j != 0 && j + 86400000 < A0B2;
    }

    public final boolean A01(C95814uZ r7, C633138t r8, int i, int i2, long j, boolean z) {
        C162457s7.A0J(r8, 1);
        if (!AnonymousClass36O.A06(r8)) {
            if (C73703fw.A00(r8, new C633138t[]{C633138t.A0C, C633138t.A0H, C633138t.A0j}) >= 0) {
                if (i2 <= 0 || j >= ((long) i2) || i2 > 35000 || i == 3 || A00(r7)) {
                    return false;
                }
                return true;
            } else if ((r8 == C633138t.A0g || r8 == C633138t.A0a || r8 == C633138t.A0V) && z && j < 262144) {
                return AnonymousClass0x2.A1X(this.A0A.A00());
            }
        } else if (i2 >= 0) {
            long j2 = (long) i2;
            if (j < j2 && !A00(r7)) {
                if (i == 3) {
                    if ((this.A0A.A00() & 1) != 0) {
                        return true;
                    }
                    return false;
                } else if (j2 < 102400) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    public final boolean A02(C633138t r12, int i, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        C22071Ek r0;
        Object obj;
        int i2;
        int i3;
        int A002;
        boolean z6 = false;
        C162457s7.A0J(r12, 0);
        int A082 = this.A02.A08(z);
        if ((!AnonymousClass36O.A06(r12) || j <= 1048576) && this.A04.A02() >= (C56952sp.A06(this.A06, 1291) * SearchActionVerificationClientService.MS_TO_NS) + j) {
            C66663Mh r1 = this.A01;
            if (A082 == 1) {
                r0 = C66663Mh.A1Z;
            } else {
                r0 = C66663Mh.A1Y;
            }
            if (j <= ((long) r1.A03(r0)) * SearchActionVerificationClientService.MS_TO_NS) {
                if (z3 && z4) {
                    Integer[] numArr = new Integer[2];
                    AnonymousClass000.A1P(numArr, 1, 0);
                    AnonymousClass000.A1P(numArr, 2, 1);
                    if (C73703fw.A00(Integer.valueOf(A082), numArr) >= 0) {
                        return true;
                    }
                }
                C46032ay r2 = this.A0A;
                byte b = r12.A00;
                if (b == 23 || b == 37 || b == 1 || b == 0 || b == 25 || b == 57 || b == 42) {
                    obj = C135326kU.A00;
                } else if (b == 13 || b == 29) {
                    obj = C135316kT.A00;
                } else if (b == 3 || b == 28 || b == 62 || b == 81 || b == 43) {
                    obj = C135366kY.A00;
                } else if (b == 9) {
                    obj = C135306kS.A00;
                } else if (b == 26 || b == 63) {
                    obj = C135346kW.A00;
                } else if (b == 20) {
                    obj = C135336kV.A00;
                } else if (b == 82 || b == 2) {
                    obj = C135296kR.A00;
                } else {
                    obj = C135356kX.A00;
                }
                if (C162457s7.A0P(obj, C135296kR.A00)) {
                    z6 = true;
                    if ((r2.A00() & 2) == 0) {
                        if (i != 1) {
                            return false;
                        }
                        if (j > C56952sp.A06(r2.A03, 6040)) {
                            if (r2.A01.A08(true) == 1) {
                                return true;
                            }
                            return false;
                        }
                    }
                } else if (C162457s7.A0P(obj, C135306kS.A00)) {
                    long A032 = ((long) r2.A00.A03(C66663Mh.A1c)) * 1024;
                    if ((i != 7 || j > A032 || r2.A01.A08(true) == 3) && (r2.A00() & 8) == 0) {
                        return false;
                    }
                    return true;
                } else {
                    if (C162457s7.A0P(obj, C135316kT.A00)) {
                        int i4 = (j > C56952sp.A06(r2.A03, 6041) ? 1 : (j == C56952sp.A06(r2.A03, 6041) ? 0 : -1));
                        i2 = r2.A00();
                        if (i4 > 0) {
                            i3 = i2 & 4;
                        }
                        i3 = i2 & 1;
                    } else if (C162457s7.A0P(obj, C135326kU.A00)) {
                        if ((r2.A00() & 1) != 0) {
                            return true;
                        }
                        return false;
                    } else if (!C162457s7.A0P(obj, C135336kV.A00)) {
                        if (C162457s7.A0P(obj, C135346kW.A00)) {
                            A002 = r2.A00() & 8;
                        } else if (C162457s7.A0P(obj, C135356kX.A00)) {
                            return false;
                        } else {
                            if (C162457s7.A0P(obj, C135366kY.A00)) {
                                A002 = r2.A00() & 4;
                            } else {
                                throw C73153f1.A00();
                            }
                        }
                        if (A002 != 0) {
                            return true;
                        }
                        return false;
                    } else if ((!z2 || z5) && r2.A01.A08(true) != 3) {
                        return true;
                    } else {
                        i2 = r2.A00();
                        i3 = i2 & 1;
                    }
                    if (i3 != 0) {
                        return true;
                    }
                }
            }
        }
        return z6;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        if (((X.AnonymousClass1nE) r11).A24() == false) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A03(X.C30471mV r11) {
        /*
            r10 = this;
            r5 = 0
            boolean r1 = r11 instanceof X.AnonymousClass1nE
            if (r1 == 0) goto L_0x000c
            r0 = r11
            X.1nE r0 = (X.AnonymousClass1nE) r0
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x0014
        L_0x000c:
            X.33C r0 = r11.A01
            if (r0 == 0) goto L_0x003d
            int r0 = r0.A04
            if (r0 <= 0) goto L_0x003d
        L_0x0014:
            r6 = 1
        L_0x0015:
            if (r1 == 0) goto L_0x0021
            r0 = r11
            X.1nE r0 = (X.AnonymousClass1nE) r0
            boolean r0 = r0.A24()
            r9 = 1
            if (r0 != 0) goto L_0x0022
        L_0x0021:
            r9 = 0
        L_0x0022:
            X.38t r1 = X.AnonymousClass36O.A02(r11)
            X.C162457s7.A0D(r1)
            long r3 = r11.A00
            int r2 = r11.A09
            boolean r7 = X.AnonymousClass2z0.A0B(r11)
            X.4uZ r0 = r11.A0n()
            boolean r8 = r0 instanceof X.C135216kJ
            r0 = r10
            boolean r0 = r0.A02(r1, r2, r3, r5, r6, r7, r8, r9)
            return r0
        L_0x003d:
            r6 = 0
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55572qZ.A03(X.1mV):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005e, code lost:
        if (X.AnonymousClass35Z.A01(r12.A06, r13) != false) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        if (r9 > 0) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A04(X.C30471mV r13, int r14) {
        /*
            r12 = this;
            X.33C r3 = r13.A01
            r0 = 0
            if (r3 != 0) goto L_0x0006
            return r0
        L_0x0006:
            r4 = r12
            X.2rD r0 = r12.A07
            java.lang.String r2 = r3.A0I
            if (r2 == 0) goto L_0x002c
            X.2qx r1 = r0.A0J
            r0 = 1
            X.5LM r0 = r1.A02(r2, r0)
            if (r0 == 0) goto L_0x002c
            r1 = 0
            long r9 = r0.A0A
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x002c
        L_0x001e:
            boolean r0 = r13 instanceof X.AnonymousClass1n2
            r1 = 1
            if (r0 == 0) goto L_0x0040
            X.2cb r0 = r12.A09
            boolean r0 = r0.A00(r13)
            if (r0 == 0) goto L_0x0040
            return r1
        L_0x002c:
            boolean r0 = X.AnonymousClass2z0.A0C(r13)
            if (r0 == 0) goto L_0x003d
            X.3Dh r2 = r12.A00
            X.1VX r1 = r12.A06
            X.2zf r0 = r12.A04
            long r9 = X.AnonymousClass36U.A02(r2, r0, r1, r13)
            goto L_0x001e
        L_0x003d:
            r9 = 0
            goto L_0x001e
        L_0x0040:
            X.2z0 r0 = r13.A1J
            X.4uZ r5 = r0.A00
            boolean r0 = r5 instanceof X.C95804uY
            if (r0 == 0) goto L_0x0067
            r8 = 262144(0x40000, float:3.67342E-40)
        L_0x004a:
            X.38t r6 = X.AnonymousClass36O.A02(r13)
            X.C162457s7.A0D(r6)
            boolean r0 = X.C624234y.A04(r13)
            if (r0 != 0) goto L_0x0060
            X.1VX r0 = r12.A06
            boolean r0 = X.AnonymousClass35Z.A01(r0, r13)
            r11 = 0
            if (r0 == 0) goto L_0x0061
        L_0x0060:
            r11 = 1
        L_0x0061:
            r7 = r14
            boolean r1 = r4.A01(r5, r6, r7, r8, r9, r11)
            return r1
        L_0x0067:
            int r8 = r3.A04
            goto L_0x004a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55572qZ.A04(X.1mV, int):boolean");
    }

    public C55572qZ(C64393Dh r2, C66663Mh r3, C29441ip r4, AnonymousClass33p r5, C61072zf r6, C56982ss r7, AnonymousClass1VX r8, C55972rD r9, C47022ca r10, C47032cb r11, C46032ay r12, C55852r1 r13) {
        C18260x0.A0f(r8, r7, r2, r3, r6);
        C18260x0.A0W(r13, r9, r5);
        C162457s7.A0J(r4, 10);
        this.A06 = r8;
        this.A05 = r7;
        this.A00 = r2;
        this.A01 = r3;
        this.A04 = r6;
        this.A0B = r13;
        this.A07 = r9;
        this.A03 = r5;
        this.A09 = r11;
        this.A02 = r4;
        this.A08 = r10;
        this.A0A = r12;
    }
}
