package X;

import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.9Am  reason: invalid class name and case insensitive filesystem */
public class C190959Am extends C197119cb {
    public final C116985rC A00;
    public final C111095hX A01;
    public final C69263Wi A02;
    public final C56972sr A03;
    public final C66663Mh A04;
    public final C56492s4 A05;
    public final C50382i5 A06;
    public final C620633i A07;
    public final C56612sH A08;
    public final AnonymousClass33p A09;
    public final C620733j A0A;
    public final AnonymousClass1VX A0B;
    public final AnonymousClass9bR A0C;
    public final C195069Vt A0D;
    public final AnonymousClass9O7 A0E;
    public final C196679bZ A0F;
    public final C29251iW A0G;
    public final C1906899l A0H;
    public final C1906999m A0I;
    public final C85134Fb A0J;
    public final C620933l A0K;
    public final AnonymousClass9WM A0L;
    public final C1907099n A0M;
    public final C203499no A0N;
    public final AnonymousClass9SD A0O;
    public final C194969Vi A0P;
    public final C192679Ld A0Q;
    public final AnonymousClass9TJ A0R;
    public final C196689ba A0S;
    public final C194649Ty A0T;
    public final AnonymousClass9W1 A0U;
    public final C195219Wq A0V;
    public final AnonymousClass35J A0W;

    public C42902Py BE8(C133676hl r8, UserJid userJid, String str) {
        boolean z;
        int A062;
        Object obj;
        AnonymousClass3ZH A072;
        AnonymousClass9PG r5 = new AnonymousClass9PG(userJid);
        AnonymousClass1VX r6 = this.A0B;
        boolean z2 = false;
        if (!r6.A0X(1545) || r8 == null || TextUtils.isEmpty(r8.A06)) {
            z = false;
        } else {
            r5.A00 = AnonymousClass0x9.A0C(true, r8.A06);
            z = true;
        }
        C194969Vi r2 = this.A0P;
        if (r2.A0A() && r6.A0X(888)) {
            C1907099n r0 = this.A0M;
            if (userJid != null) {
                A062 = r0.A05(userJid);
            } else {
                A062 = r0.A06(str);
            }
            if (A062 == 2 && (userJid == null || ((A072 = r2.A03.A07(userJid)) != null && A072.A0Q()))) {
                z2 = true;
                if (r8 != null) {
                    C156107g2 r02 = r8.A03;
                    if (r02 == null) {
                        r02 = new C156107g2();
                        r8.A03 = r02;
                    }
                    obj = AnonymousClass001.A0i(r02.A01, 1);
                } else {
                    obj = "";
                }
                AnonymousClass0x2.A1H(obj, r5.A03, 3);
            }
        }
        if (!z && !z2) {
            return null;
        }
        return new C42902Py(r5.A00, r5.A01, r5.A02, r5.A03);
    }

    public List BAe(C624034w r11, AnonymousClass2z0 r12) {
        String str;
        String str2;
        C160757oG r1;
        String str3;
        AnonymousClass99I r0;
        List BAe = super.BAe(r11, r12);
        if (BAe == null) {
            BAe = AnonymousClass001.A0s();
        }
        AnonymousClass1S4 r02 = r11.A0A;
        if (r02 != null) {
            AnonymousClass39U r03 = r02.A02;
            if (r03 != null) {
                BAe.add(AnonymousClass36K.A0I("order", (AnonymousClass39V[]) r03.A00().toArray(new AnonymousClass39V[0])));
            }
            C195319Xg A0D2 = r11.A0A.A0D();
            if (A0D2 != null) {
                BAe.add(A0D2.A00());
            }
        }
        String str4 = r11.A0H;
        if (str4 != null) {
            AnonymousClass9SD r5 = this.A0O;
            AnonymousClass8EA r3 = r5.A09;
            C133736hr r04 = (C133736hr) r3.A08(str4);
            if (r04 != null && r04.A01 == 5) {
                AnonymousClass9Q0 r05 = r5.A00;
                if (r05 == null) {
                    r1 = r5.A01;
                    str3 = "local elo cache is null";
                } else {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    String str5 = r05.A02;
                    r05.A02 = null;
                    A0o.append(str5);
                    A0o.append(r5.A0H.A00(5));
                    A0o.append(r5.A0E.A08());
                    String str6 = r5.A00.A03;
                    if (str6 == null) {
                        r1 = r5.A01;
                        str3 = "credentialId is null";
                    } else {
                        C166587yw A082 = r3.A08(str6);
                        if (A082 == null || (r0 = (AnonymousClass99I) A082.A08) == null) {
                            str = null;
                        } else {
                            str = r0.A06;
                        }
                        A0o.append(str);
                        C626936e.A06(r5.A00.A01);
                        A0o.append(new DecimalFormat("0.00").format(((double) r5.A00.A01.A00()) / ((double) r5.A00.A01.A00)));
                        AnonymousClass9Q0 r13 = r5.A00;
                        A0o.append(((AnonymousClass3H6) r13.A01.A01).A04);
                        C626936e.A06(r13.A05);
                        String str7 = r5.A00.A05;
                        int hashCode = str7.hashCode();
                        if (hashCode != -1540055076) {
                            if (hashCode == -1375934236 && str7.equals("fingerprint")) {
                                str2 = "42";
                            }
                            str2 = "48";
                        } else {
                            if (str7.equals("payment_pin")) {
                                str2 = "44";
                            }
                            str2 = "48";
                        }
                        String A0X = AnonymousClass000.A0X(str2, A0o);
                        C194929Vc r06 = r5.A0C;
                        String A052 = r06.A05(A0X);
                        String A062 = r06.A06(A0X);
                        ArrayList A0s = AnonymousClass001.A0s();
                        if (A052 != null) {
                            AnonymousClass39V.A03("device_signature", A052, A0s);
                            if (A062 != null) {
                                AnonymousClass39V.A03("wallet_signature", A062, A0s);
                                if (str5 != null) {
                                    AnonymousClass39V.A03("challenge_id", str5, A0s);
                                    AnonymousClass39V.A03("cardholder_verification_method", str2, A0s);
                                    r5.A00 = null;
                                    r5.A03 = false;
                                    r5.A02 = false;
                                    BAe.add(AnonymousClass36K.A0I("elo", C18300x5.A1Z(A0s, 0)));
                                    return BAe;
                                }
                            } else {
                                r1 = r5.A01;
                                str3 = "wallet_signature is null";
                            }
                        } else {
                            r1 = r5.A01;
                            str3 = "device_signature is null";
                        }
                    }
                }
                r1.A05(str3);
            }
        }
        return BAe;
    }

    public int BCt() {
        return 2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C190959Am(X.C116985rC r10, X.C111095hX r11, X.C69263Wi r12, X.C56972sr r13, X.C66663Mh r14, X.C56492s4 r15, X.C50382i5 r16, X.C64773Ex r17, X.AnonymousClass5ZU r18, X.C620633i r19, X.C56612sH r20, X.C54292oU r21, X.AnonymousClass33p r22, X.C620733j r23, X.AnonymousClass1VX r24, X.AnonymousClass9bR r25, X.C195069Vt r26, X.AnonymousClass9O7 r27, X.C196679bZ r28, X.C29251iW r29, X.C1906899l r30, X.C1906999m r31, X.C85134Fb r32, X.C620933l r33, X.AnonymousClass9WM r34, X.C1907099n r35, X.AnonymousClass9U4 r36, X.C197099cZ r37, X.AnonymousClass9SD r38, X.C194969Vi r39, X.C192679Ld r40, X.AnonymousClass9TJ r41, X.C196689ba r42, X.C194649Ty r43, X.AnonymousClass9W1 r44, X.C195219Wq r45, X.AnonymousClass35J r46) {
        /*
            r9 = this;
            java.lang.String r8 = "FBPAY"
            r1 = r9
            r7 = r45
            r3 = r18
            r4 = r19
            r5 = r21
            r2 = r17
            r6 = r36
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r0 = r20
            r9.A08 = r0
            r0 = r16
            r9.A06 = r0
            r0 = r24
            r9.A0B = r0
            r9.A02 = r12
            r9.A03 = r13
            r9.A05 = r15
            r9.A04 = r14
            r9.A01 = r11
            r9.A0V = r7
            r9.A00 = r10
            r9.A07 = r4
            r0 = r23
            r9.A0A = r0
            r0 = r46
            r9.A0W = r0
            r0 = r33
            r9.A0K = r0
            r0 = r25
            r9.A0C = r0
            r0 = r30
            r9.A0H = r0
            r0 = r22
            r9.A09 = r0
            r0 = r38
            r9.A0O = r0
            r0 = r41
            r9.A0R = r0
            r0 = r42
            r9.A0S = r0
            r0 = r35
            r9.A0M = r0
            r0 = r26
            r9.A0D = r0
            r0 = r40
            r9.A0Q = r0
            r0 = r39
            r9.A0P = r0
            r0 = r28
            r9.A0F = r0
            r0 = r29
            r9.A0G = r0
            r0 = r37
            r9.A0N = r0
            r0 = r32
            r9.A0J = r0
            r0 = r27
            r9.A0E = r0
            r0 = r44
            r9.A0U = r0
            r0 = r31
            r9.A0I = r0
            r0 = r43
            r9.A0T = r0
            r0 = r34
            r9.A0L = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C190959Am.<init>(X.5rC, X.5hX, X.3Wi, X.2sr, X.3Mh, X.2s4, X.2i5, X.3Ex, X.5ZU, X.33i, X.2sH, X.2oU, X.33p, X.33j, X.1VX, X.9bR, X.9Vt, X.9O7, X.9bZ, X.1iW, X.99l, X.99m, X.4Fb, X.33l, X.9WM, X.99n, X.9U4, X.9cZ, X.9SD, X.9Vi, X.9Ld, X.9TJ, X.9ba, X.9Ty, X.9W1, X.9Wq, X.35J):void");
    }
}
