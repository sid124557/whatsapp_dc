package X;

import android.view.View;
import com.whatsapp.registration.VerifyPhoneNumber;

/* renamed from: X.5f2  reason: invalid class name and case insensitive filesystem */
public class C109695f2 implements View.OnClickListener {
    public int A00;
    public Object A01;
    public final int A02;

    public C109695f2(Object obj, int i, int i2) {
        this.A02 = i2;
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(View view, Object obj, int i, int i2) {
        view.setOnClickListener(new C109695f2(obj, i, i2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0054, code lost:
        if (r4 == 1) goto L_0x0056;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r13) {
        /*
            r12 = this;
            int r0 = r12.A02
            switch(r0) {
                case 0: goto L_0x0316;
                case 1: goto L_0x0064;
                case 2: goto L_0x030c;
                case 3: goto L_0x0300;
                case 4: goto L_0x02e5;
                case 5: goto L_0x02d4;
                case 6: goto L_0x02c8;
                case 7: goto L_0x029d;
                case 8: goto L_0x0277;
                case 9: goto L_0x0250;
                case 10: goto L_0x0246;
                case 11: goto L_0x0234;
                case 12: goto L_0x0221;
                case 13: goto L_0x0215;
                case 14: goto L_0x01bc;
                case 15: goto L_0x01a4;
                case 16: goto L_0x0192;
                case 17: goto L_0x0121;
                case 18: goto L_0x0015;
                case 19: goto L_0x0117;
                case 20: goto L_0x0102;
                case 21: goto L_0x00d4;
                case 22: goto L_0x0097;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r12.A01
            org.npci.upi.security.pinactivitycomponent.Keypad r0 = (org.npci.upi.security.pinactivitycomponent.Keypad) r0
            X.65t r1 = r0.A04
            if (r1 == 0) goto L_0x0014
            int r0 = r12.A00
            int r0 = r0 + 7
            r1.Avu(r13, r0)
        L_0x0014:
            return
        L_0x0015:
            java.lang.Object r2 = r12.A01
            com.whatsapp.storage.StorageUsageGallerySortBottomSheet r2 = (com.whatsapp.storage.StorageUsageGallerySortBottomSheet) r2
            int r4 = r12.A00
            r2.A1K()
            X.4Qw r13 = (X.AnonymousClass4Qw) r13
            com.whatsapp.WaImageView r0 = r13.A00
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x0014
            X.4Qw r0 = r2.A02
            r1 = 0
            r0.setChecked(r1)
            X.4Qw r0 = r2.A03
            r0.setChecked(r1)
            X.4Qw r0 = r2.A04
            r0.setChecked(r1)
            r3 = 1
            r13.setChecked(r3)
            X.7Ee r0 = r2.A00
            if (r0 == 0) goto L_0x0014
            com.whatsapp.storage.StorageUsageGalleryActivity r0 = r0.A00
            com.whatsapp.storage.StorageUsageMediaGalleryFragment r2 = r0.A0P
            if (r2 == 0) goto L_0x0014
            int r0 = r2.A03
            if (r0 == r4) goto L_0x0014
            r2.A03 = r4
            com.whatsapp.scroller.RecyclerFastScroller r1 = r2.A0R
            if (r1 == 0) goto L_0x005a
            if (r4 == 0) goto L_0x0056
            r0 = 8
            if (r4 != r3) goto L_0x0057
        L_0x0056:
            r0 = 0
        L_0x0057:
            r1.setVisibility(r0)
        L_0x005a:
            r0 = 0
            r2.A01 = r0
            r2.A1P()
            r2.A1T(r0)
            return
        L_0x0064:
            java.lang.Object r0 = r12.A01
            X.4WJ r0 = (X.AnonymousClass4WJ) r0
            int r5 = r12.A00
            com.whatsapp.bonsai.prompts.BonsaiPromptsViewModel r4 = r0.A00
            if (r5 < 0) goto L_0x0014
            X.107 r3 = r4.A05
            java.lang.Object r1 = X.C86634Kw.A0v(r3)
            java.util.List r1 = (java.util.List) r1
            r0 = 0
            X.C162457s7.A0J(r1, r0)
            int r0 = X.AnonymousClass002.A03(r1)
            if (r5 > r0) goto L_0x0014
            X.4uZ r2 = r4.A00
            if (r2 == 0) goto L_0x0014
            java.lang.Object r0 = X.C86634Kw.A0w(r3, r5)
            X.2jL r0 = (X.C51142jL) r0
            X.33m r1 = r4.A02
            java.lang.String r0 = r0.A01
            r1.A0I(r2, r0)
            X.3d3 r0 = X.C72023d3.A00
            r3.A0H(r0)
            return
        L_0x0097:
            java.lang.Object r2 = r12.A01
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r2 = (com.whatsapp.voipcalling.VoipCallControlBottomSheetV2) r2
            int r1 = r12.A00
            r0 = 10
            if (r1 >= r0) goto L_0x00c6
            java.lang.String r0 = java.lang.String.valueOf(r1)
        L_0x00a5:
            com.whatsapp.voipcalling.Voip.sendDTMFTone(r0)
            java.lang.StringBuilder r1 = r2.A0h
            r1.append(r0)
            android.widget.TextView r0 = r2.A0E
            r0.setText(r1)
            android.widget.TextView r1 = r2.A0E
            r0 = 0
            r1.setVisibility(r0)
            r13.playSoundEffect(r0)
            X.5Uk r0 = r2.A0N
            r0.A01()
            X.5Uk r0 = r2.A0N
            r0.A02()
            return
        L_0x00c6:
            if (r1 != r0) goto L_0x00cb
            java.lang.String r0 = "*"
            goto L_0x00a5
        L_0x00cb:
            r0 = 11
            if (r1 != r0) goto L_0x00d2
            java.lang.String r0 = "#"
            goto L_0x00a5
        L_0x00d2:
            r0 = 0
            goto L_0x00a5
        L_0x00d4:
            java.lang.Object r0 = r12.A01
            X.4WU r0 = (X.AnonymousClass4WU) r0
            int r3 = r12.A00
            com.whatsapp.status.seeall.adapter.StatusSeeAllAdapter r0 = r0.A01
            X.648 r0 = r0.A04
            com.whatsapp.status.seeall.StatusSeeAllActivity r0 = (com.whatsapp.status.seeall.StatusSeeAllActivity) r0
            com.whatsapp.status.seeall.viewmodel.StatusSeeAllViewModel r2 = r0.A09
            if (r2 != 0) goto L_0x00e9
            java.lang.RuntimeException r0 = X.C86604Kt.A0j()
            throw r0
        L_0x00e9:
            X.590[] r1 = X.AnonymousClass590.values()
            r0 = 0
            X.C162457s7.A0J(r1, r0)
            if (r3 < 0) goto L_0x00fc
            int r0 = r1.length
            int r0 = r0 + -1
            if (r3 > r0) goto L_0x00fc
            r0 = r1[r3]
            if (r0 != 0) goto L_0x00fe
        L_0x00fc:
            X.590 r0 = X.AnonymousClass590.ALL
        L_0x00fe:
            r2.A0E(r0)
            return
        L_0x0102:
            java.lang.Object r4 = r12.A01
            X.4eZ r4 = (X.C89644eZ) r4
            int r3 = r12.A00
            X.5hX r2 = r4.A00
            java.lang.String r1 = X.C18280x3.A0Y()
            r0 = 4
            android.content.Intent r0 = X.C627736r.A0x(r4, r1, r3, r0)
            r2.A0A(r4, r0)
            return
        L_0x0117:
            java.lang.Object r1 = r12.A01
            com.whatsapp.support.DescribeProblemActivity r1 = (com.whatsapp.support.DescribeProblemActivity) r1
            int r0 = r12.A00
            r1.A79(r0)
            return
        L_0x0121:
            java.lang.Object r0 = r12.A01
            X.6IK r0 = (X.AnonymousClass6IK) r0
            int r1 = r12.A00
            int[] r8 = X.C86664Kz.A1Z()
            r13.getLocationOnScreen(r8)
            X.4Wp r0 = r0.A00
            com.whatsapp.settings.chat.wallpaper.SolidColorWallpaper r4 = r0.A02
            int[] r0 = r4.A03
            r10 = r0[r1]
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r11 = "chat_jid"
            java.lang.String r0 = r0.getStringExtra(r11)
            X.4uZ r9 = X.C18310x6.A0S(r0)
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r7 = "is_using_global_wallpaper"
            r6 = 0
            boolean r5 = r0.getBooleanExtra(r7, r6)
            r3 = 1
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.settings.chat.wallpaper.SolidColorWallpaperPreview"
            android.content.Intent r2 = r2.setClassName(r1, r0)
            X.C627336j.A0D(r2, r9, r11)
            r2.putExtra(r7, r5)
            java.lang.String r0 = "scw_preview_color"
            r2.putExtra(r0, r10)
            java.lang.String r0 = "wallpaper_preview_intent_extra_animate"
            r2.putExtra(r0, r3)
            r1 = r8[r6]
            java.lang.String r0 = "wallpaper_preview_intent_extra_x"
            r2.putExtra(r0, r1)
            r1 = r8[r3]
            java.lang.String r0 = "wallpaper_preview_intent_extra_y"
            r2.putExtra(r0, r1)
            int r1 = r13.getWidth()
            java.lang.String r0 = "wallpaper_preview_intent_extra_width"
            r2.putExtra(r0, r1)
            java.lang.String r1 = "wallpaper_preview_intent_extra_height"
            int r0 = r13.getHeight()
            r2.putExtra(r1, r0)
            r4.startActivityForResult(r2, r3)
            return
        L_0x0192:
            int r2 = r12.A00
            java.lang.Object r1 = r12.A01
            com.whatsapp.search.SearchViewModel r1 = (com.whatsapp.search.SearchViewModel) r1
            r0 = 117(0x75, float:1.64E-43)
            if (r0 != r2) goto L_0x01a0
            r1.A0Q()
            return
        L_0x01a0:
            r1.A0Y(r2)
            return
        L_0x01a4:
            java.lang.Object r3 = r12.A01
            com.whatsapp.registration.VerifyPhoneNumber r3 = (com.whatsapp.registration.VerifyPhoneNumber) r3
            r0 = 47
            X.C621433s.A00(r3, r0)
            X.2s5 r2 = r3.A14
            java.lang.String r1 = "flash_call_retry_dialog"
            java.lang.String r0 = "verify_with_sms"
            r2.A03(r1, r0)
            int r0 = r3.A04
            r3.A7U(r0)
            return
        L_0x01bc:
            java.lang.Object r6 = r12.A01
            com.whatsapp.registration.VerifyPhoneNumber r6 = (com.whatsapp.registration.VerifyPhoneNumber) r6
            r0 = 47
            X.C621433s.A00(r6, r0)
            r0 = 1
            r6.A1K = r0
            X.317 r2 = r6.A0w
            r1 = 8
            r0 = 0
            r2.A0B(r1, r0)
            X.2s5 r2 = r6.A14
            java.lang.String r1 = "flash_call_retry_dialog"
            java.lang.String r0 = "try_again"
            r2.A03(r1, r0)
            X.5UQ r1 = r6.A10
            java.lang.String r0 = "sms"
            long r0 = r1.A00(r0)
            X.5UQ r3 = r6.A10
            java.lang.String r2 = "voice"
            long r4 = r3.A00(r2)
            r2 = 0
            r7 = 1
            android.content.Intent r9 = X.C18280x3.A0A(r6)
            java.lang.String r8 = "sms_retry_time"
            android.content.Intent r1 = r9.putExtra(r8, r0)
            java.lang.String r0 = "voice_retry_time"
            android.content.Intent r1 = r1.putExtra(r0, r4)
            java.lang.String r0 = "wa_old_retry_time"
            android.content.Intent r1 = r1.putExtra(r0, r2)
            java.lang.String r0 = "has_retried_flash_call"
            android.content.Intent r1 = r1.putExtra(r0, r7)
            java.lang.String r0 = "should_request_flash_call"
            android.content.Intent r0 = r1.putExtra(r0, r7)
            r6.finish()
            r6.startActivity(r0)
            return
        L_0x0215:
            java.lang.Object r0 = r12.A01
            X.4Ww r0 = (X.C87984Ww) r0
            int r1 = r12.A00
            X.8ok r0 = r0.A0D
            r0.Be3(r1)
            return
        L_0x0221:
            java.lang.Object r4 = r12.A01
            com.whatsapp.inappbugreporting.InAppBugReportingActivity r4 = (com.whatsapp.inappbugreporting.InAppBugReportingActivity) r4
            int r3 = r12.A00
            X.2WS r2 = r4.A74()
            r1 = 0
            r0 = 4
            r2.A00(r0, r1)
            r4.A77(r3)
            return
        L_0x0234:
            java.lang.Object r0 = r12.A01
            X.4XE r0 = (X.AnonymousClass4XE) r0
            int r2 = r12.A00
            X.4GQ r1 = r0.A02
            java.util.List r0 = r0.A00
            java.lang.Object r0 = r0.get(r2)
            r1.invoke(r0)
            return
        L_0x0246:
            java.lang.Object r1 = r12.A01
            X.4Wl r1 = (X.C87874Wl) r1
            int r0 = r12.A00
            r1.A0K(r0)
            return
        L_0x0250:
            java.lang.Object r1 = r12.A01
            X.4po r1 = (X.C94074po) r1
            int r0 = r12.A00
            if (r0 == 0) goto L_0x025e
            X.5UU r0 = r1.A02
            r0.A02()
            return
        L_0x025e:
            X.5UU r4 = r1.A02
            X.3ZH r0 = r4.A00
            X.4uZ r3 = X.C86604Kt.A0a(r0)
            X.2sD r2 = r4.A0H
            boolean r1 = r4.A01
            java.lang.Integer r0 = X.C18290x4.A0c()
            r2.A02(r3, r0, r1)
            java.lang.Runnable r0 = r4.A0J
            r0.run()
            return
        L_0x0277:
            java.lang.Object r3 = r12.A01
            X.4po r3 = (X.C94074po) r3
            int r2 = r12.A00
            if (r2 == 0) goto L_0x0296
            r1 = 1
            if (r2 == r1) goto L_0x0290
            r0 = 2
            if (r2 == r0) goto L_0x0289
            r3.BFg()
            return
        L_0x0289:
            X.5UU r1 = r3.A02
            r0 = 1
            r1.A04(r0)
            return
        L_0x0290:
            X.5UU r0 = r3.A02
            r0.A03(r1)
            return
        L_0x0296:
            X.5UU r1 = r3.A02
            r0 = 1
            r1.A05(r0)
            return
        L_0x029d:
            java.lang.Object r3 = r12.A01
            X.5l7 r3 = (X.C113245l7) r3
            int r2 = r12.A00
            X.2sq r1 = r3.A27
            X.4uZ r0 = r3.A4J
            boolean r0 = X.C86614Ku.A1X(r1, r0)
            if (r0 == 0) goto L_0x02b7
            X.4eZ r1 = X.C113245l7.A09(r3)
            r0 = 603(0x25b, float:8.45E-43)
            X.C621433s.A01(r1, r0)
            return
        L_0x02b7:
            X.2aG r1 = r3.A5T
            r0 = 4
            r1.A00(r0)
            r3.A1T(r2)
            X.4fS r1 = r3.A2a
            java.lang.String r0 = "payment_composer_icon"
            r1.A0A(r2, r0)
            return
        L_0x02c8:
            java.lang.Object r0 = r12.A01
            X.7Mi r0 = (X.C149407Mi) r0
            int r1 = r12.A00
            X.8o6 r0 = r0.A01
            r0.BNy(r1)
            return
        L_0x02d4:
            java.lang.Object r0 = r12.A01
            X.4lo r0 = (X.C91924lo) r0
            int r2 = r12.A00
            com.whatsapp.contact.picker.ContactPickerFragment r0 = r0.A05
            X.0df r1 = r0.A0T()
            r0 = 2
            com.whatsapp.ephemeral.ChangeEphemeralSettingsDialog.A00(r1, r2, r0)
            return
        L_0x02e5:
            java.lang.Object r4 = r12.A01
            com.whatsapp.chatinfo.ContactInfoActivity r4 = (com.whatsapp.chatinfo.ContactInfoActivity) r4
            int r3 = r12.A00
            X.4sd r1 = r4.A1S
            if (r1 == 0) goto L_0x02f3
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.A04 = r0
        L_0x02f3:
            X.2gf r2 = r4.A1P
            X.3ZH r0 = r4.A1K
            com.whatsapp.jid.UserJid r1 = X.C86604Kt.A0d(r0)
            r0 = 1
            r2.A00(r4, r1, r3, r0)
            return
        L_0x0300:
            java.lang.Object r1 = r12.A01
            com.whatsapp.calling.callgrid.view.MenuBottomSheet r1 = (com.whatsapp.calling.callgrid.view.MenuBottomSheet) r1
            int r0 = r12.A00
            r1.A00 = r0
            r1.A1L()
            return
        L_0x030c:
            java.lang.Object r1 = r12.A01
            X.8uO r1 = (X.C185878uO) r1
            int r0 = r12.A00
            r1.BOv(r0)
            return
        L_0x0316:
            java.lang.Object r0 = r12.A01
            com.whatsapp.PagerSlidingTabStrip r0 = (com.whatsapp.PagerSlidingTabStrip) r0
            int r1 = r12.A00
            androidx.viewpager.widget.ViewPager r0 = r0.A0N
            r0.setCurrentItem(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C109695f2.onClick(android.view.View):void");
    }

    public C109695f2(VerifyPhoneNumber verifyPhoneNumber, int i) {
        this.A02 = i;
        this.A01 = verifyPhoneNumber;
        this.A00 = 47;
    }
}
