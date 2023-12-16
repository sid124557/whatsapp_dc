package X;

import android.util.Base64;
import java.util.Map;

/* renamed from: X.68O  reason: invalid class name */
public class AnonymousClass68O extends C56812sb {
    public Object A00;
    public final int A01;

    public void A02(String str, int i, int i2, int i3, int i4, long j, boolean z) {
        String str2 = str;
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        int i8 = i4;
        long j2 = j;
        if (1 - this.A01 != 0) {
            super.A02(str2, i5, i6, i7, i8, j2, z);
            return;
        }
        C105935Wz r1 = (C105935Wz) this.A00;
        int i9 = 1;
        if (i5 == 1) {
            i9 = 2;
        } else if (i5 != 2) {
            i9 = -1;
            if (i5 == 3) {
                if (i6 == 6) {
                    i9 = 13;
                } else if (i6 == 23) {
                    i9 = 10;
                } else if (i6 == 32) {
                    i9 = 14;
                } else if (i6 == 8) {
                    i9 = 12;
                } else if (i6 == 9) {
                    i9 = 11;
                }
            }
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("WamsysRegistrationWrapper/send-device-confirmation-status-unspecified; response-status ");
            A0o.append(i5);
            C18260x0.A0x(" failure-reason ", A0o, i6);
        }
        C18260x0.A0w("WamsysRegistrationWrapper/send-device-confirmation-status: status:", AnonymousClass001.A0o(), i9);
        boolean A1U = AnonymousClass000.A1U(i7, 1);
        boolean A1U2 = AnonymousClass000.A1U(i8, 1);
        r1.A02(new C104945Sy(str, String.valueOf(j2), i9, i6, A1U, A1U2));
    }

    public AnonymousClass68O(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void A01(int i, int i2, String str, int i3) {
        int i4;
        if (2 - this.A01 != 0) {
            super.A01(i, i2, str, i3);
            return;
        }
        C105935Wz r4 = (C105935Wz) this.A00;
        if (i != 1) {
            i4 = 0;
            if (i != 3) {
                i4 = -1;
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("WamsysRegistrationWrapper/wfs-auth-unspecified; response-status ");
                A0o.append(i);
                C18260x0.A0x(" failure-reason ", A0o, i2);
            }
        } else {
            i4 = 1;
        }
        C998758n A002 = C106535Zj.A00(i2);
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("WamsysRegistrationWrapper/exist: Failure reason:");
        C18260x0.A1J(A0o2, A002.name());
        C18260x0.A0w("WamsysRegistrationWrapper/send-device-confirmation-status: status:", AnonymousClass001.A0o(), i4);
        r4.A02(new C58752vl(A002, str, i4, AnonymousClass001.A1T(i3)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002f, code lost:
        if (r6 != 32) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(java.lang.String r19, int r20, int r21, int r22, long r23, boolean r25) {
        /*
            r18 = this;
            r3 = r18
            int r0 = r3.A01
            r4 = r19
            r5 = r20
            r6 = r21
            r7 = r22
            r8 = r23
            r10 = r25
            int r0 = 3 - r0
            if (r0 == 0) goto L_0x0018
            super.A03(r4, r5, r6, r7, r8, r10)
            return
        L_0x0018:
            java.lang.Object r2 = r3.A00
            X.5Wz r2 = (X.C105935Wz) r2
            r3 = 1
            if (r5 == r3) goto L_0x006a
            r0 = 3
            if (r5 != r0) goto L_0x0031
            if (r6 == r3) goto L_0x0067
            r0 = 6
            if (r6 == r0) goto L_0x0064
            r0 = 23
            if (r6 == r0) goto L_0x0061
            r0 = 32
            r14 = 13
            if (r6 == r0) goto L_0x0043
        L_0x0031:
            r14 = -1
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "WamsysRegistrationWrapper/fetch-device-confirmation-status-unspecified; response-status "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = " failure-reason "
            X.C18260x0.A0x(r0, r1, r6)
        L_0x0043:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "WamsysRegistrationWrapper/fetch-device-confirmation-status: status:"
            X.C18260x0.A0w(r0, r1, r14)
            boolean r16 = X.AnonymousClass000.A1U(r7, r3)
            java.lang.String r13 = java.lang.String.valueOf(r8)
            X.5Sz r11 = new X.5Sz
            r12 = r4
            r15 = r6
            r17 = r10
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r2.A02(r11)
            return
        L_0x0061:
            r14 = 11
            goto L_0x0043
        L_0x0064:
            r14 = 12
            goto L_0x0043
        L_0x0067:
            r14 = 10
            goto L_0x0043
        L_0x006a:
            r14 = 1
            goto L_0x0043
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass68O.A03(java.lang.String, int, int, int, long, boolean):void");
    }

    public void A05(String str, String str2, String str3, String str4, String str5, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, long j, long j2, long j3, long j4, long j5) {
        C998358j r11;
        int i10 = i8;
        int i11 = i7;
        int i12 = i6;
        int i13 = i5;
        int i14 = i4;
        int i15 = i3;
        long j6 = j5;
        long j7 = j4;
        long j8 = j3;
        int i16 = i;
        long j9 = j2;
        String str6 = str4;
        String str7 = str2;
        int i17 = i9;
        String str8 = str;
        String str9 = str3;
        String str10 = str5;
        int i18 = i2;
        if (this.A01 != 0) {
            int i19 = i11;
            int i20 = i12;
            int i21 = i13;
            int i22 = i14;
            int i23 = i15;
            int i24 = i18;
            int i25 = i16;
            String str11 = str10;
            super.A05(str8, str7, str9, str6, str11, i25, i24, i23, i22, i21, i20, i19, i10, i17, j, j9, j8, j7, j6);
            return;
        }
        C105935Wz r3 = (C105935Wz) this.A00;
        if (i16 != 3) {
            if (i16 == 5) {
                r11 = C998358j.VERIFIED_CAPTCHA;
            }
            r11 = C998358j.ERROR_UNSPECIFIED;
        } else if (i18 == 2) {
            r11 = C998358j.FAIL_BLOCKED;
        } else if (i18 == 6) {
            r11 = C998358j.FAIL_TEMPORARILY_UNAVAILABLE;
        } else if (i18 != 11) {
            switch (i2) {
                case 18:
                    r11 = C998358j.ERROR_NO_ROUTES;
                    break;
                case 19:
                    r11 = C998358j.FAIL_MISMATCH;
                    break;
                case 20:
                    r11 = C998358j.FAIL_GUESSED_TOO_FAST;
                    break;
                case 21:
                    r11 = C998358j.FAIL_MISSING;
                    break;
                case 22:
                    r11 = C998358j.FAIL_STALE;
                    break;
            }
            r11 = C998358j.ERROR_UNSPECIFIED;
        } else {
            r11 = C998358j.FAIL_TOO_MANY_GUESSES;
        }
        if (r11 == C998358j.ERROR_UNSPECIFIED) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("WamsysRegistrationWrapper/verifycaptcha-status-unspecified; response-status ");
            A0o.append(i16);
            C18260x0.A0x(" failure-reason ", A0o, i18);
        }
        AnonymousClass5LS r4 = new AnonymousClass5LS(r11);
        r4.A0A = str8;
        r4.A07 = str7;
        r4.A03 = i15;
        r4.A02 = i14;
        r4.A04 = i13;
        r4.A0B = String.valueOf(j9);
        r4.A0C = String.valueOf(j8);
        r4.A0D = String.valueOf(j7);
        r4.A09 = String.valueOf(j6);
        r4.A01 = i12;
        r4.A05 = i11;
        r4.A0E = AnonymousClass001.A1T(i10);
        r4.A06 = new C108565dC(str9, (String) null, (String) null, str6, -1, false);
        r4.A00 = i17;
        r4.A08 = str10;
        r3.A02(r4);
    }

    public void A08(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Map map, Map map2, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3) {
        int i8 = i;
        Map map3 = map2;
        Map map4 = map;
        String str11 = str9;
        String str12 = str8;
        String str13 = str7;
        String str14 = str5;
        String str15 = str4;
        String str16 = str3;
        String str17 = str2;
        boolean z4 = z2;
        int i9 = i4;
        boolean z5 = z;
        int i10 = i3;
        long j5 = j4;
        long j6 = j3;
        long j7 = j2;
        long j8 = j;
        int i11 = i5;
        String str18 = str;
        boolean z6 = z3;
        int i12 = i2;
        if (8 - this.A01 != 0) {
            int i13 = i8;
            int i14 = i12;
            int i15 = i10;
            int i16 = i9;
            int i17 = i11;
            boolean z7 = z5;
            boolean z8 = z6;
            String str19 = str18;
            String str20 = str17;
            String str21 = str16;
            String str22 = str15;
            String str23 = str14;
            Map map5 = map4;
            Map map6 = map3;
            super.A08(str19, str20, str21, str22, str23, str6, str13, str12, str11, str10, map5, map6, i13, i14, i15, i16, i17, i6, i7, j8, j7, j6, j5, z7, z4, z8);
            return;
        }
        C105935Wz r8 = (C105935Wz) this.A00;
        C998658m A02 = C106535Zj.A02(i8, i12);
        if (A02 == C998658m.ERROR_UNSPECIFIED) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("WamsysRegistrationWrapper/verify-code-status-unspecified; response-status ");
            A0o.append(i8);
            C18260x0.A0x(" failure-reason ", A0o, i12);
        }
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("WamsysRegistrationWrapper/register phonenumber: verifyCodeStatus:");
        C18260x0.A1J(A0o2, A02.name());
        AnonymousClass5LZ r7 = new AnonymousClass5LZ(A02);
        r7.A0A = str18;
        boolean z9 = true;
        r7.A0H = AnonymousClass000.A1U(i10, 1);
        if (i9 != 1) {
            z9 = false;
        }
        r7.A0G = z9;
        r7.A0F = z5;
        r7.A0C = String.valueOf(j8);
        r7.A0B = str17;
        r7.A0E = str16;
        r7.A0D = str15;
        r7.A04 = j7;
        r7.A00 = i11;
        r7.A0I = z6;
        r7.A02 = j6;
        r7.A03 = j5;
        r7.A05 = new C108565dC(str13, str12, (String) null, str11, -1, z4);
        if (str5 != null) {
            r7.A0J = Base64.decode(str14, 0);
        }
        r7.A08 = C100545Bi.A00(map4);
        r7.A07 = AnonymousClass75A.A00(map3);
        StringBuilder A0o3 = AnonymousClass001.A0o();
        A0o3.append("WamsysRegistrationWrapper/register-phone-number/reg-block raw\n\nversionUpgrade: ");
        A0o3.append(map4);
        C18260x0.A1P(A0o3, "\n\ncustomBlockScreen: ", map3);
        r8.A02(r7);
    }

    public void A09(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Map map, Map map2, int i, int i2, int i3, int i4, int i5, int i6, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3) {
        C998458k r14;
        int i7 = i2;
        int i8 = i;
        Map map3 = map2;
        Map map4 = map;
        String str10 = str6;
        String str11 = str4;
        String str12 = str3;
        int i9 = i4;
        String str13 = str2;
        boolean z4 = z2;
        int i10 = i3;
        String str14 = str;
        boolean z5 = z;
        long j5 = j3;
        long j6 = j2;
        long j7 = j;
        int i11 = i5;
        if (9 - this.A01 != 0) {
            String str15 = str7;
            String str16 = str5;
            int i12 = i6;
            int i13 = i8;
            int i14 = i7;
            int i15 = i10;
            int i16 = i9;
            long j8 = j7;
            long j9 = j6;
            long j10 = j5;
            boolean z6 = z5;
            boolean z7 = z4;
            String str17 = str14;
            String str18 = str13;
            String str19 = str12;
            String str20 = str11;
            String str21 = str10;
            Map map5 = map4;
            super.A09(str17, str18, str19, str20, str16, str21, str15, str8, str9, map5, map3, i13, i14, i15, i16, i11, i12, j8, j9, j10, j4, z6, z7, z3);
            return;
        }
        C105935Wz r7 = (C105935Wz) this.A00;
        if (i8 == 1 || i8 == 2) {
            r14 = C998458k.YES;
        } else {
            if (i8 == 3) {
                if (i7 == 1) {
                    r14 = C998458k.FAIL_INCORRECT;
                } else if (i7 == 2) {
                    r14 = C998458k.FAIL_BLOCKED;
                } else if (i7 == 6) {
                    r14 = C998458k.FAIL_TEMPORARILY_UNAVAILABLE;
                } else if (i7 == 11) {
                    r14 = C998458k.FAIL_TOO_MANY_GUESSES;
                } else if (i7 == 22) {
                    r14 = C998458k.FAIL_STALE;
                } else if (i7 == 28) {
                    r14 = C998458k.FAIL_RESET_TOO_SOON;
                } else if (i7 == 19) {
                    r14 = C998458k.FAIL_MISMATCH;
                } else if (i7 == 20) {
                    r14 = C998458k.FAIL_GUESSED_TOO_FAST;
                }
            }
            r14 = C998458k.ERROR_UNSPECIFIED;
        }
        if (r14 == C998458k.ERROR_UNSPECIFIED) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("WamsysRegistrationWrapper/security-status-unspecified; response-status ");
            A0o.append(i8);
            C18260x0.A0x(" failure-reason ", A0o, i7);
        }
        AnonymousClass5LR r8 = new AnonymousClass5LR(r14);
        r8.A07 = str14;
        boolean z8 = true;
        r8.A0D = AnonymousClass000.A1U(i10, 1);
        if (i9 != 1) {
            z8 = false;
        }
        r8.A0C = z8;
        r8.A0B = z5;
        r8.A06 = String.valueOf(i11);
        r8.A00 = j7;
        r8.A08 = str13;
        r8.A0A = str12;
        r8.A09 = str11;
        r8.A02 = j6;
        r8.A01 = j5;
        r8.A0E = z4;
        if (str6 != null) {
            r8.A0F = Base64.decode(str10, 0);
        }
        r8.A05 = C100545Bi.A00(map4);
        r8.A04 = AnonymousClass75A.A00(map3);
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("WamsysRegistrationWrapper/security-status/reg-block raw\n\nversionUpgrade: ");
        A0o2.append(map4);
        C18260x0.A1P(A0o2, "\n\ncustomBlockScreen: ", map3);
        r7.A02(r8);
    }

    public void A0A(String str, String str2, String str3, Map map, Map map2, int i, int i2, int i3, int i4, long j) {
        if (7 - this.A01 != 0) {
            super.A0A(str, str2, str3, map, map2, i, i2, i3, i4, j);
            return;
        }
        C105935Wz r2 = (C105935Wz) this.A00;
        C998658m A02 = C106535Zj.A02(i, i2);
        if (A02 == C998658m.ERROR_UNSPECIFIED) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("WamsysRegistrationWrapper/verify-code-status-standalone-unspecified; response-status ");
            A0o.append(i);
            C18260x0.A0x(" failure-reason ", A0o, i2);
        }
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("WamsysRegistrationWrapper/verify code: verifyCodeStatus:");
        C18260x0.A1J(A0o2, A02.name());
        AnonymousClass5LZ r3 = new AnonymousClass5LZ(A02);
        r3.A0A = str;
        r3.A0H = AnonymousClass001.A1T(i3);
        r3.A0C = String.valueOf(j);
        r3.A09 = str3;
        r3.A01 = i4;
        if (str2 != null) {
            r3.A0J = Base64.decode(str2, 0);
        }
        r3.A08 = C100545Bi.A00(map);
        r3.A07 = AnonymousClass75A.A00(map2);
        StringBuilder A0o3 = AnonymousClass001.A0o();
        A0o3.append("WamsysRegistrationWrapper/verify-code-status-standalone/reg-block raw\n\nversionUpgrade: ");
        A0o3.append(map);
        C18260x0.A1P(A0o3, "\n\ncustomBlockScreen: ", map2);
        r2.A02(r3);
    }

    public void A0D(Map map, Map map2, int i, int i2, int i3, long j, long j2) {
        if (6 - this.A01 != 0) {
            super.A0D(map, map2, i, i2, i3, j, j2);
            return;
        }
        C105935Wz r3 = (C105935Wz) this.A00;
        C998958p A012 = C106535Zj.A01(i, i2);
        if (A012 == C998958p.ERROR_UNSPECIFIED) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("WamsysRegistrationWrapper/request-code-status-standalone-unspecified; response-status ");
            A0o.append(i);
            C18260x0.A0x(" failure-reason ", A0o, i2);
        }
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("WamsysRegistrationWrapper/code-standalone: requestCodeStatus:");
        C18260x0.A1J(A0o2, A012.name());
        C108935do r2 = new C108935do(A012);
        r2.A04 = i2;
        r2.A0L = String.valueOf(j);
        r2.A0N = String.valueOf(j2);
        r2.A02 = i3;
        r2.A09 = C100545Bi.A00(map);
        r2.A08 = AnonymousClass75A.A00(map2);
        StringBuilder A0o3 = AnonymousClass001.A0o();
        A0o3.append("WamsysRegistrationWrapper/request-code-standalone/reg-block raw\n\nversionUpgrade: ");
        A0o3.append(map);
        C18260x0.A1P(A0o3, "\n\ncustomBlockScreen: ", map2);
        r3.A02(r2);
    }

    public void A06(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, Map map, Map map2, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z, boolean z2) {
        long j8 = j2;
        long j9 = j;
        int i8 = i7;
        int i9 = i6;
        int i10 = i5;
        int i11 = i4;
        String str18 = str8;
        long j10 = j6;
        String str19 = str10;
        long j11 = j7;
        String str20 = str7;
        long j12 = j4;
        String str21 = str4;
        String str22 = str9;
        long j13 = j5;
        String str23 = str6;
        String str24 = str11;
        String str25 = str13;
        boolean z3 = z2;
        String str26 = str5;
        String str27 = str3;
        String str28 = str2;
        long j14 = j3;
        String str29 = str;
        String str30 = str14;
        String str31 = str16;
        String str32 = str17;
        Map map3 = map;
        Map map4 = map2;
        int i12 = i;
        int i13 = i2;
        int i14 = i3;
        if (5 - this.A01 != 0) {
            String str33 = str29;
            String str34 = str28;
            String str35 = str27;
            String str36 = str21;
            String str37 = str26;
            String str38 = str23;
            String str39 = str20;
            String str40 = str24;
            super.A06(str33, str34, str35, str36, str37, str38, str39, str18, str22, str19, str40, str12, str25, str30, str15, str31, str32, map3, map4, i12, i13, i14, i11, i10, i9, i8, j9, j8, j14, j12, j13, j10, j11, z, z3);
            return;
        }
        C105935Wz r2 = (C105935Wz) this.A00;
        C998958p A012 = C106535Zj.A01(i12, i13);
        if (A012 == C998958p.ERROR_UNSPECIFIED) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("WamsysRegistrationWrapper/request-code-status-unspecified; response-status ");
            A0o.append(i12);
            C18260x0.A0x(" failure-reason ", A0o, i13);
        }
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("WamsysRegistrationWrapper/code-standalone: requestCodeStatus:");
        C18260x0.A1J(A0o2, A012.name());
        C108935do r1 = new C108935do(A012);
        r1.A04 = i13;
        r1.A0H = str29;
        boolean z4 = false;
        r1.A0U = AnonymousClass000.A1U(i14, 1);
        if (i11 == 1) {
            z4 = true;
        }
        r1.A0T = z4;
        r1.A0L = String.valueOf(j9);
        r1.A0D = str28;
        r1.A0J = str27;
        r1.A0N = String.valueOf(j8);
        r1.A0P = String.valueOf(j14);
        r1.A0Q = String.valueOf(j12);
        r1.A0E = String.valueOf(j13);
        r1.A0K = str21;
        r1.A0S = str26;
        r1.A0R = str23;
        r1.A05 = j10;
        r1.A02 = i10;
        r1.A0C = str20;
        r1.A0F = String.valueOf(j11);
        r1.A06 = new C108565dC(str18, str22, (String) null, str19, -1, z3);
        r1.A00 = i9;
        r1.A0B = str24;
        r1.A0G = str25;
        r1.A0A = str30;
        r1.A09 = C100545Bi.A00(map3);
        r1.A08 = AnonymousClass75A.A00(map4);
        r1.A01 = i8;
        r1.A0M = str31;
        r1.A0O = str32;
        StringBuilder A0o3 = AnonymousClass001.A0o();
        A0o3.append("WamsysRegistrationWrapper/request-code-status/reg-block raw\n\nversionUpgrade: ");
        A0o3.append(map3);
        C18260x0.A1P(A0o3, "\n\ncustomBlockScreen: ", map4);
        r2.A02(r1);
    }

    public void A07(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Map map, Map map2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, boolean z, boolean z2, boolean z3) {
        int i17;
        AnonymousClass5WM r12;
        int i18 = i16;
        int i19 = i15;
        int i20 = i14;
        int i21 = i13;
        int i22 = i12;
        int i23 = i11;
        int i24 = i10;
        int i25 = i9;
        int i26 = i6;
        Map map3 = map2;
        long j9 = j7;
        long j10 = j;
        String str12 = str;
        long j11 = j2;
        String str13 = str3;
        long j12 = j4;
        String str14 = str7;
        Map map4 = map;
        long j13 = j5;
        String str15 = str9;
        long j14 = j6;
        String str16 = str11;
        long j15 = j8;
        int i27 = i2;
        boolean z4 = z;
        int i28 = i4;
        long j16 = j3;
        String str17 = str5;
        boolean z5 = z2;
        int i29 = i5;
        boolean z6 = z3;
        String str18 = str10;
        String str19 = str8;
        String str20 = str6;
        String str21 = str4;
        String str22 = str2;
        int i30 = i;
        int i31 = i3;
        if (4 - this.A01 != 0) {
            int i32 = i30;
            int i33 = i31;
            int i34 = i28;
            int i35 = i29;
            int i36 = i26;
            boolean z7 = z5;
            String str23 = str12;
            String str24 = str22;
            String str25 = str13;
            String str26 = str21;
            String str27 = str17;
            String str28 = str20;
            String str29 = str14;
            String str30 = str18;
            super.A07(str23, str24, str25, str26, str27, str28, str29, str19, str15, str30, str16, map4, map3, i32, i27, i33, i34, i35, i36, i7, i8, i25, i24, i23, i22, i21, i20, i19, i18, j10, j11, j16, j12, j13, j14, j9, j15, z4, z7, z6);
            return;
        }
        C105935Wz r9 = (C105935Wz) this.A00;
        if (i30 != 1) {
            i17 = 0;
            if (i30 != 3) {
                i17 = -1;
                C18260x0.A0x("WamsysRegistrationWrapper/unknown-exist-status ", AnonymousClass001.A0o(), i30);
            }
        } else {
            i17 = 1;
        }
        boolean z8 = false;
        if (i17 == 1) {
            boolean A1U = AnonymousClass000.A1U(i31, 1);
            if (i28 == 1) {
                z8 = true;
            }
            r12 = new AnonymousClass5WM(str12, A1U, z8, z4);
        } else {
            C998758n A002 = C106535Zj.A00(i27);
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("WamsysRegistrationWrapper/exist: Failure reason: ");
            A0o.append(A002.name());
            A0o.append(" og reason: ");
            A0o.append(i27);
            A0o.append(" Violation type: ");
            A0o.append(str20);
            A0o.append(" Violation reason : ");
            A0o.append(str14);
            C18260x0.A0w(" Violation source : ", A0o, i24);
            r12 = new AnonymousClass5WM(A002, i17);
            r12.A0H = String.valueOf(j10);
            r12.A06 = i29;
            r12.A05 = i26;
            r12.A0J = String.valueOf(j11);
            r12.A0K = String.valueOf(j16);
            r12.A0L = String.valueOf(j12);
            r12.A0F = String.valueOf(j13);
            r12.A09 = j14;
            r12.A0G = str22;
            r12.A0N = str13;
            r12.A0M = str21;
            r12.A0A = j9;
            r12.A08 = j15;
            r12.A0O = z5;
            r12.A03 = i25;
            r12.A0P = AnonymousClass000.A1U(i23, 1);
            r12.A0B = new C108565dC(str20, str19, str14, str15, i24, z6);
            r12.A0I = str18;
            if (i20 == 1 || i20 == 2 || i20 == 3 || i20 == 4) {
                r12.A07 = i20;
            } else {
                r12.A07 = 0;
            }
            if (str5 != null) {
                r12.A0Q = Base64.decode(str17, 0);
            }
        }
        r12.A01 = i22;
        r12.A00 = i21;
        r12.A0D = C100545Bi.A00(map4);
        r12.A0C = AnonymousClass75A.A00(map3);
        r12.A02 = i19;
        r12.A0E = str16;
        r12.A04 = i18;
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("WamsysRegistrationWrapper/same-device-check/reg-block raw\n\nversionUpgrade: ");
        A0o2.append(map4);
        C18260x0.A1P(A0o2, "\n\ncustomBlockScreen: ", map3);
        r9.A02(r12);
    }
}
