package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* renamed from: X.6FB  reason: invalid class name */
public class AnonymousClass6FB extends FrameLayout.LayoutParams {
    public float A00 = 0.5f;
    public int A01 = 0;

    public AnonymousClass6FB(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1463179t.A0A);
        this.A01 = obtainStyledAttributes.getInt(0, 0);
        this.A00 = obtainStyledAttributes.getFloat(1, 0.5f);
        obtainStyledAttributes.recycle();
    }

    public AnonymousClass6FB(int i, int i2) {
        super(i, i2);
    }

    public AnonymousClass6FB(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }
}
