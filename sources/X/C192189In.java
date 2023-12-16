package X;

import java.util.ArrayList;

/* renamed from: X.9In  reason: invalid class name and case insensitive filesystem */
public final class C192189In extends C35201wU {
    public static final ArrayList A00 = C18260x0.A0C("AADHAAR", "BANK");

    public C192189In(AnonymousClass9IP r6, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C56052rL A01 = C56052rL.A01();
        C1899593h.A1M(A01);
        C56052rL A0U = C1899593h.A0U();
        C56052rL.A0D(A0U, "action", "upi-generate-otp");
        if (str != null && C1899593h.A1X(str)) {
            C56052rL.A0D(A0U, "vpa", str);
        }
        if (str2 != null && C1899593h.A1X(str2)) {
            C56052rL.A0D(A0U, "vpa-id", str2);
        }
        C1899593h.A1O(A0U, str3, false);
        if (C1899693i.A10(str4, 1, false)) {
            C56052rL.A0D(A0U, "upi-bank-info", str4);
        }
        if (str5 != null && C1899593h.A1Y(str5, 1, true)) {
            C56052rL.A0D(A0U, "partial-aadhaar", str5);
        }
        if (str6 != null && C1899693i.A0z(str6, 1, true)) {
            C56052rL.A0D(A0U, "provider-type", str6);
        }
        A0U.A0K(str7, "otp-type", A00);
        C35201wU.A01(A0U, A01, r6, this);
    }
}
