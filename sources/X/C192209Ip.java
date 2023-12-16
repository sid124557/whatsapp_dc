package X;

import java.util.ArrayList;

/* renamed from: X.9Ip  reason: invalid class name and case insensitive filesystem */
public final class C192209Ip extends C35201wU {
    public static final ArrayList A00 = C18260x0.A0C("0", "1");
    public static final ArrayList A01 = C18260x0.A0C("1", "2");

    public C192209Ip(AnonymousClass9IP r12, Long l, Long l2, String str, String str2, String str3, String str4, String str5) {
        C56052rL A012 = C56052rL.A01();
        C1899593h.A1M(A012);
        C56052rL A0U = C1899593h.A0U();
        C56052rL.A0D(A0U, "action", "upi-bind-device");
        if (C1899593h.A1Z(str, 1, false)) {
            C56052rL.A0D(A0U, "device-id", str);
        }
        String str6 = str2;
        if (C626836d.A0M(str6, 1, 35, false)) {
            C56052rL.A0D(A0U, "verification-data", str6);
        }
        String str7 = str3;
        if (C1899693i.A0z(str7, 1, false)) {
            C56052rL.A0D(A0U, "provider-type", str7);
        }
        String str8 = str4;
        if (str4 != null && C1899593h.A1Y(str8, 1, true)) {
            C56052rL.A0D(A0U, "sms-phone-number", str8);
        }
        if (l != null && C626836d.A0K(l, true)) {
            C56052rL.A0A(A0U, l, "delay");
        }
        if (l2 != null && C626836d.A0K(l2, true)) {
            C56052rL.A0A(A0U, l2, "counter");
        }
        A0U.A0L("2", "version", A01);
        A0U.A0K(str5, "existing-account", A00);
        C35201wU.A01(A0U, A012, r12, this);
    }
}
