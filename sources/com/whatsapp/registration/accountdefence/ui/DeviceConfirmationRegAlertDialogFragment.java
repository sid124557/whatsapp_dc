package com.whatsapp.registration.accountdefence.ui;

import X.AnonymousClass043;
import X.AnonymousClass31C;
import X.C48862fb;
import X.C56612sH;
import X.C56972sr;
import android.app.Dialog;
import android.view.View;
import android.widget.Button;

public class DeviceConfirmationRegAlertDialogFragment extends Hilt_DeviceConfirmationRegAlertDialogFragment {
    public static C48862fb A06;
    public View A00;
    public Button A01;
    public Button A02;
    public C56972sr A03;
    public C56612sH A04;
    public AnonymousClass31C A05;

    public DeviceConfirmationRegAlertDialogFragment(C48862fb r1) {
        A06 = r1;
    }

    public void A0f() {
        Dialog dialog;
        Dialog dialog2;
        super.A0f();
        if (this.A02 == null && (dialog2 = this.A03) != null) {
            this.A02 = ((AnonymousClass043) dialog2).A00.A0G;
        }
        if (this.A01 == null && (dialog = this.A03) != null) {
            this.A01 = ((AnonymousClass043) dialog).A00.A0E;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x009e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Dialog A1J(android.os.Bundle r6) {
        /*
            r5 = this;
            android.content.Context r0 = r5.A0G()
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r0)
            r1 = 2131624077(0x7f0e008d, float:1.8875324E38)
            r0 = 0
            r2 = 0
            android.view.View r1 = r3.inflate(r1, r0, r2)
            r5.A00 = r1
            r0 = 2131431581(0x7f0b109d, float:1.8484895E38)
            android.view.View r0 = X.C06560Yg.A02(r1, r0)
            r0.setVisibility(r2)
            android.view.View r1 = r5.A00
            r0 = 2131431084(0x7f0b0eac, float:1.8483887E38)
            android.view.View r1 = X.C06560Yg.A02(r1, r0)
            r0 = 4
            r1.setVisibility(r0)
            android.view.View r1 = r5.A00
            r0 = 2131431580(0x7f0b109c, float:1.8484893E38)
            android.widget.TextView r1 = X.C18300x5.A0G(r1, r0)
            r0 = 2131886217(0x7f120089, float:1.9407007E38)
            r1.setText(r0)
            android.view.View r1 = r5.A00
            r0 = 2131431577(0x7f0b1099, float:1.8484887E38)
            android.widget.TextView r3 = X.C18300x5.A0G(r1, r0)
            X.2sr r0 = r5.A03
            com.whatsapp.Me r1 = X.C56972sr.A00(r0)
            if (r1 == 0) goto L_0x00d2
            java.lang.String r0 = r1.jabber_id
            if (r0 == 0) goto L_0x00d2
            X.33j r2 = r5.A01
            java.lang.String r1 = r1.cc
            java.lang.String r0 = X.C18320x8.A0f(r1, r0)
            java.lang.String r0 = X.AnonymousClass36l.A0C(r1, r0)
            java.lang.String r1 = r2.A0I(r0)
            if (r1 == 0) goto L_0x00d2
            r0 = 2131886213(0x7f120085, float:1.9406998E38)
            java.lang.String r0 = X.C18310x6.A0m(r5, r1, r0)
        L_0x0067:
            r3.setText(r0)
            android.view.View r1 = r5.A00
            r0 = 2131431578(0x7f0b109a, float:1.848489E38)
            android.widget.TextView r4 = X.C18300x5.A0G(r1, r0)
            X.2fb r0 = A06
            long r1 = r0.A00
            java.util.Date r0 = new java.util.Date
            r0.<init>(r1)
            X.2sH r3 = r5.A04
            X.33j r2 = r5.A01
            long r0 = r0.getTime()
            long r0 = r3.A0I(r0)
            java.lang.CharSequence r0 = X.C107565bW.A03(r2, r0)
            r4.setText(r0)
            android.view.View r1 = r5.A00
            r0 = 2131431579(0x7f0b109b, float:1.8484891E38)
            android.widget.TextView r2 = X.C18300x5.A0G(r1, r0)
            X.2fb r0 = A06
            java.lang.String r1 = r0.A01
            if (r1 != 0) goto L_0x00ca
            r1 = 2131886216(0x7f120088, float:1.9407005E38)
            android.content.res.Resources r0 = X.C08310eF.A09(r5)
            java.lang.String r0 = r0.getString(r1)
        L_0x00a9:
            r2.setText(r0)
            X.0zH r2 = X.C18300x5.A0M(r5)
            android.view.View r0 = r5.A00
            r2.A0a(r0)
            r1 = 2131886212(0x7f120084, float:1.9406996E38)
            r0 = 88
            X.C85804Hr.A01(r2, r5, r0, r1)
            r1 = 2131886211(0x7f120083, float:1.9406994E38)
            r0 = 87
            X.C85804Hr.A00(r2, r5, r0, r1)
            X.043 r0 = r2.create()
            return r0
        L_0x00ca:
            r0 = 2131886215(0x7f120087, float:1.9407003E38)
            java.lang.String r0 = X.C18310x6.A0m(r5, r1, r0)
            goto L_0x00a9
        L_0x00d2:
            r1 = 2131886214(0x7f120086, float:1.9407E38)
            android.content.res.Resources r0 = X.C08310eF.A09(r5)
            java.lang.String r0 = r0.getString(r1)
            goto L_0x0067
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.accountdefence.ui.DeviceConfirmationRegAlertDialogFragment.A1J(android.os.Bundle):android.app.Dialog");
    }
}
