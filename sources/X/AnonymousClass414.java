package X;

import com.whatsapp.avatar.home.AvatarHomeActivity;

/* renamed from: X.414  reason: invalid class name */
public final class AnonymousClass414 extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ AvatarHomeActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass414(AvatarHomeActivity avatarHomeActivity) {
        super(1);
        this.this$0 = avatarHomeActivity;
    }

    /* JADX WARNING: Removed duplicated region for block: B:150:0x0238  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r10) {
        /*
            r9 = this;
            X.252 r10 = (X.AnonymousClass252) r10
            r0 = 0
            X.C162457s7.A0J(r10, r0)
            boolean r0 = r10 instanceof X.AnonymousClass1II
            if (r0 == 0) goto L_0x00a5
            com.whatsapp.avatar.home.AvatarHomeActivity r4 = r9.this$0
            X.1II r10 = (X.AnonymousClass1II) r10
            r4.A74()
            r4.BjL()
            android.widget.LinearLayout r1 = r4.A06
            java.lang.String r0 = "containerNewUser"
            r5 = 0
            if (r1 != 0) goto L_0x0020
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0020:
            r3 = 0
            r1.setVisibility(r3)
            android.widget.LinearLayout r1 = r4.A06
            if (r1 != 0) goto L_0x002d
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x002d:
            X.2td r0 = new X.2td
            r0.<init>(r3)
            r1.setOnTouchListener(r0)
            android.widget.FrameLayout r0 = r4.A04
            if (r0 != 0) goto L_0x0040
            java.lang.String r0 = "containerAvatarSet"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0040:
            r1 = 8
            r0.setVisibility(r1)
            com.whatsapp.WaTextView r0 = r4.A0D
            if (r0 != 0) goto L_0x0050
            java.lang.String r0 = "browseStickersTextView"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0050:
            r0.setVisibility(r1)
            com.whatsapp.WaTextView r0 = r4.A0E
            if (r0 != 0) goto L_0x005e
            java.lang.String r0 = "createProfilePhotoTextView"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x005e:
            r0.setVisibility(r1)
            android.view.View r0 = r4.A02
            if (r0 != 0) goto L_0x006d
            java.lang.String r0 = "privacyDivider"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x006d:
            r0.setVisibility(r1)
            com.whatsapp.WaTextView r0 = r4.A0F
            if (r0 != 0) goto L_0x007b
            java.lang.String r0 = "deleteAvatarTextView"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x007b:
            r0.setVisibility(r1)
            X.6Z3 r0 = r4.A08
            if (r0 != 0) goto L_0x0089
            java.lang.String r0 = "editAvatarFab"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0089:
            r2 = 1
            r0.A04(r2)
            com.whatsapp.bottomsheet.LockableBottomSheetBehavior r1 = r4.A0G
            if (r1 == 0) goto L_0x009a
            r1.A00 = r3
            r0 = 4
            r1.A0S(r0)
            r4.A76(r2)
        L_0x009a:
            com.whatsapp.WaImageView r0 = r4.A0B
            if (r0 != 0) goto L_0x0355
            java.lang.String r0 = "avatarSetImageView"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x00a5:
            boolean r0 = r10 instanceof X.AnonymousClass1IJ
            if (r0 == 0) goto L_0x023c
            com.whatsapp.avatar.home.AvatarHomeActivity r2 = r9.this$0
            X.1IJ r10 = (X.AnonymousClass1IJ) r10
            r2.A74()
            android.widget.LinearLayout r0 = r2.A06
            java.lang.String r3 = "containerNewUser"
            r5 = 0
            if (r0 != 0) goto L_0x00bc
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r3)
            throw r0
        L_0x00bc:
            r1 = 8
            r0.setVisibility(r1)
            android.widget.LinearLayout r0 = r2.A06
            if (r0 != 0) goto L_0x00ca
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r3)
            throw r0
        L_0x00ca:
            r0.setOnTouchListener(r5)
            android.widget.FrameLayout r0 = r2.A04
            if (r0 != 0) goto L_0x00d8
            java.lang.String r0 = "containerAvatarSet"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x00d8:
            r3 = 0
            r0.setVisibility(r3)
            com.whatsapp.CircularProgressBar r0 = r2.A09
            if (r0 != 0) goto L_0x00e7
            java.lang.String r0 = "avatarLoadingProgressBar"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x00e7:
            r0.setVisibility(r1)
            com.whatsapp.WaImageView r0 = r2.A0B
            if (r0 != 0) goto L_0x00f5
            java.lang.String r0 = "avatarSetImageView"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x00f5:
            r0.setVisibility(r3)
            com.whatsapp.WaTextView r0 = r2.A0D
            if (r0 != 0) goto L_0x0103
            java.lang.String r0 = "browseStickersTextView"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0103:
            r0.setVisibility(r3)
            com.whatsapp.WaTextView r0 = r2.A0E
            if (r0 != 0) goto L_0x0111
            java.lang.String r0 = "createProfilePhotoTextView"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0111:
            r0.setVisibility(r3)
            android.view.View r0 = r2.A02
            if (r0 != 0) goto L_0x0120
            java.lang.String r0 = "privacyDivider"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0120:
            r0.setVisibility(r3)
            com.whatsapp.WaTextView r0 = r2.A0F
            if (r0 != 0) goto L_0x012e
            java.lang.String r0 = "deleteAvatarTextView"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x012e:
            r0.setVisibility(r3)
            X.6Z3 r1 = r2.A08
            if (r1 != 0) goto L_0x013c
            java.lang.String r0 = "editAvatarFab"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x013c:
            r0 = 1
            r1.A05(r0)
            com.whatsapp.bottomsheet.LockableBottomSheetBehavior r1 = r2.A0G
            if (r1 == 0) goto L_0x014f
            boolean r0 = r10.A02
            r1.A00 = r0
            r0 = 4
            r1.A0S(r0)
            r2.A76(r3)
        L_0x014f:
            boolean r0 = r10.A03
            if (r0 == 0) goto L_0x0170
            r0 = 2131888520(0x7f120988, float:1.9411678E38)
            r2.Bp9(r0)
        L_0x0159:
            X.251 r1 = r10.A00
            boolean r0 = r1 instanceof X.AnonymousClass1IE
            if (r0 == 0) goto L_0x01af
            X.1IE r1 = (X.AnonymousClass1IE) r1
            android.graphics.Bitmap r5 = r1.A00
            boolean r4 = r10.A02
            com.whatsapp.CircularProgressBar r0 = r2.A09
            if (r0 != 0) goto L_0x0184
            java.lang.String r0 = "avatarLoadingProgressBar"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0170:
            r2.BjL()
            boolean r0 = r10.A01
            if (r0 == 0) goto L_0x0159
            android.view.View r1 = r2.A00
            r0 = 2131888519(0x7f120987, float:1.9411676E38)
            X.4ab r0 = X.C88694ab.A00(r1, r0, r3)
            r0.A05()
            goto L_0x0159
        L_0x0184:
            r3 = 8
            r0.setVisibility(r3)
            com.whatsapp.WaImageView r1 = r2.A0B
            java.lang.String r0 = "avatarSetImageView"
            if (r1 != 0) goto L_0x0194
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0194:
            r1.setImageBitmap(r5)
            com.whatsapp.WaImageView r1 = r2.A0B
            if (r1 != 0) goto L_0x01a0
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x01a0:
            r0 = 1
            r1.setClickable(r0)
            android.view.View r0 = r2.A00
            if (r0 != 0) goto L_0x01ee
            java.lang.String r0 = "avatarPreviewErrorView"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x01af:
            X.1IF r0 = X.AnonymousClass1IF.A00
            boolean r0 = X.C162457s7.A0P(r1, r0)
            if (r0 == 0) goto L_0x01f2
            boolean r4 = r10.A02
            com.whatsapp.CircularProgressBar r1 = r2.A09
            if (r1 != 0) goto L_0x01c4
            java.lang.String r0 = "avatarLoadingProgressBar"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x01c4:
            r0 = 8
            r1.setVisibility(r0)
            com.whatsapp.WaImageView r0 = r2.A0B
            java.lang.String r1 = "avatarSetImageView"
            if (r0 != 0) goto L_0x01d4
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r1)
            throw r0
        L_0x01d4:
            r0.setImageBitmap(r5)
            com.whatsapp.WaImageView r0 = r2.A0B
            if (r0 != 0) goto L_0x01e0
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r1)
            throw r0
        L_0x01e0:
            r0.setClickable(r3)
            android.view.View r0 = r2.A00
            if (r0 != 0) goto L_0x01ee
            java.lang.String r0 = "avatarPreviewErrorView"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x01ee:
            r0.setVisibility(r3)
            goto L_0x0234
        L_0x01f2:
            X.1IG r0 = X.AnonymousClass1IG.A00
            boolean r0 = X.C162457s7.A0P(r1, r0)
            if (r0 == 0) goto L_0x037a
            boolean r4 = r10.A02
            com.whatsapp.CircularProgressBar r0 = r2.A09
            if (r0 != 0) goto L_0x0207
            java.lang.String r0 = "avatarLoadingProgressBar"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0207:
            r0.setVisibility(r3)
            com.whatsapp.WaImageView r0 = r2.A0B
            java.lang.String r1 = "avatarSetImageView"
            if (r0 != 0) goto L_0x0215
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r1)
            throw r0
        L_0x0215:
            r0.setImageBitmap(r5)
            com.whatsapp.WaImageView r0 = r2.A0B
            if (r0 != 0) goto L_0x0221
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r1)
            throw r0
        L_0x0221:
            r0.setClickable(r3)
            android.view.View r1 = r2.A00
            if (r1 != 0) goto L_0x022f
            java.lang.String r0 = "avatarPreviewErrorView"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x022f:
            r0 = 8
            r1.setVisibility(r0)
        L_0x0234:
            com.whatsapp.bottomsheet.LockableBottomSheetBehavior r0 = r2.A0G
            if (r0 == 0) goto L_0x037a
            r0.A00 = r4
            goto L_0x037a
        L_0x023c:
            X.1IH r0 = X.AnonymousClass1IH.A00
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x037a
            com.whatsapp.avatar.home.AvatarHomeActivity r5 = r9.this$0
            com.whatsapp.WaTextView r0 = r5.A0D
            java.lang.String r8 = "browseStickersTextView"
            r4 = 0
            if (r0 != 0) goto L_0x0252
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r8)
            throw r0
        L_0x0252:
            r0.setOnClickListener(r4)
            com.whatsapp.WaTextView r0 = r5.A0D
            if (r0 != 0) goto L_0x025e
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r8)
            throw r0
        L_0x025e:
            r3 = 0
            r0.setClickable(r3)
            com.whatsapp.WaTextView r0 = r5.A0E
            java.lang.String r7 = "createProfilePhotoTextView"
            if (r0 != 0) goto L_0x026d
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r7)
            throw r0
        L_0x026d:
            r0.setOnClickListener(r4)
            com.whatsapp.WaTextView r0 = r5.A0E
            if (r0 != 0) goto L_0x0279
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r7)
            throw r0
        L_0x0279:
            r0.setClickable(r3)
            com.whatsapp.WaTextView r0 = r5.A0F
            java.lang.String r6 = "deleteAvatarTextView"
            if (r0 != 0) goto L_0x0287
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r6)
            throw r0
        L_0x0287:
            r0.setOnClickListener(r4)
            com.whatsapp.WaTextView r0 = r5.A0F
            if (r0 != 0) goto L_0x0293
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r6)
            throw r0
        L_0x0293:
            r0.setClickable(r3)
            android.widget.LinearLayout r0 = r5.A07
            java.lang.String r1 = "containerPrivacy"
            if (r0 != 0) goto L_0x02a1
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r1)
            throw r0
        L_0x02a1:
            r0.setOnClickListener(r4)
            android.widget.LinearLayout r0 = r5.A07
            if (r0 != 0) goto L_0x02ad
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r1)
            throw r0
        L_0x02ad:
            r0.setClickable(r3)
            r5.BjL()
            android.widget.LinearLayout r0 = r5.A06
            java.lang.String r2 = "containerNewUser"
            if (r0 != 0) goto L_0x02be
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r2)
            throw r0
        L_0x02be:
            r1 = 8
            r0.setVisibility(r1)
            android.widget.LinearLayout r0 = r5.A06
            if (r0 != 0) goto L_0x02cc
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r2)
            throw r0
        L_0x02cc:
            r0.setOnTouchListener(r4)
            android.widget.FrameLayout r0 = r5.A04
            if (r0 != 0) goto L_0x02da
            java.lang.String r0 = "containerAvatarSet"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x02da:
            r0.setVisibility(r3)
            com.whatsapp.CircularProgressBar r0 = r5.A09
            if (r0 != 0) goto L_0x02e8
            java.lang.String r0 = "avatarLoadingProgressBar"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x02e8:
            r0.setVisibility(r3)
            com.whatsapp.WaImageView r0 = r5.A0B
            java.lang.String r2 = "avatarSetImageView"
            if (r0 != 0) goto L_0x02f6
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r2)
            throw r0
        L_0x02f6:
            r0.setVisibility(r1)
            com.whatsapp.WaTextView r0 = r5.A0D
            if (r0 != 0) goto L_0x0302
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r8)
            throw r0
        L_0x0302:
            r0.setVisibility(r3)
            com.whatsapp.WaTextView r0 = r5.A0E
            if (r0 != 0) goto L_0x030e
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r7)
            throw r0
        L_0x030e:
            r0.setVisibility(r3)
            android.view.View r0 = r5.A02
            if (r0 != 0) goto L_0x031d
            java.lang.String r0 = "privacyDivider"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x031d:
            r0.setVisibility(r3)
            com.whatsapp.WaTextView r0 = r5.A0F
            if (r0 != 0) goto L_0x0329
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r6)
            throw r0
        L_0x0329:
            r0.setVisibility(r1)
            X.6Z3 r1 = r5.A08
            if (r1 != 0) goto L_0x0337
            java.lang.String r0 = "editAvatarFab"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0337:
            r0 = 1
            r1.A04(r0)
            com.whatsapp.bottomsheet.LockableBottomSheetBehavior r1 = r5.A0G
            if (r1 == 0) goto L_0x0348
            r1.A00 = r3
            r0 = 4
            r1.A0S(r0)
            r5.A76(r3)
        L_0x0348:
            com.whatsapp.WaImageView r0 = r5.A0B
            if (r0 != 0) goto L_0x0351
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r2)
            throw r0
        L_0x0351:
            r0.setImageBitmap(r4)
            goto L_0x037a
        L_0x0355:
            r0.setImageBitmap(r5)
            boolean r0 = r10.A00
            if (r0 == 0) goto L_0x037a
            android.view.View r1 = r4.A00
            r0 = 2131888521(0x7f120989, float:1.941168E38)
            X.4ab r0 = X.C88694ab.A00(r1, r0, r3)
            r0.A05()
            X.66R r0 = r4.A0L
            java.lang.Object r0 = r0.getValue()
            com.whatsapp.avatar.home.AvatarHomeViewModel r0 = (com.whatsapp.avatar.home.AvatarHomeViewModel) r0
            X.08M r1 = r0.A00
            X.1II r0 = new X.1II
            r0.<init>(r3)
            r1.A0H(r0)
        L_0x037a:
            X.2wD r0 = X.C59022wD.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass414.invoke(java.lang.Object):java.lang.Object");
    }
}
