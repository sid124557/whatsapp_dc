package com.whatsapp.registration;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0x2;
import X.AnonymousClass0x9;
import X.AnonymousClass5X2;
import X.C06560Yg;
import X.C18260x0;
import X.C18290x4;
import X.C18300x5;
import X.C18310x6;
import X.C620733j;
import X.C626936e;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class RequestOtpCodeBottomSheetFragment extends Hilt_RequestOtpCodeBottomSheetFragment {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public C620733j A04;
    public AnonymousClass5X2 A05;
    public VerifyPhoneNumber A06;
    public WDSButton A07;
    public WDSButton A08;
    public WDSButton A09;
    public WDSButton A0A;
    public String A0B;
    public boolean A0C;
    public boolean A0D;
    public final HashMap A0E = AnonymousClass001.A0t();

    public void A0w(Bundle bundle, View view) {
        int i;
        VerifyPhoneNumber verifyPhoneNumber;
        WDSButton wDSButton;
        String str;
        long j;
        super.A0w(bundle, view);
        AnonymousClass0x2.A0y(C06560Yg.A02(view, R.id.request_otp_code_bottom_sheet_close_button), this, 32);
        ImageView A0E2 = AnonymousClass0x9.A0E(view, R.id.request_otp_code_bottom_sheet_icon);
        TextView A0G = C18300x5.A0G(view, R.id.request_otp_code_bottom_sheet_title);
        TextView A0G2 = C18300x5.A0G(view, R.id.request_otp_code_bottom_sheet_description);
        if (this.A0D) {
            A0E2.setImageDrawable((Drawable) null);
            A0E2.setBackgroundResource(R.drawable.registration_device_confirmation);
            A0G.setText(R.string.f11nameremoved);
            i = R.string.f11nameremoved;
        } else if (this.A0C) {
            A0E2.setImageResource(R.drawable.ic_business_email);
            i = R.string.f11nameremoved;
        } else {
            C18290x4.A1A(A1D(), A0E2, R.drawable.ic_reg_sms_normal);
            A0E2.setBackgroundResource(R.drawable.request_otp_code_circle_background);
            A0G.setText(R.string.f11nameremoved);
            i = R.string.f11nameremoved;
        }
        A0G2.setText(i);
        A1a(this.A06, this.A08, "sms", this.A01);
        A1a(this.A06, this.A09, "voice", this.A02);
        if (this.A0D) {
            verifyPhoneNumber = this.A06;
            wDSButton = this.A0A;
            C626936e.A04(wDSButton);
            str = "wa_old";
            j = this.A03;
        } else if (this.A0C) {
            verifyPhoneNumber = this.A06;
            wDSButton = this.A07;
            C626936e.A04(wDSButton);
            str = "email_otp";
            j = this.A00;
        } else {
            return;
        }
        A1a(verifyPhoneNumber, wDSButton, str, j);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003b, code lost:
        r8 = r16;
        r8.setText(r9);
        r8.setIcon(r4);
        r8.setOnClickListener(new X.C109525el(r14, r8, r5, 6));
        r12 = r18;
        r0 = (r18 > 0 ? 1 : (r18 == 0 ? 0 : -1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0052, code lost:
        if (r0 >= 0) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0054, code lost:
        r8.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0059, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00b2, code lost:
        r5 = new X.C70033Zp(r15, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b8, code lost:
        if (r0 != 0) goto L_0x00be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00ba, code lost:
        r8.setEnabled(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00bd, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00be, code lost:
        r8.setEnabled(false);
        r1 = r14.A0E;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c7, code lost:
        if (r1.get(r10) == null) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c9, code lost:
        ((android.os.CountDownTimer) r1.get(r10)).cancel();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00d2, code lost:
        r1.put(r10, new X.C18690y6(r6, r7, r8, r9, r10, r11, r12));
        ((android.os.CountDownTimer) r1.get(r10)).start();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00e3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002d, code lost:
        if (r0 != false) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1a(com.whatsapp.registration.VerifyPhoneNumber r15, com.whatsapp.wds.components.button.WDSButton r16, java.lang.String r17, long r18) {
        /*
            r14 = this;
            r7 = r15
            r10 = r17
            if (r15 != 0) goto L_0x0017
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "RequestOtpCodeBottomSheetFragment/initializeButtonAndStartTimer for "
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = "/null base activity"
            X.C18260x0.A1L(r1, r0)
            return
        L_0x0017:
            int r0 = r10.hashCode()
            r3 = 0
            r2 = 1
            r6 = r14
            switch(r0) {
                case -795576526: goto L_0x005a;
                case 112386354: goto L_0x0077;
                case 2120743944: goto L_0x0097;
                default: goto L_0x0021;
            }
        L_0x0021:
            r4 = 2131232553(0x7f080729, float:1.8081219E38)
            boolean r0 = r14.A0D
            if (r0 != 0) goto L_0x002f
            boolean r0 = r14.A0C
            r11 = 2131755387(0x7f10017b, float:1.9141652E38)
            if (r0 == 0) goto L_0x0032
        L_0x002f:
            r11 = 2131755389(0x7f10017d, float:1.9141656E38)
        L_0x0032:
            java.lang.String r9 = r14.A0B
            r0 = 10
            X.3a1 r5 = new X.3a1
            r5.<init>(r14, r0, r15)
        L_0x003b:
            r8 = r16
            r8.setText(r9)
            r8.setIcon((int) r4)
            r1 = 6
            X.5el r0 = new X.5el
            r0.<init>(r14, r8, r5, r1)
            r8.setOnClickListener(r0)
            r4 = 0
            r12 = r18
            int r0 = (r18 > r4 ? 1 : (r18 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x00b8
            r0 = 8
            r8.setVisibility(r0)
            return
        L_0x005a:
            java.lang.String r0 = "wa_old"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0021
            r4 = 2131232623(0x7f08076f, float:1.808136E38)
            r11 = 2131755388(0x7f10017c, float:1.9141654E38)
            r1 = 2131894985(0x7f1222c9, float:1.942479E38)
            android.content.res.Resources r0 = X.C08310eF.A09(r14)
            java.lang.String r9 = r0.getString(r1)
            r0 = 48
            goto L_0x00b2
        L_0x0077:
            java.lang.String r0 = "voice"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0021
            r4 = 2131232551(0x7f080727, float:1.8081214E38)
            r11 = 2131755390(0x7f10017e, float:1.9141658E38)
            r1 = 2131894997(0x7f1222d5, float:1.9424815E38)
            android.content.res.Resources r0 = X.C08310eF.A09(r14)
            java.lang.String r9 = r0.getString(r1)
            X.3cH r5 = new X.3cH
            r5.<init>((com.whatsapp.registration.VerifyPhoneNumber) r15, (int) r3)
            goto L_0x003b
        L_0x0097:
            java.lang.String r0 = "email_otp"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0021
            r4 = 2131232011(0x7f08050b, float:1.808012E38)
            r11 = 2131755299(0x7f100123, float:1.9141473E38)
            r1 = 2131893171(0x7f121bb3, float:1.942111E38)
            android.content.res.Resources r0 = X.C08310eF.A09(r14)
            java.lang.String r9 = r0.getString(r1)
            r0 = 49
        L_0x00b2:
            X.3Zp r5 = new X.3Zp
            r5.<init>(r15, r0)
            goto L_0x003b
        L_0x00b8:
            if (r0 != 0) goto L_0x00be
            r8.setEnabled(r2)
            return
        L_0x00be:
            r8.setEnabled(r3)
            java.util.HashMap r1 = r14.A0E
            java.lang.Object r0 = r1.get(r10)
            if (r0 == 0) goto L_0x00d2
            java.lang.Object r0 = r1.get(r10)
            android.os.CountDownTimer r0 = (android.os.CountDownTimer) r0
            r0.cancel()
        L_0x00d2:
            X.0y6 r5 = new X.0y6
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r1.put(r10, r5)
            java.lang.Object r0 = r1.get(r10)
            android.os.CountDownTimer r0 = (android.os.CountDownTimer) r0
            r0.start()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.RequestOtpCodeBottomSheetFragment.A1a(com.whatsapp.registration.VerifyPhoneNumber, com.whatsapp.wds.components.button.WDSButton, java.lang.String, long):void");
    }

    public static RequestOtpCodeBottomSheetFragment A00(String str, long j, long j2, long j3, long j4, boolean z, boolean z2) {
        RequestOtpCodeBottomSheetFragment requestOtpCodeBottomSheetFragment = new RequestOtpCodeBottomSheetFragment();
        Bundle A082 = AnonymousClass002.A08();
        A082.putLong("EXTRA_SMS_COUNTDOWN_TIME", j);
        A082.putLong("EXTRA_VOICE_COUNTDOWN_TIME", j2);
        A082.putLong("EXTRA_WA_OLD_COUNTDOWN_TIME", j3);
        A082.putLong("EXTRA_EMAIL_OTP_COUNTDOWN_TIME", j4);
        A082.putBoolean("EXTRA_REG_STATE_IS_WA_OLD", z);
        A082.putBoolean("EXTRA_REG_STATE_IS_EMAIL_OTP", z2);
        A082.putString("EXTRA_ENABLE_SMS_STRING", str);
        requestOtpCodeBottomSheetFragment.A0u(A082);
        return requestOtpCodeBottomSheetFragment;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0064  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View A0K(android.os.Bundle r10, android.view.LayoutInflater r11, android.view.ViewGroup r12) {
        /*
            r9 = this;
            r1 = 2131625912(0x7f0e07b8, float:1.8879045E38)
            r0 = 1
            android.view.View r5 = r11.inflate(r1, r12, r0)
            r0 = 2131433066(0x7f0b166a, float:1.8487907E38)
            android.view.View r4 = X.C06560Yg.A02(r5, r0)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            boolean r0 = r9.A0D
            r6 = 0
            if (r0 == 0) goto L_0x0068
            r0 = 2131625913(0x7f0e07b9, float:1.8879047E38)
            android.view.View r0 = r11.inflate(r0, r4, r6)
            com.whatsapp.wds.components.button.WDSButton r0 = (com.whatsapp.wds.components.button.WDSButton) r0
            r9.A0A = r0
        L_0x0021:
            r4.addView(r0)
        L_0x0024:
            boolean r0 = r9.A0D
            r7 = 0
            if (r0 == 0) goto L_0x0030
            long r0 = r9.A03
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 >= 0) goto L_0x003a
        L_0x0030:
            boolean r0 = r9.A0C
            if (r0 == 0) goto L_0x0064
            long r1 = r9.A00
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x0064
        L_0x003a:
            r0 = 2131625914(0x7f0e07ba, float:1.887905E38)
        L_0x003d:
            android.view.View r0 = r11.inflate(r0, r4, r6)
            com.whatsapp.wds.components.button.WDSButton r0 = (com.whatsapp.wds.components.button.WDSButton) r0
            r9.A08 = r0
            long r2 = r9.A01
            int r1 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            r0 = 2131625914(0x7f0e07ba, float:1.887905E38)
            if (r1 >= 0) goto L_0x0051
            r0 = 2131625913(0x7f0e07b9, float:1.8879047E38)
        L_0x0051:
            android.view.View r0 = r11.inflate(r0, r4, r6)
            com.whatsapp.wds.components.button.WDSButton r0 = (com.whatsapp.wds.components.button.WDSButton) r0
            r9.A09 = r0
            com.whatsapp.wds.components.button.WDSButton r0 = r9.A08
            r4.addView(r0)
            com.whatsapp.wds.components.button.WDSButton r0 = r9.A09
            r4.addView(r0)
            return r5
        L_0x0064:
            r0 = 2131625913(0x7f0e07b9, float:1.8879047E38)
            goto L_0x003d
        L_0x0068:
            boolean r0 = r9.A0C
            if (r0 == 0) goto L_0x0024
            r0 = 2131625913(0x7f0e07b9, float:1.8879047E38)
            android.view.View r0 = r11.inflate(r0, r4, r6)
            com.whatsapp.wds.components.button.WDSButton r0 = (com.whatsapp.wds.components.button.WDSButton) r0
            r9.A07 = r0
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.RequestOtpCodeBottomSheetFragment.A0K(android.os.Bundle, android.view.LayoutInflater, android.view.ViewGroup):android.view.View");
    }

    public void A0d() {
        super.A0d();
        this.A06 = null;
        HashMap hashMap = this.A0E;
        Iterator A0u = AnonymousClass001.A0u(hashMap);
        while (A0u.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0u);
            if (A0w.getValue() != null) {
                ((CountDownTimer) A0w.getValue()).cancel();
                hashMap.put(A0w.getKey(), (Object) null);
            }
        }
        hashMap.clear();
    }

    public void A0p(Bundle bundle) {
        super.A0p(bundle);
        this.A01 = A0H().getLong("EXTRA_SMS_COUNTDOWN_TIME");
        this.A02 = A0H().getLong("EXTRA_VOICE_COUNTDOWN_TIME");
        this.A03 = A0H().getLong("EXTRA_WA_OLD_COUNTDOWN_TIME");
        this.A00 = A0H().getLong("EXTRA_EMAIL_OTP_COUNTDOWN_TIME");
        this.A0D = A0H().getBoolean("EXTRA_REG_STATE_IS_WA_OLD");
        this.A0C = A0H().getBoolean("EXTRA_REG_STATE_IS_EMAIL_OTP");
        this.A0B = C18310x6.A0k(A0H(), "EXTRA_ENABLE_SMS_STRING");
    }

    public void A1G(Context context) {
        super.A1G(context);
        try {
            this.A06 = (VerifyPhoneNumber) A0Q();
        } catch (ClassCastException e) {
            C18260x0.A16("RequestOtpCodeBottomSheetFragment/onAttach/error: ", AnonymousClass001.A0o(), e);
        }
    }
}
