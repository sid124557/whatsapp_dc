package X;

/* renamed from: X.09x  reason: invalid class name and case insensitive filesystem */
public final class C012609x extends AnonymousClass0NF {
    public static final C012609x A00 = new C012609x();

    public void A00(C17430vW r2) {
        C162457s7.A0J(r2, 0);
        r2.B2q("UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL ");
        r2.B2q("UPDATE workspec SET content_uri_triggers = x'' WHERE content_uri_triggers is NULL");
    }

    public C012609x() {
        super(12, 13);
    }
}
