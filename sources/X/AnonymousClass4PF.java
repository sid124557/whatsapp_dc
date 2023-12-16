package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.4PF  reason: invalid class name */
public abstract class AnonymousClass4PF extends FrameLayout implements C16480tT {
    public static final AnonymousClass7Qj A0U = new AnonymousClass7Qj();
    public static final AnonymousClass7Qj A0V = new AnonymousClass6Z4();
    public static final int[] A0W = {16842912};
    public float A00 = 0.0f;
    public float A01;
    public float A02;
    public float A03;
    public int A04 = 0;
    public int A05 = 0;
    public int A06 = 0;
    public int A07;
    public int A08;
    public int A09 = -1;
    public int A0A;
    public ValueAnimator A0B;
    public ColorStateList A0C;
    public ColorStateList A0D;
    public Drawable A0E;
    public Drawable A0F;
    public Drawable A0G;
    public C07910d1 A0H;
    public AnonymousClass4M1 A0I;
    public AnonymousClass7Qj A0J = A0U;
    public boolean A0K = false;
    public boolean A0L = false;
    public boolean A0M = false;
    public boolean A0N;
    public final View A0O;
    public final ViewGroup A0P;
    public final FrameLayout A0Q;
    public final ImageView A0R;
    public final TextView A0S;
    public final TextView A0T;

    public static int A00(Context context, int i) {
        int i2;
        if (i != 0) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C1463179t.A0d);
            TypedValue A0B2 = AnonymousClass4L0.A0B();
            boolean value = obtainStyledAttributes.getValue(0, A0B2);
            obtainStyledAttributes.recycle();
            if (value) {
                if (Build.VERSION.SDK_INT >= 22) {
                    i2 = A0B2.getComplexUnit();
                } else {
                    i2 = (A0B2.data >> 0) & 15;
                }
                int i3 = A0B2.data;
                if (i2 == 2) {
                    return AnonymousClass001.A07(TypedValue.complexToFloat(i3), C86604Kt.A00(context));
                }
                return TypedValue.complexToDimensionPixelSize(i3, AnonymousClass000.A0B(context));
            }
        }
        return 0;
    }

    public abstract int getItemDefaultMarginResId();

    public abstract int getItemLayoutResId();

    private View getIconOrContainer() {
        FrameLayout frameLayout = this.A0Q;
        if (frameLayout == null) {
            return this.A0R;
        }
        return frameLayout;
    }

    private int getSuggestedIconHeight() {
        int i;
        AnonymousClass4M1 r0 = this.A0I;
        if (r0 != null) {
            i = r0.getMinimumHeight() / 2;
        } else {
            i = 0;
        }
        return C86664Kz.A0G(this.A0R, Math.max(i, C86664Kz.A0r(getIconOrContainer()).topMargin)) + i;
    }

    private int getSuggestedIconWidth() {
        int minimumWidth;
        AnonymousClass4M1 r0 = this.A0I;
        if (r0 == null) {
            minimumWidth = 0;
        } else {
            minimumWidth = r0.getMinimumWidth() - this.A0I.A09.A03.A0E.intValue();
        }
        FrameLayout.LayoutParams A0r = C86664Kz.A0r(getIconOrContainer());
        return C86664Kz.A0G(this.A0R, Math.max(minimumWidth, A0r.leftMargin)) + Math.max(minimumWidth, A0r.rightMargin);
    }

    public final void A02() {
        Drawable drawable = this.A0E;
        RippleDrawable rippleDrawable = null;
        boolean z = true;
        if (this.A0D != null) {
            Drawable activeIndicatorDrawable = getActiveIndicatorDrawable();
            if (this.A0K && getActiveIndicatorDrawable() != null && this.A0Q != null && activeIndicatorDrawable != null) {
                rippleDrawable = new RippleDrawable(C106925aO.A02(this.A0D), (Drawable) null, activeIndicatorDrawable);
                z = false;
            } else if (drawable == null) {
                drawable = new RippleDrawable(C106925aO.A01(this.A0D), (Drawable) null, (Drawable) null);
            }
        }
        FrameLayout frameLayout = this.A0Q;
        if (frameLayout != null) {
            AnonymousClass0YY.A04(rippleDrawable, frameLayout);
        }
        AnonymousClass0YY.A04(drawable, this);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(z);
        }
    }

    public final void A03(float f, float f2) {
        this.A03 = f - f2;
        this.A02 = (f2 * 1.0f) / f;
        this.A01 = (f * 1.0f) / f2;
    }

    public final void A04(float f, float f2) {
        View view = this.A0O;
        if (view != null) {
            AnonymousClass7Qj r2 = this.A0J;
            view.setScaleX(0.4f + ((1.0f - 0.4f) * f));
            view.setScaleY(r2.A00(f));
            int i = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
            float f3 = 0.0f;
            if (i == 0) {
                f3 = 0.8f;
            }
            float f4 = 0.2f;
            if (i == 0) {
                f4 = 1.0f;
            }
            view.setAlpha(C159917mg.A00(0.0f, 1.0f, f3, f4, f));
        }
        this.A00 = f;
    }

    public final void A05(int i) {
        int i2;
        View view = this.A0O;
        if (view != null) {
            int min = Math.min(this.A05, i - (this.A06 * 2));
            FrameLayout.LayoutParams A0r = C86664Kz.A0r(view);
            if (!this.A0L || this.A0A != 2) {
                i2 = this.A04;
            } else {
                i2 = min;
            }
            A0r.height = i2;
            A0r.width = min;
            view.setLayoutParams(A0r);
        }
    }

    public void BGB(C07910d1 r4, int i) {
        CharSequence title;
        this.A0H = r4;
        refreshDrawableState();
        setChecked(r4.isChecked());
        setEnabled(r4.isEnabled());
        setIcon(r4.getIcon());
        setTitle(r4.getTitle());
        setId(r4.getItemId());
        if (!TextUtils.isEmpty(r4.getContentDescription())) {
            setContentDescription(r4.getContentDescription());
        }
        if (!TextUtils.isEmpty(r4.getTooltipText())) {
            title = r4.getTooltipText();
        } else {
            title = r4.getTitle();
        }
        if (Build.VERSION.SDK_INT > 23) {
            C02550Gr.A00(this, title);
        }
        setVisibility(AnonymousClass001.A08(r4.isVisible() ? 1 : 0));
        this.A0M = true;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        FrameLayout frameLayout = this.A0Q;
        if (frameLayout != null && this.A0K) {
            frameLayout.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public Drawable getActiveIndicatorDrawable() {
        View view = this.A0O;
        if (view == null) {
            return null;
        }
        return view.getBackground();
    }

    public AnonymousClass4M1 getBadge() {
        return this.A0I;
    }

    public C07910d1 getItemData() {
        return this.A0H;
    }

    public int getItemPosition() {
        return this.A09;
    }

    public int getSuggestedMinimumHeight() {
        ViewGroup viewGroup = this.A0P;
        FrameLayout.LayoutParams A0r = C86664Kz.A0r(viewGroup);
        return AnonymousClass4L0.A04(viewGroup, getSuggestedIconHeight() + A0r.topMargin) + A0r.bottomMargin;
    }

    public int getSuggestedMinimumWidth() {
        ViewGroup viewGroup = this.A0P;
        FrameLayout.LayoutParams A0r = C86664Kz.A0r(viewGroup);
        return Math.max(getSuggestedIconWidth(), C86664Kz.A0G(viewGroup, A0r.leftMargin) + A0r.rightMargin);
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C07910d1 r1 = this.A0H;
        if (r1 != null && r1.isCheckable() && r1.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, A0W);
        }
        return onCreateDrawableState;
    }

    public void setActiveIndicatorDrawable(Drawable drawable) {
        View view = this.A0O;
        if (view != null) {
            view.setBackgroundDrawable(drawable);
            A02();
        }
    }

    public void setActiveIndicatorEnabled(boolean z) {
        this.A0K = z;
        A02();
        View view = this.A0O;
        if (view != null) {
            view.setVisibility(AnonymousClass001.A08(z ? 1 : 0));
            requestLayout();
        }
    }

    public void setActiveIndicatorHeight(int i) {
        this.A04 = i;
        A05(getWidth());
    }

    public void setActiveIndicatorMarginHorizontal(int i) {
        this.A06 = i;
        A05(getWidth());
    }

    public void setActiveIndicatorWidth(int i) {
        this.A05 = i;
        A05(getWidth());
    }

    public void setBadge(AnonymousClass4M1 r4) {
        ImageView imageView;
        AnonymousClass4M1 r0 = this.A0I;
        if (r0 != r4) {
            if (!(r0 == null || (imageView = this.A0R) == null)) {
                Log.w("NavigationBar", "Multiple badges shouldn't be attached to one item.");
                if (this.A0I != null) {
                    setClipChildren(true);
                    setClipToPadding(true);
                    C154047cU.A01(imageView, this.A0I);
                    this.A0I = null;
                }
            }
            this.A0I = r4;
            ImageView imageView2 = this.A0R;
            if (imageView2 != null && r4 != null) {
                setClipChildren(false);
                setClipToPadding(false);
                C154047cU.A00(imageView2, this.A0I);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00b1, code lost:
        if (r9.A0N != false) goto L_0x00b3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setChecked(boolean r10) {
        /*
            r9 = this;
            android.widget.TextView r6 = r9.A0S
            int r0 = r6.getWidth()
            r5 = 2
            int r0 = r0 / r5
            float r0 = (float) r0
            r6.setPivotX(r0)
            int r0 = r6.getBaseline()
            float r0 = (float) r0
            r6.setPivotY(r0)
            android.widget.TextView r4 = r9.A0T
            int r0 = X.C86664Kz.A0E(r4, r5)
            float r0 = (float) r0
            r4.setPivotX(r0)
            int r0 = r4.getBaseline()
            float r0 = (float) r0
            r4.setPivotY(r0)
            float r3 = X.C86634Kw.A00(r10)
            boolean r0 = r9.A0K
            if (r0 == 0) goto L_0x011d
            boolean r0 = r9.A0M
            if (r0 == 0) goto L_0x011d
            boolean r0 = X.C06360Xi.A04(r9)
            if (r0 == 0) goto L_0x011d
            android.animation.ValueAnimator r0 = r9.A0B
            if (r0 == 0) goto L_0x0042
            r0.cancel()
            r0 = 0
            r9.A0B = r0
        L_0x0042:
            float[] r2 = new float[r5]
            r1 = 0
            float r0 = r9.A00
            r2[r1] = r0
            android.animation.ValueAnimator r1 = X.C86664Kz.A0P(r2, r3)
            r9.A0B = r1
            X.7sN r0 = new X.7sN
            r0.<init>(r9, r3)
            r1.addUpdateListener(r0)
            android.animation.ValueAnimator r3 = r9.A0B
            android.content.Context r2 = r9.getContext()
            r1 = 2130970156(0x7f04062c, float:1.7549014E38)
            android.animation.TimeInterpolator r0 = X.C159917mg.A02
            android.animation.TimeInterpolator r0 = X.AnonymousClass5YH.A01(r0, r2, r1)
            r3.setInterpolator(r0)
            android.animation.ValueAnimator r3 = r9.A0B
            android.content.Context r2 = r9.getContext()
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131492904(0x7f0c0028, float:1.8609273E38)
            int r1 = r1.getInteger(r0)
            r0 = 2130970140(0x7f04061c, float:1.7548982E38)
            int r0 = X.C160907oe.A00(r2, r0, r1)
            long r0 = (long) r0
            r3.setDuration(r0)
            android.animation.ValueAnimator r0 = r9.A0B
            r0.start()
        L_0x008a:
            int r1 = r9.A0A
            r0 = -1
            r2 = 17
            r8 = 49
            r7 = 4
            r3 = 0
            if (r1 == r0) goto L_0x00af
            if (r1 == 0) goto L_0x00b3
            r0 = 1
            if (r1 == r0) goto L_0x00d8
            if (r1 != r5) goto L_0x00a8
            android.view.View r1 = r9.getIconOrContainer()
            int r0 = r9.A08
            A01(r1, r0, r2)
            X.C86624Kv.A12(r6, r4)
        L_0x00a8:
            r9.refreshDrawableState()
            r9.setSelected(r10)
            return
        L_0x00af:
            boolean r0 = r9.A0N
            if (r0 == 0) goto L_0x00d8
        L_0x00b3:
            android.view.View r1 = r9.getIconOrContainer()
            int r0 = r9.A08
            if (r10 == 0) goto L_0x00cc
            A01(r1, r0, r8)
            android.view.ViewGroup r1 = r9.A0P
            int r0 = r9.A07
            X.C86614Ku.A1D(r1, r0)
            r6.setVisibility(r3)
        L_0x00c8:
            r4.setVisibility(r7)
            goto L_0x00a8
        L_0x00cc:
            A01(r1, r0, r2)
            android.view.ViewGroup r0 = r9.A0P
            X.C86614Ku.A1D(r0, r3)
            r6.setVisibility(r7)
            goto L_0x00c8
        L_0x00d8:
            android.view.ViewGroup r1 = r9.A0P
            int r0 = r9.A07
            X.C86614Ku.A1D(r1, r0)
            android.view.View r2 = r9.getIconOrContainer()
            int r0 = r9.A08
            if (r10 == 0) goto L_0x0103
            float r1 = (float) r0
            float r0 = r9.A03
            float r1 = r1 + r0
            int r0 = (int) r1
            A01(r2, r0, r8)
            r0 = 1065353216(0x3f800000, float:1.0)
            r6.setScaleX(r0)
            r6.setScaleY(r0)
            r6.setVisibility(r3)
            float r0 = r9.A02
            r4.setScaleX(r0)
            r4.setScaleY(r0)
            goto L_0x00c8
        L_0x0103:
            A01(r2, r0, r8)
            float r0 = r9.A01
            r6.setScaleX(r0)
            r6.setScaleY(r0)
            r6.setVisibility(r7)
            r0 = 1065353216(0x3f800000, float:1.0)
            r4.setScaleX(r0)
            r4.setScaleY(r0)
            r4.setVisibility(r3)
            goto L_0x00a8
        L_0x011d:
            r9.A04(r3, r3)
            goto L_0x008a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4PF.setChecked(boolean):void");
    }

    public void setIcon(Drawable drawable) {
        if (drawable != this.A0F) {
            this.A0F = drawable;
            if (drawable != null) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = C86634Kw.A0G(drawable);
                this.A0G = drawable;
                ColorStateList colorStateList = this.A0C;
                if (colorStateList != null) {
                    AnonymousClass0YG.A01(colorStateList, drawable);
                }
            }
            this.A0R.setImageDrawable(drawable);
        }
    }

    public void setIconSize(int i) {
        ImageView imageView = this.A0R;
        FrameLayout.LayoutParams A0r = C86664Kz.A0r(imageView);
        A0r.width = i;
        A0r.height = i;
        imageView.setLayoutParams(A0r);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        Drawable drawable;
        this.A0C = colorStateList;
        if (this.A0H != null && (drawable = this.A0G) != null) {
            AnonymousClass0YG.A01(colorStateList, drawable);
            this.A0G.invalidateSelf();
        }
    }

    public void setItemBackground(Drawable drawable) {
        if (!(drawable == null || drawable.getConstantState() == null)) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        this.A0E = drawable;
        A02();
    }

    public void setItemPaddingBottom(int i) {
        if (this.A07 != i) {
            this.A07 = i;
            C07910d1 r0 = this.A0H;
            if (r0 != null) {
                setChecked(r0.isChecked());
            }
        }
    }

    public void setItemPaddingTop(int i) {
        if (this.A08 != i) {
            this.A08 = i;
            C07910d1 r0 = this.A0H;
            if (r0 != null) {
                setChecked(r0.isChecked());
            }
        }
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.A0D = colorStateList;
        A02();
    }

    public void setLabelVisibilityMode(int i) {
        AnonymousClass7Qj r0;
        if (this.A0A != i) {
            this.A0A = i;
            if (!this.A0L || i != 2) {
                r0 = A0U;
            } else {
                r0 = A0V;
            }
            this.A0J = r0;
            A05(getWidth());
            C07910d1 r02 = this.A0H;
            if (r02 != null) {
                setChecked(r02.isChecked());
            }
        }
    }

    public void setShifting(boolean z) {
        if (this.A0N != z) {
            this.A0N = z;
            C07910d1 r0 = this.A0H;
            if (r0 != null) {
                setChecked(r0.isChecked());
            }
        }
    }

    public void setTextAppearanceActive(int i) {
        TextView textView = this.A0S;
        AnonymousClass0Y9.A06(textView, i);
        int A002 = A00(textView.getContext(), i);
        if (A002 != 0) {
            textView.setTextSize(0, (float) A002);
        }
        A03(this.A0T.getTextSize(), textView.getTextSize());
        textView.setTypeface(textView.getTypeface(), 1);
    }

    public void setTextAppearanceInactive(int i) {
        TextView textView = this.A0T;
        AnonymousClass0Y9.A06(textView, i);
        int A002 = A00(textView.getContext(), i);
        if (A002 != 0) {
            textView.setTextSize(0, (float) A002);
        }
        A03(textView.getTextSize(), this.A0S.getTextSize());
    }

    public void setTextColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.A0T.setTextColor(colorStateList);
            this.A0S.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.A0T.setText(charSequence);
        this.A0S.setText(charSequence);
        C07910d1 r0 = this.A0H;
        if (r0 == null || TextUtils.isEmpty(r0.getContentDescription())) {
            setContentDescription(charSequence);
        }
        C07910d1 r02 = this.A0H;
        if (r02 != null && !TextUtils.isEmpty(r02.getTooltipText())) {
            charSequence = this.A0H.getTooltipText();
        }
        if (Build.VERSION.SDK_INT > 23) {
            C02550Gr.A00(this, charSequence);
        }
    }

    public AnonymousClass4PF(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(getItemLayoutResId(), this, true);
        this.A0Q = C86664Kz.A0s(this, R.id.navigation_bar_item_icon_container);
        this.A0O = findViewById(R.id.navigation_bar_item_active_indicator_view);
        ImageView A0F2 = AnonymousClass0x9.A0F(this, R.id.navigation_bar_item_icon_view);
        this.A0R = A0F2;
        ViewGroup A0J2 = C86644Kx.A0J(this, R.id.navigation_bar_item_labels_group);
        this.A0P = A0J2;
        TextView A092 = AnonymousClass002.A09(this, R.id.navigation_bar_item_small_label_view);
        this.A0T = A092;
        TextView A093 = AnonymousClass002.A09(this, R.id.navigation_bar_item_large_label_view);
        this.A0S = A093;
        setBackgroundResource(R.drawable.mtrl_navigation_bar_item_background);
        this.A08 = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        this.A07 = A0J2.getPaddingBottom();
        AnonymousClass0YY.A06(A092, 2);
        AnonymousClass0YY.A06(A093, 2);
        setFocusable(true);
        A03(A092.getTextSize(), A093.getTextSize());
        if (A0F2 != null) {
            A0F2.addOnLayoutChangeListener(new C1891690g((Object) this, 1));
        }
    }

    public static void A01(View view, int i, int i2) {
        FrameLayout.LayoutParams A0r = C86664Kz.A0r(view);
        A0r.topMargin = i;
        A0r.bottomMargin = i;
        A0r.gravity = i2;
        view.setLayoutParams(A0r);
    }

    private int getItemVisiblePosition() {
        ViewGroup A0l = C86664Kz.A0l(this);
        int indexOfChild = A0l.indexOfChild(this);
        int i = 0;
        for (int i2 = 0; i2 < indexOfChild; i2++) {
            View childAt = A0l.getChildAt(i2);
            if ((childAt instanceof AnonymousClass4PF) && childAt.getVisibility() == 0) {
                i++;
            }
        }
        return i;
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AnonymousClass4M1 r0 = this.A0I;
        if (r0 != null && r0.isVisible()) {
            C07910d1 r02 = this.A0H;
            CharSequence title = r02.getTitle();
            if (!TextUtils.isEmpty(r02.getContentDescription())) {
                title = this.A0H.getContentDescription();
            }
            StringBuilder A0v = C18290x4.A0v(title);
            AnonymousClass001.A1M(A0v);
            accessibilityNodeInfo.setContentDescription(AnonymousClass000.A0R(this.A0I.A01(), A0v));
        }
        C05650Ui r2 = new C05650Ui(accessibilityNodeInfo);
        C86664Kz.A1Q(this, r2, getItemVisiblePosition());
        r2.A0C(getResources().getString(R.string.f11nameremoved));
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        post(new C117705sM((Object) this, i, 4));
    }

    public void setActiveIndicatorResizeable(boolean z) {
        this.A0L = z;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
    }

    public void setEnabled(boolean z) {
        AnonymousClass0TU r0;
        super.setEnabled(z);
        this.A0T.setEnabled(z);
        this.A0S.setEnabled(z);
        this.A0R.setEnabled(z);
        if (z) {
            r0 = AnonymousClass0TU.A00(getContext());
        } else {
            r0 = null;
        }
        C06560Yg.A0P(this, r0);
    }

    public void setItemPosition(int i) {
        this.A09 = i;
    }

    public int getItemBackgroundResId() {
        return R.drawable.mtrl_navigation_bar_item_background;
    }

    public void setItemBackground(int i) {
        Drawable A0C2;
        if (i == 0) {
            A0C2 = null;
        } else {
            A0C2 = C86644Kx.A0C(this, i);
        }
        setItemBackground(A0C2);
    }
}
