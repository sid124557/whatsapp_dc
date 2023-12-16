package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.tabs.TabLayout;

/* renamed from: X.4QR  reason: invalid class name */
public class AnonymousClass4QR extends LinearLayout {
    public int A00 = -1;
    public ValueAnimator A01;
    public final /* synthetic */ TabLayout A02;

    public final void A02(View view, View view2, float f) {
        View view3 = view;
        if (view == null || view.getWidth() <= 0) {
            TabLayout tabLayout = this.A02;
            Drawable drawable = tabLayout.A0N;
            drawable.setBounds(-1, drawable.getBounds().top, -1, tabLayout.A0N.getBounds().bottom);
        } else {
            TabLayout tabLayout2 = this.A02;
            tabLayout2.A0Q.A01(tabLayout2.A0N, view3, view2, tabLayout2, f);
        }
        AnonymousClass0YY.A05(this);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4QR(Context context, TabLayout tabLayout) {
        super(context);
        this.A02 = tabLayout;
        setWillNotDraw(false);
    }

    public final void A00(int i) {
        TabLayout tabLayout = this.A02;
        if (tabLayout.A0H == 0) {
            View childAt = getChildAt(i);
            Drawable drawable = tabLayout.A0N;
            RectF A002 = AnonymousClass5WN.A00(childAt, tabLayout);
            drawable.setBounds((int) A002.left, drawable.getBounds().top, (int) A002.right, drawable.getBounds().bottom);
            tabLayout.A03 = i;
        }
    }

    public final void A01(int i, int i2, boolean z) {
        TabLayout tabLayout = this.A02;
        if (tabLayout.A03 != i) {
            View childAt = getChildAt(tabLayout.getSelectedTabPosition());
            View childAt2 = getChildAt(i);
            if (childAt2 == null) {
                A00(tabLayout.getSelectedTabPosition());
                return;
            }
            tabLayout.A03 = i;
            AnonymousClass75I r3 = new AnonymousClass75I(childAt, childAt2, this, 1);
            if (z) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.A01 = valueAnimator;
                valueAnimator.setInterpolator(tabLayout.A0g);
                valueAnimator.setDuration((long) i2);
                float[] A0T = AnonymousClass4L0.A0T();
                // fill-array-data instruction
                A0T[0] = 0;
                A0T[1] = 1065353216;
                valueAnimator.setFloatValues(A0T);
                valueAnimator.addUpdateListener(r3);
                valueAnimator.start();
                return;
            }
            this.A01.removeAllUpdateListeners();
            this.A01.addUpdateListener(r3);
        }
    }

    public void draw(Canvas canvas) {
        int i;
        TabLayout tabLayout = this.A02;
        int A03 = C86654Ky.A03(tabLayout.A0N);
        if (A03 < 0) {
            A03 = tabLayout.A0N.getIntrinsicHeight();
        }
        int i2 = tabLayout.A09;
        if (i2 == 0) {
            i = getHeight() - A03;
            A03 = getHeight();
        } else if (i2 != 1) {
            i = 0;
            if (i2 != 2) {
                if (i2 != 3) {
                    A03 = 0;
                }
                A03 = getHeight();
            }
        } else {
            i = (getHeight() - A03) / 2;
            A03 = (getHeight() + A03) / 2;
        }
        if (C86644Kx.A01(tabLayout.A0N) > 0) {
            Rect bounds = tabLayout.A0N.getBounds();
            tabLayout.A0N.setBounds(bounds.left, i, bounds.right, A03);
            tabLayout.A0N.draw(canvas);
        }
        super.draw(canvas);
    }

    public void setSelectedIndicatorHeight(int i) {
        TabLayout tabLayout = this.A02;
        Rect bounds = tabLayout.A0N.getBounds();
        tabLayout.A0N.setBounds(bounds.left, 0, bounds.right, i);
        requestLayout();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ValueAnimator valueAnimator = this.A01;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            TabLayout tabLayout = this.A02;
            int i5 = tabLayout.A03;
            if (i5 == -1) {
                i5 = tabLayout.getSelectedTabPosition();
                tabLayout.A03 = i5;
            }
            A00(i5);
            return;
        }
        A01(this.A02.getSelectedTabPosition(), -1, false);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            TabLayout tabLayout = this.A02;
            if (tabLayout.A06 == 1 || tabLayout.A04 == 2) {
                int childCount = getChildCount();
                int i3 = 0;
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt = getChildAt(i4);
                    if (childAt.getVisibility() == 0) {
                        i3 = Math.max(i3, childAt.getMeasuredWidth());
                    }
                }
                if (i3 > 0) {
                    if (i3 * childCount <= getMeasuredWidth() - (((int) C159337lf.A00(getContext(), 16)) * 2)) {
                        boolean z = false;
                        for (int i5 = 0; i5 < childCount; i5++) {
                            LinearLayout.LayoutParams A0U = AnonymousClass001.A0U(getChildAt(i5));
                            if (A0U.width != i3 || A0U.weight != 0.0f) {
                                A0U.width = i3;
                                A0U.weight = 0.0f;
                                z = true;
                            }
                        }
                        if (!z) {
                            return;
                        }
                    } else {
                        tabLayout.A06 = 0;
                        tabLayout.A0H(false);
                    }
                    super.onMeasure(i, i2);
                }
            }
        }
    }

    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (Build.VERSION.SDK_INT < 23 && this.A00 != i) {
            requestLayout();
            this.A00 = i;
        }
    }
}
