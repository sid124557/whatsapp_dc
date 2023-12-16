package X;

/* renamed from: X.6sK  reason: invalid class name and case insensitive filesystem */
public class C139606sK extends C41022Iq implements C84794Ds {
    public final int A00;

    public C139606sK(AnonymousClass36K r10, int i) {
        Long A0R;
        Long A0S;
        String[] A1a;
        Class<Long> cls;
        long j;
        this.A00 = i;
        AnonymousClass36K r2 = r10;
        String[] A02 = C41022Iq.A02(r10);
        Class<String> cls2 = String.class;
        if (i != 0) {
            A0R = AnonymousClass0x2.A0R();
            A0S = AnonymousClass0x2.A0S();
            C626836d.A06(r2, cls2, A0R, A0S, "bad-request", A02, false);
            A1a = AnonymousClass6C9.A1a();
            cls = Long.class;
            j = 400;
        } else {
            A0R = AnonymousClass0x2.A0R();
            A0S = AnonymousClass0x2.A0S();
            C626836d.A06(r2, cls2, A0R, A0S, "already-exists", A02, false);
            A1a = AnonymousClass6C9.A1a();
            cls = Long.class;
            j = 304;
        }
        C626836d.A06(r2, cls, A0R, A0S, Long.valueOf(j), A1a, false);
        this.A00 = r10;
    }

    public Long B5b() {
        long j;
        if (this.A00 != 0) {
            j = 400;
        } else {
            j = 304;
        }
        return Long.valueOf(j);
    }

    public String BDZ() {
        if (this.A00 != 0) {
            return "bad-request";
        }
        return "already-exists";
    }
}
