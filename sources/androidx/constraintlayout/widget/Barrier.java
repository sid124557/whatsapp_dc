package androidx.constraintlayout.widget;

import X.AnonymousClass001;
import X.AnonymousClass02X;
import X.AnonymousClass05N;
import X.AnonymousClass0K9;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

public class Barrier extends AnonymousClass02X {
    public int A00;
    public AnonymousClass05N A01;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        if (r2 == 6) goto L_0x000a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        if (r2 == 6) goto L_0x0018;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x000f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(X.AnonymousClass0R7 r4, boolean r5) {
        /*
            r3 = this;
            int r2 = r3.A00
            r1 = 6
            r0 = 5
            if (r5 == 0) goto L_0x0014
            if (r2 == r0) goto L_0x0018
            if (r2 != r1) goto L_0x000b
        L_0x000a:
            r2 = 0
        L_0x000b:
            boolean r0 = r4 instanceof X.AnonymousClass05N
            if (r0 == 0) goto L_0x0013
            X.05N r4 = (X.AnonymousClass05N) r4
            r4.A00 = r2
        L_0x0013:
            return
        L_0x0014:
            if (r2 == r0) goto L_0x000a
            if (r2 != r1) goto L_0x000b
        L_0x0018:
            r2 = 1
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.Barrier.A05(X.0R7, boolean):void");
    }

    public int getMargin() {
        return this.A01.A01;
    }

    public int getType() {
        return this.A00;
    }

    public void setAllowsGoneWidget(boolean z) {
        this.A01.A02 = z;
    }

    public void setMargin(int i) {
        this.A01.A01 = i;
    }

    public Barrier(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }

    public void A04(AttributeSet attributeSet) {
        super.A04(attributeSet);
        this.A01 = new AnonymousClass05N();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AnonymousClass0K9.A01);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 15) {
                    this.A00 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 14) {
                    this.A01.A02 = obtainStyledAttributes.getBoolean(index, true);
                } else if (index == 16) {
                    this.A01.A01 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
        }
        this.A02 = this.A01;
        A02();
    }

    public void setDpMargin(int i) {
        this.A01.A01 = AnonymousClass001.A06((float) i, getResources().getDisplayMetrics().density);
    }

    public void setType(int i) {
        this.A00 = i;
    }

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
