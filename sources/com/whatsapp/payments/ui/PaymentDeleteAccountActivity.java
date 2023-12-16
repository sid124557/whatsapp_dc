package com.whatsapp.payments.ui;

import X.AnonymousClass001;
import X.AnonymousClass0R8;
import X.AnonymousClass34V;
import X.AnonymousClass3DZ;
import X.AnonymousClass4EY;
import X.AnonymousClass4FS;
import X.AnonymousClass9U4;
import X.AnonymousClass9U5;
import X.C107695bk;
import X.C153607bd;
import X.C160757oG;
import X.C1899593h;
import X.C1899693i;
import X.C194259Se;
import X.C194329Sl;
import X.C197769dq;
import X.C204019og;
import X.C40602Ha;
import X.C620933l;
import X.C64333Db;
import X.C66543Lv;
import X.C69263Wi;
import X.C89644eZ;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.R;

public class PaymentDeleteAccountActivity extends C89644eZ implements AnonymousClass4EY {
    public int A00;
    public C66543Lv A01;
    public C40602Ha A02;
    public C620933l A03;
    public AnonymousClass9U5 A04;
    public C197769dq A05;
    public AnonymousClass9U4 A06;
    public C194259Se A07;
    public boolean A08;
    public final C160757oG A09;

    public void A6O(int i) {
        setResult(-1);
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        AnonymousClass0R8 supportActionBar = getSupportActionBar();
        int i = 1;
        if (supportActionBar != null) {
            supportActionBar.A0B(R.string.f11nameremoved);
            supportActionBar.A0N(true);
        }
        if (getIntent() != null) {
            i = getIntent().getIntExtra("extra_remove_payment_account", 1);
        }
        this.A00 = i;
        C69263Wi r4 = this.A05;
        AnonymousClass4FS r12 = this.A04;
        C194259Se r11 = this.A07;
        AnonymousClass9U4 r10 = this.A06;
        new C194329Sl(this, r4, this.A01, this.A02, this.A03, this.A04, this.A05, r10, r11, r12).A00(this);
        this.A09.A06("deleted payments store and sending delete account request");
        onConfigurationChanged(AnonymousClass001.A0M(this));
    }

    public void A5r() {
        if (!this.A08) {
            this.A08 = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            C1899593h.A15(A002, this);
            C107695bk r1 = A002.A00;
            C1899593h.A0z(A002, r1, this, C1899593h.A0W(A002, r1, this));
            this.A07 = C1899593h.A0Q(A002);
            this.A06 = C1899593h.A0I(A002);
            this.A01 = C64333Db.A3D(A002);
            this.A03 = C1899593h.A0E(A002);
            this.A04 = C1899593h.A0F(A002);
            this.A05 = C1899693i.A0O(A002);
            this.A02 = (C40602Ha) C1899693i.A0Y(A002);
        }
    }

    public void BaB(AnonymousClass34V r4) {
        int B7Q = this.A06.A0G().B66().B7Q((C153607bd) null, r4.A00);
        if (B7Q == 0) {
            B7Q = R.string.f11nameremoved;
        }
        Bot(B7Q);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0049  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BaC(X.AnonymousClass2Oi r5) {
        /*
            r4 = this;
            X.7oG r2 = r4.A09
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "onDeleteAccount successful: "
            r1.append(r0)
            boolean r0 = r5.A02
            r1.append(r0)
            java.lang.String r0 = " remove type: "
            r1.append(r0)
            int r0 = r4.A00
            X.C1899593h.A1K(r2, r1, r0)
            r0 = 2131432721(0x7f0b1511, float:1.8487207E38)
            android.view.View r0 = r4.findViewById(r0)
            r3 = 8
            r0.setVisibility(r3)
            boolean r0 = r5.A02
            r2 = 1
            if (r0 == 0) goto L_0x0066
            int r0 = r4.A00
            if (r0 != r2) goto L_0x0045
            r1 = 2131891692(0x7f1215ec, float:1.9418111E38)
        L_0x0032:
            r0 = 2131434483(0x7f0b1bf3, float:1.8490781E38)
            android.widget.TextView r0 = X.C18310x6.A0L(r4, r0)
            r0.setText(r1)
            r0 = 2131434482(0x7f0b1bf2, float:1.849078E38)
            X.C18280x3.A0r(r4, r0, r3)
            r4.Bot(r1)
        L_0x0045:
            boolean r0 = r5.A02
            if (r0 == 0) goto L_0x004e
            X.9U4 r0 = r4.A06
            r0.A0L(r2, r2)
        L_0x004e:
            boolean r0 = r5.A02
            if (r0 == 0) goto L_0x0065
            int r1 = r4.A00
            r0 = 2
            if (r1 != r0) goto L_0x0065
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = "extra_remove_payment_account"
            int r0 = r4.A00
            r2.putExtra(r1, r0)
            X.AnonymousClass0x2.A0m(r4, r2)
        L_0x0065:
            return
        L_0x0066:
            r1 = 2131891691(0x7f1215eb, float:1.941811E38)
            goto L_0x0032
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.PaymentDeleteAccountActivity.BaC(X.2Oi):void");
    }

    public PaymentDeleteAccountActivity(int i) {
        this.A08 = false;
        C204019og.A00(this, 107);
    }

    public void Ba4(AnonymousClass34V r2) {
        Bot(R.string.f11nameremoved);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        View findViewById = findViewById(R.id.hero_payments);
        int i = 0;
        if (configuration.orientation == 2) {
            i = 8;
        }
        findViewById.setVisibility(i);
    }

    public PaymentDeleteAccountActivity() {
        this(0);
        this.A09 = C160757oG.A00("PaymentDeleteAccountActivity", "payment-settings", "COMMON");
    }
}
