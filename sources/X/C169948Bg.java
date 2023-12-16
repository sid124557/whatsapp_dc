package X;

import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;

/* renamed from: X.8Bg  reason: invalid class name and case insensitive filesystem */
public class C169948Bg implements C187868xw {
    public final /* synthetic */ CollapsingToolbarLayout A00;

    public C169948Bg(CollapsingToolbarLayout collapsingToolbarLayout) {
        this.A00 = collapsingToolbarLayout;
    }

    public void BXL(AppBarLayout appBarLayout, int i) {
        int i2;
        int height;
        CollapsingToolbarLayout collapsingToolbarLayout = this.A00;
        collapsingToolbarLayout.A00 = i;
        AnonymousClass0XY r0 = collapsingToolbarLayout.A0I;
        if (r0 != null) {
            i2 = r0.A05();
        } else {
            i2 = 0;
        }
        int childCount = collapsingToolbarLayout.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = collapsingToolbarLayout.getChildAt(i3);
            AnonymousClass6FB r2 = (AnonymousClass6FB) childAt.getLayoutParams();
            AnonymousClass7TO A002 = CollapsingToolbarLayout.A00(childAt);
            int i4 = r2.A01;
            if (i4 == 1) {
                int i5 = -i;
                height = ((collapsingToolbarLayout.getHeight() - CollapsingToolbarLayout.A00(childAt).A01) - childAt.getHeight()) - ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (i5 < 0) {
                    height = 0;
                } else if (i5 <= height) {
                    height = i5;
                }
            } else if (i4 == 2) {
                height = AnonymousClass001.A07((float) (-i), r2.A00);
            }
            if (A002.A02 != height) {
                A002.A02 = height;
                A002.A00();
            }
        }
        collapsingToolbarLayout.A03();
        if (collapsingToolbarLayout.A0E != null && i2 > 0) {
            AnonymousClass0YY.A05(collapsingToolbarLayout);
        }
        int height2 = collapsingToolbarLayout.getHeight();
        int A01 = (height2 - AnonymousClass0YY.A01(collapsingToolbarLayout)) - i2;
        C159177lI r4 = collapsingToolbarLayout.A0U;
        float f = (float) A01;
        float min = Math.min(1.0f, ((float) (height2 - collapsingToolbarLayout.getScrimVisibleHeightTrigger())) / f);
        r4.A0P = min;
        r4.A0Q = min + ((1.0f - min) * 0.5f);
        r4.A0V = collapsingToolbarLayout.A00 + A01;
        r4.A04(((float) Math.abs(i)) / f);
    }
}
