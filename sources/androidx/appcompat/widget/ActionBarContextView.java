package androidx.appcompat.widget;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass04N;
import X.AnonymousClass0KC;
import X.AnonymousClass0UD;
import X.AnonymousClass0YH;
import X.AnonymousClass0YY;
import X.C02520Go;
import X.C04830Qv;
import X.C07530bB;
import X.C07890cz;
import X.C08160dQ;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;

public class ActionBarContextView extends ViewGroup {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public View A04;
    public View A05;
    public View A06;
    public LinearLayout A07;
    public TextView A08;
    public TextView A09;
    public C07530bB A0A;
    public ActionMenuView A0B;
    public C04830Qv A0C;
    public CharSequence A0D;
    public CharSequence A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public final Context A0I;
    public final C08160dQ A0J;

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        this.A0J = new C08160dQ(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.f3nameremoved, typedValue, true) || (i2 = typedValue.resourceId) == 0) {
            this.A0I = context;
        } else {
            this.A0I = new ContextThemeWrapper(context, i2);
        }
        AnonymousClass0UD A002 = AnonymousClass0UD.A00(context, attributeSet, AnonymousClass0KC.A03, i, 0);
        AnonymousClass0YY.A04(A002.A02(0), this);
        TypedArray typedArray = A002.A02;
        this.A03 = typedArray.getResourceId(5, 0);
        this.A02 = typedArray.getResourceId(4, 0);
        this.A01 = typedArray.getLayoutDimension(3, 0);
        this.A00 = typedArray.getResourceId(2, R.layout.f8nameremoved);
        typedArray.recycle();
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    public final void A04() {
        if (this.A07 == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.f8nameremoved, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.A07 = linearLayout;
            this.A09 = AnonymousClass002.A09(linearLayout, R.id.action_bar_title);
            this.A08 = AnonymousClass002.A09(this.A07, R.id.action_bar_subtitle);
            int i = this.A03;
            if (i != 0) {
                this.A09.setTextAppearance(getContext(), i);
            }
            int i2 = this.A02;
            if (i2 != 0) {
                this.A08.setTextAppearance(getContext(), i2);
            }
        }
        this.A09.setText(this.A0E);
        this.A08.setText(this.A0D);
        boolean z = !TextUtils.isEmpty(this.A0E);
        boolean z2 = !TextUtils.isEmpty(this.A0D);
        int i3 = 0;
        this.A08.setVisibility(AnonymousClass001.A08(z2 ? 1 : 0));
        LinearLayout linearLayout2 = this.A07;
        if (!z && !z2) {
            i3 = 8;
        }
        linearLayout2.setVisibility(i3);
        if (this.A07.getParent() == null) {
            addView(this.A07);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0035  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(X.AnonymousClass0R2 r7) {
        /*
            r6 = this;
            android.view.View r0 = r6.A04
            if (r0 != 0) goto L_0x0091
            android.content.Context r0 = r6.getContext()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r0)
            int r0 = r6.A00
            android.view.View r0 = X.AnonymousClass001.A0R(r1, r6, r0)
            r6.A04 = r0
        L_0x0014:
            r6.addView(r0)
        L_0x0017:
            android.view.View r1 = r6.A04
            r0 = 2131427506(0x7f0b00b2, float:1.847663E38)
            android.view.View r1 = r1.findViewById(r0)
            r6.A05 = r1
            r5 = 0
            X.0wH r0 = new X.0wH
            r0.<init>(r7, r5, r6)
            r1.setOnClickListener(r0)
            android.view.Menu r2 = r7.A00()
            X.0cz r2 = (X.C07890cz) r2
            X.0bB r0 = r6.A0A
            if (r0 == 0) goto L_0x003f
            r0.A01()
            X.04N r0 = r0.A0D
            if (r0 == 0) goto L_0x003f
            r0.A01()
        L_0x003f:
            android.content.Context r0 = r6.getContext()
            X.0bB r1 = new X.0bB
            r1.<init>(r0)
            r6.A0A = r1
            r0 = 1
            r1.A0K = r0
            r1.A0L = r0
            r1 = -2
            r0 = -1
            android.view.ViewGroup$LayoutParams r4 = new android.view.ViewGroup$LayoutParams
            r4.<init>(r1, r0)
            X.0bB r1 = r6.A0A
            android.content.Context r0 = r6.A0I
            r2.A09(r0, r1)
            X.0bB r3 = r6.A0A
            X.0ra r2 = r3.A0C
            if (r2 != 0) goto L_0x0079
            android.view.LayoutInflater r1 = r3.A09
            r0 = 2131623939(0x7f0e0003, float:1.8875044E38)
            android.view.View r1 = r1.inflate(r0, r6, r5)
            X.0ra r1 = (X.C15570ra) r1
            r3.A0C = r1
            X.0cz r0 = r3.A0A
            r1.BGA(r0)
            r0 = 1
            r3.Brl(r0)
        L_0x0079:
            X.0ra r1 = r3.A0C
            if (r2 == r1) goto L_0x0083
            r0 = r1
            androidx.appcompat.widget.ActionMenuView r0 = (androidx.appcompat.widget.ActionMenuView) r0
            r0.setPresenter(r3)
        L_0x0083:
            androidx.appcompat.widget.ActionMenuView r1 = (androidx.appcompat.widget.ActionMenuView) r1
            r6.A0B = r1
            r0 = 0
            X.AnonymousClass0YY.A04(r0, r1)
            androidx.appcompat.widget.ActionMenuView r0 = r6.A0B
            r6.addView(r0, r4)
            return
        L_0x0091:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L_0x0017
            android.view.View r0 = r6.A04
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContextView.A05(X.0R2):void");
    }

    /* renamed from: getAnimatedVisibility$AbsActionBarView */
    public int getAnimatedVisibility() {
        if (this.A0C != null) {
            return this.A0J.A00;
        }
        return getVisibility();
    }

    public /* bridge */ /* synthetic */ int getContentHeight() {
        return this.A01;
    }

    public int getContentHeight$AbsActionBarView() {
        return this.A01;
    }

    public CharSequence getSubtitle() {
        return this.A0D;
    }

    public CharSequence getTitle() {
        return this.A0E;
    }

    public void setCustomView(View view) {
        View view2 = this.A06;
        if (view2 != null) {
            removeView(view2);
        }
        this.A06 = view;
        if (view != null) {
            LinearLayout linearLayout = this.A07;
            if (linearLayout != null) {
                removeView(linearLayout);
                this.A07 = null;
            }
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.A0D = charSequence;
        A04();
    }

    public void setTitle(CharSequence charSequence) {
        this.A0E = charSequence;
        A04();
    }

    public void setTitleOptional(boolean z) {
        if (z != this.A0H) {
            requestLayout();
        }
        this.A0H = z;
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public static int A00(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
            return -measuredWidth;
        }
        view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        return measuredWidth;
    }

    public void A03() {
        removeAllViews();
        this.A06 = null;
        this.A0B = null;
        this.A0A = null;
        View view = this.A05;
        if (view != null) {
            view.setOnClickListener((View.OnClickListener) null);
        }
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes((AttributeSet) null, AnonymousClass0KC.A00, R.attr.f3nameremoved, 0);
        this.A01 = obtainStyledAttributes.getLayoutDimension(13, 0);
        obtainStyledAttributes.recycle();
        C07530bB r1 = this.A0A;
        if (r1 != null) {
            r1.A02 = C02520Go.A00(r1.A05);
            C07890cz r12 = r1.A0A;
            if (r12 != null) {
                r12.A0F(true);
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C07530bB r0 = this.A0A;
        if (r0 != null) {
            r0.A01();
            AnonymousClass04N r02 = this.A0A.A0D;
            if (r02 != null) {
                r02.A01();
            }
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.A0F = false;
        }
        if (!this.A0F) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9) {
                if (!onHoverEvent) {
                    this.A0F = true;
                }
                return true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.A0F = false;
            return true;
        }
        return true;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.setSource(this);
            accessibilityEvent.setClassName(AnonymousClass000.A0O(this));
            accessibilityEvent.setPackageName(getContext().getPackageName());
            accessibilityEvent.setContentDescription(this.A0E);
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft;
        int paddingRight;
        int i5;
        int i6;
        boolean A082 = AnonymousClass0YH.A08(this);
        if (A082) {
            paddingLeft = (i3 - i) - getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
        }
        int paddingTop = getPaddingTop();
        int A052 = AnonymousClass000.A05(this, i4 - i2);
        View view = this.A04;
        if (!(view == null || view.getVisibility() == 8)) {
            ViewGroup.MarginLayoutParams A0T = AnonymousClass001.A0T(this.A04);
            if (A082) {
                int i7 = A0T.rightMargin;
                i5 = A0T.leftMargin;
                i6 = paddingLeft - i7;
            } else {
                int i8 = A0T.leftMargin;
                i5 = A0T.rightMargin;
                i6 = paddingLeft + i8;
            }
            int A002 = i6 + A00(this.A04, i6, paddingTop, A052, A082);
            if (A082) {
                paddingLeft = A002 - i5;
            } else {
                paddingLeft = A002 + i5;
            }
        }
        LinearLayout linearLayout = this.A07;
        if (!(linearLayout == null || this.A06 != null || linearLayout.getVisibility() == 8)) {
            paddingLeft += A00(this.A07, paddingLeft, paddingTop, A052, A082);
        }
        View view2 = this.A06;
        if (view2 != null) {
            A00(view2, paddingLeft, paddingTop, A052, A082);
        }
        if (A082) {
            paddingRight = getPaddingLeft();
        } else {
            paddingRight = (i3 - i) - getPaddingRight();
        }
        ActionMenuView actionMenuView = this.A0B;
        if (actionMenuView != null) {
            A00(actionMenuView, paddingRight, paddingTop, A052, !A082);
        }
    }

    public void onMeasure(int i, int i2) {
        int i3 = 1073741824;
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            StringBuilder A0o = AnonymousClass001.A0o();
            AnonymousClass000.A1A(this, A0o);
            throw AnonymousClass000.A0I(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)", A0o);
        } else if (View.MeasureSpec.getMode(i2) != 0) {
            int size = View.MeasureSpec.getSize(i);
            int i4 = this.A01;
            if (i4 <= 0) {
                i4 = View.MeasureSpec.getSize(i2);
            }
            int A032 = AnonymousClass000.A03(this);
            int A062 = AnonymousClass000.A06(this, size);
            int i5 = i4 - A032;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE);
            View view = this.A04;
            if (view != null) {
                view.measure(View.MeasureSpec.makeMeasureSpec(A062, Integer.MIN_VALUE), makeMeasureSpec);
                int A0C2 = AnonymousClass001.A0C(A062, view.getMeasuredWidth(), 0);
                ViewGroup.MarginLayoutParams A0T = AnonymousClass001.A0T(this.A04);
                A062 = A0C2 - (A0T.leftMargin + A0T.rightMargin);
            }
            ActionMenuView actionMenuView = this.A0B;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                ActionMenuView actionMenuView2 = this.A0B;
                actionMenuView2.measure(View.MeasureSpec.makeMeasureSpec(A062, Integer.MIN_VALUE), makeMeasureSpec);
                A062 = AnonymousClass001.A0C(A062, actionMenuView2.getMeasuredWidth(), 0);
            }
            LinearLayout linearLayout = this.A07;
            if (linearLayout != null && this.A06 == null) {
                if (this.A0H) {
                    this.A07.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.A07.getMeasuredWidth();
                    boolean z = false;
                    if (measuredWidth <= A062) {
                        z = true;
                        A062 -= measuredWidth;
                    }
                    LinearLayout linearLayout2 = this.A07;
                    int i6 = 8;
                    if (z) {
                        i6 = 0;
                    }
                    linearLayout2.setVisibility(i6);
                } else {
                    linearLayout.measure(View.MeasureSpec.makeMeasureSpec(A062, Integer.MIN_VALUE), makeMeasureSpec);
                    A062 = AnonymousClass001.A0C(A062, linearLayout.getMeasuredWidth(), 0);
                }
            }
            View view2 = this.A06;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                int i7 = layoutParams.width;
                int i8 = Integer.MIN_VALUE;
                if (i7 != -2) {
                    i8 = 1073741824;
                    if (i7 >= 0) {
                        A062 = Math.min(i7, A062);
                    }
                }
                int i9 = layoutParams.height;
                if (i9 == -2) {
                    i3 = Integer.MIN_VALUE;
                } else if (i9 >= 0) {
                    i5 = Math.min(i9, i5);
                }
                AnonymousClass001.A19(this.A06, i5, i3, View.MeasureSpec.makeMeasureSpec(A062, i8));
            }
            if (this.A01 <= 0) {
                int childCount = getChildCount();
                int i10 = 0;
                for (int i11 = 0; i11 < childCount; i11++) {
                    int measuredHeight = getChildAt(i11).getMeasuredHeight() + A032;
                    if (measuredHeight > i10) {
                        i10 = measuredHeight;
                    }
                }
                setMeasuredDimension(size, i10);
                return;
            }
            setMeasuredDimension(size, i4);
        } else {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            AnonymousClass000.A1A(this, A0o2);
            throw AnonymousClass000.A0I(" can only be used with android:layout_height=\"wrap_content\"", A0o2);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.A0G = false;
        }
        if (!this.A0G) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0) {
                if (!onTouchEvent) {
                    this.A0G = true;
                }
                return true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.A0G = false;
            return true;
        }
        return true;
    }

    /* renamed from: setVisibility$AbsActionBarView */
    public void setVisibility(int i) {
        if (i != getVisibility()) {
            C04830Qv r0 = this.A0C;
            if (r0 != null) {
                r0.A01();
            }
            super.setVisibility(i);
        }
    }

    public void setContentHeight(int i) {
        this.A01 = i;
    }

    public ActionBarContextView(Context context) {
        this(context, (AttributeSet) null);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f3nameremoved);
    }
}
