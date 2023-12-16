package X;

import android.view.View;
import com.whatsapp.stickers.thirdparty.AddThirdPartyStickerPackActivity;

/* renamed from: X.5f0  reason: invalid class name and case insensitive filesystem */
public class C109675f0 implements View.OnClickListener {
    public Object A00;
    public final int A01;

    public C109675f0(AddThirdPartyStickerPackActivity.AddStickerPackDialogFragment addStickerPackDialogFragment, int i) {
        this.A01 = i;
        switch (i) {
            case 15:
            case 16:
                this.A00 = addStickerPackDialogFragment;
                return;
            default:
                this.A00 = addStickerPackDialogFragment;
                return;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0428, code lost:
        r0.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x042b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0479, code lost:
        r3.startActivity(X.C627736r.A19(r3, "DONE", r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0482, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005d, code lost:
        if (r3.A01 == 1) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007a, code lost:
        r0 = (X.C116145po) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x011e, code lost:
        r0.invoke();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0121, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r16) {
        /*
            r15 = this;
            int r0 = r15.A01
            switch(r0) {
                case 0: goto L_0x0111;
                case 1: goto L_0x0118;
                case 2: goto L_0x04ad;
                case 3: goto L_0x0122;
                case 4: goto L_0x0132;
                case 5: goto L_0x013b;
                case 6: goto L_0x0146;
                case 7: goto L_0x015a;
                case 8: goto L_0x000b;
                case 9: goto L_0x0171;
                case 10: goto L_0x0278;
                case 11: goto L_0x0196;
                case 12: goto L_0x001b;
                case 13: goto L_0x01c2;
                case 14: goto L_0x0278;
                case 15: goto L_0x01ca;
                case 16: goto L_0x01d2;
                case 17: goto L_0x01ee;
                case 18: goto L_0x0228;
                case 19: goto L_0x0230;
                case 20: goto L_0x0238;
                case 21: goto L_0x003f;
                case 22: goto L_0x0240;
                case 23: goto L_0x0005;
                case 24: goto L_0x0005;
                case 25: goto L_0x024a;
                case 26: goto L_0x0278;
                case 27: goto L_0x027e;
                case 28: goto L_0x02ad;
                case 29: goto L_0x02de;
                case 30: goto L_0x0358;
                case 31: goto L_0x0382;
                case 32: goto L_0x03cb;
                case 33: goto L_0x03d4;
                case 34: goto L_0x03de;
                case 35: goto L_0x03f7;
                case 36: goto L_0x0072;
                case 37: goto L_0x00b5;
                case 38: goto L_0x00ef;
                case 39: goto L_0x03ff;
                case 40: goto L_0x0420;
                case 41: goto L_0x042c;
                case 42: goto L_0x043f;
                case 43: goto L_0x0460;
                case 44: goto L_0x0455;
                case 45: goto L_0x046e;
                case 46: goto L_0x0483;
                case 47: goto L_0x0491;
                case 48: goto L_0x0499;
                case 49: goto L_0x04a5;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r15.A00
            X.AnonymousClass0x9.A1K(r0)
        L_0x000a:
            return
        L_0x000b:
            java.lang.Object r0 = r15.A00
            X.6pT r0 = (X.C137916pT) r0
            X.7aj r1 = r0.A0A
            boolean r0 = r1 instanceof X.C137296oS
            if (r0 == 0) goto L_0x000a
            X.6oS r1 = (X.C137296oS) r1
            r1.A06()
            return
        L_0x001b:
            java.lang.Object r0 = r15.A00
            X.0eF r0 = (X.C08310eF) r0
            X.03q r3 = r0.A0Q()
            boolean r0 = r3 instanceof com.whatsapp.stickers.store.StickerStoreActivity
            if (r0 == 0) goto L_0x000a
            com.whatsapp.stickers.store.StickerStoreActivity r3 = (com.whatsapp.stickers.store.StickerStoreActivity) r3
            com.whatsapp.stickers.store.StickerStoreFeaturedTabFragment r1 = r3.A06
            X.4TX r0 = r3.A05
            if (r0 == 0) goto L_0x000a
            java.util.List r0 = r0.A00
            int r2 = r0.indexOf(r1)
            r0 = -1
            if (r2 == r0) goto L_0x000a
            androidx.viewpager.widget.ViewPager r1 = r3.A01
            r0 = 1
            r1.A0F(r2, r0)
            return
        L_0x003f:
            java.lang.Object r3 = r15.A00
            com.whatsapp.storage.StorageUsageGalleryActivity r3 = (com.whatsapp.storage.StorageUsageGalleryActivity) r3
            com.whatsapp.storage.StorageUsageMediaGalleryFragment r0 = r3.A0P
            if (r0 == 0) goto L_0x000a
            X.7Ef r2 = new X.7Ef
            r2.<init>()
            int r0 = r0.A03
            r2.A00 = r0
            X.3Mh r1 = r3.A06
            X.1Ei r0 = X.C66663Mh.A0I
            boolean r0 = r1.A08(r0)
            if (r0 == 0) goto L_0x0070
            int r0 = r3.A01
            r1 = 1
            if (r0 != r1) goto L_0x0070
        L_0x005f:
            int r0 = r2.A00
            com.whatsapp.storage.StorageUsageGallerySortBottomSheet r1 = com.whatsapp.storage.StorageUsageGallerySortBottomSheet.A00(r0, r1)
            X.7Ee r0 = new X.7Ee
            r0.<init>(r3)
            r1.A00 = r0
            r3.Boo(r1)
            return
        L_0x0070:
            r1 = 0
            goto L_0x005f
        L_0x0072:
            java.lang.Object r0 = r15.A00
            com.whatsapp.textstatuscomposer.bottombar.CreationModeBottomBar r0 = (com.whatsapp.textstatuscomposer.bottombar.CreationModeBottomBar) r0
            X.8ja r0 = r0.A0E
            if (r0 == 0) goto L_0x000a
            X.5po r0 = (X.C116145po) r0
            X.8jb r2 = r0.A06
            if (r2 == 0) goto L_0x000a
            X.7VK r0 = r0.A05
            X.58Q r1 = r0.A00
            X.58Q r0 = X.AnonymousClass58Q.SEND_TEXT
            if (r1 != r0) goto L_0x00a8
            com.whatsapp.textstatuscomposer.TextStatusComposerActivity r2 = (com.whatsapp.textstatuscomposer.TextStatusComposerActivity) r2
            r2.A79()
            X.08M r1 = r2.A15
            java.lang.Object r0 = r1.A07()
            if (r0 == 0) goto L_0x00a4
            java.lang.Object r0 = r1.A07()
            X.5de r0 = (X.C108845de) r0
            boolean r0 = r0.A03
            if (r0 == 0) goto L_0x00a4
            X.8qC r0 = r2.A0v
            r0.get()
        L_0x00a4:
            r2.A78()
            return
        L_0x00a8:
            X.58Q r0 = X.AnonymousClass58Q.SEND_VOICE
            if (r1 != r0) goto L_0x000a
            com.whatsapp.textstatuscomposer.TextStatusComposerActivity r2 = (com.whatsapp.textstatuscomposer.TextStatusComposerActivity) r2
            r2.A79()
            r2.A7A()
            return
        L_0x00b5:
            java.lang.Object r2 = r15.A00
            com.whatsapp.textstatuscomposer.voice.VoiceRecordingView r2 = (com.whatsapp.textstatuscomposer.voice.VoiceRecordingView) r2
            com.whatsapp.WaImageButton r1 = r2.A05
            X.8qC r0 = r2.A0G
            java.lang.Object r0 = r0.get()
            X.33i r0 = (X.C620633i) r0
            X.C106755a7.A01(r1, r0)
            X.8je r1 = r2.A0D
            if (r1 == 0) goto L_0x000a
            X.5pr r1 = (X.C116175pr) r1
            X.08M r0 = r1.A08
            java.lang.Object r0 = r0.A07()
            if (r0 == 0) goto L_0x04b9
            X.7Qx r0 = (X.C150487Qx) r0
            r0.A00()
            X.5mK r0 = r1.A0F
            X.5Z9 r2 = r0.A0C
            X.2X0 r0 = r2.A04
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x000a
            X.4sW r1 = r2.A01()
            r0 = 31
            X.C95044sW.A00(r1, r2, r0)
            return
        L_0x00ef:
            java.lang.Object r2 = r15.A00
            com.whatsapp.textstatuscomposer.voice.VoiceRecordingView r2 = (com.whatsapp.textstatuscomposer.voice.VoiceRecordingView) r2
            com.whatsapp.WaImageButton r1 = r2.A05
            X.8qC r0 = r2.A0G
            java.lang.Object r0 = r0.get()
            X.33i r0 = (X.C620633i) r0
            X.C106755a7.A02(r1, r0)
            X.8je r1 = r2.A0D
            if (r1 == 0) goto L_0x000a
            X.5pr r1 = (X.C116175pr) r1
            X.5pp r0 = r1.A00
            if (r0 == 0) goto L_0x010d
            r0.A01()
        L_0x010d:
            r1.A01()
            return
        L_0x0111:
            java.lang.Object r0 = r15.A00
            X.2Tl r0 = (X.C43782Tl) r0
            X.4GP r0 = r0.A09
            goto L_0x011e
        L_0x0118:
            java.lang.Object r0 = r15.A00
            X.2Tl r0 = (X.C43782Tl) r0
            X.4GP r0 = r0.A08
        L_0x011e:
            r0.invoke()
            return
        L_0x0122:
            java.lang.Object r0 = r15.A00
            com.whatsapp.status.playback.MessageReplyActivity r0 = (com.whatsapp.status.playback.MessageReplyActivity) r0
            X.4fS r2 = r0.A0U
            boolean r1 = r0.A1T
            r0 = 2
            if (r1 == 0) goto L_0x012e
            r0 = 5
        L_0x012e:
            r2.A09(r0)
            return
        L_0x0132:
            java.lang.Object r1 = r15.A00
            com.whatsapp.status.playback.MessageReplyActivity r1 = (com.whatsapp.status.playback.MessageReplyActivity) r1
            r0 = 0
            r1.A7E(r0)
            return
        L_0x013b:
            java.lang.Object r0 = r15.A00
            X.51x r0 = (X.AnonymousClass51x) r0
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = r0.A00
            r0 = 4
            r1.A0S(r0)
            return
        L_0x0146:
            java.lang.Object r0 = r15.A00
            com.whatsapp.status.seeall.StatusSeeAllActivity r0 = (com.whatsapp.status.seeall.StatusSeeAllActivity) r0
            X.5Ub r1 = r0.A07
            if (r1 != 0) goto L_0x0155
            java.lang.String r0 = "searchToolbarHelper"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0155:
            r0 = 1
            r1.A01(r0)
            return
        L_0x015a:
            java.lang.Object r1 = r15.A00
            com.whatsapp.status.seeall.StatusSeeAllActivity r1 = (com.whatsapp.status.seeall.StatusSeeAllActivity) r1
            r0 = 0
            X.C162457s7.A0J(r1, r0)
            com.whatsapp.status.seeall.viewmodel.StatusSeeAllViewModel r1 = r1.A09
            if (r1 != 0) goto L_0x016b
            java.lang.RuntimeException r0 = X.C86604Kt.A0j()
            throw r0
        L_0x016b:
            X.590 r0 = X.AnonymousClass590.ALL
            r1.A0E(r0)
            return
        L_0x0171:
            java.lang.Object r4 = r15.A00
            X.6pS r4 = (X.C137906pS) r4
            X.2iT r0 = r4.A04
            java.lang.String r3 = r0.A0I
            android.os.Bundle r2 = X.AnonymousClass002.A08()
            com.whatsapp.stickers.picker.pages.ThirdPartyPackPage$StickerBlockedDialogFragment r1 = new com.whatsapp.stickers.picker.pages.ThirdPartyPackPage$StickerBlockedDialogFragment
            r1.<init>()
            java.lang.String r0 = "sticker_pack_name"
            r2.putString(r0, r3)
            r1.A0u(r2)
            android.content.Context r0 = r4.A0B
            android.app.Activity r0 = X.C111095hX.A02(r0)
            X.4ea r0 = (X.C89654ea) r0
            r0.Boo(r1)
            return
        L_0x0196:
            java.lang.Object r3 = r15.A00
            com.whatsapp.stickers.store.StickerStoreFeaturedTabFragment r3 = (com.whatsapp.stickers.store.StickerStoreFeaturedTabFragment) r3
            java.lang.String r0 = "android.intent.action.VIEW"
            android.content.Intent r2 = X.AnonymousClass0x9.A09(r0)
            java.lang.String r0 = "http://play.google.com/store/search?q=WASticker&c=apps"
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r2.setData(r0)
            java.lang.String r0 = "com.android.vending"
            r2.setPackage(r0)
            X.5hX r1 = r3.A02
            android.content.Context r0 = r3.A1D()
            r1.A0A(r0, r2)
            X.1Vo r1 = new X.1Vo
            r1.<init>()
            X.4FV r0 = r3.A04
            r0.BhD(r1)
            return
        L_0x01c2:
            java.lang.Object r0 = r15.A00
            X.121 r0 = (X.AnonymousClass121) r0
            r0.A0K()
            return
        L_0x01ca:
            java.lang.Object r0 = r15.A00
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A1L()
            return
        L_0x01d2:
            java.lang.Object r4 = r15.A00
            androidx.fragment.app.DialogFragment r4 = (androidx.fragment.app.DialogFragment) r4
            X.03q r3 = r4.A0Q()
            if (r3 == 0) goto L_0x01ea
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = "user_cancelled"
            r0 = 1
            r2.putExtra(r1, r0)
            r0 = 0
            r3.setResult(r0, r2)
        L_0x01ea:
            r4.A1L()
            return
        L_0x01ee:
            java.lang.Object r6 = r15.A00
            com.whatsapp.stickers.thirdparty.AddThirdPartyStickerPackActivity$AddStickerPackDialogFragment r6 = (com.whatsapp.stickers.thirdparty.AddThirdPartyStickerPackActivity.AddStickerPackDialogFragment) r6
            r4 = 2131894082(0x7f121f42, float:1.9422959E38)
            java.lang.Object[] r3 = X.AnonymousClass002.A0M()
            java.lang.String r0 = r6.A05
            r2 = 0
            r3[r2] = r0
            r1 = 2131895980(0x7f1226ac, float:1.9426808E38)
            android.content.res.Resources r0 = X.C08310eF.A09(r6)
            java.lang.String r1 = r0.getString(r1)
            r0 = 1
            java.lang.String r1 = X.AnonymousClass0x7.A0n(r6, r1, r3, r0, r4)
            r0 = 8
            r6.A1V(r2, r0, r1, r0)
            X.2Qb r0 = r6.A01
            java.lang.String r5 = r6.A02
            java.lang.String r4 = r6.A03
            X.2sn r3 = r0.A02
            X.4FS r2 = r3.A0Z
            r1 = 15
            X.3aI r0 = new X.3aI
            r0.<init>(r3, r4, r5, r1)
            r2.BkM(r0)
            return
        L_0x0228:
            java.lang.Object r0 = r15.A00
            com.whatsapp.storage.StorageUsageActivity r0 = (com.whatsapp.storage.StorageUsageActivity) r0
            r0.onBackPressed()
            return
        L_0x0230:
            java.lang.Object r0 = r15.A00
            com.whatsapp.storage.StorageUsageActivity r0 = (com.whatsapp.storage.StorageUsageActivity) r0
            r0.onSearchRequested()
            return
        L_0x0238:
            java.lang.Object r0 = r15.A00
            com.whatsapp.storage.StorageUsageGalleryActivity r0 = (com.whatsapp.storage.StorageUsageGalleryActivity) r0
            r0.onBackPressed()
            return
        L_0x0240:
            java.lang.Object r0 = r15.A00
            com.whatsapp.support.DescribeProblemActivity r0 = (com.whatsapp.support.DescribeProblemActivity) r0
            androidx.appcompat.widget.AppCompatCheckBox r0 = r0.A03
            X.C86654Ky.A1C(r0)
            return
        L_0x024a:
            java.lang.Object r3 = r15.A00
            com.whatsapp.systemstatus.SystemStatusActivity r3 = (com.whatsapp.systemstatus.SystemStatusActivity) r3
            X.5WY r2 = r3.A01
            X.2mi r0 = r3.A02
            boolean r11 = r0.A00()
            java.lang.String r7 = r3.A03
            java.lang.String r8 = r3.A04
            int r0 = r3.A00
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            r5 = 0
            android.content.Intent r1 = r3.getIntent()
            java.lang.String r0 = "com.whatsapp.SystemStatusActivity.describeProblemBundle"
            android.os.Bundle r4 = r1.getBundleExtra(r0)
            r10 = r5
            r9 = r5
            android.content.Intent r0 = r2.A00(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r3.startActivity(r0)
            r3.finish()
            return
        L_0x0278:
            java.lang.Object r0 = r15.A00
            android.app.Activity r0 = (android.app.Activity) r0
            goto L_0x0428
        L_0x027e:
            java.lang.Object r5 = r15.A00
            com.whatsapp.textstatus.AddTextStatusActivity r5 = (com.whatsapp.textstatus.AddTextStatusActivity) r5
            com.whatsapp.WaEditText r0 = r5.A01
            r4 = 0
            if (r0 != 0) goto L_0x028e
            java.lang.String r0 = "textEntry"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x028e:
            X.C86634Kw.A1I(r0)
            r1 = 2131231686(0x7f0803c6, float:1.807946E38)
            r0 = 2131101258(0x7f06064a, float:1.781492E38)
            android.graphics.drawable.Drawable r3 = X.C107335b8.A03(r5, r1, r0)
            X.3Wi r2 = r5.A05
            r1 = 39
            X.3cK r0 = new X.3cK
            r0.<init>(r5, r1, r3)
            r2.A0S(r0)
            r5.A0D = r4
            r5.A74()
            return
        L_0x02ad:
            java.lang.Object r6 = r15.A00
            com.whatsapp.textstatus.AddTextStatusActivity r6 = (com.whatsapp.textstatus.AddTextStatusActivity) r6
            java.lang.String[] r5 = r6.A0G
            if (r5 != 0) goto L_0x02bc
            java.lang.String r0 = "durationOptions"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x02bc:
            r4 = 1
            r1 = 2131888755(0x7f120a73, float:1.9412154E38)
            r3 = 2131893273(0x7f121c19, float:1.9421318E38)
            r0 = 0
            com.whatsapp.SingleSelectionDialogFragment r2 = new com.whatsapp.SingleSelectionDialogFragment
            r2.<init>()
            android.os.Bundle r1 = com.whatsapp.SingleSelectionDialogFragment.A00(r5, r4, r0, r1)
            java.lang.String r0 = "dialogPositiveButtonTextResId"
            r1.putInt(r0, r3)
            r2.A0u(r1)
            java.lang.String r0 = "durationSelection"
            r6.Bon(r2, r0)
            r6.A74()
            return
        L_0x02de:
            java.lang.Object r10 = r15.A00
            com.whatsapp.textstatus.AddTextStatusActivity r10 = (com.whatsapp.textstatus.AddTextStatusActivity) r10
            r12 = 0
            com.whatsapp.WaEditText r0 = r10.A01
            if (r0 != 0) goto L_0x02ee
            java.lang.String r0 = "textEntry"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x02ee:
            java.lang.String r6 = X.C86644Kx.A0g(r0)
            boolean r0 = X.C175738Zn.A0V(r6)
            r0 = r0 ^ 1
            r2 = 0
            if (r0 != 0) goto L_0x0311
            java.lang.String r0 = r10.A0D
            if (r0 != 0) goto L_0x0311
            r13 = 0
        L_0x0302:
            X.4FS r0 = r10.A04
            X.3aG r9 = new X.3aG
            r11 = r6
            r9.<init>(r10, r11, r12, r13)
            r0.BkP(r9)
            r10.finish()
            return
        L_0x0311:
            long[] r1 = X.C100795Ch.A00
            int r0 = r10.A00
            r13 = r1[r0]
            int r0 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0302
            java.util.List r2 = r10.A0L
            boolean r0 = r2 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0335
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0335
        L_0x0327:
            java.lang.String r9 = r10.A0D
            r4 = 0
            X.2mD r3 = new X.2mD
            r7 = r4
            r3.<init>(r4, r6, r7, r9)
            r2.add(r12, r3)
            goto L_0x0302
        L_0x0335:
            java.util.Iterator r3 = r2.iterator()
        L_0x0339:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0327
            java.lang.Object r1 = r3.next()
            X.2mD r1 = (X.C52892mD) r1
            java.lang.String r0 = r1.A03
            boolean r0 = X.C162457s7.A0P(r0, r6)
            if (r0 == 0) goto L_0x0339
            java.lang.String r1 = r1.A02
            java.lang.String r0 = r10.A0D
            boolean r0 = X.C162457s7.A0P(r1, r0)
            if (r0 == 0) goto L_0x0339
            goto L_0x0302
        L_0x0358:
            java.lang.Object r6 = r15.A00
            com.whatsapp.textstatuscomposer.TextStatusComposerActivity r6 = (com.whatsapp.textstatuscomposer.TextStatusComposerActivity) r6
            r6.A77()
            int[] r5 = com.whatsapp.textstatuscomposer.TextStatusComposerActivity.A1A
            int r4 = r6.A00
            int[] r3 = X.C107415bH.A01
            int r2 = r3.length
            r1 = 0
        L_0x0367:
            if (r1 >= r2) goto L_0x0370
            r0 = r3[r1]
            if (r0 == r4) goto L_0x0371
            int r1 = r1 + 1
            goto L_0x0367
        L_0x0370:
            r1 = -1
        L_0x0371:
            r0 = r5[r1]
            java.lang.String r1 = r6.getString(r0)
            X.33i r0 = r6.A08
            X.C107295b4.A00(r6, r0, r1)
            X.5mK r0 = r6.A0i
            r0.A02()
            return
        L_0x0382:
            java.lang.Object r4 = r15.A00
            com.whatsapp.textstatuscomposer.TextStatusComposerActivity r4 = (com.whatsapp.textstatuscomposer.TextStatusComposerActivity) r4
            int r2 = r4.A02
            int[] r6 = X.C107415bH.A02
            int r5 = r6.length
            r1 = 0
        L_0x038c:
            if (r1 >= r5) goto L_0x0395
            r0 = r6[r1]
            if (r0 == r2) goto L_0x0396
            int r1 = r1 + 1
            goto L_0x038c
        L_0x0395:
            r1 = -1
        L_0x0396:
            int r0 = r1 + 1
            int r0 = r0 % r5
            r0 = r6[r0]
            r4.A02 = r0
            android.graphics.Typeface r1 = X.C107415bH.A04(r4, r0)
            android.widget.TextView r0 = r4.A0C
            r0.setTypeface(r1)
            com.whatsapp.status.playback.widget.StatusEditText r0 = r4.A0j
            r0.setTypeface(r1)
            int r0 = r4.A02
            r4.A7F(r0)
            int[] r3 = com.whatsapp.textstatuscomposer.TextStatusComposerActivity.A1B
            int r2 = r4.A02
            r1 = 0
        L_0x03b5:
            if (r1 >= r5) goto L_0x03be
            r0 = r6[r1]
            if (r0 == r2) goto L_0x03bf
            int r1 = r1 + 1
            goto L_0x03b5
        L_0x03be:
            r1 = -1
        L_0x03bf:
            r0 = r3[r1]
            java.lang.String r1 = r4.getString(r0)
            X.33i r0 = r4.A08
            X.C107295b4.A00(r4, r0, r1)
            return
        L_0x03cb:
            java.lang.Object r1 = r15.A00
            com.whatsapp.textstatuscomposer.TextStatusComposerActivity r1 = (com.whatsapp.textstatuscomposer.TextStatusComposerActivity) r1
            r0 = 0
            r1.A7J(r0)
            return
        L_0x03d4:
            java.lang.Object r0 = r15.A00
            com.whatsapp.textstatuscomposer.TextStatusComposerActivity r0 = (com.whatsapp.textstatuscomposer.TextStatusComposerActivity) r0
            X.4qy r0 = r0.A0V
            r0.A04()
            return
        L_0x03de:
            java.lang.Object r3 = r15.A00
            com.whatsapp.textstatuscomposer.TextStatusComposerActivity r3 = (com.whatsapp.textstatuscomposer.TextStatusComposerActivity) r3
            r0 = 2131888879(0x7f120aef, float:1.9412406E38)
            java.lang.String r2 = r3.getString(r0)
            r1 = 2131232185(0x7f0805b9, float:1.8080472E38)
            android.widget.ImageButton r0 = r3.A0A
            r0.setImageResource(r1)
            android.widget.ImageButton r0 = r3.A0A
            r0.setContentDescription(r2)
            return
        L_0x03f7:
            java.lang.Object r0 = r15.A00
            com.whatsapp.textstatuscomposer.TextStatusComposerActivity r0 = (com.whatsapp.textstatuscomposer.TextStatusComposerActivity) r0
            r0.A74()
            return
        L_0x03ff:
            java.lang.Object r2 = r15.A00
            X.4ea r2 = (X.C89654ea) r2
            X.33p r0 = r2.A09
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r0)
            java.lang.String r0 = "settings_verification_email_address"
            java.lang.String r0 = X.C18280x3.A0Z(r1, r0)
            r1 = 1
            if (r0 == 0) goto L_0x041c
            int r0 = r0.length()
            if (r0 == 0) goto L_0x041c
            r2.finish()
            return
        L_0x041c:
            X.C621433s.A01(r2, r1)
            return
        L_0x0420:
            java.lang.Object r0 = r15.A00
            X.0eF r0 = (X.C08310eF) r0
            X.03q r0 = r0.A0Q()
        L_0x0428:
            r0.finish()
            return
        L_0x042c:
            java.lang.Object r3 = r15.A00
            X.4eZ r3 = (X.C89644eZ) r3
            X.5hX r2 = r3.A00
            X.5X8 r1 = r3.A03
            java.lang.String r0 = "https://faq.whatsapp.com/1278661612895630/"
            android.net.Uri r1 = r1.A00(r0)
            r0 = 0
            r2.BkW(r3, r1, r0)
            return
        L_0x043f:
            java.lang.Object r3 = r15.A00
            X.4ea r3 = (X.C89654ea) r3
            X.1VX r1 = r3.A0D
            r0 = 5156(0x1424, float:7.225E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 != 0) goto L_0x0459
            int[] r2 = X.C86664Kz.A1Z()
            r2 = {1, 2} // fill-array
            goto L_0x0479
        L_0x0455:
            java.lang.Object r3 = r15.A00
            android.content.Context r3 = (android.content.Context) r3
        L_0x0459:
            r1 = 1
            int[] r2 = new int[r1]
            r0 = 0
            r2[r0] = r1
            goto L_0x0479
        L_0x0460:
            java.lang.Object r2 = r15.A00
            X.4ea r2 = (X.C89654ea) r2
            com.whatsapp.twofactor.SettingsTwoFactorAuthActivity$ConfirmDisableDialog r1 = new com.whatsapp.twofactor.SettingsTwoFactorAuthActivity$ConfirmDisableDialog
            r1.<init>()
            r0 = 0
            r2.Bon(r1, r0)
            return
        L_0x046e:
            java.lang.Object r3 = r15.A00
            android.content.Context r3 = (android.content.Context) r3
            r0 = 1
            int[] r2 = new int[r0]
            r1 = 0
            r0 = 2
            r2[r1] = r0
        L_0x0479:
            java.lang.String r0 = "DONE"
            android.content.Intent r0 = X.C627736r.A19(r3, r0, r2)
            r3.startActivity(r0)
            return
        L_0x0483:
            java.lang.Object r1 = r15.A00
            com.whatsapp.text.ReadMoreTextView r1 = (com.whatsapp.text.ReadMoreTextView) r1
            boolean r0 = r1.A0M()
            r0 = r0 ^ 1
            r1.setExpanded(r0)
            return
        L_0x0491:
            java.lang.Object r0 = r15.A00
            X.8pf r0 = (X.C183208pf) r0
            X.AnonymousClass52i.A00(r0)
            return
        L_0x0499:
            java.lang.Object r1 = r15.A00
            X.7On r1 = (X.C149947On) r1
            X.8pg r0 = r1.A01
            r2 = r16
            r0.BPD(r2, r1)
            return
        L_0x04a5:
            java.lang.Object r0 = r15.A00
            X.8pf r0 = (X.C183208pf) r0
            X.AnonymousClass52i.A00(r0)
            return
        L_0x04ad:
            X.1Y2 r0 = new X.1Y2
            r0.<init>()
            java.lang.String r0 = "postWithSchemaSampling"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x04b9:
            java.lang.IllegalArgumentException r0 = X.C18300x5.A0X()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C109675f0.onClick(android.view.View):void");
    }

    public C109675f0(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }
}
