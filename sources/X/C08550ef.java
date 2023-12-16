package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager2.widget.ViewPager2;

/* renamed from: X.0ef  reason: invalid class name and case insensitive filesystem */
public class C08550ef implements C16670tm {
    public final /* synthetic */ ViewPager2 A00;

    public C08550ef(ViewPager2 viewPager2) {
        this.A00 = viewPager2;
    }

    public void BOt(View view) {
        ViewGroup.MarginLayoutParams A0T = AnonymousClass001.A0T(view);
        if (A0T.width != -1 || A0T.height != -1) {
            throw AnonymousClass001.A0e("Pages must fill the whole ViewPager2 (use match_parent)");
        }
    }

    public void BOu(View view) {
    }
}
