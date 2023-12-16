package X;

import com.whatsapp.accountswitching.AccountSwitchingContentProvider;
import com.whatsapp.util.Log;

/* renamed from: X.3zi  reason: invalid class name and case insensitive filesystem */
public final class C81333zi extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ C69903Yy $makeActiveLid;
    public final /* synthetic */ C69903Yy $removeAccountLid;
    public final /* synthetic */ AccountSwitchingContentProvider this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C81333zi(AccountSwitchingContentProvider accountSwitchingContentProvider, C69903Yy r3, C69903Yy r4) {
        super(0);
        this.this$0 = accountSwitchingContentProvider;
        this.$makeActiveLid = r3;
        this.$removeAccountLid = r4;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        boolean A0A = C18530xp.A01(this.this$0).A0A((String) this.$makeActiveLid.element);
        C18260x0.A1E("AccountSwitchingContentProvider/call/remove account action/dataRepoOps/success: ", AnonymousClass001.A0o(), A0A);
        if (!A0A) {
            Log.i("AccountSwitchingContentProvider/call/remove account action/dataRepoOps/autocorrecting accounts file");
            String A05 = C18530xp.A01(this.this$0).A05();
            if (A05 != null) {
                C18530xp.A01(this.this$0).A0A(A05);
                C57072t2.A04("AccountSwitchingContentProvider/call/remove account action/dataRepoOps/removing account ", A05, AnonymousClass001.A0o());
            }
        }
        if (C162457s7.A0P(this.$removeAccountLid.element, C18530xp.A01(this.this$0).A02().A00)) {
            Log.i("AccountSwitchingContentProvider/call/remove account action/removing paymentsOnboardedLid");
            C18530xp.A01(this.this$0).A07((String) null);
        }
        return C59022wD.A00;
    }
}
