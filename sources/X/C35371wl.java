package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.1wl  reason: invalid class name and case insensitive filesystem */
public class C35371wl extends C35561x4 {
    public C35371wl(int i) {
        AnonymousClass36K A0F;
        C56052rL r1;
        String str;
        switch (i) {
            case 0:
                r1 = C56052rL.A02();
                str = "multicast";
                break;
            case 1:
                r1 = C56052rL.A02();
                str = "url_number";
                break;
            case 2:
                r1 = C56052rL.A02();
                str = "url_text";
                break;
            case 4:
                C56052rL A02 = C56052rL.A02();
                C56052rL.A0D(A02, "edit", "7");
                A0F = A02.A0F();
                break;
            default:
                C56052rL A022 = C56052rL.A02();
                C56052rL A04 = C56052rL.A04("meta");
                C56052rL.A0D(A04, "biz_source", "smb_promo");
                C56052rL.A07(A04, A022);
                A0F = A022.A0F();
                break;
        }
        C56052rL.A07(C56052rL.A04(str), r1);
        A0F = r1.A0F();
        this.A00 = A0F;
    }

    public C35371wl(C35261wa r3) {
        C56052rL A01 = C56052rL.A01();
        A01.A0H(r3.A00);
        C41032Ir.A0A(A01, this);
    }

    public C35371wl(C35371wl r4) {
        C56052rL A00 = C56052rL.A00();
        C56052rL.A0D(A00, "xmlns", "urn:xmpp:whatsapp:username");
        C41032Ir.A0C(A00, r4, this);
    }

    public C35371wl(C35371wl r2, C35271wb r3, C35191wT r4, int i) {
        C41032Ir.A0C(C56052rL.A02(), r2, this);
    }

    public C35371wl(C35371wl r4, C35371wl r5) {
        C56052rL A01 = C56052rL.A01();
        C56052rL.A0E(A01, "xmlns", "vesta");
        C41032Ir.A09(A01, r4);
        C41032Ir.A0D(A01, r5, this);
    }

    public C35371wl(C35371wl r4, Long l) {
        C56052rL A03 = C56052rL.A03();
        C56052rL A04 = C56052rL.A04("tctoken");
        if (l != null && C626836d.A0K(l, true)) {
            C56052rL.A0A(A04, l, "t");
        }
        C41032Ir.A09(A04, r4);
        C41032Ir.A06(A04, A03, this);
    }

    public C35371wl(Long l) {
        C56052rL A04 = C56052rL.A04("notice");
        if (C626836d.A0K(l, false)) {
            C56052rL.A0A(A04, l, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        }
        C56052rL.A0C(A04, "stage", 5);
        C41032Ir.A0A(A04, this);
    }

    public C35371wl(String str, int i) {
        String str2;
        String str3;
        C56052rL A01 = C56052rL.A01();
        String str4 = PublicKeyCredentialControllerUtility.JSON_KEY_TYPE;
        switch (i) {
            case 9:
            case 12:
            case 17:
            case 21:
            case 24:
            case 29:
                str3 = "get";
                break;
            case 13:
                str2 = "get";
                break;
            case 15:
                str2 = "set";
                break;
            default:
                str3 = "set";
                break;
        }
        C56052rL.A0E(A01, str4, str2);
        str4 = "xmlns";
        str3 = "w:pay";
        C56052rL.A0D(A01, str4, str3);
        C626836d.A0G(A01, str);
        C41032Ir.A0A(A01, this);
    }

    public C35371wl(String str, String str2) {
        C56052rL A03 = C56052rL.A03();
        if (C626836d.A0M(str, 1, 100, false)) {
            C56052rL.A0D(A03, "aadhaar-otp-txn-id", str);
        }
        String str3 = str2;
        if (C626836d.A0M(str3, 1, 100, false)) {
            C56052rL.A0D(A03, "aadhaar-otp-txn-ts", str3);
        }
        C41032Ir.A0A(A03, this);
    }

    public C35371wl(String str, String str2, String str3, int i) {
        C56052rL A03 = C56052rL.A03();
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        if (11 - i != 0) {
            C56052rL A04 = C56052rL.A04("money");
            if (C626836d.A0M(str4, 1, 100, false)) {
                C56052rL.A0D(A04, "value", str4);
            }
            if (C626836d.A0M(str5, 1, 100, false)) {
                C56052rL.A0D(A04, "offset", str5);
            }
            if (C626836d.A0M(str6, 1, 100, false)) {
                C56052rL.A0D(A04, "currency", str6);
            }
            C56052rL.A07(A04, A03);
        } else {
            if (C626836d.A0M(str4, 6, 6, false)) {
                C56052rL.A0D(A03, "debit-last-6", str4);
            }
            if (C626836d.A0M(str5, 1, 2, false)) {
                C56052rL.A0D(A03, "debit-exp-month", str5);
            }
            if (C626836d.A0M(str6, 2, 2, false)) {
                C56052rL.A0D(A03, "debit-exp-year", str6);
            }
        }
        C41032Ir.A0A(A03, this);
    }

    public C35371wl(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C56052rL A04 = C56052rL.A04("account");
        String str8 = str;
        if (C626836d.A0M(str8, 1, 1000, false)) {
            C56052rL.A0D(A04, "vpa", str8);
        }
        String str9 = str2;
        if (C626836d.A0M(str9, 1, 1000, false)) {
            C56052rL.A0D(A04, "vpa-id", str9);
        }
        String str10 = str3;
        if (C626836d.A0M(str10, 1, 200, false)) {
            C56052rL.A0D(A04, "credential-id", str10);
        }
        String str11 = str4;
        if (C626836d.A0M(str11, 1, 1000, false)) {
            C56052rL.A0D(A04, "device-id", str11);
        }
        String str12 = str5;
        if (C626836d.A0M(str12, 1, 1000, false)) {
            C56052rL.A0D(A04, "mpin", str12);
        }
        String str13 = str6;
        if (C626836d.A0M(str13, 0, 35, false)) {
            C56052rL.A0D(A04, "seq-no", str13);
        }
        String str14 = str7;
        if (C626836d.A0M(str14, 0, 9007199254740991L, false)) {
            C56052rL.A0D(A04, "upi-bank-info", str14);
        }
        C41032Ir.A0A(A04, this);
    }

    public C35371wl(byte[] bArr, int i) {
        AnonymousClass36K A0F;
        if (3 - i != 0) {
            C56052rL A03 = C56052rL.A03();
            C56052rL A04 = C56052rL.A04("reporting");
            C56052rL A042 = C56052rL.A04("reporting_tag");
            C626836d.A0H(bArr, 16, 128);
            C56052rL.A09(A042, A04, bArr);
            C56052rL.A07(A04, A03);
            A0F = A03.A0F();
        } else {
            C56052rL A032 = C56052rL.A03();
            C626836d.A0H(bArr, 1, 120);
            A032.A01 = bArr;
            A0F = A032.A0F();
        }
        this.A00 = A0F;
    }
}
