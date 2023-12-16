package X;

/* renamed from: X.60L  reason: invalid class name */
public final class AnonymousClass60L extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ AnonymousClass5ZL this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass60L(AnonymousClass5ZL r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Number number = (Number) obj;
        AnonymousClass5ZL r3 = this.this$0;
        if (number != null) {
            r3.A01 = number.intValue();
        }
        if (r3.A07()) {
            r3.A0F.execute(new C117175rV(r3, 45, number));
        }
        Number A0i = C86654Ky.A0i(r3.A05);
        if (A0i != null && A0i.intValue() == 98) {
            C86654Ky.A1O(r3.A0F, r3, number, r3.A07.A07(), 12);
        }
        return C59022wD.A00;
    }
}
