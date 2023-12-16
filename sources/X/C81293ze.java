package X;

/* renamed from: X.3ze  reason: invalid class name and case insensitive filesystem */
public final class C81293ze extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ C51132jK $fbUserEntity;
    public final /* synthetic */ C42992Qi this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C81293ze(C51132jK r2, C42992Qi r3) {
        super(0);
        this.this$0 = r3;
        this.$fbUserEntity = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        String A01 = this.this$0.A02.A01(C18280x3.A0c(this.$fbUserEntity.A00.A00("XFAM_CROSSPOSTING_FB_ACCOUNT_CACHE"), "access_token", AnonymousClass0x9.A1G()));
        this.this$0.A00.set(this.$fbUserEntity);
        C18270x1.A0j(AnonymousClass2Z9.A00(this.this$0.A03), "pref_xfamily_fb_account_info", A01);
        C42992Qi r0 = this.this$0;
        AnonymousClass2Z9 r1 = r0.A03;
        C18270x1.A0i(AnonymousClass2Z9.A00(r1), "pref_xfamily_fb_account_update_time", r0.A01.A0H());
        return C59022wD.A00;
    }
}
