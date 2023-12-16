package com.whatsapp.storage;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass35V;
import X.AnonymousClass4L0;
import X.AnonymousClass4L3;
import X.C100295Aj;
import X.C100895Cr;
import X.C107805bv;
import X.C86644Kx;
import X.C86664Kz;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.util.AttributeSet;
import com.whatsapp.WaTextView;
import java.util.ArrayList;

public class SizeTickerView extends WaTextView {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public AnimatorSet A06;
    public boolean A07;

    public void A0E(long j, int i, boolean z) {
        long j2 = j;
        if (z) {
            ArrayList A0s = AnonymousClass001.A0s();
            AnimatorSet animatorSet = this.A06;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            this.A06 = C86664Kz.A0O();
            long j3 = this.A05;
            if (j3 != j) {
                ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, 10});
                ofInt.addUpdateListener(new C107805bv(this, j3, j2));
                A0s.add(ofInt);
            }
            if (this.A02 != i) {
                ArgbEvaluator argbEvaluator = new ArgbEvaluator();
                Object[] objArr = new Object[2];
                AnonymousClass000.A1L(objArr, this.A02);
                AnonymousClass000.A1P(objArr, i, 1);
                ValueAnimator ofObject = ValueAnimator.ofObject(argbEvaluator, objArr);
                C100295Aj.A03(ofObject, this, 20);
                A0s.add(ofObject);
            }
            this.A06.addListener(new AnonymousClass4L3(this, i, j));
            C86644Kx.A0j(this.A06);
            this.A06.setDuration((long) this.A01);
            this.A06.setStartDelay((long) this.A00);
            this.A06.playTogether(A0s);
            this.A06.start();
            return;
        }
        AnimatorSet animatorSet2 = this.A06;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        this.A05 = j;
        this.A02 = i;
        setTextColor(i);
        A0D();
    }

    public final void A0D() {
        CharSequence charSequence;
        CharSequence[] split = AnonymousClass35V.A03(this.A01, this.A05).split(" ");
        int length = split.length;
        if (length == 0) {
            charSequence = "";
        } else if (length == 1) {
            charSequence = split[0];
        } else {
            SpannableString A0A = AnonymousClass4L0.A0A(split[1]);
            A0A.setSpan(new AbsoluteSizeSpan(this.A03), 0, split[1].length(), 18);
            charSequence = TextUtils.concat(new CharSequence[]{split[0], " ", A0A});
        }
        setText(charSequence);
    }

    public SizeTickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A08();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C100895Cr.A08);
            this.A04 = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            this.A03 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
        }
        this.A01 = 1000;
        this.A00 = 300;
        setTextSize(0, (float) this.A04);
    }

    public SizeTickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SizeTickerView(Context context) {
        this(context, (AttributeSet) null);
    }
}
