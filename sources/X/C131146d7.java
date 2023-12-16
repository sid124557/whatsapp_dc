package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* renamed from: X.6d7  reason: invalid class name and case insensitive filesystem */
public class C131146d7 extends AnonymousClass6NB {
    public static SwipeRefreshLayout A00(Context context) {
        SwipeRefreshLayout swipeRefreshLayout = new SwipeRefreshLayout(context);
        swipeRefreshLayout.addView(new AnonymousClass6N6(context), new FrameLayout.LayoutParams(-1, -1));
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(AnonymousClass77K.A00);
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(1);
        if (colorStateList != null) {
            swipeRefreshLayout.setColorSchemeColors(new int[]{colorStateList.getDefaultColor()});
        }
        ColorStateList colorStateList2 = obtainStyledAttributes.getColorStateList(0);
        if (colorStateList2 != null) {
            swipeRefreshLayout.setProgressBackgroundColorSchemeColor(colorStateList2.getDefaultColor());
        }
        return swipeRefreshLayout;
    }

    public /* bridge */ /* synthetic */ Object A0M(View view, C153427bI r5, AnonymousClass84O r6, Object obj) {
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) view;
        C151847Wn r7 = (C151847Wn) obj;
        C170328Ct r1 = (C170328Ct) C162377rs.A05(r5, r6);
        if (r1 != null) {
            r1.A00 = swipeRefreshLayout;
            swipeRefreshLayout.setOnRefreshListener(new AnonymousClass80U(r5, r6, this, r1));
            swipeRefreshLayout.setRefreshing(r1.A01);
            for (int i = 0; i < swipeRefreshLayout.getChildCount(); i++) {
                View childAt = swipeRefreshLayout.getChildAt(i);
                if (childAt instanceof AnonymousClass6N6) {
                    ((AnonymousClass6N6) childAt).setRenderTree(r7);
                    return null;
                }
            }
            throw AnonymousClass001.A0e("SwipeRefreshLayout does not contain RenderTreeHostView child");
        }
        throw AnonymousClass002.A0E("PTR container defines a controller but none was found");
    }

    public /* bridge */ /* synthetic */ void A0N(View view, C153427bI r6, AnonymousClass84O r7, Object obj, Object obj2) {
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) view;
        for (int i = 0; i < swipeRefreshLayout.getChildCount(); i++) {
            View childAt = swipeRefreshLayout.getChildAt(i);
            if (childAt instanceof AnonymousClass6N6) {
                ((AnonymousClass6N6) childAt).setRenderTree((C151847Wn) null);
                swipeRefreshLayout.setRefreshing(false);
                return;
            }
        }
        throw AnonymousClass001.A0e("SwipeRefreshLayout does not contain RenderTreeHostView child");
    }

    public /* bridge */ /* synthetic */ void A0O(View view, C153427bI r3, AnonymousClass84O r4, Object obj, Object obj2) {
        ((SwipeRefreshLayout) view).setOnRefreshListener((SwipeRefreshLayout.OnRefreshListener) null);
    }

    public C131146d7(C153427bI r1, AnonymousClass84O r2) {
        super(r1, r2);
    }

    public /* bridge */ /* synthetic */ Object B0R(Context context) {
        return A00(context);
    }
}
