package X;

import android.content.Context;
import android.view.View;
import android.widget.AbsListView;
import androidx.viewpager.widget.ViewPager;

/* renamed from: X.5h1  reason: invalid class name and case insensitive filesystem */
public class C110775h1 implements C16870uA {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass5ZF A01;
    public final /* synthetic */ C620733j A02;
    public final /* synthetic */ C60152y5 A03;

    public C110775h1(Context context, AnonymousClass5ZF r2, C620733j r3, C60152y5 r4) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = context;
        this.A03 = r4;
    }

    public void BXf(int i) {
        AnonymousClass5ZF r2 = this.A01;
        ViewPager viewPager = r2.A0K;
        View findViewWithTag = viewPager.findViewWithTag(Integer.valueOf(r2.A00));
        if (findViewWithTag != null) {
            ((AbsListView) findViewWithTag).setOnScrollListener((AbsListView.OnScrollListener) null);
        }
        if (C620733j.A04(this.A02)) {
            r2.A00 = i;
        } else {
            int length = (r2.A0T.length - 1) - i;
            i = length;
            r2.A00 = length;
        }
        r2.A01(i);
        View findViewWithTag2 = viewPager.findViewWithTag(Integer.valueOf(r2.A00));
        if (findViewWithTag2 != null) {
            ((AbsListView) findViewWithTag2).setOnScrollListener(r2.A0I);
            findViewWithTag2.getViewTreeObserver().addOnPreDrawListener(new AnonymousClass6AN(findViewWithTag2, 0, this));
        }
    }

    public void BXd(int i) {
    }

    public void BXe(int i, float f, int i2) {
    }
}
