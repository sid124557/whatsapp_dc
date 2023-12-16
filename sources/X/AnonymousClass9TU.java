package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.math.BigDecimal;

/* renamed from: X.9TU  reason: invalid class name */
public final class AnonymousClass9TU {
    public final C56972sr A00;
    public final C617332a A01;
    public final AnonymousClass1VX A02;
    public final C183538qC A03;

    public C624134x A00(C55962rC r24) {
        String str;
        int i;
        C624034w r1;
        AnonymousClass39L r4;
        C60042xu r6;
        int i2;
        C55962rC r7 = r24;
        C21781Dd r12 = r7.A0B.requestPaymentMessage_;
        if (r12 == null) {
            r12 = C21781Dd.DEFAULT_INSTANCE;
        }
        C624034w r0 = r7.A07;
        if ((r12.bitField0_ & 1) == 0) {
            return new C30481mW(r7.A0D, r7.A05);
        }
        AnonymousClass1EU r2 = r12.noteMessage_;
        if (r2 == null) {
            r2 = AnonymousClass1EU.DEFAULT_INSTANCE;
        }
        C624134x A022 = A02(r7, r2);
        C617332a r62 = this.A01;
        C85204Fi A012 = r62.A01(r12.currencyCodeIso4217_);
        UserJid A08 = AnonymousClass32Y.A08(r12.requestFrom_);
        AnonymousClass39Q A082 = C1899593h.A08(A012, new BigDecimal(r12.amount1000_).scaleByPowerOfTen(-3));
        if (r0 != null) {
            str = r0.A0G;
        } else {
            str = "UNSET";
        }
        C95814uZ r3 = A022.A1J.A00;
        boolean A0K = C627336j.A0K(r3);
        if (A0K) {
            r3 = r7.A08;
        }
        UserJid A05 = AnonymousClass32Y.A05(r3);
        if (r0 != null) {
            i = r0.A01;
        } else {
            i = 0;
        }
        if (A05 != null) {
            if (r0 == null || r0.A03 != 5) {
                C56972sr r32 = this.A00;
                if (!A0K) {
                    A08 = (UserJid) C86634Kw.A0V(r32).A0H;
                } else if (!r32.A0a(A08)) {
                    A022.A0P = AnonymousClass36S.A01(A012, A082, A08, A05, r12.currencyCodeIso4217_, (String) null, str, 30, 0, C57232tJ.A00(str), i, 0, A022.A0K);
                    A022.A15 = "UNSET";
                }
                C626936e.A06(A08);
                C624034w A013 = AnonymousClass36S.A01(A012, A082, A08, A05, r12.currencyCodeIso4217_, (String) null, str, 20, 12, C57232tJ.A00(str), i, 0, A022.A0K);
                A022.A0P = A013;
                if (r0 != null && r0.A03 == 20) {
                    A013.A0K = r0.A0K;
                    A013.A0A = r0.A0A;
                    int i3 = r12.bitField0_;
                    if ((i3 & 32) != 0) {
                        AnonymousClass1CI r72 = r12.amount_;
                        if (r72 == null) {
                            r72 = AnonymousClass1CI.DEFAULT_INSTANCE;
                        }
                        A012 = r62.A01(r72.currencyCode_);
                        r6 = new C60042xu();
                        r6.A01 = r72.value_;
                        i2 = r72.offset_;
                    } else if ((i3 & 4) != 0) {
                        r6 = new C60042xu();
                        r6.A01 = r12.amount1000_;
                        i2 = 1000;
                    } else {
                        r4 = null;
                        Log.e("PAY: MessageUtils/buildFMessage paymentMoney is NULL.");
                        A022.A0P.A0A.A01 = r4;
                    }
                    r6.A00 = i2;
                    r6.A02 = A012;
                    r4 = r6.A01();
                    A022.A0P.A0A.A01 = r4;
                }
            } else {
                if (!A0K) {
                    A08 = (UserJid) C86634Kw.A0V(this.A00).A0H;
                }
                C626936e.A06(A08);
                String str2 = r12.currencyCodeIso4217_;
                long j = A022.A0K;
                String str3 = r0.A0G;
                int i4 = r0.A04;
                byte[] bArr = r0.A0R;
                C624034w A014 = AnonymousClass36S.A01(A012, A082, A08, A05, str2, (String) null, str3, 5, 0, i4, r0.A01, 0, j);
                A014.A0R = bArr;
                A022.A0P = A014;
            }
        }
        if ((r12.bitField0_ & 64) != 0) {
            C21931Ds r42 = r12.background_;
            if (r42 == null) {
                r42 = C21931Ds.DEFAULT_INSTANCE;
            }
            AnonymousClass39R A002 = AnonymousClass39R.A00(r42, this.A02.A0X(1084));
            if (r0 != null) {
                r0.A0C(A002);
            }
            C624034w r13 = A022.A0P;
            if (r13 != null) {
                r13.A0C(A002);
            }
        }
        if (!(r0 == null || (r1 = A022.A0P) == null)) {
            r0.A0B(r1);
        }
        return A022;
    }

    public C624134x A01(C55962rC r7) {
        AnonymousClass1CH r5 = r7.A0B.sendPaymentMessage_;
        if (r5 == null) {
            r5 = AnonymousClass1CH.DEFAULT_INSTANCE;
        }
        if ((r5.bitField0_ & 1) == 0) {
            return new C30481mW(r7.A0D, r7.A05);
        }
        AnonymousClass1EU r0 = r5.noteMessage_;
        if (r0 == null) {
            r0 = AnonymousClass1EU.DEFAULT_INSTANCE;
        }
        C624134x A022 = A02(r7, r0);
        C624034w r4 = A022.A0P;
        if (r4 == null) {
            if (r7.A0O) {
                A022.A15 = "UNSET";
                return A022;
            }
            r4 = AnonymousClass36S.A00(A022.A0K);
            A022.A0P = r4;
        }
        int i = r5.bitField0_;
        if ((i & 2) != 0) {
            AnonymousClass1ET r02 = r5.requestMessageKey_;
            if (r02 == null) {
                r02 = AnonymousClass1ET.DEFAULT_INSTANCE;
            }
            String str = r02.id_;
            r4.A0M = str;
            C624034w r03 = r7.A07;
            if (r03 != null) {
                r03.A0M = str;
            }
        }
        if ((i & 4) != 0) {
            C21931Ds r2 = r5.background_;
            if (r2 == null) {
                r2 = C21931Ds.DEFAULT_INSTANCE;
            }
            AnonymousClass39R A002 = AnonymousClass39R.A00(r2, this.A02.A0X(1084));
            A022.A0P.A0C(A002);
            C624034w r04 = r7.A07;
            if (r04 != null) {
                r04.A0C(A002);
                return A022;
            }
        }
        return A022;
    }

    public AnonymousClass9TU(C56972sr r1, C617332a r2, AnonymousClass1VX r3, C183538qC r4) {
        this.A02 = r3;
        this.A00 = r1;
        this.A03 = r4;
        this.A01 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001f, code lost:
        if (r1.A0X(811) == false) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C624134x A02(X.C55962rC r4, X.AnonymousClass1EU r5) {
        /*
            r3 = this;
            X.2rC r2 = r4.A02(r5)
            int r1 = r5.bitField0_
            r0 = 2097152(0x200000, float:2.938736E-39)
            r1 = r1 & r0
            boolean r0 = X.AnonymousClass000.A1S(r1)
            if (r0 == 0) goto L_0x002e
            X.1VX r1 = r3.A02
            r0 = 812(0x32c, float:1.138E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 != 0) goto L_0x0021
            r0 = 811(0x32b, float:1.136E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x002e
        L_0x0021:
            X.8qC r0 = r3.A03
            java.lang.Object r0 = r0.get()
            X.3Le r0 = (X.C66383Le) r0
            X.34x r0 = r0.A00(r2)
            return r0
        L_0x002e:
            int r0 = r5.bitField0_
            r0 = r0 & 32
            if (r0 != 0) goto L_0x0021
            r0 = 0
            X.1mJ r0 = r2.A03(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9TU.A02(X.2rC, X.1EU):X.34x");
    }

    public void A03(C624034w r14, C55032pg r15, C202659mN r16, C624134x r17) {
        AnonymousClass1EU r2;
        int i;
        int i2;
        AnonymousClass39L r8;
        long A0B;
        int i3;
        C202659mN r4 = r16;
        C624134x r3 = r17;
        if (r14.A0L()) {
            AnonymousClass39Q r0 = r14.A08;
            C626936e.A06(r0);
            long A022 = C1899693i.A02(r0);
            String str = r14.A0I;
            AnonymousClass1S4 r5 = r14.A0A;
            if (r5 == null) {
                r8 = null;
                A0B = 0;
            } else {
                r8 = r5.A01;
                A0B = r5.A0B();
            }
            UserJid userJid = r14.A0E;
            AnonymousClass39R A05 = r14.A05();
            AnonymousClass1A4 r6 = r15.A00;
            C21781Dd r52 = ((AnonymousClass1EU) r6.A00).requestPaymentMessage_;
            if (r52 == null) {
                r52 = C21781Dd.DEFAULT_INSTANCE;
            }
            C130546c9 A0H = r52.A0H();
            AnonymousClass1A4 B0Q = r4.B0Q(r15, r3);
            if (B0Q != null) {
                C21781Dd r42 = (C21781Dd) C18320x8.A0C(A0H);
                AnonymousClass1EU r32 = (AnonymousClass1EU) B0Q.A06();
                r32.getClass();
                r42.noteMessage_ = r32;
                r42.bitField0_ |= 1;
            }
            C21781Dd r43 = (C21781Dd) C18320x8.A0C(A0H);
            r43.bitField0_ |= 4;
            r43.amount1000_ = A022;
            C21781Dd r44 = (C21781Dd) C18320x8.A0C(A0H);
            str.getClass();
            r44.bitField0_ |= 2;
            r44.currencyCodeIso4217_ = str;
            AnonymousClass1CI r33 = ((C21781Dd) A0H.A00).amount_;
            if (r33 == null) {
                r33 = AnonymousClass1CI.DEFAULT_INSTANCE;
            }
            C130546c9 A0H2 = r33.A0H();
            if (r8 != null) {
                A022 = (long) r8.A00();
            }
            AnonymousClass1CI r45 = (AnonymousClass1CI) C18320x8.A0C(A0H2);
            r45.bitField0_ |= 1;
            r45.value_ = A022;
            if (r8 != null) {
                i3 = r8.A00;
            } else {
                i3 = 1000;
            }
            AnonymousClass1CI r1 = (AnonymousClass1CI) C18320x8.A0C(A0H2);
            r1.bitField0_ |= 2;
            r1.offset_ = i3;
            if (r8 != null) {
                str = ((AnonymousClass3H6) r8.A01).A04;
            }
            AnonymousClass1CI r12 = (AnonymousClass1CI) C18320x8.A0C(A0H2);
            str.getClass();
            r12.bitField0_ |= 4;
            r12.currencyCode_ = str;
            AnonymousClass1CI r02 = (AnonymousClass1CI) A0H2.A06();
            C21781Dd r13 = (C21781Dd) C18320x8.A0C(A0H);
            r02.getClass();
            r13.amount_ = r02;
            r13.bitField0_ |= 32;
            long A0B2 = C18290x4.A0B(A0B);
            C21781Dd r18 = (C21781Dd) C18320x8.A0C(A0H);
            r18.bitField0_ |= 16;
            r18.expiryTimestamp_ = A0B2;
            if (userJid != null) {
                String rawString = userJid.getRawString();
                C21781Dd r19 = (C21781Dd) C18320x8.A0C(A0H);
                rawString.getClass();
                r19.bitField0_ |= 8;
                r19.requestFrom_ = rawString;
            }
            if (A05 != null) {
                C21931Ds A012 = A05.A01();
                C21781Dd r110 = (C21781Dd) C18320x8.A0C(A0H);
                A012.getClass();
                r110.background_ = A012;
                r110.bitField0_ |= 64;
            }
            r2 = (AnonymousClass1EU) C18320x8.A0C(r6);
            C21781Dd r03 = (C21781Dd) A0H.A06();
            r03.getClass();
            r2.requestPaymentMessage_ = r03;
            i = r2.bitField0_;
            i2 = AnonymousClass35S.A0F;
        } else {
            String str2 = r14.A0M;
            UserJid userJid2 = r14.A0D;
            AnonymousClass39R A052 = r14.A05();
            AnonymousClass1A4 r22 = r15.A00;
            AnonymousClass1CH r04 = ((AnonymousClass1EU) r22.A00).sendPaymentMessage_;
            if (r04 == null) {
                r04 = AnonymousClass1CH.DEFAULT_INSTANCE;
            }
            C130546c9 A0H3 = r04.A0H();
            if (str2 != null) {
                AnonymousClass1A1 r53 = (AnonymousClass1A1) AnonymousClass1ET.DEFAULT_INSTANCE.A0G();
                r53.A0A(str2);
                r53.A0D(false);
                C95814uZ r111 = r3.A1J.A00;
                if (C627336j.A0K(r111) && userJid2 != null) {
                    r53.A0B(userJid2.getRawString());
                }
                r53.A0C(C627336j.A07(r111));
                AnonymousClass1ET r05 = (AnonymousClass1ET) r53.A06();
                AnonymousClass1CH r112 = (AnonymousClass1CH) C18320x8.A0C(A0H3);
                r05.getClass();
                r112.requestMessageKey_ = r05;
                r112.bitField0_ |= 2;
            }
            if (A052 != null) {
                C21931Ds A013 = A052.A01();
                AnonymousClass1CH r113 = (AnonymousClass1CH) C18320x8.A0C(A0H3);
                A013.getClass();
                r113.background_ = A013;
                r113.bitField0_ |= 4;
            }
            AnonymousClass1A4 B0Q2 = r4.B0Q(r15, r3);
            if (B0Q2 != null) {
                AnonymousClass1CH r114 = (AnonymousClass1CH) C18320x8.A0C(A0H3);
                AnonymousClass1EU r06 = (AnonymousClass1EU) B0Q2.A06();
                r06.getClass();
                r114.noteMessage_ = r06;
                r114.bitField0_ |= 1;
            }
            r2 = (AnonymousClass1EU) C18320x8.A0C(r22);
            AnonymousClass1CH r07 = (AnonymousClass1CH) A0H3.A06();
            r07.getClass();
            r2.sendPaymentMessage_ = r07;
            i = r2.bitField0_;
            i2 = 32768;
        }
        r2.bitField0_ = i | i2;
    }
}
