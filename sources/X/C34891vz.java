package X;

/* renamed from: X.1vz  reason: invalid class name and case insensitive filesystem */
public final class C34891vz extends C41022Iq {
    public final AnonymousClass36K A00;
    public final AnonymousClass36K A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public C34891vz(AnonymousClass36K r21) {
        AnonymousClass36K r6 = r21;
        AnonymousClass36K.A0N(r6, "colors");
        Class<String> cls = String.class;
        Long A0R = AnonymousClass0x2.A0R();
        Long A0S = AnonymousClass0x2.A0S();
        this.A04 = (String) C626836d.A05(r6, cls, A0R, A0S, (Object) null, new String[]{"light", "background"}, false);
        this.A05 = (String) C626836d.A05(r6, cls, A0R, A0S, (Object) null, new String[]{"light", "highlight"}, false);
        this.A02 = (String) C626836d.A05(r6, cls, A0R, A0S, (Object) null, new String[]{"dark", "background"}, false);
        this.A03 = (String) C626836d.A05(r6, cls, A0R, A0S, (Object) null, new String[]{"dark", "highlight"}, false);
        this.A00 = r6;
        AnonymousClass36K r13 = r6;
        this.A00 = (AnonymousClass36K) C626836d.A0B(r13, C86304Jp.A00(110), new String[]{"dark"}, 1, 1).get(0);
        this.A01 = (AnonymousClass36K) C626836d.A0B(r13, C86304Jp.A00(111), new String[]{"light"}, 1, 1).get(0);
    }
}
