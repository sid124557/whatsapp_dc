package com.whatsapp.components;

import X.AnonymousClass0Y8;
import X.AnonymousClass5Yj;
import X.C100905Cs;
import X.C107335b8;
import X.C18290x4;
import X.C188988zo;
import X.C86614Ku;
import X.C86624Kv;
import X.C86634Kw;
import X.C86654Ky;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.WaImageView;

public class SelectionCheckView extends FrameLayout {
    public int A00;
    public ShapeDrawable A01;
    public View A02;
    public AnimationSet A03;
    public AnimationSet A04;
    public ScaleAnimation A05;
    public ScaleAnimation A06;
    public ScaleAnimation A07;
    public ScaleAnimation A08;
    public ScaleAnimation A09;
    public ScaleAnimation A0A;
    public FrameLayout A0B;
    public ImageView A0C;
    public boolean A0D = false;
    public boolean A0E = true;

    public final ScaleAnimation A00(View view) {
        ScaleAnimation A0Q = C86634Kw.A0Q(0.0f, 1.0f);
        C86614Ku.A1K(A0Q, 100);
        A0Q.setRepeatCount(0);
        A0Q.setAnimationListener(new C188988zo(view, 1, this));
        return A0Q;
    }

    public void A05(Context context, AttributeSet attributeSet) {
        String str;
        this.A0D = false;
        int i = R.drawable.ic_checkmark_selected;
        int A032 = AnonymousClass5Yj.A03(getContext(), getContext(), R.attr.f3nameremoved, R.color.f5nameremoved);
        int A042 = AnonymousClass0Y8.A04(getContext(), AnonymousClass5Yj.A05(this));
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C100905Cs.A0L);
            i = obtainStyledAttributes.getResourceId(2, R.drawable.ic_checkmark_selected);
            str = obtainStyledAttributes.getString(3);
            A032 = obtainStyledAttributes.getColor(4, A032);
            A042 = obtainStyledAttributes.getColor(0, A042);
            dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, dimensionPixelSize);
            obtainStyledAttributes.recycle();
        } else {
            str = null;
        }
        this.A00 = A032;
        if (str == null) {
            str = context.getString(R.string.f11nameremoved);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        ShapeDrawable A0H = C86634Kw.A0H();
        C86614Ku.A10(getContext(), A0H.getPaint(), AnonymousClass5Yj.A02(getContext(), R.attr.f3nameremoved, R.color.f5nameremoved));
        ShapeDrawable A0H2 = C86634Kw.A0H();
        this.A01 = A0H2;
        A0H2.getPaint().setColor(A042);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.A0B = frameLayout;
        frameLayout.setLayoutParams(layoutParams);
        this.A0B.setBackground(A0H);
        this.A0B.setForeground(this.A01);
        this.A0B.setVisibility(4);
        addView(this.A0B);
        ShapeDrawable A0H3 = C86634Kw.A0H();
        A0H3.getPaint().setColor(A032);
        this.A02 = new WaImageView(getContext());
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1, 17);
        layoutParams2.setMargins(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        this.A02.setLayoutParams(layoutParams2);
        this.A02.setBackground(A0H3);
        this.A02.setVisibility(4);
        addView(this.A02);
        WaImageView waImageView = new WaImageView(getContext());
        this.A0C = waImageView;
        waImageView.setLayoutParams(layoutParams);
        C107335b8.A0E(this.A0C, AnonymousClass5Yj.A03(getContext(), getContext(), R.attr.f3nameremoved, R.color.f5nameremoved));
        C18290x4.A1A(getContext(), this.A0C, i);
        this.A0C.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.A0C.setVisibility(4);
        this.A0C.setContentDescription(str);
        addView(this.A0C);
    }

    public final ScaleAnimation A01(View view) {
        ScaleAnimation A0Q = C86634Kw.A0Q(1.0f, 0.0f);
        C86624Kv.A18(A0Q, 100);
        A0Q.setRepeatCount(0);
        A0Q.setAnimationListener(new C188988zo(view, 2, this));
        return A0Q;
    }

    public final void A02() {
        ScaleAnimation A002 = A00(this.A0B);
        this.A07 = A002;
        A002.setStartOffset(20);
        this.A09 = A00(this.A02);
        ScaleAnimation A003 = A00(this.A0C);
        this.A05 = A003;
        A003.setStartOffset(10);
        AnimationSet animationSet = new AnimationSet(false);
        this.A03 = animationSet;
        animationSet.addAnimation(this.A07);
        this.A03.addAnimation(this.A09);
        this.A03.addAnimation(this.A05);
        this.A08 = A01(this.A0B);
        ScaleAnimation A012 = A01(this.A02);
        this.A0A = A012;
        A012.setStartOffset(20);
        ScaleAnimation A013 = A01(this.A0C);
        this.A06 = A013;
        A013.setStartOffset(10);
        AnimationSet animationSet2 = new AnimationSet(false);
        this.A04 = animationSet2;
        animationSet2.addAnimation(this.A08);
        this.A04.addAnimation(this.A0A);
        this.A04.addAnimation(this.A06);
        this.A0D = true;
    }

    public final void A03() {
        if (!this.A0D) {
            A02();
        }
        setVisibility(0);
        this.A0B.clearAnimation();
        this.A02.clearAnimation();
        this.A0C.clearAnimation();
        this.A0B.setAnimation(this.A07);
        this.A02.setAnimation(this.A09);
        this.A0C.setAnimation(this.A05);
        this.A0B.setForeground(this.A01);
        this.A03.start();
    }

    public final void A04() {
        if (!this.A0D) {
            A02();
        }
        this.A0B.clearAnimation();
        this.A02.clearAnimation();
        this.A0C.clearAnimation();
        this.A0B.setAnimation(this.A08);
        this.A02.setAnimation(this.A0A);
        this.A0C.setAnimation(this.A06);
        this.A0B.setForeground((Drawable) null);
        this.A04.start();
    }

    public void A06(boolean z, boolean z2) {
        if (z) {
            if (z2) {
                A03();
            } else {
                C86654Ky.A18(this.A0B, this, 0);
            }
        } else if (z2) {
            A04();
        } else {
            C86654Ky.A18(this.A0B, this, 4);
        }
    }

    public boolean isEnabled() {
        return this.A0E;
    }

    public void setEnabled(boolean z) {
        int A042;
        if (this.A0E != z) {
            if (z) {
                A042 = this.A00;
            } else {
                A042 = AnonymousClass0Y8.A04(getContext(), R.color.f5nameremoved);
            }
            ShapeDrawable A0H = C86634Kw.A0H();
            A0H.getPaint().setColor(A042);
            this.A02.setBackground(A0H);
            this.A0E = z;
        }
    }

    public void setIcon(int i) {
        C18290x4.A1A(getContext(), this.A0C, i);
    }

    public void setSelectionBackground(int i) {
        this.A02.setBackgroundResource(i);
    }

    public SelectionCheckView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A05(context, attributeSet);
    }

    public SelectionCheckView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A05(context, attributeSet);
    }

    public void setSelectionBackground(Drawable drawable) {
        this.A02.setBackground(drawable);
    }

    public SelectionCheckView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A05(context, attributeSet);
    }

    public SelectionCheckView(Context context) {
        super(context);
        A05(context, (AttributeSet) null);
    }
}
