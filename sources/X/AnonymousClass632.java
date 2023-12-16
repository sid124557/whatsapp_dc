package X;

import com.whatsapp.payments.ui.viewmodel.BrazilPixKeySettingViewModel;

/* renamed from: X.632  reason: invalid class name */
public final class AnonymousClass632 extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ String $pixCredentialId;
    public final /* synthetic */ BrazilPixKeySettingViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass632(BrazilPixKeySettingViewModel brazilPixKeySettingViewModel, String str) {
        super(1);
        this.this$0 = brazilPixKeySettingViewModel;
        this.$pixCredentialId = str;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C18260x0.A1P(C18270x1.A0X(obj), "Successful step-up onboarding: ", obj);
        this.this$0.A0D(this.$pixCredentialId);
        return C59022wD.A00;
    }
}
