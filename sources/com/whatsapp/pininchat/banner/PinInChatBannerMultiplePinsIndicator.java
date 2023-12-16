package com.whatsapp.pininchat.banner;

import X.AnonymousClass001;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import java.util.ArrayList;

public final class PinInChatBannerMultiplePinsIndicator extends LinearLayout {
    public final ArrayList A00 = AnonymousClass001.A0s();

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setupIndicator(X.C104615Rr r8) {
        /*
            r7 = this;
            r0 = 0
            X.C162457s7.A0J(r8, r0)
            r7.removeAllViews()
            int r6 = r8.A01
            r0 = 1
            if (r6 <= r0) goto L_0x007c
            r5 = 0
        L_0x000d:
            java.util.ArrayList r4 = r7.A00
            if (r5 < 0) goto L_0x003e
            r0 = 0
            X.C162457s7.A0J(r4, r0)
            int r0 = X.C86664Kz.A0M(r4)
            if (r5 > r0) goto L_0x003e
            java.lang.Object r3 = r4.get(r5)
        L_0x001f:
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            int r1 = r8.A00
            r0 = 2131101263(0x7f06064f, float:1.781493E38)
            if (r5 != r1) goto L_0x002b
            r0 = 2131102203(0x7f0609fb, float:1.7816837E38)
        L_0x002b:
            int r0 = X.C86624Kv.A02(r3, r0)
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r3.setImageTintList(r0)
            r7.addView(r3)
            int r5 = r5 + 1
            if (r5 >= r6) goto L_0x007c
            goto L_0x000d
        L_0x003e:
            android.content.res.Resources r1 = X.C18290x4.A0G(r7)
            r0 = 2131167823(0x7f070a4f, float:1.794993E38)
            int r1 = X.AnonymousClass4L0.A01(r1, r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            r3 = 0
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r2.<init>(r1, r3, r0)
            if (r5 <= 0) goto L_0x0061
            android.content.res.Resources r1 = X.C18290x4.A0G(r7)
            r0 = 2131167822(0x7f070a4e, float:1.7949928E38)
            int r0 = X.AnonymousClass4L0.A01(r1, r0)
            r2.setMargins(r3, r0, r3, r3)
        L_0x0061:
            android.content.Context r0 = r7.getContext()
            com.whatsapp.WaImageView r3 = new com.whatsapp.WaImageView
            r3.<init>(r0)
            r3.setLayoutParams(r2)
            r0 = 2131234224(0x7f080db0, float:1.8084608E38)
            r3.setImageResource(r0)
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.FIT_XY
            r3.setScaleType(r0)
            r4.add(r3)
            goto L_0x001f
        L_0x007c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.pininchat.banner.PinInChatBannerMultiplePinsIndicator.setupIndicator(X.5Rr):void");
    }

    public PinInChatBannerMultiplePinsIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public PinInChatBannerMultiplePinsIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PinInChatBannerMultiplePinsIndicator(Context context) {
        super(context, (AttributeSet) null);
    }
}
