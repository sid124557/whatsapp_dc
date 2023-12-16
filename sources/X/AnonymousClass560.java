package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateInterpolator;
import com.whatsapp.KeyboardPopupLayout;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.560  reason: invalid class name */
public class AnonymousClass560 extends AnonymousClass4PT implements ScaleGestureDetector.OnScaleGestureListener {
    public float A00 = 1.0f;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08 = 0;
    public int A09 = 1;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public Rect A0E;
    public View A0F;
    public View A0G;
    public View A0H;
    public KeyboardPopupLayout A0I;
    public C105895Wv A0J;
    public C179768jg A0K;
    public C179778jh A0L;
    public C179788ji A0M;
    public AnonymousClass4P1 A0N;
    public boolean A0O;
    public boolean A0P = true;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S = false;
    public boolean A0T = true;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W = false;
    public boolean A0X = true;
    public int[] A0Y;
    public final ScaleGestureDetector A0Z;
    public final View A0a;
    public final AnonymousClass0WM A0b;
    public final ArrayList A0c = AnonymousClass002.A0I(4);

    public static int A00(AnonymousClass560 r2, int i) {
        return (int) (((1.0f - r2.A00) * ((float) i)) / 2.0f);
    }

    public int A02(int i) {
        float f = (float) i;
        if (this.A06 > (getLeftOfDraggableArea() - ((int) (((1.0f - this.A00) * f) / 2.0f))) + (((getRightOfDraggableArea() - i) + A00(this, i)) / 2)) {
            return (getRightOfDraggableArea() - i) + A00(this, i);
        }
        return getLeftOfDraggableArea() - ((int) (((1.0f - this.A00) * f) / 2.0f));
    }

    public int A03(int i) {
        if (this instanceof C995055z) {
            C995055z r0 = (C995055z) this;
            int A052 = r0.A05(i);
            int A042 = r0.A04(i);
            if (!r0.A05) {
                return A042;
            }
            return A052;
        }
        int A053 = A05(i);
        int A043 = A04(i);
        int i2 = this.A07;
        if (AnonymousClass001.A0A(i2, A053) >= AnonymousClass001.A0A(i2, A043)) {
            return A043;
        }
        return A053;
    }

    public void A06() {
        if (this instanceof C995055z) {
            C995055z r3 = (C995055z) this;
            if ((r3.A09 != 2 || !C105895Wv.A00(r3)) && !r3.A0W && r3.getBonsaiUiUtil().BH3(r3.A02)) {
                AnonymousClass0x2.A0x(r3.A0F);
                return;
            }
            View view = r3.A0F;
            if (view != null) {
                view.setVisibility(8);
            }
        }
    }

    public final void A08(float f) {
        if (this.A0F != null) {
            Iterator it = this.A0c.iterator();
            while (it.hasNext()) {
                View A0H2 = C86654Ky.A0H(it);
                try {
                    int i = C86664Kz.A0r(A0H2).gravity;
                    if ((i & 48) == 48) {
                        A0H2.setPivotY(0.0f);
                        C86604Kt.A1D(A0H2, A0H2.getPaddingLeft(), (int) (((float) this.A08) * f));
                    }
                    if ((i & 80) == 80) {
                        A0H2.setPivotY((float) A0H2.getMeasuredHeight());
                        A0H2.setPadding(A0H2.getPaddingLeft(), A0H2.getPaddingTop(), A0H2.getPaddingRight(), (int) (((float) this.A08) * f));
                    }
                    if ((i & 8388611) == 8388611) {
                        A0H2.setPivotX(0.0f);
                        C86604Kt.A1D(A0H2, (int) (((float) this.A08) * f), A0H2.getPaddingTop());
                    }
                    if ((i & 8388613) == 8388613) {
                        A0H2.setPivotX((float) A0H2.getMeasuredWidth());
                        C86654Ky.A15(A0H2, A0H2.getPaddingLeft(), A0H2.getPaddingTop(), (int) (((float) this.A08) * f));
                    }
                } catch (Exception unused) {
                }
                float f2 = 1.0f / f;
                A0H2.setScaleX(f2);
                A0H2.setScaleY(f2);
            }
        }
    }

    public void A09(View view, View view2, int i, int i2, int i3, int i4) {
        if (this.A0U) {
            this.A06 = this.A0A;
            this.A07 = this.A0B;
            this.A0U = false;
        }
        this.A00 = 1.0f;
        this.A05 = i;
        this.A02 = i2;
        this.A04 = i3;
        this.A03 = i4;
        if (this.A09 == 2) {
            i = i3;
            i2 = i4;
        }
        this.A06 = A02(i);
        this.A07 = A03(i2);
        if (view2 != null) {
            int[] iArr = new int[2];
            view2.getLocationInWindow(iArr);
            view.setTranslationX((float) (iArr[0] - this.A06));
            view.setTranslationY((float) (iArr[1] - this.A07));
            view.setPivotY(0.0f);
            view.setPivotX(0.0f);
            view.setScaleX(AnonymousClass4L0.A00(view2) / ((float) i));
            view.setScaleY(C86664Kz.A02(view2) / ((float) i2));
        }
        this.A0O = true;
        addView(view, i, i2);
    }

    public void A0A(boolean z) {
        if (this.A0F != null && !this.A0O) {
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            viewTreeObserver.addOnGlobalLayoutListener(new C166997zb(viewTreeObserver, this, z));
            requestLayout();
        }
    }

    public void A0B(boolean z) {
        int A022;
        int A032;
        int A023;
        int A033;
        if (this instanceof C995055z) {
            C995055z r4 = (C995055z) this;
            View view = r4.A0F;
            if (view != null) {
                int i = r4.A09;
                int width = view.getWidth();
                if (i == 2) {
                    A023 = (r4.getRightOfDraggableArea() - width) + A00(r4, width);
                    A033 = r4.A05(view.getHeight());
                    if (A023 >= 0 && A033 >= 0) {
                        r4.A05 = true;
                        r4.A0S = true;
                    } else {
                        return;
                    }
                } else {
                    A023 = r4.A02(width);
                    A033 = r4.A03(view.getHeight());
                    if (!(!r4.A0E())) {
                        return;
                    }
                }
                r4.A0C(A023, A033);
                return;
            }
            return;
        }
        View view2 = this.A0F;
        if (view2 == null) {
            return;
        }
        if (this.A0Q) {
            view2.setPivotX((float) (view2.getMeasuredWidth() / 2));
            View view3 = this.A0F;
            view3.setPivotY((float) (view3.getMeasuredHeight() / 2));
            if (z) {
                A022 = this.A0C;
                A032 = this.A0D;
            } else {
                A022 = A02(this.A0F.getWidth());
                A032 = A03(this.A0F.getHeight());
            }
            A0C(A022, A032);
            this.A0Q = false;
        } else if (!this.A0R) {
            A0C(A02(view2.getWidth()), A03(this.A0F.getHeight()));
        }
    }

    public boolean A0C(int i, int i2) {
        if (this.A06 == i && this.A07 == i2) {
            return false;
        }
        A07();
        boolean A0H2 = this.A0b.A0H(this.A0F, i, i2);
        this.A06 = i;
        this.A07 = i2;
        return A0H2;
    }

    public void dispatchDraw(Canvas canvas) {
        if (this.A0P) {
            canvas.clipRect(this.A0E);
        }
        super.dispatchDraw(canvas);
    }

    public int getBottomOfDraggableArea() {
        return (this.A0E.bottom - this.A01) - getPaddingBottom();
    }

    public float getCurrentChildScale() {
        return this.A00;
    }

    public int getLeftOfDraggableArea() {
        return C86664Kz.A0F(this, this.A01 + this.A0E.left);
    }

    public int getRightOfDraggableArea() {
        return AnonymousClass4L0.A03(this, this.A0E.right - this.A01);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.A0b.A0E(motionEvent) || super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        if (this.A0F == null || !this.A0T) {
            return false;
        }
        float scaleFactor = this.A00 * scaleGestureDetector.getScaleFactor();
        this.A00 = scaleFactor;
        if (scaleFactor > 1.0f) {
            this.A00 = 1.0f;
            scaleFactor = 1.0f;
        } else if (scaleFactor < 0.67f) {
            this.A00 = 0.67f;
            scaleFactor = 0.67f;
        }
        this.A0F.setScaleX(scaleFactor);
        this.A0F.setScaleY(this.A00);
        A08(this.A00);
        return true;
    }

    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        if (this.A0F == null || !this.A0T) {
            return false;
        }
        return true;
    }

    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        View view = this.A0F;
        if (view != null && this.A0T) {
            boolean z = this.A0R;
            float f = this.A00;
            if (z) {
                if (f <= 0.85f) {
                    this.A0Q = true;
                    C179768jg r0 = this.A0K;
                    if (r0 != null) {
                        ((C172178Jx) r0).A00.B2u(true);
                    }
                    AnonymousClass4P1 r5 = this.A0N;
                    if (r5 != null) {
                        r5.A05(0, getResources().getColor(R.color.f5nameremoved));
                        this.A0N.setPlayerElevation(6);
                        this.A0N.setVisibility(0);
                    }
                }
                this.A0F.animate().scaleX(this.A00).scaleY(this.A00).setDuration(125);
            } else {
                int i = (f > 0.85f ? 1 : (f == 0.85f ? 0 : -1));
                ViewPropertyAnimator animate = view.animate();
                float f2 = 1.0f;
                if (i <= 0) {
                    f2 = 0.67f;
                }
                C86634Kw.A0P(animate, f2).setDuration(125);
                this.A00 = f2;
            }
            this.A0F.setScaleX(this.A00);
            this.A0F.setScaleY(this.A00);
            A08(this.A00);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        View view;
        AnonymousClass0WM r3 = this.A0b;
        if (r3.A03 != 1 && !this.A0Z.isInProgress()) {
            if (this.A0F == null || motionEvent.getX() < ((float) (this.A06 + A00(this, this.A0F.getWidth()))) || motionEvent.getX() > ((float) ((this.A06 + this.A0F.getWidth()) - A00(this, this.A0F.getWidth()))) || motionEvent.getY() < ((float) (this.A07 + A00(this, this.A0F.getHeight())))) {
                return false;
            }
            if (motionEvent.getY() > ((float) (C86664Kz.A0C(this.A0F, this.A07) - A00(this, this.A0F.getHeight())))) {
                return false;
            }
        }
        if (this.A0V || this.A0O || (view = this.A0F) == null || view.getVisibility() != 0) {
            return false;
        }
        this.A0Z.onTouchEvent(motionEvent);
        r3.A08(motionEvent);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (r3.A00 != 2) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setConfiguration(android.content.res.Configuration r5) {
        /*
            r4 = this;
            int r0 = r5.orientation
            r4.A09 = r0
            r3 = r4
            boolean r0 = r4 instanceof X.C995055z
            if (r0 == 0) goto L_0x0018
            X.55z r3 = (X.C995055z) r3
            int r0 = r3.A09
            r2 = 2
            if (r0 == r2) goto L_0x0015
            int r0 = r3.A00
            r1 = 0
            if (r0 == r2) goto L_0x0016
        L_0x0015:
            r1 = 1
        L_0x0016:
            r3.A0V = r1
        L_0x0018:
            r4.A06()
            int r1 = r4.A04
            int r0 = r4.A05
            if (r1 != r0) goto L_0x0027
            int r1 = r4.A03
            int r0 = r4.A02
            if (r1 == r0) goto L_0x0044
        L_0x0027:
            android.view.View r0 = r4.A0F
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            int r1 = r5.orientation
            r0 = 2
            if (r1 != r0) goto L_0x0045
            int r0 = r4.A04
            r2.width = r0
            int r0 = r4.A03
        L_0x0038:
            r2.height = r0
            android.view.View r0 = r4.A0F
            r0.setLayoutParams(r2)
            android.view.View r0 = r4.A0F
            r0.requestLayout()
        L_0x0044:
            return
        L_0x0045:
            int r0 = r4.A05
            r2.width = r0
            int r0 = r4.A02
            goto L_0x0038
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass560.setConfiguration(android.content.res.Configuration):void");
    }

    public void setControlView(AnonymousClass4P1 r2) {
        this.A0N = r2;
        this.A0G = r2.findViewById(R.id.header);
    }

    public AnonymousClass560(Context context, View view) {
        super(context);
        if (view == null) {
            this.A0a = this;
            view = this;
        } else {
            this.A0a = view;
        }
        int[] A1Z = C86664Kz.A1Z();
        view.getLocationInWindow(A1Z);
        int i = A1Z[0];
        this.A0E = new Rect(i, A1Z[1], this.A0a.getWidth() + i, C86664Kz.A0C(this.A0a, A1Z[1]));
        AnonymousClass0WM A002 = AnonymousClass0WM.A00(this, new AnonymousClass4TO(this));
        A002.A06 = (int) (((float) A002.A06) * (1.0f / 1.0f));
        this.A0b = A002;
        A002.A01 = 2000.0f;
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, this);
        this.A0Z = scaleGestureDetector;
        AnonymousClass0I7.A00(scaleGestureDetector, false);
        View A0Q2 = AnonymousClass001.A0Q(C111095hX.A02(context));
        AnonymousClass0YZ.A0E(A0Q2, new AnonymousClass92E(this, 3));
        AnonymousClass0V0.A02(A0Q2);
        this.A09 = C86604Kt.A02(context);
    }

    public int A04(int i) {
        float f = (float) i;
        return AnonymousClass001.A0C(getTopOfDraggableArea(), (int) (((1.0f - this.A00) * f) / 2.0f), (getBottomOfDraggableArea() - i) + ((int) (((1.0f - this.A00) * f) / 2.0f)));
    }

    public int A05(int i) {
        float f = (float) i;
        return Math.min((getBottomOfDraggableArea() - i) + ((int) (((1.0f - this.A00) * f) / 2.0f)), getTopOfDraggableArea() - ((int) (((1.0f - this.A00) * f) / 2.0f)));
    }

    public void A07() {
        int[] A1Z = C86664Kz.A1Z();
        View view = this.A0a;
        view.getLocationInWindow(A1Z);
        int i = A1Z[0];
        this.A0E = new Rect(i, A1Z[1], view.getWidth() + i, C86634Kw.A09(view, A1Z));
    }

    public void computeScroll() {
        super.computeScroll();
        if (this.A0b.A0I(true)) {
            AnonymousClass0YY.A05(this);
        }
    }

    public int getTopOfDraggableArea() {
        return getPaddingTop() + this.A01 + this.A0E.top;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View view = this.A0F;
        if (view != null && !this.A0R) {
            if (!this.A0O) {
                view.setScaleX(this.A00);
                this.A0F.setScaleY(this.A00);
            }
            View view2 = this.A0F;
            int i5 = this.A06;
            view2.layout(i5, this.A07, view2.getWidth() + i5, C86664Kz.A0C(this.A0F, this.A07));
        }
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        View view2 = this.A0F;
        if (view2 != null) {
            removeView(view2);
        }
        this.A0H = null;
        this.A0F = view;
        AnimatorSet A0O2 = C86664Kz.A0O();
        A0O2.playTogether(new Animator[]{ObjectAnimator.ofFloat(this.A0F, "scaleX", new float[]{this.A00}), ObjectAnimator.ofFloat(this.A0F, "scaleY", new float[]{this.A00}), ObjectAnimator.ofFloat(this.A0F, "translationX", new float[]{0.0f}), ObjectAnimator.ofFloat(this.A0F, "translationY", new float[]{0.0f}), ObjectAnimator.ofFloat(this.A0F, "alpha", new float[]{0.0f, 1.0f})});
        A0O2.setInterpolator(new AccelerateInterpolator());
        A0O2.setDuration(130);
        AnonymousClass67L.A00(A0O2, this, 29);
        int[] iArr = this.A0Y;
        if (iArr != null) {
            for (int findViewById : iArr) {
                View findViewById2 = this.A0F.findViewById(findViewById);
                if (findViewById2 != null) {
                    this.A0c.add(findViewById2);
                }
            }
        }
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.A0c.clear();
        this.A0F = null;
    }

    public boolean performClick() {
        super.performClick();
        return true;
    }

    public void setChildPadding(int i) {
        this.A01 = i;
    }

    public void setClipToDependentView(boolean z) {
        this.A0P = z;
    }

    public void setDismissListener(C179768jg r1) {
        this.A0K = r1;
    }

    public void setExitingFullScreen(boolean z) {
        this.A0Q = z;
    }

    public void setFullscreen(boolean z) {
        this.A0R = z;
    }

    public void setIgnoreNextSoftInputHide(boolean z) {
        this.A0S = z;
    }

    public void setIsScalingEnabled(boolean z) {
        this.A0T = z;
    }

    public void setKeyboardLayout(KeyboardPopupLayout keyboardPopupLayout) {
        this.A0I = keyboardPopupLayout;
    }

    public void setListViewLayoutIgnoreListener(C179778jh r1) {
        this.A0L = r1;
    }

    public void setLockChild(boolean z) {
        this.A0V = z;
    }

    public void setViewAddedListener(C179788ji r1) {
        this.A0M = r1;
    }
}
