package X;

import java.util.ArrayList;

/* renamed from: X.6sP  reason: invalid class name and case insensitive filesystem */
public final class C139656sP extends C35561x4 {
    public static final ArrayList A00 = AnonymousClass0x2.A0i(new String[]{"active", "active_pending", "active_status_pending", "available", "blocked", "deregistered", "deregistered_pending", "inactive", "inactive_status_pending", "unknown"});
    public static final ArrayList A01 = C18260x0.A0C("mobile_number", "numeric_id");

    public C139656sP(String str, String str2, String str3, String str4) {
        C56052rL r2 = new C56052rL("alias");
        if (C626836d.A0M(str, 8, 10, false)) {
            C56052rL.A0D(r2, "alias_value", str);
        }
        if (C626836d.A0M(str2, 1, 20, false)) {
            C56052rL.A0D(r2, "alias_id", str2);
        }
        r2.A0L(str3, "alias_type", A01);
        r2.A0K(str4, "alias_status", A00);
        this.A00 = r2.A0F();
    }
}
