package X;

/* renamed from: X.6sW  reason: invalid class name and case insensitive filesystem */
public final class C139726sW extends C34771vn {
    public final AnonymousClass36K A00;
    public final C138966rI A01;
    public final C138646ql A02;

    public C139726sW(AnonymousClass36K r12, C35721xK r13) {
        AnonymousClass36K A022 = C41032Ir.A02(r12, r13);
        C626836d.A05(r12, Long.class, AnonymousClass0x2.A0U(), AnonymousClass0x2.A0S(), (Object) null, new String[]{"error", "backoff"}, false);
        this.A01 = (C138966rI) C626836d.A02(r12, new AnonymousClass92Z(A022, 36), 0);
        AnonymousClass4B7[] r1 = new AnonymousClass4B7[3];
        C1896292a.A0U(r1, 269, 0);
        C1896292a.A0P(r1, 270);
        C1896292a.A0Q(r1, 271);
        this.A02 = (C138646ql) C626836d.A07(r12, "IQErrorRateOverlimit|IQErrorInternalServerError|IQErrorServiceUnavailable", AnonymousClass0x2.A0i(r1), new String[]{"error"});
        this.A00 = r12;
        this.A00 = (AnonymousClass36K) C1896292a.A0N(r12, new String[]{"error"}, 272).get(0);
    }
}
