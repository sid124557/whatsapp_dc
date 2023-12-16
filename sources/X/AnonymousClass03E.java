package X;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import com.facebook.rendercore.RootHostView;

/* renamed from: X.03E  reason: invalid class name */
public class AnonymousClass03E extends FrameLayout {
    public int A00;
    public int A01;
    public int A02;
    public Interpolator A03;
    public Interpolator A04;
    public AnonymousClass0FU A05;
    public C16310so A06;
    public C16320sp A07;
    public RootHostView A08;
    public C159037kz A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final Animator.AnimatorListener A0D = new C17440va(this, 5);
    public final Animator.AnimatorListener A0E = new C17440va(this, 4);
    public final GestureDetector.OnGestureListener A0F;
    public final GestureDetector A0G;
    public final Runnable A0H = new C11250jL(this);

    public AnonymousClass03E(Context context, AnonymousClass0FU r4, boolean z) {
        super(context, (AttributeSet) null);
        GestureDetector.OnGestureListener r1 = new C06900a0(this);
        this.A0F = r1;
        this.A0C = z;
        this.A05 = r4;
        this.A0G = new GestureDetector(context, !z ? new AnonymousClass02L(this) : r1);
    }

    public final void A00() {
        if (this.A00 != 0 && !this.A0A) {
            Runnable runnable = this.A0H;
            removeCallbacks(runnable);
            postDelayed(runnable, (long) this.A00);
        }
    }

    public void A01(int i) {
        ViewPropertyAnimator alpha;
        removeCallbacks(this.A0H);
        this.A0A = true;
        if (getContext() == null || !C06360Xi.A04(this)) {
            C16310so r0 = this.A06;
            if (r0 != null) {
                r0.BRN();
                return;
            }
            return;
        }
        clearAnimation();
        if (this.A0C) {
            clearAnimation();
            alpha = animate().setDuration((long) i).setInterpolator(this.A03).alpha(0.0f).scaleX(1.5f).scaleY(1.5f);
        } else {
            clearAnimation();
            boolean equals = this.A05.equals(AnonymousClass0FU.TOP);
            int height = getHeight();
            if (equals) {
                height = -height;
            }
            alpha = animate().setDuration((long) i).translationY((float) height).setInterpolator(this.A03).alpha(0.0f);
        }
        alpha.setListener(this.A0D);
    }

    public final boolean A03() {
        if (!this.A0B) {
            if (getTranslationY() > ((float) getHeight()) / 2.0f) {
                A01(this.A01);
            } else {
                A02((Animator.AnimatorListener) null, this.A02);
                return true;
            }
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = this.A0G.onTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.A0B = false;
            return true;
        } else if (action == 1 || action == 3) {
            A00();
            return A03();
        } else if (onTouchEvent || super.onTouchEvent(motionEvent)) {
            return true;
        } else {
            return false;
        }
    }

    public void setBloksContentViewFromParseResult(C153427bI r4, AnonymousClass7r0 r5) {
        C159037kz r0 = this.A09;
        if (r0 != null) {
            r0.A03();
            this.A09 = null;
        }
        RootHostView rootHostView = this.A08;
        if (rootHostView != null) {
            removeView(rootHostView);
        }
        Context A002 = r4.A00();
        if (!A002.equals(getContext())) {
            C159737mN.A01("bk.action.toast.ShowToast", "Different Android context for BloksHostingComponent and FoABloksPopoverView");
        }
        this.A08 = new RootHostView(A002);
        C159037kz A003 = C159037kz.A00(A002, r5, r4.A01()).A00();
        this.A09 = A003;
        A003.A07(this.A08);
        setContentView(this.A09.A01());
    }

    public void setContentView(View view) {
        if (view == null) {
            C159737mN.A01("bk.action.toast.ShowToast", "Cannot add null Bloks content view to PopoverView container.");
        } else {
            addView(view);
        }
    }

    public void A02(Animator.AnimatorListener animatorListener, int i) {
        clearAnimation();
        animate().setDuration((long) i).translationY(0.0f).setInterpolator(this.A04).alpha(1.0f).setListener(animatorListener);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C159037kz r0 = this.A09;
        if (r0 != null) {
            r0.A03();
            this.A09 = null;
            this.A08 = null;
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            removeCallbacks(this.A0H);
        } else if (action == 1 || action == 3) {
            A00();
            A03();
        }
        return this.A0G.onTouchEvent(motionEvent);
    }

    public void setAutoDismissDurationMs(int i) {
        this.A00 = i;
    }

    public void setDismissAnimationDurationMs(int i) {
        this.A01 = i;
    }

    public void setDismissAnimationEndListener(C16310so r1) {
        this.A06 = r1;
    }

    public void setDismissAnimationInterpolator(Interpolator interpolator) {
        this.A03 = interpolator;
    }

    public void setIsLastGestureFling(boolean z) {
        this.A0B = z;
    }

    public void setShowAnimationDurationMs(int i) {
        this.A02 = i;
    }

    public void setShowAnimationEndListener(C16320sp r1) {
        this.A07 = r1;
    }

    public void setShowAnimationInterpolator(Interpolator interpolator) {
        this.A04 = interpolator;
    }
}
