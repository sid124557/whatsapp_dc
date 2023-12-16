package X;

import com.whatsapp.payments.ui.viewmodel.IndiaPaymentSettingsViewModel;

/* renamed from: X.9pD  reason: invalid class name and case insensitive filesystem */
public class C204349pD implements C203219nJ {
    public Object A00;
    public final int A01;

    public C204349pD(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00ef, code lost:
        r1 = r2.putBoolean(r1, r7);
        r0 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0101, code lost:
        r1 = r2.putBoolean(r1, r3);
        r0 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0105, code lost:
        r1.apply();
        r2 = r0.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        r2.A0G(new X.AnonymousClass9W0(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0019, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BPG() {
        /*
            r8 = this;
            int r0 = r8.A01
            switch(r0) {
                case 0: goto L_0x00f4;
                case 1: goto L_0x00cb;
                case 2: goto L_0x00b9;
                case 3: goto L_0x0005;
                case 4: goto L_0x0005;
                case 5: goto L_0x0094;
                case 6: goto L_0x006f;
                case 7: goto L_0x0049;
                case 8: goto L_0x0038;
                case 9: goto L_0x0029;
                case 10: goto L_0x001a;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r8.A00
            X.94t r2 = (X.C1902394t) r2
            r1 = 1
            r0 = 3
            r2.A0G(r1, r0)
            X.08M r2 = r2.A01
        L_0x0010:
            r1 = 0
            X.9W0 r0 = new X.9W0
            r0.<init>(r1)
            r2.A0G(r0)
            return
        L_0x001a:
            java.lang.Object r0 = r8.A00
            X.94t r0 = (X.C1902394t) r0
            X.33l r1 = r0.A09
            r3 = 1
            android.content.SharedPreferences$Editor r2 = X.C620933l.A00(r1)
            java.lang.String r1 = "payments_home_onboarding_banner_dismissed"
            goto L_0x0101
        L_0x0029:
            java.lang.Object r0 = r8.A00
            X.94t r0 = (X.C1902394t) r0
            X.33l r1 = r0.A09
            r3 = 1
            android.content.SharedPreferences$Editor r2 = X.C620933l.A00(r1)
            java.lang.String r1 = "payments_home_upi_video_banner_dismissed"
            goto L_0x0101
        L_0x0038:
            java.lang.Object r0 = r8.A00
            com.whatsapp.payments.ui.viewmodel.IndiaPaymentSettingsViewModel r0 = (com.whatsapp.payments.ui.viewmodel.IndiaPaymentSettingsViewModel) r0
            X.9OI r1 = r0.A09
            X.33l r1 = r1.A01
            r3 = 1
            android.content.SharedPreferences$Editor r2 = X.C620933l.A00(r1)
            java.lang.String r1 = "settingsQuickTipDismissedState"
            goto L_0x0101
        L_0x0049:
            r7 = 1
            r0 = 128(0x80, float:1.794E-43)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            java.lang.String r5 = "payment_home"
            r6 = 0
            java.lang.Object r0 = r8.A00
            X.94t r0 = (X.C1902394t) r0
            X.2sH r3 = r0.A05
            java.lang.String r2 = "add_upi_number_banner"
            r1 = 0
            X.303 r2 = X.AnonymousClass9Wg.A00(r3, r6, r6, r2, r1)
            X.9no r3 = r0.A0B
            X.AnonymousClass9Wg.A02(r2, r3, r4, r5, r6, r7)
            X.33l r1 = r0.A09
            android.content.SharedPreferences$Editor r2 = X.C620933l.A00(r1)
            java.lang.String r1 = "payments_home_add_upi_number_banner_dismissed"
            goto L_0x00ef
        L_0x006f:
            r7 = 1
            r0 = 128(0x80, float:1.794E-43)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            java.lang.String r5 = "payment_home"
            r6 = 0
            java.lang.Object r0 = r8.A00
            X.94t r0 = (X.C1902394t) r0
            X.2sH r3 = r0.A05
            java.lang.String r2 = "recent_businesses"
            r1 = 0
            X.303 r2 = X.AnonymousClass9Wg.A00(r3, r6, r6, r2, r1)
            X.9no r3 = r0.A0B
            X.AnonymousClass9Wg.A02(r2, r3, r4, r5, r6, r7)
            X.33l r1 = r0.A09
            android.content.SharedPreferences$Editor r2 = X.C620933l.A00(r1)
            java.lang.String r1 = "payments_home_explore_merchsnts_banner_dismissed"
            goto L_0x00ef
        L_0x0094:
            r7 = 1
            r0 = 128(0x80, float:1.794E-43)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            java.lang.String r5 = "payment_home"
            r6 = 0
            java.lang.Object r0 = r8.A00
            X.94t r0 = (X.C1902394t) r0
            X.2sH r3 = r0.A05
            java.lang.String r2 = "scan_qr_code_banner"
            r1 = 0
            X.303 r2 = X.AnonymousClass9Wg.A00(r3, r6, r6, r2, r1)
            X.9no r3 = r0.A0B
            X.AnonymousClass9Wg.A02(r2, r3, r4, r5, r6, r7)
            X.33l r1 = r0.A09
            android.content.SharedPreferences$Editor r2 = X.C620933l.A00(r1)
            java.lang.String r1 = "payments_home_scan_to_pay_banner_dismissed"
            goto L_0x00ef
        L_0x00b9:
            java.lang.Object r0 = r8.A00
            X.94t r0 = (X.C1902394t) r0
            r1 = 3
            r3 = 1
            r0.A0G(r3, r1)
            X.33l r1 = r0.A09
            android.content.SharedPreferences$Editor r2 = X.C620933l.A00(r1)
            java.lang.String r1 = "payments_home_account_recovery_banner_dismissed"
            goto L_0x0101
        L_0x00cb:
            r7 = 1
            r0 = 128(0x80, float:1.794E-43)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            java.lang.String r5 = "payment_home"
            r6 = 0
            java.lang.Object r0 = r8.A00
            X.94t r0 = (X.C1902394t) r0
            X.2sH r3 = r0.A05
            java.lang.String r2 = "warm_welcome_banner"
            r1 = 0
            X.303 r2 = X.AnonymousClass9Wg.A00(r3, r6, r6, r2, r1)
            X.9no r3 = r0.A0B
            X.AnonymousClass9Wg.A02(r2, r3, r4, r5, r6, r7)
            X.33l r1 = r0.A09
            android.content.SharedPreferences$Editor r2 = X.C620933l.A00(r1)
            java.lang.String r1 = "payment_upi_warm_welcme_banner_dismissed_state"
        L_0x00ef:
            android.content.SharedPreferences$Editor r1 = r2.putBoolean(r1, r7)
            goto L_0x0105
        L_0x00f4:
            java.lang.Object r0 = r8.A00
            X.94t r0 = (X.C1902394t) r0
            X.33l r1 = r0.A09
            r3 = 1
            android.content.SharedPreferences$Editor r2 = X.C620933l.A00(r1)
            java.lang.String r1 = "payment_brazil_nux_dismissed"
        L_0x0101:
            android.content.SharedPreferences$Editor r1 = r2.putBoolean(r1, r3)
        L_0x0105:
            r1.apply()
            X.08M r2 = r0.A01
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C204349pD.BPG():void");
    }

    public void BQT() {
        if (8 - this.A01 == 0) {
            IndiaPaymentSettingsViewModel indiaPaymentSettingsViewModel = (IndiaPaymentSettingsViewModel) this.A00;
            AnonymousClass9OI r3 = indiaPaymentSettingsViewModel.A09;
            C18270x1.A0l(C620933l.A00(r3.A01), "settingsQuickTipDismissedState", true);
            r3.A00 = true;
            indiaPaymentSettingsViewModel.A01.A0G(new AnonymousClass9W0(0));
        }
    }
}
