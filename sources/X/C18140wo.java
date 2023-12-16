package X;

/* renamed from: X.0wo  reason: invalid class name and case insensitive filesystem */
public class C18140wo implements C15830s0 {
    public Object A00;
    public final int A01;

    public C18140wo(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0132, code lost:
        if (r11 != false) goto L_0x0174;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x013b, code lost:
        r2 = X.AnonymousClass001.A0T(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001a, code lost:
        if (r15.A05() <= 0) goto L_0x001c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0186  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass0XY BMX(android.view.View r14, X.AnonymousClass0XY r15) {
        /*
            r13 = this;
            int r0 = r13.A01
            if (r0 == 0) goto L_0x005a
            java.lang.Object r5 = r13.A00
            androidx.coordinatorlayout.widget.CoordinatorLayout r5 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r5
            X.0XY r0 = r5.A06
            boolean r0 = X.C04880Ra.A01(r0, r15)
            if (r0 != 0) goto L_0x0054
            r5.A06 = r15
            r2 = 1
            if (r15 == 0) goto L_0x001c
            int r1 = r15.A05()
            r0 = 1
            if (r1 > 0) goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            r5.A08 = r0
            if (r0 != 0) goto L_0x0058
            android.graphics.drawable.Drawable r0 = r5.getBackground()
            if (r0 != 0) goto L_0x0058
        L_0x0027:
            r5.setWillNotDraw(r2)
            X.0Uh r4 = r15.A00
            boolean r0 = r4.A0A()
            if (r0 != 0) goto L_0x0051
            int r3 = r5.getChildCount()
            r2 = 0
        L_0x0037:
            if (r2 >= r3) goto L_0x0051
            android.view.View r1 = r5.getChildAt(r2)
            boolean r0 = X.AnonymousClass0YY.A0B(r1)
            if (r0 == 0) goto L_0x0055
            X.02f r0 = X.AnonymousClass001.A0W(r1)
            X.0Ug r0 = r0.A0A
            if (r0 == 0) goto L_0x0055
            boolean r0 = r4.A0A()
            if (r0 == 0) goto L_0x0055
        L_0x0051:
            r5.requestLayout()
        L_0x0054:
            return r15
        L_0x0055:
            int r2 = r2 + 1
            goto L_0x0037
        L_0x0058:
            r2 = 0
            goto L_0x0027
        L_0x005a:
            int r6 = r15.A05()
            java.lang.Object r7 = r13.A00
            X.040 r7 = (X.AnonymousClass040) r7
            r5 = 0
            int r3 = r15.A05()
            androidx.appcompat.widget.ActionBarContextView r0 = r7.A0K
            r2 = 8
            if (r0 == 0) goto L_0x016b
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            boolean r0 = r0 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x016b
            androidx.appcompat.widget.ActionBarContextView r0 = r7.A0K
            android.view.ViewGroup$MarginLayoutParams r4 = X.AnonymousClass001.A0T(r0)
            androidx.appcompat.widget.ActionBarContextView r0 = r7.A0K
            boolean r0 = r0.isShown()
            r12 = 1
            if (r0 == 0) goto L_0x016d
            android.graphics.Rect r0 = r7.A03
            if (r0 != 0) goto L_0x0094
            android.graphics.Rect r0 = X.AnonymousClass001.A0N()
            r7.A03 = r0
            android.graphics.Rect r0 = X.AnonymousClass001.A0N()
            r7.A04 = r0
        L_0x0094:
            android.graphics.Rect r9 = r7.A03
            android.graphics.Rect r10 = r7.A04
            int r11 = r15.A03()
            int r8 = r15.A05()
            int r1 = r15.A04()
            int r0 = r15.A02()
            r9.set(r11, r8, r1, r0)
            android.view.ViewGroup r8 = r7.A07
            java.lang.reflect.Method r1 = X.AnonymousClass0VG.A00
            if (r1 == 0) goto L_0x00c4
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x00bc }
            r0[r5] = r9     // Catch:{ Exception -> 0x00bc }
            r0[r12] = r10     // Catch:{ Exception -> 0x00bc }
            r1.invoke(r8, r0)     // Catch:{ Exception -> 0x00bc }
            goto L_0x00c4
        L_0x00bc:
            r8 = move-exception
            java.lang.String r1 = "ViewUtils"
            java.lang.String r0 = "Could not invoke computeFitSystemWindows"
            android.util.Log.d(r1, r0, r8)
        L_0x00c4:
            int r10 = r9.top
            int r11 = r9.left
            int r1 = r9.right
            android.view.ViewGroup r0 = r7.A07
            X.0XY r0 = X.C06560Yg.A06(r0)
            if (r0 != 0) goto L_0x0161
            r9 = 0
            r8 = 0
        L_0x00d4:
            int r0 = r4.topMargin
            if (r0 != r10) goto L_0x0159
            int r0 = r4.leftMargin
            if (r0 != r11) goto L_0x0159
            int r0 = r4.rightMargin
            if (r0 != r1) goto L_0x0159
            r11 = 0
        L_0x00e1:
            if (r10 <= 0) goto L_0x0137
            android.view.View r0 = r7.A06
            if (r0 != 0) goto L_0x0137
            android.content.Context r1 = r7.A0i
            android.view.View r0 = new android.view.View
            r0.<init>(r1)
            r7.A06 = r0
            r0.setVisibility(r2)
            int r1 = r4.topMargin
            r0 = 51
            r10 = -1
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r2.<init>(r10, r1, r0)
            r2.leftMargin = r9
            r2.rightMargin = r8
            android.view.ViewGroup r1 = r7.A07
            android.view.View r0 = r7.A06
            r1.addView(r0, r10, r2)
        L_0x0108:
            android.view.View r0 = r7.A06
            if (r0 == 0) goto L_0x0135
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x012b
            android.view.View r8 = r7.A06
            int r0 = X.AnonymousClass0YY.A03(r8)
            r2 = r0 & 8192(0x2000, float:1.14794E-41)
            android.content.Context r1 = r7.A0i
            r0 = 2131099653(0x7f060005, float:1.7811665E38)
            if (r2 == 0) goto L_0x0124
            r0 = 2131099654(0x7f060006, float:1.7811667E38)
        L_0x0124:
            int r0 = X.AnonymousClass0Y8.A04(r1, r0)
            r8.setBackgroundColor(r0)
        L_0x012b:
            boolean r0 = r7.A0d
            if (r0 != 0) goto L_0x0132
            if (r12 == 0) goto L_0x0132
            r3 = 0
        L_0x0132:
            if (r11 == 0) goto L_0x0179
            goto L_0x0174
        L_0x0135:
            r12 = 0
            goto L_0x012b
        L_0x0137:
            android.view.View r0 = r7.A06
            if (r0 == 0) goto L_0x0108
            android.view.ViewGroup$MarginLayoutParams r2 = X.AnonymousClass001.A0T(r0)
            int r0 = r2.height
            int r1 = r4.topMargin
            if (r0 != r1) goto L_0x014d
            int r0 = r2.leftMargin
            if (r0 != r9) goto L_0x014d
            int r0 = r2.rightMargin
            if (r0 == r8) goto L_0x0108
        L_0x014d:
            r2.height = r1
            r2.leftMargin = r9
            r2.rightMargin = r8
            android.view.View r0 = r7.A06
            r0.setLayoutParams(r2)
            goto L_0x0108
        L_0x0159:
            r4.topMargin = r10
            r4.leftMargin = r11
            r4.rightMargin = r1
            r11 = 1
            goto L_0x00e1
        L_0x0161:
            int r9 = r0.A03()
            int r8 = r0.A04()
            goto L_0x00d4
        L_0x016b:
            r12 = 0
            goto L_0x0179
        L_0x016d:
            int r0 = r4.topMargin
            if (r0 == 0) goto L_0x016b
            r4.topMargin = r5
            r12 = 0
        L_0x0174:
            androidx.appcompat.widget.ActionBarContextView r0 = r7.A0K
            r0.setLayoutParams(r4)
        L_0x0179:
            android.view.View r0 = r7.A06
            if (r0 == 0) goto L_0x0184
            if (r12 != 0) goto L_0x0181
            r5 = 8
        L_0x0181:
            r0.setVisibility(r5)
        L_0x0184:
            if (r6 == r3) goto L_0x0196
            int r2 = r15.A03()
            int r1 = r15.A04()
            int r0 = r15.A02()
            X.0XY r15 = r15.A07(r2, r3, r1, r0)
        L_0x0196:
            X.0XY r15 = X.C06560Yg.A08(r14, r15)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18140wo.BMX(android.view.View, X.0XY):X.0XY");
    }
}
