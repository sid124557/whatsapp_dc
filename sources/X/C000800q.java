package X;

import android.database.DataSetObserver;
import androidx.viewpager.widget.ViewPager;

/* renamed from: X.00q  reason: invalid class name and case insensitive filesystem */
public class C000800q extends DataSetObserver {
    public final /* synthetic */ ViewPager A00;

    public C000800q(ViewPager viewPager) {
        this.A00 = viewPager;
    }

    public void onChanged() {
        this.A00.A06();
    }

    public void onInvalidated() {
        this.A00.A06();
    }
}
