package X;

import com.whatsapp.xfamily.accountlinking.ui.AccountLinkingWebAuthActivity;

/* renamed from: X.45R  reason: invalid class name */
public final class AnonymousClass45R extends C829045j implements AnonymousClass4GR {
    public final /* synthetic */ C48792fU $delayedProgressSpinner;
    public final /* synthetic */ AccountLinkingWebAuthActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass45R(AccountLinkingWebAuthActivity accountLinkingWebAuthActivity, C48792fU r3) {
        super(2);
        this.this$0 = accountLinkingWebAuthActivity;
        this.$delayedProgressSpinner = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int A0K = AnonymousClass001.A0K(obj);
        C106245Ye.A02(AnonymousClass000.A0Y("AccountLinkingWebAuthActivity/handleRedirectUriDeepLink Error in exchanging blob for access token. Error: ", AnonymousClass001.A0o(), A0K), (Throwable) null);
        AccountLinkingWebAuthActivity accountLinkingWebAuthActivity = this.this$0;
        accountLinkingWebAuthActivity.A05.A0S(new C71713cY(accountLinkingWebAuthActivity, obj2, A0K, 28));
        this.$delayedProgressSpinner.A00();
        return C59022wD.A00;
    }
}
