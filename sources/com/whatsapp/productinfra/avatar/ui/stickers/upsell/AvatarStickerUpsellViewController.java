package com.whatsapp.productinfra.avatar.ui.stickers.upsell;

import X.AnonymousClass5ZD;
import X.C162457s7;
import X.C49652gs;
import X.C51932kc;
import X.C55862r2;
import X.C73853gB;
import android.app.Activity;
import android.view.View;

public final class AvatarStickerUpsellViewController {
    public final Activity A00;
    public final View A01;
    public final C49652gs A02;
    public final C51932kc A03;
    public final AnonymousClass5ZD A04;
    public final C55862r2 A05;
    public final C73853gB A06;

    public AvatarStickerUpsellViewController(Activity activity, View view, C49652gs r4, C51932kc r5, AnonymousClass5ZD r6, C55862r2 r7, C73853gB r8) {
        C162457s7.A0J(view, 1);
        this.A01 = view;
        this.A00 = activity;
        this.A05 = r7;
        this.A02 = r4;
        this.A03 = r5;
        this.A04 = r6;
        this.A06 = r8;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0077, code lost:
        if (X.C616131n.A00(r5, r1, r0) == r4) goto L_0x0079;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ac A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.C100505Be r10, X.C84814Du r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof X.C118725u0
            if (r0 == 0) goto L_0x00ad
            r5 = r11
            X.5u0 r5 = (X.C118725u0) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00ad
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r1 = r5.result
            X.218 r4 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r5.label
            r6 = 3
            r8 = 2
            r3 = 0
            r7 = 1
            if (r0 == 0) goto L_0x0052
            if (r0 == r7) goto L_0x004e
            if (r0 == r8) goto L_0x008a
            if (r0 != r6) goto L_0x00b9
            boolean r7 = r5.Z$0
            java.lang.Object r10 = r5.L$1
            java.lang.Object r2 = r5.L$0
            com.whatsapp.productinfra.avatar.ui.stickers.upsell.AvatarStickerUpsellViewController r2 = (com.whatsapp.productinfra.avatar.ui.stickers.upsell.AvatarStickerUpsellViewController) r2
            X.C57682u2.A01(r1)
        L_0x002f:
            if (r7 != 0) goto L_0x0040
            X.4yg r0 = X.C97544yg.A00
            boolean r0 = X.C162457s7.A0P(r10, r0)
            if (r0 == 0) goto L_0x0043
            r1 = 14
        L_0x003b:
            X.2r2 r0 = r2.A05
            r0.A03(r3, r1)
        L_0x0040:
            X.2wD r0 = X.C59022wD.A00
            return r0
        L_0x0043:
            X.4yh r0 = X.C97554yh.A00
            boolean r0 = X.C162457s7.A0P(r10, r0)
            if (r0 == 0) goto L_0x00b4
            r1 = 9
            goto L_0x003b
        L_0x004e:
            X.C57682u2.A01(r1)
            goto L_0x0040
        L_0x0052:
            X.C57682u2.A01(r1)
            X.2kc r0 = r9.A03
            X.66R r0 = r0.A01
            android.content.SharedPreferences r2 = X.C18310x6.A0F(r0)
            java.lang.String r0 = "pref_has_dismissed_sticker_upsell"
            r1 = 0
            boolean r0 = r2.getBoolean(r0, r1)
            if (r0 == 0) goto L_0x007a
            boolean r0 = r10 instanceof X.C97554yh
            if (r0 == 0) goto L_0x007a
            X.3gB r1 = r9.A06
            com.whatsapp.productinfra.avatar.ui.stickers.upsell.AvatarStickerUpsellViewController$updateViewVisibilityWithCoroutines$2 r0 = new com.whatsapp.productinfra.avatar.ui.stickers.upsell.AvatarStickerUpsellViewController$updateViewVisibilityWithCoroutines$2
            r0.<init>(r9, r3)
            r5.label = r7
            java.lang.Object r0 = X.C616131n.A00(r5, r1, r0)
            if (r0 != r4) goto L_0x0040
        L_0x0079:
            return r4
        L_0x007a:
            X.2gs r0 = r9.A02
            r5.L$0 = r9
            r5.L$1 = r10
            r5.label = r8
            java.lang.Object r1 = r0.A00(r5, r1)
            if (r1 == r4) goto L_0x0079
            r2 = r9
            goto L_0x0093
        L_0x008a:
            java.lang.Object r10 = r5.L$1
            java.lang.Object r2 = r5.L$0
            com.whatsapp.productinfra.avatar.ui.stickers.upsell.AvatarStickerUpsellViewController r2 = (com.whatsapp.productinfra.avatar.ui.stickers.upsell.AvatarStickerUpsellViewController) r2
            X.C57682u2.A01(r1)
        L_0x0093:
            boolean r7 = X.AnonymousClass001.A1Z(r1)
            X.3gB r1 = r2.A06
            com.whatsapp.productinfra.avatar.ui.stickers.upsell.AvatarStickerUpsellViewController$updateViewVisibilityWithCoroutines$3 r0 = new com.whatsapp.productinfra.avatar.ui.stickers.upsell.AvatarStickerUpsellViewController$updateViewVisibilityWithCoroutines$3
            r0.<init>(r2, r3, r7)
            r5.L$0 = r2
            r5.L$1 = r10
            r5.Z$0 = r7
            r5.label = r6
            java.lang.Object r0 = X.C616131n.A00(r5, r1, r0)
            if (r0 != r4) goto L_0x002f
            return r4
        L_0x00ad:
            X.5u0 r5 = new X.5u0
            r5.<init>(r9, r11)
            goto L_0x0012
        L_0x00b4:
            X.3f1 r0 = X.C73153f1.A00()
            throw r0
        L_0x00b9:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.productinfra.avatar.ui.stickers.upsell.AvatarStickerUpsellViewController.A00(X.5Be, X.4Du):java.lang.Object");
    }
}
