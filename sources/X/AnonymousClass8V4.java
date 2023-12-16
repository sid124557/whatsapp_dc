package X;

/* renamed from: X.8V4  reason: invalid class name */
public final class AnonymousClass8V4 extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ C152987aU this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8V4(C152987aU r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C157997jG r0 = this.this$0.A00;
        if (r0 != null) {
            return r0;
        }
        throw AnonymousClass001.A0e("Trying to access the LayoutCache from outside a layout call");
    }
}
