package X;

/* renamed from: X.3zw  reason: invalid class name and case insensitive filesystem */
public final class C81473zw extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ String $configKey;
    public final /* synthetic */ byte[] $configValue;
    public final /* synthetic */ AnonymousClass3CS this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C81473zw(AnonymousClass3CS r2, String str, byte[] bArr) {
        super(0);
        this.this$0 = r2;
        this.$configKey = str;
        this.$configValue = bArr;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        this.this$0.A00.put(this.$configKey, this.$configValue);
        this.this$0.A01.A01(this.$configKey, this.$configValue);
        return C59022wD.A00;
    }
}
