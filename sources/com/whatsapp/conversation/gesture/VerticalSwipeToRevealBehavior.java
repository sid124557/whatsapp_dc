package com.whatsapp.conversation.gesture;

import X.C147297Do;
import X.C182318oD;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.whatsapp.gesture.VerticalSwipeDownBehavior;

public class VerticalSwipeToRevealBehavior extends VerticalSwipeDownBehavior {
    public float A00 = Float.MIN_VALUE;
    public C182318oD A01;
    public final int A02;
    public final int A03;
    public final View A04;
    public final FrameLayout A05;
    public final LinearLayout A06;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002e, code lost:
        if (r7 < 0.0f) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void A00(com.whatsapp.conversation.gesture.VerticalSwipeToRevealBehavior r6, float r7, int r8) {
        /*
            android.widget.FrameLayout r5 = r6.A05
            if (r5 == 0) goto L_0x0042
            android.view.View r4 = r6.A04
            if (r4 == 0) goto L_0x0042
            android.view.ViewGroup$LayoutParams r3 = r5.getLayoutParams()
            r1 = 1
            r2 = 0
            if (r8 == r1) goto L_0x0046
            X.8oD r0 = r6.A01
            r0.BqW(r1)
            float r0 = r6.A00
            float r7 = r7 - r0
            int r1 = (int) r7
            int r0 = r6.A03
            if (r1 < r0) goto L_0x0043
            int r0 = r6.A02
            float r7 = (float) r0
            android.widget.LinearLayout r0 = r6.A06
            if (r0 == 0) goto L_0x002c
            X.02f r1 = X.AnonymousClass001.A0W(r0)
            r0 = 0
            r1.A01(r0)
        L_0x002c:
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0044
        L_0x0030:
            int r0 = r6.A02
            float r1 = (float) r0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0038
            r2 = r1
        L_0x0038:
            int r0 = (int) r2
            r3.height = r0
            r5.setLayoutParams(r3)
            float r2 = r2 - r1
            r4.setTranslationY(r2)
        L_0x0042:
            return
        L_0x0043:
            r7 = 0
        L_0x0044:
            r2 = r7
            goto L_0x0030
        L_0x0046:
            float r0 = r6.A00
            float r7 = r7 - r0
            goto L_0x002c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.gesture.VerticalSwipeToRevealBehavior.A00(com.whatsapp.conversation.gesture.VerticalSwipeToRevealBehavior, float, int):void");
    }

    public VerticalSwipeToRevealBehavior(Context context, View view, FrameLayout frameLayout, LinearLayout linearLayout, C182318oD r6, int i) {
        super(context);
        this.A04 = view;
        this.A06 = linearLayout;
        this.A05 = frameLayout;
        this.A02 = i;
        this.A01 = r6;
        this.A03 = i / 2;
        this.A03 = new C147297Do(this);
    }
}
