package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* renamed from: X.02e  reason: invalid class name and case insensitive filesystem */
public class C001902e extends ViewGroup.MarginLayoutParams {
    public int A00;

    public C001902e(int i, int i2, int i3) {
        super(i, -2);
        this.A00 = i3;
    }

    public C001902e(C001902e r2) {
        super(r2);
        this.A00 = 0;
        this.A00 = r2.A00;
    }

    public C001902e(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.A00 = 0;
    }

    public C001902e(int i, int i2) {
        super(i, i2);
        this.A00 = 8388627;
    }

    public C001902e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A00 = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass0KC.A01);
        this.A00 = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
    }
}
