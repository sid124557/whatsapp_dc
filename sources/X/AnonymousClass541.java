package X;

import com.whatsapp.privacy.checkup.PrivacyCheckupBaseFragment;

/* renamed from: X.541  reason: invalid class name */
public class AnonymousClass541 extends C109665ez {
    public int A00;
    public Object A01;
    public final int A02;

    public static PrivacyCheckupBaseFragment A00(AnonymousClass541 r1, Object obj) {
        C162457s7.A0J(obj, 0);
        return (PrivacyCheckupBaseFragment) r1.A01;
    }

    public AnonymousClass541(Object obj, int i, int i2) {
        this.A02 = i2;
        this.A01 = obj;
        this.A00 = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0233, code lost:
        r1.A1K(r3, java.lang.Integer.valueOf(r2));
        r0 = r9.getContext();
        r4 = X.C18320x8.A07();
        r4.setClassName(r0.getPackageName(), "com.whatsapp.privacy.checkup.PrivacyCheckupDetailActivity");
        r4.putExtra("DETAIL_CATEGORY", r2);
        r4.putExtra("ENTRY_POINT", r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x02ca, code lost:
        r3.setClassName(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x02cd, code lost:
        X.C86614Ku.A14(r3, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x02d0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0323, code lost:
        r1.startActivityForResult(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0326, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0350, code lost:
        X.C86614Ku.A14(r4, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0353, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(android.view.View r9) {
        /*
            r8 = this;
            int r0 = r8.A02
            switch(r0) {
                case 0: goto L_0x0367;
                case 1: goto L_0x00ea;
                case 2: goto L_0x006f;
                case 3: goto L_0x035b;
                case 4: goto L_0x0327;
                case 5: goto L_0x02f9;
                case 6: goto L_0x02d1;
                case 7: goto L_0x02ab;
                case 8: goto L_0x0280;
                case 9: goto L_0x0257;
                case 10: goto L_0x022c;
                case 11: goto L_0x0224;
                case 12: goto L_0x021c;
                case 13: goto L_0x0214;
                case 14: goto L_0x01dd;
                case 15: goto L_0x01bd;
                case 16: goto L_0x019b;
                case 17: goto L_0x0179;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r4 = r8.A01
            com.whatsapp.settings.Settings r4 = (com.whatsapp.settings.Settings) r4
            int r0 = r8.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.A7B(r0)
            android.content.Intent r3 = X.C18320x8.A07()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.profile.ProfileInfoActivity"
            r3.setClassName(r1, r0)
            boolean r0 = X.AnonymousClass4SG.A45(r4)
            r2 = 0
            r6 = 1
            if (r0 != 0) goto L_0x0060
            boolean r0 = r4.A18
            if (r0 == 0) goto L_0x0060
            r0 = 2
            X.0PJ[] r5 = new X.AnonymousClass0PJ[r0]
            android.widget.ImageView r1 = r4.A04
            java.lang.String r0 = X.AnonymousClass5MG.A01(r4)
            X.0PJ r0 = X.AnonymousClass0x9.A0G(r1, r0)
            r5[r2] = r0
            com.whatsapp.WaImageView r2 = r4.A0K
            X.5MG r1 = new X.5MG
            r1.<init>(r4)
            r0 = 2131896409(0x7f122859, float:1.9427678E38)
            java.lang.String r0 = r1.A03(r0)
            X.0PJ r0 = X.AnonymousClass0x9.A0G(r2, r0)
            r5[r6] = r0
        L_0x004e:
            boolean r0 = X.C107275b2.A00
            if (r0 == 0) goto L_0x005e
            X.0Vi r0 = X.C05880Vi.A01(r4, r5)
            android.os.Bundle r0 = r0.A02()
        L_0x005a:
            X.AnonymousClass0RN.A00(r4, r3, r0)
        L_0x005d:
            return
        L_0x005e:
            r0 = 0
            goto L_0x005a
        L_0x0060:
            X.0PJ[] r5 = new X.AnonymousClass0PJ[r6]
            android.widget.ImageView r1 = r4.A04
            java.lang.String r0 = X.AnonymousClass5MG.A01(r4)
            X.0PJ r0 = X.AnonymousClass0x9.A0G(r1, r0)
            r5[r2] = r0
            goto L_0x004e
        L_0x006f:
            java.lang.Object r1 = r8.A01
            X.4Z1 r1 = (X.AnonymousClass4Z1) r1
            com.whatsapp.components.button.ThumbnailButton r5 = r1.A01
            r0 = 2131431075(0x7f0b0ea3, float:1.8483869E38)
            java.lang.Object r0 = r5.getTag(r0)
            if (r0 == 0) goto L_0x005d
            com.whatsapp.biz.catalog.view.CatalogCarouselDetailImageView r7 = r1.A02
            X.5Tt r2 = r7.A02
            X.5P6 r1 = X.AnonymousClass5P6.A00(r2)
            X.AnonymousClass5P6.A04(r1, r2)
            r0 = 6
            X.AnonymousClass5P6.A02(r1, r0)
            r0 = 25
            X.AnonymousClass5P6.A03(r1, r0)
            X.5dw r0 = r7.A01
            java.lang.String r0 = r0.A0F
            r1.A0G = r0
            com.whatsapp.jid.UserJid r0 = r7.A07
            r1.A00 = r0
            r2.A03(r1)
            android.app.Activity r4 = X.C111095hX.A04(r7)
            X.5dw r0 = r7.A01
            java.lang.String r0 = r0.A0F
            int r6 = r8.A00
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r0)
            java.lang.String r0 = "_"
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r6)
            java.lang.String r0 = X.C107315b6.A06(r0)
            X.AnonymousClass0YZ.A0F(r5, r0)
            android.content.Context r0 = r7.getContext()
            com.whatsapp.jid.UserJid r3 = r7.A07
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.CatalogImageListActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "image_index"
            r2.putExtra(r0, r6)
            java.lang.String r0 = "cached_jid"
            X.AnonymousClass0x2.A0u(r2, r3, r0)
            X.5dw r1 = r7.A01
            java.lang.String r0 = "product"
            r2.putExtra(r0, r1)
            java.lang.String r0 = X.AnonymousClass0YZ.A06(r5)
            android.os.Bundle r0 = X.C107275b2.A05(r4, r5, r0)
            X.AnonymousClass0RN.A00(r4, r2, r0)
            return
        L_0x00ea:
            java.lang.Object r1 = r8.A01
            X.4Z1 r1 = (X.AnonymousClass4Z1) r1
            com.whatsapp.components.button.ThumbnailButton r4 = r1.A01
            r0 = 2131431075(0x7f0b0ea3, float:1.8483869E38)
            java.lang.Object r0 = r4.getTag(r0)
            if (r0 == 0) goto L_0x005d
            com.whatsapp.biz.catalog.view.CatalogCarouselDetailImageView r7 = r1.A02
            X.5Tt r2 = r7.A02
            X.5P6 r1 = X.AnonymousClass5P6.A00(r2)
            X.AnonymousClass5P6.A04(r1, r2)
            r0 = 6
            X.AnonymousClass5P6.A02(r1, r0)
            r0 = 25
            X.AnonymousClass5P6.A03(r1, r0)
            X.5dw r0 = r7.A01
            java.lang.String r0 = r0.A0F
            r1.A0G = r0
            com.whatsapp.jid.UserJid r0 = r7.A07
            r1.A00 = r0
            r2.A03(r1)
            X.5dw r0 = r7.A01
            java.lang.String r0 = r0.A0F
            int r6 = r8.A00
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0l(r0)
            java.lang.String r5 = "_"
            java.lang.String r0 = X.AnonymousClass000.A0Y(r5, r0, r6)
            r4.setTag(r0)
            android.content.Context r0 = r7.getContext()
            com.whatsapp.jid.UserJid r2 = r7.A07
            android.content.Intent r3 = X.C18320x8.A07()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.CatalogMediaView"
            r3.setClassName(r1, r0)
            java.lang.String r0 = "target_image_index"
            r3.putExtra(r0, r6)
            java.lang.String r0 = "cached_jid"
            X.AnonymousClass0x2.A0u(r3, r2, r0)
            X.5dw r1 = r7.A01
            java.lang.String r0 = "product"
            r3.putExtra(r0, r1)
            android.content.Context r0 = r7.getContext()
            X.C107275b2.A08(r0, r3, r4)
            android.content.Context r2 = r7.getContext()
            android.content.Context r0 = r7.getContext()
            X.5MG r1 = new X.5MG
            r1.<init>(r0)
            X.5dw r0 = r7.A01
            java.lang.String r0 = r0.A0F
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0l(r0)
            java.lang.String r0 = X.AnonymousClass000.A0Y(r5, r0, r6)
            java.lang.String r0 = X.C107315b6.A06(r0)
            X.C107275b2.A09(r2, r3, r4, r1, r0)
            return
        L_0x0179:
            com.whatsapp.privacy.checkup.PrivacyCheckupBaseFragment r2 = A00(r8, r9)
            int r1 = r8.A00
            java.lang.Integer r0 = X.C18320x8.A0W()
            r2.A1K(r1, r0)
            r0 = 11
            r2.A1J(r0, r1)
            android.content.Context r0 = r9.getContext()
            android.content.Intent r3 = X.C18320x8.A07()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.authentication.AppAuthSettingsActivity"
            goto L_0x02ca
        L_0x019b:
            com.whatsapp.privacy.checkup.PrivacyCheckupBaseFragment r2 = A00(r8, r9)
            int r1 = r8.A00
            java.lang.Integer r0 = X.AnonymousClass0x9.A0j()
            r2.A1K(r1, r0)
            r0 = 17
            r2.A1J(r0, r1)
            android.content.Context r0 = r9.getContext()
            android.content.Intent r3 = X.C18320x8.A07()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.twofactor.SettingsTwoFactorAuthActivity"
            goto L_0x02ca
        L_0x01bd:
            com.whatsapp.privacy.checkup.PrivacyCheckupBaseFragment r2 = A00(r8, r9)
            int r1 = r8.A00
            java.lang.Integer r0 = X.C18300x5.A0Z()
            r2.A1K(r1, r0)
            r0 = 12
            r2.A1J(r0, r1)
            android.content.Context r1 = r9.getContext()
            r0 = 1
            android.content.Intent r4 = X.C18320x8.A07()
            X.C627736r.A1G(r1, r4, r0)
            goto L_0x0350
        L_0x01dd:
            r0 = 0
            X.C162457s7.A0J(r9, r0)
            java.lang.Object r2 = r8.A01
            com.whatsapp.privacy.checkup.PrivacyCheckupMorePrivacyFragment r2 = (com.whatsapp.privacy.checkup.PrivacyCheckupMorePrivacyFragment) r2
            int r1 = r8.A00
            r0 = 13
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A1K(r1, r0)
            r0 = 16
            r2.A1J(r0, r1)
            android.content.Context r1 = r9.getContext()
            X.0WN r0 = r2.A01
            if (r0 == 0) goto L_0x020d
            X.33p r0 = r0.A03
            boolean r0 = r0.A2E()
            int r0 = X.C86654Ky.A01(r0)
            android.content.Intent r4 = X.C627736r.A09(r1, r0)
            goto L_0x0350
        L_0x020d:
            java.lang.String r0 = "encBackupManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0214:
            com.whatsapp.privacy.checkup.PrivacyCheckupBaseFragment r1 = A00(r8, r9)
            int r3 = r8.A00
            r2 = 1
            goto L_0x0233
        L_0x021c:
            com.whatsapp.privacy.checkup.PrivacyCheckupBaseFragment r1 = A00(r8, r9)
            int r3 = r8.A00
            r2 = 2
            goto L_0x0233
        L_0x0224:
            com.whatsapp.privacy.checkup.PrivacyCheckupBaseFragment r1 = A00(r8, r9)
            int r3 = r8.A00
            r2 = 3
            goto L_0x0233
        L_0x022c:
            com.whatsapp.privacy.checkup.PrivacyCheckupBaseFragment r1 = A00(r8, r9)
            int r3 = r8.A00
            r2 = 4
        L_0x0233:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1.A1K(r3, r0)
            android.content.Context r0 = r9.getContext()
            android.content.Intent r4 = X.C18320x8.A07()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.privacy.checkup.PrivacyCheckupDetailActivity"
            r4.setClassName(r1, r0)
            java.lang.String r0 = "DETAIL_CATEGORY"
            r4.putExtra(r0, r2)
            java.lang.String r0 = "ENTRY_POINT"
            r4.putExtra(r0, r3)
            goto L_0x0350
        L_0x0257:
            com.whatsapp.privacy.checkup.PrivacyCheckupBaseFragment r2 = A00(r8, r9)
            int r1 = r8.A00
            java.lang.Integer r0 = X.C18290x4.A0c()
            r2.A1K(r1, r0)
            r0 = 3
            r2.A1J(r0, r1)
            android.content.Context r0 = r9.getContext()
            android.content.Intent r4 = X.C18320x8.A07()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.group.GroupAddPrivacyActivity"
            r4.setClassName(r1, r0)
            X.03q r1 = r2.A0R()
            r0 = 1
            goto L_0x0323
        L_0x0280:
            com.whatsapp.privacy.checkup.PrivacyCheckupBaseFragment r2 = A00(r8, r9)
            int r1 = r8.A00
            java.lang.Integer r0 = X.C18290x4.A0d()
            r2.A1K(r1, r0)
            r0 = 10
            r2.A1J(r0, r1)
            android.content.Context r0 = r9.getContext()
            java.lang.String r2 = "silence_unknown_caller"
            android.content.Intent r3 = X.C18320x8.A07()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.settings.SettingsCallingPrivacyActivity"
            r3.setClassName(r1, r0)
            java.lang.String r0 = "target_setting"
            r3.putExtra(r0, r2)
            goto L_0x02cd
        L_0x02ab:
            com.whatsapp.privacy.checkup.PrivacyCheckupBaseFragment r2 = A00(r8, r9)
            int r1 = r8.A00
            java.lang.Integer r0 = X.AnonymousClass0x7.A0g()
            r2.A1K(r1, r0)
            r0 = 6
            r2.A1J(r0, r1)
            android.content.Context r0 = r9.getContext()
            android.content.Intent r3 = X.C18320x8.A07()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.blocklist.BlockList"
        L_0x02ca:
            r3.setClassName(r1, r0)
        L_0x02cd:
            X.C86614Ku.A14(r3, r9)
            return
        L_0x02d1:
            com.whatsapp.privacy.checkup.PrivacyCheckupBaseFragment r3 = A00(r8, r9)
            int r1 = r8.A00
            java.lang.Integer r0 = X.C18310x6.A0e()
            r3.A1K(r1, r0)
            r0 = 1
            r3.A1J(r0, r1)
            android.content.Context r2 = r9.getContext()
            android.content.Intent r1 = X.C18320x8.A07()
            java.lang.String r0 = "com.whatsapp.profile.ProfilePhotoPrivacyActivity"
            android.content.Intent r4 = r1.setClassName(r2, r0)
            X.C162457s7.A0D(r4)
            X.03q r1 = r3.A0R()
            r0 = 4
            goto L_0x0323
        L_0x02f9:
            r2 = 0
            X.C162457s7.A0J(r9, r2)
            java.lang.Object r3 = r8.A01
            com.whatsapp.privacy.checkup.PrivacyCheckupBaseFragment r3 = (com.whatsapp.privacy.checkup.PrivacyCheckupBaseFragment) r3
            int r1 = r8.A00
            java.lang.Integer r0 = X.C18300x5.A0Y()
            r3.A1K(r1, r0)
            r3.A1J(r2, r1)
            android.content.Context r2 = r9.getContext()
            android.content.Intent r1 = X.C18320x8.A07()
            java.lang.String r0 = "com.whatsapp.lastseen.PresencePrivacyActivity"
            android.content.Intent r4 = r1.setClassName(r2, r0)
            X.C162457s7.A0D(r4)
            X.03q r1 = r3.A0R()
            r0 = 3
        L_0x0323:
            r1.startActivityForResult(r4, r0)
            return
        L_0x0327:
            com.whatsapp.privacy.checkup.PrivacyCheckupBaseFragment r1 = A00(r8, r9)
            int r2 = r8.A00
            java.lang.Integer r0 = X.AnonymousClass0x7.A0h()
            r1.A1K(r2, r0)
            r0 = 5
            r1.A1J(r0, r2)
            X.2sv r0 = r1.A00
            if (r0 == 0) goto L_0x0354
            android.content.Context r0 = r9.getContext()
            java.lang.String r1 = "read_receipts_enabled"
            android.content.Intent r4 = X.C627736r.A06(r0)
            java.lang.String r0 = "target_setting"
            r4.putExtra(r0, r1)
            java.lang.String r0 = "entry_point"
            r4.putExtra(r0, r2)
        L_0x0350:
            X.C86614Ku.A14(r4, r9)
            return
        L_0x0354:
            java.lang.String r0 = "activities"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x035b:
            java.lang.Object r1 = r8.A01
            X.4OJ r1 = (X.AnonymousClass4OJ) r1
            int r0 = r8.A00
            r1.A00 = r0
            r1.notifyDataSetChanged()
            return
        L_0x0367:
            android.content.Context r5 = r9.getContext()
            java.lang.Object r1 = r8.A01
            X.4YU r1 = (X.AnonymousClass4YU) r1
            com.whatsapp.CatalogImageListActivity r0 = r1.A03
            X.5dw r6 = r0.A05
            X.5MG r4 = r1.A02
            int r3 = r8.A00
            com.whatsapp.jid.UserJid r1 = r0.A08
            java.lang.Class<com.whatsapp.CatalogMediaView> r0 = com.whatsapp.CatalogMediaView.class
            android.content.Intent r2 = X.AnonymousClass0x9.A08(r5, r0)
            java.lang.String r0 = "product"
            r2.putExtra(r0, r6)
            java.lang.String r0 = "target_image_index"
            r2.putExtra(r0, r3)
            java.lang.String r0 = "cached_jid"
            X.AnonymousClass0x2.A0u(r2, r1, r0)
            X.C107275b2.A08(r5, r2, r9)
            java.lang.String r0 = r6.A0F
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r0)
            java.lang.String r0 = "_"
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r3)
            java.lang.String r0 = X.C107315b6.A06(r0)
            X.C107275b2.A09(r5, r2, r9, r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass541.A07(android.view.View):void");
    }
}
