package X;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Animation;
import com.whatsapp.calling.views.CallResponseLayout;

/* renamed from: X.6Gc  reason: invalid class name */
public class AnonymousClass6Gc extends C04810Qt {
    public int A00;
    public int A01;
    public final /* synthetic */ CallResponseLayout A02;

    public AnonymousClass6Gc(CallResponseLayout callResponseLayout) {
        this.A02 = callResponseLayout;
    }

    public int A04(View view, int i, int i2) {
        CallResponseLayout callResponseLayout = this.A02;
        return AnonymousClass6C9.A0B(i, callResponseLayout.getPaddingTop(), callResponseLayout.getHeight() - view.getHeight());
    }

    public void A06(View view, float f, float f2) {
        C182088nq r0;
        CallResponseLayout callResponseLayout = this.A02;
        AccessibilityManager A0P = callResponseLayout.A03.A0P();
        if (A0P == null || !A0P.isTouchExplorationEnabled()) {
            if (this.A01 - view.getTop() > callResponseLayout.getHeight() / 3 && (r0 = callResponseLayout.A02) != null) {
                r0.BOA();
                if (!callResponseLayout.A07) {
                    return;
                }
            }
            callResponseLayout.A09.A0C(this.A00, this.A01);
            if (callResponseLayout.A06) {
                callResponseLayout.A01.startAnimation(C107215at.A02(callResponseLayout.A01));
                callResponseLayout.A00.setVisibility(0);
            }
            callResponseLayout.invalidate();
            return;
        }
        callResponseLayout.A02.BOA();
    }

    public void A08(View view, int i, int i2, int i3, int i4) {
        CallResponseLayout callResponseLayout = this.A02;
        if (!callResponseLayout.A06 && this.A01 - view.getTop() > callResponseLayout.A08.getScaledTouchSlop() && callResponseLayout.A00.getVisibility() == 0) {
            callResponseLayout.A00.clearAnimation();
            callResponseLayout.A00.setVisibility(4);
        }
    }

    public boolean A09(View view, int i) {
        return AnonymousClass000.A1Y(view, this.A02.A01);
    }

    public int A03(View view, int i, int i2) {
        return view.getLeft();
    }

    public void A07(View view, int i) {
        this.A00 = view.getLeft();
        this.A01 = view.getTop();
        CallResponseLayout callResponseLayout = this.A02;
        if (callResponseLayout.A06) {
            callResponseLayout.A01.setAnimation((Animation) null);
            callResponseLayout.A00.setVisibility(8);
        }
    }
}
