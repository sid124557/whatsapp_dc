package com.whatsapp.scroller;

import X.AnonymousClass0R6;
import X.AnonymousClass4GJ;
import X.C04640Qa;
import X.C109895fM;
import X.C116855qy;
import X.C169958Bh;
import X.C182998pK;
import X.C188828zY;
import X.C188848za;
import X.C71283br;
import X.C86664Kz;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;

public class RecyclerFastScroller extends FrameLayout implements AnonymousClass4GJ {
    public int A00;
    public int A01;
    public View A02;
    public View A03;
    public CoordinatorLayout A04;
    public AnonymousClass0R6 A05;
    public RecyclerView A06;
    public AppBarLayout A07;
    public C182998pK A08;
    public C116855qy A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final C04640Qa A0D;
    public final Runnable A0E;

    public RecyclerFastScroller(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    /* access modifiers changed from: private */
    public int getVisibleHeight() {
        if (this.A04 == null || this.A07 == null) {
            return getHeight();
        }
        return Math.min(getHeight(), C86664Kz.A0D(this.A07, this.A04.getHeight()) + this.A00);
    }

    public void A01() {
        RecyclerView recyclerView = this.A06;
        if (recyclerView != null && this.A0A) {
            Runnable runnable = this.A0E;
            recyclerView.removeCallbacks(runnable);
            this.A06.postDelayed(runnable, (long) this.A01);
        }
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A09;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A09 = r0;
        }
        return r0.generatedComponent();
    }

    public int getHideDelay() {
        return this.A01;
    }

    public void setAdapter(AnonymousClass0R6 r3) {
        AnonymousClass0R6 r0 = this.A05;
        if (r0 != r3) {
            if (r0 != null) {
                r0.A01.unregisterObserver(this.A0D);
            }
            if (r3 != null) {
                r3.BiZ(this.A0D);
            }
            this.A05 = r3;
        }
    }

    public void setAppBarLayout(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
        this.A04 = coordinatorLayout;
        this.A07 = appBarLayout;
        appBarLayout.A02(new C169958Bh(this));
    }

    public void setBubbleView(View view, C182998pK r4) {
        this.A08 = r4;
        this.A02 = view;
        view.setVisibility(4);
        addView(this.A02, -2, -2);
    }

    public void setHidingEnabled(boolean z) {
        this.A0A = z;
        if (z) {
            A01();
        }
    }

    public void setRecyclerView(RecyclerView recyclerView) {
        this.A06 = recyclerView;
        recyclerView.A0q(new C188848za(this, 9));
        AnonymousClass0R6 r0 = recyclerView.A0N;
        if (r0 != null) {
            setAdapter(r0);
        }
    }

    public void setThumbView(View view) {
        View view2 = this.A03;
        if (view2 != null) {
            removeView(view2);
        }
        this.A03 = view;
        view.setVisibility(4);
        this.A03.setOnTouchListener(new C109895fM(this));
        addView(this.A03, -2, -2);
    }

    public final void A02() {
        requestLayout();
        if (this.A03.getVisibility() != 0) {
            this.A03.setVisibility(0);
            float f = 1.0f;
            if (this.A0C) {
                f = -1.0f;
            }
            TranslateAnimation translateAnimation = new TranslateAnimation(1, f, 1, 0.0f, 1, 0.0f, 1, 0.0f);
            translateAnimation.setDuration(200);
            this.A03.startAnimation(translateAnimation);
        }
        A01();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int totalScrollRange;
        int i5;
        int right;
        int left;
        int A0D2;
        int left2;
        super.onLayout(z, i, i2, i3, i4);
        RecyclerView recyclerView = this.A06;
        if (recyclerView != null) {
            int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset() + this.A00;
            int computeVerticalScrollRange = this.A06.computeVerticalScrollRange();
            AppBarLayout appBarLayout = this.A07;
            int i6 = 0;
            if (appBarLayout == null) {
                totalScrollRange = 0;
            } else {
                totalScrollRange = appBarLayout.getTotalScrollRange();
            }
            int visibleHeight = getVisibleHeight();
            float paddingBottom = ((float) computeVerticalScrollOffset) / ((float) (((computeVerticalScrollRange + totalScrollRange) + this.A06.getPaddingBottom()) - visibleHeight));
            View view = this.A03;
            if (view != null) {
                float A0D3 = paddingBottom * ((float) C86664Kz.A0D(view, visibleHeight));
                boolean z2 = this.A0C;
                View view2 = this.A03;
                if (z2) {
                    i5 = (int) A0D3;
                    right = view2.getWidth();
                } else {
                    i6 = getRight() - this.A03.getWidth();
                    i5 = (int) A0D3;
                    right = getRight();
                }
                view2.layout(i6, i5, right, this.A03.getHeight() + i5);
                View view3 = this.A02;
                if (view3 != null) {
                    boolean z3 = this.A0C;
                    View view4 = this.A03;
                    if (z3) {
                        left = view4.getRight();
                        A0D2 = C86664Kz.A0D(this.A02, this.A03.getTop() + this.A03.getBottom()) / 2;
                        left2 = this.A03.getRight() + this.A02.getWidth();
                    } else {
                        left = view4.getLeft() - this.A02.getWidth();
                        A0D2 = C86664Kz.A0D(this.A02, this.A03.getTop() + this.A03.getBottom()) / 2;
                        left2 = this.A03.getLeft();
                    }
                    view3.layout(left, A0D2, left2, C86664Kz.A0C(this.A02, this.A03.getTop() + this.A03.getBottom()) / 2);
                }
            }
        }
    }

    public void setHideDelay(int i) {
        this.A01 = i;
    }

    public void setRtl(boolean z) {
        this.A0C = z;
    }

    public RecyclerFastScroller(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RecyclerFastScroller(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        if (!this.A0B) {
            this.A0B = true;
            generatedComponent();
        }
        this.A0D = new C188828zY(this, 4);
        this.A0E = new C71283br((Object) this, 20);
        this.A01 = 1500;
        this.A0A = true;
    }

    public RecyclerFastScroller(Context context) {
        this(context, (AttributeSet) null, 0);
    }
}
