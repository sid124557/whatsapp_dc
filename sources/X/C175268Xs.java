package X;

import com.whatsapp.bonsai.discovery.BonsaiDiscoveryActivity;

/* renamed from: X.8Xs  reason: invalid class name and case insensitive filesystem */
public final class C175268Xs extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ BonsaiDiscoveryActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C175268Xs(BonsaiDiscoveryActivity bonsaiDiscoveryActivity) {
        super(1);
        this.this$0 = bonsaiDiscoveryActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass3ZH r3 = (AnonymousClass3ZH) obj;
        if (r3 != null) {
            BonsaiDiscoveryActivity bonsaiDiscoveryActivity = this.this$0;
            bonsaiDiscoveryActivity.startActivity(new C627736r().A1L(bonsaiDiscoveryActivity, r3));
            this.this$0.setResult(-1);
            this.this$0.finish();
        }
        return C59022wD.A00;
    }
}
