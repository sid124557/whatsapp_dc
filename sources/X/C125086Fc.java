package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;

/* renamed from: X.6Fc  reason: invalid class name and case insensitive filesystem */
public class C125086Fc extends LinearLayout.LayoutParams {
    public int A00 = 1;
    public Interpolator A01;
    public AnonymousClass7GQ A02;

    public C125086Fc(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass7GQ r0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1463179t.A01);
        this.A00 = obtainStyledAttributes.getInt(1, 0);
        if (obtainStyledAttributes.getInt(0, 0) != 1) {
            r0 = null;
        } else {
            r0 = new AnonymousClass7GQ();
        }
        this.A02 = r0;
        if (obtainStyledAttributes.hasValue(2)) {
            this.A01 = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(2, 0));
        }
        obtainStyledAttributes.recycle();
    }

    public C125086Fc() {
        super(-1, -2);
    }

    public C125086Fc(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
    }

    public C125086Fc(LinearLayout.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public C125086Fc(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }
}
