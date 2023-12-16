package X;

/* renamed from: X.60G  reason: invalid class name */
public final class AnonymousClass60G extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ AnonymousClass5ZL this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass60G(AnonymousClass5ZL r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Number A0i;
        int A0K = AnonymousClass001.A0K(obj);
        AnonymousClass5ZL r0 = this.this$0;
        C56532s8 r1 = r0.A0E;
        r1.A02 = A0K;
        r0.A08.A0H(r1);
        AnonymousClass5ZL r5 = this.this$0;
        AnonymousClass5P2 r4 = r5.A09;
        if (A0K != 98) {
            C112365jc r2 = r4.A04;
            AnonymousClass5U8 r02 = r2.A02;
            r02.A01.removeCallbacks(r02.A08);
            r2.A01.A00();
            r4.A02.A05();
            AnonymousClass5OJ r12 = r5.A0A.A00;
            synchronized (r12) {
                r12.A01 = null;
                r12.A03 = null;
                r12.A00 = null;
                r12.A02 = null;
            }
        } else {
            AnonymousClass5U8 r3 = r4.A04.A02;
            if (r3.A00 == null) {
                r3.A07.BkM(new C117125rQ(r3, 35));
            }
        }
        if (r5.A07() || ((A0i = C86654Ky.A0i(r5.A05)) != null && A0i.intValue() == 98)) {
            r4.A02.A05();
        }
        return C59022wD.A00;
    }
}
