package X;

import com.whatsapp.payments.ui.BrazilPixKeySettingActivity;
import com.whatsapp.util.Log;

/* renamed from: X.8YS  reason: invalid class name */
public final class AnonymousClass8YS extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ BrazilPixKeySettingActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8YS(BrazilPixKeySettingActivity brazilPixKeySettingActivity) {
        super(1);
        this.this$0 = brazilPixKeySettingActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C69263Wi r2;
        Runnable runnable;
        int A0K = AnonymousClass001.A0K(obj);
        if (A0K != 0) {
            if (A0K == 1) {
                BrazilPixKeySettingActivity brazilPixKeySettingActivity = this.this$0;
                r2 = brazilPixKeySettingActivity.A05;
                runnable = new AnonymousClass8M3(brazilPixKeySettingActivity);
            } else if (A0K == 2) {
                BrazilPixKeySettingActivity brazilPixKeySettingActivity2 = this.this$0;
                r2 = brazilPixKeySettingActivity2.A05;
                runnable = new AnonymousClass8M4(brazilPixKeySettingActivity2);
            } else if (A0K != 3) {
                Log.d("removePixKeyViewModel initial action state");
            } else {
                this.this$0.finish();
            }
            r2.A0S(runnable);
        } else {
            BrazilPixKeySettingActivity brazilPixKeySettingActivity3 = this.this$0;
            r2 = brazilPixKeySettingActivity3.A05;
            runnable = new AnonymousClass8M5(brazilPixKeySettingActivity3);
            r2.A0S(runnable);
        }
        return C59022wD.A00;
    }
}
