package com.whatsapp.twofactor;

import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass3DZ;
import X.AnonymousClass4HY;
import X.AnonymousClass5V0;
import X.C107695bk;
import X.C19340zH;
import X.C64333Db;
import X.C89644eZ;
import android.app.Dialog;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.wds.components.button.WDSButton;

public final class AddEmailActivity extends C89644eZ {
    public WaTextView A00;
    public WaTextView A01;
    public WDSButton A02;
    public WDSButton A03;
    public boolean A04;

    public Dialog onCreateDialog(int i) {
        if (i != 1) {
            return super.onCreateDialog(i);
        }
        C19340zH A002 = AnonymousClass5V0.A00(this);
        A002.A0T(R.string.f11nameremoved);
        C19340zH.A08(A002, this, 105, R.string.f11nameremoved);
        C19340zH.A07(A002, this, 106, R.string.f11nameremoved);
        return A002.create();
    }

    public void A5r() {
        if (!this.A04) {
            this.A04 = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            AnonymousClass1Hf.A2G(A002, this);
            C107695bk r0 = A002.A00;
            AnonymousClass1Ha.A23(A002, r0, r0, this);
            AnonymousClass1Ha.A24(A002, this);
        }
    }

    public AddEmailActivity(int i) {
        this.A04 = false;
        AnonymousClass4HY.A00(this, 125);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x008d, code lost:
        if (r0.length() == 0) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00eb, code lost:
        if (r1 == 0) goto L_0x00ed;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r9) {
        /*
            r8 = this;
            super.onCreate(r9)
            r0 = 2131624079(0x7f0e008f, float:1.8875328E38)
            r8.setContentView((int) r0)
            r0 = 2131893758(0x7f121dfe, float:1.9422302E38)
            r8.setTitle(r0)
            X.AnonymousClass1Hf.A2E(r8)
            android.view.View r1 = r8.A00
            r0 = 2131427562(0x7f0b00ea, float:1.8476744E38)
            android.view.View r0 = X.C18280x3.A0E(r1, r0)
            com.whatsapp.WaTextView r0 = (com.whatsapp.WaTextView) r0
            r8.A01 = r0
            android.view.View r1 = r8.A00
            r0 = 2131427561(0x7f0b00e9, float:1.8476742E38)
            android.view.View r0 = X.C18280x3.A0E(r1, r0)
            com.whatsapp.WaTextView r0 = (com.whatsapp.WaTextView) r0
            r8.A00 = r0
            android.view.View r1 = r8.A00
            r0 = 2131427560(0x7f0b00e8, float:1.847674E38)
            android.view.View r0 = X.C18280x3.A0E(r1, r0)
            com.whatsapp.wds.components.button.WDSButton r0 = (com.whatsapp.wds.components.button.WDSButton) r0
            r8.A02 = r0
            android.view.View r1 = r8.A00
            r0 = 2131433771(0x7f0b192b, float:1.8489337E38)
            android.view.View r0 = X.C18280x3.A0E(r1, r0)
            com.whatsapp.wds.components.button.WDSButton r0 = (com.whatsapp.wds.components.button.WDSButton) r0
            r8.A03 = r0
            java.lang.String r2 = "title"
            X.33p r0 = r8.A09
            android.content.SharedPreferences r0 = X.AnonymousClass0x2.A0F(r0)
            java.lang.String r4 = "settings_verification_email_address"
            java.lang.String r0 = X.C18280x3.A0Z(r0, r4)
            if (r0 == 0) goto L_0x006b
            int r0 = r0.length()
            if (r0 == 0) goto L_0x006b
            com.whatsapp.WaTextView r1 = r8.A01
            if (r1 != 0) goto L_0x0067
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r2)
            throw r0
        L_0x0067:
            r0 = 2131888860(0x7f120adc, float:1.9412367E38)
            goto L_0x0077
        L_0x006b:
            com.whatsapp.WaTextView r1 = r8.A01
            if (r1 != 0) goto L_0x0074
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r2)
            throw r0
        L_0x0074:
            r0 = 2131888830(0x7f120abe, float:1.9412306E38)
        L_0x0077:
            r1.setText(r0)
            X.33p r0 = r8.A09
            android.content.SharedPreferences r0 = X.AnonymousClass0x2.A0F(r0)
            java.lang.String r0 = X.C18280x3.A0Z(r0, r4)
            r6 = 1
            r7 = 0
            if (r0 == 0) goto L_0x008f
            int r0 = r0.length()
            r1 = 0
            if (r0 != 0) goto L_0x0090
        L_0x008f:
            r1 = 1
        L_0x0090:
            java.lang.String r0 = "description"
            if (r1 == 0) goto L_0x00a4
            com.whatsapp.WaTextView r1 = r8.A00
            if (r1 != 0) goto L_0x009d
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x009d:
            r0 = 2131888828(0x7f120abc, float:1.9412302E38)
            r1.setText(r0)
            goto L_0x00d9
        L_0x00a4:
            com.whatsapp.WaTextView r5 = r8.A00
            if (r5 != 0) goto L_0x00ad
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x00ad:
            r3 = 2131888859(0x7f120adb, float:1.9412365E38)
            java.lang.Object[] r2 = X.AnonymousClass002.A0M()
            r1 = 2130970371(0x7f040703, float:1.754945E38)
            r0 = 2131102225(0x7f060a11, float:1.7816882E38)
            int r0 = X.AnonymousClass5Yj.A02(r8, r1, r0)
            java.lang.String r0 = X.C107575bX.A04(r8, r0)
            r2[r7] = r0
            X.33p r0 = r8.A09
            android.content.SharedPreferences r0 = X.AnonymousClass0x2.A0F(r0)
            java.lang.String r0 = X.C18280x3.A0Z(r0, r4)
            java.lang.String r0 = X.AnonymousClass002.A0F(r8, r0, r2, r6, r3)
            android.text.Spanned r0 = X.C02890Hz.A00(r0)
            r5.setText(r0)
        L_0x00d9:
            X.33p r0 = r8.A09
            android.content.SharedPreferences r0 = X.AnonymousClass0x2.A0F(r0)
            java.lang.String r0 = X.C18280x3.A0Z(r0, r4)
            r4 = 0
            if (r0 == 0) goto L_0x00ed
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L_0x00ee
        L_0x00ed:
            r0 = 1
        L_0x00ee:
            java.lang.String r3 = "addEmailButton"
            com.whatsapp.wds.components.button.WDSButton r1 = r8.A02
            if (r0 == 0) goto L_0x0102
            if (r1 != 0) goto L_0x00fb
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r3)
            throw r0
        L_0x00fb:
            r0 = 2131888825(0x7f120ab9, float:1.9412296E38)
            r1.setText(r0)
            goto L_0x0110
        L_0x0102:
            if (r1 != 0) goto L_0x0109
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r3)
            throw r0
        L_0x0109:
            r0 = 2131888858(0x7f120ada, float:1.9412363E38)
            r1.setText(r0)
            r4 = 2
        L_0x0110:
            com.whatsapp.wds.components.button.WDSButton r2 = r8.A02
            if (r2 != 0) goto L_0x0119
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r3)
            throw r0
        L_0x0119:
            r1 = 20
            X.5f2 r0 = new X.5f2
            r0.<init>(r8, r4, r1)
            r2.setOnClickListener(r0)
            com.whatsapp.wds.components.button.WDSButton r1 = r8.A03
            if (r1 != 0) goto L_0x012f
            java.lang.String r0 = "skipEmailButton"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x012f:
            r0 = 39
            X.C18280x3.A0o(r1, r8, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.twofactor.AddEmailActivity.onCreate(android.os.Bundle):void");
    }

    public AddEmailActivity() {
        this(0);
    }
}
