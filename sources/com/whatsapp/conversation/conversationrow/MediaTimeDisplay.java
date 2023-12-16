package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass4GJ;
import X.AnonymousClass4L0;
import X.AnonymousClass5Jo;
import X.AnonymousClass79H;
import X.C06270Wx;
import X.C107565bW;
import X.C111685iW;
import X.C116855qy;
import X.C15910sA;
import X.C15930sC;
import X.C185438te;
import X.C620733j;
import X.C70333aK;
import X.C88864av;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.whatsapp.WaTextView;

public class MediaTimeDisplay extends FrameLayout implements AnonymousClass4GJ {
    public int A00;
    public WaTextView A01;
    public C185438te A02;
    public AnonymousClass5Jo A03;
    public C620733j A04;
    public C116855qy A05;
    public Runnable A06;
    public boolean A07;
    public boolean A08;
    public final C15930sC A09;
    public final C15930sC A0A;

    public void A00() {
        if (!this.A07) {
            this.A07 = true;
            this.A04 = C88864av.A02((C111685iW) generatedComponent());
        }
    }

    public final void A01() {
        int duration;
        if (this.A02 == null || getVisibility() != 0 || !this.A08 || this.A00 != 0) {
            AnonymousClass5Jo r2 = this.A03;
            if (r2.A01) {
                r2.A01 = false;
                r2.A03.removeCallbacks(r2.A00);
            }
        } else {
            AnonymousClass5Jo r22 = this.A03;
            if (!r22.A01) {
                r22.A01 = true;
                r22.A03.post(r22.A00);
            }
        }
        if (getVisibility() == 0) {
            C185438te r1 = this.A02;
            if (r1 == null) {
                duration = 0;
            } else if (this.A00 == 0) {
                duration = r1.getCurrentPosition();
            } else {
                duration = r1.getDuration();
            }
            C107565bW.A0I(this.A01, this.A04, (long) ((int) Math.floor((double) (duration / 1000))));
        }
    }

    public void A03(C15910sA r5, C185438te r6) {
        Runnable runnable = this.A06;
        if (runnable != null) {
            runnable.run();
        }
        this.A02 = r6;
        C06270Wx B9p = r6.B9p();
        B9p.A0B(r5, this.A0A);
        C06270Wx B8c = r6.B8c();
        B8c.A0B(r5, this.A09);
        this.A06 = new C70333aK(this, B8c, B9p, 21);
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A05;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A05 = r0;
        }
        return r0.generatedComponent();
    }

    public void setTextColor(int i) {
        this.A01.setTextColor(i);
    }

    public MediaTimeDisplay(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A09 = AnonymousClass5Jo.A00(this);
        this.A0A = AnonymousClass4L0.A0G(this, 193);
        A02(attributeSet);
    }

    public final void A02(AttributeSet attributeSet) {
        boolean z;
        Context context = getContext();
        int i = -1;
        float f = 12.5f;
        int i2 = 2;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass79H.A03);
            int color = obtainStyledAttributes.getColor(1, -1);
            z = obtainStyledAttributes.getBoolean(0, true);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, -1);
            if (dimensionPixelSize != -1) {
                f = (float) dimensionPixelSize;
                i2 = 0;
            }
            obtainStyledAttributes.recycle();
            i = color;
        } else {
            z = true;
        }
        WaTextView waTextView = new WaTextView(context);
        this.A01 = waTextView;
        waTextView.setLines(1);
        this.A01.setSingleLine(true);
        this.A01.setTextColor(i);
        this.A01.setTextSize(i2, f);
        WaTextView waTextView2 = this.A01;
        waTextView2.setTypeface(waTextView2.getTypeface(), z ? 1 : 0);
        addView(this.A01);
        A01();
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        A01();
    }

    public MediaTimeDisplay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A09 = AnonymousClass5Jo.A00(this);
        this.A0A = AnonymousClass4L0.A0G(this, 193);
        A02(attributeSet);
    }

    public MediaTimeDisplay(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A00();
    }

    public MediaTimeDisplay(Context context) {
        super(context);
        this.A09 = AnonymousClass5Jo.A00(this);
        this.A0A = AnonymousClass4L0.A0G(this, 193);
        A02((AttributeSet) null);
    }
}
