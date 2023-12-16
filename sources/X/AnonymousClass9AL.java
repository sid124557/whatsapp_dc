package X;

import android.content.Context;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.HashMap;

/* renamed from: X.9AL  reason: invalid class name */
public class AnonymousClass9AL extends AnonymousClass9OC {
    public AnonymousClass9U1 A00;
    public C203049n2 A01;
    public final Context A02;
    public final C69263Wi A03;
    public final AnonymousClass31C A04;
    public final C196629bS A05;
    public final C40602Ha A06;
    public final C194389Sr A07;
    public final C197109ca A08;
    public final AnonymousClass9B3 A09;
    public final C194259Se A0A;

    public void A00() {
        C197109ca r11 = this.A08;
        r11.Bq0();
        Log.i("PAY: IndiaUpiPaymentSetup sendGetListKeys called");
        String A0B = this.A05.A0B();
        if (!TextUtils.isEmpty(A0B)) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("PAY: IndiaUpiPaymentSetup got cached listkeys; callback: ");
            A0o.append(this.A01);
            C18280x3.A14(A0o);
            C203049n2 r0 = this.A01;
            if (r0 != null) {
                r0.BVC((AnonymousClass34V) null, A0B);
                return;
            }
            return;
        }
        C153607bd r9 = this.A00;
        r9.A03("upi-list-keys");
        Log.i("PAY: IndiaUPIPaymentBankSetup sendGetListKeys");
        Integer A002 = this.A09.A00("upi-list-keys");
        AnonymousClass31C r3 = this.A04;
        String A032 = r3.A03();
        C35371wl A0X = C1899693i.A0X(A032);
        C56052rL A012 = C56052rL.A01();
        C56052rL.A0E(A012, "xmlns", "w:pay");
        C56052rL A0U = C1899593h.A0U();
        C56052rL.A0D(A0U, "action", "upi-list-keys");
        AnonymousClass36K A033 = C41032Ir.A03(A0U, A012, A0X);
        r11.A08((AnonymousClass34V) null, 1, 0);
        C1899593h.A1C(r3, new C203929oX(this.A02, this.A03, this.A06, r9, this, r11, A002), A033, A032);
    }

    public AnonymousClass9AL(Context context, C69263Wi r3, AnonymousClass31C r4, AnonymousClass9U1 r5, C196629bS r6, C40602Ha r7, AnonymousClass9U5 r8, C194389Sr r9, C203049n2 r10, C197109ca r11, AnonymousClass9B3 r12, C194259Se r13) {
        super(r5.A04, r8);
        this.A02 = context;
        this.A03 = r3;
        this.A04 = r4;
        this.A0A = r13;
        this.A00 = r5;
        this.A07 = r9;
        this.A08 = r11;
        this.A06 = r7;
        this.A05 = r6;
        this.A09 = r12;
        this.A01 = r10;
    }

    public void A01(C166557yt r23, C166557yt r24, C35371wl r25, C35371wl r26, String str, String str2, String str3, String str4, HashMap hashMap) {
        C166557yt r4 = r23;
        C166557yt r5 = r24;
        C35371wl r6 = r25;
        C35371wl r7 = r26;
        String str5 = str2;
        String str6 = str3;
        String str7 = str4;
        HashMap hashMap2 = hashMap;
        if (C161527pr.A02(r4)) {
            this.A07.A01(this.A02, this.A00, new C196959c6(r5, this, r6, r7, str5, str6, str7, hashMap2));
        } else {
            A02(r4, r5, r6, r7, str, str5, str6, str7, hashMap2);
        }
    }

    public final void A02(C166557yt r28, C166557yt r29, C35371wl r30, C35371wl r31, String str, String str2, String str3, String str4, HashMap hashMap) {
        String str5;
        String str6;
        String str7;
        this.A08.Bq0();
        Log.i("PAY: IndiaUpiPaymentSetup sendSetPin called");
        C153607bd r14 = this.A00;
        r14.A03("upi-set-mpin");
        String str8 = null;
        String str9 = str4;
        HashMap hashMap2 = hashMap;
        if (hashMap != null) {
            AnonymousClass9U1 r6 = this.A00;
            str6 = r6.A06("SMS", hashMap2, 1);
            if ("AADHAAR".equals(str9)) {
                str8 = r6.A06("AADHAAR", hashMap2, 1);
            }
            str7 = r6.A06("MPIN", hashMap2, 1);
            str5 = r6.A06("ATMPIN", hashMap2, 1);
        } else {
            str5 = null;
            str6 = null;
            str7 = null;
        }
        AnonymousClass31C r26 = this.A04;
        String A032 = r26.A03();
        String A0e = C1899693i.A0e(r28);
        String str10 = (String) C1899593h.A0X(r29);
        String A012 = this.A0A.A01();
        AnonymousClass9IP r62 = new AnonymousClass9IP(A032);
        C56052rL A013 = C56052rL.A01();
        C1899593h.A1M(A013);
        C56052rL A0U = C1899593h.A0U();
        C56052rL.A0D(A0U, "action", "upi-set-mpin");
        if (A0e != null && C1899593h.A1X(A0e)) {
            C56052rL.A0D(A0U, "vpa", A0e);
        }
        String str11 = str;
        if (str != null && C1899593h.A1X(str11)) {
            C56052rL.A0D(A0U, "vpa-id", str11);
        }
        if (str10 != null && C626836d.A0M(str10, 1, 100000, true)) {
            C56052rL.A0D(A0U, "upi-bank-info", str10);
        }
        String str12 = str2;
        if (C1899593h.A1Y(str12, 1, false)) {
            C56052rL.A0D(A0U, "credential-id", str12);
        }
        String str13 = str3;
        if (C626836d.A0M(str13, 35, 35, false)) {
            C56052rL.A0D(A0U, "seq-no", str13);
        }
        C1899593h.A1O(A0U, A012, false);
        if (C626836d.A0M(str6, 0, 10000, false)) {
            C56052rL.A0D(A0U, "otp", str6);
        }
        if (C626836d.A0M(str7, 0, 10000, false)) {
            C56052rL.A0D(A0U, "mpin", str7);
        }
        if (str5 != null && C626836d.A0M(str5, 0, 10000, true)) {
            C56052rL.A0D(A0U, "atm-pin", str5);
        }
        if (str8 != null && C626836d.A0M(str8, 0, 10000, true)) {
            C56052rL.A0D(A0U, "aadhaar-otp", str8);
        }
        A0U.A0K(str9, "otp-type", C192179Im.A02);
        A0U.A0L("1", "default-debit", C192179Im.A01);
        A0U.A0L("1", "default-credit", C192179Im.A00);
        C35371wl r2 = r31;
        if (r31 != null) {
            C41032Ir.A08(A0U, r2);
        }
        C35371wl r22 = r30;
        if (r30 != null) {
            C41032Ir.A08(A0U, r22);
        }
        r26.A0D(new C203919oW(this.A02, this.A03, this.A06, r14, this), C1899593h.A0S(A0U, A013, r62), A032, 204, 0);
    }

    public final void A03(C166557yt r25, C166557yt r26, String str, String str2, String str3, HashMap hashMap) {
        String str4;
        String str5;
        C197109ca r23 = this.A08;
        r23.Bq0();
        Log.i("PAY: IndiaUpiPaymentSetup sendChangePin called");
        C153607bd r0 = this.A00;
        C153607bd r22 = r0;
        r0.A03("upi-change-mpin");
        HashMap hashMap2 = hashMap;
        if (hashMap != null) {
            AnonymousClass9U1 r4 = this.A00;
            str4 = r4.A06("MPIN", hashMap2, 2);
            str5 = r4.A06("NMPIN", hashMap2, 2);
        } else {
            str4 = null;
            str5 = null;
        }
        AnonymousClass31C r14 = this.A04;
        String A032 = r14.A03();
        String A012 = this.A0A.A01();
        String A0e = C1899693i.A0e(r25);
        String str6 = (String) C1899593h.A0X(r26);
        AnonymousClass9IP r7 = new AnonymousClass9IP(A032);
        C56052rL A013 = C56052rL.A01();
        C1899593h.A1M(A013);
        C56052rL A0U = C1899593h.A0U();
        C56052rL.A0D(A0U, "action", "upi-change-mpin");
        String str7 = str2;
        if (C1899593h.A1b(str7, false)) {
            C56052rL.A0D(A0U, "credential-id", str7);
        }
        String str8 = str3;
        if (C626836d.A0M(str8, 35, 35, false)) {
            C56052rL.A0D(A0U, "seq-no", str8);
        }
        if (C626836d.A0M(str4, 0, 1000, false)) {
            C56052rL.A0D(A0U, "old-mpin", str4);
        }
        if (C626836d.A0M(str5, 0, 1000, false)) {
            C56052rL.A0D(A0U, "new-mpin", str5);
        }
        C1899593h.A1O(A0U, A012, false);
        if (A0e != null && C1899593h.A1Y(A0e, 0, true)) {
            C56052rL.A0D(A0U, "vpa", A0e);
        }
        String str9 = str;
        if (str != null && C1899593h.A1Y(str9, 1, true)) {
            C56052rL.A0D(A0U, "vpa-id", str9);
        }
        if (str6 != null && C626836d.A0N(str6, true)) {
            C56052rL.A0D(A0U, "upi-bank-info", str6);
        }
        AnonymousClass36K A0S = C1899593h.A0S(A0U, A013, r7);
        r23.A08((AnonymousClass34V) null, 7, 0);
        C1899593h.A1C(r14, new C203919oW(this.A02, this.A03, this.A06, r22, this, r23), A0S, A032);
    }
}
