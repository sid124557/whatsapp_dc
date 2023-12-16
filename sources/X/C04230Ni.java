package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager2.widget.ViewPager2;

/* renamed from: X.0Ni  reason: invalid class name and case insensitive filesystem */
public class C04230Ni {
    public C04640Qa A00;
    public final C15860s4 A01 = new C02980Ii(this, 1);
    public final C15860s4 A02 = new C02980Ii(this, 0);
    public final /* synthetic */ ViewPager2 A03;
    public final /* synthetic */ ViewPager2 A04;

    public C04230Ni(ViewPager2 viewPager2) {
        this.A04 = viewPager2;
        this.A03 = viewPager2;
    }

    public void A00() {
        int A0G;
        ViewPager2 viewPager2 = this.A04;
        int i = 16908360;
        C06560Yg.A0K(viewPager2, 16908360);
        C06560Yg.A0K(viewPager2, 16908361);
        C06560Yg.A0K(viewPager2, 16908358);
        C06560Yg.A0K(viewPager2, 16908359);
        AnonymousClass0R6 r0 = viewPager2.A08.A0N;
        if (r0 != null && (A0G = r0.A0G()) != 0 && viewPager2.A0H) {
            LinearLayoutManager linearLayoutManager = viewPager2.A04;
            if (linearLayoutManager.A01 == 0) {
                int i2 = 16908361;
                if (AnonymousClass0YH.A01(linearLayoutManager.A07) == 1) {
                    i2 = 16908360;
                    i = 16908361;
                }
                if (viewPager2.A00 < A0G - 1) {
                    C06560Yg.A0R(viewPager2, new C06220Ws(i2, (CharSequence) null), this.A02, (CharSequence) null);
                }
                if (viewPager2.A00 > 0) {
                    C06560Yg.A0R(viewPager2, new C06220Ws(i, (CharSequence) null), this.A01, (CharSequence) null);
                    return;
                }
                return;
            }
            if (viewPager2.A00 < A0G - 1) {
                C06560Yg.A0R(viewPager2, new C06220Ws(16908359, (CharSequence) null), this.A02, (CharSequence) null);
            }
            if (viewPager2.A00 > 0) {
                C06560Yg.A0R(viewPager2, new C06220Ws(16908358, (CharSequence) null), this.A01, (CharSequence) null);
            }
        }
    }
}
