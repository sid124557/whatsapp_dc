package X;

import com.whatsapp.R;
import com.whatsapp.inappsupport.ui.ContactUsWithAiActivity;
import com.whatsapp.util.Log;

/* renamed from: X.61o  reason: invalid class name and case insensitive filesystem */
public final class C1217061o extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ ContactUsWithAiActivity this$0;

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Log.i("ContactUsWithAiActivity/showFallbackEmailDialog");
        C19340zH A00 = AnonymousClass5V0.A00(this.this$0);
        A00.A0U(R.string.f11nameremoved);
        A00.A0T(R.string.f11nameremoved);
        A00.A0i(true);
        ContactUsWithAiActivity contactUsWithAiActivity = this.this$0;
        A00.A0d(contactUsWithAiActivity, AnonymousClass4L0.A0G(contactUsWithAiActivity, 262), R.string.f11nameremoved);
        A00.A0c(this.this$0, new C1897592n(2), R.string.f11nameremoved);
        A00.A0S();
        this.this$0.A74().A01(4, (String) null);
        return C59022wD.A00;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1217061o(ContactUsWithAiActivity contactUsWithAiActivity) {
        super(1);
        this.this$0 = contactUsWithAiActivity;
    }
}
