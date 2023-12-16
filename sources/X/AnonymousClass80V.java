package X;

import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;

/* renamed from: X.80V  reason: invalid class name */
public class AnonymousClass80V implements C16070sQ {
    public boolean A00;
    public final /* synthetic */ TabLayout A01;

    public AnonymousClass80V(TabLayout tabLayout) {
        this.A01 = tabLayout;
    }

    public void BM4(AnonymousClass0R4 r3, AnonymousClass0R4 r4, ViewPager viewPager) {
        TabLayout tabLayout = this.A01;
        if (tabLayout.A0P == viewPager) {
            tabLayout.A0B(r4, this.A00);
        }
    }
}
