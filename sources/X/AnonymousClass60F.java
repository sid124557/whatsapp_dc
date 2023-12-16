package X;

/* renamed from: X.60F  reason: invalid class name */
public final class AnonymousClass60F extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ AnonymousClass5ZL this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass60F(AnonymousClass5ZL r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str = (String) obj;
        if (str != null) {
            AnonymousClass5OJ r1 = this.this$0.A0A.A00;
            synchronized (r1) {
                if (str.length() == 0 || r1.A00 == null || r1.A02 == null) {
                    r1.A00 = C86604Kt.A0k();
                    r1.A02 = C86604Kt.A0k();
                }
            }
            synchronized (r1) {
                r1.A01 = C86604Kt.A0k();
                r1.A03 = C86604Kt.A0k();
            }
        }
        AnonymousClass5ZL r12 = this.this$0;
        r12.A00 = Integer.MAX_VALUE;
        r12.A0E.A05(str);
        if (!r12.A07()) {
            AnonymousClass5ZL r0 = this.this$0;
            r0.A08.A0H(r0.A0E);
        }
        return C59022wD.A00;
    }
}
