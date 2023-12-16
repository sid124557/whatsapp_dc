package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.R;

/* renamed from: X.6Z6  reason: invalid class name */
public final class AnonymousClass6Z6 extends AnonymousClass4PF {
    public int getItemDefaultMarginResId() {
        return R.dimen.f6nameremoved;
    }

    public int getItemLayoutResId() {
        return R.layout.f8nameremoved;
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i2) == 0) {
            setMeasuredDimension(getMeasuredWidthAndState(), Math.max(getMeasuredHeight(), View.MeasureSpec.getSize(i2)));
        }
    }

    public AnonymousClass6Z6(Context context) {
        super(context);
    }
}
