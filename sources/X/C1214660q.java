package X;

/* renamed from: X.60q  reason: invalid class name and case insensitive filesystem */
public final class C1214660q extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ C87334Pd this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1214660q(C87334Pd r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str = (String) obj;
        C162457s7.A0J(str, 0);
        AnonymousClass5R5 r0 = this.this$0.A01;
        if (r0 == null) {
            throw C18270x1.A0S("mediaCardUpdateHelper");
        }
        r0.A0C.setMediaInfo(str);
        return C59022wD.A00;
    }
}
