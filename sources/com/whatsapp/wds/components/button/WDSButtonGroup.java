package com.whatsapp.wds.components.button;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0x9;
import X.AnonymousClass4C5;
import X.AnonymousClass4GJ;
import X.AnonymousClass8UF;
import X.AnonymousClass8ZL;
import X.C111685iW;
import X.C116855qy;
import X.C13760nh;
import X.C141846wE;
import X.C1462679k;
import X.C162457s7;
import X.C18300x5;
import X.C378924l;
import X.C620733j;
import X.C829345m;
import X.C86624Kv;
import X.C86664Kz;
import X.C88864av;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.List;

public final class WDSButtonGroup extends ViewGroup implements AnonymousClass4GJ {
    public C620733j A00;
    public C141846wE A01;
    public C141846wE A02;
    public C116855qy A03;
    public boolean A04;
    public final List A05;

    public final void setOrientationMode(C141846wE r2) {
        C162457s7.A0J(r2, 0);
        boolean A1W = C18300x5.A1W(this.A02, r2);
        this.A02 = r2;
        if (A1W) {
            requestLayout();
        }
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A03;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A03 = r0;
        }
        return r0.generatedComponent();
    }

    public final C141846wE getOrientationMode() {
        return this.A02;
    }

    public final C620733j getWhatsAppLocale() {
        return this.A00;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        List list = this.A05;
        list.clear();
        for (Object add : C829345m.A04(AnonymousClass8ZL.A00, new C13760nh(this))) {
            list.add(add);
        }
        int size = list.size();
        if (size <= 2) {
            int i5 = i3 - i;
            int i6 = i4 - i2;
            if (size == 1) {
                ((View) list.remove(0)).layout(0, 0, i5, i6);
            } else if (size == 2) {
                View view = (View) list.remove(0);
                View view2 = (View) list.remove(0);
                if (this.A01 == C141846wE.VERTICAL) {
                    int i7 = i6 / 2;
                    view.layout(0, 0, i5, i7);
                    view2.layout(0, i7, i5, i6);
                    return;
                }
                int i8 = i5 / 2;
                C620733j r0 = this.A00;
                if (r0 != null) {
                    z2 = C620733j.A04(r0);
                } else {
                    z2 = true;
                }
                if (z2) {
                    view.layout(0, 0, i8, i6);
                    view2.layout(i8, 0, i5, i6);
                    return;
                }
                view.layout(i8, 0, i5, i6);
                view2.layout(0, 0, i8, i6);
            }
        } else {
            throw AnonymousClass001.A0e("WDSButtonGroup should not have more than 2 visible children!");
        }
    }

    public WDSButtonGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        if (!this.A04) {
            this.A04 = true;
            this.A00 = C88864av.A02((C111685iW) generatedComponent());
        }
    }

    public static final int A00(AnonymousClass4C5 r2) {
        Iterator it = r2.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            i++;
            if (i < 0) {
                AnonymousClass8UF.A0q();
                throw AnonymousClass000.A0L();
            }
        }
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0060, code lost:
        if ((r7 * 2) > r5) goto L_0x0062;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0073  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r12, int r13) {
        /*
            r11 = this;
            int r9 = android.view.View.MeasureSpec.getMode(r12)
            int r5 = android.view.View.MeasureSpec.getSize(r12)
            int r8 = android.view.View.MeasureSpec.getMode(r13)
            int r6 = android.view.View.MeasureSpec.getSize(r13)
            X.0nh r1 = new X.0nh
            r1.<init>(r11)
            X.8ZM r0 = X.AnonymousClass8ZM.A00
            X.4C5 r10 = X.C829345m.A04(r0, r1)
            int r0 = A00(r10)
            r7 = 0
            r4 = 0
            r2 = 2
            if (r0 > r2) goto L_0x00eb
            X.6wE r0 = r11.A02
            int r1 = r0.ordinal()
            if (r1 == r7) goto L_0x0036
            if (r1 == r2) goto L_0x0062
            r0 = 1
            if (r1 == r0) goto L_0x0070
            X.3f1 r0 = X.C73153f1.A00()
            throw r0
        L_0x0036:
            java.util.Iterator r3 = r10.iterator()
            r2 = 0
        L_0x003b:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x005c
            android.view.View r1 = X.C86654Ky.A0H(r3)
            r11.measureChild(r1, r12, r13)
            int r0 = r1.getMeasuredWidth()
            int r7 = java.lang.Math.max(r7, r0)
            r1.getMeasuredHeight()
            int r0 = r1.getMeasuredState()
            int r2 = android.view.View.combineMeasuredStates(r2, r0)
            goto L_0x003b
        L_0x005c:
            if (r9 == 0) goto L_0x0070
            int r0 = r7 * 2
            if (r0 <= r5) goto L_0x0070
        L_0x0062:
            X.6wE r0 = X.C141846wE.VERTICAL
        L_0x0064:
            r11.A01 = r0
            int r0 = A00(r10)
            if (r0 != 0) goto L_0x0073
            super.onMeasure(r12, r13)
            return
        L_0x0070:
            X.6wE r0 = X.C141846wE.HORIZONTAL
            goto L_0x0064
        L_0x0073:
            X.6wE r1 = r11.A01
            X.6wE r0 = X.C141846wE.HORIZONTAL
            r7 = 1073741824(0x40000000, float:2.0)
            if (r1 != r0) goto L_0x00a9
            int r0 = A00(r10)
            int r9 = r5 / r0
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r7)
            r8 = r13
        L_0x0086:
            java.util.Iterator r2 = r10.iterator()
            r6 = 0
        L_0x008b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00b8
            android.view.View r1 = X.C86654Ky.A0H(r2)
            r11.measureChild(r1, r3, r8)
            int r0 = r1.getMeasuredHeight()
            int r4 = java.lang.Math.max(r4, r0)
            int r0 = r1.getMeasuredState()
            int r6 = android.view.View.combineMeasuredStates(r6, r0)
            goto L_0x008b
        L_0x00a9:
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r7)
            int r0 = A00(r10)
            int r6 = r6 / r0
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r8)
            r9 = r5
            goto L_0x0086
        L_0x00b8:
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r7)
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r7)
            java.util.Iterator r1 = r10.iterator()
        L_0x00c4:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00d2
            android.view.View r0 = X.C86654Ky.A0H(r1)
            r0.measure(r3, r2)
            goto L_0x00c4
        L_0x00d2:
            X.6wE r1 = r11.A01
            X.6wE r0 = X.C141846wE.VERTICAL
            if (r1 != r0) goto L_0x00dd
            int r0 = A00(r10)
            int r4 = r4 * r0
        L_0x00dd:
            int r1 = android.view.View.resolveSizeAndState(r5, r12, r6)
            int r0 = r6 << 16
            int r0 = android.view.View.resolveSizeAndState(r4, r13, r0)
            r11.setMeasuredDimension(r1, r0)
            return
        L_0x00eb:
            java.lang.String r0 = "WDSButtonGroup should not have more than 2 visible children!"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wds.components.button.WDSButtonGroup.onMeasure(int, int):void");
    }

    public final void setWhatsAppLocale(C620733j r1) {
        this.A00 = r1;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WDSButtonGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C162457s7.A0J(context, 1);
        if (!this.A04) {
            this.A04 = true;
            this.A00 = C88864av.A02((C111685iW) generatedComponent());
        }
        C141846wE r4 = C141846wE.AUTO;
        this.A02 = r4;
        this.A01 = C141846wE.HORIZONTAL;
        this.A05 = AnonymousClass0x9.A18();
        if (attributeSet != null) {
            TypedArray A0X = C86664Kz.A0X(context, attributeSet, C1462679k.A05);
            int i = A0X.getInt(0, -1);
            C141846wE[] values = C141846wE.values();
            if (i >= 0) {
                C162457s7.A0J(values, 0);
                if (i <= values.length - 1) {
                    r4 = values[i];
                }
            }
            setOrientationMode(r4);
            A0X.recycle();
        }
    }

    public /* synthetic */ WDSButtonGroup(Context context, AttributeSet attributeSet, int i, C378924l r5) {
        this(context, C86624Kv.A09(attributeSet, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WDSButtonGroup(Context context) {
        this(context, (AttributeSet) null);
        C162457s7.A0J(context, 1);
    }
}
