package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.R;

@Deprecated
public class BrowserActionsFallbackMenuView extends LinearLayout {
    public final int A00 = getResources().getDimensionPixelOffset(R.dimen.f6nameremoved);
    public final int A01 = getResources().getDimensionPixelOffset(R.dimen.f6nameremoved);

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.A01 * 2), this.A00), 1073741824), i2);
    }
}
