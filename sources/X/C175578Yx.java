package X;

import com.whatsapp.R;
import com.whatsapp.payments.ui.BusinessHubActivity;
import com.whatsapp.payments.ui.viewmodel.PaymentMerchantAccountViewModel;

/* renamed from: X.8Yx  reason: invalid class name and case insensitive filesystem */
public final class C175578Yx extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ BusinessHubActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C175578Yx(BusinessHubActivity businessHubActivity) {
        super(1);
        this.this$0 = businessHubActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        AnonymousClass9WE r5 = (AnonymousClass9WE) obj;
        int B72 = ((PaymentMerchantAccountViewModel) this.this$0.A0D.getValue()).A05.A0G().B72();
        if (r5 != null) {
            int i = r5.A00;
            if (i == 0) {
                this.this$0.BjL();
                this.this$0.finish();
            } else if (i != 1) {
                this.this$0.Bp9(R.string.f11nameremoved);
            } else {
                this.this$0.BjL();
                BusinessHubActivity businessHubActivity = this.this$0;
                Throwable th = r5.A02;
                if (th == null || (str = th.getMessage()) == null) {
                    str = C18290x4.A0l(this.this$0, R.string.f11nameremoved);
                }
                C195219Wq.A09(businessHubActivity, str, B72);
            }
        }
        return C59022wD.A00;
    }
}
