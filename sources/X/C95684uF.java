package X;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;

/* renamed from: X.4uF  reason: invalid class name and case insensitive filesystem */
public abstract class C95684uF extends AnonymousClass4O0 {
    public Activity A00;
    public C15790rw A01 = new AnonymousClass6A8(this, 7);
    public C97154xi A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C95684uF(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C162457s7.A0J(context, 1);
    }

    public abstract void A02(boolean z);

    public final void setSplitWindowManager(C97154xi r2) {
        C162457s7.A0J(r2, 0);
        this.A02 = r2;
    }

    public final Activity getActivity() {
        return this.A00;
    }

    public final C97154xi getSplitWindowManager() {
        C97154xi r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("splitWindowManager");
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getSplitWindowManager().A0C(this.A01);
    }

    public final void setActivity(Activity activity) {
        this.A00 = activity;
    }
}
