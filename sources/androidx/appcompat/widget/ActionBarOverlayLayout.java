package androidx.appcompat.widget;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass02b;
import X.AnonymousClass03z;
import X.AnonymousClass0L7;
import X.AnonymousClass0UT;
import X.AnonymousClass0V0;
import X.AnonymousClass0XU;
import X.AnonymousClass0XW;
import X.AnonymousClass0XY;
import X.AnonymousClass0YY;
import X.C05290St;
import X.C06560Yg;
import X.C07530bB;
import X.C07580bG;
import X.C07890cz;
import X.C10700iN;
import X.C10710iO;
import X.C14490pm;
import X.C14980qa;
import X.C16470tS;
import X.C16930uG;
import X.C17020uQ;
import X.C17260vE;
import X.C17270vF;
import X.C17440va;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.OverScroller;
import com.whatsapp.R;

public class ActionBarOverlayLayout extends ViewGroup implements C16930uG, C17270vF, C17260vE, C14980qa {
    public static final int[] A0V = {R.attr.f3nameremoved, 16842841};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public Drawable A04;
    public ViewPropertyAnimator A05;
    public OverScroller A06;
    public ActionBarContainer A07;
    public C14490pm A08;
    public ContentFrameLayout A09;
    public C17020uQ A0A;
    public AnonymousClass0XY A0B;
    public AnonymousClass0XY A0C;
    public AnonymousClass0XY A0D;
    public AnonymousClass0XY A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public final AnimatorListenerAdapter A0K;
    public final Rect A0L;
    public final Rect A0M;
    public final Rect A0N;
    public final Rect A0O;
    public final Rect A0P;
    public final Rect A0Q;
    public final Rect A0R;
    public final AnonymousClass0L7 A0S;
    public final Runnable A0T;
    public final Runnable A0U;

    public void BWw(View view, int[] iArr, int i, int i2, int i3, int i4, int i5) {
        BWv(view, i, i2, i3, i4, i5);
    }

    public void onMeasure(int i, int i2) {
        boolean z;
        int measuredHeight;
        AnonymousClass0XY A002;
        A01();
        int i3 = i;
        int i4 = i2;
        measureChildWithMargins(this.A07, i3, 0, i4, 0);
        ViewGroup.MarginLayoutParams A0T2 = AnonymousClass001.A0T(this.A07);
        int A0B2 = AnonymousClass001.A0B(this.A07.getMeasuredWidth() + A0T2.leftMargin, A0T2.rightMargin, 0);
        int A0B3 = AnonymousClass001.A0B(this.A07.getMeasuredHeight() + A0T2.topMargin, A0T2.bottomMargin, 0);
        int A042 = AnonymousClass000.A04(this.A07, 0);
        if ((AnonymousClass0YY.A03(this) & 256) != 0) {
            z = true;
            measuredHeight = this.A00;
            if (this.A0G && this.A07.A06 != null) {
                measuredHeight += measuredHeight;
            }
        } else {
            z = false;
            measuredHeight = this.A07.getVisibility() != 8 ? this.A07.getMeasuredHeight() : 0;
        }
        Rect rect = this.A0N;
        rect.set(this.A0L);
        AnonymousClass0XY r2 = this.A0B;
        this.A0C = r2;
        if (this.A0J || z) {
            AnonymousClass0XU A003 = AnonymousClass0XU.A00(r2.A03(), this.A0C.A05() + measuredHeight, this.A0C.A04(), this.A0C.A02());
            AnonymousClass0UT r0 = new C05290St(this.A0C).A00;
            r0.A06(A003);
            A002 = r0.A00();
        } else {
            rect.top += measuredHeight;
            rect.bottom = rect.bottom;
            A002 = r2.A00.A0E(0, measuredHeight, 0, 0);
        }
        this.A0C = A002;
        ViewGroup.MarginLayoutParams A0T3 = AnonymousClass001.A0T(this.A09);
        int i5 = A0T3.leftMargin;
        int i6 = rect.left;
        if (i5 != i6) {
            A0T3.leftMargin = i6;
        }
        int i7 = A0T3.topMargin;
        int i8 = rect.top;
        if (i7 != i8) {
            A0T3.topMargin = i8;
        }
        int i9 = A0T3.rightMargin;
        int i10 = rect.right;
        if (i9 != i10) {
            A0T3.rightMargin = i10;
        }
        int i11 = A0T3.bottomMargin;
        int i12 = rect.bottom;
        if (i11 != i12) {
            A0T3.bottomMargin = i12;
        }
        if (!this.A0E.equals(this.A0C)) {
            AnonymousClass0XY r1 = this.A0C;
            this.A0E = r1;
            C06560Yg.A07(this.A09, r1);
        }
        measureChildWithMargins(this.A09, i3, 0, i4, 0);
        ViewGroup.MarginLayoutParams A0T4 = AnonymousClass001.A0T(this.A09);
        int A0B4 = AnonymousClass001.A0B(this.A09.getMeasuredWidth() + A0T4.leftMargin, A0T4.rightMargin, A0B2);
        int A0B5 = AnonymousClass001.A0B(this.A09.getMeasuredHeight() + A0T4.topMargin, A0T4.bottomMargin, A0B3);
        int A043 = AnonymousClass000.A04(this.A09, A042);
        setMeasuredDimension(View.resolveSizeAndState(Math.max(A0B4 + AnonymousClass000.A02(this), getSuggestedMinimumWidth()), i, A043), View.resolveSizeAndState(Math.max(A0B5 + AnonymousClass000.A03(this), getSuggestedMinimumHeight()), i4, A043 << 16));
    }

    public void A00() {
        removeCallbacks(this.A0U);
        removeCallbacks(this.A0T);
        ViewPropertyAnimator viewPropertyAnimator = this.A05;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public void A01() {
        C17020uQ wrapper;
        if (this.A09 == null) {
            this.A09 = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.A07 = (ActionBarContainer) findViewById(R.id.action_bar_container);
            View findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof C17020uQ) {
                wrapper = (C17020uQ) findViewById;
            } else if (findViewById instanceof Toolbar) {
                wrapper = ((Toolbar) findViewById).getWrapper();
            } else {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("Can't make a decor toolbar out of ");
                throw AnonymousClass000.A0I(findViewById.getClass().getSimpleName(), A0o);
            }
            this.A0A = wrapper;
        }
    }

    public void BWv(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    public void BWx(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    public boolean BcD(View view, View view2, int i, int i2) {
        if (i2 != 0 || !onStartNestedScroll(view, view2, i)) {
            return false;
        }
        return true;
    }

    public void Bcp(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new AnonymousClass02b();
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.A07;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    public int getNestedScrollAxes() {
        AnonymousClass0L7 r0 = this.A0S;
        return r0.A01 | r0.A00;
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        Runnable runnable;
        if (!this.A0H || !z) {
            return false;
        }
        this.A06.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.A06.getFinalY() > this.A07.getHeight()) {
            A00();
            runnable = this.A0T;
        } else {
            A00();
            runnable = this.A0U;
        }
        runnable.run();
        this.A0F = true;
        return true;
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.A01 + i2;
        this.A01 = i5;
        setActionBarHideOffset(i5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0011, code lost:
        r1 = (X.AnonymousClass03z) r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onNestedScrollAccepted(android.view.View r3, android.view.View r4, int r5) {
        /*
            r2 = this;
            X.0L7 r0 = r2.A0S
            r0.A01 = r5
            int r0 = r2.getActionBarHideOffset()
            r2.A01 = r0
            r2.A00()
            X.0pm r1 = r2.A08
            if (r1 == 0) goto L_0x001d
            X.03z r1 = (X.AnonymousClass03z) r1
            X.0Oc r0 = r1.A08
            if (r0 == 0) goto L_0x001d
            r0.A00()
            r0 = 0
            r1.A08 = r0
        L_0x001d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onNestedScrollAccepted(android.view.View, android.view.View, int):void");
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.A07.getVisibility() != 0) {
            return false;
        }
        return this.A0H;
    }

    public void onStopNestedScroll(View view) {
        Runnable runnable;
        if (this.A0H && !this.A0F) {
            if (this.A01 <= this.A07.getHeight()) {
                A00();
                runnable = this.A0U;
            } else {
                A00();
                runnable = this.A0T;
            }
            postDelayed(runnable, 600);
        }
    }

    public void setActionBarVisibilityCallback(C14490pm r3) {
        this.A08 = r3;
        if (getWindowToken() != null) {
            ((AnonymousClass03z) this.A08).A00 = this.A03;
            int i = this.A02;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                AnonymousClass0V0.A02(this);
            }
        }
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.A0H) {
            this.A0H = z;
            if (!z) {
                A00();
                setActionBarHideOffset(0);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (getContext().getApplicationInfo().targetSdkVersion >= 19) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setOverlayMode(boolean r4) {
        /*
            r3 = this;
            r3.A0J = r4
            if (r4 == 0) goto L_0x0013
            android.content.Context r0 = r3.getContext()
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()
            int r2 = r0.targetSdkVersion
            r1 = 19
            r0 = 1
            if (r2 < r1) goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            r3.A0I = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.setOverlayMode(boolean):void");
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A03 = 0;
        this.A0L = AnonymousClass001.A0N();
        this.A0P = AnonymousClass001.A0N();
        this.A0N = AnonymousClass001.A0N();
        this.A0M = AnonymousClass001.A0N();
        this.A0Q = AnonymousClass001.A0N();
        this.A0O = AnonymousClass001.A0N();
        this.A0R = AnonymousClass001.A0N();
        AnonymousClass0XY r0 = AnonymousClass0XY.A01;
        this.A0B = r0;
        this.A0D = r0;
        this.A0C = r0;
        this.A0E = r0;
        this.A0K = new C17440va(this, 0);
        this.A0U = new C10700iN(this);
        this.A0T = new C10710iO(this);
        A02(context);
        this.A0S = new AnonymousClass0L7();
    }

    public final void A02(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(A0V);
        boolean z = false;
        this.A00 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.A04 = drawable;
        setWillNotDraw(AnonymousClass000.A1X(drawable));
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z = true;
        }
        this.A0I = z;
        this.A06 = new OverScroller(context);
    }

    public boolean BIG() {
        C07530bB r0;
        A01();
        ActionMenuView actionMenuView = ((C07580bG) this.A0A).A09.A0O;
        if (actionMenuView == null || (r0 = actionMenuView.A08) == null || !r0.A02()) {
            return false;
        }
        return true;
    }

    public void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.A04 != null && !this.A0I) {
            if (this.A07.getVisibility() == 0) {
                i = (int) (((float) this.A07.getBottom()) + this.A07.getTranslationY() + 0.5f);
            } else {
                i = 0;
            }
            this.A04.setBounds(0, i, getWidth(), this.A04.getIntrinsicHeight() + i);
            this.A04.draw(canvas);
        }
    }

    public boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new AnonymousClass02b(getContext(), attributeSet);
    }

    public CharSequence getTitle() {
        A01();
        return ((C07580bG) this.A0A).A09.A0V;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0082, code lost:
        if (r6 != false) goto L_0x006a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets r9) {
        /*
            r8 = this;
            r8.A01()
            X.0XY r7 = X.AnonymousClass0XY.A01(r8, r9)
            int r4 = r7.A03()
            int r2 = r7.A05()
            int r1 = r7.A04()
            int r0 = r7.A02()
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>(r4, r2, r1, r0)
            androidx.appcompat.widget.ActionBarContainer r0 = r8.A07
            android.view.ViewGroup$MarginLayoutParams r2 = X.AnonymousClass001.A0T(r0)
            int r1 = r2.leftMargin
            int r0 = r3.left
            if (r1 == r0) goto L_0x0085
            r2.leftMargin = r0
            r6 = 1
        L_0x002b:
            int r1 = r2.topMargin
            int r0 = r3.top
            if (r1 == r0) goto L_0x0034
            r2.topMargin = r0
            r6 = 1
        L_0x0034:
            int r1 = r2.rightMargin
            int r0 = r3.right
            if (r1 == r0) goto L_0x003d
            r2.rightMargin = r0
            r6 = 1
        L_0x003d:
            android.graphics.Rect r5 = r8.A0L
            X.AnonymousClass0YZ.A09(r5, r8, r7)
            int r4 = r5.left
            int r3 = r5.top
            int r1 = r5.right
            int r0 = r5.bottom
            X.0Uh r2 = r7.A00
            X.0XY r1 = r2.A0E(r4, r3, r1, r0)
            r8.A0B = r1
            X.0XY r0 = r8.A0D
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x005f
            X.0XY r0 = r8.A0B
            r8.A0D = r0
            r6 = 1
        L_0x005f:
            android.graphics.Rect r1 = r8.A0P
            boolean r0 = r1.equals(r5)
            if (r0 != 0) goto L_0x0082
            r1.set(r5)
        L_0x006a:
            r8.requestLayout()
        L_0x006d:
            X.0XY r0 = r2.A06()
            X.0Uh r0 = r0.A00
            X.0XY r0 = r0.A08()
            X.0Uh r0 = r0.A00
            X.0XY r0 = r0.A07()
            android.view.WindowInsets r0 = r0.A06()
            return r0
        L_0x0082:
            if (r6 == 0) goto L_0x006d
            goto L_0x006a
        L_0x0085:
            r6 = 0
            goto L_0x002b
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onApplyWindowInsets(android.view.WindowInsets):android.view.WindowInsets");
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        A02(getContext());
        AnonymousClass0V0.A02(this);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        A00();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                ViewGroup.MarginLayoutParams A0T2 = AnonymousClass001.A0T(childAt);
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = A0T2.leftMargin + paddingLeft;
                int i7 = A0T2.topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Deprecated
    public void onWindowSystemUiVisibilityChanged(int i) {
        boolean z;
        super.onWindowSystemUiVisibilityChanged(i);
        A01();
        int i2 = this.A02 ^ i;
        this.A02 = i;
        boolean z2 = false;
        boolean A1T = AnonymousClass000.A1T(i & 4);
        if ((i & 256) != 0) {
            z2 = true;
        }
        C14490pm r1 = this.A08;
        if (r1 != null) {
            AnonymousClass03z r12 = (AnonymousClass03z) r1;
            r12.A0F = !z2;
            if (A1T || !z2) {
                if (r12.A0I) {
                    r12.A0I = false;
                    z = true;
                }
            } else if (!r12.A0I) {
                z = true;
                r12.A0I = true;
            }
            r12.A0b(z);
        }
        if ((i2 & 256) != 0 && this.A08 != null) {
            AnonymousClass0V0.A02(this);
        }
    }

    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.A03 = i;
        C14490pm r0 = this.A08;
        if (r0 != null) {
            ((AnonymousClass03z) r0).A00 = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        A00();
        this.A07.setTranslationY((float) (-AnonymousClass001.A0D(i, this.A07.getHeight(), 0)));
    }

    public void setIcon(int i) {
        Drawable drawable;
        A01();
        C07580bG r1 = (C07580bG) this.A0A;
        if (i != 0) {
            drawable = AnonymousClass0XW.A02(r1.A09, i);
        } else {
            drawable = null;
        }
        r1.A03 = drawable;
        r1.A00();
    }

    public void setLogo(int i) {
        Drawable drawable;
        A01();
        C07580bG r1 = (C07580bG) this.A0A;
        if (i != 0) {
            drawable = AnonymousClass0XW.A02(r1.A09, i);
        } else {
            drawable = null;
        }
        r1.A04 = drawable;
        r1.A00();
    }

    public void setMenu(Menu menu, C16470tS r5) {
        A01();
        C07580bG r2 = (C07580bG) this.A0A;
        C07530bB r1 = r2.A08;
        if (r1 == null) {
            r1 = new C07530bB(r2.A09.getContext());
            r2.A08 = r1;
            r1.A01 = R.id.action_menu_presenter;
        }
        r1.A0B = r5;
        r2.A09.setMenu((C07890cz) menu, r1);
    }

    public void setWindowCallback(Window.Callback callback) {
        A01();
        ((C07580bG) this.A0A).A07 = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        A01();
        this.A0A.setWindowTitle(charSequence);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof AnonymousClass02b;
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.A0G = z;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    public void BWu(View view, int[] iArr, int i, int i2, int i3) {
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new AnonymousClass02b(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        A01();
        C07580bG r0 = (C07580bG) this.A0A;
        r0.A03 = drawable;
        r0.A00();
    }
}
