package X;

import android.view.View;

/* renamed from: X.69p  reason: invalid class name and case insensitive filesystem */
public class C1237469p implements View.OnLayoutChangeListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public C1237469p(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayoutChange(android.view.View r22, int r23, int r24, int r25, int r26, int r27, int r28, int r29, int r30) {
        /*
            r21 = this;
            r0 = r21
            int r2 = r0.A02
            r1 = r22
            switch(r2) {
                case 0: goto L_0x018c;
                case 1: goto L_0x020b;
                case 2: goto L_0x00f8;
                case 3: goto L_0x011c;
                default: goto L_0x0009;
            }
        L_0x0009:
            r3 = 0
            X.C162457s7.A0J(r1, r3)
            java.lang.Object r7 = r0.A01
            X.51j r7 = (X.C985651j) r7
            java.lang.Object r2 = r0.A00
            X.5i0[] r2 = (X.C111385i0[]) r2
            r2 = r2[r3]
            X.C162457s7.A0A(r2)
            java.lang.String r6 = r2.A05
            boolean r9 = r2.A07
            X.5nM r4 = r7.A08
            X.1mW r5 = r7.A0C
            X.4uZ r2 = r5.A0n()
            java.util.Set r2 = r4.BBH(r2, r5, r6)
            if (r2 == 0) goto L_0x003a
            X.5Sn r2 = r7.A0D
            r2.A01()
            X.5Pj r2 = r7.A05
            r2.A01()
        L_0x0036:
            r1.removeOnLayoutChangeListener(r0)
        L_0x0039:
            return
        L_0x003a:
            X.4QG r2 = r7.A0E
            androidx.cardview.widget.CardView r4 = r2.getWebPagePreviewContainer()
            r7.A01 = r4
            r2 = 3
            if (r9 == 0) goto L_0x0046
            r2 = 2
        L_0x0046:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r7.A03 = r2
            r4.setVisibility(r3)
            r2 = 2131434884(0x7f0b1d84, float:1.8491595E38)
            android.view.View r8 = r4.findViewById(r2)
            r2 = 2131430996(0x7f0b0e54, float:1.8483709E38)
            android.view.View r10 = X.C18280x3.A0E(r8, r2)
            com.whatsapp.webpagepreview.WebPagePreviewView r10 = (com.whatsapp.webpagepreview.WebPagePreviewView) r10
            r2 = 2131430994(0x7f0b0e52, float:1.8483705E38)
            android.view.View r12 = X.C18280x3.A0E(r10, r2)
            X.5Zz r4 = r7.A0B
            java.lang.String r2 = r5.A1w()
            java.lang.String r4 = r4.A03(r2)
            boolean r2 = X.C162457s7.A0P(r6, r4)
            if (r2 == 0) goto L_0x00e7
            r7.A04 = r6
            X.C162457s7.A0H(r8)
            X.5fE r11 = new X.5fE
            r13 = r8
            r14 = r7
            r15 = r10
            r16 = r9
            r11.<init>(r12, r13, r14, r15, r16)
            boolean r2 = X.AnonymousClass5VE.A01(r4)
            if (r2 != 0) goto L_0x00e4
            X.36Y r2 = r7.A09
            boolean r2 = r2.A0I(r4)
            if (r2 != 0) goto L_0x00e4
            com.whatsapp.WaTextView r2 = r10.A0N
        L_0x0095:
            r2.addOnLayoutChangeListener(r11)
            X.2rN r2 = r7.A0F
            boolean r20 = r2.A01()
            com.whatsapp.components.button.ThumbnailButton r4 = r10.A0Q
            r2 = 0
            r4.setImageDrawable(r2)
            com.whatsapp.components.button.ThumbnailButton r4 = r10.A0Q
            r2 = 8
            X.C86614Ku.A1G(r4, r10, r2)
            X.5Zz r4 = r10.A0V
            java.lang.String r2 = r5.A1w()
            java.lang.String r15 = r4.A03(r2)
            java.lang.String r14 = r5.A07
            boolean r2 = android.text.TextUtils.isEmpty(r14)
            if (r2 == 0) goto L_0x00be
            r14 = r15
        L_0x00be:
            X.5nM r4 = r10.A0S
            com.whatsapp.jid.UserJid r2 = r5.A0o()
            java.util.Set r4 = r4.BBH(r2, r5, r6)
            java.lang.String r12 = r5.A06
            java.lang.String r13 = r5.A04
            int r2 = r5.A00
            java.lang.Integer r11 = java.lang.Integer.valueOf(r2)
            boolean r18 = X.AnonymousClass000.A1W(r4)
            r16 = 0
            r17 = -1
            r19 = r3
            r10.A0J(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r10.setVisibility(r3)
            goto L_0x0036
        L_0x00e4:
            com.whatsapp.WaTextView r2 = r10.A0L
            goto L_0x0095
        L_0x00e7:
            X.5Sn r2 = r7.A0D
            r2.A01()
            X.5Pj r2 = r7.A05
            r2.A01()
            r2 = 8
            r10.setVisibility(r2)
            goto L_0x0036
        L_0x00f8:
            java.lang.Object r3 = r0.A00
            com.whatsapp.conversation.EditMessageActivity r3 = (com.whatsapp.conversation.EditMessageActivity) r3
            java.lang.Object r4 = r0.A01
            android.content.res.Configuration r4 = (android.content.res.Configuration) r4
            android.view.View r0 = r3.A00
            float r2 = r0.getAlpha()
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0039
            int r5 = r30 - r28
            int r0 = r4.keyboard
            r2 = 1
            if (r0 != r2) goto L_0x0113
            r2 = 0
        L_0x0113:
            int r0 = r1.getHeight()
            if (r0 < r5) goto L_0x02c0
            if (r2 != 0) goto L_0x02c0
            return
        L_0x011c:
            java.lang.Object r5 = r0.A00
            X.5l7 r5 = (X.C113245l7) r5
            com.whatsapp.conversation.ConversationListView r6 = r5.A2f
            if (r6 == 0) goto L_0x0039
            X.4fR r0 = r5.A2Z
            if (r0 == 0) goto L_0x0039
            int r4 = r6.getPaddingLeft()
            int r3 = r5.A04
            X.4fR r1 = r5.A2Z
            boolean r0 = r1 instanceof X.C92134m9
            if (r0 == 0) goto L_0x018a
            X.4m9 r1 = (X.C92134m9) r1
            X.66R r0 = r1.A04
            android.view.View r0 = X.C86644Kx.A0H(r0)
            if (r0 == 0) goto L_0x018a
            int r2 = r0.getHeight()
            X.07r r0 = r1.A0U
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131165418(0x7f0700ea, float:1.7945053E38)
            int r0 = X.C86654Ky.A02(r1, r0, r2)
        L_0x014f:
            int r3 = r3 + r0
            com.whatsapp.conversation.ConversationListView r0 = r5.A2f
            int r1 = r0.getPaddingRight()
            com.whatsapp.conversation.ConversationListView r0 = r5.A2f
            X.C86634Kw.A1B(r0, r6, r4, r3, r1)
            android.view.Window r0 = X.C113245l7.A03(r5)
            android.view.View r4 = X.C86634Kw.A0N(r0)
            X.560 r4 = (X.AnonymousClass560) r4
            if (r4 == 0) goto L_0x0039
            int r3 = r4.getPaddingLeft()
            int r2 = r5.A04
            int r1 = r4.getPaddingRight()
            android.view.View r0 = r5.A0D
            int r0 = r0.getHeight()
            r4.setPadding(r3, r2, r1, r0)
            r0 = 0
            r4.A0A(r0)
            com.whatsapp.KeyboardPopupLayout r0 = r5.A1a
            r4.A0I = r0
            X.8Jy r0 = new X.8Jy
            r0.<init>(r5)
            r4.A0L = r0
            return
        L_0x018a:
            r0 = 0
            goto L_0x014f
        L_0x018c:
            java.lang.Object r5 = r0.A00
            com.whatsapp.calling.callgrid.view.FocusViewContainer r5 = (com.whatsapp.calling.callgrid.view.FocusViewContainer) r5
            android.graphics.Rect r6 = r5.A00
            r1.getGlobalVisibleRect(r6)
            java.lang.Object r2 = r0.A01
            android.graphics.Rect r2 = (android.graphics.Rect) r2
            int r4 = r2.top
            int r1 = r6.top
            int r4 = r4 - r1
            int r7 = r2.left
            int r1 = r6.left
            int r7 = r7 - r1
            int r1 = r2.width()
            float r3 = (float) r1
            int r1 = r6.width()
            float r1 = (float) r1
            float r3 = r3 / r1
            int r1 = r2.height()
            float r2 = (float) r1
            int r1 = r6.height()
            float r1 = (float) r1
            float r2 = r2 / r1
            com.whatsapp.WaTextView r1 = r5.A03
            r6 = 0
            r1.setAlpha(r6)
            android.widget.LinearLayout r1 = r5.A02
            r1.setAlpha(r6)
            android.widget.FrameLayout r5 = r5.A01
            r5.setPivotX(r6)
            r5.setPivotY(r6)
            r5.setScaleX(r3)
            r5.setScaleY(r2)
            float r1 = (float) r7
            r5.setTranslationX(r1)
            float r1 = (float) r4
            r5.setTranslationY(r1)
            r1 = 1069547520(0x3fc00000, float:1.5)
            android.view.animation.DecelerateInterpolator r4 = new android.view.animation.DecelerateInterpolator
            r4.<init>(r1)
            android.view.ViewPropertyAnimator r3 = r5.animate()
            r1 = 250(0xfa, double:1.235E-321)
            android.view.ViewPropertyAnimator r2 = r3.setDuration(r1)
            r1 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r1 = X.C86634Kw.A0P(r2, r1)
            android.view.ViewPropertyAnimator r1 = r1.translationX(r6)
            android.view.ViewPropertyAnimator r3 = r1.translationY(r6)
            r2 = 9
            X.8zI r1 = new X.8zI
            r1.<init>(r0, r2)
            android.view.ViewPropertyAnimator r1 = r3.setListener(r1)
            r1.setInterpolator(r4)
            r5.removeOnLayoutChangeListener(r0)
            return
        L_0x020b:
            X.C86644Kx.A0v(r0, r1)
            java.lang.Object r9 = r0.A01
            com.whatsapp.components.AutoScrollView r9 = (com.whatsapp.components.AutoScrollView) r9
            android.view.View r1 = r9.getRootView()
            int r1 = X.AnonymousClass0YH.A01(r1)
            boolean r1 = X.AnonymousClass000.A1T(r1)
            r9.A03 = r1
            android.widget.HorizontalScrollView r4 = r9.A00
            r1 = r1 ^ 1
            X.AnonymousClass0YH.A06(r4, r1)
            com.whatsapp.WaTextView r6 = r9.A0A
            int r11 = r6.getWidth()
            int r1 = r9.A06
            int r11 = r11 + r1
            boolean r1 = r9.A03
            r12 = 1
            if (r1 == 0) goto L_0x0236
            r12 = -1
        L_0x0236:
            int r13 = -r12
            int r3 = r9.A04
            int r8 = r3 + r11
            int r7 = r9.A07
            int r8 = r8 + r7
            int r2 = r9.A05
            java.lang.String r5 = "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams"
            if (r8 >= r2) goto L_0x0279
            android.view.ViewGroup$LayoutParams r1 = r6.getLayoutParams()
            if (r1 == 0) goto L_0x02b6
            r1.width = r8
            r6.setLayoutParams(r1)
            android.view.ViewGroup$LayoutParams r2 = r4.getLayoutParams()
            if (r2 == 0) goto L_0x02b1
            r1 = -2
            r2.width = r1
            r4.setLayoutParams(r2)
            int r7 = r7 * r13
            float r1 = (float) r7
            r6.setTranslationX(r1)
            com.whatsapp.WaTextView r2 = r9.A0B
            r1 = 8
            r2.setVisibility(r1)
        L_0x0267:
            r2 = 43
            X.3Zi r1 = new X.3Zi
            r1.<init>(r9, r2)
            r4.post(r1)
            java.lang.Object r0 = r0.A00
            X.4GP r0 = (X.AnonymousClass4GP) r0
            r0.invoke()
            return
        L_0x0279:
            r1 = 1
            r9.A02 = r1
            android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
            if (r1 == 0) goto L_0x02bb
            r1.width = r2
            r4.setLayoutParams(r1)
            int r1 = r3 + r7
            int r1 = r1 * r13
            float r10 = (float) r1
            long r14 = r9.A08
            int r1 = r11 / r2
            long r1 = (long) r1
            long r14 = r14 * r1
            r6.setTranslationX(r10)
            com.whatsapp.WaTextView r5 = r9.A0B
            float r2 = r6.getTranslationX()
            int r1 = r11 * r13
            float r1 = (float) r1
            float r2 = r2 + r1
            r5.setTranslationX(r2)
            r9.A00(r10, r11, r12, r13, r14)
            if (r3 <= 0) goto L_0x0267
            r1 = 1
            r4.setHorizontalFadingEdgeEnabled(r1)
            r4.setFadingEdgeLength(r3)
            r4.requestLayout()
            goto L_0x0267
        L_0x02b1:
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r5)
            throw r0
        L_0x02b6:
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r5)
            throw r0
        L_0x02bb:
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r5)
            throw r0
        L_0x02c0:
            android.view.View r1 = r3.A00
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.setAlpha(r0)
            android.view.View r0 = r3.A00
            float r2 = X.C86664Kz.A02(r0)
            r0 = 0
            android.view.animation.TranslateAnimation r1 = new android.view.animation.TranslateAnimation
            r1.<init>(r0, r0, r2, r0)
            android.view.animation.Interpolator r0 = X.C100865Co.A00
            X.C86644Kx.A19(r1, r0)
            android.view.View r0 = r3.A00
            r0.startAnimation(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1237469p.onLayoutChange(android.view.View, int, int, int, int, int, int, int, int):void");
    }
}
