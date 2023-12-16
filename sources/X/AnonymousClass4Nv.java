package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.4Nv  reason: invalid class name */
public class AnonymousClass4Nv extends ViewGroup {
    public final /* synthetic */ AnonymousClass4OW A00;

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f;
        int i5;
        float f2 = (float) (i3 - i);
        int i6 = i4 - i2;
        AnonymousClass4OW r9 = this.A00;
        float f3 = f2 / ((float) r9.A03.A01);
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            float f4 = ((float) i7) * f3;
            View childAt = getChildAt(i7);
            if (C620733j.A04(r9.A02)) {
                i5 = (int) f4;
                f = f4 + f3;
            } else {
                f = f2 - f4;
                i5 = (int) (f - f3);
            }
            childAt.layout(i5, 0, (int) f, i6);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4Nv(Context context, AnonymousClass4OW r2) {
        super(context);
        this.A00 = r2;
    }

    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int childCount = getChildCount();
        AnonymousClass5ZF r6 = this.A00.A03;
        float f = (float) (size / r6.A01);
        for (int i3 = 0; i3 < childCount; i3++) {
            float f2 = ((float) i3) * f;
            C86604Kt.A1C(getChildAt(i3), ((int) (f2 + f)) - ((int) f2), 1073741824);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), r6.A05);
    }
}
