package X;

import android.view.View;

/* renamed from: X.0vo  reason: invalid class name and case insensitive filesystem */
public class C17580vo extends C08150dP {
    public Object A00;
    public final int A01;

    public C17580vo(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0054, code lost:
        r2.A0K.setAlpha(1.0f);
        r2.A0M.A0A((X.AnonymousClass0u4) null);
        r2.A0M = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0063, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0087, code lost:
        X.AnonymousClass0V0.A02(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BMQ(android.view.View r5) {
        /*
            r4 = this;
            int r0 = r4.A01
            switch(r0) {
                case 0: goto L_0x004e;
                case 1: goto L_0x0049;
                case 2: goto L_0x0064;
                case 3: goto L_0x0012;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r4.A00
            X.03z r1 = (X.AnonymousClass03z) r1
            r0 = 0
            r1.A08 = r0
            androidx.appcompat.widget.ActionBarContainer r0 = r1.A09
            r0.requestLayout()
        L_0x0011:
            return
        L_0x0012:
            java.lang.Object r3 = r4.A00
            X.03z r3 = (X.AnonymousClass03z) r3
            boolean r0 = r3.A0F
            if (r0 == 0) goto L_0x0027
            android.view.View r0 = r3.A04
            if (r0 == 0) goto L_0x0027
            r1 = 0
            r0.setTranslationY(r1)
            androidx.appcompat.widget.ActionBarContainer r0 = r3.A09
            r0.setTranslationY(r1)
        L_0x0027:
            androidx.appcompat.widget.ActionBarContainer r1 = r3.A09
            r0 = 8
            r1.setVisibility(r0)
            androidx.appcompat.widget.ActionBarContainer r1 = r3.A09
            r0 = 0
            r1.setTransitioning(r0)
            r2 = 0
            r3.A08 = r2
            X.0uE r1 = r3.A06
            if (r1 == 0) goto L_0x0044
            X.0R2 r0 = r3.A07
            r1.BQw(r0)
            r3.A07 = r2
            r3.A06 = r2
        L_0x0044:
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = r3.A0B
            if (r0 == 0) goto L_0x0011
            goto L_0x0087
        L_0x0049:
            java.lang.Object r2 = r4.A00
            X.040 r2 = (X.AnonymousClass040) r2
            goto L_0x0054
        L_0x004e:
            java.lang.Object r0 = r4.A00
            X.0iK r0 = (X.C10670iK) r0
            X.040 r2 = r0.A00
        L_0x0054:
            androidx.appcompat.widget.ActionBarContextView r1 = r2.A0K
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.setAlpha(r0)
            X.0Qv r1 = r2.A0M
            r0 = 0
            r1.A0A(r0)
            r2.A0M = r0
            return
        L_0x0064:
            java.lang.Object r0 = r4.A00
            X.0ax r0 = (X.C07480ax) r0
            X.040 r2 = r0.A01
            androidx.appcompat.widget.ActionBarContextView r1 = r2.A0K
            r0 = 8
            r1.setVisibility(r0)
            android.widget.PopupWindow r0 = r2.A09
            if (r0 == 0) goto L_0x008b
            r0.dismiss()
        L_0x0078:
            androidx.appcompat.widget.ActionBarContextView r0 = r2.A0K
            r0.A03()
            X.0Qv r1 = r2.A0M
            r0 = 0
            r1.A0A(r0)
            r2.A0M = r0
            android.view.ViewGroup r0 = r2.A07
        L_0x0087:
            X.AnonymousClass0V0.A02(r0)
            return
        L_0x008b:
            X.AnonymousClass001.A1A(r2)
            goto L_0x0078
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17580vo.BMQ(android.view.View):void");
    }

    public void BMS(View view) {
        switch (this.A01) {
            case 0:
                ((C10670iK) this.A00).A00.A0K.setVisibility(0);
                return;
            case 1:
                AnonymousClass040 r2 = (AnonymousClass040) this.A00;
                r2.A0K.setVisibility(0);
                r2.A0K.sendAccessibilityEvent(32);
                AnonymousClass001.A1A(r2);
                return;
            default:
                return;
        }
    }
}
