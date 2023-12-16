package X;

import com.whatsapp.PagerSlidingTabStrip;

/* renamed from: X.80W  reason: invalid class name */
public class AnonymousClass80W implements C16870uA {
    public final /* synthetic */ PagerSlidingTabStrip A00;

    public AnonymousClass80W(PagerSlidingTabStrip pagerSlidingTabStrip) {
        this.A00 = pagerSlidingTabStrip;
    }

    public void BXd(int i) {
        if (i == 0) {
            PagerSlidingTabStrip pagerSlidingTabStrip = this.A00;
            PagerSlidingTabStrip.A00(pagerSlidingTabStrip, pagerSlidingTabStrip.A0N.getCurrentItem(), 0);
        }
        C16870uA r0 = this.A00.A0M;
        if (r0 != null) {
            r0.BXd(i);
        }
    }

    public void BXe(int i, float f, int i2) {
        PagerSlidingTabStrip pagerSlidingTabStrip = this.A00;
        pagerSlidingTabStrip.A01 = i;
        pagerSlidingTabStrip.A00 = f;
        PagerSlidingTabStrip.A00(pagerSlidingTabStrip, i, (int) (AnonymousClass4L0.A00(pagerSlidingTabStrip.A0L.getChildAt(i)) * f));
        pagerSlidingTabStrip.invalidate();
        C16870uA r0 = pagerSlidingTabStrip.A0M;
        if (r0 != null) {
            r0.BXe(i, f, i2);
        }
    }

    public void BXf(int i) {
        C16870uA r0 = this.A00.A0M;
        if (r0 != null) {
            r0.BXf(i);
        }
    }
}
