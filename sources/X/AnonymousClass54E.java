package X;

import android.view.View;
import com.whatsapp.gallery.MediaGalleryFragmentBase;

/* renamed from: X.54E  reason: invalid class name */
public class AnonymousClass54E extends C109665ez {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass54E(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A01 = obj;
        this.A00 = obj2;
    }

    public static void A00(View view, Object obj, Object obj2, int i) {
        view.setOnClickListener(new AnonymousClass54E(obj, i, obj2));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v21, resolved type: X.4BN} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v13, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v22, resolved type: X.4BN} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v24, resolved type: X.4BN} */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x051b, code lost:
        if (r1 != com.whatsapp.R.id.duration_480_min) goto L_0x051d;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(android.view.View r22) {
        /*
            r21 = this;
            r3 = r21
            int r0 = r3.A02
            r5 = r22
            switch(r0) {
                case 0: goto L_0x06bb;
                case 1: goto L_0x062d;
                case 2: goto L_0x05ff;
                case 3: goto L_0x05f3;
                case 4: goto L_0x05eb;
                case 5: goto L_0x05e3;
                case 6: goto L_0x0231;
                case 7: goto L_0x0580;
                case 8: goto L_0x021f;
                case 9: goto L_0x054d;
                case 10: goto L_0x01df;
                case 11: goto L_0x0521;
                case 12: goto L_0x03f5;
                case 13: goto L_0x03ed;
                case 14: goto L_0x03e5;
                case 15: goto L_0x03dd;
                case 16: goto L_0x03cf;
                case 17: goto L_0x03c7;
                case 18: goto L_0x03b4;
                case 19: goto L_0x039f;
                case 20: goto L_0x038d;
                case 21: goto L_0x0377;
                case 22: goto L_0x0350;
                case 23: goto L_0x0336;
                case 24: goto L_0x01b9;
                case 25: goto L_0x0133;
                case 26: goto L_0x02a2;
                case 27: goto L_0x028b;
                case 28: goto L_0x0111;
                case 29: goto L_0x0272;
                case 30: goto L_0x0272;
                case 31: goto L_0x00ea;
                case 32: goto L_0x00bc;
                case 33: goto L_0x00a8;
                case 34: goto L_0x0089;
                case 35: goto L_0x0023;
                case 36: goto L_0x0263;
                case 37: goto L_0x0258;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r4 = r3.A01
            X.5Xa r4 = (X.C105945Xa) r4
            X.5X8 r1 = r4.A02
            java.lang.String r0 = "https://www.facebook.com"
            android.net.Uri r0 = r1.A00(r0)
            android.content.Intent r2 = X.C18310x6.A0D(r0)
            X.5hX r1 = r4.A00
            java.lang.Object r0 = r3.A00
            android.content.Context r0 = (android.content.Context) r0
            r1.A0A(r0, r2)
        L_0x0022:
            return
        L_0x0023:
            java.lang.Object r6 = r3.A01
            X.7NF r6 = (X.AnonymousClass7NF) r6
            X.4uZ r1 = r6.A00
            if (r1 != 0) goto L_0x0068
            com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity r0 = r6.A03
            X.3Lv r9 = r0.A0B
            long r4 = r6.A01
            X.3dV r0 = r9.A18
            X.4GK r8 = r0.get()
            r0 = r8
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x06e6 }
            X.2sg r7 = r0.A03     // Catch:{ all -> 0x06e6 }
            java.lang.String r2 = "SELECT chat_row_id FROM message_view WHERE _id = ?"
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x06e6 }
            X.C18260x0.A1Y(r1, r4)     // Catch:{ all -> 0x06e6 }
            java.lang.String r0 = "GET_CHAT_JID_FROM_MESSAGE_ID"
            android.database.Cursor r2 = r7.A0E(r2, r0, r1)     // Catch:{ all -> 0x06e6 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x06da }
            if (r0 == 0) goto L_0x005d
            X.2sm r0 = r9.A0W     // Catch:{ all -> 0x06da }
            X.4uZ r1 = r0.A0C(r2)     // Catch:{ all -> 0x06da }
            r2.close()     // Catch:{ all -> 0x06e6 }
            r8.close()
            goto L_0x0064
        L_0x005d:
            r2.close()     // Catch:{ all -> 0x06e6 }
            r8.close()
            r1 = 0
        L_0x0064:
            r6.A00 = r1
            if (r1 == 0) goto L_0x0022
        L_0x0068:
            com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity r0 = r6.A03
            X.3Ex r0 = r0.A03
            X.3ZH r2 = r0.A07(r1)
            if (r2 == 0) goto L_0x0022
            X.36r r1 = X.C86664Kz.A1B()
            java.lang.Object r0 = r3.A00
            X.4Wj r0 = (X.C87854Wj) r0
            com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity r5 = r0.A01
            android.content.Intent r4 = r1.A1L(r5, r2)
            long r1 = r6.A01
            java.lang.String r0 = "row_id"
            r4.putExtra(r0, r1)
            goto L_0x06f0
        L_0x0089:
            java.lang.Object r2 = r3.A00
            com.whatsapp.textstatuscomposer.TextStatusComposerActivity r2 = (com.whatsapp.textstatuscomposer.TextStatusComposerActivity) r2
            X.3Ls r0 = r2.A0M
            if (r0 == 0) goto L_0x0022
            X.7Kq r0 = r0.A09
            if (r0 == 0) goto L_0x0022
            java.lang.String r1 = r0.A01
            java.lang.String r0 = "video/mp4"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x070a
            java.lang.String r0 = "image/gif"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x070a
            return
        L_0x00a8:
            java.lang.Object r4 = r3.A01
            X.2iT r4 = (X.C50612iT) r4
            boolean r0 = r4.A06
            if (r0 != 0) goto L_0x0022
            java.lang.Object r0 = r3.A00
            X.4Wi r0 = (X.C87844Wi) r0
            com.whatsapp.stickers.store.StickerStoreTabFragment r0 = r0.A01
            com.whatsapp.stickers.stickerpack.StickerPackDownloader r3 = r0.A0D
            r5 = 0
            r8 = 2
            r9 = 1
            goto L_0x010b
        L_0x00bc:
            java.lang.Object r0 = r3.A00
            X.52B r0 = (X.AnonymousClass52B) r0
            com.whatsapp.stickers.store.StickerStoreMyTabFragment r0 = r0.A00
            X.0df r5 = r0.A0I
            if (r5 == 0) goto L_0x0022
            java.lang.Object r4 = r3.A01
            X.2iT r4 = (X.C50612iT) r4
            com.whatsapp.stickers.store.ConfirmPackDeleteDialogFragment r3 = new com.whatsapp.stickers.store.ConfirmPackDeleteDialogFragment
            r3.<init>()
            android.os.Bundle r2 = X.AnonymousClass002.A08()
            java.lang.String r1 = r4.A0G
            java.lang.String r0 = "pack_id"
            r2.putString(r0, r1)
            java.lang.String r1 = "pack_name"
            java.lang.String r0 = r4.A0I
            r2.putString(r1, r0)
            r3.A0u(r2)
            java.lang.String r0 = "confirm_delete"
            X.AnonymousClass344.A02(r3, r5, r0)
            return
        L_0x00ea:
            java.lang.Object r4 = r3.A01
            X.2iT r4 = (X.C50612iT) r4
            boolean r0 = r4.A06
            if (r0 != 0) goto L_0x0022
            java.lang.Object r0 = r3.A00
            X.52A r0 = (X.AnonymousClass52A) r0
            com.whatsapp.stickers.store.StickerStoreFeaturedTabFragment r3 = r0.A01
            X.2sn r2 = r3.A0C
            java.lang.String r0 = "StickerRepository/markStickerPackAsSeenAsync/begin"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.4FS r1 = r2.A0Z
            r0 = 16
            X.C86634Kw.A1Q(r1, r2, r4, r0)
            com.whatsapp.stickers.stickerpack.StickerPackDownloader r3 = r3.A0D
            r5 = 0
            r8 = 2
            r9 = 0
        L_0x010b:
            r7 = r5
            r6 = r5
            r3.A01(r4, r5, r6, r7, r8, r9)
            return
        L_0x0111:
            java.lang.Object r1 = r3.A00
            com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment r1 = (com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment) r1
            android.content.Context r2 = r1.A1D()
            if (r2 == 0) goto L_0x0022
            java.lang.Object r0 = r3.A01
            X.34x r0 = (X.C624134x) r0
            X.2mS r0 = r0.A0z()
            if (r0 == 0) goto L_0x0022
            com.whatsapp.newsletter.NewsletterLinkLauncher r1 = r1.A0T
            X.4uY r3 = r0.A01
            int r0 = r0.A00
            long r6 = (long) r0
            r5 = 3
            X.59N r4 = X.AnonymousClass59N.STATUS_HEADER
            r1.A03(r2, r3, r4, r5, r6)
            return
        L_0x0133:
            java.lang.Object r0 = r3.A01
            X.0Ua r0 = (X.C05570Ua) r0
            int r1 = r0.A01()
            java.lang.Object r0 = r3.A00
            X.6He r0 = (X.C125276He) r0
            X.7IG r2 = r0.A05
            java.util.List r0 = r0.A08
            int r1 = X.AnonymousClass000.A09(r0, r1)
            com.whatsapp.settings.chat.wallpaper.WallpaperCategoriesActivity r4 = r2.A00
            boolean r5 = r2.A01
            r6 = 1
            if (r1 == 0) goto L_0x0196
            if (r1 == r6) goto L_0x0196
            r0 = 2
            if (r1 == r0) goto L_0x0189
            r0 = 3
            if (r1 == r0) goto L_0x017c
            r0 = 4
            if (r1 == r0) goto L_0x0733
            r0 = 5
            if (r1 != r0) goto L_0x0022
            X.4uZ r3 = r4.A06
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.settings.chat.wallpaper.DefaultWallpaperPreview"
        L_0x0168:
            android.content.Intent r1 = r2.setClassName(r1, r0)
            java.lang.String r0 = "chat_jid"
            X.C627336j.A0D(r1, r3, r0)
            java.lang.String r0 = "is_using_global_wallpaper"
            r1.putExtra(r0, r5)
        L_0x0176:
            r0 = 17
            r4.startActivityForResult(r1, r0)
            return
        L_0x017c:
            X.4uZ r3 = r4.A06
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.gallerypicker.GalleryPickerLauncher"
            goto L_0x0168
        L_0x0189:
            X.4uZ r3 = r4.A06
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.settings.chat.wallpaper.SolidColorWallpaper"
            goto L_0x0168
        L_0x0196:
            X.4uZ r3 = r4.A06
            if (r1 == 0) goto L_0x019b
            r6 = 0
        L_0x019b:
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.settings.chat.wallpaper.downloadable.picker.DownloadableWallpaperPickerActivity"
            android.content.Intent r1 = r2.setClassName(r1, r0)
            java.lang.String r0 = "chat_jid"
            X.C627336j.A0D(r1, r3, r0)
            java.lang.String r0 = "is_using_global_wallpaper"
            r1.putExtra(r0, r5)
            java.lang.String r0 = "IS_BRIGHT_KEY"
            r1.putExtra(r0, r6)
            goto L_0x0176
        L_0x01b9:
            java.lang.Object r1 = r3.A00
            X.4zr r1 = (X.C98124zr) r1
            android.app.Activity r4 = X.C111095hX.A04(r1)
            boolean r0 = r4 instanceof X.C89654ea
            if (r0 == 0) goto L_0x0022
            java.lang.Object r8 = r3.A01
            X.1nF r8 = (X.AnonymousClass1nF) r8
            X.5Tg r9 = r1.A07
            X.3Wi r5 = r1.A04
            X.2qk r3 = r1.A03
            X.4FS r11 = r1.A09
            X.5hX r2 = r1.A02
            X.2eF r7 = r1.A06
            X.4ea r4 = (X.C89654ea) r4
            X.5ZR r6 = r1.A05
            X.8y5 r10 = r1.A08
            X.C100335An.A00(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        L_0x01df:
            java.lang.Object r7 = r3.A01
            com.whatsapp.jid.UserJid r7 = (com.whatsapp.jid.UserJid) r7
            if (r7 == 0) goto L_0x0022
            java.lang.Object r0 = r3.A00
            X.4u1 r0 = (X.C95644u1) r0
            X.5GI r0 = r0.A08
            com.whatsapp.group.GroupChatInfoActivity r4 = r0.A00
            X.4uZ r6 = X.C106405Yw.A03(r7)
            com.whatsapp.status.viewmodels.StatusesViewModel r0 = r4.A1y
            if (r0 == 0) goto L_0x0760
            if (r6 == 0) goto L_0x0760
            X.5OF r2 = r0.A0D(r7)
            boolean r1 = r4.A2D
            r3 = 1
            if (r2 == 0) goto L_0x0760
            boolean r0 = r2.A00()
            if (r0 != r3) goto L_0x0760
            int r0 = r2.A01
            if (r0 > 0) goto L_0x020c
            if (r1 == 0) goto L_0x0760
        L_0x020c:
            com.whatsapp.status.viewmodels.StatusesViewModel r2 = r4.A1y
            java.lang.Integer r1 = X.C18290x4.A0d()
            r0 = 0
            r2.A0G(r6, r1, r0)
            r0 = 0
            android.content.Intent r0 = X.C627736r.A0S(r4, r6, r3, r0, r0)
            r4.startActivity(r0)
            return
        L_0x021f:
            java.lang.Object r0 = r3.A01
            X.6IG r0 = (X.AnonymousClass6IG) r0
            X.4tG r2 = r0.A00
            X.8ug r1 = r2.A0A
            if (r1 == 0) goto L_0x0022
            java.lang.Object r0 = r3.A00
            com.whatsapp.gallery.MediaGalleryFragmentBase r0 = (com.whatsapp.gallery.MediaGalleryFragmentBase) r0
            r0.A1S(r1, r2)
            return
        L_0x0231:
            java.lang.Object r0 = r3.A01
            com.whatsapp.events.EventInfoFragment r0 = (com.whatsapp.events.EventInfoFragment) r0
            X.3Wi r0 = r0.A02
            if (r0 == 0) goto L_0x0770
            X.4FU r4 = r0.A00
            if (r4 == 0) goto L_0x0022
            java.lang.Object r0 = r3.A00
            X.34x r0 = (X.C624134x) r0
            android.os.Bundle r2 = X.AnonymousClass002.A08()
            X.2z0 r0 = r0.A1J
            X.C107395bF.A07(r2, r0)
            com.whatsapp.events.EventResponseBottomSheet r1 = new com.whatsapp.events.EventResponseBottomSheet
            r1.<init>()
            r1.A0u(r2)
            java.lang.String r0 = "EVENT_RESPONSE_BOTTOM_SHEET"
            r4.Bon(r1, r0)
            return
        L_0x0258:
            java.lang.Object r2 = r3.A01
            X.0O1 r2 = (X.AnonymousClass0O1) r2
            java.lang.Object r1 = r3.A00
            r0 = 0
            r2.A00(r0, r1)
            return
        L_0x0263:
            java.lang.Object r0 = r3.A01
            X.2wx r0 = (X.C59462wx) r0
            java.lang.Object r2 = r3.A00
            android.content.Context r2 = (android.content.Context) r2
            X.5Q7 r1 = r0.A00
            r0 = 0
            r1.A00(r2, r0)
            return
        L_0x0272:
            java.lang.Object r2 = r3.A01
            X.5LV r2 = (X.AnonymousClass5LV) r2
            android.view.View r1 = r2.A06
            r0 = 0
            r1.setVisibility(r0)
            android.view.View r1 = r2.A06
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.setAlpha(r0)
            java.lang.Object r0 = r3.A00
            X.51u r0 = (X.AnonymousClass51u) r0
            r0.A0Q()
            return
        L_0x028b:
            r0 = 0
            X.C162457s7.A0J(r5, r0)
            java.lang.Object r0 = r3.A01
            X.5Ut r0 = (X.C105395Ut) r0
            X.8ss r4 = r0.A00
            android.content.Context r2 = r5.getContext()
            java.lang.Object r1 = r3.A00
            android.net.Uri r1 = (android.net.Uri) r1
            r0 = 0
            r4.BkW(r2, r1, r0)
            return
        L_0x02a2:
            java.lang.Object r0 = r3.A01
            X.0Ua r0 = (X.C05570Ua) r0
            int r9 = r0.A01()
            java.lang.Object r2 = r3.A00
            X.6Hf r2 = (X.C125286Hf) r2
            int r1 = r2.getItemViewType(r9)
            r0 = 1
            if (r1 != r0) goto L_0x02b7
            int r9 = r9 + -1
        L_0x02b7:
            X.7EW r0 = r2.A01
            java.util.ArrayList r8 = X.AnonymousClass001.A0s()
            com.whatsapp.settings.chat.wallpaper.downloadable.picker.DownloadableWallpaperPickerActivity r5 = r0.A00
            java.util.List r0 = r5.A07
            X.C626936e.A06(r0)
            java.util.List r0 = r5.A07
            java.util.Iterator r1 = r0.iterator()
        L_0x02ca:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x02de
            java.lang.Object r0 = r1.next()
            java.io.File r0 = (java.io.File) r0
            android.net.Uri r0 = android.net.Uri.fromFile(r0)
            r8.add(r0)
            goto L_0x02ca
        L_0x02de:
            java.util.ArrayList r7 = X.AnonymousClass001.A0s()
            java.util.ArrayList r6 = X.AnonymousClass001.A0s()
            X.0PJ r0 = r5.A02
            if (r0 == 0) goto L_0x0300
            java.lang.Object r0 = r0.A00
            X.C626936e.A06(r0)
            java.util.Collection r0 = (java.util.Collection) r0
            r7.addAll(r0)
            X.0PJ r0 = r5.A02
            java.lang.Object r0 = r0.A01
            X.C626936e.A06(r0)
            java.util.Collection r0 = (java.util.Collection) r0
            r6.addAll(r0)
        L_0x0300:
            X.4uZ r4 = r5.A00
            boolean r3 = r5.A01
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r5.getPackageName()
            java.lang.String r0 = "com.whatsapp.settings.chat.wallpaper.downloadable.picker.DownloadableWallpaperPreviewActivity"
            android.content.Intent r1 = r2.setClassName(r1, r0)
            java.lang.String r0 = "STARTING_POSITION_KEY"
            r1.putExtra(r0, r9)
            java.lang.String r0 = "THUMBNAIL_URIS_KEY"
            r1.putExtra(r0, r8)
            java.lang.String r0 = "WHATSAPP_THUMBNAIL_RES_KEY"
            r1.putExtra(r0, r7)
            java.lang.String r0 = "WHATSAPP_FULL_RES_KEY"
            r1.putExtra(r0, r6)
            java.lang.String r0 = "chat_jid"
            X.C627336j.A0D(r1, r4, r0)
            java.lang.String r0 = "is_using_global_wallpaper"
            r1.putExtra(r0, r3)
            r0 = 111(0x6f, float:1.56E-43)
            r5.startActivityForResult(r1, r0)
            return
        L_0x0336:
            java.lang.Object r0 = r3.A00
            X.4Pb r0 = (X.AnonymousClass4Pb) r0
            X.1fd r1 = r0.A0B
            android.content.Context r2 = r0.getContext()
            java.lang.Object r0 = r3.A01
            X.1n9 r0 = (X.AnonymousClass1n9) r0
            double r5 = r0.A00
            double r7 = r0.A01
            java.lang.String r3 = r0.A01
            java.lang.String r4 = r0.A00
            r1.A08(r2, r3, r4, r5, r7)
            return
        L_0x0350:
            com.whatsapp.languageselector.LanguageSelectorBottomSheet r2 = new com.whatsapp.languageselector.LanguageSelectorBottomSheet
            r2.<init>()
            java.lang.Object r1 = r3.A01
            com.whatsapp.WaTextView r1 = (com.whatsapp.WaTextView) r1
            X.5nQ r0 = new X.5nQ
            r0.<init>(r1, r3)
            r2.A06 = r0
            X.5nR r0 = new X.5nR
            r0.<init>(r3)
            r2.A07 = r0
            r1 = 0
            X.5ai r0 = new X.5ai
            r0.<init>(r2, r1, r3)
            r2.A05 = r0
            java.lang.Object r0 = r3.A00
            X.4ea r0 = (X.C89654ea) r0
            r0.Boo(r2)
            return
        L_0x0377:
            java.lang.Object r0 = r3.A00
            X.4Wv r0 = (X.C87974Wv) r0
            X.4UX r1 = r0.A09
            java.lang.Object r0 = r3.A01
            X.5rF r0 = (X.C117015rF) r0
            long r2 = r0.A00
            X.4UC r1 = r1.A07
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r1.A0H(r0)
            return
        L_0x038d:
            java.lang.Object r0 = r3.A01
            X.4wC r0 = (X.C96334wC) r0
            X.8ox r1 = r0.A01
            java.lang.Object r0 = r3.A00
            X.0Ua r0 = (X.C05570Ua) r0
            android.content.Context r0 = X.C86664Kz.A0T(r0)
            r1.Bag(r0)
            return
        L_0x039f:
            r0 = 0
            X.C162457s7.A0J(r5, r0)
            java.lang.Object r0 = r3.A01
            X.5NW r0 = (X.AnonymousClass5NW) r0
            android.view.View$OnClickListener r0 = r0.A00
            r0.onClick(r5)
            java.lang.Object r0 = r3.A00
            android.widget.PopupWindow r0 = (android.widget.PopupWindow) r0
            r0.dismiss()
            return
        L_0x03b4:
            java.lang.Object r2 = r3.A01
            X.8oi r2 = (X.C182618oi) r2
            r1 = r2
            X.4LD r1 = (X.AnonymousClass4LD) r1
            r0 = 1
            r1.A0A = r0
            java.lang.String r0 = "MediaCaptionDialog/dismiss/send"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r2.onDismiss()
            return
        L_0x03c7:
            java.lang.Object r0 = r3.A01
            X.8oj r0 = (X.C182628oj) r0
            r0.BbE()
            return
        L_0x03cf:
            java.lang.Object r0 = r3.A01
            X.8ti r0 = (X.C185458ti) r0
            X.5nY r0 = (X.C114755nY) r0
            X.8og r0 = r0.A00
            com.whatsapp.mediacomposer.MediaComposerActivity r0 = (com.whatsapp.mediacomposer.MediaComposerActivity) r0
            r0.A7E()
            return
        L_0x03dd:
            java.lang.Object r0 = r3.A01
            X.8ti r0 = (X.C185458ti) r0
            r0.BM5()
            return
        L_0x03e5:
            java.lang.Object r0 = r3.A01
            X.8og r0 = (X.C182598og) r0
            r0.BM5()
            return
        L_0x03ed:
            java.lang.Object r0 = r3.A01
            android.app.Activity r0 = (android.app.Activity) r0
            X.C107395bF.A05(r0)
            return
        L_0x03f5:
            java.lang.Object r2 = r3.A00
            X.5cU r2 = (X.C108145cU) r2
            java.lang.Object r3 = r3.A01
            X.7zt r3 = (X.C167177zt) r3
            X.33i r0 = r2.A18
            android.location.LocationManager r1 = r0.A0F()
            if (r1 == 0) goto L_0x041c
            java.lang.String r0 = "gps"
            boolean r0 = r1.isProviderEnabled(r0)
            if (r0 != 0) goto L_0x041c
            java.lang.String r0 = "network"
            boolean r0 = r1.isProviderEnabled(r0)
            if (r0 != 0) goto L_0x041c
            X.07r r1 = r2.A0X
            r0 = 2
            X.C621433s.A01(r1, r0)
            return
        L_0x041c:
            X.5U6 r1 = r2.A17
            r0 = 8
            r1.A03(r0)
            int r1 = r3.A00
            r0 = 2131429595(0x7f0b08db, float:1.8480867E38)
            if (r1 != r0) goto L_0x0511
            r5 = 900(0x384, float:1.261E-42)
        L_0x042c:
            android.location.Location r7 = r2.A06
            r6 = 0
            if (r7 == 0) goto L_0x043c
            float r1 = r7.getAccuracy()
            r0 = 1128792064(0x43480000, float:200.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x043c
            r7 = r6
        L_0x043c:
            X.07r r0 = r2.A0X
            android.content.Intent r1 = r0.getIntent()
            java.lang.String r0 = "quoted_message_row_id"
            r3 = 0
            long r0 = r1.getLongExtra(r0, r3)
            X.07r r8 = r2.A0X
            X.1fJ r9 = X.C86604Kt.A0c(r8)
            int r8 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r8 <= 0) goto L_0x0503
            X.2qz r3 = r2.A1S
            X.34x r6 = X.C55122pp.A00(r3, r0)
        L_0x045a:
            X.4uZ r11 = r2.A0Z
            if (r11 == 0) goto L_0x04f6
            X.33m r4 = r2.A12
            X.C626936e.A06(r11)
            X.5Kv r0 = r2.A0a
            com.whatsapp.mentions.MentionableEntry r0 = r0.A07
            java.lang.String r10 = r0.getStringText()
            X.5Kv r0 = r2.A0a
            com.whatsapp.mentions.MentionableEntry r0 = r0.A07
            java.util.List r9 = r0.getMentions()
            X.07r r0 = r2.A0X
            android.content.Intent r3 = r0.getIntent()
            java.lang.String r1 = "has_number_from_url"
            r0 = 0
            boolean r12 = r3.getBooleanExtra(r1, r0)
            java.lang.String r0 = "UserActions/userActionSendLiveLocation"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.35J r0 = r4.A1X
            r8 = 1
            X.2z0 r11 = r0.A04(r11, r8)
            X.2sH r13 = r4.A0V
            long r0 = r13.A0H()
            X.1n8 r3 = new X.1n8
            r3.<init>(r11, r0)
            if (r7 == 0) goto L_0x04a5
            double r0 = r7.getLatitude()
            r3.A00 = r0
            double r0 = r7.getLongitude()
            r3.A01 = r0
        L_0x04a5:
            r3.A02 = r8
            r3.A1G(r8)
            r3.A00 = r5
            r3.A03 = r10
            r3.A1g(r9)
            X.2Wx r0 = r4.A1a
            r0.A00(r3, r6)
            if (r12 == 0) goto L_0x04bc
            r0 = 4
            r3.A1B(r0)
        L_0x04bc:
            r4.A0O(r3)
            X.3Lv r15 = r4.A0l
            r0 = 2
            r15.A0a(r3, r0)
            X.2qk r9 = r4.A00
            X.2s4 r11 = r4.A08
            X.1io r6 = r4.A0u
            X.33K r5 = r4.A1E
            X.5ZR r14 = r4.A0Y
            X.7ky r10 = r4.A01
            X.2qB r0 = r4.A0v
            X.33o r1 = r4.A1G
            X.2Vv r12 = r4.A0S
            X.1uB r8 = new X.1uB
            r17 = r0
            r18 = r5
            r19 = r1
            r20 = r3
            r16 = r6
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r0 = 15
            r8.A01 = r0
            X.2oU r0 = r4.A0W
            android.content.Context r0 = r0.A00
            com.whatsapp.location.LocationSharingService.A04(r0, r1)
            X.4FS r0 = r4.A1r
            X.AnonymousClass0x7.A1B(r8, r0)
        L_0x04f6:
            X.07r r1 = r2.A0X
            r0 = 1000(0x3e8, float:1.401E-42)
            r1.setResult(r0)
            X.07r r0 = r2.A0X
            r0.finish()
            return
        L_0x0503:
            if (r9 == 0) goto L_0x045a
            X.2sH r0 = r2.A19
            long r0 = r0.A0H()
            X.1nT r6 = X.C385328b.A00(r9, r6, r6, r0)
            goto L_0x045a
        L_0x0511:
            r0 = 2131429597(0x7f0b08dd, float:1.8480871E38)
            if (r1 == r0) goto L_0x051d
            r0 = 2131429596(0x7f0b08dc, float:1.848087E38)
            r5 = 28800(0x7080, float:4.0357E-41)
            if (r1 == r0) goto L_0x042c
        L_0x051d:
            r5 = 3600(0xe10, float:5.045E-42)
            goto L_0x042c
        L_0x0521:
            java.lang.Object r0 = r3.A00
            X.03q r0 = (X.C003203q) r0
            X.0df r5 = r0.getSupportFragmentManager()
            java.lang.Object r0 = r3.A01
            java.lang.String r4 = r0.toString()
            java.lang.String r3 = "number"
            r2 = 0
            X.C162457s7.A0J(r4, r2)
            com.whatsapp.identity.CompareNumberBottomSheet r1 = new com.whatsapp.identity.CompareNumberBottomSheet
            r1.<init>()
            r0 = 1
            X.3Z6[] r0 = new X.AnonymousClass3Z6[r0]
            X.AnonymousClass3Z6.A09(r3, r4, r0, r2)
            android.os.Bundle r0 = X.C02820Hs.A00(r0)
            r1.A0u(r0)
            java.lang.String r0 = "CompareNumberBottomSheet"
            X.AnonymousClass344.A02(r1, r5, r0)
            return
        L_0x054d:
            X.1WJ r5 = new X.1WJ
            r5.<init>()
            java.lang.Object r4 = r3.A00
            X.7yG r4 = (X.C166177yG) r4
            int r2 = r4.A00
            r1 = 1
            r0 = 0
            if (r2 == r1) goto L_0x0560
            r0 = 2
            if (r2 != r0) goto L_0x0575
            r0 = 1
        L_0x0560:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.A00 = r0
            java.lang.Object r1 = r3.A01
            X.4td r1 = (X.C95424td) r1
            X.4FV r0 = r1.A06
            r0.BhD(r5)
            X.4AK r0 = r1.A08
            r0.BU5(r4)
            return
        L_0x0575:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Unexpected provider type "
            java.lang.IllegalArgumentException r1 = X.AnonymousClass000.A0G(r0, r1, r2)
            throw r1
        L_0x0580:
            java.lang.String r0 = "android.intent.action.INSERT"
            android.content.Intent r1 = X.AnonymousClass0x9.A09(r0)
            android.net.Uri r0 = android.provider.CalendarContract.Events.CONTENT_URI
            android.content.Intent r4 = r1.setData(r0)
            java.lang.Object r5 = r3.A00
            X.1mU r5 = (X.C30461mU) r5
            long r1 = r5.A00
            java.lang.String r0 = "beginTime"
            android.content.Intent r2 = r4.putExtra(r0, r1)
            java.lang.String r1 = r5.A04
            java.lang.String r0 = "title"
            android.content.Intent r4 = r2.putExtra(r0, r1)
            java.lang.Object r3 = r3.A01
            X.0eF r3 = (X.C08310eF) r3
            java.util.ArrayList r2 = X.AnonymousClass001.A0s()
            java.lang.String r1 = r5.A02
            if (r1 == 0) goto L_0x05b5
            int r0 = r1.length()
            if (r0 == 0) goto L_0x05b5
            r2.add(r1)
        L_0x05b5:
            java.lang.String r1 = r5.A03
            if (r1 == 0) goto L_0x05c2
            int r0 = r1.length()
            if (r0 == 0) goto L_0x05c2
            r2.add(r1)
        L_0x05c2:
            java.lang.String r0 = "\n\n"
            java.lang.String r1 = X.C73723fy.A09(r0, r2)
            java.lang.String r0 = "description"
            android.content.Intent r2 = r4.putExtra(r0, r1)
            X.2lS r0 = r5.A01
            if (r0 == 0) goto L_0x05e1
            java.lang.String r1 = r0.A02
        L_0x05d4:
            java.lang.String r0 = "eventLocation"
            android.content.Intent r0 = r2.putExtra(r0, r1)
            X.C162457s7.A0D(r0)
            r3.A0m(r0)
            return
        L_0x05e1:
            r1 = 0
            goto L_0x05d4
        L_0x05e3:
            java.lang.Object r0 = r3.A01
            X.8oO r0 = (X.C182428oO) r0
            r0.BNF()
            return
        L_0x05eb:
            java.lang.Object r0 = r3.A01
            X.5S9 r0 = (X.AnonymousClass5S9) r0
            r0.A03()
            return
        L_0x05f3:
            java.lang.Object r1 = r3.A00
            X.5Ou r1 = (X.C103885Ou) r1
            java.lang.Object r0 = r3.A01
            X.123 r0 = (X.AnonymousClass123) r0
            r1.A00(r0)
            return
        L_0x05ff:
            java.lang.Object r5 = r3.A00
            X.4pk r5 = (X.C94034pk) r5
            X.30v r4 = r5.A01
            java.lang.Object r2 = r3.A01
            X.4uZ r2 = (X.C95814uZ) r2
            r1 = 1
            X.2ss r0 = r4.A07
            X.31A r3 = X.C56982ss.A00(r0, r2)
            if (r3 == 0) goto L_0x0625
            int r0 = r3.A0B
            if (r0 == r1) goto L_0x0625
            r3.A0B = r1
            X.2m9 r2 = r4.A05
            r0 = 5
            X.3bx r1 = new X.3bx
            r1.<init>(r4, r0, r3)
            r0 = 44
            r2.A01(r1, r0)
        L_0x0625:
            android.view.ViewGroup r1 = r5.A02
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x062d:
            java.lang.Object r0 = r3.A01
            X.5R9 r0 = (X.AnonymousClass5R9) r0
            boolean r0 = r0.A0F
            if (r0 == 0) goto L_0x067f
            java.lang.Object r2 = r3.A00
            X.5l7 r2 = (X.C113245l7) r2
            X.5GK r0 = r2.A4C
            X.1VX r1 = r0.A00
            r0 = 3180(0xc6c, float:4.456E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 != 0) goto L_0x067f
            java.lang.String r8 = "group-suspend-appeal"
            X.4uZ r0 = r2.A4J
            X.1fJ r1 = X.AnonymousClass34R.A01(r0)
            if (r1 == 0) goto L_0x067d
            android.os.Bundle r5 = X.AnonymousClass002.A08()
            java.lang.String r0 = "com.whatsapp.support.DescribeProblemActivity.suspendedEntityJid"
            r5.putParcelable(r0, r1)
        L_0x0658:
            X.676 r1 = r2.A2z
            X.5WY r3 = r2.A1e
            X.4eZ r4 = r1.getActivity()
            X.676 r0 = r2.A2z
            X.2mi r0 = r0.getSupportGatingUtils()
            boolean r12 = r0.A00()
            r6 = 0
            r9 = r6
            r10 = r6
            r11 = r6
            r7 = r6
            android.content.Intent r0 = r3.A00(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r1.startActivity(r0)
        L_0x0676:
            X.676 r1 = r2.A2z
            r0 = 0
            r1.overridePendingTransition(r0, r0)
            return
        L_0x067d:
            r5 = 0
            goto L_0x0658
        L_0x067f:
            java.lang.Object r2 = r3.A00
            X.5l7 r2 = (X.C113245l7) r2
            X.3LP r1 = r2.A42
            X.4uZ r0 = r2.A4J
            boolean r0 = X.C57362tW.A00(r1, r0)
            if (r0 != 0) goto L_0x0676
            X.1VX r1 = X.C113245l7.A0E(r2)
            X.4uZ r0 = r2.A4J
            boolean r0 = X.C616831v.A00(r1, r0)
            if (r0 != 0) goto L_0x0676
            X.4eZ r1 = X.C113245l7.A09(r2)
            X.3ZH r0 = r2.A3n
            X.4uZ r4 = r0.A0H
            android.content.Intent r3 = X.C18320x8.A07()
            java.lang.String r1 = r1.getPackageName()
            java.lang.String r0 = "com.whatsapp.group.GroupAdminPickerActivity"
            r3.setClassName(r1, r0)
            java.lang.String r0 = "gid"
            X.C627336j.A0D(r3, r4, r0)
            X.676 r1 = r2.A2z
            r0 = 42
            r1.startActivityForResult(r3, r0)
            goto L_0x0676
        L_0x06bb:
            java.lang.Object r1 = r3.A00
            X.5l7 r1 = (X.C113245l7) r1
            X.67D r5 = r1.A2N
            X.4eZ r4 = X.C113245l7.A09(r1)
            java.lang.Object r0 = r3.A01
            X.5R9 r0 = (X.AnonymousClass5R9) r0
            X.1fJ r2 = r0.A07
            X.4eZ r1 = X.C113245l7.A09(r1)
            r0 = 2131430204(0x7f0b0b3c, float:1.8482102E38)
            android.view.View r0 = X.C005205m.A00(r1, r0)
            r5.Bg5(r4, r0, r2)
            return
        L_0x06da:
            r1 = move-exception
            if (r2 == 0) goto L_0x06e5
            r2.close()     // Catch:{ all -> 0x06e1 }
            goto L_0x06e5
        L_0x06e1:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x06e6 }
        L_0x06e5:
            throw r1     // Catch:{ all -> 0x06e6 }
        L_0x06e6:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x06eb }
            throw r1
        L_0x06eb:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x06f0:
            X.2qz r0 = r5.A0D     // Catch:{ all -> 0x0708 }
            X.34x r3 = X.C55122pp.A00(r0, r1)     // Catch:{ all -> 0x0708 }
            long r1 = r3.A1M
            java.lang.String r0 = "sort_id"
            r4.putExtra(r0, r1)
            X.2z0 r0 = r3.A1J
            X.C107395bF.A00(r4, r0)
            X.5hX r0 = r5.A00
            r0.A0B(r5, r4)
            return
        L_0x0708:
            r0 = move-exception
            throw r0
        L_0x070a:
            com.whatsapp.webpagepreview.WebPagePreviewView r1 = r2.A0r
            r0 = 1
            r1.setImageProgressBarVisibility(r0)
            java.lang.Object r0 = r3.A01
            X.C86634Kw.A1R(r0)
            X.4FS r6 = r2.A04
            X.3Dh r5 = r2.A04
            X.3Ls r0 = r2.A0M
            X.7Kq r0 = r0.A09
            java.lang.String r4 = r0.A02
            java.lang.String r2 = r0.A01
            r1 = 2
            X.6AX r0 = new X.6AX
            r0.<init>(r3, r1)
            X.54w r1 = new X.54w
            r1.<init>(r5, r0, r4, r2)
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            r6.BkL(r1, r0)
            return
        L_0x0733:
            r0 = 112(0x70, float:1.57E-43)
            X.2rj r1 = new X.2rj
            r1.<init>(r0)
            r0 = 2131895505(0x7f1224d1, float:1.9425845E38)
            java.lang.String r0 = r4.getString(r0)
            r1.A02(r0)
            r0 = 2131895504(0x7f1224d0, float:1.9425843E38)
            java.lang.String r0 = r4.getString(r0)
            r1.A05(r0)
            r0 = 2131895731(0x7f1225b3, float:1.9426303E38)
            java.lang.String r0 = r4.getString(r0)
            r1.A03(r0)
            com.whatsapp.dialogs.PromptDialogFragment r0 = r1.A00()
            r4.Boo(r0)
            return
        L_0x0760:
            java.lang.Integer r0 = X.C18290x4.A0b()
            X.5XB r1 = X.AnonymousClass5XB.A00(r5, r7, r0)
            X.1fJ r0 = r4.A1h
            r1.A01 = r0
            r1.A02(r4)
            return
        L_0x0770:
            java.lang.String r0 = "globalUI"
            java.lang.RuntimeException r1 = X.C18270x1.A0S(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass54E.A07(android.view.View):void");
    }

    public void onClick(View view) {
        if (8 - this.A02 == 0) {
            C162457s7.A0J(view, 0);
            C95294tG r3 = ((AnonymousClass6IG) this.A01).A00;
            C186058ug r2 = r3.A0A;
            MediaGalleryFragmentBase mediaGalleryFragmentBase = (MediaGalleryFragmentBase) this.A00;
            if (mediaGalleryFragmentBase.A1V() && r2 != null) {
                mediaGalleryFragmentBase.A1S(r2, r3);
                return;
            }
        }
        super.onClick(view);
    }
}
