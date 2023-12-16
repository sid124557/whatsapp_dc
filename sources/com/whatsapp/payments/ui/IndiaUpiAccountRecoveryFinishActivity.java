package com.whatsapp.payments.ui;

import X.AnonymousClass001;
import X.AnonymousClass97T;
import X.AnonymousClass9DA;
import X.C107695bk;
import X.C18280x3;
import X.C18290x4;
import X.C1899593h;
import X.C1899693i;
import X.C204019og;
import X.C64333Db;
import X.C88834as;
import android.view.MenuItem;

public class IndiaUpiAccountRecoveryFinishActivity extends AnonymousClass9DA {
    public boolean A00;

    public void A5r() {
        if (!this.A00) {
            this.A00 = true;
            C88834as A0I = C18280x3.A0I(this);
            C64333Db r2 = A0I.A4Z;
            C1899593h.A15(r2, this);
            C107695bk r1 = r2.A00;
            C1899593h.A0z(r2, r1, this, C1899593h.A0W(r2, r1, this));
            AnonymousClass97T.A0h(A0I, r2, r1, this);
            AnonymousClass97T.A0i(A0I, r2, r1, this, C1899693i.A0Y(r2));
            AnonymousClass97T.A0m(r2, r1, this);
            AnonymousClass97T.A0o(r2, r1, this);
            AnonymousClass97T.A0n(r2, r1, this);
        }
    }

    public void onBackPressed() {
        this.A0S.BKB(AnonymousClass001.A0f(), C18290x4.A0a(), "notify_verification_complete", this.A0e);
        super.onBackPressed();
    }

    public IndiaUpiAccountRecoveryFinishActivity(int i) {
        this.A00 = false;
        C204019og.A00(this, 46);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0051, code lost:
        if (r2 == 12) goto L_0x0053;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r6) {
        /*
            r5 = this;
            super.onCreate(r6)
            r0 = 2131625122(0x7f0e04a2, float:1.8877443E38)
            r5.setContentView((int) r0)
            r0 = 2131427429(0x7f0b0065, float:1.8476474E38)
            android.widget.ImageView r1 = X.C86654Ky.A0M(r5, r0)
            r0 = 2131232498(0x7f0806f2, float:1.8081107E38)
            r1.setImageResource(r0)
            r0 = 2131427431(0x7f0b0067, float:1.8476478E38)
            android.widget.TextView r1 = X.C18310x6.A0L(r5, r0)
            r0 = 2131894669(0x7f12218d, float:1.942415E38)
            r1.setText(r0)
            r0 = 2131427430(0x7f0b0066, float:1.8476476E38)
            android.widget.TextView r1 = X.C18310x6.A0L(r5, r0)
            r0 = 2131894668(0x7f12218c, float:1.9424147E38)
            r1.setText(r0)
            X.0R8 r1 = X.AnonymousClass97T.A0Y(r5)
            if (r1 == 0) goto L_0x0040
            r0 = 2131891871(0x7f12169f, float:1.9418474E38)
            java.lang.String r0 = r5.getString(r0)
            X.C1899593h.A0o(r1, r0)
        L_0x0040:
            r0 = 2131427428(0x7f0b0064, float:1.8476472E38)
            android.widget.TextView r3 = X.C18310x6.A0L(r5, r0)
            int r2 = r5.A02
            r0 = 5
            if (r2 == r0) goto L_0x0053
            r1 = 12
            r0 = 2131888727(0x7f120a57, float:1.9412097E38)
            if (r2 != r1) goto L_0x0056
        L_0x0053:
            r0 = 2131887053(0x7f1203cd, float:1.9408702E38)
        L_0x0056:
            r3.setText(r0)
            r0 = 25
            X.C204249p3.A02(r3, r5, r0)
            X.9ca r4 = r5.A0S
            java.lang.Integer r3 = X.C18290x4.A0Z()
            java.lang.String r2 = "notify_verification_complete"
            java.lang.String r1 = r5.A0e
            r0 = 0
            r4.BKB(r3, r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.IndiaUpiAccountRecoveryFinishActivity.onCreate(android.os.Bundle):void");
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            this.A0S.BKB(AnonymousClass001.A0f(), C18290x4.A0a(), "notify_verification_complete", this.A0e);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public IndiaUpiAccountRecoveryFinishActivity() {
        this(0);
    }
}
