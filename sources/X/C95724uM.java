package X;

import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.info.views.StarredMessageInfoView;

/* renamed from: X.4uM  reason: invalid class name and case insensitive filesystem */
public final class C95724uM extends StarredMessageInfoView {
    public C1223363z A00;
    public C22411Nc A01;
    public boolean A02;

    public C95724uM(Context context) {
        super(context, (AttributeSet) null);
        A03();
        C18310x6.A15(this);
    }

    public final void setGroupChatInfoViewModelFactory$community_consumerBeta(C1223363z r2) {
        C162457s7.A0J(r2, 0);
        this.A00 = r2;
    }

    public final C1223363z getGroupChatInfoViewModelFactory$community_consumerBeta() {
        C1223363z r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("groupChatInfoViewModelFactory");
    }
}
