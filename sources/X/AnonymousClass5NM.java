package X;

import com.whatsapp.xfamily.accountlinking.ui.AccountLinkingWebAuthActivity;

/* renamed from: X.5NM  reason: invalid class name */
public final class AnonymousClass5NM {
    public final /* synthetic */ AccountLinkingWebAuthActivity A00;
    public final /* synthetic */ C48792fU A01;

    public AnonymousClass5NM(AccountLinkingWebAuthActivity accountLinkingWebAuthActivity, C48792fU r2) {
        this.A00 = accountLinkingWebAuthActivity;
        this.A01 = r2;
    }

    public void A00(Exception exc) {
        C106245Ye.A02(AnonymousClass000.A0a("AccountLinkingWebAuthActivity/onCreate/WebAuthTokenFetcher onError: ", AnonymousClass001.A0o(), exc), (Throwable) null);
        this.A01.A00();
        this.A00.A74((C1000759i) null, (C48792fU) null, (Integer) null, (Integer) null);
    }
}
