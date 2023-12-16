package com.google.android.material.behavior;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0x9;
import X.AnonymousClass5YH;
import X.C05630Ug;
import X.C159917mg;
import X.C160907oe;
import X.C188668zI;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomappbar.BottomAppBar$Behavior;
import com.whatsapp.R;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class HideBottomViewOnScrollBehavior extends C05630Ug {
    public int A00 = 2;
    public int A01;
    public int A02;
    public int A03 = 0;
    public TimeInterpolator A04;
    public TimeInterpolator A05;
    public ViewPropertyAnimator A06;
    public final LinkedHashSet A07 = AnonymousClass0x9.A17();

    public void A0C(View view, View view2, CoordinatorLayout coordinatorLayout, int[] iArr, int i, int i2, int i3, int i4, int i5) {
        TimeInterpolator timeInterpolator;
        ViewPropertyAnimator viewPropertyAnimator;
        long j;
        float f;
        if (i2 > 0) {
            if (this.A00 != 1) {
                ViewPropertyAnimator viewPropertyAnimator2 = this.A06;
                if (viewPropertyAnimator2 != null) {
                    viewPropertyAnimator2.cancel();
                    view.clearAnimation();
                }
                this.A00 = 1;
                Iterator it = this.A07.iterator();
                if (it.hasNext()) {
                    it.next();
                    throw AnonymousClass001.A0g("onStateChanged");
                }
                int i6 = this.A03;
                j = (long) this.A02;
                timeInterpolator = this.A05;
                viewPropertyAnimator = view.animate();
                f = (float) i6;
            } else {
                return;
            }
        } else if (i2 < 0 && this.A00 != 2) {
            ViewPropertyAnimator viewPropertyAnimator3 = this.A06;
            if (viewPropertyAnimator3 != null) {
                viewPropertyAnimator3.cancel();
                view.clearAnimation();
            }
            this.A00 = 2;
            Iterator it2 = this.A07.iterator();
            if (it2.hasNext()) {
                it2.next();
                throw AnonymousClass001.A0g("onStateChanged");
            }
            j = (long) this.A01;
            timeInterpolator = this.A04;
            viewPropertyAnimator = view.animate();
            f = (float) 0;
        } else {
            return;
        }
        this.A06 = viewPropertyAnimator.translationY(f).setInterpolator(timeInterpolator).setDuration(j).setListener(new C188668zI(this, 0));
    }

    public boolean A0G(View view, View view2, View view3, CoordinatorLayout coordinatorLayout, int i, int i2) {
        if (!(this instanceof BottomAppBar$Behavior)) {
            return AnonymousClass000.A1U(i, 2);
        }
        throw AnonymousClass001.A0g("getHideOnScroll");
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean A0I(View view, CoordinatorLayout coordinatorLayout, int i) {
        this.A03 = view.getMeasuredHeight() + AnonymousClass001.A0T(view).bottomMargin;
        this.A01 = C160907oe.A00(view.getContext(), R.attr.f3nameremoved, 225);
        this.A02 = C160907oe.A00(view.getContext(), R.attr.f3nameremoved, 175);
        this.A04 = AnonymousClass5YH.A01(C159917mg.A04, view.getContext(), R.attr.f3nameremoved);
        this.A05 = AnonymousClass5YH.A01(C159917mg.A01, view.getContext(), R.attr.f3nameremoved);
        return false;
    }

    public HideBottomViewOnScrollBehavior() {
    }
}
