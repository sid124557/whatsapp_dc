package androidx.appcompat.widget;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass02O;
import X.AnonymousClass03Q;
import X.AnonymousClass03n;
import X.AnonymousClass0XW;
import X.AnonymousClass0YH;
import X.AnonymousClass0b8;
import X.C001802d;
import X.C001902e;
import X.C008907c;
import X.C04340Nv;
import X.C06060Wb;
import X.C07530bB;
import X.C07580bG;
import X.C07890cz;
import X.C14500pn;
import X.C15610re;
import X.C16460tR;
import X.C16470tS;
import X.C17020uQ;
import X.C17760wC;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import java.util.ArrayList;

public class Toolbar extends ViewGroup {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public Context A0C;
    public ColorStateList A0D;
    public ColorStateList A0E;
    public Drawable A0F;
    public View A0G;
    public ImageButton A0H;
    public ImageButton A0I;
    public ImageView A0J;
    public TextView A0K;
    public C16460tR A0L;
    public C16470tS A0M;
    public C07530bB A0N;
    public ActionMenuView A0O;
    public C04340Nv A0P;
    public AnonymousClass0b8 A0Q;
    public C15610re A0R;
    public C07580bG A0S;
    public CharSequence A0T;
    public CharSequence A0U;
    public CharSequence A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public final C14500pn A0Z;
    public final Runnable A0a;
    public final ArrayList A0b;
    public final ArrayList A0c;
    public final int[] A0d;
    public TextView mTitleTextView;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Toolbar(android.content.Context r14, android.util.AttributeSet r15, int r16) {
        /*
            r13 = this;
            r10 = r13
            r7 = r14
            r9 = r15
            r12 = r16
            r13.<init>(r14, r15, r12)
            r0 = 8388627(0x800013, float:1.175497E-38)
            r13.A03 = r0
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()
            r13.A0c = r0
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()
            r13.A0b = r0
            r0 = 2
            int[] r0 = new int[r0]
            r13.A0d = r0
            X.0bD r0 = new X.0bD
            r0.<init>(r13)
            r13.A0Z = r0
            X.0iY r0 = new X.0iY
            r0.<init>(r13)
            r13.A0a = r0
            android.content.Context r0 = r13.getContext()
            int[] r11 = X.AnonymousClass0KC.A0N
            r2 = 0
            X.0UD r3 = X.AnonymousClass0UD.A00(r0, r15, r11, r12, r2)
            android.content.res.TypedArray r8 = r3.A02
            X.C06560Yg.A0B(r7, r8, r9, r10, r11, r12)
            r0 = 28
            int r0 = r8.getResourceId(r0, r2)
            r13.A0B = r0
            r0 = 19
            int r0 = r8.getResourceId(r0, r2)
            r13.A06 = r0
            int r0 = r13.A03
            int r0 = r8.getInteger(r2, r0)
            r13.A03 = r0
            r1 = 2
            r0 = 48
            int r0 = r8.getInteger(r1, r0)
            r13.A00 = r0
            r0 = 22
            int r1 = r8.getDimensionPixelOffset(r0, r2)
            r0 = 27
            boolean r0 = r8.hasValue(r0)
            if (r0 == 0) goto L_0x0071
            r0 = 27
            int r1 = r8.getDimensionPixelOffset(r0, r1)
        L_0x0071:
            r13.A07 = r1
            r13.A0A = r1
            r13.A08 = r1
            r13.A09 = r1
            r0 = 25
            r1 = -1
            int r0 = r8.getDimensionPixelOffset(r0, r1)
            if (r0 < 0) goto L_0x0084
            r13.A09 = r0
        L_0x0084:
            r0 = 24
            int r0 = r8.getDimensionPixelOffset(r0, r1)
            if (r0 < 0) goto L_0x008e
            r13.A08 = r0
        L_0x008e:
            r0 = 26
            int r0 = r8.getDimensionPixelOffset(r0, r1)
            if (r0 < 0) goto L_0x0098
            r13.A0A = r0
        L_0x0098:
            r0 = 23
            int r0 = r8.getDimensionPixelOffset(r0, r1)
            if (r0 < 0) goto L_0x00a2
            r13.A07 = r0
        L_0x00a2:
            r0 = 13
            int r0 = r8.getDimensionPixelSize(r0, r1)
            r13.A04 = r0
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = 9
            int r6 = r8.getDimensionPixelOffset(r0, r7)
            r0 = 5
            int r5 = r8.getDimensionPixelOffset(r0, r7)
            r0 = 7
            int r4 = r8.getDimensionPixelSize(r0, r2)
            r0 = 8
            int r1 = r8.getDimensionPixelSize(r0, r2)
            X.0Nv r0 = r13.A0P
            if (r0 != 0) goto L_0x00cd
            X.0Nv r0 = new X.0Nv
            r0.<init>()
            r13.A0P = r0
        L_0x00cd:
            r0.A06 = r2
            if (r4 == r7) goto L_0x00d5
            r0.A01 = r4
            r0.A03 = r4
        L_0x00d5:
            if (r1 == r7) goto L_0x00db
            r0.A02 = r1
            r0.A04 = r1
        L_0x00db:
            if (r6 != r7) goto L_0x00df
            if (r5 == r7) goto L_0x00e2
        L_0x00df:
            r0.A00(r6, r5)
        L_0x00e2:
            r0 = 10
            int r0 = r8.getDimensionPixelOffset(r0, r7)
            r13.A02 = r0
            r0 = 6
            int r0 = r8.getDimensionPixelOffset(r0, r7)
            r13.A01 = r0
            r0 = 4
            android.graphics.drawable.Drawable r0 = r3.A02(r0)
            r13.A0F = r0
            r0 = 3
            java.lang.CharSequence r0 = r8.getText(r0)
            r13.A0T = r0
            r0 = 21
            java.lang.CharSequence r1 = r8.getText(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x010e
            r13.setTitle((java.lang.CharSequence) r1)
        L_0x010e:
            r0 = 18
            java.lang.CharSequence r1 = r8.getText(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x011d
            r13.setSubtitle((java.lang.CharSequence) r1)
        L_0x011d:
            android.content.Context r0 = r13.getContext()
            r13.A0C = r0
            r0 = 17
            int r0 = r8.getResourceId(r0, r2)
            r13.setPopupTheme(r0)
            r0 = 16
            android.graphics.drawable.Drawable r0 = r3.A02(r0)
            if (r0 == 0) goto L_0x0137
            r13.setNavigationIcon((android.graphics.drawable.Drawable) r0)
        L_0x0137:
            r0 = 15
            java.lang.CharSequence r1 = r8.getText(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0146
            r13.setNavigationContentDescription((java.lang.CharSequence) r1)
        L_0x0146:
            r0 = 11
            android.graphics.drawable.Drawable r0 = r3.A02(r0)
            if (r0 == 0) goto L_0x0151
            r13.setLogo((android.graphics.drawable.Drawable) r0)
        L_0x0151:
            r0 = 12
            java.lang.CharSequence r1 = r8.getText(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0160
            r13.setLogoDescription((java.lang.CharSequence) r1)
        L_0x0160:
            r1 = 29
            boolean r0 = r8.hasValue(r1)
            if (r0 == 0) goto L_0x016f
            android.content.res.ColorStateList r0 = r3.A01(r1)
            r13.setTitleTextColor((android.content.res.ColorStateList) r0)
        L_0x016f:
            r1 = 20
            boolean r0 = r8.hasValue(r1)
            if (r0 == 0) goto L_0x017e
            android.content.res.ColorStateList r0 = r3.A01(r1)
            r13.setSubtitleTextColor((android.content.res.ColorStateList) r0)
        L_0x017e:
            r0 = 14
            boolean r0 = r8.hasValue(r0)
            if (r0 == 0) goto L_0x018f
            r0 = 14
            int r0 = r8.getResourceId(r0, r2)
            r13.A0B(r0)
        L_0x018f:
            r8.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public static C001802d A00(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C001802d) {
            return new C001802d((C001802d) layoutParams);
        }
        if (layoutParams instanceof C001902e) {
            return new C001802d((C001902e) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C001802d((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C001802d(layoutParams);
    }

    public void A06() {
        if (this.A0H == null) {
            AnonymousClass03Q r1 = new AnonymousClass03Q(getContext(), (AttributeSet) null, R.attr.f3nameremoved);
            this.A0H = r1;
            r1.setImageDrawable(this.A0F);
            this.A0H.setContentDescription(this.A0T);
            C001802d r2 = new C001802d();
            r2.A00 = (this.A00 & 112) | 8388611;
            r2.A00 = 2;
            this.A0H.setLayoutParams(r2);
            C17760wC.A00(this.A0H, this, 2);
        }
    }

    public void A07() {
        C04340Nv r1 = this.A0P;
        if (r1 == null) {
            r1 = new C04340Nv();
            this.A0P = r1;
        }
        r1.A06 = false;
        r1.A01 = 0;
        r1.A03 = 0;
        r1.A02 = 0;
        r1.A04 = 0;
    }

    public final void A09() {
        if (this.A0O == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), (AttributeSet) null);
            this.A0O = actionMenuView;
            actionMenuView.setPopupTheme(this.A05);
            ActionMenuView actionMenuView2 = this.A0O;
            actionMenuView2.A09 = this.A0Z;
            actionMenuView2.setMenuCallbacks(this.A0M, this.A0L);
            C001802d r2 = new C001802d();
            r2.A00 = (this.A00 & 112) | 8388613;
            this.A0O.setLayoutParams(r2);
            A0E(this.A0O, false);
        }
    }

    public final void A0A() {
        if (this.A0I == null) {
            this.A0I = new AnonymousClass03Q(getContext(), (AttributeSet) null, R.attr.f3nameremoved);
            C001802d r2 = new C001802d();
            r2.A00 = (this.A00 & 112) | 8388611;
            this.A0I.setLayoutParams(r2);
        }
    }

    public void A0C(int i, int i2) {
        C04340Nv r0 = this.A0P;
        if (r0 == null) {
            r0 = new C04340Nv();
            this.A0P = r0;
        }
        r0.A00(i, i2);
    }

    public final boolean A0H(View view) {
        if (view == null || view.getParent() != this || view.getVisibility() == 8) {
            return false;
        }
        return true;
    }

    public void A0I(Context context, int i) {
        this.A06 = i;
        TextView textView = this.A0K;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    public void A0J(Context context, int i) {
        this.A0B = i;
        TextView textView = this.mTitleTextView;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C001802d();
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.A0H;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.A0H;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        C04340Nv r1 = this.A0P;
        if (r1 == null) {
            return 0;
        }
        if (r1.A07) {
            return r1.A03;
        }
        return r1.A04;
    }

    public int getContentInsetEndWithActions() {
        int i = this.A01;
        if (i == Integer.MIN_VALUE) {
            return getContentInsetEnd();
        }
        return i;
    }

    public int getContentInsetLeft() {
        C04340Nv r0 = this.A0P;
        if (r0 != null) {
            return r0.A03;
        }
        return 0;
    }

    public int getContentInsetRight() {
        C04340Nv r0 = this.A0P;
        if (r0 != null) {
            return r0.A04;
        }
        return 0;
    }

    public int getContentInsetStart() {
        C04340Nv r1 = this.A0P;
        if (r1 == null) {
            return 0;
        }
        if (r1.A07) {
            return r1.A04;
        }
        return r1.A03;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.A02;
        if (i == Integer.MIN_VALUE) {
            return getContentInsetStart();
        }
        return i;
    }

    public int getCurrentContentInsetEnd() {
        C07890cz r0;
        ActionMenuView actionMenuView = this.A0O;
        if (actionMenuView == null || (r0 = actionMenuView.A06) == null || !r0.hasVisibleItems()) {
            return getContentInsetEnd();
        }
        return Math.max(getContentInsetEnd(), Math.max(this.A01, 0));
    }

    public Drawable getLogo() {
        ImageView imageView = this.A0J;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.A0J;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.A0I;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.A0I;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public C07530bB getOuterActionMenuPresenter() {
        return this.A0N;
    }

    public Context getPopupContext() {
        return this.A0C;
    }

    public int getPopupTheme() {
        return this.A05;
    }

    public CharSequence getSubtitle() {
        return this.A0U;
    }

    public final TextView getSubtitleTextView() {
        return this.A0K;
    }

    public CharSequence getTitle() {
        return this.A0V;
    }

    public int getTitleMarginBottom() {
        return this.A07;
    }

    public int getTitleMarginEnd() {
        return this.A08;
    }

    public int getTitleMarginStart() {
        return this.A09;
    }

    public int getTitleMarginTop() {
        return this.A0A;
    }

    public final TextView getTitleTextView() {
        return this.mTitleTextView;
    }

    public C17020uQ getWrapper() {
        C07580bG r1 = this.A0S;
        if (r1 != null) {
            return r1;
        }
        C07580bG r12 = new C07580bG(this, true);
        this.A0S = r12;
        return r12;
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0270 A[LOOP:1: B:99:0x026e->B:100:0x0270, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x028b A[LOOP:2: B:102:0x0289->B:103:0x028b, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x02c4  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x02d0 A[LOOP:3: B:110:0x02ce->B:111:0x02d0, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0190 A[LOOP:0: B:64:0x018e->B:65:0x0190, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x022a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r22, int r23, int r24, int r25, int r26) {
        /*
            r21 = this;
            r8 = r21
            int r1 = X.AnonymousClass0YH.A01(r8)
            r5 = 0
            r0 = 1
            boolean r20 = X.AnonymousClass000.A1U(r1, r0)
            int r19 = r8.getWidth()
            int r3 = r8.getHeight()
            int r10 = r8.getPaddingLeft()
            int r18 = r8.getPaddingRight()
            int r1 = r8.getPaddingTop()
            int r17 = r8.getPaddingBottom()
            int r11 = r19 - r18
            int[] r7 = r8.A0d
            r7[r0] = r5
            r7[r5] = r5
            int r0 = X.AnonymousClass0YY.A01(r8)
            if (r0 < 0) goto L_0x0262
            int r2 = r26 - r24
            int r9 = java.lang.Math.min(r0, r2)
        L_0x0038:
            android.widget.ImageButton r0 = r8.A0I
            boolean r0 = r8.A0H(r0)
            if (r0 == 0) goto L_0x0259
            android.widget.ImageButton r0 = r8.A0I
            if (r20 == 0) goto L_0x025b
            int r12 = r8.A04(r0, r7, r11, r9)
            r6 = r10
        L_0x0049:
            android.widget.ImageButton r0 = r8.A0H
            boolean r0 = r8.A0H(r0)
            if (r0 == 0) goto L_0x0059
            android.widget.ImageButton r0 = r8.A0H
            if (r20 == 0) goto L_0x0253
            int r12 = r8.A04(r0, r7, r12, r9)
        L_0x0059:
            androidx.appcompat.widget.ActionMenuView r0 = r8.A0O
            boolean r0 = r8.A0H(r0)
            if (r0 == 0) goto L_0x0069
            androidx.appcompat.widget.ActionMenuView r0 = r8.A0O
            if (r20 == 0) goto L_0x024d
            int r6 = r8.A03(r0, r7, r6, r9)
        L_0x0069:
            int r4 = r8.getCurrentContentInsetLeft()
            int r2 = r8.getCurrentContentInsetRight()
            int r0 = X.AnonymousClass001.A0C(r4, r6, r5)
            r7[r5] = r0
            int r0 = r11 - r12
            int r0 = X.AnonymousClass001.A0C(r2, r0, r5)
            r16 = 1
            r7[r16] = r0
            int r6 = java.lang.Math.max(r6, r4)
            int r11 = r11 - r2
            int r11 = java.lang.Math.min(r12, r11)
            android.view.View r0 = r8.A0G
            boolean r0 = r8.A0H(r0)
            if (r0 == 0) goto L_0x009a
            android.view.View r0 = r8.A0G
            if (r20 == 0) goto L_0x0247
            int r11 = r8.A04(r0, r7, r11, r9)
        L_0x009a:
            android.widget.ImageView r0 = r8.A0J
            boolean r0 = r8.A0H(r0)
            if (r0 == 0) goto L_0x00aa
            android.widget.ImageView r0 = r8.A0J
            if (r20 == 0) goto L_0x0241
            int r11 = r8.A04(r0, r7, r11, r9)
        L_0x00aa:
            android.widget.TextView r0 = r8.mTitleTextView
            boolean r15 = r8.A0H(r0)
            android.widget.TextView r0 = r8.A0K
            boolean r14 = r8.A0H(r0)
            if (r15 == 0) goto L_0x00ca
            android.widget.TextView r0 = r8.mTitleTextView
            android.view.ViewGroup$MarginLayoutParams r2 = X.AnonymousClass001.A0T(r0)
            int r5 = r2.topMargin
            android.widget.TextView r0 = r8.mTitleTextView
            int r0 = r0.getMeasuredHeight()
            int r5 = r5 + r0
            int r0 = r2.bottomMargin
            int r5 = r5 + r0
        L_0x00ca:
            if (r14 == 0) goto L_0x00df
            android.widget.TextView r0 = r8.A0K
            android.view.ViewGroup$MarginLayoutParams r4 = X.AnonymousClass001.A0T(r0)
            int r2 = r4.topMargin
            android.widget.TextView r0 = r8.A0K
            int r0 = r0.getMeasuredHeight()
            int r2 = r2 + r0
            int r0 = r4.bottomMargin
            int r2 = r2 + r0
            int r5 = r5 + r2
        L_0x00df:
            if (r15 != 0) goto L_0x023a
            if (r14 == 0) goto L_0x0182
            android.widget.TextView r2 = r8.A0K
        L_0x00e5:
            android.widget.TextView r0 = r8.A0K
        L_0x00e7:
            android.view.ViewGroup$MarginLayoutParams r13 = X.AnonymousClass001.A0T(r2)
            android.view.ViewGroup$MarginLayoutParams r12 = X.AnonymousClass001.A0T(r0)
            if (r15 == 0) goto L_0x00f9
            android.widget.TextView r0 = r8.mTitleTextView
            int r0 = r0.getMeasuredWidth()
            if (r0 > 0) goto L_0x0103
        L_0x00f9:
            if (r14 == 0) goto L_0x0236
            android.widget.TextView r0 = r8.A0K
            int r0 = r0.getMeasuredWidth()
            if (r0 <= 0) goto L_0x0236
        L_0x0103:
            int r0 = r8.A03
            r2 = r0 & 112(0x70, float:1.57E-43)
            r0 = 48
            if (r2 == r0) goto L_0x022a
            r0 = 80
            if (r2 == r0) goto L_0x021e
            int r0 = r3 - r1
            int r0 = r0 - r17
            int r0 = r0 - r5
            int r4 = r0 / 2
            int r2 = r13.topMargin
            int r0 = r8.A0A
            int r2 = r2 + r0
            if (r4 >= r2) goto L_0x0206
            r4 = r2
        L_0x011e:
            int r1 = r1 + r4
        L_0x011f:
            if (r20 == 0) goto L_0x01a1
            if (r16 == 0) goto L_0x019f
            int r4 = r8.A09
        L_0x0125:
            r3 = 1
            r0 = r7[r3]
            int r4 = r4 - r0
            r2 = 0
            int r0 = java.lang.Math.max(r2, r4)
            int r11 = r11 - r0
            int r0 = -r4
            int r0 = java.lang.Math.max(r2, r0)
            r7[r3] = r0
            if (r15 == 0) goto L_0x019d
            android.widget.TextView r0 = r8.mTitleTextView
            android.view.ViewGroup$MarginLayoutParams r3 = X.AnonymousClass001.A0T(r0)
            android.widget.TextView r0 = r8.mTitleTextView
            int r0 = r0.getMeasuredWidth()
            int r4 = r11 - r0
            android.widget.TextView r0 = r8.mTitleTextView
            int r2 = r0.getMeasuredHeight()
            int r2 = r2 + r1
            android.widget.TextView r0 = r8.mTitleTextView
            r0.layout(r4, r1, r11, r2)
            int r0 = r8.A08
            int r4 = r4 - r0
            int r0 = r3.bottomMargin
            int r1 = r2 + r0
        L_0x0159:
            if (r14 == 0) goto L_0x019b
            android.widget.TextView r0 = r8.A0K
            android.view.ViewGroup$MarginLayoutParams r0 = X.AnonymousClass001.A0T(r0)
            int r0 = r0.topMargin
            int r1 = r1 + r0
            android.widget.TextView r0 = r8.A0K
            int r0 = r0.getMeasuredWidth()
            int r3 = r11 - r0
            android.widget.TextView r0 = r8.A0K
            int r2 = r0.getMeasuredHeight()
            int r2 = r2 + r1
            android.widget.TextView r0 = r8.A0K
            r0.layout(r3, r1, r11, r2)
            int r0 = r8.A08
            int r0 = r11 - r0
        L_0x017c:
            if (r16 == 0) goto L_0x0182
            int r11 = java.lang.Math.min(r4, r0)
        L_0x0182:
            r5 = 0
        L_0x0183:
            java.util.ArrayList r4 = r8.A0c
            r0 = 3
            r8.A0F(r4, r0)
            int r2 = r4.size()
            r1 = 0
        L_0x018e:
            if (r1 >= r2) goto L_0x0265
            android.view.View r0 = X.AnonymousClass001.A0S(r4, r1)
            int r6 = r8.A03(r0, r7, r6, r9)
            int r1 = r1 + 1
            goto L_0x018e
        L_0x019b:
            r0 = r11
            goto L_0x017c
        L_0x019d:
            r4 = r11
            goto L_0x0159
        L_0x019f:
            r4 = 0
            goto L_0x0125
        L_0x01a1:
            if (r16 == 0) goto L_0x0203
            int r2 = r8.A09
            r5 = 0
        L_0x01a6:
            r0 = r7[r5]
            int r2 = r2 - r0
            int r0 = java.lang.Math.max(r5, r2)
            int r6 = r6 + r0
            int r0 = -r2
            int r0 = java.lang.Math.max(r5, r0)
            r7[r5] = r0
            if (r15 == 0) goto L_0x0201
            android.widget.TextView r0 = r8.mTitleTextView
            android.view.ViewGroup$MarginLayoutParams r3 = X.AnonymousClass001.A0T(r0)
            android.widget.TextView r0 = r8.mTitleTextView
            int r4 = r0.getMeasuredWidth()
            int r4 = r4 + r6
            android.widget.TextView r0 = r8.mTitleTextView
            int r2 = r0.getMeasuredHeight()
            int r2 = r2 + r1
            android.widget.TextView r0 = r8.mTitleTextView
            r0.layout(r6, r1, r4, r2)
            int r0 = r8.A08
            int r4 = r4 + r0
            int r0 = r3.bottomMargin
            int r1 = r2 + r0
        L_0x01d7:
            if (r14 == 0) goto L_0x01ff
            android.widget.TextView r0 = r8.A0K
            android.view.ViewGroup$MarginLayoutParams r0 = X.AnonymousClass001.A0T(r0)
            int r0 = r0.topMargin
            int r1 = r1 + r0
            android.widget.TextView r0 = r8.A0K
            int r3 = r0.getMeasuredWidth()
            int r3 = r3 + r6
            android.widget.TextView r0 = r8.A0K
            int r2 = r0.getMeasuredHeight()
            int r2 = r2 + r1
            android.widget.TextView r0 = r8.A0K
            r0.layout(r6, r1, r3, r2)
            int r0 = r8.A08
            int r3 = r3 + r0
        L_0x01f8:
            if (r16 == 0) goto L_0x0183
            int r6 = java.lang.Math.max(r4, r3)
            goto L_0x0183
        L_0x01ff:
            r3 = r6
            goto L_0x01f8
        L_0x0201:
            r4 = r6
            goto L_0x01d7
        L_0x0203:
            r5 = 0
            r2 = 0
            goto L_0x01a6
        L_0x0206:
            int r3 = r3 - r17
            int r3 = r3 - r5
            int r3 = r3 - r4
            int r3 = r3 - r1
            int r0 = r13.bottomMargin
            int r2 = r8.A07
            int r0 = r0 + r2
            if (r3 >= r0) goto L_0x011e
            int r0 = r12.bottomMargin
            int r0 = r0 + r2
            int r0 = r0 - r3
            int r4 = r4 - r0
            r0 = 0
            int r4 = java.lang.Math.max(r0, r4)
            goto L_0x011e
        L_0x021e:
            int r3 = r3 - r17
            int r0 = r12.bottomMargin
            int r3 = r3 - r0
            int r0 = r8.A07
            int r3 = r3 - r0
            int r1 = r3 - r5
            goto L_0x011f
        L_0x022a:
            int r1 = r8.getPaddingTop()
            int r0 = r13.topMargin
            int r1 = r1 + r0
            int r0 = r8.A0A
            int r1 = r1 + r0
            goto L_0x011f
        L_0x0236:
            r16 = 0
            goto L_0x0103
        L_0x023a:
            android.widget.TextView r2 = r8.mTitleTextView
            if (r14 != 0) goto L_0x00e5
            r0 = r2
            goto L_0x00e7
        L_0x0241:
            int r6 = r8.A03(r0, r7, r6, r9)
            goto L_0x00aa
        L_0x0247:
            int r6 = r8.A03(r0, r7, r6, r9)
            goto L_0x009a
        L_0x024d:
            int r12 = r8.A04(r0, r7, r12, r9)
            goto L_0x0069
        L_0x0253:
            int r6 = r8.A03(r0, r7, r6, r9)
            goto L_0x0059
        L_0x0259:
            r6 = r10
            goto L_0x025f
        L_0x025b:
            int r6 = r8.A03(r0, r7, r10, r9)
        L_0x025f:
            r12 = r11
            goto L_0x0049
        L_0x0262:
            r9 = 0
            goto L_0x0038
        L_0x0265:
            r0 = 5
            r8.A0F(r4, r0)
            int r2 = r4.size()
            r1 = 0
        L_0x026e:
            if (r1 >= r2) goto L_0x027b
            android.view.View r0 = X.AnonymousClass001.A0S(r4, r1)
            int r11 = r8.A04(r0, r7, r11, r9)
            int r1 = r1 + 1
            goto L_0x026e
        L_0x027b:
            r0 = 1
            r8.A0F(r4, r0)
            r17 = r7[r5]
            r16 = r7[r0]
            int r13 = r4.size()
            r12 = 0
            r3 = 0
        L_0x0289:
            if (r12 >= r13) goto L_0x02b7
            android.view.View r15 = X.AnonymousClass001.A0S(r4, r12)
            android.view.ViewGroup$MarginLayoutParams r1 = X.AnonymousClass001.A0T(r15)
            int r0 = r1.leftMargin
            int r0 = r0 - r17
            int r14 = r1.rightMargin
            int r14 = r14 - r16
            int r2 = java.lang.Math.max(r5, r0)
            int r1 = java.lang.Math.max(r5, r14)
            int r0 = -r0
            int r17 = java.lang.Math.max(r5, r0)
            int r0 = -r14
            int r16 = java.lang.Math.max(r5, r0)
            int r0 = r15.getMeasuredWidth()
            int r2 = r2 + r0
            int r2 = r2 + r1
            int r3 = r3 + r2
            int r12 = r12 + 1
            goto L_0x0289
        L_0x02b7:
            int r19 = r19 - r10
            int r19 = r19 - r18
            int r0 = r19 / 2
            int r10 = r10 + r0
            int r0 = r3 / 2
            int r10 = r10 - r0
            int r3 = r3 + r10
            if (r10 < r6) goto L_0x02ca
            r6 = r10
            if (r3 <= r11) goto L_0x02ca
            int r3 = r3 - r11
            int r6 = r10 - r3
        L_0x02ca:
            int r1 = r4.size()
        L_0x02ce:
            if (r5 >= r1) goto L_0x02db
            android.view.View r0 = X.AnonymousClass001.A0S(r4, r5)
            int r6 = r8.A03(r0, r7, r6, r9)
            int r5 = r5 + 1
            goto L_0x02ce
        L_0x02db:
            r4.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int[] iArr = this.A0d;
        char A082 = AnonymousClass0YH.A08(this);
        int i9 = 0;
        char c = A082 ^ 1;
        int i10 = i;
        int i11 = i2;
        if (A0H(this.A0I)) {
            A0D(this.A0I, i10, 0, i11, this.A04);
            i3 = C06060Wb.A00(this.A0I, this.A0I.getMeasuredWidth());
            int measuredHeight = this.A0I.getMeasuredHeight();
            ViewGroup.MarginLayoutParams A0T2 = AnonymousClass001.A0T(this.A0I);
            i4 = AnonymousClass001.A0B(measuredHeight, A0T2.topMargin + A0T2.bottomMargin, 0);
            i5 = AnonymousClass000.A04(this.A0I, 0);
        } else {
            i3 = 0;
            i4 = 0;
            i5 = 0;
        }
        if (A0H(this.A0H)) {
            A0D(this.A0H, i10, 0, i11, this.A04);
            i3 = C06060Wb.A00(this.A0H, this.A0H.getMeasuredWidth());
            int measuredHeight2 = this.A0H.getMeasuredHeight();
            ViewGroup.MarginLayoutParams A0T3 = AnonymousClass001.A0T(this.A0H);
            i4 = AnonymousClass001.A0B(measuredHeight2, A0T3.topMargin + A0T3.bottomMargin, i4);
            i5 = AnonymousClass000.A04(this.A0H, i5);
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i3);
        iArr[A082] = AnonymousClass001.A0C(currentContentInsetStart, i3, 0);
        if (A0H(this.A0O)) {
            A0D(this.A0O, i10, max, i11, this.A04);
            i6 = C06060Wb.A00(this.A0O, this.A0O.getMeasuredWidth());
            int measuredHeight3 = this.A0O.getMeasuredHeight();
            ViewGroup.MarginLayoutParams A0T4 = AnonymousClass001.A0T(this.A0O);
            i4 = AnonymousClass001.A0B(measuredHeight3, A0T4.topMargin + A0T4.bottomMargin, i4);
            i5 = AnonymousClass000.A04(this.A0O, i5);
        } else {
            i6 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i6);
        iArr[c] = AnonymousClass001.A0C(currentContentInsetEnd, i6, 0);
        if (A0H(this.A0G)) {
            max2 += A05(this.A0G, iArr, i10, max2, i11, 0);
            int measuredHeight4 = this.A0G.getMeasuredHeight();
            ViewGroup.MarginLayoutParams A0T5 = AnonymousClass001.A0T(this.A0G);
            i4 = AnonymousClass001.A0B(measuredHeight4, A0T5.topMargin + A0T5.bottomMargin, i4);
            i5 = AnonymousClass000.A04(this.A0G, i5);
        }
        if (A0H(this.A0J)) {
            max2 += A05(this.A0J, iArr, i10, max2, i11, 0);
            int measuredHeight5 = this.A0J.getMeasuredHeight();
            ViewGroup.MarginLayoutParams A0T6 = AnonymousClass001.A0T(this.A0J);
            i4 = AnonymousClass001.A0B(measuredHeight5, A0T6.topMargin + A0T6.bottomMargin, i4);
            i5 = AnonymousClass000.A04(this.A0J, i5);
        }
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (((C001802d) childAt.getLayoutParams()).A00 == 0 && A0H(childAt)) {
                max2 += A05(childAt, iArr, i10, max2, i11, 0);
                int measuredHeight6 = childAt.getMeasuredHeight();
                ViewGroup.MarginLayoutParams A0T7 = AnonymousClass001.A0T(childAt);
                i4 = AnonymousClass001.A0B(measuredHeight6, A0T7.topMargin + A0T7.bottomMargin, i4);
                i5 = AnonymousClass000.A04(childAt, i5);
            }
        }
        int i13 = this.A0A + this.A07;
        int i14 = this.A09 + this.A08;
        if (A0H(this.mTitleTextView)) {
            A05(this.mTitleTextView, iArr, i10, max2 + i14, i11, i13);
            i7 = C06060Wb.A00(this.mTitleTextView, this.mTitleTextView.getMeasuredWidth());
            int measuredHeight7 = this.mTitleTextView.getMeasuredHeight();
            ViewGroup.MarginLayoutParams A0T8 = AnonymousClass001.A0T(this.mTitleTextView);
            i8 = measuredHeight7 + A0T8.topMargin + A0T8.bottomMargin;
            i5 = AnonymousClass000.A04(this.mTitleTextView, i5);
        } else {
            i7 = 0;
            i8 = 0;
        }
        if (A0H(this.A0K)) {
            i7 = Math.max(i7, A05(this.A0K, iArr, i10, max2 + i14, i11, i8 + i13));
            int measuredHeight8 = this.A0K.getMeasuredHeight();
            ViewGroup.MarginLayoutParams A0T9 = AnonymousClass001.A0T(this.A0K);
            i8 += measuredHeight8 + A0T9.topMargin + A0T9.bottomMargin;
            i5 = AnonymousClass000.A04(this.A0K, i5);
        }
        int max3 = Math.max(i4, i8);
        int A022 = max2 + i7 + AnonymousClass000.A02(this);
        int A032 = max3 + AnonymousClass000.A03(this);
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(A022, getSuggestedMinimumWidth()), i10, -16777216 & i5);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(A032, getSuggestedMinimumHeight()), i11, i5 << 16);
        if (this.A0W) {
            int childCount2 = getChildCount();
            int i15 = 0;
            while (true) {
                if (i15 >= childCount2) {
                    break;
                }
                View childAt2 = getChildAt(i15);
                if (A0H(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                    break;
                }
                i15++;
            }
        }
        i9 = resolveSizeAndState2;
        setMeasuredDimension(resolveSizeAndState, i9);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        C07890cz r2;
        MenuItem findItem;
        if (!(parcelable instanceof C008907c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C008907c r4 = (C008907c) parcelable;
        super.onRestoreInstanceState(r4.A00);
        ActionMenuView actionMenuView = this.A0O;
        if (actionMenuView != null) {
            r2 = actionMenuView.A06;
        } else {
            r2 = null;
        }
        int i = r4.A00;
        if (!(i == 0 || this.A0Q == null || r2 == null || (findItem = r2.findItem(i)) == null)) {
            findItem.expandActionView();
        }
        if (r4.A01) {
            Runnable runnable = this.A0a;
            removeCallbacks(runnable);
            post(runnable);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            A06();
            this.A0H.setImageDrawable(drawable);
            return;
        }
        ImageButton imageButton = this.A0H;
        if (imageButton != null) {
            imageButton.setImageDrawable(this.A0F);
        }
    }

    public void setCollapsible(boolean z) {
        this.A0W = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.A01) {
            this.A01 = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.A02) {
            this.A02 = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            ImageView imageView = this.A0J;
            if (imageView == null) {
                imageView = new AppCompatImageView(getContext(), (AttributeSet) null);
                this.A0J = imageView;
            }
            if (!A0G(imageView)) {
                A0E(this.A0J, true);
            }
        } else {
            ImageView imageView2 = this.A0J;
            if (imageView2 != null && A0G(imageView2)) {
                removeView(this.A0J);
                this.A0b.remove(this.A0J);
            }
        }
        ImageView imageView3 = this.A0J;
        if (imageView3 != null) {
            imageView3.setImageDrawable(drawable);
        }
    }

    public void setMenu(C07890cz r5, C07530bB r6) {
        if (r5 != null || this.A0O != null) {
            A09();
            C07890cz r1 = this.A0O.A06;
            if (r1 != r5) {
                if (r1 != null) {
                    r1.A0E(this.A0N);
                    r1.A0E(this.A0Q);
                }
                if (this.A0Q == null) {
                    this.A0Q = new AnonymousClass0b8(this);
                }
                r6.A0I = true;
                Context context = this.A0C;
                if (r5 != null) {
                    r5.A09(context, r6);
                    r5.A09(this.A0C, this.A0Q);
                } else {
                    r6.BG6(context, (C07890cz) null);
                    this.A0Q.BG6(this.A0C, (C07890cz) null);
                    r6.Brl(true);
                    this.A0Q.Brl(true);
                }
                this.A0O.setPopupTheme(this.A05);
                this.A0O.setPresenter(r6);
                this.A0N = r6;
            }
        }
    }

    public void setMenuCallbacks(C16470tS r2, C16460tR r3) {
        this.A0M = r2;
        this.A0L = r3;
        ActionMenuView actionMenuView = this.A0O;
        if (actionMenuView != null) {
            actionMenuView.setMenuCallbacks(r2, r3);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            A0A();
            if (!A0G(this.A0I)) {
                A0E(this.A0I, true);
            }
        } else {
            ImageButton imageButton = this.A0I;
            if (imageButton != null && A0G(imageButton)) {
                removeView(this.A0I);
                this.A0b.remove(this.A0I);
            }
        }
        ImageButton imageButton2 = this.A0I;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setPopupTheme(int i) {
        Context contextThemeWrapper;
        if (this.A05 != i) {
            this.A05 = i;
            if (i == 0) {
                contextThemeWrapper = getContext();
            } else {
                contextThemeWrapper = new ContextThemeWrapper(getContext(), i);
            }
            this.A0C = contextThemeWrapper;
        }
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.A0D = colorStateList;
        TextView textView = this.A0K;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitleMarginBottom(int i) {
        this.A07 = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.A08 = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.A09 = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.A0A = i;
        requestLayout();
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.A0E = colorStateList;
        TextView textView = this.mTitleTextView;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    private MenuInflater getMenuInflater() {
        return new AnonymousClass02O(getContext());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0029, code lost:
        if (r1 != 80) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A02(android.view.View r9, int r10) {
        /*
            r8 = this;
            android.view.ViewGroup$LayoutParams r6 = r9.getLayoutParams()
            X.02e r6 = (X.C001902e) r6
            int r7 = r9.getMeasuredHeight()
            r5 = 0
            if (r10 <= 0) goto L_0x0052
            int r0 = r7 - r10
            int r3 = r0 / 2
        L_0x0011:
            int r0 = r6.A00
            r1 = r0 & 112(0x70, float:1.57E-43)
            r0 = 16
            if (r1 == r0) goto L_0x002b
            r0 = 48
            if (r1 == r0) goto L_0x005e
            r2 = 80
            if (r1 == r2) goto L_0x0054
            int r0 = r8.A03
            r1 = r0 & 112(0x70, float:1.57E-43)
            r0 = 48
            if (r1 == r0) goto L_0x005e
            if (r1 == r2) goto L_0x0054
        L_0x002b:
            int r4 = r8.getPaddingTop()
            int r3 = r8.getPaddingBottom()
            int r2 = r8.getHeight()
            int r0 = r2 - r4
            int r0 = r0 - r3
            int r0 = r0 - r7
            int r1 = r0 / 2
            int r0 = r6.topMargin
            if (r1 >= r0) goto L_0x0044
            r1 = r0
        L_0x0042:
            int r4 = r4 + r1
            return r4
        L_0x0044:
            int r2 = r2 - r3
            int r2 = r2 - r7
            int r2 = r2 - r1
            int r2 = r2 - r4
            int r0 = r6.bottomMargin
            if (r2 >= r0) goto L_0x0042
            int r0 = r0 - r2
            int r1 = X.AnonymousClass001.A0C(r1, r0, r5)
            goto L_0x0042
        L_0x0052:
            r3 = 0
            goto L_0x0011
        L_0x0054:
            int r1 = X.AnonymousClass001.A0H(r8)
            int r1 = r1 - r7
            int r0 = r6.bottomMargin
            int r1 = r1 - r0
            int r1 = r1 - r3
            return r1
        L_0x005e:
            int r0 = r8.getPaddingTop()
            int r0 = r0 - r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.A02(android.view.View, int):int");
    }

    public final int A03(View view, int[] iArr, int i, int i2) {
        ViewGroup.MarginLayoutParams A0T2 = AnonymousClass001.A0T(view);
        int i3 = A0T2.leftMargin - iArr[0];
        int max = i + Math.max(0, i3);
        iArr[0] = Math.max(0, -i3);
        int A022 = A02(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, A022, max + measuredWidth, view.getMeasuredHeight() + A022);
        return max + measuredWidth + A0T2.rightMargin;
    }

    public final int A04(View view, int[] iArr, int i, int i2) {
        ViewGroup.MarginLayoutParams A0T2 = AnonymousClass001.A0T(view);
        int i3 = A0T2.rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int A022 = A02(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, A022, max, view.getMeasuredHeight() + A022);
        return max - (measuredWidth + A0T2.leftMargin);
    }

    public final int A05(View view, int[] iArr, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams A0T2 = AnonymousClass001.A0T(view);
        int i5 = A0T2.leftMargin - iArr[0];
        int i6 = A0T2.rightMargin - iArr[1];
        int max = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, AnonymousClass000.A02(this) + max + i2, A0T2.width), ViewGroup.getChildMeasureSpec(i3, AnonymousClass000.A03(this) + A0T2.topMargin + A0T2.bottomMargin + i4, A0T2.height));
        return view.getMeasuredWidth() + max;
    }

    public final void A08() {
        A09();
        ActionMenuView actionMenuView = this.A0O;
        if (actionMenuView.A06 == null) {
            C07890cz r3 = (C07890cz) actionMenuView.getMenu();
            AnonymousClass0b8 r2 = this.A0Q;
            if (r2 == null) {
                r2 = new AnonymousClass0b8(this);
                this.A0Q = r2;
            }
            this.A0O.setExpandedActionViewsExclusive(true);
            r3.A09(this.A0C, r2);
        }
    }

    public void A0B(int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    public final void A0D(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams A0T2 = AnonymousClass001.A0T(view);
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, AnonymousClass000.A02(this) + A0T2.leftMargin + A0T2.rightMargin + i2, A0T2.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, AnonymousClass000.A03(this) + A0T2.topMargin + A0T2.bottomMargin, A0T2.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final void A0E(View view, boolean z) {
        C001802d r1;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            r1 = new C001802d();
        } else if (!checkLayoutParams(layoutParams)) {
            r1 = A00(layoutParams);
        } else {
            r1 = (C001802d) layoutParams;
        }
        r1.A00 = 1;
        if (!z || this.A0G == null) {
            addView(view, r1);
            return;
        }
        view.setLayoutParams(r1);
        this.A0b.add(view);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x004e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0085 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0F(java.util.List r10, int r11) {
        /*
            r9 = this;
            int r0 = X.AnonymousClass0YH.A01(r9)
            r7 = 0
            r6 = 1
            boolean r1 = X.AnonymousClass000.A1U(r0, r6)
            int r5 = r9.getChildCount()
            int r0 = X.AnonymousClass0YH.A01(r9)
            int r8 = android.view.Gravity.getAbsoluteGravity(r11, r0)
            r10.clear()
            if (r1 == 0) goto L_0x0053
            int r5 = r5 - r6
        L_0x001c:
            if (r5 < 0) goto L_0x008a
            android.view.View r4 = r9.getChildAt(r5)
            android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
            X.02d r1 = (X.C001802d) r1
            int r0 = r1.A00
            if (r0 != 0) goto L_0x004e
            boolean r0 = r9.A0H(r4)
            if (r0 == 0) goto L_0x004e
            int r0 = r1.A00
            int r3 = X.AnonymousClass0YH.A01(r9)
            int r0 = android.view.Gravity.getAbsoluteGravity(r0, r3)
            r2 = r0 & 7
            if (r2 == r6) goto L_0x0051
            r1 = 3
            if (r2 == r1) goto L_0x0051
            r0 = 5
            if (r2 == r0) goto L_0x0051
            if (r3 != r6) goto L_0x0049
            r1 = 5
        L_0x0049:
            if (r1 != r8) goto L_0x004e
            r10.add(r4)
        L_0x004e:
            int r5 = r5 + -1
            goto L_0x001c
        L_0x0051:
            r1 = r2
            goto L_0x0049
        L_0x0053:
            if (r7 >= r5) goto L_0x008a
            android.view.View r4 = r9.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
            X.02d r1 = (X.C001802d) r1
            int r0 = r1.A00
            if (r0 != 0) goto L_0x0085
            boolean r0 = r9.A0H(r4)
            if (r0 == 0) goto L_0x0085
            int r0 = r1.A00
            int r3 = X.AnonymousClass0YH.A01(r9)
            int r0 = android.view.Gravity.getAbsoluteGravity(r0, r3)
            r2 = r0 & 7
            if (r2 == r6) goto L_0x0088
            r1 = 3
            if (r2 == r1) goto L_0x0088
            r0 = 5
            if (r2 == r0) goto L_0x0088
            if (r3 != r6) goto L_0x0080
            r1 = 5
        L_0x0080:
            if (r1 != r8) goto L_0x0085
            r10.add(r4)
        L_0x0085:
            int r7 = r7 + 1
            goto L_0x0053
        L_0x0088:
            r1 = r2
            goto L_0x0080
        L_0x008a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.A0F(java.util.List, int):void");
    }

    public final boolean A0G(View view) {
        if (view.getParent() == this || this.A0b.contains(view)) {
            return true;
        }
        return false;
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!super.checkLayoutParams(layoutParams) || !(layoutParams instanceof C001802d)) {
            return false;
        }
        return true;
    }

    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C001802d(getContext(), attributeSet);
    }

    public int getCurrentContentInsetLeft() {
        if (AnonymousClass0YH.A01(this) == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        if (AnonymousClass0YH.A01(this) == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        Drawable navigationIcon = getNavigationIcon();
        int contentInsetStart = getContentInsetStart();
        if (navigationIcon != null) {
            return Math.max(contentInsetStart, Math.max(this.A02, 0));
        }
        return contentInsetStart;
    }

    public Menu getMenu() {
        A08();
        return this.A0O.getMenu();
    }

    public Drawable getOverflowIcon() {
        A08();
        return this.A0O.getOverflowIcon();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.A0a);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.A0X = false;
        }
        if (!this.A0X) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9) {
                if (!onHoverEvent) {
                    this.A0X = true;
                }
                return true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.A0X = false;
            return true;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        if (r0 != Integer.MIN_VALUE) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onRtlPropertiesChanged(int r5) {
        /*
            r4 = this;
            super.onRtlPropertiesChanged(r5)
            X.0Nv r3 = r4.A0P
            if (r3 != 0) goto L_0x000e
            X.0Nv r3 = new X.0Nv
            r3.<init>()
            r4.A0P = r3
        L_0x000e:
            boolean r2 = X.AnonymousClass001.A1T(r5)
            boolean r0 = r3.A07
            if (r2 == r0) goto L_0x002e
            r3.A07 = r2
            boolean r0 = r3.A06
            if (r0 == 0) goto L_0x003a
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == 0) goto L_0x002f
            int r0 = r3.A00
            if (r0 != r1) goto L_0x0026
            int r0 = r3.A01
        L_0x0026:
            r3.A03 = r0
            int r0 = r3.A05
        L_0x002a:
            if (r0 == r1) goto L_0x003e
        L_0x002c:
            r3.A04 = r0
        L_0x002e:
            return
        L_0x002f:
            int r0 = r3.A05
            if (r0 != r1) goto L_0x0035
            int r0 = r3.A01
        L_0x0035:
            r3.A03 = r0
            int r0 = r3.A00
            goto L_0x002a
        L_0x003a:
            int r0 = r3.A01
            r3.A03 = r0
        L_0x003e:
            int r0 = r3.A02
            goto L_0x002c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onRtlPropertiesChanged(int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        if (r1 == false) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.os.Parcelable onSaveInstanceState() {
        /*
            r3 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            X.07c r2 = new X.07c
            r2.<init>(r0)
            X.0b8 r0 = r3.A0Q
            if (r0 == 0) goto L_0x0017
            X.0d1 r0 = r0.A01
            if (r0 == 0) goto L_0x0017
            int r0 = r0.getItemId()
            r2.A00 = r0
        L_0x0017:
            androidx.appcompat.widget.ActionMenuView r0 = r3.A0O
            if (r0 == 0) goto L_0x0026
            X.0bB r0 = r0.A08
            if (r0 == 0) goto L_0x0026
            boolean r1 = r0.A02()
            r0 = 1
            if (r1 != 0) goto L_0x0027
        L_0x0026:
            r0 = 0
        L_0x0027:
            r2.A01 = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onSaveInstanceState():android.os.Parcelable");
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.A0Y = false;
        }
        if (!this.A0Y) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0) {
                if (!onTouchEvent) {
                    this.A0Y = true;
                }
                return true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.A0Y = false;
            return true;
        }
        return true;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            A06();
        }
        ImageButton imageButton = this.A0H;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.A0J == null) {
            this.A0J = new AppCompatImageView(getContext(), (AttributeSet) null);
        }
        ImageView imageView = this.A0J;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            A0A();
        }
        ImageButton imageButton = this.A0I;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        A0A();
        this.A0I.setOnClickListener(onClickListener);
    }

    public void setOverflowIcon(Drawable drawable) {
        A08();
        this.A0O.setOverflowIcon(drawable);
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        TextView textView = this.A0K;
        if (!isEmpty) {
            if (textView == null) {
                Context context = getContext();
                AnonymousClass03n r0 = new AnonymousClass03n(context, (AttributeSet) null);
                this.A0K = r0;
                r0.setSingleLine();
                this.A0K.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.A06;
                if (i != 0) {
                    this.A0K.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.A0D;
                if (colorStateList != null) {
                    this.A0K.setTextColor(colorStateList);
                }
            }
            if (!A0G(this.A0K)) {
                A0E(this.A0K, true);
            }
        } else if (textView != null && A0G(textView)) {
            removeView(this.A0K);
            this.A0b.remove(this.A0K);
        }
        TextView textView2 = this.A0K;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.A0U = charSequence;
    }

    public void setTitle(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        TextView textView = this.mTitleTextView;
        if (!isEmpty) {
            if (textView == null) {
                Context context = getContext();
                AnonymousClass03n r0 = new AnonymousClass03n(context, (AttributeSet) null);
                this.mTitleTextView = r0;
                r0.setSingleLine();
                this.mTitleTextView.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.A0B;
                if (i != 0) {
                    this.mTitleTextView.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.A0E;
                if (colorStateList != null) {
                    this.mTitleTextView.setTextColor(colorStateList);
                }
            }
            if (!A0G(this.mTitleTextView)) {
                A0E(this.mTitleTextView, true);
            }
        } else if (textView != null && A0G(textView)) {
            removeView(this.mTitleTextView);
            this.A0b.remove(this.mTitleTextView);
        }
        TextView textView2 = this.mTitleTextView;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.A0V = charSequence;
    }

    public void setOnMenuItemClickListener(C15610re r1) {
        this.A0R = r1;
    }

    public Toolbar(Context context) {
        this(context, (AttributeSet) null);
    }

    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return A00(layoutParams);
    }

    public void setCollapseContentDescription(int i) {
        CharSequence charSequence;
        if (i != 0) {
            charSequence = getContext().getText(i);
        } else {
            charSequence = null;
        }
        setCollapseContentDescription(charSequence);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(AnonymousClass0XW.A02(this, i));
    }

    public void setLogo(int i) {
        setLogo(AnonymousClass0XW.A02(this, i));
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationContentDescription(int i) {
        CharSequence charSequence;
        if (i != 0) {
            charSequence = getContext().getText(i);
        } else {
            charSequence = null;
        }
        setNavigationContentDescription(charSequence);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(AnonymousClass0XW.A02(this, i));
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f3nameremoved);
    }
}
