package X;

/* renamed from: X.6rP  reason: invalid class name and case insensitive filesystem */
public class C139036rP extends C41022Iq implements C179878jr, C179888js {
    public C139036rP(AnonymousClass36K r10, int i) {
        Long A0R;
        Long A0S;
        String[] A1a;
        Class<Long> cls;
        long j;
        AnonymousClass36K r2 = r10;
        String[] A02 = C41022Iq.A02(r10);
        Class<String> cls2 = String.class;
        if (i != 0) {
            A0R = AnonymousClass0x2.A0R();
            A0S = AnonymousClass0x2.A0S();
            C626836d.A06(r2, cls2, A0R, A0S, "internal-server-error", A02, false);
            A1a = AnonymousClass6C9.A1a();
            cls = Long.class;
            j = 500;
        } else {
            A0R = AnonymousClass0x2.A0R();
            A0S = AnonymousClass0x2.A0S();
            C626836d.A06(r2, cls2, A0R, A0S, "forbidden", A02, false);
            A1a = AnonymousClass6C9.A1a();
            cls = Long.class;
            j = 403;
        }
        C626836d.A06(r2, cls, A0R, A0S, Long.valueOf(j), A1a, false);
        this.A00 = r10;
    }
}
