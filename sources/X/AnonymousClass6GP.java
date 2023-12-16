package X;

import android.os.Build;
import android.view.View;
import com.whatsapp.PagerSlidingTabStrip;

/* renamed from: X.6GP  reason: invalid class name */
public class AnonymousClass6GP extends AnonymousClass0WH {
    public final /* synthetic */ PagerSlidingTabStrip A00;

    public AnonymousClass6GP(PagerSlidingTabStrip pagerSlidingTabStrip) {
        this.A00 = pagerSlidingTabStrip;
    }

    public void A0D(View view, C05650Ui r4) {
        super.A0D(view, r4);
        if (view.isSelected()) {
            r4.A08(C06220Ws.A08);
            r4.A0H(false);
        }
        if (Build.VERSION.SDK_INT >= 22) {
            view.setAccessibilityTraversalBefore(this.A00.A0N.getId());
        }
    }
}
