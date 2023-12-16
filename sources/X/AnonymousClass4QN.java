package X;

import android.content.Context;
import android.widget.LinearLayout;

/* renamed from: X.4QN  reason: invalid class name */
public abstract class AnonymousClass4QN extends LinearLayout {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4QN(Context context) {
        super(context);
        C162457s7.A0J(context, 1);
    }

    public final void A00(int i, int i2, boolean z) {
        int i3 = 0;
        C86604Kt.A19(this);
        int i4 = i - i2;
        if (getMeasuredWidth() > i4) {
            float measuredWidth = ((float) i4) / ((float) getMeasuredWidth());
            if (z) {
                i3 = i + i2;
            }
            setPivotX((float) i3);
            setPivotY((float) getMeasuredHeight());
            setScaleX(measuredWidth);
            setScaleY(measuredWidth);
        }
    }
}
