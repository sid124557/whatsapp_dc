package androidx.constraintlayout.widget;

import X.AnonymousClass02X;
import X.AnonymousClass0R7;
import X.C001702c;
import android.content.Context;
import android.util.AttributeSet;

public class Group extends AnonymousClass02X {
    public void A07(ConstraintLayout constraintLayout) {
        AnonymousClass0R7 r1 = ((C001702c) getLayoutParams()).A0r;
        r1.A0B(0);
        r1.A0A(0);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        A01();
    }

    public void setElevation(float f) {
        super.setElevation(f);
        A01();
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        A01();
    }

    public void A04(AttributeSet attributeSet) {
        super.A04(attributeSet);
    }

    public Group(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public Group(Context context) {
        super(context);
    }

    public Group(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
