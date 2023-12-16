package com.whatsapp.components;

import X.AnonymousClass000;
import X.AnonymousClass6CC;
import X.C100905Cs;
import X.C154417d8;
import X.C162457s7;
import X.C162597sR;
import X.C18280x3;
import X.C18310x6;
import X.C378924l;
import X.C86604Kt;
import X.C86624Kv;
import X.C86634Kw;
import X.C86664Kz;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import com.whatsapp.R;
import com.whatsapp.WaTextView;

public final class AutoScrollView extends FrameLayout {
    public HorizontalScrollView A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final long A08;
    public final long A09;
    public final WaTextView A0A;
    public final WaTextView A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AutoScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C162457s7.A0J(context, 1);
        this.A06 = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        this.A03 = true;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C100905Cs.A01);
        C162457s7.A0D(obtainStyledAttributes);
        this.A09 = (long) obtainStyledAttributes.getInt(2, 3500);
        this.A08 = (long) obtainStyledAttributes.getInt(0, 5000);
        this.A07 = obtainStyledAttributes.getDimensionPixelSize(4, 0);
        this.A04 = C86634Kw.A05(getResources(), obtainStyledAttributes, R.dimen.f6nameremoved, 1);
        this.A05 = C86634Kw.A05(getResources(), obtainStyledAttributes, R.dimen.f6nameremoved, 3);
        obtainStyledAttributes.recycle();
        Object systemService = context.getSystemService("layout_inflater");
        C162457s7.A0K(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        View inflate = ((LayoutInflater) systemService).inflate(R.layout.f8nameremoved, this, true);
        this.A0A = C86604Kt.A0O(inflate, R.id.main_text_view);
        WaTextView A0O = C86604Kt.A0O(inflate, R.id.placeholder_text_view);
        this.A0B = A0O;
        HorizontalScrollView horizontalScrollView = (HorizontalScrollView) C18280x3.A0E(inflate, R.id.horizontal_scroll_view);
        this.A00 = horizontalScrollView;
        horizontalScrollView.setOnTouchListener(new C154417d8(1));
        C18310x6.A17(this.A00.getChildAt(0), inflate, 14);
        A0O.setVisibility(8);
    }

    public final void A00(float f, int i, int i2, int i3, long j) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.setDuration(j);
        long j2 = this.A09;
        if (j2 <= 0) {
            ofFloat.setRepeatCount(-1);
        }
        ofFloat.addUpdateListener(new C162597sR(this, f, i, i2, i3));
        AnimatorSet A0O = C86664Kz.A0O();
        if (j2 > 0) {
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            ofFloat2.setDuration(j2);
            A0O.addListener(new AnonymousClass6CC());
            Animator[] animatorArr = new Animator[2];
            AnonymousClass000.A16(ofFloat2, ofFloat, animatorArr);
            A0O.playSequentially(animatorArr);
        } else {
            A0O.play(ofFloat);
        }
        A0O.start();
    }

    public final void setText(String str) {
        C162457s7.A0J(str, 0);
        this.A0A.setText(str);
        this.A0B.setText(str);
    }

    public final HorizontalScrollView getHorizontalScrollView() {
        return this.A00;
    }

    public final int getScrollWidth() {
        return this.A05;
    }

    public final CharSequence getText() {
        CharSequence text = this.A0A.getText();
        C162457s7.A0D(text);
        return text;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AutoScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C162457s7.A0J(context, 1);
    }

    public final void setText(int i) {
        this.A0A.setText(i);
        this.A0B.setText(i);
    }

    public /* synthetic */ AutoScrollView(Context context, AttributeSet attributeSet, int i, int i2, C378924l r7) {
        this(context, C86624Kv.A09(attributeSet, i2), C86634Kw.A02(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AutoScrollView(Context context) {
        this(context, (AttributeSet) null, 0);
        C162457s7.A0J(context, 1);
    }
}
