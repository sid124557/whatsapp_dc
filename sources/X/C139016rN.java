package X;

import java.util.ArrayList;

/* renamed from: X.6rN  reason: invalid class name and case insensitive filesystem */
public final class C139016rN extends C41022Iq {
    public static final ArrayList A04 = AnonymousClass0x2.A0i(new String[]{"active", "active_pending", "active_status_pending", "available", "blocked", "deregistered", "deregistered_pending", "inactive", "inactive_status_pending", "unknown"});
    public static final ArrayList A05 = C18260x0.A0C("mobile_number", "numeric_id");
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public C139016rN(AnonymousClass36K r10) {
        AnonymousClass36K r2 = r10;
        AnonymousClass36K.A0N(r10, "alias");
        Class<String> cls = String.class;
        this.A03 = (String) C626836d.A06(r2, cls, 8L, 10L, (Object) null, new String[]{"alias_value"}, false);
        this.A00 = (String) C626836d.A06(r2, cls, AnonymousClass0x2.A0U(), AnonymousClass6C9.A0Y(), (Object) null, new String[]{"alias_id"}, false);
        this.A02 = AnonymousClass6C9.A0d(r10, "alias_type", A05);
        this.A01 = C626836d.A09(r10, A04, new String[]{"alias_status"});
        this.A00 = r10;
    }
}
