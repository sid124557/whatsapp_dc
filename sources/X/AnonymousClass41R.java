package X;

import com.whatsapp.community.communityInfo.CAGInfoViewModel;

/* renamed from: X.41R  reason: invalid class name */
public final class AnonymousClass41R extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ CAGInfoViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass41R(CAGInfoViewModel cAGInfoViewModel) {
        super(1);
        this.this$0 = cAGInfoViewModel;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass2OE r6 = (AnonymousClass2OE) obj;
        C162457s7.A0J(r6, 0);
        CAGInfoViewModel cAGInfoViewModel = this.this$0;
        C49882hF r3 = cAGInfoViewModel.A0H;
        AnonymousClass3ZH r2 = cAGInfoViewModel.A00;
        if (r2 == null) {
            throw C18270x1.A0S("cagChat");
        }
        C27991fJ r1 = cAGInfoViewModel.A04;
        if (r1 == null) {
            throw C18270x1.A0S("cagJid");
        }
        cAGInfoViewModel.A05 = r3.A01(r2, r1, r6.A02);
        cAGInfoViewModel.A0D();
        return C59022wD.A00;
    }
}
