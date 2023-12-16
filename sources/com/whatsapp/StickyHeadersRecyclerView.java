package com.whatsapp;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0N1;
import X.AnonymousClass0R6;
import X.AnonymousClass4GJ;
import X.AnonymousClass4L0;
import X.AnonymousClass6HK;
import X.C05570Ua;
import X.C100905Cs;
import X.C111685iW;
import X.C116855qy;
import X.C154477dE;
import X.C18320x8;
import X.C185858uM;
import X.C188718zN;
import X.C188828zY;
import X.C620733j;
import X.C86604Kt;
import X.C86654Ky;
import X.C86664Kz;
import X.C88004Wy;
import X.C88864av;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class StickyHeadersRecyclerView extends RecyclerView implements AnonymousClass4GJ {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public long A06;
    public AnonymousClass0N1 A07;
    public C05570Ua A08;
    public C620733j A09;
    public C116855qy A0A;
    public boolean A0B;
    public final Rect A0C;

    public final void A15(Context context, AttributeSet attributeSet) {
        int i = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C100905Cs.A0O);
            this.A03 = obtainStyledAttributes.getDimensionPixelSize(0, this.A03);
            i = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            obtainStyledAttributes.recycle();
        }
        if (this.A03 > 0) {
            C86654Ky.A1I(this, this.A09, i);
        }
        this.A0h = true;
        this.A07 = new AnonymousClass0N1(context, new C188718zN(this, 1));
        this.A14.add(new C154477dE(this, 0));
    }

    private C88004Wy getStickyHeadersAdapter() {
        return (C88004Wy) this.A0N;
    }

    public void A14() {
        if (!this.A0B) {
            this.A0B = true;
            this.A09 = C88864av.A02((C111685iW) generatedComponent());
        }
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A0A;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A0A = r0;
        }
        return r0.generatedComponent();
    }

    public void setAdapter(AnonymousClass0R6 r5) {
        super.setAdapter(new C88004Wy(r5));
        this.A0N.BiZ(new C188828zY(this, 2));
        if (this.A03 > 0) {
            int measuredWidth = getMeasuredWidth();
            int i = this.A03;
            int max = Math.max(1, (measuredWidth + (i / 2)) / i);
            getContext();
            GridLayoutManager gridLayoutManager = new GridLayoutManager(max);
            gridLayoutManager.A01 = new AnonymousClass6HK(gridLayoutManager, this);
            setLayoutManager(gridLayoutManager);
        } else {
            getContext();
            C18320x8.A19(this, 1);
        }
        this.A08 = this.A0N.BQR(this, -1000);
    }

    public StickyHeadersRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A14();
        this.A02 = -1;
        this.A00 = -1;
        this.A0C = AnonymousClass001.A0N();
        A15(context, attributeSet);
    }

    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) getLayoutManager();
        C88004Wy r8 = (C88004Wy) this.A0N;
        int A1H = linearLayoutManager.A1H();
        if (A1H != -1) {
            if (A1H != this.A00) {
                this.A00 = A1H;
                long A0K = r8.A0K(A1H);
                this.A05 = A0K;
                int i = (int) (A0K >> 32);
                if (this.A02 != i) {
                    this.A02 = i;
                    ((C185858uM) r8.A00).BNd(this.A08, i);
                    View view = this.A08.A0H;
                    C86604Kt.A1C(view, getWidth(), 1073741824);
                    view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                }
            }
            this.A04 = 0;
            if (!AnonymousClass000.A1T(((this.A05 & 4294967295L) > 4294967295L ? 1 : ((this.A05 & 4294967295L) == 4294967295L ? 0 : -1)))) {
                int A1G = linearLayoutManager.A1G();
                if (this.A01 != A1G) {
                    this.A01 = A1G;
                    this.A06 = r8.A0K(A1G);
                }
                if (AnonymousClass000.A1T(((this.A06 & 4294967295L) > 4294967295L ? 1 : ((this.A06 & 4294967295L) == 4294967295L ? 0 : -1)))) {
                    View A0P = linearLayoutManager.A0P(A1G);
                    this.A04 = AnonymousClass4L0.A05(this.A08.A0H, A0P.getTop());
                    Rect rect = this.A0C;
                    linearLayoutManager.A0j(A0P, rect);
                    int i2 = this.A04 - rect.top;
                    this.A04 = i2;
                    if (i2 > 0) {
                        this.A04 = 0;
                    }
                }
            }
            canvas.save();
            canvas.clipRect(0, this.A04, this.A08.A0H.getMeasuredWidth(), AnonymousClass4L0.A04(this.A08.A0H, this.A04));
            canvas.translate(0.0f, (float) this.A04);
            this.A08.A0H.draw(canvas);
            canvas.restore();
        }
    }

    public void onMeasure(int i, int i2) {
        View view;
        super.onMeasure(i, i2);
        if (this.A03 > 0) {
            int measuredWidth = getMeasuredWidth();
            int i3 = this.A03;
            ((GridLayoutManager) getLayoutManager()).A1o(Math.max(1, (measuredWidth + (i3 / 2)) / i3));
        }
        C05570Ua r0 = this.A08;
        if (r0 != null && (view = r0.A0H) != null) {
            view.measure(C86664Kz.A05(getMeasuredWidth()), View.MeasureSpec.makeMeasureSpec(0, 0));
            view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    public StickyHeadersRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A14();
        this.A02 = -1;
        this.A00 = -1;
        this.A0C = AnonymousClass001.A0N();
        A15(context, attributeSet);
    }

    public StickyHeadersRecyclerView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A14();
    }

    public StickyHeadersRecyclerView(Context context) {
        super(context, (AttributeSet) null);
        A14();
        this.A02 = -1;
        this.A00 = -1;
        this.A0C = AnonymousClass001.A0N();
        A15(context, (AttributeSet) null);
    }
}
