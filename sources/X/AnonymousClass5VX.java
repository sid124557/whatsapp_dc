package X;

/* renamed from: X.5VX  reason: invalid class name */
public final class AnonymousClass5VX {
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004b, code lost:
        r3 = r0.getId();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final org.json.JSONObject A00(X.C105785Wk r10) {
        /*
            r9 = 0
            X.C162457s7.A0J(r10, r9)
            org.json.JSONObject r4 = X.AnonymousClass0x9.A1G()
            java.lang.Object r2 = r10.A04
            boolean r7 = r2 instanceof android.view.View
            r3 = 0
            if (r7 == 0) goto L_0x001b
            r1 = r2
            android.view.View r1 = (android.view.View) r1
            if (r1 == 0) goto L_0x001b
            r0 = 2131434724(0x7f0b1ce4, float:1.849127E38)
            java.lang.Object r3 = r1.getTag(r0)
        L_0x001b:
            java.lang.Class r0 = r10.getClass()
            java.lang.String r1 = r0.getCanonicalName()
            java.lang.String r0 = "node_class"
            r4.put(r0, r1)
            r6 = 1
            if (r3 != 0) goto L_0x003f
            java.lang.Class r1 = r2.getClass()
            java.lang.String r0 = r1.getCanonicalName()
            if (r0 == 0) goto L_0x0116
            boolean r0 = X.C175738Zn.A0V(r0)
            if (r0 != 0) goto L_0x0116
            java.lang.String r3 = r1.getCanonicalName()
        L_0x003f:
            java.lang.String r5 = "class"
            r4.put(r5, r3)
            if (r7 == 0) goto L_0x006d
            r0 = r2
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L_0x006d
            int r3 = r0.getId()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            if (r1 == 0) goto L_0x006d
            r0 = -1
            if (r3 == r0) goto L_0x006d
            java.util.Locale r3 = java.util.Locale.US
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r0[r9] = r1
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r0, r6)
            java.lang.String r0 = "0x%08x"
            java.lang.String r1 = X.C86654Ky.A0n(r3, r0, r1)
            java.lang.String r0 = "view_id"
            r4.put(r0, r1)
        L_0x006d:
            X.57f r0 = r10.A01
            java.lang.String r1 = r0.name()
            java.lang.String r0 = "ui_type"
            r4.put(r0, r1)
            boolean r0 = r10 instanceof X.AnonymousClass57F
            if (r0 == 0) goto L_0x00ea
            java.lang.Class r1 = r2.getClass()
            java.lang.Class<android.view.View> r0 = android.view.View.class
            boolean r0 = X.C162457s7.A0P(r1, r0)
            if (r0 == 0) goto L_0x009d
            r1 = r2
            android.view.View r1 = (android.view.View) r1
            android.graphics.drawable.Drawable r0 = r1.getBackground()
            if (r0 != 0) goto L_0x009d
            boolean r0 = X.C107385bE.A02()
            if (r0 == 0) goto L_0x0114
            android.graphics.drawable.Drawable r0 = r1.getForeground()
            if (r0 == 0) goto L_0x0114
        L_0x009d:
            X.66R r0 = r10.A07
            boolean r8 = X.C18270x1.A1V(r0)
        L_0x00a3:
            android.view.View r2 = (android.view.View) r2
            X.C162457s7.A0J(r2, r9)
            int[] r7 = X.C105785Wk.A08
            r2.getLocationOnScreen(r7)
            int r6 = r2.getLeft()
            int r3 = r2.getTop()
            int r1 = r2.getRight()
            int r0 = r2.getBottom()
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>(r6, r3, r1, r0)
            r1 = r7[r9]
            r0 = 1
            r0 = r7[r0]
            r2.offsetTo(r1, r0)
            X.5S0 r3 = new X.5S0
            r3.<init>(r2, r8)
            org.json.JSONObject r2 = X.AnonymousClass0x9.A1G()
            java.lang.String r1 = "is_visible"
            boolean r0 = r3.A01
            r2.put(r1, r0)
            android.graphics.Rect r0 = r3.A00
            java.lang.String r1 = r0.flattenToString()
            java.lang.String r0 = "bounds_on_screen"
            r2.put(r0, r1)
            java.lang.String r0 = "leaf_data"
            r4.put(r0, r2)
        L_0x00ea:
            java.util.List r1 = r10.A05
            boolean r0 = X.C18310x6.A1X(r1)
            if (r0 == 0) goto L_0x0121
            org.json.JSONArray r3 = X.AnonymousClass0x9.A1F()
            java.util.Iterator r2 = r1.iterator()
        L_0x00fa:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x011c
            java.lang.Object r0 = r2.next()
            X.5Wk r0 = (X.C105785Wk) r0
            org.json.JSONObject r1 = A00(r0)
            boolean r0 = r1.has(r5)
            if (r0 == 0) goto L_0x00fa
            r3.put(r1)
            goto L_0x00fa
        L_0x0114:
            r8 = 0
            goto L_0x00a3
        L_0x0116:
            java.lang.String r3 = r1.getName()
            goto L_0x003f
        L_0x011c:
            java.lang.String r0 = "children"
            r4.put(r0, r3)
        L_0x0121:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5VX.A00(X.5Wk):org.json.JSONObject");
    }
}
