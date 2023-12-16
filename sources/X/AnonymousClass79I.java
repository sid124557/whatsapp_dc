package X;

/* renamed from: X.79I  reason: invalid class name */
public final class AnonymousClass79I {
    public static final String A00;
    public static final String A01;
    public static final String A02;
    public static final String A03;

    static {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("SELECT ");
        String[] strArr = C1457277b.A00;
        A0o.append(C379324p.A00(", ", strArr));
        A0o.append(" FROM ");
        A0o.append("methods");
        A0o.append(" WHERE ");
        A00 = AnonymousClass000.A0X("credential_id = ?", A0o);
        StringBuilder A0l = AnonymousClass000.A0l("SELECT ");
        AnonymousClass001.A1K(C379324p.A00(", ", strArr), " FROM ", "methods", A0l);
        A0l.append(" ORDER BY ");
        A03 = AnonymousClass000.A0X("debit_mode DESC", A0l);
        StringBuilder A0l2 = AnonymousClass000.A0l("SELECT ");
        C18260x0.A0p(C379324p.A00(", ", strArr), " FROM ", "methods", " WHERE ", A0l2);
        A02 = AnonymousClass000.A0U("type != ? AND type != ?", " ORDER BY ", "debit_mode DESC", A0l2);
        StringBuilder A0l3 = AnonymousClass000.A0l("SELECT ");
        C18260x0.A0p(C379324p.A00(", ", strArr), " FROM ", "methods", " WHERE ", A0l3);
        A01 = AnonymousClass000.A0X("type = ?", A0l3);
    }
}
