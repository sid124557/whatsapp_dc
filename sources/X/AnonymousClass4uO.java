package X;

import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.info.views.PhoneNumberPrivacyInfoView;

/* renamed from: X.4uO  reason: invalid class name */
public final class AnonymousClass4uO extends PhoneNumberPrivacyInfoView {
    public AnonymousClass4AQ A00;
    public C50932j0 A01;
    public boolean A02;

    public AnonymousClass4uO(Context context) {
        super(context, (AttributeSet) null);
        A03();
    }

    public final void setGroupDataChangeListeners$community_consumerBeta(C50932j0 r2) {
        C162457s7.A0J(r2, 0);
        this.A01 = r2;
    }

    public final C50932j0 getGroupDataChangeListeners$community_consumerBeta() {
        C50932j0 r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("groupDataChangeListeners");
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C50932j0 groupDataChangeListeners$community_consumerBeta = getGroupDataChangeListeners$community_consumerBeta();
        AnonymousClass4AQ r0 = this.A00;
        if (r0 == null) {
            throw C18270x1.A0S("onRefreshListener");
        }
        groupDataChangeListeners$community_consumerBeta.A01(r0);
    }
}
