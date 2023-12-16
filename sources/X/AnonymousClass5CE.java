package X;

import android.view.View;
import androidx.core.widget.NestedScrollView;

/* renamed from: X.5CE  reason: invalid class name */
public class AnonymousClass5CE {
    public static void A00(NestedScrollView nestedScrollView) {
        int childCount = nestedScrollView.getChildCount();
        if (childCount != 0) {
            View childAt = nestedScrollView.getChildAt(childCount - 1);
            nestedScrollView.A06(C86664Kz.A0C(childAt, childAt.getScrollY()) + nestedScrollView.getPaddingBottom());
        }
    }
}
