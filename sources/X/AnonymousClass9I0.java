package X;

import java.util.ArrayList;

/* renamed from: X.9I0  reason: invalid class name */
public final class AnonymousClass9I0 extends C41022Iq {
    public static final ArrayList A00 = AnonymousClass0x2.A0i(new String[]{"active", "active_pending", "active_status_pending", "available", "blocked", "deregistered", "deregistered_pending", "inactive", "inactive_status_pending", "unknown"});
    public static final ArrayList A01 = C18260x0.A0C("mobile_number", "numeric_id");

    public AnonymousClass9I0(AnonymousClass36K r10) {
        AnonymousClass36K r2 = r10;
        AnonymousClass36K.A0N(r10, "alias");
        Class<String> cls = String.class;
        C626836d.A06(r2, cls, 8L, 10L, (Object) null, new String[]{"alias_value"}, false);
        C626836d.A06(r2, cls, AnonymousClass0x2.A0U(), AnonymousClass6C9.A0Y(), (Object) null, new String[]{"alias_id"}, false);
        AnonymousClass6C8.A13(r10, "alias_type", A01);
        C41022Iq.A01(r10, "alias_status", A00);
        this.A00 = r10;
    }
}
