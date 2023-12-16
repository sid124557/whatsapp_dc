package X;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;

/* renamed from: X.0Ii  reason: invalid class name and case insensitive filesystem */
public class C02980Ii implements C15860s4 {
    public Object A00;
    public final int A01;

    public C02980Ii(C04230Ni r1, int i) {
        this.A01 = i;
        this.A00 = r1;
    }

    public boolean Bgj(View view, AnonymousClass0KQ r5) {
        int i;
        int i2 = this.A01;
        ViewPager2 viewPager2 = (ViewPager2) view;
        C04230Ni r1 = (C04230Ni) this.A00;
        if (i2 != 0) {
            i = viewPager2.A00 - 1;
        } else {
            i = viewPager2.A00 + 1;
        }
        ViewPager2 viewPager22 = r1.A04;
        if (!viewPager22.A0H) {
            return true;
        }
        viewPager22.A02(i);
        return true;
    }
}
