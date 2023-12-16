package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* renamed from: X.02d  reason: invalid class name and case insensitive filesystem */
public class C001802d extends C001902e {
    public int A00 = 0;

    public C001802d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C001802d(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super((ViewGroup.LayoutParams) marginLayoutParams);
        this.leftMargin = marginLayoutParams.leftMargin;
        this.topMargin = marginLayoutParams.topMargin;
        this.rightMargin = marginLayoutParams.rightMargin;
        this.bottomMargin = marginLayoutParams.bottomMargin;
    }

    public C001802d(C001802d r2) {
        super((C001902e) r2);
        this.A00 = r2.A00;
    }

    public C001802d(C001902e r2) {
        super(r2);
    }

    public C001802d(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public C001802d() {
        super(-2, -2);
        this.A00 = 8388627;
    }
}
