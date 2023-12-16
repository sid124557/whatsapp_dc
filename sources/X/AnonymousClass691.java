package X;

import android.view.View;

/* renamed from: X.691  reason: invalid class name */
public class AnonymousClass691 implements View.OnLayoutChangeListener {
    public Object A00;
    public final int A01;

    public AnonymousClass691(C113245l7 r1, int i) {
        this.A01 = i;
        if (2 - i != 0) {
            this.A00 = r1;
        } else {
            this.A00 = r1;
        }
    }

    public static void A00(View view, Object obj, int i) {
        view.addOnLayoutChangeListener(new AnonymousClass691(obj, i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: android.view.View} */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0091, code lost:
        r2 = r0.A08;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayoutChange(android.view.View r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, int r21) {
        /*
            r12 = this;
            r1 = r20
            r9 = r16
            int r0 = r12.A01
            r7 = r14
            r8 = r15
            r10 = r17
            switch(r0) {
                case 0: goto L_0x0020;
                case 1: goto L_0x008b;
                case 2: goto L_0x00b6;
                case 3: goto L_0x00d9;
                case 4: goto L_0x000d;
                case 5: goto L_0x029b;
                case 6: goto L_0x000d;
                case 7: goto L_0x02b1;
                case 8: goto L_0x0123;
                case 9: goto L_0x02c0;
                case 10: goto L_0x0197;
                case 11: goto L_0x0348;
                case 12: goto L_0x01c8;
                case 13: goto L_0x01e1;
                case 14: goto L_0x02d3;
                default: goto L_0x000d;
            }
        L_0x000d:
            X.C86644Kx.A0v(r12, r13)
            java.lang.Object r0 = r12.A00
            com.whatsapp.expressionstray.emoji.EmojiExpressionsFragment r0 = (com.whatsapp.expressionstray.emoji.EmojiExpressionsFragment) r0
            com.whatsapp.expressionstray.emoji.EmojiExpressionsViewModel r1 = X.C86634Kw.A0i(r0)
            int r0 = r0.A1U()
            r1.A0D(r0)
        L_0x001f:
            return
        L_0x0020:
            java.lang.Object r3 = r12.A00
            com.whatsapp.HomeActivity r3 = (com.whatsapp.HomeActivity) r3
            int r1 = r3.A7J()
            int r0 = r3.A7K()
            int r1 = r1 + r0
            android.animation.AnimatorSet r0 = r3.A0B
            if (r0 != 0) goto L_0x001f
            int r5 = r17 - r1
            int r1 = X.AnonymousClass001.A0A(r9, r14)
            int r4 = r17 - r15
            r2 = 500(0x1f4, float:7.0E-43)
            int r1 = r1 * r1
            int r0 = r4 * r4
            int r1 = r1 + r0
            double r0 = (double) r1
            double r8 = java.lang.Math.sqrt(r0)
            double r6 = (double) r4
            double r8 = r8 / r6
            double r1 = (double) r2
            double r1 = r1 / r8
            double r6 = r6 / r6
            double r6 = r6 * r1
            int r4 = (int) r6
            double r6 = (double) r4
            double r1 = r1 - r6
            int r0 = (int) r1
            android.util.Pair r8 = X.C86604Kt.A0C(r4, r0)
            android.animation.Animator r0 = r3.A0A
            if (r0 == 0) goto L_0x0059
            r0.cancel()
        L_0x0059:
            android.animation.Animator r0 = r3.A09
            if (r0 == 0) goto L_0x0060
            r0.cancel()
        L_0x0060:
            android.view.View r4 = r3.A7M()
            if (r4 == 0) goto L_0x0089
            r4.clearAnimation()
            int[] r2 = X.C86664Kz.A1Z()
            float r0 = r4.getTranslationY()
            int r1 = (int) r0
            r0 = 0
            r2[r0] = r1
            android.animation.ValueAnimator r1 = X.C86664Kz.A0Q(r2, r5)
            r0 = 3
            X.C100295Aj.A03(r1, r4, r0)
        L_0x007d:
            r3.A0A = r1
            if (r1 != 0) goto L_0x02e2
            android.view.ViewGroup r1 = r3.A0L
            android.view.View$OnLayoutChangeListener r0 = r3.A2J
            r1.removeOnLayoutChangeListener(r0)
            return
        L_0x0089:
            r1 = 0
            goto L_0x007d
        L_0x008b:
            java.lang.Object r0 = r12.A00
            com.whatsapp.calling.callgrid.view.CallGrid r0 = (com.whatsapp.calling.callgrid.view.CallGrid) r0
            if (r9 == r1) goto L_0x001f
            X.4j2 r2 = r0.A08
            androidx.recyclerview.widget.RecyclerView r0 = r2.A01
            if (r0 == 0) goto L_0x001f
            int r0 = r0.getWidth()
            if (r0 == 0) goto L_0x009f
            r2.A01 = r0
        L_0x009f:
            r1 = 0
        L_0x00a0:
            java.util.List r0 = r2.A0I
            int r0 = r0.size()
            if (r1 >= r0) goto L_0x0355
            androidx.recyclerview.widget.RecyclerView r0 = r2.A01
            android.view.View r0 = r0.getChildAt(r1)
            if (r0 == 0) goto L_0x00b3
            r2.A0S(r0)
        L_0x00b3:
            int r1 = r1 + 1
            goto L_0x00a0
        L_0x00b6:
            java.lang.Object r1 = r12.A00
            X.5l7 r1 = (X.C113245l7) r1
            int r2 = r21 - r19
            int r0 = r13.getHeight()
            if (r0 >= r2) goto L_0x00cf
            X.4Qj r0 = r1.A2A
            r1 = 1
        L_0x00c5:
            X.4V1 r0 = r0.getViewModel()
            r0.A04 = r1
            r0.A0D()
            return
        L_0x00cf:
            int r0 = r13.getHeight()
            if (r0 <= r2) goto L_0x001f
            X.4Qj r0 = r1.A2A
            r1 = 0
            goto L_0x00c5
        L_0x00d9:
            java.lang.Object r4 = r12.A00
            X.5l7 r4 = (X.C113245l7) r4
            android.widget.LinearLayout r0 = r4.A0k
            if (r0 == 0) goto L_0x001f
            r0.removeOnLayoutChangeListener(r12)
            java.util.HashSet r1 = X.AnonymousClass002.A0K()
            X.679 r0 = r4.A0Z()
            r1.add(r0)
            X.676 r0 = r4.A2z
            X.5R7 r0 = r0.getConversationRowCustomizers()
            X.679 r0 = r0.A04
            r1.add(r0)
            java.util.Iterator r3 = r1.iterator()
        L_0x00fe:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x001f
            java.lang.Object r2 = r3.next()
            X.679 r2 = (X.AnonymousClass679) r2
            X.4eZ r1 = X.C113245l7.A09(r4)
            android.widget.LinearLayout r0 = r4.A0k
            int r0 = r0.getWidth()
            r2.Brg(r1, r0)
            boolean r0 = r2.BoL()
            if (r0 == 0) goto L_0x00fe
            com.whatsapp.conversation.ConversationListView r0 = r4.A2f
            r0.A03()
            goto L_0x00fe
        L_0x0123:
            java.lang.Object r4 = r12.A00
            X.4LC r4 = (X.AnonymousClass4LC) r4
            android.view.Window r1 = r4.getWindow()
            if (r1 == 0) goto L_0x001f
            r7 = 2
            int[] r6 = new int[r7]
            android.view.ViewGroup r0 = r4.A03
            r0.getLocationOnScreen(r6)
            android.view.ViewGroup r0 = r4.A03
            android.widget.FrameLayout$LayoutParams r3 = X.C86664Kz.A0r(r0)
            android.view.WindowManager r0 = r1.getWindowManager()
            android.view.Display r0 = r0.getDefaultDisplay()
            int r1 = r0.getRotation()
            int r0 = r4.A00
            if (r0 == r1) goto L_0x001f
            r4.A00 = r1
            r2 = 0
            r3.rightMargin = r2
            r3.leftMargin = r2
            r3.topMargin = r2
            r3.bottomMargin = r2
            r5 = 1
            if (r1 == 0) goto L_0x018d
            if (r1 == r5) goto L_0x0183
            if (r1 == r7) goto L_0x0179
            r0 = 3
            if (r1 != r0) goto L_0x0169
            int[] r0 = r4.A0A
            r1 = r0[r2]
            r0 = r6[r2]
            int r1 = r1 - r0
            r3.rightMargin = r1
        L_0x0169:
            android.view.ViewGroup r0 = r4.A03
            r0.setLayoutParams(r3)
            int[] r1 = r4.A0A
            r0 = r1[r2]
            if (r0 != 0) goto L_0x0359
            r0 = r1[r5]
            if (r0 != 0) goto L_0x0359
            return
        L_0x0179:
            int[] r0 = r4.A0A
            r1 = r0[r5]
            r0 = r6[r5]
            int r1 = r1 - r0
            r3.bottomMargin = r1
            goto L_0x0169
        L_0x0183:
            int[] r0 = r4.A0A
            r1 = r0[r2]
            r0 = r6[r2]
            int r1 = r1 - r0
            r3.leftMargin = r1
            goto L_0x0169
        L_0x018d:
            int[] r0 = r4.A0A
            r1 = r0[r5]
            r0 = r6[r5]
            int r1 = r1 - r0
            r3.topMargin = r1
            goto L_0x0169
        L_0x0197:
            int r0 = r16 - r14
            int r1 = r20 - r18
            if (r0 == r1) goto L_0x001f
            java.lang.Object r4 = r12.A00
            X.4zC r4 = (X.C97764zC) r4
            int r0 = r4.getWidth()
            if (r0 <= 0) goto L_0x001f
            com.google.android.material.chip.ChipGroup r3 = r4.A02
            int r0 = r3.getChildCount()
            if (r0 <= 0) goto L_0x001f
            int r2 = r4.getMaxChipWidth()
            if (r2 <= 0) goto L_0x001f
            r1 = 0
        L_0x01b6:
            int r0 = r3.getChildCount()
            if (r1 >= r0) goto L_0x0370
            android.view.View r0 = r3.getChildAt(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setMaxWidth(r2)
            int r1 = r1 + 1
            goto L_0x01b6
        L_0x01c8:
            r13.removeOnLayoutChangeListener(r12)
            java.lang.Object r1 = r12.A00
            com.whatsapp.textstatuscomposer.TextStatusComposerActivity r1 = (com.whatsapp.textstatuscomposer.TextStatusComposerActivity) r1
            com.whatsapp.status.playback.widget.StatusEditText r0 = r1.A0j
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x001f
            com.whatsapp.status.playback.widget.StatusEditText r1 = r1.A0j
            int r0 = r0.length()
            r1.setCursorPosition(r0)
            return
        L_0x01e1:
            java.lang.Object r4 = r12.A00
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            int r9 = r16 - r14
            int r1 = r20 - r18
            if (r1 == r9) goto L_0x001f
            java.util.ArrayList r8 = X.AnonymousClass001.A0s()
            java.util.Iterator r5 = X.C86634Kw.A11(r4)
        L_0x01f3:
            boolean r0 = r5.hasNext()
            r3 = 0
            r6 = 1
            if (r0 == 0) goto L_0x020e
            java.lang.Object r2 = r5.next()
            r0 = r2
            android.view.View r0 = (android.view.View) r0
            int r1 = r0.getVisibility()
            r0 = 8
            if (r1 == r0) goto L_0x01f3
            r8.add(r2)
            goto L_0x01f3
        L_0x020e:
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x001f
            int r0 = r8.size()
            r7 = 0
            r5 = 0
            if (r0 != r6) goto L_0x025b
            java.lang.Object r1 = r8.get(r3)
            boolean r0 = r1 instanceof com.whatsapp.wds.components.actiontile.WDSActionTile
            if (r0 == 0) goto L_0x0227
            r7 = r1
            android.view.View r7 = (android.view.View) r7
        L_0x0227:
            android.content.res.Resources r0 = r4.getResources()
            X.C162457s7.A0D(r0)
            r1 = 120(0x78, float:1.68E-43)
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.densityDpi
            int r1 = r1 * r0
            double r2 = (double) r1
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r2 = r2 * r0
            r0 = 160(0xa0, float:2.24E-43)
            double r0 = (double) r0
            double r2 = r2 / r0
            int r2 = X.C1222663s.A00(r2)
            if (r7 == 0) goto L_0x001f
            android.view.ViewGroup$LayoutParams r1 = r7.getLayoutParams()
            boolean r0 = r1 instanceof android.widget.LinearLayout.LayoutParams
            if (r0 == 0) goto L_0x0259
            android.widget.LinearLayout$LayoutParams r1 = (android.widget.LinearLayout.LayoutParams) r1
            if (r1 == 0) goto L_0x0255
            r1.width = r2
            r1.weight = r5
        L_0x0255:
            r7.setLayoutParams(r1)
            return
        L_0x0259:
            r1 = 0
            goto L_0x0255
        L_0x025b:
            android.content.res.Resources r0 = r4.getResources()
            X.C162457s7.A0D(r0)
            float r2 = (float) r9
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.densityDpi
            float r1 = (float) r0
            r0 = 160(0xa0, float:2.24E-43)
            float r0 = (float) r0
            float r1 = r1 / r0
            float r2 = r2 / r1
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x001f
            r0 = 1134559232(0x43a00000, float:320.0)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0296
            r4.setOrientation(r6)
        L_0x027c:
            java.util.Iterator r2 = X.C86634Kw.A11(r4)
        L_0x0280:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x001f
            android.view.View r1 = X.C86654Ky.A0H(r2)
            boolean r0 = r1 instanceof com.whatsapp.wds.components.actiontile.WDSActionTile
            if (r0 == 0) goto L_0x0280
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            if (r1 == 0) goto L_0x0280
            r1.setOrientation(r3)
            goto L_0x0280
        L_0x0296:
            r4.setOrientation(r3)
            r3 = 1
            goto L_0x027c
        L_0x029b:
            X.C86644Kx.A0v(r12, r13)
            java.lang.Object r2 = r12.A00
            com.whatsapp.expressionstray.emoji.EmojiExpressionsFragment r2 = (com.whatsapp.expressionstray.emoji.EmojiExpressionsFragment) r2
            int r1 = r2.A1U()
            com.whatsapp.expressionstray.emoji.EmojiExpressionsViewModel r0 = X.C86634Kw.A0i(r2)
            r0.A0D(r1)
            r2.A1W(r1)
            return
        L_0x02b1:
            X.C86644Kx.A0v(r12, r13)
            java.lang.Object r1 = r12.A00
            com.whatsapp.expressionstray.emoji.EmojiExpressionsFragment r1 = (com.whatsapp.expressionstray.emoji.EmojiExpressionsFragment) r1
            int r0 = r1.A1U()
            r1.A1W(r0)
            return
        L_0x02c0:
            r13.removeOnLayoutChangeListener(r12)
            java.lang.Object r5 = r12.A00
            com.whatsapp.search.SearchFragment r5 = (com.whatsapp.search.SearchFragment) r5
            r0 = 26
            X.3br r6 = new X.3br
            r6.<init>((java.lang.Object) r5, (int) r0)
            r11 = 1
            r5.A1P(r6, r7, r8, r9, r10, r11)
            return
        L_0x02d3:
            X.C86644Kx.A0v(r12, r13)
            java.lang.Object r1 = r12.A00
            androidx.appcompat.widget.Toolbar r1 = (androidx.appcompat.widget.Toolbar) r1
            android.graphics.drawable.Drawable r0 = r1.getOverflowIcon()
            r1.setOverflowIcon(r0)
            return
        L_0x02e2:
            android.view.View r0 = r3.A0F
            int r1 = r0.getHeight()
            r4 = 1
            android.view.View r0 = r3.A0F
            r0.clearAnimation()
            int[] r0 = X.C86664Kz.A1Z()
            r5 = 0
            r0[r5] = r1
            android.animation.ValueAnimator r7 = X.C86664Kz.A0Q(r0, r10)
            r6 = -1
            r0 = -2
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r2.<init>(r6, r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r1.<init>(r6, r5, r0)
            X.5bw r0 = new X.5bw
            r0.<init>(r2, r1, r3, r4)
            r7.addUpdateListener(r0)
            r3.A09 = r7
            android.animation.AnimatorSet r2 = X.C86664Kz.A0O()
            r3.A0B = r2
            int r0 = X.C18290x4.A03(r8)
            long r0 = (long) r0
            r2.setStartDelay(r0)
            android.animation.AnimatorSet r2 = r3.A0B
            int r0 = X.C18280x3.A03(r8)
            long r0 = (long) r0
            r2.setDuration(r0)
            android.animation.AnimatorSet r1 = r3.A0B
            android.view.animation.Interpolator r0 = r3.A2K
            r1.setInterpolator(r0)
            android.animation.AnimatorSet r2 = r3.A0B
            r0 = 2
            android.animation.Animator[] r1 = new android.animation.Animator[r0]
            android.animation.Animator r0 = r3.A09
            r1[r5] = r0
            android.animation.Animator r0 = r3.A0A
            r1[r4] = r0
            r2.playTogether(r1)
            android.animation.AnimatorSet r0 = r3.A0B
            X.AnonymousClass67L.A01(r0, r12, r4)
            android.animation.AnimatorSet r0 = r3.A0B
            goto L_0x0351
        L_0x0348:
            X.C86644Kx.A0v(r12, r13)
            java.lang.Object r0 = r12.A00
            X.5Wl r0 = (X.C105795Wl) r0
            android.animation.AnimatorSet r0 = r0.A00
        L_0x0351:
            r0.start()
            return
        L_0x0355:
            r2.A05()
            return
        L_0x0359:
            android.view.View r0 = r4.A01
            android.view.ViewGroup$MarginLayoutParams r1 = X.AnonymousClass001.A0T(r0)
            int r0 = r3.topMargin
            r1.setMargins(r2, r0, r2, r2)
            com.whatsapp.mediacomposer.doodle.ColorPickerComponent r0 = r4.A06
            android.view.ViewGroup$MarginLayoutParams r1 = X.AnonymousClass001.A0T(r0)
            int r0 = r3.topMargin
            r1.setMargins(r2, r0, r2, r2)
            return
        L_0x0370:
            int r1 = r4.getWidth()
            r0 = 1073741824(0x40000000, float:2.0)
            X.C86604Kt.A1C(r4, r1, r0)
            r4.removeOnLayoutChangeListener(r12)
            int r0 = r4.getMeasuredHeight()
            int r0 = r0 + r15
            r4.layout(r14, r15, r9, r0)
            r4.addOnLayoutChangeListener(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass691.onLayoutChange(android.view.View, int, int, int, int, int, int, int, int):void");
    }

    public AnonymousClass691(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }
}
