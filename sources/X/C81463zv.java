package X;

/* renamed from: X.3zv  reason: invalid class name and case insensitive filesystem */
public final class C81463zv extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ String $configKey;
    public final /* synthetic */ AnonymousClass3XA $result;
    public final /* synthetic */ AnonymousClass3CS this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C81463zv(AnonymousClass3XA r2, AnonymousClass3CS r3, String str) {
        super(0);
        this.this$0 = r3;
        this.$configKey = str;
        this.$result = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Object obj = this.this$0.A00.get(this.$configKey);
        this.$result.A05(AnonymousClass3Z6.A02(Boolean.valueOf(AnonymousClass000.A1W(obj)), obj));
        return C59022wD.A00;
    }
}
