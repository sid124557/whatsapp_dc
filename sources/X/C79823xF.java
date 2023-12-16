package X;

import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.xfamily.accountlinking.ui.AccountLinkingNativeAuthActivity;

/* renamed from: X.3xF  reason: invalid class name and case insensitive filesystem */
public final class C79823xF extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ AccountLinkingNativeAuthActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C79823xF(AccountLinkingNativeAuthActivity accountLinkingNativeAuthActivity) {
        super(0);
        this.this$0 = accountLinkingNativeAuthActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        TextView A01 = C005205m.A01(this.this$0, R.id.fb_user_full_name);
        C108735dT r0 = this.this$0.A05;
        if (r0 == null) {
            throw C18270x1.A0S("fb4aUserEntityForNativeAuth");
        }
        A01.setText((CharSequence) r0.A01.A00("XFAM_CROSSPOSTING_NATIVE_AUTH_UI"));
        return C59022wD.A00;
    }
}
