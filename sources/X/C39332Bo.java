package X;

/* renamed from: X.2Bo  reason: invalid class name and case insensitive filesystem */
public final class C39332Bo {
    public static final String A00;
    public static final String A01;

    static {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("SELECT ");
        String[] strArr = C39002Ah.A00;
        String A10 = AnonymousClass0x9.A10(C379324p.A00(", ", strArr), A0o);
        AnonymousClass0x2.A1P(A0o, "settings");
        A01 = AnonymousClass000.A0X("jid = ?", A0o);
        A00 = AnonymousClass000.A0U(C379324p.A00(", ", strArr), A10, "settings", AnonymousClass000.A0l("SELECT "));
    }
}
