package X;

import android.view.View;

/* renamed from: X.6B8  reason: invalid class name */
public class AnonymousClass6B8 implements C15830s0 {
    public Object A00;
    public final int A01;

    public AnonymousClass6B8(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(View view, Object obj, int i) {
        AnonymousClass0YZ.A0E(view, new AnonymousClass6B8(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x014a, code lost:
        return X.AnonymousClass0XY.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x032e, code lost:
        return r11;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass0XY BMX(android.view.View r10, X.AnonymousClass0XY r11) {
        /*
            r9 = this;
            int r0 = r9.A01
            switch(r0) {
                case 0: goto L_0x0306;
                case 1: goto L_0x0036;
                case 2: goto L_0x005b;
                case 3: goto L_0x0082;
                case 4: goto L_0x010a;
                case 5: goto L_0x014b;
                case 6: goto L_0x0182;
                case 7: goto L_0x0218;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r5 = r9.A00
            com.whatsapp.status.playback.StatusPlaybackActivity r5 = (com.whatsapp.status.playback.StatusPlaybackActivity) r5
            android.graphics.Rect r4 = r5.A0P
            int r3 = r11.A03()
            int r2 = r11.A05()
            int r1 = r11.A04()
            int r0 = r11.A02()
            r4.set(r3, r2, r1, r0)
            java.util.Iterator r2 = X.C89654ea.A4M(r5)
        L_0x0022:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x032e
            X.0eF r1 = X.AnonymousClass4L0.A0D(r2)
            boolean r0 = r1 instanceof com.whatsapp.status.playback.fragment.StatusPlaybackFragment
            if (r0 == 0) goto L_0x0022
            com.whatsapp.status.playback.fragment.StatusPlaybackFragment r1 = (com.whatsapp.status.playback.fragment.StatusPlaybackFragment) r1
            r1.A1M(r4)
            goto L_0x0022
        L_0x0036:
            java.lang.Object r3 = r9.A00
            com.whatsapp.CatalogImageListActivity r3 = (com.whatsapp.CatalogImageListActivity) r3
            int r1 = r11.A05()
            int r0 = X.C86614Ku.A03(r3)
            int r1 = r1 + r0
            r3.A01 = r1
            int r1 = r11.A02()
            X.4XV r0 = r3.A04
            int r2 = r3.A01
            r0.A01 = r2
            r0.A00 = r1
            int r1 = r3.A00
            if (r1 <= 0) goto L_0x032e
            androidx.recyclerview.widget.LinearLayoutManager r0 = r3.A02
            r0.A1Y(r1, r2)
            return r11
        L_0x005b:
            java.lang.Object r5 = r9.A00
            com.whatsapp.HomeActivity r5 = (com.whatsapp.HomeActivity) r5
            android.graphics.Rect r4 = r5.A2I
            int r3 = r11.A03()
            int r2 = r11.A05()
            int r1 = r11.A04()
            int r0 = r11.A02()
            r4.set(r3, r2, r1, r0)
            r0 = 2131431669(0x7f0b10f5, float:1.8485074E38)
            android.view.View r2 = r5.findViewById(r0)
            int r1 = r4.bottom
            r0 = 0
            r2.setPadding(r0, r0, r0, r1)
            return r11
        L_0x0082:
            java.lang.Object r5 = r9.A00
            X.5l7 r5 = (X.C113245l7) r5
            r1 = 7
            X.0Uh r0 = r11.A00
            X.0XU r0 = r0.A0C(r1)
            int r0 = r0.A03
            r5.A04 = r0
            android.view.View r0 = r5.A0Q
            if (r0 == 0) goto L_0x00d3
            X.4eZ r1 = X.C113245l7.A09(r5)
            r0 = 2131102581(0x7f060b75, float:1.7817604E38)
            X.C107405bG.A07(r1, r0)
            android.view.View r0 = r5.A0Q
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            int r0 = r5.A04
            r1.height = r0
            android.view.View r0 = r5.A0Q
            r0.setLayoutParams(r1)
            android.view.View r0 = r5.A0Q
            r0.requestLayout()
            android.view.ViewGroup r0 = r5.A0U
            if (r0 == 0) goto L_0x00d3
            android.view.View r0 = X.C86644Kx.A0G(r0)
            r5.A0K = r0
            android.widget.FrameLayout$LayoutParams r0 = X.C86664Kz.A0r(r0)
            r5.A0b = r0
            android.view.View r0 = r5.A0K
            android.view.ViewTreeObserver r2 = r0.getViewTreeObserver()
            r1 = 18
            X.6BG r0 = new X.6BG
            r0.<init>((X.C113245l7) r5, (int) r1)
            r2.addOnGlobalLayoutListener(r0)
        L_0x00d3:
            X.66o r1 = X.AnonymousClass5KY.A00(r5)
            X.4uZ r0 = r5.A4J
            boolean r0 = r1.BH2(r0)
            if (r0 == 0) goto L_0x0148
            androidx.appcompat.widget.Toolbar r0 = r5.A0r
            if (r0 == 0) goto L_0x0148
            X.5KY r0 = X.C113245l7.A0B(r5)
            X.8qC r0 = r0.A05
            r0.get()
            androidx.appcompat.widget.Toolbar r1 = r5.A0r
            r0 = 0
            X.C162457s7.A0J(r1, r0)
            boolean r0 = r1 instanceof com.whatsapp.bonsai.BonsaiToolbar
            if (r0 == 0) goto L_0x0148
            androidx.appcompat.widget.Toolbar r4 = r5.A0r
            int r3 = r4.getPaddingLeft()
            int r2 = r5.A04
            androidx.appcompat.widget.Toolbar r0 = r5.A0r
            int r1 = r0.getPaddingRight()
            androidx.appcompat.widget.Toolbar r0 = r5.A0r
            X.C86634Kw.A1B(r0, r4, r3, r2, r1)
            goto L_0x0148
        L_0x010a:
            java.lang.Object r3 = r9.A00
            com.whatsapp.home.ui.StarredMessagesPlaceholderActivity r3 = (com.whatsapp.home.ui.StarredMessagesPlaceholderActivity) r3
            r0 = 2
            X.C162457s7.A0J(r11, r0)
            r1 = 7
            X.0Uh r0 = r11.A00
            X.0XU r0 = r0.A0C(r1)
            X.C162457s7.A0D(r0)
            int r0 = r0.A03
            r3.A01 = r0
            android.view.ViewGroup r2 = r3.A04
            r1 = 0
            r0 = r1
            if (r2 == 0) goto L_0x012a
            android.view.View r0 = X.C86644Kx.A0G(r2)
        L_0x012a:
            r3.A02 = r0
            if (r0 == 0) goto L_0x0132
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
        L_0x0132:
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams"
            X.C162457s7.A0K(r1, r0)
            r3.A03 = r1
            android.view.View r0 = r3.A02
            if (r0 == 0) goto L_0x0148
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            if (r1 == 0) goto L_0x0148
            r0 = 23
            X.AnonymousClass6BG.A00(r1, r3, r0)
        L_0x0148:
            X.0XY r11 = X.AnonymousClass0XY.A01
            return r11
        L_0x014b:
            java.lang.Object r7 = r9.A00
            X.0eF r7 = (X.C08310eF) r7
            android.widget.FrameLayout$LayoutParams r6 = X.C86664Kz.A0r(r10)
            r1 = 7
            X.0Uh r0 = r11.A00
            X.0XU r0 = r0.A0C(r1)
            int r5 = r0.A00
            int r4 = r6.leftMargin
            android.content.res.Resources r3 = X.C08310eF.A09(r7)
            java.lang.String r2 = "dimen"
            java.lang.String r1 = "android"
            java.lang.String r0 = "status_bar_height"
            int r1 = r3.getIdentifier(r0, r2, r1)
            if (r1 <= 0) goto L_0x017f
            android.content.res.Resources r0 = X.C08310eF.A09(r7)
            int r1 = r0.getDimensionPixelSize(r1)
        L_0x0176:
            int r0 = r6.rightMargin
            r6.setMargins(r4, r1, r0, r5)
            r10.setLayoutParams(r6)
            return r11
        L_0x017f:
            r1 = 25
            goto L_0x0176
        L_0x0182:
            java.lang.Object r7 = r9.A00
            com.whatsapp.mediacomposer.MediaComposerActivity r7 = (com.whatsapp.mediacomposer.MediaComposerActivity) r7
            X.0Uh r4 = r11.A00
            X.0UQ r0 = r4.A05()
            if (r0 == 0) goto L_0x01cf
            int r8 = r0.A04()
        L_0x0192:
            android.graphics.Rect r6 = r7.A1k
            r0 = 7
            X.0XU r0 = r4.A0C(r0)
            int r3 = r0.A01
            int r0 = r7.A03
            r2 = 0
            if (r8 <= r0) goto L_0x01a2
            int r2 = r8 - r0
        L_0x01a2:
            r0 = 7
            X.0XU r0 = r4.A0C(r0)
            int r1 = r0.A02
            r0 = 7
            X.0XU r0 = r4.A0C(r0)
            int r0 = r0.A00
            r6.set(r3, r2, r1, r0)
            java.util.Iterator r2 = X.C89654ea.A4M(r7)
        L_0x01b7:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x01d7
            X.0eF r1 = X.AnonymousClass4L0.A0D(r2)
            boolean r0 = r1 instanceof com.whatsapp.mediacomposer.ImageComposerFragment
            if (r0 != 0) goto L_0x01c9
            boolean r0 = r1 instanceof com.whatsapp.mediacomposer.MediaComposerFragment
            if (r0 == 0) goto L_0x01b7
        L_0x01c9:
            com.whatsapp.mediacomposer.MediaComposerFragment r1 = (com.whatsapp.mediacomposer.MediaComposerFragment) r1
            r1.A1P(r6)
            goto L_0x01b7
        L_0x01cf:
            r0 = 7
            X.0XU r0 = r4.A0C(r0)
            int r8 = r0.A03
            goto L_0x0192
        L_0x01d7:
            int r0 = r7.A03
            if (r8 <= r0) goto L_0x020f
            r4 = r8
        L_0x01dc:
            android.view.View r3 = r7.A05
            int r2 = r6.left
            int r1 = r6.right
            int r0 = r6.bottom
            r3.setPadding(r2, r4, r1, r0)
            X.5Uj r5 = r7.A10
            int r4 = r6.left
            int r3 = r7.A03
            r0 = -1
            if (r3 == r0) goto L_0x01f4
            int r3 = java.lang.Math.max(r8, r3)
        L_0x01f4:
            int r2 = r6.right
            int r1 = r6.bottom
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r4, r3, r2, r1)
            r5.A03 = r0
            X.5nY r3 = r7.A0w
            int r0 = r6.left
            int r2 = -r0
            int r0 = r6.right
            int r1 = -r0
            X.7Hu r0 = r3.A05
            com.whatsapp.mediacomposer.bottombar.filterswipe.FilterSwipeView r0 = r0.A01
            X.C86624Kv.A0y(r0, r2, r1)
            return r11
        L_0x020f:
            android.widget.FrameLayout r0 = r7.A07
            android.view.ViewGroup$MarginLayoutParams r0 = X.AnonymousClass001.A0T(r0)
            int r4 = r0.topMargin
            goto L_0x01dc
        L_0x0218:
            java.lang.Object r6 = r9.A00
            com.whatsapp.mediaview.MediaViewBaseFragment r6 = (com.whatsapp.mediaview.MediaViewBaseFragment) r6
            r0 = 0
            X.C162457s7.A0J(r11, r0)
            r0 = 7
            X.0Uh r2 = r11.A00
            X.0XU r1 = r2.A0D(r0)
            X.C162457s7.A0D(r1)
            r0 = 128(0x80, float:1.794E-43)
            X.0XU r0 = r2.A0D(r0)
            X.C162457s7.A0D(r0)
            X.5NH r2 = new X.5NH
            r2.<init>(r1, r0)
            r6.A0C = r2
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "mediaview/onWindowInsets: bars="
            r1.append(r0)
            X.0XU r0 = r2.A01
            r1.append(r0)
            java.lang.String r0 = "; cutout="
            r1.append(r0)
            X.5NH r0 = r6.A0C
            X.0XU r0 = r0.A00
            X.C18260x0.A0m(r0, r1)
            android.view.ViewGroup r0 = r6.A03
            if (r0 == 0) goto L_0x02ca
            X.5NH r0 = r6.A0C
            if (r0 == 0) goto L_0x02ca
            X.0XU r0 = r0.A01
            r5 = 0
            int r1 = r0.A01
            int r0 = r0.A02
            X.0XU r4 = X.AnonymousClass0XU.A00(r1, r5, r0, r5)
            X.C162457s7.A0D(r4)
            X.5NH r0 = r6.A0C
            X.0XU r0 = r0.A00()
            int r1 = r0.A01
            int r0 = r0.A02
            X.0XU r1 = X.AnonymousClass0XU.A00(r1, r5, r0, r5)
            X.C162457s7.A0D(r1)
            X.5NH r0 = r6.A0C
            X.0XU r2 = r0.A00
            X.0XU r0 = r0.A01
            X.0XU r0 = X.AnonymousClass0XU.A02(r2, r0)
            X.C162457s7.A0D(r0)
            int r0 = r0.A03
            X.0XU r7 = X.AnonymousClass0XU.A00(r5, r0, r5, r5)
            X.C162457s7.A0D(r7)
            android.view.ViewGroup r3 = r6.A03
            X.C162457s7.A0J(r3, r5)
            android.view.ViewGroup$MarginLayoutParams r2 = X.C86634Kw.A0O(r3)
            int r0 = r4.A01
            r2.leftMargin = r0
            int r0 = r4.A03
            r2.topMargin = r0
            int r0 = r4.A02
            r2.rightMargin = r0
            int r0 = r4.A00
            r2.bottomMargin = r0
            r3.setLayoutParams(r2)
            android.view.ViewGroup r5 = r6.A03
            int r4 = r1.A01
            int r0 = r7.A01
            int r4 = r4 + r0
            int r3 = r1.A03
            int r0 = r7.A03
            int r3 = r3 + r0
            int r2 = r1.A02
            int r0 = r7.A02
            int r2 = r2 + r0
            int r1 = r1.A00
            int r0 = r7.A00
            int r1 = r1 + r0
            X.0XU r0 = X.AnonymousClass0XU.A00(r4, r3, r2, r1)
            X.C106235Yd.A00(r5, r0)
        L_0x02ca:
            com.whatsapp.components.InsetsDrawingView r1 = r6.A07
            if (r1 == 0) goto L_0x02ed
            X.5NH r0 = r6.A0C
            if (r0 == 0) goto L_0x02ed
            r0 = 2131101869(0x7f0608ad, float:1.781616E38)
            r1.setColor(r0)
            com.whatsapp.components.InsetsDrawingView r3 = r6.A07
            X.5NH r0 = r6.A0C
            X.0XU r0 = r0.A01
            r2 = 0
            int r1 = r0.A01
            int r0 = r0.A02
            X.0XU r0 = X.AnonymousClass0XU.A00(r1, r2, r0, r2)
            X.C162457s7.A0D(r0)
            X.C106235Yd.A00(r3, r0)
        L_0x02ed:
            X.6ir r0 = r6.A09
            if (r0 == 0) goto L_0x032e
            r1 = 0
        L_0x02f2:
            X.6ir r0 = r6.A09
            int r0 = r0.getChildCount()
            if (r1 >= r0) goto L_0x032e
            X.6ir r0 = r6.A09
            android.view.View r0 = r0.getChildAt(r1)
            r6.A1T(r0)
            int r1 = r1 + 1
            goto L_0x02f2
        L_0x0306:
            java.lang.Object r2 = r9.A00
            X.4SH r2 = (X.AnonymousClass4SH) r2
            X.4aI r1 = r2.A05
            if (r1 == 0) goto L_0x0315
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r2.A04
            java.util.ArrayList r0 = r0.A0u
            r0.remove(r1)
        L_0x0315:
            if (r11 == 0) goto L_0x032e
            android.widget.FrameLayout r0 = r2.A00
            X.4aI r1 = new X.4aI
            r1.<init>(r0, r11)
            r2.A05 = r1
            android.view.Window r0 = r2.getWindow()
            r1.A05(r0)
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = r2.A04
            X.4aI r0 = r2.A05
            r1.A0Z(r0)
        L_0x032e:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6B8.BMX(android.view.View, X.0XY):X.0XY");
    }
}
