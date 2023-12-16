package X;

import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.biz.linkedaccounts.LinkedIGPostsSummaryViewActivity;

/* renamed from: X.5zt  reason: invalid class name and case insensitive filesystem */
public final class C121235zt extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ LinkedIGPostsSummaryViewActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C121235zt(LinkedIGPostsSummaryViewActivity linkedIGPostsSummaryViewActivity) {
        super(1);
        this.this$0 = linkedIGPostsSummaryViewActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str = (String) obj;
        LinkedIGPostsSummaryViewActivity linkedIGPostsSummaryViewActivity = this.this$0;
        C162457s7.A0H(str);
        Toolbar toolbar = linkedIGPostsSummaryViewActivity.A00;
        if (toolbar == null) {
            throw C18270x1.A0S("toolbar");
        }
        toolbar.setSubtitle((CharSequence) str);
        toolbar.A0J(toolbar.getContext(), R.style.f12nameremoved);
        return C59022wD.A00;
    }
}
