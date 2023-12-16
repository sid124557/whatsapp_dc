package X;

/* renamed from: X.8KK  reason: invalid class name */
public final class AnonymousClass8KK implements C84974El {
    public final /* synthetic */ AnonymousClass8JG A00;

    public AnonymousClass8KK(AnonymousClass8JG r1) {
        this.A00 = r1;
    }

    public void BEp(C35781xQ r6) {
        AnonymousClass8JG r4 = this.A00;
        String str = r6.A01;
        C162457s7.A0D(str);
        C150437Qs r2 = r4.A03;
        Class cls = r4.A00.A00.A01;
        C162457s7.A0K(cls, "null cannot be cast to non-null type java.lang.Class<T of com.whatsapp.infra.graphql.MexIqHandler>");
        Object A002 = r2.A00(str, cls);
        if (!(A002 instanceof AnonymousClass3Z0)) {
            try {
                C188028yC r1 = r4.A01;
                C57682u2.A01(A002);
                C162457s7.A0K(A002, "null cannot be cast to non-null type com.whatsapp.infra.graphql.MexResponse<T of com.whatsapp.infra.graphql.MexIqHandler>");
                r1.Ba9((C27871eo) A002);
            } catch (Throwable th) {
                r4.A01.BSt(th);
            }
        } else {
            C188028yC r3 = r4.A01;
            Throwable A003 = AnonymousClass3Z9.A00(A002);
            if (A003 == null) {
                A003 = new C135066k4("Unknown error", (Throwable) null);
            }
            r3.BSt(A003);
        }
    }

    public void BEq(C139776sb r3) {
        AnonymousClass8JG r0 = this.A00;
        r0.A01.BSt(new C135096k7(r3));
    }

    public void BEr(C139726sW r3) {
        AnonymousClass8JG r0 = this.A00;
        r0.A01.BSt(new C135106k8(r3));
    }
}
