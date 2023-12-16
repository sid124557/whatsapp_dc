package X;

import android.view.ViewTreeObserver;

/* renamed from: X.4JP  reason: invalid class name */
public class AnonymousClass4JP implements ViewTreeObserver.OnGlobalLayoutListener {
    public Object A00;
    public final int A01;

    public AnonymousClass4JP(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:82:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x017d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onGlobalLayout() {
        /*
            r12 = this;
            int r0 = r12.A01
            switch(r0) {
                case 0: goto L_0x0085;
                case 1: goto L_0x0030;
                case 2: goto L_0x005f;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r3 = r12.A00
            com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity r3 = (com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity) r3
            androidx.recyclerview.widget.RecyclerView r0 = r3.A0B
            int r2 = r0.getWidth()
            androidx.recyclerview.widget.RecyclerView r0 = r3.A0B
            android.content.res.Resources r1 = X.C18290x4.A0G(r0)
            r0 = 2131168376(0x7f070c78, float:1.7951052E38)
            int r0 = r1.getDimensionPixelSize(r0)
            int r2 = r2 / r0
            int r0 = r3.A00
            if (r0 == r2) goto L_0x002f
            androidx.recyclerview.widget.GridLayoutManager r0 = r3.A0A
            r0.A1o(r2)
            r3.A00 = r2
            X.121 r0 = r3.A0Q
            if (r0 == 0) goto L_0x002f
            r0.A05()
        L_0x002f:
            return
        L_0x0030:
            java.lang.Object r0 = r12.A00
            com.whatsapp.extensions.webview.view.FlowsWebViewFragment r0 = (com.whatsapp.extensions.webview.view.FlowsWebViewFragment) r0
            X.0yl r4 = r0.A00
            if (r4 == 0) goto L_0x002f
            X.5Wv r0 = r0.A05
            if (r0 == 0) goto L_0x00c5
            boolean r0 = X.C105895Wv.A00(r4)
            r3 = 0
            if (r0 == 0) goto L_0x005c
            java.lang.String r2 = "didShow"
        L_0x0045:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "window.onkeyboardStateChange({'change': '"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = "'})"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            r4.evaluateJavascript(r0, r3)
            return
        L_0x005c:
            java.lang.String r2 = "hidden"
            goto L_0x0045
        L_0x005f:
            r0 = 2
            int[] r1 = new int[r0]
            java.lang.Object r4 = r12.A00
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView r4 = (com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView) r4
            android.view.View r0 = r4.A02
            if (r0 != 0) goto L_0x0072
            java.lang.String r0 = "titleBar"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0072:
            r0.getLocationOnScreen(r1)
            r0 = 0
            r0 = r1[r0]
            if (r0 == 0) goto L_0x002f
            com.whatsapp.WaTextView r0 = r4.A0B
            if (r0 != 0) goto L_0x00cc
            java.lang.String r0 = "mediaQualityToolTip"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0085:
            java.lang.Object r4 = r12.A00
            X.1Np r4 = (X.AnonymousClass1Np) r4
            android.view.View r0 = r4.A02
            boolean r3 = X.C105895Wv.A00(r0)
            android.content.res.Configuration r0 = X.AnonymousClass001.A0M(r4)
            int r1 = r0.orientation
            r2 = 1
            r0 = 2
            boolean r0 = X.AnonymousClass000.A1U(r1, r0)
            X.0R8 r1 = r4.getSupportActionBar()
            if (r3 == 0) goto L_0x00ba
            if (r0 == 0) goto L_0x00ba
            X.6Z3 r0 = r4.A05
            r0.A04(r2)
            if (r1 == 0) goto L_0x00ad
            r1.A06()
        L_0x00ad:
            int r0 = r4.A00
            if (r0 != 0) goto L_0x00b7
            com.whatsapp.WaEditText r0 = r4.A07
        L_0x00b3:
            r0.requestFocus()
            return
        L_0x00b7:
            com.whatsapp.WaEditText r0 = r4.A08
            goto L_0x00b3
        L_0x00ba:
            X.6Z3 r0 = r4.A05
            r0.A05(r2)
            if (r1 == 0) goto L_0x00ad
            r1.A07()
            goto L_0x00ad
        L_0x00c5:
            java.lang.String r0 = "imeUtils"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x00cc:
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            if (r0 == 0) goto L_0x00d5
            r0.removeOnGlobalLayoutListener(r12)
        L_0x00d5:
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131166343(0x7f070487, float:1.7946929E38)
            int r11 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131168459(0x7f070ccb, float:1.795122E38)
            int r10 = r1.getDimensionPixelSize(r0)
            r9 = 2
            int[] r7 = new int[r9]
            android.widget.ImageView r0 = r4.A05
            if (r0 == 0) goto L_0x00f5
            r0.getLocationOnScreen(r7)
        L_0x00f5:
            android.widget.ImageView r0 = r4.A05
            r3 = 0
            if (r0 == 0) goto L_0x0109
            int r8 = r0.getMeasuredWidth()
        L_0x00fe:
            com.whatsapp.WaTextView r0 = r4.A0B
            java.lang.String r6 = "mediaQualityToolTip"
            if (r0 != 0) goto L_0x010b
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r6)
            throw r0
        L_0x0109:
            r8 = 0
            goto L_0x00fe
        L_0x010b:
            int r5 = r0.getMeasuredWidth()
            android.content.res.Resources r0 = r4.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r2 = r0.widthPixels
            int r0 = r11 * 2
            int r2 = r2 - r0
            int r0 = r10 * 2
            int r2 = r2 - r0
            r1 = r7[r3]
            int r8 = r8 / r9
            int r1 = r1 + r8
            int r0 = r5 / 2
            int r1 = r1 - r0
            int r1 = r1 - r11
            int r1 = r1 - r10
            if (r1 >= 0) goto L_0x0149
            com.whatsapp.WaTextView r0 = r4.A0B
            if (r0 != 0) goto L_0x0133
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r6)
            throw r0
        L_0x0133:
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            r0 = r7[r3]
            int r0 = r0 + r8
            int r0 = r0 - r11
            int r0 = r0 - r10
            int r0 = r0 * 2
            r1.width = r0
            com.whatsapp.WaTextView r0 = r4.A0B
            if (r0 != 0) goto L_0x016f
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r6)
            throw r0
        L_0x0149:
            int r5 = r5 + r1
            if (r5 <= r2) goto L_0x0173
            com.whatsapp.WaTextView r0 = r4.A0B
            if (r0 != 0) goto L_0x0155
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r6)
            throw r0
        L_0x0155:
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            r0 = r7[r3]
            int r0 = r0 - r11
            int r0 = r0 - r10
            int r0 = r2 - r0
            int r0 = r0 - r8
            int r0 = r0 * 2
            r1.width = r0
            int r3 = r2 - r0
            com.whatsapp.WaTextView r0 = r4.A0B
            if (r0 != 0) goto L_0x016f
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r6)
            throw r0
        L_0x016f:
            r0.setLayoutParams(r1)
            goto L_0x0174
        L_0x0173:
            r3 = r1
        L_0x0174:
            com.whatsapp.WaTextView r1 = r4.A0B
            if (r1 != 0) goto L_0x017d
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r6)
            throw r0
        L_0x017d:
            float r0 = (float) r3
            r1.setTranslationX(r0)
            r1.requestLayout()
            r0 = 38
            X.C18290x4.A1F(r1, r4, r0)
            android.os.Handler r3 = new android.os.Handler
            r3.<init>()
            r0 = 7
            X.3Zn r2 = new X.3Zn
            r2.<init>(r4, r0)
            r0 = 100
            r3.postDelayed(r2, r0)
            X.33p r0 = r4.getWaSharedPreferences()
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r0)
            java.lang.String r0 = "media_quality_tooltip_shown"
            X.C18270x1.A0f(r1, r0)
            android.content.Context r1 = r4.getContext()
            r0 = 2131890060(0x7f120f8c, float:1.9414801E38)
            java.lang.String r2 = X.C18290x4.A0l(r1, r0)
            android.content.Context r1 = r4.getContext()
            X.33i r0 = r4.getSystemServices()
            X.C107295b4.A00(r1, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4JP.onGlobalLayout():void");
    }
}
