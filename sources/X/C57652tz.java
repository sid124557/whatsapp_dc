package X;

import android.view.View;
import android.widget.ScrollView;

/* renamed from: X.2tz  reason: invalid class name and case insensitive filesystem */
public class C57652tz {
    public static boolean A01(ScrollView scrollView) {
        View childAt = scrollView.getChildAt(0);
        if (childAt == null) {
            return false;
        }
        return scrollView.getHeight() < (childAt.getHeight() + scrollView.getPaddingTop()) + scrollView.getPaddingBottom();
    }

    public static void A00(View view, ScrollView scrollView) {
        scrollView.getViewTreeObserver().addOnGlobalLayoutListener(new AnonymousClass4JT(view, 1, scrollView));
    }
}
