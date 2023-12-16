package X;

/* renamed from: X.2t0  reason: invalid class name and case insensitive filesystem */
public final class C57062t0 {
    public static final AnonymousClass303 A00() {
        AnonymousClass303 r2 = new AnonymousClass303((String) null, new AnonymousClass303[0]);
        r2.A03("p2m_type", "p2m_lite");
        r2.A03("merchant_type", "api");
        return r2;
    }

    public static final String A01(Integer num) {
        if (num == null) {
            return "UNKNOWN";
        }
        int intValue = num.intValue();
        if (intValue == 1) {
            return "DIGITAL_GOODS";
        }
        if (intValue == 2) {
            return "PHYSICAL_GOODS";
        }
        return "UNKNOWN";
    }
}
