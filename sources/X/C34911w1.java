package X;

/* renamed from: X.1w1  reason: invalid class name and case insensitive filesystem */
public class C34911w1 extends C41022Iq {
    public final int A00;

    public C34911w1(AnonymousClass36K r10, int i) {
        Long A0R;
        Long A0S;
        String[] strArr;
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
                strArr = new String[]{"code"};
                cls = Long.class;
                j = 400;
                break;
            case 1:
                A0R = AnonymousClass0x2.A0R();
                A0S = AnonymousClass0x2.A0S();
                C626836d.A06(r2, cls2, A0R, A0S, "forbidden", A02, false);
                strArr = new String[]{"code"};
                cls = Long.class;
                j = 403;
                break;
            case 2:
                A0R = AnonymousClass0x2.A0R();
                A0S = AnonymousClass0x2.A0S();
                C626836d.A06(r2, cls2, A0R, A0S, "internal-server-error", A02, false);
                strArr = new String[]{"code"};
                cls = Long.class;
                j = 500;
                break;
            default:
                A0R = AnonymousClass0x2.A0R();
                A0S = AnonymousClass0x2.A0S();
                C626836d.A06(r2, cls2, A0R, A0S, "not-allowed", A02, false);
                strArr = new String[]{"code"};
                cls = Long.class;
                j = 405;
                break;
        }
        C626836d.A06(r2, cls, A0R, A0S, Long.valueOf(j), strArr, false);
        this.A00 = r10;
    }

    public String A00() {
        switch (this.A00) {
            case 0:
                return "bad-request";
            case 1:
                return "forbidden";
            case 2:
                return "internal-server-error";
            default:
                return "not-allowed";
        }
    }
}
