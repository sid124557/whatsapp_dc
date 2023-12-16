package X;

/* renamed from: X.43w  reason: invalid class name and case insensitive filesystem */
public final class C825143w extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ AnonymousClass4GQ $onError;
    public final /* synthetic */ C47072cf this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C825143w(C47072cf r2, AnonymousClass4GQ r3) {
        super(1);
        this.this$0 = r2;
        this.$onError = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object r3;
        AnonymousClass28J r5 = (AnonymousClass28J) obj;
        C162457s7.A0J(r5, 0);
        if (r5 instanceof AnonymousClass1kq) {
            r3 = ((AnonymousClass1kq) r5).A00;
        } else if (r5 instanceof AnonymousClass1kp) {
            r3 = new AnonymousClass1l9(((AnonymousClass1kp) r5).A00);
        } else if (r5 instanceof C29651ks) {
            r3 = new AnonymousClass1l9(((C29651ks) r5).A00);
        } else if (r5 instanceof AnonymousClass1kr) {
            r3 = new C29731lA(((AnonymousClass1kr) r5).A00);
        } else if (r5 instanceof C29641ko) {
            r3 = new C29741lB(0);
        } else {
            throw C73153f1.A00();
        }
        this.this$0.A00.A0S(C70133a0.A00(this.$onError, r3, 13));
        return C59022wD.A00;
    }
}
