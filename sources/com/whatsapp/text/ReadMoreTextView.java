package com.whatsapp.text;

import X.AnonymousClass000;
import X.AnonymousClass08M;
import X.AnonymousClass0x2;
import X.AnonymousClass79W;
import X.C06270Wx;
import X.C107575bX;
import X.C116105pk;
import X.C116115pl;
import X.C117595sB;
import X.C18290x4;
import X.C183168pb;
import X.C18330xA;
import X.C184598sC;
import X.C86604Kt;
import X.C86614Ku;
import X.C89384cj;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.widget.TextView;

public class ReadMoreTextView extends C89384cj {
    public static final C184598sC A0B;
    public int A00;
    public int A01;
    public C183168pb A02;
    public CharSequence A03;
    public String A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final Handler A08 = AnonymousClass000.A0A();
    public final AnonymousClass08M A09 = C18330xA.A01(Boolean.FALSE);
    public final Runnable A0A = new C117595sB(this);

    /* access modifiers changed from: private */
    public void setVisibleText(CharSequence charSequence) {
        this.A07 = true;
        setText(charSequence);
        this.A07 = false;
    }

    static {
        C184598sC r0;
        if (Build.VERSION.SDK_INT >= 23) {
            r0 = new C116105pk();
        } else {
            r0 = new C116115pl();
        }
        A0B = r0;
    }

    public final void A0L(Context context, AttributeSet attributeSet) {
        A0B.BnO(this);
        AnonymousClass0x2.A14(this.A02, this);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass79W.A00);
            int resourceId = obtainStyledAttributes.getResourceId(3, 0);
            if (resourceId != 0) {
                this.A04 = this.A01.A0B(resourceId);
            }
            this.A01 = obtainStyledAttributes.getResourceId(2, C18290x4.A00(context));
            this.A06 = obtainStyledAttributes.getBoolean(1, false);
            int i = obtainStyledAttributes.getInt(0, 0);
            this.A00 = i;
            if (i != 0) {
                setMaxLines(i);
            }
            obtainStyledAttributes.recycle();
        }
    }

    public boolean A0M() {
        AnonymousClass08M r1 = this.A09;
        if (r1.A07() == null || !C86604Kt.A1Z(r1)) {
            return false;
        }
        return true;
    }

    public C06270Wx getExpanded() {
        return this.A09;
    }

    public int getLinesLimit() {
        return this.A00;
    }

    public void setLinesLimit(int i) {
        int i2;
        this.A00 = i;
        if (A0M() || (i2 = this.A00) == 0) {
            i2 = Integer.MAX_VALUE;
        }
        setMaxLines(i2);
    }

    public ReadMoreTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A0L(context, attributeSet);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A08.removeCallbacks(this.A0A);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        Handler handler = this.A08;
        Runnable runnable = this.A0A;
        handler.removeCallbacks(runnable);
        if (this.A00 != 0) {
            handler.post(runnable);
        }
    }

    public void setExpanded(boolean z) {
        int i;
        Boolean valueOf = Boolean.valueOf(z);
        AnonymousClass08M r1 = this.A09;
        if (!C86614Ku.A1W(r1, valueOf)) {
            r1.A0H(valueOf);
            if (z || (i = this.A00) == 0) {
                i = Integer.MAX_VALUE;
            }
            setMaxLines(i);
            setText(this.A03);
        }
    }

    public void setLinkText(String str) {
        this.A04 = str;
    }

    public void setMaxLines(int i) {
        super.setMaxLines(i);
    }

    public void setReadMoreClickListener(C183168pb r1) {
        this.A02 = r1;
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        CharSequence A032 = C107575bX.A03(charSequence);
        super.setText(A032, bufferType);
        if (!this.A07) {
            this.A03 = A032;
        }
    }

    public ReadMoreTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A0L(context, attributeSet);
    }

    public ReadMoreTextView(Context context) {
        super(context);
        A0L(context, (AttributeSet) null);
    }
}
