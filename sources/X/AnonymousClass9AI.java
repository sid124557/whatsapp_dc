package X;

import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.9AI  reason: invalid class name */
public class AnonymousClass9AI extends AnonymousClass9OC {
    public final Context A00;
    public final C69263Wi A01;
    public final C617332a A02;
    public final AnonymousClass31C A03;
    public final C194619Tt A04;
    public final AnonymousClass9U1 A05;
    public final C40602Ha A06;
    public final AnonymousClass9B3 A07;
    public final C194259Se A08;

    public AnonymousClass9AI(Context context, C69263Wi r3, C617332a r4, AnonymousClass31C r5, C194619Tt r6, AnonymousClass9U1 r7, C40602Ha r8, AnonymousClass9U5 r9, AnonymousClass9B3 r10, C194259Se r11) {
        super(r7.A04, r9);
        this.A00 = context;
        this.A01 = r3;
        this.A03 = r5;
        this.A08 = r11;
        this.A05 = r7;
        this.A02 = r4;
        this.A04 = r6;
        this.A06 = r8;
        this.A07 = r10;
    }

    public void A01(C166557yt r26, C166557yt r27, C202499m7 r28) {
        String str;
        String str2;
        String str3;
        Log.i("PAY: verifyPaymentVpa called");
        String A012 = this.A08.A01();
        C166557yt r13 = r27;
        boolean z = !C161527pr.A02(r13);
        String str4 = null;
        if (z) {
            str = (String) C1899593h.A0X(r13);
            if (((String) r13.A00).length() == 10) {
                str3 = "mobile_number";
            } else {
                str3 = "numeric_id";
            }
            str2 = "2";
        } else {
            str = null;
            str2 = null;
            str3 = null;
            str4 = (String) C1899593h.A0X(r26);
        }
        AnonymousClass31C r3 = this.A03;
        String A032 = r3.A03();
        C35371wl r9 = new C35371wl(A032, 13);
        C56052rL A013 = C56052rL.A01();
        C56052rL A0U = C1899593h.A0U();
        C56052rL.A0D(A0U, "action", "upi-get-vpa-name");
        if (str4 != null && C1899593h.A1a(str4, true)) {
            C56052rL.A0D(A0U, "vpa", str4);
        }
        C1899593h.A1O(A0U, A012, false);
        if (str != null && C1899693i.A0z(str, 8, true)) {
            C56052rL.A0D(A0U, "value", str);
        }
        A0U.A0K(str2, "version", C192109If.A01);
        A0U.A0K(str3, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, C192109If.A00);
        r3.A0K(new AnonymousClass9AW(this.A00, this.A01, r13, r28, this.A06, this.A00, this, this.A07.A00("upi-get-vpa-name"), z), C41032Ir.A03(A0U, A013, r9), A032, 204, C625635p.A0L);
    }

    public void A00(AnonymousClass39Q r34, C166557yt r35, C166557yt r36, C166557yt r37, AnonymousClass99L r38, AnonymousClass9AG r39, C202609mI r40, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, HashMap hashMap, boolean z) {
        String str11;
        String str12;
        AnonymousClass39V[] A0u;
        Log.i("PAY: IndiaUpiPaymentSetup sendPaymentToNonWaVpa called");
        AnonymousClass99L r12 = r38;
        Boolean bool = r12.A0I;
        AnonymousClass39Q r13 = r34;
        AnonymousClass39L A002 = this.A01.A00(AnonymousClass1S3.A05, r13);
        AnonymousClass31C r32 = this.A03;
        String A032 = r32.A03();
        String A012 = this.A08.A01();
        String A062 = this.A05.A06("MPIN", hashMap, 6);
        String str13 = r12.A0Q;
        String str14 = r12.A0O;
        String str15 = r12.A0S;
        String str16 = r12.A0K;
        String str17 = (String) C1899593h.A0X(r36);
        String str18 = (String) C1899593h.A0X(r35);
        String str19 = r12.A0R;
        String str20 = r12.A0P;
        String str21 = (String) C1899593h.A0X(r37);
        String obj = r13.toString();
        String str22 = r12.A0U;
        if (z) {
            str11 = "p2m";
        } else {
            str11 = "p2p";
        }
        if (bool != null) {
            str12 = C1899693i.A0Z(bool.booleanValue() ? 1 : 0);
        } else {
            str12 = null;
        }
        C35371wl r0 = new C35371wl(String.valueOf(A002.A00()), String.valueOf(A002.A00), ((AnonymousClass3H6) A002.A01).A04, 14);
        AnonymousClass9IP r2 = new AnonymousClass9IP(A032);
        C56052rL A013 = C56052rL.A01();
        C1899593h.A1M(A013);
        C56052rL A0U = C1899593h.A0U();
        C56052rL.A0D(A0U, "action", "upi-send-to-vpa");
        String str23 = str;
        if (C626836d.A0M(str23, 1, 200, false)) {
            C56052rL.A0D(A0U, "credential-id", str23);
        }
        C1899593h.A1O(A0U, A012, false);
        if (C1899593h.A1Z(A062, 0, false)) {
            C56052rL.A0D(A0U, "mpin", A062);
        }
        if (C626836d.A0M(str13, 0, 100, false)) {
            C56052rL.A0D(A0U, "sender-vpa", str13);
        }
        if (C626836d.A0M(str14, 0, 100, false)) {
            C56052rL.A0D(A0U, "receiver-vpa", str14);
        }
        if (C626836d.A0M(str15, 0, 35, false)) {
            C56052rL.A0D(A0U, "seq-no", str15);
        }
        if (C1899693i.A11(str16, 0, false)) {
            C56052rL.A0D(A0U, "message-id", str16);
        }
        String str24 = str4;
        if (str4 != null && C626836d.A0M(str24, 0, 4, true)) {
            C56052rL.A0D(A0U, "mcc", str24);
        }
        String str25 = str3;
        if (str3 != null && C626836d.A0M(str25, 0, 255, true)) {
            C56052rL.A0D(A0U, "ref-id", str25);
        }
        String str26 = str5;
        if (str5 != null && C626836d.A0M(str26, 0, 2048, true)) {
            C56052rL.A0D(A0U, "ref-url", str26);
        }
        String str27 = str9;
        if (str9 != null && C1899693i.A11(str27, 0, true)) {
            C56052rL.A0D(A0U, "note", str27);
        }
        if (str17 != null && C1899593h.A1a(str17, true)) {
            C56052rL.A0D(A0U, "payee-name", str17);
        }
        String str28 = str7;
        if (str7 != null && C626836d.A0M(str28, 0, 4, true)) {
            C56052rL.A0D(A0U, "mode", str28);
        }
        String str29 = str6;
        if (str6 != null && C626836d.A0M(str29, 1, 4, true)) {
            C56052rL.A0D(A0U, "purpose-code", str29);
        }
        if (str18 != null && C1899693i.A11(str18, 0, true)) {
            C56052rL.A0D(A0U, "upi-bank-info", str18);
        }
        if (str19 != null && C1899593h.A1X(str19)) {
            C56052rL.A0D(A0U, "sender-vpa-id", str19);
        }
        if (str20 != null && C1899593h.A1X(str20)) {
            C56052rL.A0D(A0U, "receiver-vpa-id", str20);
        }
        if (str21 != null && C626836d.A0M(str21, 8, 15, true)) {
            C56052rL.A0D(A0U, "receiver-upi-number", str21);
        }
        if (obj != null && C1899593h.A1X(obj)) {
            C56052rL.A0D(A0U, "amount", obj);
        }
        String str30 = str2;
        if (str2 != null && C1899593h.A1X(str30)) {
            C56052rL.A0D(A0U, "currency", str30);
        }
        if (str22 != null && C1899593h.A1a(str22, true)) {
            C56052rL.A0D(A0U, "token", str22);
        }
        String str31 = str8;
        if (str8 != null && C1899593h.A1a(str31, true)) {
            C56052rL.A0D(A0U, PublicKeyCredentialControllerUtility.JSON_KEY_ID, str31);
        }
        String str32 = str10;
        if (str10 != null && C1899693i.A11(str32, 1, true)) {
            C56052rL.A0D(A0U, "international-pay-detail", str32);
        }
        A0U.A0K(str11, "transaction-type", C192169Il.A01);
        A0U.A0K("2", "version", C192169Il.A02);
        A0U.A0K(str12, "is_first_send", C192169Il.A00);
        C41032Ir.A0E(A0U, r0, "amount");
        AnonymousClass36K A0S = C1899593h.A0S(A0U, A013, r2);
        C153607bd A022 = AnonymousClass9OC.A02(this, "upi-send-to-vpa");
        List A0s = AnonymousClass001.A0s();
        AnonymousClass36K A0k = A0S.A0k(0);
        if (!(A0k == null || (A0u = A0k.A0u()) == null)) {
            C626936e.A06(A0u);
            A0s = Arrays.asList(A0u);
        }
        r39.A00("U66", A0s);
        r32.A0D(new C203939oY(this.A00, this.A01, this.A06, A022, r40, this, this.A07.A00("upi-send-to-vpa")), A0S, A032, 204, C625635p.A0L);
    }
}
