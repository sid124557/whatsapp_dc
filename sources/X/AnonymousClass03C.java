package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* renamed from: X.03C  reason: invalid class name */
public class AnonymousClass03C extends FrameLayout {
    public ViewGroup A00;
    public AnonymousClass03H A01;
    public final C142906xz A02;

    public AnonymousClass03H getContentPager() {
        return this.A01;
    }

    public ViewGroup getHeaderContainer() {
        return this.A00;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.A01.layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(getMeasuredWidth()), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(getMeasuredHeight()), Integer.MIN_VALUE);
        ViewGroup viewGroup = this.A00;
        viewGroup.measure(makeMeasureSpec, makeMeasureSpec2);
        viewGroup.layout(0, 0, viewGroup.getMeasuredWidth(), viewGroup.getMeasuredHeight());
    }

    public AnonymousClass03C(Context context, C142906xz r5) {
        super(context);
        this.A02 = r5;
        Context context2 = getContext();
        this.A00 = new FrameLayout(context2);
        AnonymousClass03H r1 = new AnonymousClass03H(context2);
        this.A01 = r1;
        r1.setImportantForAccessibility(1);
        addView(this.A01);
        addView(this.A00);
    }

    public void onMeasure(int i, int i2) {
        int i3 = 1073741824;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824);
        int size = View.MeasureSpec.getSize(i2);
        if (this.A02 == C142906xz.FLEXIBLE_SHEET) {
            i3 = Integer.MIN_VALUE;
        }
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size, i3);
        AnonymousClass03H r0 = this.A01;
        r0.measure(makeMeasureSpec, makeMeasureSpec2);
        setMeasuredDimension(r0.getMeasuredWidth(), r0.getMeasuredHeight());
    }
}
