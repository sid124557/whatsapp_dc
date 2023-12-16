package X;

/* renamed from: X.6rm  reason: invalid class name and case insensitive filesystem */
public class C139266rm extends C41022Iq implements C183428q1, C183438q2, C183448q3, C183458q4, C184628sF {
    public final int A00;

    public C139266rm(AnonymousClass36K r10, int i) {
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
            C626836d.A06(r2, cls2, A0R, A0S, "rate-overlimit", A02, false);
            A1a = AnonymousClass6C9.A1a();
            cls = Long.class;
            j = 429;
        } else {
            A0R = AnonymousClass0x2.A0R();
            A0S = AnonymousClass0x2.A0S();
            C626836d.A06(r2, cls2, A0R, A0S, "bad-request", A02, false);
            A1a = AnonymousClass6C9.A1a();
            cls = Long.class;
            j = 400;
        }
        C626836d.A06(r2, cls, A0R, A0S, Long.valueOf(j), A1a, false);
        this.A00 = r10;
    }

    public void AwD(C157177hr r3) {
        if (this.A00 != 0) {
            r3.A00();
        } else {
            r3.A00.A01.AwB(C18280x3.A0S());
        }
    }

    public Long B5b() {
        long j;
        if (this.A00 != 0) {
            j = 429;
        } else {
            j = 400;
        }
        return Long.valueOf(j);
    }

    public String BDZ() {
        if (this.A00 != 0) {
            return "rate-overlimit";
        }
        return "bad-request";
    }
}
