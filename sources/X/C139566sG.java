package X;

/* renamed from: X.6sG  reason: invalid class name and case insensitive filesystem */
public class C139566sG extends C41022Iq implements C183498q8 {
    public final int A00;

    public C139566sG(AnonymousClass36K r10, int i) {
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
                C626836d.A06(r2, cls2, A0R, A0S, "bad-request", A02, false);
                A1a = AnonymousClass6C9.A1a();
                cls = Long.class;
                j = 400;
                break;
            case 1:
                A0R = AnonymousClass0x2.A0R();
                A0S = AnonymousClass0x2.A0S();
                C626836d.A06(r2, cls2, A0R, A0S, "invalid-direct-connection-encrypted-info", A02, false);
                A1a = AnonymousClass6C9.A1a();
                cls = Long.class;
                j = 421;
                break;
            case 2:
                A0R = AnonymousClass0x2.A0R();
                A0S = AnonymousClass0x2.A0S();
                C626836d.A06(r2, cls2, A0R, A0S, "internal-server-error", A02, false);
                A1a = AnonymousClass6C9.A1a();
                cls = Long.class;
                j = 500;
                break;
            case 3:
                A0R = AnonymousClass0x2.A0R();
                A0S = AnonymousClass0x2.A0S();
                C626836d.A06(r2, cls2, A0R, A0S, "item-not-found", A02, false);
                A1a = AnonymousClass6C9.A1a();
                cls = Long.class;
                j = 404;
                break;
            case 4:
                A0R = AnonymousClass0x2.A0R();
                A0S = AnonymousClass0x2.A0S();
                C626836d.A06(r2, cls2, A0R, A0S, "not-authorized", A02, false);
                A1a = AnonymousClass6C9.A1a();
                cls = Long.class;
                j = 401;
                break;
            case 5:
                A0R = AnonymousClass0x2.A0R();
                A0S = AnonymousClass0x2.A0S();
                C626836d.A06(r2, cls2, A0R, A0S, "service-unavailable", A02, false);
                A1a = AnonymousClass6C9.A1a();
                cls = Long.class;
                j = 503;
                break;
            default:
                A0R = AnonymousClass0x2.A0R();
                A0S = AnonymousClass0x2.A0S();
                C626836d.A06(r2, cls2, A0R, A0S, "commerce-features-disabled", A02, false);
                A1a = AnonymousClass6C9.A1a();
                cls = Long.class;
                j = 451;
                break;
        }
        C626836d.A06(r2, cls, A0R, A0S, Long.valueOf(j), A1a, false);
        this.A00 = r10;
    }

    public Long B5b() {
        long j;
        switch (this.A00) {
            case 0:
                j = 400;
                break;
            case 1:
                j = 421;
                break;
            case 2:
                j = 500;
                break;
            case 3:
                j = 404;
                break;
            case 4:
                j = 401;
                break;
            case 5:
                j = 503;
                break;
            default:
                j = 451;
                break;
        }
        return Long.valueOf(j);
    }
}
