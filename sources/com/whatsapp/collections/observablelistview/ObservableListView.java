package com.whatsapp.collections.observablelistview;

import X.AnonymousClass4NL;
import X.AnonymousClass4Ri;
import X.AnonymousClass5RN;
import X.AnonymousClass5RR;
import X.C107045ab;
import X.C179618jR;
import X.C182118nt;
import X.C187958y5;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.AbsListView;

public class ObservableListView extends AnonymousClass4Ri implements C179618jR {
    public int A00 = -1;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public SparseIntArray A05;
    public MotionEvent A06;
    public ViewGroup A07;
    public AbsListView.OnScrollListener A08;
    public C182118nt A09;
    public AnonymousClass5RN A0A;
    public AnonymousClass5RR A0B;
    public C187958y5 A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public final AbsListView.OnScrollListener A0G = new C107045ab(this, 4);

    public final void A02() {
        this.A05 = new SparseIntArray();
        this.A0A = new AnonymousClass5RN();
        this.A0B = new AnonymousClass5RR();
        super.setOnScrollListener(this.A0G);
    }

    public void draw(Canvas canvas) {
        this.A0B.A00();
        super.draw(canvas);
        this.A0B.A01();
    }

    public int getCurrentScrollY() {
        return this.A04;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.A09 != null) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.A0D = true;
                this.A0E = true;
            } else if (actionMasked == 1 || actionMasked == 3) {
                this.A0D = false;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.A0A.A01();
        super.onLayout(z, i, i2, i3, i4);
        this.A0A.A00();
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        AnonymousClass4NL r2 = (AnonymousClass4NL) parcelable;
        this.A01 = r2.A01;
        this.A00 = r2.A00;
        this.A03 = r2.A03;
        this.A02 = r2.A02;
        this.A04 = r2.A04;
        this.A05 = r2.A05;
        super.onRestoreInstanceState(r2.getSuperState());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0010, code lost:
        if (r1 != 3) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            X.8nt r0 = r8.A09
            if (r0 == 0) goto L_0x0012
            int r1 = r9.getActionMasked()
            r6 = 1
            r5 = 0
            if (r1 == r6) goto L_0x0083
            r0 = 2
            if (r1 == r0) goto L_0x0017
            r0 = 3
            if (r1 == r0) goto L_0x0083
        L_0x0012:
            boolean r0 = super.onTouchEvent(r9)
            return r0
        L_0x0017:
            android.view.MotionEvent r0 = r8.A06
            if (r0 != 0) goto L_0x001d
            r8.A06 = r9
        L_0x001d:
            float r1 = r9.getY()
            android.view.MotionEvent r0 = r8.A06
            float r0 = r0.getY()
            float r1 = r1 - r0
            android.view.MotionEvent r0 = android.view.MotionEvent.obtainNoHistory(r9)
            r8.A06 = r0
            int r0 = r8.A04
            float r0 = (float) r0
            float r0 = r0 - r1
            r7 = 0
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 > 0) goto L_0x0012
            boolean r0 = r8.A0F
            if (r0 != 0) goto L_0x0088
            android.view.ViewGroup r4 = r8.A07
            if (r4 != 0) goto L_0x0043
            android.view.ViewGroup r4 = X.C86664Kz.A0l(r8)
        L_0x0043:
            r3 = 0
            r0 = r8
        L_0x0045:
            if (r0 == r4) goto L_0x0066
            int r2 = r0.getLeft()
            int r1 = r0.getScrollX()
            int r2 = r2 - r1
            float r1 = (float) r2
            float r7 = r7 + r1
            int r2 = r0.getTop()
            int r1 = r0.getScrollY()
            int r2 = r2 - r1
            float r1 = (float) r2
            float r3 = r3 + r1
            android.view.ViewParent r0 = r0.getParent()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L_0x0066
            goto L_0x0045
        L_0x0066:
            android.view.MotionEvent r2 = android.view.MotionEvent.obtainNoHistory(r9)
            r2.offsetLocation(r7, r3)
            boolean r0 = r4.onInterceptTouchEvent(r2)
            if (r0 == 0) goto L_0x0012
            r8.A0F = r6
            r2.setAction(r5)
            r1 = 24
            X.3aJ r0 = new X.3aJ
            r0.<init>(r8, r2, r4, r1)
            r8.post(r0)
            return r5
        L_0x0083:
            r8.A0F = r5
            r8.A0D = r5
            goto L_0x0012
        L_0x0088:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.collections.observablelistview.ObservableListView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public ObservableListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A02();
    }

    public boolean onInterceptHoverEvent(MotionEvent motionEvent) {
        return super.onInterceptHoverEvent(motionEvent);
    }

    public Parcelable onSaveInstanceState() {
        AnonymousClass4NL r1 = new AnonymousClass4NL(super.onSaveInstanceState());
        r1.A01 = this.A01;
        r1.A00 = this.A00;
        r1.A03 = this.A03;
        r1.A02 = this.A02;
        r1.A04 = this.A04;
        r1.A05 = this.A05;
        return r1;
    }

    public void setOnScrollListener(AbsListView.OnScrollListener onScrollListener) {
        this.A08 = onScrollListener;
    }

    public void setScrollViewCallbacks(C182118nt r1) {
        this.A09 = r1;
    }

    public void setTouchInterceptionViewGroup(ViewGroup viewGroup) {
        this.A07 = viewGroup;
    }

    public ObservableListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A02();
    }

    public ObservableListView(Context context) {
        super(context);
        A02();
    }
}
