package com.whatsapp.payments.ui.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass08M;
import X.AnonymousClass1S3;
import X.AnonymousClass1VX;
import X.AnonymousClass36F;
import X.AnonymousClass3H6;
import X.AnonymousClass4FS;
import X.AnonymousClass9OI;
import X.AnonymousClass9VI;
import X.AnonymousClass9W0;
import X.AnonymousClass9WK;
import X.AnonymousClass9b0;
import X.C06270Wx;
import X.C153527bU;
import X.C160757oG;
import X.C1902394t;
import X.C1906899l;
import X.C196629bS;
import X.C204349pD;
import X.C613130e;
import X.C617332a;
import X.C85204Fi;
import X.C86654Ky;
import android.net.Uri;
import android.text.TextUtils;
import com.whatsapp.R;
import java.util.concurrent.TimeUnit;

public class IndiaPaymentSettingsViewModel extends C1902394t {
    public static final long A0D = TimeUnit.MINUTES.toMillis(15);
    public static final long A0E;
    public static final long A0F;
    public static final long A0G;
    public final AnonymousClass08M A00 = AnonymousClass08M.A01();
    public final AnonymousClass08M A01 = AnonymousClass08M.A01();
    public final AnonymousClass36F A02;
    public final C617332a A03;
    public final AnonymousClass1VX A04;
    public final C196629bS A05;
    public final C1906899l A06;
    public final AnonymousClass9b0 A07;
    public final C160757oG A08 = C160757oG.A00("IndiaPaymentSettingsViewModel", "payment", "IN");
    public final AnonymousClass9OI A09;
    public final C153527bU A0A;
    public final C613130e A0B;
    public final AnonymousClass4FS A0C;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public IndiaPaymentSettingsViewModel(X.C56612sH r12, X.C620733j r13, X.AnonymousClass36F r14, X.C617332a r15, X.AnonymousClass36Y r16, X.AnonymousClass1VX r17, X.C196629bS r18, X.C1906899l r19, X.C620933l r20, X.AnonymousClass9U4 r21, X.AnonymousClass9b0 r22, X.C197109ca r23, X.AnonymousClass9OI r24, X.C153527bU r25, X.C613130e r26, X.AnonymousClass4FS r27) {
        /*
            r11 = this;
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r16
            r7 = r17
            r8 = r20
            r9 = r21
            r10 = r23
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            X.08M r0 = X.AnonymousClass08M.A01()
            r11.A01 = r0
            X.08M r0 = X.AnonymousClass08M.A01()
            r11.A00 = r0
            java.lang.String r2 = "payment"
            java.lang.String r1 = "IN"
            java.lang.String r0 = "IndiaPaymentSettingsViewModel"
            X.7oG r0 = X.C160757oG.A00(r0, r2, r1)
            r11.A08 = r0
            r11.A04 = r7
            r0 = r27
            r11.A0C = r0
            r0 = r19
            r11.A06 = r0
            r0 = r26
            r11.A0B = r0
            r11.A03 = r15
            r0 = r24
            r11.A09 = r0
            r11.A02 = r14
            r0 = r22
            r11.A07 = r0
            r0 = r18
            r11.A05 = r0
            r0 = r25
            r11.A0A = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.viewmodel.IndiaPaymentSettingsViewModel.<init>(X.2sH, X.33j, X.36F, X.32a, X.36Y, X.1VX, X.9bS, X.99l, X.33l, X.9U4, X.9b0, X.9ca, X.9OI, X.7bU, X.30e, X.4FS):void");
    }

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        A0G = timeUnit.toMillis(90);
        A0F = timeUnit.toMillis(30);
        A0E = C86654Ky.A09(timeUnit);
    }

    public AnonymousClass9W0 A0E() {
        int i;
        AnonymousClass9WK r10;
        AnonymousClass9WK r9;
        AnonymousClass9VI r7;
        AnonymousClass9WK r5;
        int i2;
        switch (A0O()) {
            case 1:
                i = R.id.payment_nux_view;
                r9 = C1902394t.A00(R.string.f11nameremoved);
                r10 = AnonymousClass9WK.A05;
                r5 = C1902394t.A00(R.string.f11nameremoved);
                r7 = new AnonymousClass9VI(R.drawable.ic_resume_onboarding_banner);
                i2 = 10;
                break;
            case 2:
                C85204Fi A012 = this.A03.A01("INR");
                AnonymousClass9WK A002 = C1902394t.A00(R.string.f11nameremoved);
                AnonymousClass9WK r8 = AnonymousClass9WK.A05;
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append(((AnonymousClass3H6) A012).A05);
                return new AnonymousClass9W0(new AnonymousClass9VI(R.drawable.ic_settings_quick_tip), new C204349pD(this, 8), A002, r8, new AnonymousClass9WK((String) null, new Object[]{AnonymousClass000.A0h(A0o, ((AnonymousClass1S3) A012).A01.A00.intValue())}, R.string.f11nameremoved, 0), R.id.payment_nux_view, 0, 0, 0, 0);
            case 4:
                i = R.id.payment_nux_view;
                r9 = C1902394t.A00(R.string.f11nameremoved);
                r10 = C1902394t.A00(R.string.f11nameremoved);
                r5 = new AnonymousClass9WK("https://faq.whatsapp.com/general/payments/about-using-your-mobile-number-as-your-UPI-number", new Object[]{"learn-more"}, R.string.f11nameremoved, 0);
                r7 = new AnonymousClass9VI(-1, R.drawable.vec_add_upi_number_banner, R.dimen.f6nameremoved, R.dimen.f6nameremoved);
                i2 = 7;
                break;
            case 5:
                i = R.id.payment_nux_view;
                r9 = C1902394t.A00(R.string.f11nameremoved);
                r10 = AnonymousClass9WK.A05;
                r5 = C1902394t.A00(R.string.f11nameremoved);
                r7 = new AnonymousClass9VI(R.drawable.ic_payments_recover_in);
                i2 = 2;
                break;
            case 6:
                i = R.id.payment_nux_view;
                boolean A0C2 = this.A06.A0C();
                int i3 = R.string.f11nameremoved;
                if (A0C2) {
                    i3 = R.string.f11nameremoved;
                }
                r9 = C1902394t.A00(i3);
                r10 = AnonymousClass9WK.A05;
                r5 = C1902394t.A00(R.string.f11nameremoved);
                r7 = new AnonymousClass9VI(-1, R.drawable.ic_scan_to_pay_banner, R.dimen.f6nameremoved, R.dimen.f6nameremoved);
                i2 = 5;
                break;
            case 7:
                i = R.id.payment_nux_view;
                r9 = C1902394t.A00(R.string.f11nameremoved);
                r10 = AnonymousClass9WK.A05;
                r5 = C1902394t.A00(R.string.f11nameremoved);
                r7 = new AnonymousClass9VI(R.drawable.ic_hero_pin_primer);
                i2 = 4;
                break;
            case 8:
                i = R.id.payment_nux_view;
                r9 = C1902394t.A00(R.string.f11nameremoved);
                r10 = AnonymousClass9WK.A05;
                r5 = C1902394t.A00(R.string.f11nameremoved);
                r7 = new AnonymousClass9VI(R.drawable.ic_doublelock_green);
                i2 = 3;
                break;
            case 9:
                return new AnonymousClass9W0(new AnonymousClass9VI(-1, R.drawable.ic_hero_payments_tos, R.dimen.f6nameremoved, R.dimen.f6nameremoved), new AnonymousClass9VI(-1, R.drawable.ic_video_play, 0, 0), new AnonymousClass9VI(-1, R.drawable.ic_settings_roaming, 0, 0), new C204349pD(this, 9), C1902394t.A00(R.string.f11nameremoved), AnonymousClass9WK.A05, C1902394t.A00(R.string.f11nameremoved), R.id.payment_nux_view, 0, 0, 0, 0, 0);
            case 10:
                i = R.id.payment_nux_view;
                r9 = C1902394t.A00(R.string.f11nameremoved);
                r10 = C1902394t.A00(R.string.f11nameremoved);
                r5 = C1902394t.A00(R.string.f11nameremoved);
                r7 = new AnonymousClass9VI(-1, R.drawable.vec_ic_payments_vector_value_props, R.dimen.f6nameremoved, R.dimen.f6nameremoved);
                i2 = 1;
                break;
            case 11:
                i = R.id.payment_nux_view;
                r9 = C1902394t.A00(R.string.f11nameremoved);
                r10 = AnonymousClass9WK.A05;
                r5 = C1902394t.A00(R.string.f11nameremoved);
                r7 = new AnonymousClass9VI(-1, R.drawable.vec_ic_explore_merchants_banner, R.dimen.f6nameremoved, R.dimen.f6nameremoved);
                i2 = 6;
                break;
            default:
                return new AnonymousClass9W0(0);
        }
        return new AnonymousClass9W0(r7, new C204349pD(this, i2), r9, r10, r5, i, 0, 0, 0, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007f, code lost:
        if (X.C18280x3.A1W(r6.A03(), "payments_home_scan_to_pay_banner_dismissed") != false) goto L_0x0081;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A0O() {
        /*
            r15 = this;
            X.33l r6 = r15.A09
            android.content.SharedPreferences r1 = r6.A03()
            java.lang.String r0 = "payments_home_explore_merchsnts_banner_dismissed"
            boolean r0 = X.C18280x3.A1W(r1, r0)
            if (r0 != 0) goto L_0x002b
            X.1VX r1 = r15.A04
            r0 = 5702(0x1646, float:7.99E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 != 0) goto L_0x0028
            r0 = 6088(0x17c8, float:8.531E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x002b
            X.99l r0 = r15.A06
            boolean r0 = r0.A0C()
            if (r0 == 0) goto L_0x002b
        L_0x0028:
            r1 = 11
        L_0x002a:
            return r1
        L_0x002b:
            X.1VX r7 = r15.A04
            r0 = 1644(0x66c, float:2.304E-42)
            boolean r0 = r7.A0X(r0)
            if (r0 == 0) goto L_0x004e
            X.9bS r1 = r15.A05
            java.lang.String r0 = r1.A07()
            boolean r0 = r1.A0S(r0)
            if (r0 != 0) goto L_0x004e
            android.content.SharedPreferences r1 = r6.A03()
            java.lang.String r0 = "payment_account_recovered"
            boolean r0 = X.C18280x3.A1W(r1, r0)
            r1 = 5
            if (r0 != 0) goto L_0x002a
        L_0x004e:
            r0 = 5260(0x148c, float:7.371E-42)
            boolean r0 = r7.A0X(r0)
            if (r0 == 0) goto L_0x006c
            android.content.SharedPreferences r1 = r6.A03()
            java.lang.String r0 = "payment_upi_warm_welcme_banner_dismissed_state"
            boolean r0 = X.C18280x3.A1W(r1, r0)
            if (r0 != 0) goto L_0x006c
            X.99l r0 = r15.A06
            boolean r0 = r0.A0C()
            r1 = 10
            if (r0 == 0) goto L_0x002a
        L_0x006c:
            r0 = 2319(0x90f, float:3.25E-42)
            boolean r0 = r7.A0X(r0)
            if (r0 == 0) goto L_0x0081
            android.content.SharedPreferences r1 = r6.A03()
            java.lang.String r0 = "payments_home_scan_to_pay_banner_dismissed"
            boolean r1 = X.C18280x3.A1W(r1, r0)
            r0 = 1
            if (r1 == 0) goto L_0x0082
        L_0x0081:
            r0 = 0
        L_0x0082:
            r14 = 6
            if (r0 != 0) goto L_0x027a
            X.99l r2 = r15.A06
            boolean r0 = r2.A0C()
            if (r0 == 0) goto L_0x00af
            X.9bS r0 = r15.A05
            java.lang.String r0 = r0.A07()
            boolean r0 = X.AnonymousClass9UW.A00(r7, r0)
            if (r0 == 0) goto L_0x00af
            X.7bU r0 = r15.A0A
            boolean r0 = r0.A06()
            if (r0 != 0) goto L_0x00af
            android.content.SharedPreferences r1 = r6.A03()
            java.lang.String r0 = "payments_home_add_upi_number_banner_dismissed"
            boolean r0 = X.C18280x3.A1W(r1, r0)
            if (r0 != 0) goto L_0x00af
            r1 = 4
            return r1
        L_0x00af:
            java.util.List r0 = r15.A02
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00d9
            java.util.List r0 = r15.A04
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00d9
            java.util.List r0 = r15.A03
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00d9
            X.9OI r0 = r15.A09
            X.33l r0 = r0.A01
            android.content.SharedPreferences r1 = r0.A03()
            java.lang.String r0 = "settingsQuickTipDismissedState"
            boolean r0 = X.C18280x3.A1W(r1, r0)
            if (r0 != 0) goto L_0x00d9
            r1 = 2
            return r1
        L_0x00d9:
            android.content.SharedPreferences r1 = r6.A03()
            java.lang.String r0 = "payments_home_onboarding_banner_dismissed"
            r3 = 0
            boolean r0 = r1.getBoolean(r0, r3)
            if (r0 != 0) goto L_0x00fa
            android.content.SharedPreferences r1 = r6.A03()
            java.lang.String r0 = "payments_resume_onboarding_banner_started"
            boolean r0 = r1.getBoolean(r0, r3)
            if (r0 == 0) goto L_0x00fa
            boolean r0 = r2.A0C()
            if (r0 != 0) goto L_0x00fa
            r1 = 1
            return r1
        L_0x00fa:
            X.08M r1 = r15.A01
            java.lang.Object r0 = r1.A07()
            if (r0 == 0) goto L_0x010f
            java.lang.Object r0 = r1.A07()
            X.9W0 r0 = (X.AnonymousClass9W0) r0
            int r1 = r0.A01
            r0 = 1
            if (r1 != r0) goto L_0x010f
            r1 = 3
            return r1
        L_0x010f:
            X.9U4 r0 = r15.A0A
            X.8EA r0 = X.AnonymousClass9U4.A03(r0)
            X.7yw r0 = r0.A06()
            if (r0 == 0) goto L_0x0199
            X.6hx r1 = r0.A08
            if (r1 == 0) goto L_0x0199
            boolean r0 = r1 instanceof X.AnonymousClass99H
            if (r0 == 0) goto L_0x0199
            X.99H r1 = (X.AnonymousClass99H) r1
        L_0x0125:
            X.30e r8 = r15.A0B
            java.lang.String r0 = r8.A01()
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x01b2
            boolean r0 = r2.A0C()
            if (r0 == 0) goto L_0x01b2
            if (r1 == 0) goto L_0x01b2
            X.7yt r0 = r1.A05
            if (r0 == 0) goto L_0x01b2
            java.lang.Object r0 = r0.A00
            boolean r0 = X.AnonymousClass001.A1Z(r0)
            if (r0 != 0) goto L_0x01b2
            X.2sH r0 = r15.A05
            long r4 = r0.A0H()
            android.content.SharedPreferences r0 = r6.A03()
            java.lang.String r9 = "payments_home_recovery_upin_upsell_banner_display"
            long r12 = X.AnonymousClass0x2.A0B(r0, r9)
            android.content.SharedPreferences r2 = r6.A03()
            java.lang.String r10 = "payments_home_recovery_upin_upsell_banner_impression"
            r0 = 10
            long r2 = r2.getLong(r10, r0)
            r0 = 0
            int r11 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r11 == 0) goto L_0x016d
            int r11 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r11 >= 0) goto L_0x019b
        L_0x016d:
            int r11 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r11 <= 0) goto L_0x019b
            android.content.SharedPreferences r8 = r6.A03()
            java.lang.String r7 = "payments_home_recovery_upin_upsell_banner_impression_update_timestamp"
            long r11 = r8.getLong(r7, r0)
            int r8 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r8 == 0) goto L_0x0186
            long r0 = A0E
            long r11 = r11 + r0
            int r0 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r0 < 0) goto L_0x0197
        L_0x0186:
            r0 = 1
            long r2 = r2 - r0
            android.content.SharedPreferences r0 = r6.A03()
            X.C18270x1.A0o(r0, r10, r2)
            android.content.SharedPreferences r0 = r6.A03()
            X.C18270x1.A0o(r0, r7, r4)
        L_0x0197:
            r1 = 7
            return r1
        L_0x0199:
            r1 = 0
            goto L_0x0125
        L_0x019b:
            int r11 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r11 > 0) goto L_0x01b2
            r0 = 10
            android.content.SharedPreferences r2 = r6.A03()
            X.C18270x1.A0o(r2, r10, r0)
            long r0 = A0G
            long r4 = r4 + r0
            android.content.SharedPreferences r0 = r6.A03()
            X.C18270x1.A0o(r0, r9, r4)
        L_0x01b2:
            X.2sH r0 = r15.A05
            long r4 = r0.A0H()
            java.lang.String r0 = r8.A01()
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x024d
            android.content.SharedPreferences r1 = r6.A03()
            java.lang.String r0 = "payments_two_factor_nudge_count"
            int r1 = X.C18280x3.A02(r1, r0)
            r0 = 1124(0x464, float:1.575E-42)
            int r0 = r7.A0N(r0)
            if (r1 < r0) goto L_0x024d
            android.content.SharedPreferences r3 = r6.A03()
            java.lang.String r2 = "payments_last_two_factor_nudge_time"
            r0 = 0
            long r8 = r3.getLong(r2, r0)
            long r2 = A0F
            long r8 = r8 + r2
            int r2 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r2 <= 0) goto L_0x024d
            android.content.SharedPreferences r2 = r6.A03()
            java.lang.String r8 = "payments_home_recovery_2fa_upsell_banner_display"
            long r11 = r2.getLong(r8, r0)
            android.content.SharedPreferences r2 = r6.A03()
            java.lang.String r9 = "payments_home_recovery_2fa_upsell_banner_impression"
            r0 = 10
            long r2 = r2.getLong(r9, r0)
            r0 = 0
            int r10 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r10 == 0) goto L_0x0209
            int r10 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r10 >= 0) goto L_0x0236
        L_0x0209:
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 <= 0) goto L_0x0236
            android.content.SharedPreferences r8 = r6.A03()
            java.lang.String r7 = "payments_home_recovery_2fa_upsell_banner_impression_update_timestamp"
            long r10 = r8.getLong(r7, r0)
            int r8 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r8 == 0) goto L_0x0222
            long r0 = A0E
            long r10 = r10 + r0
            int r0 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r0 < 0) goto L_0x0233
        L_0x0222:
            r0 = 1
            long r2 = r2 - r0
            android.content.SharedPreferences r0 = r6.A03()
            X.C18270x1.A0o(r0, r9, r2)
            android.content.SharedPreferences r0 = r6.A03()
            X.C18270x1.A0o(r0, r7, r4)
        L_0x0233:
            r1 = 8
            return r1
        L_0x0236:
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 > 0) goto L_0x024d
            r0 = 10
            android.content.SharedPreferences r2 = r6.A03()
            X.C18270x1.A0o(r2, r9, r0)
            long r0 = A0G
            long r4 = r4 + r0
            android.content.SharedPreferences r0 = r6.A03()
            X.C18270x1.A0o(r0, r8, r4)
        L_0x024d:
            r0 = 2318(0x90e, float:3.248E-42)
            boolean r0 = r7.A0X(r0)
            if (r0 == 0) goto L_0x0262
            android.content.SharedPreferences r1 = r6.A03()
            java.lang.String r0 = "payments_home_scan_to_pay_banner_dismissed"
            boolean r0 = X.C18280x3.A1W(r1, r0)
            if (r0 != 0) goto L_0x0262
            return r14
        L_0x0262:
            r0 = 3332(0xd04, float:4.669E-42)
            boolean r0 = r7.A0X(r0)
            if (r0 == 0) goto L_0x0278
            android.content.SharedPreferences r1 = r6.A03()
            java.lang.String r0 = "payments_home_upi_video_banner_dismissed"
            boolean r0 = X.C18280x3.A1W(r1, r0)
            r1 = 9
            if (r0 == 0) goto L_0x002a
        L_0x0278:
            r1 = 0
            return r1
        L_0x027a:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.viewmodel.IndiaPaymentSettingsViewModel.A0O():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0037, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0041, code lost:
        if (X.AnonymousClass9WN.A01(r4, r3.A07()) != false) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0026, code lost:
        if (r1.contains(r2) != false) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0035, code lost:
        if (X.C18280x3.A1W(r5.A09.A03(), "payment_has_received_upi_mandate_request") != false) goto L_?;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0P() {
        /*
            r5 = this;
            X.1VX r4 = r5.A04
            X.9bS r3 = r5.A05
            java.lang.String r2 = r3.A07()
            r0 = 1231(0x4cf, float:1.725E-42)
            boolean r0 = r4.A0X(r0)
            if (r0 == 0) goto L_0x0039
            r0 = 2835(0xb13, float:3.973E-42)
            java.lang.String r1 = r4.A0Q(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0039
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0039
            boolean r0 = r1.contains(r2)
            if (r0 == 0) goto L_0x0039
        L_0x0028:
            X.33l r0 = r5.A09
            android.content.SharedPreferences r1 = r0.A03()
            java.lang.String r0 = "payment_has_received_upi_mandate_request"
            boolean r1 = X.C18280x3.A1W(r1, r0)
            r0 = 1
            if (r1 != 0) goto L_0x0038
        L_0x0037:
            r0 = 0
        L_0x0038:
            return r0
        L_0x0039:
            java.lang.String r0 = r3.A07()
            boolean r0 = X.AnonymousClass9WN.A01(r4, r0)
            if (r0 == 0) goto L_0x0037
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.viewmodel.IndiaPaymentSettingsViewModel.A0P():boolean");
    }

    public void A0M(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.A07.A0B(Uri.parse(str), (Uri) null) == 19) {
            C06270Wx.A04(this.A00, 3);
        } else {
            super.A0M(str);
        }
    }
}
