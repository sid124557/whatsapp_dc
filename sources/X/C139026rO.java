package X;

/* renamed from: X.6rO  reason: invalid class name and case insensitive filesystem */
public class C139026rO extends C41022Iq implements C179878jr {
    public Object A00;
    public final int A01;

    public C139026rO(AnonymousClass36K r10, int i) {
        Long A0R;
        Long A0S;
        String[] A1a;
        Class<Long> cls;
        long j;
        this.A01 = i;
        AnonymousClass36K r2 = r10;
        String[] A02 = C41022Iq.A02(r10);
        Class<String> cls2 = String.class;
        if (i != 0) {
            A0R = AnonymousClass0x2.A0R();
            A0S = AnonymousClass0x2.A0S();
            C626836d.A06(r2, cls2, A0R, A0S, "email-too-recent", A02, false);
            A1a = AnonymousClass6C9.A1a();
            cls = Long.class;
            j = 534;
        } else {
            A0R = AnonymousClass0x2.A0R();
            A0S = AnonymousClass0x2.A0S();
            C626836d.A06(r2, cls2, A0R, A0S, "email-too-many", A02, false);
            A1a = AnonymousClass6C9.A1a();
            cls = Long.class;
            j = 535;
        }
        C626836d.A06(r2, cls, A0R, A0S, Long.valueOf(j), A1a, false);
        this.A00 = C626836d.A05(r2, cls, AnonymousClass0x2.A0T(), A0S, (Object) null, new String[]{"wait_time"}, false);
        this.A00 = r10;
    }
}
