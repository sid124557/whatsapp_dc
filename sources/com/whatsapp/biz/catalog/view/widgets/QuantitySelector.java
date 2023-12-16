package com.whatsapp.biz.catalog.view.widgets;

import X.AnonymousClass000;
import X.AnonymousClass0x2;
import X.AnonymousClass1VX;
import X.AnonymousClass4GJ;
import X.AnonymousClass5NN;
import X.AnonymousClass5Yj;
import X.C100895Cr;
import X.C107295b4;
import X.C107775bs;
import X.C116855qy;
import X.C124866Ee;
import X.C181858nS;
import X.C181868nT;
import X.C18300x5;
import X.C18320x8;
import X.C620633i;
import X.C620733j;
import X.C64333Db;
import X.C86604Kt;
import X.C86614Ku;
import X.C86634Kw;
import X.C86664Kz;
import X.C88864av;
import X.C995857e;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.WaImageButton;

public class QuantitySelector extends FrameLayout implements AnonymousClass4GJ {
    public long A00;
    public long A01;
    public ValueAnimator A02;
    public C181858nS A03;
    public C181868nT A04;
    public C995857e A05;
    public AnonymousClass5NN A06;
    public C620633i A07;
    public C620733j A08;
    public AnonymousClass1VX A09;
    public C116855qy A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public final Handler A0E;
    public final TextView A0F;
    public final WaImageButton A0G;
    public final WaImageButton A0H;

    public void setLimit(int i) {
        this.A00 = (long) i;
    }

    public final void A00() {
        int measuredWidth = this.A0H.getMeasuredWidth();
        int A0G2 = C86664Kz.A0G(this.A0F, measuredWidth * 2);
        ValueAnimator A062 = C86604Kt.A06(measuredWidth, A0G2);
        this.A02 = A062;
        A062.addUpdateListener(new C107775bs(this, measuredWidth, A0G2));
        C86614Ku.A0y(this.A02);
        this.A02.setDuration(250);
        this.A02.start();
    }

    public final void A01() {
        this.A05 = C995857e.COLLAPSED;
        WaImageButton waImageButton = this.A0H;
        waImageButton.setImageResource(0);
        waImageButton.setBackgroundResource(R.drawable.btn_default);
        C18320x8.A15(waImageButton, this, 43);
        TextView textView = this.A0F;
        AnonymousClass0x2.A0q(textView.getContext(), textView, R.color.f5nameremoved);
        A03();
    }

    public final void A02() {
        this.A05 = C995857e.EXPANDED;
        A03();
        TextView textView = this.A0F;
        C18320x8.A11(getResources(), textView, AnonymousClass5Yj.A02(textView.getContext(), R.attr.f3nameremoved, R.color.f5nameremoved));
        WaImageButton waImageButton = this.A0H;
        waImageButton.setImageResource(R.drawable.vec_ic_add_control);
        waImageButton.setBackgroundResource(R.drawable.quantity_button_selector);
        C18320x8.A15(waImageButton, this, 41);
        C18320x8.A15(this.A0G, this, 42);
    }

    public final void A03() {
        TextView textView = this.A0F;
        textView.setClickable(false);
        if (this.A01 > 0) {
            C86634Kw.A1K(textView, this.A08.A0M(), this.A01);
            if (this.A05 == C995857e.EXPANDED) {
                textView.setClickable(true);
                return;
            }
            return;
        }
        C86634Kw.A1I(textView);
    }

    public void A04(long j, long j2) {
        long j3 = this.A01;
        this.A00 = j2;
        this.A01 = j;
        if (this.A0C) {
            if (this.A05 == C995857e.COLLAPSED || j3 == 0) {
                if (j > 0) {
                    A01();
                    return;
                }
            } else if (this.A0B) {
                return;
            }
        }
        A02();
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A0A;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A0A = r0;
        }
        return r0.generatedComponent();
    }

    public long getQuantity() {
        return this.A01;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        C124866Ee r5 = (C124866Ee) parcelable;
        super.onRestoreInstanceState(r5.getSuperState());
        this.A0C = r5.A02;
        this.A05 = C995857e.COLLAPSED;
        A04(r5.A01, r5.A00);
    }

    public void setCollapsible(boolean z) {
        this.A0C = z;
        if (z && C107295b4.A09(this.A07)) {
            this.A0C = false;
        }
    }

    public void setQuantity(long j) {
        A04(j, this.A00);
    }

    /* JADX INFO: finally extract failed */
    public QuantitySelector(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A0D) {
            this.A0D = true;
            C64333Db A002 = C88864av.A00(generatedComponent());
            this.A08 = C64333Db.A2t(A002);
            this.A07 = C64333Db.A2o(A002);
            this.A09 = C64333Db.A4B(A002);
        }
        this.A0E = AnonymousClass000.A0A();
        this.A0B = false;
        this.A05 = C995857e.COLLAPSED;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C100895Cr.A07, 0, 0);
        try {
            setCollapsible(obtainStyledAttributes.getBoolean(0, false));
            obtainStyledAttributes.recycle();
            View inflate = View.inflate(getContext(), R.layout.f8nameremoved, this);
            this.A0F = C18300x5.A0G(inflate, R.id.quantity_count);
            this.A0G = C86664Kz.A10(inflate, R.id.minus_button);
            this.A0H = C86664Kz.A10(inflate, R.id.plus_button);
            A04(0, 99);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int left;
        int top;
        int left2;
        int left3;
        super.onLayout(z, i, i2, i3, i4);
        WaImageButton waImageButton = this.A0H;
        int measuredWidth = waImageButton.getMeasuredWidth();
        TextView textView = this.A0F;
        int measuredWidth2 = (measuredWidth - textView.getMeasuredWidth()) / 2;
        if (C620733j.A04(this.A08)) {
            int left4 = waImageButton.getLeft();
            WaImageButton waImageButton2 = this.A0G;
            if (left4 >= waImageButton2.getMeasuredWidth() - measuredWidth2) {
                left = waImageButton2.getRight();
                top = textView.getTop();
                left2 = waImageButton2.getRight();
            }
            left = waImageButton.getLeft() + measuredWidth2;
            top = textView.getTop();
            left2 = waImageButton.getLeft() + measuredWidth2;
        } else {
            WaImageButton waImageButton3 = this.A0G;
            if (waImageButton3.getLeft() >= waImageButton3.getMeasuredWidth() - measuredWidth2) {
                left = waImageButton3.getLeft() - textView.getMeasuredWidth();
                top = textView.getTop();
                left3 = waImageButton3.getLeft();
                textView.layout(left, top, left3, textView.getBottom());
            }
            left = waImageButton.getLeft() + measuredWidth2;
            top = textView.getTop();
            left2 = waImageButton.getLeft() + measuredWidth2;
        }
        left3 = C86664Kz.A0G(textView, left2);
        textView.layout(left, top, left3, textView.getBottom());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0050, code lost:
        if (r8.A01 != 0) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0054, code lost:
        if (r3 != X.C995857e.A01) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0056, code lost:
        setMeasuredDimension(r6, getMeasuredHeight());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x004a, code lost:
        if (r3 == r0) goto L_0x004c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r9, int r10) {
        /*
            r8 = this;
            super.onMeasure(r9, r10)
            com.whatsapp.WaImageButton r3 = r8.A0H
            android.view.ViewGroup$LayoutParams r1 = r3.getLayoutParams()
            int r0 = r8.getMeasuredHeight()
            r1.width = r0
            r3.setLayoutParams(r1)
            com.whatsapp.WaImageButton r2 = r8.A0G
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            int r0 = r8.getMeasuredHeight()
            r1.width = r0
            r2.setLayoutParams(r1)
            super.onMeasure(r9, r10)
            int r6 = r3.getMeasuredWidth()
            int r1 = r6 * 2
            android.widget.TextView r0 = r8.A0F
            int r7 = X.C86664Kz.A0G(r0, r1)
            boolean r0 = r8.A0B
            r4 = 0
            if (r0 != 0) goto L_0x005e
            X.57e r3 = r8.A05
            X.57e r0 = X.C995857e.EXPANDED
            if (r3 != r0) goto L_0x004a
            long r1 = r8.A01
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x004c
            int r0 = r8.getMeasuredHeight()
            r8.setMeasuredDimension(r7, r0)
            return
        L_0x004a:
            if (r3 != r0) goto L_0x0052
        L_0x004c:
            long r1 = r8.A01
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0056
        L_0x0052:
            X.57e r0 = X.C995857e.COLLAPSED
            if (r3 != r0) goto L_0x005e
        L_0x0056:
            int r0 = r8.getMeasuredHeight()
            r8.setMeasuredDimension(r6, r0)
            return
        L_0x005e:
            super.onMeasure(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.biz.catalog.view.widgets.QuantitySelector.onMeasure(int, int):void");
    }

    public Parcelable onSaveInstanceState() {
        C124866Ee r2 = new C124866Ee(super.onSaveInstanceState());
        r2.A01 = this.A01;
        r2.A00 = this.A00;
        r2.A02 = this.A0C;
        return r2;
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.A0F.setEnabled(z);
        this.A0H.setEnabled(z);
        this.A0G.setEnabled(z);
    }

    public void setOnLimitReachedListener(C181858nS r1) {
        this.A03 = r1;
    }

    public void setOnQuantityChanged(C181868nT r1) {
        this.A04 = r1;
    }

    public QuantitySelector(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public QuantitySelector(Context context) {
        this(context, (AttributeSet) null);
    }
}
