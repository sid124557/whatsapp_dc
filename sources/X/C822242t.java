package X;

import com.whatsapp.R;
import com.whatsapp.privacy.disclosure.ui.PrivacyDisclosureContainerActivity;
import com.whatsapp.privacy.disclosure.ui.PrivacyDisclosureContainerViewModel;
import com.whatsapp.util.Log;

/* renamed from: X.42t  reason: invalid class name and case insensitive filesystem */
public final class C822242t extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ PrivacyDisclosureContainerActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C822242t(PrivacyDisclosureContainerActivity privacyDisclosureContainerActivity) {
        super(1);
        this.this$0 = privacyDisclosureContainerActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass5SG r6 = (AnonymousClass5SG) obj;
        int ordinal = r6.A00.ordinal();
        if (ordinal == 2) {
            this.this$0.A6f((String) null);
        } else if (ordinal != 0) {
            PrivacyDisclosureContainerActivity privacyDisclosureContainerActivity = this.this$0;
            privacyDisclosureContainerActivity.A01 = true;
            privacyDisclosureContainerActivity.BjL();
            C88694ab A00 = C88694ab.A00(privacyDisclosureContainerActivity.getWindow().getDecorView(), R.string.f11nameremoved, -1);
            A00.A0E(new C633939b(privacyDisclosureContainerActivity, 16), R.string.f11nameremoved);
            A00.A0A(new C88684aa(privacyDisclosureContainerActivity));
            A00.A05();
            AnonymousClass66R r2 = privacyDisclosureContainerActivity.A02;
            r2.getValue();
            Log.d("PrivacyDisclosureContainerViewModel: notifyDisclosureRenderingFailed");
            AnonymousClass5WQ.A01.A00(499);
            ((PrivacyDisclosureContainerViewModel) r2.getValue()).A0D(499);
        } else {
            PrivacyDisclosureContainerActivity privacyDisclosureContainerActivity2 = this.this$0;
            if (AnonymousClass5X0.A02) {
                privacyDisclosureContainerActivity2.BjL();
            }
            if (r6.A02 != null) {
                privacyDisclosureContainerActivity2.A6l();
            } else {
                privacyDisclosureContainerActivity2.finish();
            }
        }
        return C59022wD.A00;
    }
}
