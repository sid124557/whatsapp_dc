package com.whatsapp.payments.ui;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass043;
import X.AnonymousClass0x9;
import X.AnonymousClass1RR;
import X.AnonymousClass2CX;
import X.AnonymousClass31C;
import X.AnonymousClass34V;
import X.AnonymousClass36K;
import X.AnonymousClass38V;
import X.AnonymousClass39L;
import X.AnonymousClass39V;
import X.AnonymousClass3H6;
import X.AnonymousClass5V0;
import X.AnonymousClass8EA;
import X.AnonymousClass97T;
import X.AnonymousClass99H;
import X.AnonymousClass99L;
import X.AnonymousClass9AG;
import X.AnonymousClass9AO;
import X.AnonymousClass9AP;
import X.AnonymousClass9AT;
import X.AnonymousClass9D7;
import X.AnonymousClass9IP;
import X.AnonymousClass9IQ;
import X.AnonymousClass9IR;
import X.AnonymousClass9IS;
import X.AnonymousClass9OC;
import X.AnonymousClass9OX;
import X.AnonymousClass9RP;
import X.AnonymousClass9U5;
import X.AnonymousClass9V1;
import X.AnonymousClass9W2;
import X.AnonymousClass9WN;
import X.AnonymousClass9c1;
import X.AnonymousClass9cA;
import X.AnonymousClass9cB;
import X.C107695bk;
import X.C133676hl;
import X.C153607bd;
import X.C160757oG;
import X.C161527pr;
import X.C166557yt;
import X.C166587yw;
import X.C18280x3;
import X.C18290x4;
import X.C18300x5;
import X.C1899593h;
import X.C1899693i;
import X.C1902094n;
import X.C192149Ij;
import X.C192219Iq;
import X.C19340zH;
import X.C195109Vz;
import X.C195199Wn;
import X.C195319Xg;
import X.C202589mG;
import X.C203929oX;
import X.C204019og;
import X.C204629pf;
import X.C205129qT;
import X.C35371wl;
import X.C40602Ha;
import X.C41032Ir;
import X.C56052rL;
import X.C624034w;
import X.C626836d;
import X.C626936e;
import X.C64333Db;
import X.C69263Wi;
import X.C86614Ku;
import X.C86634Kw;
import X.C88834as;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class IndiaUpiMandatePaymentActivity extends AnonymousClass9D7 {
    public int A00;
    public AnonymousClass2CX A01;
    public PaymentBottomSheet A02;
    public C1902094n A03;
    public String A04;
    public boolean A05;
    public final C160757oG A06;

    public void BPe(View view, View view2, C195319Xg r4, C133676hl r5, C166587yw r6, PaymentBottomSheet paymentBottomSheet) {
        super.BPe(view, view2, (C195319Xg) null, r5, r6, paymentBottomSheet);
        this.A0S.BKC(AnonymousClass001.A0f(), 104, "approve_mandate_prompt", this.A04, true);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1 || (i == 155 && i2 != -1)) {
            finish();
        } else {
            super.onActivityResult(i, i2, intent);
        }
    }

    public static Intent A0C(Context context, C624034w r3, String str, int i) {
        AnonymousClass38V r0;
        Intent A08 = AnonymousClass0x9.A08(context, IndiaUpiMandatePaymentActivity.class);
        if (r3 == null) {
            r0 = null;
        } else {
            r0 = new AnonymousClass38V(r3);
        }
        A08.putExtra("payment_transaction_info", r0);
        A08.putExtra("user_action", i);
        A08.putExtra("extra_referral_screen", str);
        return A08;
    }

    public void A5r() {
        if (!this.A05) {
            this.A05 = true;
            C88834as A0I = C18280x3.A0I(this);
            C64333Db r2 = A0I.A4Z;
            C1899593h.A15(r2, this);
            C107695bk r3 = r2.A00;
            C1899593h.A0z(r2, r3, this, C1899593h.A0W(r2, r3, this));
            AnonymousClass97T.A0h(A0I, r2, r3, this);
            AnonymousClass97T.A0i(A0I, r2, r3, this, C1899693i.A0Y(r2));
            AnonymousClass97T.A0m(r2, r3, this);
            AnonymousClass97T.A0o(r2, r3, this);
            AnonymousClass97T.A0k(A0I, r2, r3, this);
            this.A04 = (AnonymousClass8EA) r2.ASG.get();
            this.A00 = C86614Ku.A0Q(r2);
            this.A0B = (AnonymousClass9WN) r3.A6I.get();
            this.A0C = (AnonymousClass9V1) r2.AHb.get();
            this.A01 = C86614Ku.A0V(r2);
            this.A07 = C1899693i.A0N(r3);
            this.A02 = C1899593h.A09(r2);
            this.A0A = C1899593h.A0O(r2);
            this.A06 = C1899693i.A0L(r2);
            this.A08 = C1899693i.A0O(r2);
            this.A0D = r2.ApM();
            this.A01 = (AnonymousClass2CX) A0I.A3g.get();
        }
    }

    public void A7k(C166587yw r49, HashMap hashMap) {
        String str;
        C166557yt r1;
        AnonymousClass9IS r5;
        String str2;
        C166557yt r12;
        AnonymousClass9IS r6;
        String str3;
        String str4;
        String str5;
        C203929oX r52;
        AnonymousClass9U5 r13;
        AnonymousClass36K r0;
        int i;
        AnonymousClass9AO r11;
        C202589mG r10;
        C153607bd r9;
        C40602Ha r8;
        C69263Wi r7;
        Context context;
        C166587yw r72 = r49;
        C1902094n r02 = this.A03;
        if (r49 == null) {
            r72 = r02.A05;
        }
        r02.A0L.A06("handleCredentialBlob");
        AnonymousClass9OX.A00(r02.A04.A00, r02.A01, R.string.f11nameremoved);
        C624034w r3 = r02.A07;
        AnonymousClass99L r2 = (AnonymousClass99L) r3.A0A;
        C626936e.A06(r2);
        HashMap hashMap2 = hashMap;
        switch (r02.A00) {
            case 1:
            case 4:
                C195109Vz r82 = r2.A0G.A0C;
                AnonymousClass9AO r4 = r02.A08;
                AnonymousClass9cB r102 = new AnonymousClass9cB(r72, r82, r02);
                Log.i("PAY: acceptPayeeMandate called");
                ArrayList A0s = AnonymousClass001.A0s();
                AnonymousClass39V.A03("action", "upi-accept-mandate-request", A0s);
                r4.A02(r3, A0s);
                r4.A01(r72, "upi-accept-mandate-request", hashMap2, A0s);
                AnonymousClass99L r73 = (AnonymousClass99L) r3.A0A;
                C626936e.A06(r73.A0G);
                C166557yt r14 = r73.A0G.A06;
                if (!C161527pr.A03(r14)) {
                    AnonymousClass39V.A03("mandate-info", (String) C1899593h.A0X(r14), A0s);
                }
                AnonymousClass9AO.A00(r82, r73, (String) null, A0s, false);
                AnonymousClass9AG r15 = r4.A07;
                if (r15 != null) {
                    r15.A00("U66", A0s);
                }
                C153607bd A022 = AnonymousClass9OC.A02(r4, "upi-accept-mandate-request");
                AnonymousClass36K[] A032 = r4.A03(r3);
                r13 = r4.A01;
                str5 = "set";
                r0 = new AnonymousClass36K("account", C18300x5.A1Z(A0s, 0), A032);
                r52 = new C203929oX(r4.A00, r4.A02, r4.A06, A022, (C202589mG) r102, r4, 7);
                break;
            case 3:
                r11 = r02.A08;
                String str6 = r02.A0A;
                r10 = new AnonymousClass9cA(r02);
                Log.i("PAY: revokePayerMandate called");
                ArrayList A0s2 = AnonymousClass001.A0s();
                AnonymousClass39V.A03("action", "upi-revoke-mandate", A0s2);
                r11.A02(r3, A0s2);
                AnonymousClass9AO.A00((C195109Vz) null, (AnonymousClass99L) r3.A0A, str6, A0s2, true);
                r11.A01(r72, "upi-revoke-mandate", hashMap2, A0s2);
                r9 = AnonymousClass9OC.A02(r11, "upi-revoke-mandate");
                AnonymousClass9AG r16 = r11.A07;
                if (r16 != null) {
                    r16.A00("U66", A0s2);
                }
                AnonymousClass36K[] A033 = r11.A03(r3);
                r13 = r11.A01;
                str5 = "set";
                r0 = new AnonymousClass36K("account", C18300x5.A1Z(A0s2, 0), A033);
                context = r11.A00;
                r7 = r11.A02;
                r8 = r11.A06;
                i = 8;
                break;
            case 6:
                r11 = r02.A08;
                String str7 = r02.A0A;
                r10 = new C205129qT(r2, 1, r02);
                Log.i("PAY: resumePayeeMandate called");
                ArrayList A0s3 = AnonymousClass001.A0s();
                AnonymousClass39V.A03("action", "upi-resume-mandate", A0s3);
                r11.A02(r3, A0s3);
                AnonymousClass99L r22 = (AnonymousClass99L) r3.A0A;
                C626936e.A06(r22);
                AnonymousClass9AO.A00((C195109Vz) null, r22, str7, A0s3, true);
                AnonymousClass39V.A03("receiver-name", C166557yt.A00(r22.A0A), A0s3);
                r11.A01(r72, "upi-resume-mandate", hashMap2, A0s3);
                AnonymousClass36K[] A034 = r11.A03(r3);
                AnonymousClass9AG r17 = r11.A07;
                if (r17 != null) {
                    r17.A00("U66", A0s3);
                }
                r9 = AnonymousClass9OC.A02(r11, "upi-resume-mandate");
                r13 = r11.A01;
                str5 = "set";
                r0 = new AnonymousClass36K("account", C18300x5.A1Z(A0s3, 0), A034);
                context = r11.A00;
                r7 = r11.A02;
                r8 = r11.A06;
                i = 10;
                break;
            case 7:
                C624034w r42 = r02.A06;
                C166557yt r83 = null;
                if (r42 != null) {
                    str3 = (String) C1899593h.A0X(((AnonymousClass99L) r42.A0A).A0G.A08);
                } else {
                    str3 = null;
                }
                if (r72 != null) {
                    AnonymousClass99H r53 = (AnonymousClass99H) r72.A08;
                    if (r53 != null) {
                        r83 = r53.A06;
                    }
                    str4 = r72.A0A;
                } else {
                    str4 = null;
                }
                String str8 = r3.A0K;
                r02.A0H.A00(r3.A08, r83, new AnonymousClass9c1(r02, str8), r02.A0I, r02.A0K, str8, r2.A0Q, r2.A0R, r2.A0O, r2.A0P, str4, str3, hashMap2);
                return;
            case 8:
                AnonymousClass1RR A0V = C86634Kw.A0V(r02.A02);
                C626936e.A06(r72);
                AnonymousClass9AO r23 = r02.A08;
                AnonymousClass9RP r122 = new AnonymousClass9RP(A0V, r3, r02);
                Log.i("PAY: createAndApproveMandate called");
                if (hashMap != null) {
                    str2 = r23.A04.A06("MPIN", hashMap2, 8);
                } else {
                    str2 = null;
                }
                AnonymousClass99L r62 = (AnonymousClass99L) r3.A0A;
                AnonymousClass99H r03 = (AnonymousClass99H) r72.A08;
                if (r03 != null) {
                    r12 = r03.A06;
                } else {
                    r12 = null;
                }
                String str9 = r72.A0A;
                AnonymousClass31C r36 = r23.A03;
                String A035 = r36.A03();
                C626936e.A06(r62);
                C626936e.A06(r62.A0G);
                C626936e.A06(r62.A0G.A0G);
                C626936e.A06(r62.A0G.A0E);
                C626936e.A06(r3.A08);
                r62.A0Q = C1899693i.A0e(r23.A05.A04());
                AnonymousClass39L A002 = r23.A01.A00(r3.A07, r3.A08);
                r3.A09 = A002;
                r3.A0H = str9;
                C35371wl r54 = new C35371wl(String.valueOf(A002.A00()), String.valueOf(A002.A00), ((AnonymousClass3H6) A002.A01).A04, 14);
                String A012 = r23.A08.A01();
                String str10 = r62.A0S;
                String str11 = r62.A0Q;
                String str12 = r62.A0O;
                String A003 = C166557yt.A00(r12);
                AnonymousClass9W2 r18 = r62.A0G;
                String str13 = (String) C1899593h.A0X(r18.A07);
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                Long valueOf = Long.valueOf(timeUnit.toSeconds(r18.A02));
                Long valueOf2 = Long.valueOf(timeUnit.toSeconds(r62.A0G.A01));
                String str14 = r62.A0G.A0J;
                C626936e.A06(str2);
                Object A0X = C1899593h.A0X(r62.A0A);
                C626936e.A06(A0X);
                String str15 = (String) A0X;
                Object A0X2 = C1899593h.A0X(r62.A0G.A0A);
                C626936e.A06(A0X2);
                String str16 = (String) A0X2;
                String str17 = r62.A0M;
                C626936e.A06(str17);
                AnonymousClass9W2 r04 = r62.A0G;
                String str18 = r04.A0L;
                String str19 = r04.A0F;
                String A0Z = C1899693i.A0Z(r04.A0N ? 1 : 0);
                String str20 = r04.A0G;
                Locale locale = Locale.US;
                AnonymousClass9IQ r74 = new AnonymousClass9IQ(str20.toUpperCase(locale));
                AnonymousClass9IR r32 = new AnonymousClass9IR(r62.A0G.A0E.toUpperCase(locale));
                String str21 = r62.A0G.A0K;
                if (str21 != null) {
                    r6 = new AnonymousClass9IS(str21.toUpperCase(locale));
                } else {
                    r6 = null;
                }
                C192219Iq r132 = new C192219Iq(r54, r74, new AnonymousClass9IP(A035), r32, r6, valueOf, valueOf2, A012, str10, str11, str12, A003, str13, str14, str2, str15, str16, str17, str18, str19, str9, A0Z);
                C153607bd r75 = r23.A00;
                if (r75 != null) {
                    r75.A03("upi-create-mandate");
                }
                r36.A0D(new AnonymousClass9AT(r23.A00, r23.A01, r23.A02, r23.A06, r75, r122, r132), r132.A00, A035, 204, 0);
                return;
            case 9:
                C626936e.A06(r72);
                AnonymousClass9AO r43 = r02.A08;
                C205129qT r24 = new C205129qT(r3, 0, r02);
                Log.i("PAY: updateMandateByIntent called");
                if (hashMap != null) {
                    str = r43.A04.A06("MPIN", hashMap2, 9);
                } else {
                    str = null;
                }
                AnonymousClass99L r55 = (AnonymousClass99L) r3.A0A;
                AnonymousClass99H r05 = (AnonymousClass99H) r72.A08;
                if (r05 != null) {
                    r1 = r05.A06;
                } else {
                    r1 = null;
                }
                String str22 = r72.A0A;
                AnonymousClass31C r46 = r43.A03;
                String A036 = r46.A03();
                C626936e.A06(r55);
                C626936e.A06(r55.A0G);
                C626936e.A06(r55.A0G.A0G);
                C626936e.A06(r55.A0G.A0E);
                C626936e.A06(r55.A0G.A08);
                C626936e.A06(r55.A0G.A0C);
                C626936e.A06(r55.A0G.A0C.A01);
                C626936e.A06(r55.A0G.A0C.A04);
                C626936e.A06(r1);
                C626936e.A06(r3.A08);
                C626936e.A06(r3.A0K);
                r55.A0Q = C1899693i.A0e(r43.A05.A04());
                AnonymousClass39L A004 = r43.A01.A00(r3.A07, r3.A08);
                r3.A09 = A004;
                r3.A0H = str22;
                C35371wl r06 = new C35371wl(String.valueOf(A004.A00()), String.valueOf(A004.A00), ((AnonymousClass3H6) A004.A01).A04, 14);
                AnonymousClass39L r25 = r55.A0G.A0C.A01;
                C35371wl r07 = new C35371wl(String.valueOf(r25.A00()), String.valueOf(r25.A00), ((AnonymousClass3H6) r25.A01).A04, 14);
                String str23 = r3.A0K;
                String A0e = C1899693i.A0e(r55.A0G.A08);
                String A013 = r43.A08.A01();
                String A0e2 = C1899693i.A0e(r55.A0G.A0C.A04);
                String str24 = r55.A0Q;
                String str25 = r55.A0O;
                String A0e3 = C1899693i.A0e(r1);
                AnonymousClass9W2 r19 = r55.A0G;
                String str26 = (String) C1899593h.A0X(r19.A07);
                TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
                Long valueOf3 = Long.valueOf(timeUnit2.toSeconds(r19.A02));
                Long valueOf4 = Long.valueOf(timeUnit2.toSeconds(r55.A0G.A0C.A00));
                String str27 = r55.A0G.A0J;
                C626936e.A06(str);
                Object A0X3 = C1899593h.A0X(r55.A0A);
                C626936e.A06(A0X3);
                String str28 = (String) A0X3;
                Object A0X4 = C1899593h.A0X(r55.A0G.A0A);
                C626936e.A06(A0X4);
                String str29 = (String) A0X4;
                String str30 = r55.A0M;
                C626936e.A06(str30);
                AnonymousClass9W2 r110 = r55.A0G;
                String str31 = r110.A0L;
                String A0Z2 = C1899693i.A0Z(r110.A0N ? 1 : 0);
                String str32 = r110.A0G;
                Locale locale2 = Locale.US;
                AnonymousClass9IQ r08 = new AnonymousClass9IQ(str32.toUpperCase(locale2));
                AnonymousClass9IR r09 = new AnonymousClass9IR(r55.A0G.A0E.toUpperCase(locale2));
                String str33 = r55.A0G.A0K;
                if (str33 != null) {
                    r5 = new AnonymousClass9IS(str33.toUpperCase(locale2));
                } else {
                    r5 = null;
                }
                AnonymousClass9IP r142 = new AnonymousClass9IP(A036);
                C56052rL A014 = C56052rL.A01();
                C1899593h.A1M(A014);
                C56052rL A0U = C1899593h.A0U();
                C56052rL.A0D(A0U, "action", "upi-update-mandate-by-url");
                if (C1899593h.A1a(str23, false)) {
                    C56052rL.A0D(A0U, "transaction-id", str23);
                }
                if (C626836d.A0M(A0e, 0, 255, false)) {
                    C56052rL.A0D(A0U, "mandate-no", A0e);
                }
                if (C626836d.A0M(A013, 1, 255, false)) {
                    C56052rL.A0D(A0U, "device-id", A013);
                }
                if (C626836d.A0M(A0e2, 0, 35, false)) {
                    C56052rL.A0D(A0U, "seq-no", A0e2);
                }
                if (C626836d.A0M(str24, 1, 100, false)) {
                    C56052rL.A0D(A0U, "sender-vpa", str24);
                }
                if (C626836d.A0M(str25, 1, 100, false)) {
                    C56052rL.A0D(A0U, "receiver-vpa", str25);
                }
                if (C1899593h.A1Z(A0e3, 0, false)) {
                    C56052rL.A0D(A0U, "upi-bank-info", A0e3);
                }
                if (str26 != null && C1899693i.A11(str26, 0, true)) {
                    C56052rL.A0D(A0U, "mandate-name", str26);
                }
                if (C626836d.A0J(valueOf3, 0, 9007199254740991L, false)) {
                    C56052rL.A0A(A0U, valueOf3, "start-ts");
                }
                if (C626836d.A0J(valueOf4, 0, 9007199254740991L, false)) {
                    C56052rL.A0A(A0U, valueOf4, "end-ts");
                }
                if (str27 != null && C626836d.A0M(str27, 1, 2, true)) {
                    C56052rL.A0D(A0U, "recurrence-day", str27);
                }
                if (C1899593h.A1Z(str, 0, false)) {
                    C56052rL.A0D(A0U, "mpin", str);
                }
                if (C626836d.A0M(str28, 1, 100, false)) {
                    C56052rL.A0D(A0U, "receiver-name", str28);
                }
                if (C626836d.A0M(str29, 1, 100, false)) {
                    C56052rL.A0D(A0U, "purpose-code", str29);
                }
                if (C626836d.A0M(str30, 0, 4, false)) {
                    C56052rL.A0D(A0U, "mcc", str30);
                }
                if (str31 != null && C626836d.A0M(str31, 1, 255, true)) {
                    C56052rL.A0D(A0U, "ref-id", str31);
                }
                String str34 = str22;
                if (C626836d.A0M(str34, 1, 100, false)) {
                    C56052rL.A0D(A0U, "credential-id", str34);
                }
                A0U.A0L(A0Z2, "is-revocable", C192149Ij.A00);
                A0U.A0L("1", "share-to-payee", C192149Ij.A01);
                C56052rL A042 = C56052rL.A04("original-amount");
                C41032Ir.A08(A042, r06);
                C56052rL.A07(A042, A0U);
                C56052rL A043 = C56052rL.A04("amount");
                C41032Ir.A08(A043, r07);
                C56052rL.A07(A043, A0U);
                C41032Ir.A08(A0U, r08);
                C41032Ir.A08(A0U, r09);
                if (r5 != null) {
                    C41032Ir.A08(A0U, r5);
                }
                r46.A0D(new AnonymousClass9AP(r43.A00, r43.A02, r43.A06, AnonymousClass9OC.A02(r43, "upi-update-mandate-by-url"), r24), C1899593h.A0S(A0U, A014, r142), A036, 204, 0);
                return;
            default:
                return;
        }
        r52 = new C203929oX(context, r7, r8, r9, r10, r11, i);
        r13.A0G(r52, r0, str5, 0);
    }

    public void BbO(AnonymousClass34V r3) {
        throw AnonymousClass002.A0G(this.A06.A02("onSetPin unsupported"));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x00c6, code lost:
        r2 = new X.AnonymousClass9QE(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0104, code lost:
        r2.A03 = r5;
        r3.A09.A0H(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x010b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0127, code lost:
        r3.A0M.BkM(new X.C201059jS(r3, r4, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0131, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r24) {
        /*
            r23 = this;
            r3 = r23
            r0 = r24
            super.onCreate(r0)
            java.lang.String r0 = X.C1899593h.A0a(r3)
            r3.A04 = r0
            com.whatsapp.payments.ui.PaymentBottomSheet r0 = new com.whatsapp.payments.ui.PaymentBottomSheet
            r0.<init>()
            r3.A02 = r0
            android.content.Intent r2 = r3.getIntent()
            java.lang.String r1 = "user_action"
            r0 = 0
            int r0 = r2.getIntExtra(r1, r0)
            r3.A00 = r0
            X.9U1 r7 = r3.A0L
            X.3Wi r5 = r3.A05
            X.2qk r4 = r3.A03
            X.7bd r10 = r3.A05
            X.31C r6 = r3.A0H
            X.9Se r13 = r3.A0E
            X.9U5 r11 = r3.A0M
            X.9AG r12 = r3.A08
            X.2Ha r9 = r3.A0K
            X.9bS r8 = r3.A0M
            X.9AO r2 = new X.9AO
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            X.1VX r0 = r3.A0D
            X.9AN r14 = new X.9AN
            r15 = r3
            r16 = r5
            r17 = r0
            r18 = r6
            r19 = r7
            r20 = r9
            r21 = r11
            r22 = r13
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22)
            X.9YF r0 = new X.9YF
            r0.<init>(r14, r2, r3)
            X.0XL r1 = X.AnonymousClass4L0.A0F(r0, r3)
            java.lang.Class<X.94n> r0 = X.C1902094n.class
            X.0Ty r2 = r1.A01(r0)
            X.94n r2 = (X.C1902094n) r2
            r3.A03 = r2
            r0 = 27
            X.9qL r1 = X.C205049qL.A00(r3, r0)
            X.08M r0 = r2.A01
            r0.A0B(r3, r1)
            X.94n r2 = r3.A03
            r0 = 28
            X.9qL r1 = X.C205049qL.A00(r3, r0)
            X.4UC r0 = r2.A09
            r0.A0B(r3, r1)
            X.0XL r1 = new X.0XL
            r1.<init>(r3)
            java.lang.Class<X.94c> r0 = X.AnonymousClass94c.class
            X.0Ty r0 = r1.A01(r0)
            X.94c r0 = (X.AnonymousClass94c) r0
            X.08M r1 = r0.A00
            r0 = 29
            X.C205049qL.A02(r3, r1, r0)
            X.94n r3 = r3.A03
            X.34w r5 = r3.A07
            X.1S4 r4 = r5.A0A
            r1 = r4
            X.99L r1 = (X.AnonymousClass99L) r1
            int r0 = r3.A00
            switch(r0) {
                case 1: goto L_0x009e;
                case 2: goto L_0x00a0;
                case 3: goto L_0x00ba;
                case 4: goto L_0x00bf;
                case 5: goto L_0x00c4;
                case 6: goto L_0x00cc;
                case 7: goto L_0x00d2;
                case 8: goto L_0x00e2;
                case 9: goto L_0x010c;
                default: goto L_0x009d;
            }
        L_0x009d:
            return
        L_0x009e:
            r0 = 6
            goto L_0x00c6
        L_0x00a0:
            X.9W2 r0 = r1.A0G
            X.9Vz r0 = r0.A0C
            r2 = 2131894832(0x7f122230, float:1.942448E38)
            if (r0 != 0) goto L_0x00ac
            r2 = 2131894770(0x7f1221f2, float:1.9424354E38)
        L_0x00ac:
            r0 = 5
            X.9QE r1 = new X.9QE
            r1.<init>(r0)
            r1.A00 = r2
            X.4UC r0 = r3.A09
            r0.A0H(r1)
            return
        L_0x00ba:
            r4 = 2131894820(0x7f122224, float:1.9424456E38)
            r2 = 4
            goto L_0x0127
        L_0x00bf:
            r4 = 2131894780(0x7f1221fc, float:1.9424374E38)
            r2 = 7
            goto L_0x0127
        L_0x00c4:
            r0 = 9
        L_0x00c6:
            X.9QE r2 = new X.9QE
            r2.<init>(r0)
            goto L_0x0104
        L_0x00cc:
            r4 = 2131894819(0x7f122223, float:1.9424454E38)
            r2 = 10
            goto L_0x0127
        L_0x00d2:
            X.C626936e.A06(r1)
            X.4FS r2 = r3.A0M
            java.lang.String r1 = r1.A0L
            X.9GX r0 = new X.9GX
            r0.<init>(r3, r1)
            X.C18270x1.A0w(r0, r2)
            return
        L_0x00e2:
            r0 = 12
            X.9QE r2 = new X.9QE
            r2.<init>(r0)
            X.C626936e.A06(r4)
            X.99L r4 = (X.AnonymousClass99L) r4
            java.lang.String r0 = r3.A0A
            r4.A0S = r0
            X.9bS r0 = r3.A0D
            java.lang.String r0 = X.C196629bS.A00(r0)
            r4.A0Q = r0
            X.2sH r1 = r3.A03
            X.2sr r0 = r3.A02
            java.lang.String r0 = X.AnonymousClass35J.A02(r0, r1)
            r4.A0K = r0
        L_0x0104:
            r2.A03 = r5
            X.4UC r0 = r3.A09
            r0.A0H(r2)
            return
        L_0x010c:
            X.C626936e.A06(r1)
            X.9W2 r0 = r1.A0G
            X.C626936e.A06(r0)
            X.9W2 r0 = r1.A0G
            X.9Vz r2 = r0.A0C
            java.lang.String r1 = "upiSequenceNumber"
            java.lang.String r0 = r3.A0A
            X.7yt r0 = X.C161527pr.A00(r0, r1)
            r2.A04 = r0
            r4 = 2131894780(0x7f1221fc, float:1.9424374E38)
            r2 = 14
        L_0x0127:
            X.4FS r1 = r3.A0M
            X.9jS r0 = new X.9jS
            r0.<init>(r3, r4, r2)
            r1.BkM(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity.onCreate(android.os.Bundle):void");
    }

    public IndiaUpiMandatePaymentActivity(int i) {
        this.A05 = false;
        C204019og.A00(this, 67);
    }

    public void A7m(PaymentBottomSheet paymentBottomSheet) {
        super.A7m(paymentBottomSheet);
        paymentBottomSheet.A01 = new C204629pf(this, 15);
        this.A0S.BKC(C18290x4.A0Z(), (Integer) null, "approve_mandate_prompt", this.A04, true);
    }

    public void A7n(PaymentBottomSheet paymentBottomSheet) {
        super.A7n(paymentBottomSheet);
        paymentBottomSheet.A01 = new C204629pf(this, 10);
    }

    public void A7o(PaymentBottomSheet paymentBottomSheet) {
        super.A7o(paymentBottomSheet);
        paymentBottomSheet.A01 = new C204629pf(this, 14);
    }

    public void A7q(int i) {
        C19340zH A002 = AnonymousClass5V0.A00(this);
        A002.A0T(i);
        A002.A0i(true);
        A002.A0Y((DialogInterface.OnClickListener) null, R.string.f11nameremoved);
        A002.A0W((DialogInterface.OnClickListener) null, R.string.f11nameremoved);
        A002.A00.A0L(new C204629pf(this, 11));
        AnonymousClass043 create = A002.create();
        create.setOnShowListener(new C195199Wn(this, 0));
        create.show();
    }

    public void BMi(ViewGroup viewGroup) {
        super.BMi(viewGroup);
        C18300x5.A0G(viewGroup, R.id.text).setText(R.string.f11nameremoved);
    }

    public IndiaUpiMandatePaymentActivity() {
        this(0);
        this.A06 = C160757oG.A00("IndiaUpiMandatePaymentActivity", "payment-settings", "IN");
    }
}
