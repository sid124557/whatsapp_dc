package X;

import androidx.viewpager.widget.ViewPager;

/* renamed from: X.0j5  reason: invalid class name and case insensitive filesystem */
public class C11090j5 implements Runnable {
    public final /* synthetic */ ViewPager A00;

    public C11090j5(ViewPager viewPager) {
        this.A00 = viewPager;
    }

    public void run() {
        ViewPager viewPager = this.A00;
        viewPager.setScrollState(0);
        viewPager.A09(viewPager.A0A);
    }
}
