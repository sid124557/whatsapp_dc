package X;

/* renamed from: X.40A  reason: invalid class name */
public final class AnonymousClass40A extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ AnonymousClass4CV $listener;
    public final /* synthetic */ String $purpose;
    public final /* synthetic */ int $purposePolicyId;
    public final /* synthetic */ C51242jV $userEntityForNativeAuth;
    public final /* synthetic */ C43842Tr this$0;
    public final /* synthetic */ C45802ab this$1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass40A(AnonymousClass4CV r2, C45802ab r3, C43842Tr r4, C51242jV r5, String str, int i) {
        super(0);
        this.this$0 = r4;
        this.$userEntityForNativeAuth = r5;
        this.$purpose = str;
        this.this$1 = r3;
        this.$purposePolicyId = i;
        this.$listener = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass2S0 r0 = (AnonymousClass2S0) this.$userEntityForNativeAuth.A01.A00(this.$purpose);
        String str = null;
        if (r0 != null) {
            str = r0.A05;
        }
        C162167rN A00 = C162167rN.A00();
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append('+');
        if (str == null) {
            str = "";
        }
        AnonymousClass8LC A0F = A00.A0F(AnonymousClass000.A0X(str, A0o), (String) null);
        AnonymousClass0PJ A0G = AnonymousClass0x9.A0G(String.valueOf(A0F.countryCode_), String.valueOf(A0F.nationalNumber_));
        if (this.this$0.A01.A06()) {
            C614930z r2 = this.this$0.A01;
            Object obj = A0G.A00;
            C162457s7.A0C(obj);
            Object obj2 = A0G.A01;
            C162457s7.A0C(obj2);
            String A03 = r2.A03((String) obj, (String) obj2);
            if (!(A03 == null || A03.length() == 0)) {
                this.this$1.A00(AnonymousClass001.A0e("Phone number already registered"));
                return C59022wD.A00;
            }
        }
        Object A0i = AnonymousClass001.A0i(this.this$0.A0B, 551495536);
        if (A0i != null) {
            C111145hc r4 = (C111145hc) A0i;
            r4.A05("PRECHAT_START");
            C56912sl r22 = this.this$0.A08;
            Object obj3 = A0G.A00;
            C162457s7.A0C(obj3);
            Object obj4 = A0G.A01;
            C162457s7.A0C(obj4);
            C156777hB A02 = r22.A02((String) obj3, (String) obj4);
            if (A02 != null) {
                String str2 = A02.A03;
                String str3 = A02.A04;
                if (str2 != null) {
                    if (str3 != null) {
                        C18270x1.A0j(C18270x1.A03(this.this$0.A04), "pref_pre_chatd_ab_hash", str2);
                        this.this$0.A07.A05(str3);
                    }
                }
                this.this$0.A00.BkS(new C117675sJ(this.$listener, this.$userEntityForNativeAuth, A0G, this.$purpose, this.$purposePolicyId, 1));
                return C59022wD.A00;
            }
            r4.A05("PRECHAT_ERROR");
            this.this$1.A00(AnonymousClass001.A0e("Could not retrieve prechatd abprops"));
            return C59022wD.A00;
        }
        throw C18290x4.A0Y();
    }
}
