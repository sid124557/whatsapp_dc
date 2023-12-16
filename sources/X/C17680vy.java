package X;

import androidx.viewpager2.widget.ViewPager2;

/* renamed from: X.0vy  reason: invalid class name and case insensitive filesystem */
public class C17680vy extends AnonymousClass09J {
    public Object A00;
    public final int A01;

    public C17680vy(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void A05() {
        int i = this.A01;
        Object obj = this.A00;
        if (i != 0) {
            ((C04230Ni) obj).A00();
            return;
        }
        ViewPager2 viewPager2 = (ViewPager2) obj;
        viewPager2.A0F = true;
        viewPager2.A0D.A06 = true;
    }
}
