package X;

import android.view.View;

/* renamed from: X.53y  reason: invalid class name and case insensitive filesystem */
public class C989753y extends C109665ez {
    public Object A00;
    public final int A01;

    public C989753y(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(View view, Object obj, int i) {
        view.setOnClickListener(new C989753y(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:137:0x033c, code lost:
        r0 = (X.AnonymousClass51w) ((X.C989753y) r0).A00;
        r1 = r0.A0T;
        r0 = r0.A06;
        r3 = r1.A02;
        r2 = r0.A1J;
        X.C162457s7.A0J(r2, 0);
        r1 = new com.whatsapp.status.StatusDeleteDialogFragment();
        r0 = X.AnonymousClass002.A08();
        X.C107395bF.A07(r0, r2);
        r1.A0u(r0);
        X.C57052sz.A01(r1, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0360, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0363, code lost:
        r0 = (X.AnonymousClass51w) ((X.C989753y) r0).A00;
        r0.A0T.A00(r0.A06);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0370, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0399, code lost:
        r3.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x039c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x0507, code lost:
        r2.A04(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x050a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001b, code lost:
        r3.A01(r2, r4, r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00f9, code lost:
        if (r2.A00() == false) goto L_0x00fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01e4, code lost:
        if (X.C18280x3.A1W(X.AnonymousClass0x2.A0F(r3.A09), "audience_selection_2") == false) goto L_0x0224;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01e6, code lost:
        r1 = new X.AnonymousClass5PH(r3);
        r7 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01ec, code lost:
        if (r4 == false) goto L_0x01ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01ee, code lost:
        r7 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01ef, code lost:
        r1.A0Q = java.lang.Integer.valueOf(r7);
        r1.A0O = 2000;
        r2 = r1.A03("com.whatsapp.contact.picker.AudienceSelectionContactPicker");
        r1 = r3.A0E;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0205, code lost:
        if (r1 == null) goto L_0x0237;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0207, code lost:
        r1.A01(r2, new X.C108845de(r3.A74().A07(), r3.A74().A08(), r7, false, false));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0220, code lost:
        r3.startActivityForResult(r2, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0223, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0224, code lost:
        r2 = X.C18320x8.A07();
        r2.setClassName(r3.getPackageName(), "com.whatsapp.status.audienceselector.StatusRecipientsActivity");
        r2.putExtra("is_black_list", r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x023d, code lost:
        throw X.C18270x1.A0S("audienceRepository");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(android.view.View r18) {
        /*
            r17 = this;
            r0 = r17
            int r1 = r0.A01
            r5 = r18
            switch(r1) {
                case 0: goto L_0x0180;
                case 1: goto L_0x0180;
                case 2: goto L_0x01a9;
                case 3: goto L_0x01b5;
                case 4: goto L_0x01cc;
                case 5: goto L_0x01d2;
                case 6: goto L_0x023e;
                case 7: goto L_0x024c;
                case 8: goto L_0x026e;
                case 9: goto L_0x02ac;
                case 10: goto L_0x02b4;
                case 11: goto L_0x02d1;
                case 12: goto L_0x001f;
                case 13: goto L_0x0009;
                case 14: goto L_0x0009;
                case 15: goto L_0x0034;
                case 16: goto L_0x0047;
                case 17: goto L_0x02f8;
                case 18: goto L_0x0307;
                case 19: goto L_0x0314;
                case 20: goto L_0x0324;
                case 21: goto L_0x033a;
                case 22: goto L_0x0361;
                case 23: goto L_0x0371;
                case 24: goto L_0x033c;
                case 25: goto L_0x0363;
                case 26: goto L_0x001e;
                case 27: goto L_0x006d;
                case 28: goto L_0x039d;
                case 29: goto L_0x048e;
                case 30: goto L_0x04c3;
                case 31: goto L_0x04cb;
                case 32: goto L_0x04d3;
                case 33: goto L_0x04e1;
                case 34: goto L_0x00d0;
                case 35: goto L_0x0109;
                case 36: goto L_0x04f4;
                case 37: goto L_0x050b;
                case 38: goto L_0x052b;
                case 39: goto L_0x0139;
                case 40: goto L_0x0533;
                case 41: goto L_0x015d;
                case 42: goto L_0x057b;
                case 43: goto L_0x058f;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r0 = r0.A00
            X.5TV r0 = (X.AnonymousClass5TV) r0
            X.5Gq r0 = r0.A0M
            java.lang.Integer r4 = X.C18310x6.A0e()
            X.51v r0 = r0.A00
            X.5SJ r3 = r0.A0T
            X.34x r2 = r0.A06
            r1 = 1
            r0 = 0
        L_0x001b:
            r3.A01(r2, r4, r1, r0)
        L_0x001e:
            return
        L_0x001f:
            java.lang.Object r0 = r0.A00
            X.0eF r0 = (X.C08310eF) r0
            X.03q r1 = r0.A0Q()
            X.65e r1 = (X.C1226465e) r1
            if (r1 == 0) goto L_0x001e
            r0 = 2
            com.whatsapp.status.playback.StatusPlaybackActivity r1 = (com.whatsapp.status.playback.StatusPlaybackActivity) r1
            r1.A03 = r0
            r1.finish()
            return
        L_0x0034:
            java.lang.Object r0 = r0.A00
            X.5TV r0 = (X.AnonymousClass5TV) r0
            X.5Gq r0 = r0.A0M
            java.lang.Integer r4 = X.C18310x6.A0e()
            X.51v r0 = r0.A00
            X.5SJ r3 = r0.A0T
            X.34x r2 = r0.A06
            r1 = 0
            r0 = 1
            goto L_0x001b
        L_0x0047:
            java.lang.Object r5 = r0.A00
            X.51w r5 = (X.AnonymousClass51w) r5
            X.34x r2 = r5.A06
            X.1mV r2 = (X.C30471mV) r2
            boolean r0 = r2.A1N
            if (r0 != 0) goto L_0x001e
            X.33C r0 = X.C30471mV.A00(r2)
            int r0 = r0.A07
            r4 = 1
            if (r0 != r4) goto L_0x05b4
            byte r3 = r2.A1I
            X.3Wi r2 = r5.A0D
            r1 = 2
            r0 = 2131889529(0x7f120d79, float:1.9413724E38)
            if (r3 != r1) goto L_0x0069
            r0 = 2131889528(0x7f120d78, float:1.9413722E38)
        L_0x0069:
            r2.A0F(r0, r4)
            return
        L_0x006d:
            java.lang.Object r4 = r0.A00
            X.51v r4 = (X.AnonymousClass51v) r4
            X.5U1 r0 = r4.A0K
            X.34x r3 = r4.A06
            boolean r0 = r0.A04(r3)
            if (r0 == 0) goto L_0x001e
            X.5Yq r5 = r4.A0D
            java.lang.Integer r0 = X.C18290x4.A0b()
            X.4rW r2 = new X.4rW
            r2.<init>()
            r2.A01 = r0
            X.2z0 r1 = r3.A1J
            boolean r0 = r1.A02
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A00 = r0
            java.lang.Integer r0 = X.C106355Yq.A00(r3)
            r2.A02 = r0
            X.4uZ r1 = r1.A00
            boolean r0 = X.C627336j.A0K(r1)
            if (r0 == 0) goto L_0x00bd
            r0 = 1
        L_0x00a1:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A03 = r0
            X.4FV r0 = r5.A00
            r0.BhD(r2)
            X.33m r2 = r4.A02
            android.view.View r0 = r4.A00
            X.C626936e.A04(r0)
            android.app.Activity r1 = X.C111095hX.A04(r0)
            X.5hX r0 = r4.A0B
            r2.A06(r1, r0, r3)
            return
        L_0x00bd:
            boolean r0 = r1 instanceof X.C135166kE
            if (r0 == 0) goto L_0x00c3
            r0 = 4
            goto L_0x00a1
        L_0x00c3:
            boolean r0 = r1 instanceof X.AnonymousClass1fS
            if (r0 == 0) goto L_0x00c9
            r0 = 2
            goto L_0x00a1
        L_0x00c9:
            boolean r0 = r1 instanceof X.C95804uY
            int r0 = X.C86664Kz.A04(r0)
            goto L_0x00a1
        L_0x00d0:
            java.lang.Object r1 = r0.A00
            com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity r1 = (com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity) r1
            X.2iT r2 = r1.A0L
            if (r2 == 0) goto L_0x001e
            boolean r0 = r2.A06
            if (r0 == 0) goto L_0x00e2
            boolean r0 = r2.A00()
            if (r0 == 0) goto L_0x001e
        L_0x00e2:
            r0 = 1
            r2.A06 = r0
            r1.A74()
            boolean r0 = r1.A0a
            if (r0 == 0) goto L_0x0102
            r6 = 5
        L_0x00ed:
            com.whatsapp.stickers.stickerpack.StickerPackDownloader r1 = r1.A0P
            r3 = 0
            java.lang.String r0 = r2.A03
            if (r0 == 0) goto L_0x00fb
            boolean r0 = r2.A00()
            r7 = 1
            if (r0 != 0) goto L_0x00fc
        L_0x00fb:
            r7 = 0
        L_0x00fc:
            r5 = r3
            r4 = r3
            r1.A01(r2, r3, r4, r5, r6, r7)
            return
        L_0x0102:
            boolean r0 = r1.A0b
            int r6 = X.C18280x3.A01(r0)
            goto L_0x00ed
        L_0x0109:
            java.lang.Object r5 = r0.A00
            com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity r5 = (com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity) r5
            X.2iT r4 = r5.A0L
            X.C626936e.A06(r4)
            boolean r0 = r4.A0T
            if (r0 != 0) goto L_0x011a
            java.lang.String r0 = r4.A03
            if (r0 == 0) goto L_0x001e
        L_0x011a:
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
            r0 = 0
            r5.Bon(r3, r0)
            return
        L_0x0139:
            java.lang.Object r2 = r0.A00
            com.whatsapp.twofactor.SetEmailFragment r2 = (com.whatsapp.twofactor.SetEmailFragment) r2
            java.lang.String r0 = "setemailfragment/submit"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            int r1 = r2.A00
            r0 = 1
            r3 = 2
            if (r1 == r0) goto L_0x05d8
            if (r1 != r3) goto L_0x001e
            com.whatsapp.twofactor.TwoFactorAuthActivity r0 = r2.A07
            java.lang.String r1 = r0.A04
            java.lang.String r0 = r0.A05
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto L_0x05f5
            com.whatsapp.twofactor.TwoFactorAuthActivity r1 = r2.A07
            r0 = 0
            r1.A76(r0)
            return
        L_0x015d:
            java.lang.Object r3 = r0.A00
            com.whatsapp.voipcalling.VoipActivityV2 r3 = (com.whatsapp.voipcalling.VoipActivityV2) r3
            r1 = 8
            X.5UY r0 = r3.A1o
            if (r0 == 0) goto L_0x016a
            r0.A06(r1)
        L_0x016a:
            r2 = 0
            android.net.Uri r1 = r3.A6D()
            r0 = 1
            android.content.Intent r0 = X.C627736r.A0I(r3, r1, r2, r0)
            r3.startActivity(r0)
            r1 = 0
            X.5UY r0 = r3.A1o
            if (r0 == 0) goto L_0x001e
            r0.A06(r1)
            return
        L_0x0180:
            java.lang.Object r5 = r0.A00
            X.4el r5 = (X.C89704el) r5
            android.content.Intent r0 = r5.getIntent()
            java.lang.String r4 = "chat_jid"
            java.lang.String r0 = r0.getStringExtra(r4)
            X.4uZ r3 = X.C18310x6.A0S(r0)
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r5.getPackageName()
            java.lang.String r0 = "com.whatsapp.settings.chat.wallpaper.WallpaperCategoriesActivity"
            android.content.Intent r1 = r2.setClassName(r1, r0)
            X.C627336j.A0D(r1, r3, r4)
            r0 = 199(0xc7, float:2.79E-43)
            r5.startActivityForResult(r1, r0)
            return
        L_0x01a9:
            java.lang.Object r0 = r0.A00
            X.0eF r0 = (X.C08310eF) r0
            X.03q r0 = r0.A0Q()
            X.C107395bF.A05(r0)
            return
        L_0x01b5:
            java.lang.Object r0 = r0.A00
            com.whatsapp.status.audienceselector.StatusPrivacyActivity r0 = (com.whatsapp.status.audienceselector.StatusPrivacyActivity) r0
            r0.A77()
            android.widget.RadioButton r1 = r0.A02
            if (r1 != 0) goto L_0x01c7
            java.lang.String r0 = "myContactsButton"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x01c7:
            r0 = 1
            r1.setChecked(r0)
            return
        L_0x01cc:
            java.lang.Object r3 = r0.A00
            com.whatsapp.status.audienceselector.StatusPrivacyActivity r3 = (com.whatsapp.status.audienceselector.StatusPrivacyActivity) r3
            r4 = 1
            goto L_0x01d7
        L_0x01d2:
            java.lang.Object r3 = r0.A00
            com.whatsapp.status.audienceselector.StatusPrivacyActivity r3 = (com.whatsapp.status.audienceselector.StatusPrivacyActivity) r3
            r4 = 0
        L_0x01d7:
            X.33p r0 = r3.A09
            java.lang.String r1 = "audience_selection_2"
            android.content.SharedPreferences r0 = X.AnonymousClass0x2.A0F(r0)
            boolean r0 = X.C18280x3.A1W(r0, r1)
            r8 = 0
            if (r0 == 0) goto L_0x0224
            X.5PH r1 = new X.5PH
            r1.<init>(r3)
            r7 = 1
            if (r4 == 0) goto L_0x01ef
            r7 = 2
        L_0x01ef:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r1.A0Q = r0
            r0 = 2000(0x7d0, float:2.803E-42)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A0O = r0
            java.lang.String r0 = "com.whatsapp.contact.picker.AudienceSelectionContactPicker"
            android.content.Intent r2 = r1.A03(r0)
            X.5TZ r1 = r3.A0E
            if (r1 == 0) goto L_0x0237
            X.33e r0 = r3.A74()
            java.util.List r5 = r0.A07()
            X.33e r0 = r3.A74()
            java.util.List r6 = r0.A08()
            X.5de r4 = new X.5de
            r9 = r8
            r4.<init>(r5, r6, r7, r8, r9)
            r1.A01(r2, r4)
        L_0x0220:
            r3.startActivityForResult(r2, r8)
            return
        L_0x0224:
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.status.audienceselector.StatusRecipientsActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "is_black_list"
            r2.putExtra(r0, r4)
            goto L_0x0220
        L_0x0237:
            java.lang.String r0 = "audienceRepository"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x023e:
            java.lang.Object r0 = r0.A00
            com.whatsapp.status.playback.MessageReplyActivity r0 = (com.whatsapp.status.playback.MessageReplyActivity) r0
            r0.A75()
            r0.A78()
            r0.A76()
            return
        L_0x024c:
            java.lang.Object r4 = r0.A00
            com.whatsapp.status.playback.MessageReplyActivity r4 = (com.whatsapp.status.playback.MessageReplyActivity) r4
            X.2sq r1 = r4.A0O
            X.4uZ r0 = r4.A0p
            boolean r0 = X.C86614Ku.A1X(r1, r0)
            if (r0 == 0) goto L_0x0260
            r0 = 106(0x6a, float:1.49E-43)
            X.C621433s.A01(r4, r0)
            return
        L_0x0260:
            X.4fS r3 = r4.A0U
            android.widget.ImageButton r2 = r4.A0C
            boolean r1 = r4.A1T
            r0 = 2
            if (r1 == 0) goto L_0x026a
            r0 = 5
        L_0x026a:
            r3.A0C(r2, r0)
            return
        L_0x026e:
            java.lang.Object r1 = r0.A00
            com.whatsapp.status.playback.MyStatusesActivity r1 = (com.whatsapp.status.playback.MyStatusesActivity) r1
            X.0Th r2 = r1.A02
            if (r2 == 0) goto L_0x027b
            X.0QK r2 = r2.A05
            r2.A01()
        L_0x027b:
            java.lang.Object r8 = r5.getTag()
            X.34x r8 = (X.C624134x) r8
            android.content.Context r4 = r5.getContext()
            X.5Se r14 = r1.A0j
            X.5rC r6 = r1.A04
            com.whatsapp.bridge.wfal.WfalManager r7 = r1.A0A
            X.5Tp r10 = r1.A0V
            X.5mK r11 = r1.A0X
            X.5YA r13 = r1.A0h
            X.2aN r12 = r1.A0f
            X.8qC r15 = r1.A0k
            boolean r16 = X.AnonymousClass4SG.A45(r1)
            X.5Il r9 = r1.A0T
            X.4Sk r3 = new X.4Sk
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r1.A02 = r3
            r2 = 1
            X.68q r1 = new X.68q
            r1.<init>(r0, r2, r8)
            r3.A01 = r1
            goto L_0x0399
        L_0x02ac:
            java.lang.Object r0 = r0.A00
            com.whatsapp.status.playback.MyStatusesActivity r0 = (com.whatsapp.status.playback.MyStatusesActivity) r0
            r0.A75()
            return
        L_0x02b4:
            java.lang.Object r1 = r0.A00
            com.whatsapp.status.playback.MyStatusesActivity r1 = (com.whatsapp.status.playback.MyStatusesActivity) r1
            X.2X0 r0 = r1.A0W
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x02c5
            X.5mK r0 = r1.A0X
            r0.A04()
        L_0x02c5:
            java.lang.Integer r0 = X.C18290x4.A0c()
            android.content.Intent r0 = X.C627736r.A0q(r1, r0)
            r1.startActivity(r0)
            return
        L_0x02d1:
            java.lang.Object r2 = r0.A00
            com.whatsapp.status.playback.MyStatusesActivity r2 = (com.whatsapp.status.playback.MyStatusesActivity) r2
            java.lang.Object r1 = r5.getTag()
            X.34x r1 = (X.C624134x) r1
            X.0R2 r0 = r2.A01
            if (r0 == 0) goto L_0x02e2
            r0.A05()
        L_0x02e2:
            byte r0 = r1.A1I
            boolean r0 = X.C627636p.A0H(r0)
            if (r0 == 0) goto L_0x02f2
            X.5Ul r0 = r2.A08
            X.1mV r1 = (X.C30471mV) r1
            r0.A07(r1)
            return
        L_0x02f2:
            X.33m r0 = r2.A09
            r0.A0P(r1)
            return
        L_0x02f8:
            java.lang.Object r0 = r0.A00
            X.51w r0 = (X.AnonymousClass51w) r0
            X.5Ul r2 = r0.A0E
            X.34x r1 = r0.A06
            X.1mV r1 = (X.C30471mV) r1
            r0 = 1
            r2.A08(r1, r0, r0)
            return
        L_0x0307:
            java.lang.Object r0 = r0.A00
            X.51w r0 = (X.AnonymousClass51w) r0
            X.2re r2 = r0.A05
            X.34x r1 = r0.A06
            r0 = 1
            r2.A04(r1, r0)
            return
        L_0x0314:
            java.lang.Object r0 = r0.A00
            X.51x r0 = (X.AnonymousClass51x) r0
            com.google.android.material.bottomsheet.BottomSheetBehavior r2 = r0.A00
            int r1 = r2.A0O
            r0 = 3
            if (r1 != r0) goto L_0x0320
            r0 = 4
        L_0x0320:
            r2.A0S(r0)
            return
        L_0x0324:
            java.lang.Object r0 = r0.A00
            X.53y r0 = (X.C989753y) r0
            java.lang.Object r0 = r0.A00
            X.51w r0 = (X.AnonymousClass51w) r0
            X.5SJ r4 = r0.A0T
            X.34x r3 = r0.A06
            java.lang.Integer r2 = X.C18300x5.A0Y()
            r1 = 1
            r0 = 0
            r4.A01(r3, r2, r1, r0)
            return
        L_0x033a:
            java.lang.Object r0 = r0.A00
        L_0x033c:
            X.53y r0 = (X.C989753y) r0
            java.lang.Object r0 = r0.A00
            X.51w r0 = (X.AnonymousClass51w) r0
            X.5SJ r1 = r0.A0T
            X.34x r0 = r0.A06
            com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment r3 = r1.A02
            X.2z0 r2 = r0.A1J
            r0 = 0
            X.C162457s7.A0J(r2, r0)
            com.whatsapp.status.StatusDeleteDialogFragment r1 = new com.whatsapp.status.StatusDeleteDialogFragment
            r1.<init>()
            android.os.Bundle r0 = X.AnonymousClass002.A08()
            X.C107395bF.A07(r0, r2)
            r1.A0u(r0)
            X.C57052sz.A01(r1, r3)
            return
        L_0x0361:
            java.lang.Object r0 = r0.A00
        L_0x0363:
            X.53y r0 = (X.C989753y) r0
            java.lang.Object r0 = r0.A00
            X.51w r0 = (X.AnonymousClass51w) r0
            X.5SJ r1 = r0.A0T
            X.34x r0 = r0.A06
            r1.A00(r0)
            return
        L_0x0371:
            android.content.Context r4 = r5.getContext()
            java.lang.Object r1 = r0.A00
            X.51v r1 = (X.AnonymousClass51v) r1
            X.34x r6 = r1.A06
            X.5Se r11 = r1.A0R
            X.5YA r10 = r1.A0Q
            r1 = 20
            X.53y r7 = new X.53y
            r7.<init>(r0, r1)
            r1 = 21
            X.53y r8 = new X.53y
            r8.<init>(r0, r1)
            r1 = 22
            X.53y r9 = new X.53y
            r9.<init>(r0, r1)
            X.4Sj r3 = new X.4Sj
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
        L_0x0399:
            r3.A00()
            return
        L_0x039d:
            java.lang.Object r3 = r0.A00
            com.whatsapp.status.privacy.StatusPrivacyBottomSheetDialogFragment r3 = (com.whatsapp.status.privacy.StatusPrivacyBottomSheetDialogFragment) r3
            X.2X0 r0 = r3.A07
            if (r0 == 0) goto L_0x0487
            boolean r0 = r0.A00()
            java.lang.String r7 = "statusDistributionInfo"
            r5 = 0
            if (r0 == 0) goto L_0x03f6
            X.5mK r0 = r3.A08
            if (r0 == 0) goto L_0x03bb
            X.5de r2 = r3.A03
            if (r2 != 0) goto L_0x03c2
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r7)
            throw r0
        L_0x03bb:
            java.lang.String r0 = "statusesStatsManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x03c2:
            X.5Z9 r6 = r0.A0C
            X.2X0 r0 = r6.A04
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x03f6
            X.4sW r4 = r6.A01()
            r0 = 26
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.A03 = r0
            X.5Hx r1 = r6.A05
            java.lang.Integer r0 = r1.A01
            r4.A02 = r0
            java.lang.Integer r0 = r1.A00
            r4.A01 = r0
            int r2 = r2.A00
            r1 = 1
            if (r2 == 0) goto L_0x0403
            r0 = 1
            r1 = 3
            if (r2 == r0) goto L_0x0403
            r1 = 2
            if (r2 == r1) goto L_0x0403
            r0 = 0
        L_0x03ef:
            r4.A04 = r0
            X.4FV r0 = r6.A02
            r0.BhB(r4)
        L_0x03f6:
            boolean r0 = r3.A0G
            if (r0 == 0) goto L_0x0450
            X.5de r0 = r3.A03
            if (r0 != 0) goto L_0x0408
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r7)
            throw r0
        L_0x0403:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            goto L_0x03ef
        L_0x0408:
            boolean r4 = r0.A03
            X.8qC r0 = r3.A0F
            if (r0 == 0) goto L_0x0480
            X.5hb r2 = X.C86644Kx.A0c(r0)
            r1 = 927605897(0x374a2489, float:1.2048645E-5)
            java.lang.String r0 = "TAP_AUDIENCE_SELECTOR_TOGGLE"
            r2.A03(r1, r5, r0)
            X.8qC r0 = r3.A0F
            if (r0 == 0) goto L_0x0479
            X.5hb r2 = X.C86644Kx.A0c(r0)
            java.lang.Boolean r1 = X.C18320x8.A0V(r4)
            java.lang.String r0 = "initial_auto_setting"
            r2.A06(r0, r1)
            X.8qC r0 = r3.A0F
            if (r0 == 0) goto L_0x0472
            X.5hb r2 = X.C86644Kx.A0c(r0)
            java.lang.String r1 = "final_auto_setting"
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r2.A06(r1, r0)
            X.2rK r1 = r3.A0C
            if (r1 == 0) goto L_0x046b
            X.21S r0 = com.whatsapp.status.privacy.StatusPrivacyBottomSheetDialogFragment.A0K
            r1.A04(r0, r4)
            X.8qC r0 = r3.A0F
            if (r0 == 0) goto L_0x0464
            X.5hb r0 = X.C86644Kx.A0c(r0)
            r0.A01()
        L_0x0450:
            X.65f r1 = r3.A0A
            if (r1 == 0) goto L_0x0460
            X.5de r0 = r3.A03
            if (r0 != 0) goto L_0x045d
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r7)
            throw r0
        L_0x045d:
            r1.BcV(r0)
        L_0x0460:
            r3.A1K()
            return
        L_0x0464:
            java.lang.String r0 = "xFamilyUserFlowLoggerLazy"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x046b:
            java.lang.String r0 = "fbAccountManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0472:
            java.lang.String r0 = "xFamilyUserFlowLoggerLazy"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0479:
            java.lang.String r0 = "xFamilyUserFlowLoggerLazy"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0480:
            java.lang.String r0 = "xFamilyUserFlowLoggerLazy"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0487:
            java.lang.String r0 = "statusLoggingConfig"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x048e:
            java.lang.Object r4 = r0.A00
            com.whatsapp.status.privacy.StatusPrivacyBottomSheetDialogFragment r4 = (com.whatsapp.status.privacy.StatusPrivacyBottomSheetDialogFragment) r4
            X.5de r0 = r4.A03
            if (r0 != 0) goto L_0x049d
            java.lang.String r0 = "statusDistributionInfo"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x049d:
            int r0 = r0.A00
            r3 = 1
            r2 = 2
            if (r0 == r2) goto L_0x04a5
            r4.A0H = r3
        L_0x04a5:
            X.33p r0 = r4.A01
            if (r0 == 0) goto L_0x04bc
            java.lang.String r1 = "audience_selection_2"
            android.content.SharedPreferences r0 = X.AnonymousClass0x2.A0F(r0)
            boolean r0 = X.C18280x3.A1W(r0, r1)
            if (r0 == 0) goto L_0x04b8
            r4.A1b(r2)
        L_0x04b8:
            r4.A1c(r3)
            return
        L_0x04bc:
            java.lang.String r0 = "sharedPreferences"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x04c3:
            java.lang.Object r0 = r0.A00
            com.whatsapp.status.privacy.StatusPrivacyBottomSheetDialogFragment r0 = (com.whatsapp.status.privacy.StatusPrivacyBottomSheetDialogFragment) r0
            r0.A1a()
            return
        L_0x04cb:
            java.lang.Object r0 = r0.A00
            X.6oS r0 = (X.C137296oS) r0
            r0.A06()
            return
        L_0x04d3:
            java.lang.Object r0 = r0.A00
            X.6pS r0 = (X.C137906pS) r0
            com.whatsapp.stickers.stickerpack.StickerPackDownloader r1 = r0.A08
            X.2iT r0 = r0.A04
            java.lang.String r0 = r0.A0G
            r1.A03(r0)
            return
        L_0x04e1:
            java.lang.Object r0 = r0.A00
            X.52B r0 = (X.AnonymousClass52B) r0
            com.whatsapp.stickers.store.StickerStoreMyTabFragment r0 = r0.A00
            X.5ZD r2 = r0.A03
            X.03q r0 = r0.A0R()
            java.lang.ref.WeakReference r1 = X.AnonymousClass0x9.A14(r0)
            java.lang.String r0 = "sticker_store_my_stickers"
            goto L_0x0507
        L_0x04f4:
            java.lang.Object r3 = r0.A00
            com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity r3 = (com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity) r3
            X.2r2 r2 = r3.A0H
            r1 = 5
            r0 = 0
            r2.A03(r0, r1)
            X.5ZD r2 = r3.A0F
            java.lang.ref.WeakReference r1 = X.AnonymousClass0x9.A14(r3)
            java.lang.String r0 = "sticker_store_pack_preview"
        L_0x0507:
            r2.A04(r0, r1)
            return
        L_0x050b:
            java.lang.Object r3 = r0.A00
            com.whatsapp.textstatuscomposer.TextStatusComposerActivity r3 = (com.whatsapp.textstatuscomposer.TextStatusComposerActivity) r3
            X.4UA r2 = r3.A0O
            java.lang.String r1 = r2.A07
            r3.A0w = r1
            X.5WL r0 = r3.A0l
            r0.A03 = r1
            r2.A0O(r1)
            r0 = 0
            r3.A0M = r0
            r3.A75()
            com.whatsapp.status.playback.widget.StatusEditText r1 = r3.A0j
            r0 = 0
            r1.A01 = r0
            r1.A0L()
            return
        L_0x052b:
            java.lang.Object r0 = r0.A00
            com.whatsapp.twofactor.SetCodeFragment r0 = (com.whatsapp.twofactor.SetCodeFragment) r0
            com.whatsapp.twofactor.SetCodeFragment.A00(r0)
            return
        L_0x0533:
            java.lang.Object r13 = r0.A00
            com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity r13 = (com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity) r13
            X.4FS r1 = r13.A04
            X.2sH r6 = r13.A06
            X.33m r5 = r13.A01
            X.33j r7 = r13.A0A
            X.3Lv r8 = r13.A0B
            X.5Xx r4 = r13.A00
            X.2qz r12 = r13.A0D
            X.4uZ r9 = r13.A0C
            X.C626936e.A06(r9)
            java.util.ArrayList r14 = r13.A0M
            java.util.ArrayList r15 = r13.A0N
            android.content.Intent r3 = r13.getIntent()
            java.lang.String r2 = "has_number_from_url"
            r0 = 0
            boolean r16 = r3.getBooleanExtra(r2, r0)
            android.content.Intent r2 = r13.getIntent()
            java.lang.String r0 = "quoted_message"
            android.os.Bundle r0 = r2.getBundleExtra(r0)
            X.2z0 r11 = X.C627636p.A0A(r0)
            X.1fJ r10 = X.C86604Kt.A0c(r13)
            X.55b r3 = new X.55b
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            X.AnonymousClass0x7.A1B(r3, r1)
            X.5U6 r1 = r13.A08
            r0 = 9
            r1.A03(r0)
            return
        L_0x057b:
            r1 = 0
            X.C162457s7.A0J(r5, r1)
            java.lang.Object r0 = r0.A00
            X.5NK r0 = (X.AnonymousClass5NK) r0
            X.5Q7 r2 = r0.A01
            android.content.Context r1 = X.C18290x4.A0F(r5)
            X.21T r0 = X.AnonymousClass21T.A02
            r2.A00(r1, r0)
            return
        L_0x058f:
            r1 = 0
            X.C162457s7.A0J(r5, r1)
            android.content.Context r4 = r5.getContext()
            X.C162457s7.A0H(r4)
            boolean r3 = X.C57672u1.A00(r4)
            r2 = 0
            java.lang.Object r0 = r0.A00
            X.5YA r0 = (X.AnonymousClass5YA) r0
            X.5hX r1 = r0.A00
            if (r3 == 0) goto L_0x05b1
            java.lang.String r0 = "fb://feed/"
        L_0x05a9:
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r1.BkW(r4, r0, r2)
            return
        L_0x05b1:
            java.lang.String r0 = "https://m.facebook.com"
            goto L_0x05a9
        L_0x05b4:
            java.lang.String r0 = r2.A07
            if (r0 == 0) goto L_0x05c9
            X.33m r1 = r5.A02
            android.view.View r0 = r5.A00
            X.C626936e.A04(r0)
            android.app.Activity r0 = X.C111095hX.A04(r0)
            X.4ea r0 = (X.C89654ea) r0
            r1.A07(r0, r2, r4)
            return
        L_0x05c9:
            java.lang.String r0 = "cannot download media message with no media attached"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.3Wi r2 = r5.A0D
            r1 = 2131890258(0x7f121052, float:1.9415203E38)
            r0 = 0
            r2.A0H(r1, r0)
            return
        L_0x05d8:
            java.util.regex.Pattern r1 = android.util.Patterns.EMAIL_ADDRESS
            com.whatsapp.twofactor.TwoFactorAuthActivity r0 = r2.A07
            java.lang.String r0 = r0.A04
            boolean r0 = X.C18280x3.A1X(r0, r1)
            if (r0 == 0) goto L_0x05ef
            com.whatsapp.twofactor.TwoFactorAuthActivity r2 = r2.A07
            com.whatsapp.twofactor.SetEmailFragment r1 = com.whatsapp.twofactor.SetEmailFragment.A00(r3)
            r0 = 1
            r2.A75(r1, r0)
            return
        L_0x05ef:
            android.widget.TextView r1 = r2.A04
            r0 = 2131894512(0x7f1220f0, float:1.942383E38)
            goto L_0x05fa
        L_0x05f5:
            android.widget.TextView r1 = r2.A04
            r0 = 2131894515(0x7f1220f3, float:1.9423837E38)
        L_0x05fa:
            r1.setText(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C989753y.A07(android.view.View):void");
    }
}
