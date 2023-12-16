package X;

/* renamed from: X.5VV  reason: invalid class name */
public final class AnonymousClass5VV {
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0046, code lost:
        if (r0.getDefaultColor() == r8.getDefaultColor()) goto L_0x0048;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(android.content.res.ColorStateList r8, android.view.Menu r9, X.C142006wU r10, int r11) {
        /*
            X.C18260x0.A0P(r9, r8)
            int r4 = r9.size()
            r3 = 0
        L_0x0008:
            if (r3 >= r4) goto L_0x00f5
            android.view.MenuItem r2 = r9.getItem(r3)
            X.C162457s7.A0D(r2)
            android.graphics.drawable.Drawable r0 = r2.getIcon()
            if (r0 == 0) goto L_0x001a
            X.C06130Wj.A02(r0)
        L_0x001a:
            boolean r0 = r2 instanceof X.C07910d1
            if (r0 == 0) goto L_0x0061
            r0 = r2
            X.0d1 r0 = (X.C07910d1) r0
            if (r0 == 0) goto L_0x0061
            int r0 = r0.A02
            r1 = 32
            r0 = r0 & 32
            if (r0 != r1) goto L_0x0061
            boolean r0 = r2.isEnabled()
            if (r0 == 0) goto L_0x0048
            boolean r0 = r2 instanceof X.C17230vB
            if (r0 == 0) goto L_0x00e4
            r0 = r2
            X.0vB r0 = (X.C17230vB) r0
            android.content.res.ColorStateList r0 = r0.getIconTintList()
        L_0x003c:
            if (r0 == 0) goto L_0x00f0
            int r1 = r0.getDefaultColor()
            int r0 = r8.getDefaultColor()
            if (r1 != r0) goto L_0x00f0
        L_0x0048:
            android.view.View r7 = r2.getActionView()
            if (r7 == 0) goto L_0x0061
            android.view.View r1 = r2.getActionView()
            if (r1 == 0) goto L_0x0064
            r0 = 2131433768(0x7f0b1928, float:1.848933E38)
            java.lang.Object r0 = r1.getTag(r0)
            boolean r0 = X.AnonymousClass0x9.A1Q(r0)
            if (r0 == 0) goto L_0x0064
        L_0x0061:
            int r3 = r3 + 1
            goto L_0x0008
        L_0x0064:
            r5 = 1
            android.view.View r2 = r2.getActionView()
            if (r2 == 0) goto L_0x0075
            r1 = 2131433768(0x7f0b1928, float:1.848933E38)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r2.setTag(r1, r0)
        L_0x0075:
            boolean r0 = r7 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x00e1
            r0 = r7
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            X.4C5 r6 = X.C04990Rl.A01(r0)
        L_0x0080:
            android.view.View[] r1 = new android.view.View[r5]
            r0 = 0
            r1[r0] = r7
            X.4C5 r5 = X.C829545o.A07(r1)
            r2 = 0
            r1 = 1
            r0 = 2
            X.4C5[] r0 = new X.AnonymousClass4C5[r0]
            r0[r2] = r5
            r0[r1] = r6
            X.4C5 r6 = X.C829545o.A07(r0)
            X.63i r5 = X.C1221663i.A00
            boolean r0 = r6 instanceof X.C72623e1
            if (r0 == 0) goto L_0x00d9
            X.3e1 r6 = (X.C72623e1) r6
            X.4C5 r2 = r6.A01
            X.4GQ r0 = r6.A00
            X.8PM r1 = new X.8PM
            r1.<init>(r0, r5, r2)
        L_0x00a7:
            java.util.List r0 = X.C829345m.A01(r1)
            java.util.Iterator r2 = r0.iterator()
        L_0x00af:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0061
            android.view.View r1 = X.C86654Ky.A0H(r2)
            boolean r0 = r1 instanceof com.whatsapp.wds.components.button.WDSButton
            if (r0 == 0) goto L_0x00c5
            if (r10 == 0) goto L_0x00af
            com.whatsapp.wds.components.button.WDSButton r1 = (com.whatsapp.wds.components.button.WDSButton) r1
            r1.setVariant(r10)
            goto L_0x00af
        L_0x00c5:
            boolean r0 = r1 instanceof android.widget.ImageView
            if (r0 == 0) goto L_0x00cf
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r1.setImageTintList(r8)
            goto L_0x00af
        L_0x00cf:
            boolean r0 = r1 instanceof android.widget.TextView
            if (r0 == 0) goto L_0x00af
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1.setTextColor(r11)
            goto L_0x00af
        L_0x00d9:
            X.63j r0 = X.C1221763j.A00
            X.8PM r1 = new X.8PM
            r1.<init>(r0, r5, r6)
            goto L_0x00a7
        L_0x00e1:
            X.3e4 r6 = X.C72653e4.A00
            goto L_0x0080
        L_0x00e4:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r1 < r0) goto L_0x00f0
            android.content.res.ColorStateList r0 = X.C06470Xv.A00(r2)
            goto L_0x003c
        L_0x00f0:
            X.AnonymousClass0I5.A00(r8, r2)
            goto L_0x0048
        L_0x00f5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5VV.A00(android.content.res.ColorStateList, android.view.Menu, X.6wU, int):void");
    }
}
