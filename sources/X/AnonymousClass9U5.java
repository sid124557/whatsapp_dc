package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* renamed from: X.9U5  reason: invalid class name */
public class AnonymousClass9U5 {
    public final C69263Wi A00;
    public final C56972sr A01;
    public final C56492s4 A02;
    public final C56612sH A03;
    public final C54292oU A04;
    public final C66543Lv A05;
    public final AnonymousClass8EA A06;
    public final AnonymousClass31C A07;
    public final C1906899l A08;
    public final C49622gp A09;
    public final C40602Ha A0A;
    public final C1906999m A0B;
    public final C620933l A0C;
    public final C153087ae A0D;
    public final C1907099n A0E;
    public final AnonymousClass9U4 A0F;
    public final AnonymousClass9Th A0G;
    public final C160757oG A0H = C160757oG.A00("PaymentsActionManager", "network", "COMMON");
    public final C44942Yb A0I;
    public final C194259Se A0J;
    public final AnonymousClass35J A0K;
    public final C194639Tx A0L;
    public final C55132pq A0M;

    public AnonymousClass36K A05(C85204Fi r11, AnonymousClass39Q r12, String str) {
        C85204Fi r5 = r11;
        int B6K = A04(r11).B6K(((AnonymousClass3H6) r5).A04);
        return A06(r5, str, B6K, (long) ((int) (r12.A00.doubleValue() * ((double) B6K))));
    }

    public void A09(AnonymousClass4EY r15, C203719oC r16) {
        SharedPreferences sharedPreferences;
        ArrayList A0s = AnonymousClass001.A0s();
        C1899593h.A1S("version", A0s, 3);
        AnonymousClass39V.A03("action", "get-methods", A0s);
        C194259Se r1 = this.A0J;
        if (r1.A01() != null) {
            AnonymousClass39V.A03("device-id", r1.A01(), A0s);
        }
        AnonymousClass2LZ r7 = new AnonymousClass2LZ(new C44552Wm(C18300x5.A1Z(A0s, 0)));
        C44942Yb r2 = this.A0I;
        synchronized (r2) {
            sharedPreferences = r2.A00;
            if (sharedPreferences == null) {
                sharedPreferences = r2.A01.A03("com.whatsapp_payment_sync_preferences");
                r2.A00 = sharedPreferences;
            }
        }
        String A0Z = C18280x3.A0Z(sharedPreferences, r7.A01.A00());
        if (A0Z != null) {
            AnonymousClass39V.A03("instance-id", A0Z, A0s);
        }
        AnonymousClass36K A0U = C1899693i.A0U(C18300x5.A1Z(A0s, 0));
        C203719oC r6 = r16;
        C203499no B7b = r6.B7b();
        if (B7b != null) {
            B7b.Bq0();
        }
        AnonymousClass4EY r3 = r15;
        A0G(new C1907799u(this.A04.A00, r3, this.A0A, this, r6, r7, this.A00, A0Z), A0U, "get", 0);
    }

    public C624034w A03(AnonymousClass36K r7) {
        AnonymousClass36K A0l;
        AnonymousClass39W r0;
        AnonymousClass39S r1;
        String A0r = r7.A0r("service", (String) null);
        if (!TextUtils.isEmpty(A0r)) {
            this.A0F.A0H(A0r);
        }
        C624034w A022 = this.A0L.A02((C201629kS) null, r7);
        if (A022 == null) {
            return null;
        }
        boolean A0y = C1899693i.A0y(r7.A0r("is_p2m_hybrid", (String) null));
        if (("P2M_LITE".equals(A0r) || A0y) && (A0l = r7.A0l("order")) != null) {
            String A0r2 = A0l.A0r("message_id", (String) null);
            if (!TextUtils.isEmpty(A0r2)) {
                AnonymousClass2z0 r12 = new AnonymousClass2z0(A022.A0C, A0r2, false);
                C66543Lv r3 = this.A05;
                C30791n7 r2 = (C30791n7) r3.A2D.A05(r12);
                if (!(r2 == null || (r0 = r2.A00) == null || (r1 = r0.A01) == null)) {
                    r1.A04 = A022.A0K;
                    if (A0y && A022.A0M()) {
                        r1.A03 = "captured";
                        if (A022.A04() != null) {
                            r1.A01 = A022.A09;
                        }
                    }
                    r3.A0Y(r2);
                }
            }
        }
        return A022;
    }

    public final C203719oC A04(C85204Fi r3) {
        C161357pU A022 = this.A0D.A02();
        Objects.requireNonNull(A022);
        AnonymousClass9SU A0F2 = this.A0F.A0F(A022.A03);
        Objects.requireNonNull(A0F2);
        C203719oC A012 = A0F2.A01(((AnonymousClass3H6) r3).A04);
        Objects.requireNonNull(A012);
        return A012;
    }

    @Deprecated
    public void A08(AnonymousClass4EY r2) {
        A09(r2, this.A0F.A0G());
    }

    public void A0A(AnonymousClass4EY r11, AnonymousClass36K r12) {
        A0G(new C203899oU(this.A04.A00, this.A0A, this.A00, this, r11, 1), r12, "set", C625635p.A0L);
    }

    public void A0B(AnonymousClass4EY r11, AnonymousClass36K r12) {
        A0G(new C203899oU(this.A04.A00, this.A0A, this.A00, this, r11, 0), r12, "set", C625635p.A0L);
    }

    public void A0D(AnonymousClass4EY r18, C35441ws r19) {
        AnonymousClass31C r10 = this.A07;
        String A032 = r10.A03();
        C35351wj r6 = new C35351wj(new C35351wj(A032, 1), 3);
        C56052rL A012 = C56052rL.A01();
        C56052rL A042 = C56052rL.A04("accept_pay");
        C56052rL.A0D(A042, "version", "3");
        A042.A0G(new AnonymousClass39V("tos_version", 1));
        C41032Ir.A08(A042, r19);
        r10.A0D(new C203899oU(this.A04.A00, this.A0A, this.A00, this, r18, 4), C1899593h.A0S(A042, A012, r6), A032, 204, 0);
    }

    public void A0E(AnonymousClass4EZ r8, AnonymousClass36K r9, String str) {
        A0H(r8, r9, str, "w:pay", C625635p.A0L);
    }

    public void A0F(AnonymousClass4EZ r8, AnonymousClass36K r9, String str, long j) {
        this.A07.A0D(r8, r9, str, 204, j);
    }

    public void A0G(AnonymousClass4EZ r8, AnonymousClass36K r9, String str, long j) {
        A0H(r8, r9, str, "w:pay", j);
    }

    public void A0H(AnonymousClass4EZ r11, AnonymousClass36K r12, String str, String str2, long j) {
        AnonymousClass31C r3 = this.A07;
        String A032 = r3.A03();
        AnonymousClass39V[] r2 = new AnonymousClass39V[4];
        r2[0] = AnonymousClass39V.A00();
        AnonymousClass39V.A05(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str, r2);
        AnonymousClass39V.A06(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A032, r2);
        r3.A0D(r11, AnonymousClass36K.A0E(r12, "xmlns", str2, r2), A032, 204, j);
    }

    public void A0I(ArrayList arrayList) {
        C620933l r0;
        boolean z;
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C166587yw A0C2 = C1899693i.A0C(it);
                if ((A0C2 instanceof C133736hr) && A0C2.A01 == 2) {
                    r0 = this.A0C;
                    z = true;
                    break;
                }
            }
            C18270x1.A0l(C620933l.A00(r0), "payments_card_can_receive_payment", z);
        }
        r0 = this.A0C;
        z = false;
        C18270x1.A0l(C620933l.A00(r0), "payments_card_can_receive_payment", z);
    }

    public boolean A0K(AnonymousClass39Q r21, AnonymousClass39R r22, UserJid userJid, C624134x r24) {
        C160757oG r4;
        StringBuilder A0o;
        if (!C1899693i.A0x(this.A0E)) {
            r4 = this.A0H;
            A0o = AnonymousClass001.A0o();
            A0o.append("requestPayment is not enabled for country: ");
            A0o.append(this.A0D.A02());
        } else {
            C624134x r1 = r24;
            C95814uZ r3 = r1.A1J.A00;
            UserJid userJid2 = userJid;
            if (r3 != null && (!C627336j.A0K(r3) || userJid != null)) {
                AnonymousClass39Q r7 = r21;
                if (r21 != null) {
                    C153087ae r5 = this.A0D;
                    C161357pU A022 = r5.A02();
                    C626936e.A06(A022);
                    C85204Fi r2 = A022.A02;
                    C203719oC A042 = A04(r2);
                    String str = ((AnonymousClass3H6) r5.A01()).A04;
                    C85204Fi A012 = r5.A01();
                    String str2 = AnonymousClass35J.A01(userJid2, this.A0K).A01;
                    String str3 = r5.A02().A03;
                    C624034w A013 = AnonymousClass36S.A01(A012, r7, userJid2, (UserJid) C86634Kw.A0V(this.A01).A0H, str, str2, str3, 10, 11, C57232tJ.A00(str3), A042.BCt(), 0, -1);
                    A013.A0C(r22);
                    AnonymousClass1S4 BG4 = A042.BG4();
                    BG4.A01 = A01(r2, r7);
                    A013.A0A = BG4;
                    long A0H2 = this.A03.A0H();
                    r1.A0K = A0H2;
                    r1.A15 = "UNSET";
                    r1.A0P = A013;
                    A013.A05 = A0H2;
                    A013.A02 = 12;
                    A013.A0K = A013.A0K;
                    AnonymousClass1S4 r42 = A013.A0A;
                    this.A0F.A0G().BAl();
                    A013.A0A(r42, A0H2 + 604800000);
                    return true;
                }
            }
            r4 = this.A0H;
            A0o = AnonymousClass001.A0o();
            A0o.append("requestPayment found null or empty args jid: ");
            A0o.append(r3);
            A0o.append(" receiver: ");
            A0o.append(userJid2);
        }
        C1899593h.A1F(r4, A0o);
        return false;
    }

    public AnonymousClass9U5(C69263Wi r4, C56972sr r5, C56492s4 r6, C56612sH r7, C54292oU r8, C66543Lv r9, AnonymousClass8EA r10, AnonymousClass31C r11, C1906899l r12, C49622gp r13, C40602Ha r14, C1906999m r15, C620933l r16, C153087ae r17, C1907099n r18, AnonymousClass9U4 r19, AnonymousClass9Th r20, C44942Yb r21, C194259Se r22, AnonymousClass35J r23, C194639Tx r24, C55132pq r25) {
        this.A04 = r8;
        this.A03 = r7;
        this.A00 = r4;
        this.A01 = r5;
        this.A02 = r6;
        this.A06 = r10;
        this.A07 = r11;
        this.A0J = r22;
        this.A0F = r19;
        this.A05 = r9;
        this.A0M = r25;
        this.A0K = r23;
        this.A0C = r16;
        this.A08 = r12;
        this.A0I = r21;
        this.A0L = r24;
        this.A0E = r18;
        this.A0D = r17;
        this.A09 = r13;
        this.A0G = r20;
        this.A0A = r14;
        this.A0B = r15;
    }

    public AnonymousClass39L A00(C85204Fi r6, AnonymousClass39Q r7) {
        int B6K = A04(r6).B6K(((AnonymousClass3H6) r6).A04);
        int doubleValue = (int) (r7.A00.doubleValue() * ((double) B6K));
        C60042xu r2 = new C60042xu();
        r2.A02 = r6;
        r2.A00 = B6K;
        r2.A01 = (long) doubleValue;
        return r2.A01();
    }

    public final AnonymousClass39L A01(C85204Fi r7, AnonymousClass39Q r8) {
        int i;
        C203719oC A042 = A04(r7);
        if (A042 != null) {
            i = A042.B6K(((AnonymousClass3H6) r7).A04);
        } else {
            i = 1000;
        }
        C60042xu r4 = new C60042xu();
        r4.A01 = (long) ((int) (r8.A00.doubleValue() * ((double) i)));
        r4.A00 = i;
        r4.A02 = r7;
        return r4.A01();
    }

    public C624034w A02(C85204Fi r5, AnonymousClass39Q r6, C166587yw r7, AnonymousClass1S4 r8, AnonymousClass39R r9, C624134x r10, String str, String str2, boolean z) {
        if (!A0J(r5, r6, r7, r8, r9, r10, str, str2, z)) {
            return null;
        }
        this.A05.A08(r10);
        C49622gp r3 = this.A09;
        String str3 = r10.A1J.A01;
        C624034w r1 = r10.A0P;
        synchronized (r3) {
            if (r1 != null) {
                r3.A03.put(str3, r1);
            }
        }
        this.A0G.A00(r9, r10);
        C624034w r0 = r10.A0P;
        C626936e.A06(r0);
        return r0;
    }

    public AnonymousClass36K A06(C85204Fi r4, String str, int i, long j) {
        AnonymousClass36K r1;
        C203719oC A042 = A04(r4);
        C60042xu r0 = new C60042xu();
        r0.A02 = r4;
        r0.A00 = i;
        r0.A01 = j;
        AnonymousClass39L A012 = r0.A01();
        if (A042 != null) {
            r1 = A042.B9q(A012);
        } else {
            r1 = null;
        }
        return new AnonymousClass36K(r1, str, (AnonymousClass39V[]) null);
    }

    public void A07(C202439m1 r10, AnonymousClass36K r11, boolean z) {
        ArrayList A052 = this.A0L.A05(C1899693i.A0T(r11));
        C202439m1 r4 = r10;
        if (A052 == null || A052.isEmpty()) {
            C194569Tl A002 = AnonymousClass9U4.A00(this.A0F);
            C626936e.A06(A002);
            AnonymousClass4FS r8 = A002.A03;
            C18270x1.A0w(new AnonymousClass997(r4, A002, A002.A01, A002.A02, r8), r8);
        } else if (AnonymousClass8EA.A04(A052)) {
            C194569Tl A003 = AnonymousClass9U4.A00(this.A0F);
            C626936e.A06(A003);
            A003.A05(r10, A052);
        } else if (z) {
            A08((AnonymousClass4EY) null);
            return;
        } else {
            return;
        }
        A0I(A052);
        this.A0C.A0E();
    }

    public void A0C(AnonymousClass4EY r4, AnonymousClass36K r5, String str, String str2) {
        AnonymousClass36K r0;
        if (TextUtils.isEmpty(str2)) {
            str2 = AnonymousClass35J.A02(this.A01, this.A03);
        }
        AnonymousClass39V[] r2 = new AnonymousClass39V[4];
        AnonymousClass39V.A04("action", "remove-credential", r2);
        AnonymousClass39V.A05("credential-id", str, r2);
        AnonymousClass39V.A06("version", "2", r2);
        AnonymousClass39V.A07("nonce", str2, r2);
        if (r5 == null) {
            r0 = AnonymousClass36K.A0I("account", r2);
        } else {
            r0 = new AnonymousClass36K(r5, "account", r2);
        }
        A0A(r4, r0);
    }

    public boolean A0J(C85204Fi r34, AnonymousClass39Q r35, C166587yw r36, AnonymousClass1S4 r37, AnonymousClass39R r38, C624134x r39, String str, String str2, boolean z) {
        C160757oG r2;
        StringBuilder A0o;
        boolean A0K2;
        int i;
        char c;
        String str3;
        C166587yw r14;
        String str4;
        C166587yw r0 = r36;
        AnonymousClass1RR A0V = C86634Kw.A0V(this.A01);
        ArrayList arrayList = null;
        if (!C1899693i.A0x(this.A0E)) {
            r2 = this.A0H;
            A0o = AnonymousClass001.A0o();
            A0o.append("sendPayment is not enabled for country: ");
            A0o.append(this.A0D.A02());
        } else {
            C624134x r6 = r39;
            C95814uZ r10 = r6.A1J.A00;
            if (r10 == null || ((A0K2 = C627336j.A0K(r10)) && r6.A0n() == null)) {
                r2 = this.A0H;
                A0o = AnonymousClass001.A0o();
                A0o.append("sendPayment found null or empty args jid: ");
                A0o.append(r10);
                A0o.append(" receiver: ");
                A0o.append(r6.A0n());
                A0o.append(" payment methods: ");
            } else {
                AnonymousClass39Q r1 = r35;
                if (!r1.A02()) {
                    this.A0H.A06("sendPayment not sending payment; got invalid amount");
                    return false;
                }
                C85204Fi r9 = r34;
                C203719oC A042 = A04(r9);
                AnonymousClass39L A012 = A01(r9, r1);
                AnonymousClass1S4 r32 = r37;
                C626936e.A06(r32);
                AnonymousClass1S4 r22 = r32;
                r22.A01 = A012;
                if (r22.A02 != null) {
                    i = 2;
                } else {
                    i = AnonymousClass000.A1S(z ? 1 : 0);
                }
                try {
                    C160757oG r3 = this.A0H;
                    r3.A06("sendPayment building payment to send amount");
                    UserJid userJid = (UserJid) A0V.A0H;
                    if (A0K2) {
                        r10 = r6.A0n();
                    }
                    UserJid A032 = AnonymousClass32Y.A03(r10);
                    String str5 = ((AnonymousClass1S3) r9).A04;
                    C153087ae r31 = this.A0D;
                    C161357pU A022 = r31.A02();
                    C626936e.A06(A022);
                    String str6 = A022.A03;
                    int BCt = A042.BCt();
                    int i2 = 1;
                    if (z) {
                        i2 = 100;
                    }
                    C624034w A013 = AnonymousClass36S.A01(r9, r1, userJid, A032, str5, (String) null, str6, i2, 401, C57232tJ.A00(str6), BCt, i, -1);
                    A013.A0C(r38);
                    AnonymousClass8EA r17 = this.A06;
                    List A0B2 = r17.A0B();
                    if (A0B2.size() <= 0) {
                        C1899593h.A1H(r3, A0B2, "sendPayment not sending payment; got no methods: ", AnonymousClass001.A0o());
                        c = 7;
                    } else {
                        Iterator it = r17.A0B().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                r14 = null;
                                break;
                            }
                            r14 = C1899693i.A0C(it);
                            if (r14.A01 == 1) {
                                break;
                            }
                        }
                        if (r14 != null && !TextUtils.isEmpty(r14.A0A)) {
                            int A082 = r14.A08();
                            if (A082 != r31.A02().A00) {
                                StringBuilder A0o2 = AnonymousClass001.A0o();
                                A0o2.append("sendPayment not sending payment; primary methods type ");
                                A0o2.append(A082);
                                A0o2.append(" does not match primary account type for country: ");
                                C1899593h.A1K(r3, A0o2, r31.A02().A00);
                                c = 3;
                            } else if (A082 != 3) {
                                StringBuilder A0o3 = AnonymousClass001.A0o();
                                A0o3.append("sendPayment not sending payment; primary method type unsupported: ");
                                C1899593h.A1K(r3, A0o3, A082);
                                c = 6;
                            } else {
                                C133716hp r142 = (C133716hp) r14;
                                AnonymousClass39Q r8 = r142.A01;
                                if (r8 == null || !r8.A02()) {
                                    C1899593h.A1H(r3, r8, "sendPayment not sending payment; got invalid balance: ", AnonymousClass001.A0o());
                                    c = 5;
                                } else {
                                    ArrayList A0I2 = AnonymousClass002.A0I(2);
                                    BigDecimal bigDecimal = r8.A00;
                                    BigDecimal bigDecimal2 = r1.A00;
                                    if (bigDecimal.compareTo(bigDecimal2) >= 0) {
                                        A0I2.add(new C42392Nx(r1, r142, 1));
                                    } else {
                                        BigDecimal bigDecimal3 = BigDecimal.ZERO;
                                        if (bigDecimal.compareTo(bigDecimal3) > 0) {
                                            A0I2.add(new C42392Nx(r8, r142, 1));
                                        }
                                        BigDecimal subtract = bigDecimal2.subtract(bigDecimal);
                                        if (subtract.compareTo(bigDecimal3) > 0) {
                                            if (!(r36 == null && (r0 = r17.A06()) == null) && !TextUtils.isEmpty(r0.A0A)) {
                                                C161357pU A023 = r31.A02();
                                                if (AnonymousClass367.A05(A023.A09, r0.A08())) {
                                                    A0I2.add(new C42392Nx(new AnonymousClass39Q(subtract, bigDecimal2.scale()), r0, 1));
                                                }
                                            }
                                            str4 = AnonymousClass000.A0P(r8, "sendPayment not sending payment; got invalid secondary methods with insufficient balance: ", AnonymousClass001.A0o());
                                        }
                                    }
                                    if (A0I2.size() <= 0) {
                                        r3.A06("sendPayment found 0 sources");
                                        c = 11;
                                    } else {
                                        c = 0;
                                        arrayList = A0I2;
                                        StringBuilder A0o4 = AnonymousClass001.A0o();
                                        A0o4.append("findSourcesForTransfer returning sources: ");
                                        A0o4.append(A0I2);
                                        C1899593h.A1J(r3, " for amount", A0o4);
                                    }
                                }
                            }
                        } else if (r31.A02().A08) {
                            if (!(r36 == null && (r0 = r17.A06()) == null) && !TextUtils.isEmpty(r0.A0A)) {
                                C161357pU A024 = r31.A02();
                                if (AnonymousClass367.A05(A024.A09, r0.A08())) {
                                    arrayList = AnonymousClass002.A0I(1);
                                    arrayList.add(new C42392Nx(r1, r0, 1));
                                    c = 0;
                                    StringBuilder A0o5 = AnonymousClass001.A0o();
                                    A0o5.append("PAY PaymentsActionManager:findSourcesForTransfer found no legacy primary but found primary: ");
                                    A0o5.append(arrayList);
                                    C18260x0.A1L(A0o5, " for amount");
                                }
                            }
                            str4 = "sendPayment not sending payment; got invalid primary methods and no legacy primary methods";
                        } else {
                            C1899593h.A1H(r3, r14, "sendPayment not sending payment; got null primary methods or empty credential id: ", AnonymousClass001.A0o());
                            c = 4;
                        }
                        r3.A06(str4);
                        c = 9;
                    }
                    A013.A0M = str;
                    A013.A0K = str2;
                    A013.A06 = r32.A0A();
                    if (c == 0) {
                        A013.A0E(arrayList);
                        A013.A0A = r32;
                        if (A013.A0N.size() == 1) {
                            r6.A1J((C95814uZ) null);
                            A013.A0H = ((C42392Nx) A013.A0N.get(0)).A01.A0A;
                            long A0H2 = this.A03.A0H();
                            r6.A0K = A0H2;
                            r6.A0P = A013;
                            A013.A05 = A0H2;
                            if (AnonymousClass36S.A07(A013.A0K)) {
                                str3 = A013.A0K;
                            } else {
                                str3 = "UNSET";
                            }
                            r6.A15 = str3;
                            return true;
                        }
                        r3.A06("PaymentsActionManager sendPayment could not send. no correct sources found.");
                        return false;
                    }
                    return false;
                } catch (Exception e) {
                    this.A0H.A0A("sendPayment blew up creating transaction info: ", e);
                    return false;
                }
            }
        }
        C1899593h.A1F(r2, A0o);
        return false;
    }
}
