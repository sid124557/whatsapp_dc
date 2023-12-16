package X;

/* renamed from: X.6sJ  reason: invalid class name and case insensitive filesystem */
public class C139596sJ extends C41022Iq implements C84774Dq, C84784Dr, C84794Ds {
    public final int A00;

    public C139596sJ(AnonymousClass36K r10, int i) {
        Long A0R;
        Long A0S;
        String[] A1a;
        Class<Long> cls;
        long j;
        this.A00 = i;
        AnonymousClass36K r2 = r10;
        String[] A02 = C41022Iq.A02(r10);
        Class<String> cls2 = String.class;
        switch (i) {
            case 0:
                A0R = AnonymousClass0x2.A0R();
                A0S = AnonymousClass0x2.A0S();
                C626836d.A06(r2, cls2, A0R, A0S, "forbidden", A02, false);
                A1a = AnonymousClass6C9.A1a();
                cls = Long.class;
                j = 403;
                break;
            case 1:
                A0R = AnonymousClass0x2.A0R();
                A0S = AnonymousClass0x2.A0S();
                C626836d.A06(r2, cls2, A0R, A0S, "internal-server-error", A02, false);
                A1a = AnonymousClass6C9.A1a();
                cls = Long.class;
                j = 500;
                break;
            default:
                A0R = AnonymousClass0x2.A0R();
                A0S = AnonymousClass0x2.A0S();
                C626836d.A06(r2, cls2, A0R, A0S, "rate-overlimit", A02, false);
                A1a = AnonymousClass6C9.A1a();
                cls = Long.class;
                j = 429;
                break;
        }
        C626836d.A06(r2, cls, A0R, A0S, Long.valueOf(j), A1a, false);
        this.A00 = r10;
    }

    public Long B5b() {
        long j;
        switch (this.A00) {
            case 0:
                j = 403;
                break;
            case 1:
                j = 500;
                break;
            default:
                j = 429;
                break;
        }
        return Long.valueOf(j);
    }

    public String BDZ() {
        switch (this.A00) {
            case 0:
                return "forbidden";
            case 1:
                return "internal-server-error";
            default:
                return "rate-overlimit";
        }
    }
}
