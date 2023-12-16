package X;

/* renamed from: X.9Qo  reason: invalid class name */
public final /* synthetic */ class AnonymousClass9Qo {
    public final /* synthetic */ C1901594f A00;

    public final void A00(AnonymousClass39Q r6, AnonymousClass39Q r7, AnonymousClass34V r8) {
        C1901594f r4 = this.A00;
        AnonymousClass08M r1 = r4.A01;
        AnonymousClass9OX r0 = new AnonymousClass9OX();
        r0.A01 = true;
        r1.A0H(r0);
        if (r8 != null || r6 == null || r7 == null) {
            C160757oG r2 = r4.A06;
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("error: ");
            r2.A04(AnonymousClass000.A0X(r8.A08, A0o));
            AnonymousClass9PP r12 = new AnonymousClass9PP(1);
            r12.A00 = r8;
            r4.A07.A0H(r12);
            return;
        }
        AnonymousClass9PP r3 = new AnonymousClass9PP(0);
        C85204Fi r22 = AnonymousClass1S3.A05;
        C620733j r13 = r4.A03;
        r3.A01 = r22.B3V(r13, r6);
        r3.A02 = r22.B3V(r13, r7);
        r4.A07.A0H(r3);
    }

    public /* synthetic */ AnonymousClass9Qo(C1901594f r1) {
        this.A00 = r1;
    }
}
