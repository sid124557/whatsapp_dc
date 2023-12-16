package X;

import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.Window;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: X.4aI  reason: invalid class name and case insensitive filesystem */
public class C88624aI extends AnonymousClass7XV {
    public Window A00;
    public boolean A01;
    public final AnonymousClass0XY A02;
    public final Boolean A03;

    public void A05(Window window) {
        if (this.A00 != window) {
            this.A00 = window;
            if (window != null) {
                this.A01 = new AnonymousClass0KN(window.getDecorView(), window).A00.A05();
            }
        }
    }

    public C88624aI(View view, AnonymousClass0XY r3) {
        ColorStateList A032;
        Boolean bool;
        int color;
        this.A02 = r3;
        AnonymousClass6D7 r0 = BottomSheetBehavior.A01(view).A0T;
        if (r0 != null) {
            A032 = r0.A03.A0B;
        } else {
            A032 = AnonymousClass0YZ.A03(view);
        }
        if (A032 != null) {
            color = A032.getDefaultColor();
        } else if (view.getBackground() instanceof ColorDrawable) {
            color = ((ColorDrawable) view.getBackground()).getColor();
        } else {
            bool = null;
            this.A03 = bool;
        }
        bool = Boolean.valueOf(AnonymousClass5ZV.A03(color));
        this.A03 = bool;
    }

    public void A01(View view) {
        A04(view);
    }

    public final void A04(View view) {
        boolean booleanValue;
        int top = view.getTop();
        AnonymousClass0XY r3 = this.A02;
        if (top < r3.A05()) {
            Window window = this.A00;
            if (window != null) {
                Boolean bool = this.A03;
                if (bool == null) {
                    booleanValue = this.A01;
                } else {
                    booleanValue = bool.booleanValue();
                }
                C1446472j.A00(window, booleanValue);
            }
            C86604Kt.A1D(view, view.getPaddingLeft(), r3.A05() - view.getTop());
        } else if (view.getTop() != 0) {
            Window window2 = this.A00;
            if (window2 != null) {
                C1446472j.A00(window2, this.A01);
            }
            C86624Kv.A0r(view);
        }
    }

    public void A02(View view, float f) {
        A04(view);
    }

    public void A03(View view, int i) {
        A04(view);
    }
}
