package X;

import java.util.ArrayList;

/* renamed from: X.9Ir  reason: invalid class name and case insensitive filesystem */
public final class C192229Ir extends C35201wU {
    public static final ArrayList A00 = C18260x0.A0C("0", "1");
    public static final ArrayList A01 = C18260x0.A0C("0", "1");
    public static final ArrayList A02 = C1899593h.A0e("FBPAY", "NOVI", "UPI");
    public static final ArrayList A03 = C18260x0.A0C("1", "2");

    public C192229Ir(C35351wj r8, Long l) {
        C56052rL A012 = C56052rL.A01();
        C56052rL A04 = C56052rL.A04("accept_pay");
        if (l != null && C626836d.A0K(l, true)) {
            C56052rL.A0A(A04, l, "tos-version");
        }
        A04.A0K("UPI", "service", A02);
        A04.A0L("2", "version", A03);
        A04.A0K("1", "consumer", A00);
        C35201wU.A01(A04, A012, r8, this);
    }
}
