package X;

import android.view.ViewTreeObserver;

/* renamed from: X.6BP  reason: invalid class name */
public class AnonymousClass6BP implements ViewTreeObserver.OnGlobalLayoutListener {
    public Object A00;
    public boolean A01;
    public final int A02;

    public AnonymousClass6BP(int i, Object obj, boolean z) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:114:0x01a3, code lost:
        if (r0 <= 0) goto L_0x01a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0054, code lost:
        if (r2 <= 0) goto L_0x0056;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onGlobalLayout() {
        /*
            r8 = this;
            int r0 = r8.A02
            switch(r0) {
                case 0: goto L_0x0144;
                case 1: goto L_0x0106;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r3 = r8.A00
            X.5YE r3 = (X.AnonymousClass5YE) r3
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = r3.A06
            if (r0 == 0) goto L_0x0016
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            if (r0 == 0) goto L_0x0016
            r0.removeOnGlobalLayoutListener(r8)
        L_0x0016:
            int r1 = r3.A02()
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = r3.A06
            if (r0 == 0) goto L_0x0103
            int r5 = r0.getHeight()
        L_0x0022:
            r0 = 0
            if (r1 >= r0) goto L_0x0026
            r1 = 0
        L_0x0026:
            int r5 = r5 + r1
            if (r5 <= 0) goto L_0x00c6
            int r0 = r3.A00
            int r4 = r5 - r0
            android.content.Context r0 = r3.A02
            if (r0 == 0) goto L_0x0056
            android.content.res.Resources r0 = r0.getResources()
            if (r0 == 0) goto L_0x0056
            android.content.res.Configuration r0 = r0.getConfiguration()
            if (r0 == 0) goto L_0x0056
            int r1 = r0.orientation
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r0 == 0) goto L_0x0056
            r0 = 1
            if (r1 != r0) goto L_0x00f2
            X.33p r0 = r3.A0M
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r0)
            java.lang.String r0 = "expressions_tray_peek_height_portrait"
            int r2 = X.C18280x3.A02(r1, r0)
        L_0x0054:
            if (r2 > 0) goto L_0x0067
        L_0x0056:
            android.view.View r0 = r3.A04
            if (r0 == 0) goto L_0x00ef
            android.content.res.Resources r1 = r0.getResources()
            if (r1 == 0) goto L_0x00ef
            r0 = 2131166490(0x7f07051a, float:1.7947227E38)
            int r2 = r1.getDimensionPixelOffset(r0)
        L_0x0067:
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = r3.A07
            if (r1 == 0) goto L_0x006d
            r1.A0F = r4
        L_0x006d:
            if (r4 >= r2) goto L_0x00e8
            if (r1 == 0) goto L_0x007a
            int r0 = r5 / 2
            if (r4 <= r0) goto L_0x0076
            r4 = r0
        L_0x0076:
            r0 = 0
            r1.A0U(r4, r0)
        L_0x007a:
            boolean r0 = r8.A01
            if (r0 == 0) goto L_0x00c6
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r3.A07
            if (r0 == 0) goto L_0x00b0
            int r0 = r0.A0F
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            if (r2 == 0) goto L_0x00b0
            android.view.View r0 = r3.A03
            if (r0 == 0) goto L_0x009a
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            if (r1 == 0) goto L_0x009a
            int r0 = r2.intValue()
            r1.height = r0
        L_0x009a:
            android.view.View r0 = r3.A03
            if (r0 == 0) goto L_0x00a1
            r0.requestLayout()
        L_0x00a1:
            android.view.View r0 = r3.A03
            if (r0 == 0) goto L_0x00b0
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            if (r1 == 0) goto L_0x00b0
            r0 = 21
            X.AnonymousClass6BG.A00(r1, r3, r0)
        L_0x00b0:
            com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView r0 = r3.A0F
            r4 = 8
            if (r0 == 0) goto L_0x00c7
            int r0 = r0.getVisibility()
            if (r0 != r4) goto L_0x00c7
        L_0x00bc:
            com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView r0 = r3.A0F
            if (r0 == 0) goto L_0x00d3
            int r0 = r0.getVisibility()
            if (r0 != r4) goto L_0x00d3
        L_0x00c6:
            return
        L_0x00c7:
            com.google.android.material.bottomsheet.BottomSheetBehavior r2 = r3.A07
            if (r2 == 0) goto L_0x00bc
            int r1 = r2.A0O
            r0 = 3
            if (r1 != r0) goto L_0x00bc
            int r0 = r2.A0F
            goto L_0x00e0
        L_0x00d3:
            com.google.android.material.bottomsheet.BottomSheetBehavior r2 = r3.A07
            if (r2 == 0) goto L_0x00c6
            int r1 = r2.A0O
            r0 = 4
            if (r1 != r0) goto L_0x00c6
            int r0 = r2.A0L()
        L_0x00e0:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A0C(r0)
            return
        L_0x00e8:
            if (r1 == 0) goto L_0x007a
            r0 = 0
            r1.A0U(r2, r0)
            goto L_0x007a
        L_0x00ef:
            r2 = 0
            goto L_0x0067
        L_0x00f2:
            r0 = 2
            if (r1 != r0) goto L_0x0056
            X.33p r0 = r3.A0M
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r0)
            java.lang.String r0 = "expressions_tray_peek_height_landscape"
            int r2 = X.C18280x3.A02(r1, r0)
            goto L_0x0054
        L_0x0103:
            r5 = 0
            goto L_0x0022
        L_0x0106:
            java.lang.Object r2 = r8.A00
            X.5l7 r2 = (X.C113245l7) r2
            com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView r0 = r2.A40
            if (r0 == 0) goto L_0x00c6
            X.C86604Kt.A1G(r0, r8)
            r0 = 0
            r2.A6M = r0
            boolean r0 = r2.A6j
            if (r0 != 0) goto L_0x0132
            com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView r0 = r2.A40
            if (r0 == 0) goto L_0x0132
            r2.A1f(r0)
            com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView r1 = r2.A40
            r0 = 4
            r1.A0C(r0)
            com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView r0 = r2.A40
            r0.A08()
            com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView r0 = r2.A40
            r0.A0B()
            r2.A0c()
        L_0x0132:
            boolean r0 = r8.A01
            if (r0 == 0) goto L_0x0139
            r2.A0c()
        L_0x0139:
            com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView r1 = r2.A40
            r0 = 6
            X.5sE r0 = X.C117625sE.A00(r8, r0)
            r1.post(r0)
            return
        L_0x0144:
            java.lang.Object r4 = r8.A00
            X.5l7 r4 = (X.C113245l7) r4
            android.view.ViewGroup r0 = r4.A0V
            X.C86604Kt.A1G(r0, r8)
            int r1 = r4.A0U()
            android.view.ViewGroup r0 = r4.A0V
            int r7 = r0.getHeight()
            r0 = 0
            int r0 = java.lang.Math.max(r1, r0)
            int r7 = r7 + r0
            if (r7 <= 0) goto L_0x00c6
            X.5KV r0 = r4.A2c
            android.widget.FrameLayout r0 = r0.A04
            int r6 = r0.getHeight()
            X.5KV r0 = r4.A2c
            android.view.View r0 = r0.A02
            X.7k9 r0 = X.C106895aL.A00(r0)
            int r5 = r0.A00
            X.1VX r1 = X.C113245l7.A0E(r4)
            r0 = 5627(0x15fb, float:7.885E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 != 0) goto L_0x0247
            r0 = 0
        L_0x017e:
            int r2 = r7 - r6
            int r2 = r2 - r5
            int r2 = r2 - r0
            int r1 = X.C113245l7.A00(r4)
            r0 = 1
            if (r1 == r0) goto L_0x0239
            r0 = 2
            if (r1 == r0) goto L_0x022b
            r3 = 0
        L_0x018d:
            int r1 = X.C113245l7.A00(r4)
            r0 = 1
            if (r1 == r0) goto L_0x021d
            r0 = 2
            if (r1 != r0) goto L_0x01a5
            X.33p r0 = r4.A3K
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r0)
            java.lang.String r0 = "expressions_tray_peek_height_landscape"
            int r0 = X.C18280x3.A02(r1, r0)
        L_0x01a3:
            if (r0 > 0) goto L_0x01b2
        L_0x01a5:
            android.view.View r0 = r4.A0C
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131166490(0x7f07051a, float:1.7947227E38)
            int r3 = r1.getDimensionPixelOffset(r0)
        L_0x01b2:
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = r4.A0t
            if (r1 == 0) goto L_0x01c4
            r1.A0F = r2
            if (r2 >= r3) goto L_0x01c0
            int r0 = r7 / 2
            int r3 = java.lang.Math.min(r2, r0)
        L_0x01c0:
            r0 = 0
            r1.A0U(r3, r0)
        L_0x01c4:
            boolean r0 = r8.A01
            if (r0 == 0) goto L_0x00c6
            android.view.View r2 = r4.A0E
            if (r2 == 0) goto L_0x00c6
            android.view.ViewGroup r0 = r4.A0V
            if (r0 == 0) goto L_0x00c6
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = r4.A0t
            if (r1 == 0) goto L_0x00c6
            com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView r0 = r4.A40
            if (r0 == 0) goto L_0x00c6
            int r0 = r1.A0F
            X.C86624Kv.A0w(r2, r0)
            android.view.View r0 = r4.A0E
            r0.requestLayout()
            android.view.View r0 = r4.A0E
            android.view.ViewTreeObserver r2 = r0.getViewTreeObserver()
            r1 = 19
            X.6BG r0 = new X.6BG
            r0.<init>((X.C113245l7) r4, (int) r1)
            r2.addOnGlobalLayoutListener(r0)
            com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView r0 = r4.A40
            int r0 = r0.getVisibility()
            r3 = 8
            if (r0 == r3) goto L_0x0209
            com.google.android.material.bottomsheet.BottomSheetBehavior r2 = r4.A0t
            int r1 = r2.A0O
            r0 = 3
            if (r1 != r0) goto L_0x0209
            int r0 = r2.A0F
        L_0x0205:
            r4.A1R(r0)
            return
        L_0x0209:
            com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView r0 = r4.A40
            int r0 = r0.getVisibility()
            if (r0 == r3) goto L_0x00c6
            com.google.android.material.bottomsheet.BottomSheetBehavior r2 = r4.A0t
            int r1 = r2.A0O
            r0 = 4
            if (r1 != r0) goto L_0x00c6
            int r0 = r2.A0L()
            goto L_0x0205
        L_0x021d:
            X.33p r0 = r4.A3K
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r0)
            java.lang.String r0 = "expressions_tray_peek_height_portrait"
            int r0 = X.C18280x3.A02(r1, r0)
            goto L_0x01a3
        L_0x022b:
            X.33p r0 = r4.A3K
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r0)
            java.lang.String r0 = "expressions_tray_peek_height_landscape"
            int r3 = X.C18280x3.A02(r1, r0)
            goto L_0x018d
        L_0x0239:
            X.33p r0 = r4.A3K
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r0)
            java.lang.String r0 = "expressions_tray_peek_height_portrait"
            int r3 = X.C18280x3.A02(r1, r0)
            goto L_0x018d
        L_0x0247:
            int r3 = X.C113245l7.A00(r4)
            r2 = 2
            android.view.View r0 = r4.A0C
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131166492(0x7f07051c, float:1.794723E38)
            if (r3 != r2) goto L_0x025a
            r0 = 2131166493(0x7f07051d, float:1.7947233E38)
        L_0x025a:
            int r0 = r1.getDimensionPixelOffset(r0)
            goto L_0x017e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6BP.onGlobalLayout():void");
    }
}
