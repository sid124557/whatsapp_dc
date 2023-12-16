package X;

import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;

/* renamed from: X.5Qh  reason: invalid class name and case insensitive filesystem */
public final class C104265Qh {
    public AnonymousClass0R6 A00;
    public C04640Qa A01;
    public C187908y0 A02;
    public AnonymousClass4ZZ A03;
    public boolean A04;
    public final ViewPager2 A05;
    public final TabLayout A06;
    public final C181248mR A07;

    public void A00() {
        if (!this.A04) {
            ViewPager2 viewPager2 = this.A05;
            AnonymousClass0R6 r0 = viewPager2.A08.A0N;
            this.A00 = r0;
            if (r0 != null) {
                this.A04 = true;
                TabLayout tabLayout = this.A06;
                AnonymousClass4ZZ r1 = new AnonymousClass4ZZ(tabLayout);
                this.A03 = r1;
                viewPager2.A09.A00.add(r1);
                AnonymousClass8C1 r02 = new AnonymousClass8C1(viewPager2);
                this.A02 = r02;
                tabLayout.A0D(r02);
                AnonymousClass6Hp r12 = new AnonymousClass6Hp(this);
                this.A01 = r12;
                this.A00.BiZ(r12);
                A01();
                tabLayout.A0A(0.0f, viewPager2.A00, true, true);
                return;
            }
            throw AnonymousClass001.A0e("TabLayoutMediator attached before ViewPager2 has an adapter");
        }
        throw AnonymousClass001.A0e("TabLayoutMediator is already attached");
    }

    public void A01() {
        int min;
        TabLayout tabLayout = this.A06;
        tabLayout.A07();
        AnonymousClass0R6 r0 = this.A00;
        if (r0 != null) {
            int A0G = r0.A0G();
            for (int i = 0; i < A0G; i++) {
                AnonymousClass5T2 A042 = tabLayout.A04();
                this.A07.BPc(A042, i);
                tabLayout.A0F(A042, tabLayout.A0k.size(), false);
            }
            if (A0G > 0 && (min = Math.min(this.A05.A00, C86664Kz.A0M(tabLayout.A0k))) != tabLayout.getSelectedTabPosition()) {
                tabLayout.A0G(tabLayout.A05(min), true);
            }
        }
    }

    public C104265Qh(ViewPager2 viewPager2, TabLayout tabLayout, C181248mR r3) {
        this.A06 = tabLayout;
        this.A05 = viewPager2;
        this.A07 = r3;
    }
}
