package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;

/* renamed from: X.02a  reason: invalid class name */
public class AnonymousClass02a extends ViewGroup.LayoutParams {
    public float A00 = 0.0f;
    public int A01;
    public int A02;
    public int A03;
    public boolean A04;
    public boolean A05;

    public AnonymousClass02a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.A0s);
        this.A02 = obtainStyledAttributes.getInteger(0, 48);
        obtainStyledAttributes.recycle();
    }

    public AnonymousClass02a() {
        super(-1, -1);
    }
}
