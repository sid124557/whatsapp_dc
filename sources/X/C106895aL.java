package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.5aL  reason: invalid class name and case insensitive filesystem */
public final class C106895aL {
    public static final C158547k9 A00(View view) {
        int i;
        int i2;
        int i3;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        C162457s7.A0J(view, 0);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int i4 = 0;
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            i = C06060Wb.A02((ViewGroup.MarginLayoutParams) layoutParams);
        } else {
            i = 0;
        }
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (!(layoutParams2 instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2) == null) {
            i2 = 0;
        } else {
            i2 = marginLayoutParams2.topMargin;
        }
        ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
        if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
            i3 = C06060Wb.A01((ViewGroup.MarginLayoutParams) layoutParams3);
        } else {
            i3 = 0;
        }
        ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
        if ((layoutParams4 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams4) != null) {
            i4 = marginLayoutParams.bottomMargin;
        }
        return new C158547k9(i, i2, i3, i4);
    }

    public static final void A02(View view, Object obj) {
        C162457s7.A0J(view, 0);
        view.setVisibility(C86644Kx.A08(obj));
    }

    public static final void A03(AnonymousClass4GP r3, View view) {
        C162457s7.A0J(view, 0);
        view.getViewTreeObserver().addOnGlobalLayoutListener(new AnonymousClass4JT(view, 2, r3));
    }

    public static final void A01(View view, C158547k9 r6) {
        C18260x0.A0O(view, r6);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins(r6.A01, r6.A03, r6.A02, r6.A00);
            view.setLayoutParams(marginLayoutParams);
            return;
        }
        throw AnonymousClass001.A0g("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }
}
