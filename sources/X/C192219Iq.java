package X;

import java.util.ArrayList;

/* renamed from: X.9Iq  reason: invalid class name and case insensitive filesystem */
public final class C192219Iq extends C35201wU {
    public static final ArrayList A00 = C18260x0.A0C("0", "1");
    public static final ArrayList A01 = C18260x0.A0C("0", "1");

    public C192219Iq(C35371wl r22, AnonymousClass9IQ r23, AnonymousClass9IP r24, AnonymousClass9IR r25, AnonymousClass9IS r26, Long l, Long l2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        C56052rL A012 = C56052rL.A01();
        C1899593h.A1M(A012);
        C56052rL A0U = C1899593h.A0U();
        C56052rL.A0D(A0U, "action", "upi-create-mandate");
        C1899593h.A1O(A0U, str, false);
        String str16 = str2;
        if (C626836d.A0M(str16, 0, 35, false)) {
            C56052rL.A0D(A0U, "seq-no", str16);
        }
        String str17 = str3;
        if (C626836d.A0M(str17, 1, 100, false)) {
            C56052rL.A0D(A0U, "sender-vpa", str17);
        }
        String str18 = str4;
        if (C626836d.A0M(str18, 1, 100, false)) {
            C56052rL.A0D(A0U, "receiver-vpa", str18);
        }
        String str19 = str5;
        if (C626836d.A0M(str19, 0, 1000, false)) {
            C56052rL.A0D(A0U, "upi-bank-info", str19);
        }
        String str20 = str6;
        if (str6 != null && C1899693i.A11(str20, 0, true)) {
            C56052rL.A0D(A0U, "mandate-name", str20);
        }
        Long l3 = l;
        if (C626836d.A0J(l3, 0, 9007199254740991L, false)) {
            C56052rL.A0A(A0U, l3, "start-ts");
        }
        Long l4 = l2;
        if (C626836d.A0J(l4, 0, 9007199254740991L, false)) {
            C56052rL.A0A(A0U, l4, "end-ts");
        }
        String str21 = str7;
        if (str7 != null && C626836d.A0M(str21, 1, 2, true)) {
            C56052rL.A0D(A0U, "recurrence-day", str21);
        }
        String str22 = str8;
        if (C626836d.A0M(str22, 0, 1000, false)) {
            C56052rL.A0D(A0U, "mpin", str22);
        }
        String str23 = str9;
        if (C626836d.A0M(str23, 1, 100, false)) {
            C56052rL.A0D(A0U, "receiver-name", str23);
        }
        String str24 = str10;
        if (C626836d.A0M(str24, 1, 100, false)) {
            C56052rL.A0D(A0U, "purpose-code", str24);
        }
        String str25 = str11;
        if (C626836d.A0M(str25, 0, 4, false)) {
            C56052rL.A0D(A0U, "mcc", str25);
        }
        String str26 = str12;
        if (str12 != null && C626836d.A0M(str26, 1, 255, true)) {
            C56052rL.A0D(A0U, "ref-id", str26);
        }
        String str27 = str13;
        if (str13 != null && C626836d.A0M(str27, 1, 2, true)) {
            C56052rL.A0D(A0U, "initiation-mode", str27);
        }
        String str28 = str14;
        if (C1899593h.A1Y(str28, 1, false)) {
            C56052rL.A0D(A0U, "credential-id", str28);
        }
        A0U.A0L(str15, "is-revocable", A00);
        A0U.A0L("1", "share-to-payee", A01);
        C41032Ir.A0E(A0U, r22, "amount");
        C41032Ir.A08(A0U, r23);
        C41032Ir.A08(A0U, r25);
        AnonymousClass9IS r1 = r26;
        if (r26 != null) {
            C41032Ir.A08(A0U, r1);
        }
        C41032Ir.A07(A0U, A012, r24, this);
    }
}
