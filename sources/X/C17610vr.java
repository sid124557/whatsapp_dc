package X;

import android.view.inputmethod.InputMethodManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.0vr  reason: invalid class name and case insensitive filesystem */
public class C17610vr extends AnonymousClass0O5 {
    public Object A00;
    public final int A01;

    public static void A00(C17610vr r1, RecyclerView recyclerView, int i) {
        if (i == 1) {
            A01(recyclerView, (C153427bI) r1.A00);
        }
    }

    public C17610vr(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0035, code lost:
        if (r5 < r4.A0H) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0023, code lost:
        if (r9 < r4.A0H) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(androidx.recyclerview.widget.RecyclerView r13, int r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.A01
            switch(r0) {
                case 0: goto L_0x0006;
                case 1: goto L_0x0005;
                case 2: goto L_0x0080;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            java.lang.Object r4 = r12.A00
            X.09U r4 = (X.AnonymousClass09U) r4
            int r10 = r13.computeHorizontalScrollOffset()
            int r2 = r13.computeVerticalScrollOffset()
            androidx.recyclerview.widget.RecyclerView r6 = r4.A0B
            int r11 = r6.computeVerticalScrollRange()
            int r9 = r4.A06
            int r0 = r11 - r9
            r1 = 0
            r3 = 1
            if (r0 <= 0) goto L_0x0025
            int r5 = r4.A0H
            r0 = 1
            if (r9 >= r5) goto L_0x0026
        L_0x0025:
            r0 = 0
        L_0x0026:
            r4.A0D = r0
            int r6 = r6.computeHorizontalScrollRange()
            int r5 = r4.A07
            int r0 = r6 - r5
            if (r0 <= 0) goto L_0x0037
            int r0 = r4.A0H
            r8 = 1
            if (r5 >= r0) goto L_0x0038
        L_0x0037:
            r8 = 0
        L_0x0038:
            r4.A0C = r8
            boolean r0 = r4.A0D
            if (r0 != 0) goto L_0x0048
            if (r8 != 0) goto L_0x0048
            int r0 = r4.A08
            if (r0 == 0) goto L_0x0005
            r4.A05(r1)
            return
        L_0x0048:
            r7 = 1073741824(0x40000000, float:2.0)
            if (r0 == 0) goto L_0x0060
            float r2 = (float) r2
            float r1 = (float) r9
            float r0 = r1 / r7
            float r2 = r2 + r0
            float r1 = r1 * r2
            float r0 = (float) r11
            float r1 = r1 / r0
            int r0 = (int) r1
            r4.A09 = r0
            int r0 = r9 * r9
            int r0 = r0 / r11
            int r0 = java.lang.Math.min(r9, r0)
            r4.A0A = r0
        L_0x0060:
            if (r8 == 0) goto L_0x0076
            float r2 = (float) r10
            float r1 = (float) r5
            float r0 = r1 / r7
            float r2 = r2 + r0
            float r1 = r1 * r2
            float r0 = (float) r6
            float r1 = r1 / r0
            int r0 = (int) r1
            r4.A04 = r0
            int r0 = r5 * r5
            int r0 = r0 / r6
            int r0 = java.lang.Math.min(r5, r0)
            r4.A05 = r0
        L_0x0076:
            int r0 = r4.A08
            if (r0 == 0) goto L_0x007c
            if (r0 != r3) goto L_0x0005
        L_0x007c:
            r4.A05(r3)
            return
        L_0x0080:
            if (r14 == 0) goto L_0x008b
            java.lang.Object r1 = r12.A00
            X.0Mm r1 = (X.C04020Mm) r1
            int r0 = r1.A04
            int r0 = r0 + r14
            r1.A04 = r0
        L_0x008b:
            if (r15 == 0) goto L_0x0005
            java.lang.Object r1 = r12.A00
            X.0Mm r1 = (X.C04020Mm) r1
            int r0 = r1.A05
            int r0 = r0 + r15
            r1.A05 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17610vr.A04(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }

    public void A05(RecyclerView recyclerView, int i) {
        switch (this.A01) {
            case 1:
                A00(this, recyclerView, i);
                return;
            case 3:
                if (i == 2 || i == 1) {
                    C03850Lu r2 = (C03850Lu) this.A00;
                    RecyclerView recyclerView2 = r2.A00;
                    recyclerView2.A0r(this);
                    recyclerView2.A0T = null;
                    r2.A01.A06(recyclerView2);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public static void A01(RecyclerView recyclerView, C153427bI r4) {
        ((InputMethodManager) r4.A00().getSystemService("input_method")).hideSoftInputFromWindow(recyclerView.getWindowToken(), 0);
    }
}
