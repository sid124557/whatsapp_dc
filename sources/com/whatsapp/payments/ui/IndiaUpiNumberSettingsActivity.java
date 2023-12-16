package com.whatsapp.payments.ui;

import X.AnonymousClass001;
import X.AnonymousClass0R8;
import X.AnonymousClass303;
import X.AnonymousClass4L0;
import X.AnonymousClass6C7;
import X.AnonymousClass97T;
import X.AnonymousClass9AE;
import X.AnonymousClass9DA;
import X.AnonymousClass9U1;
import X.AnonymousClass9U5;
import X.C107695bk;
import X.C136986na;
import X.C153527bU;
import X.C160757oG;
import X.C166157yE;
import X.C166557yt;
import X.C18280x3;
import X.C18290x4;
import X.C18310x6;
import X.C1899593h;
import X.C1899693i;
import X.C194259Se;
import X.C197109ca;
import X.C204019og;
import X.C204249p3;
import X.C204749pr;
import X.C205049qL;
import X.C22121Ep;
import X.C40602Ha;
import X.C64333Db;
import X.C69263Wi;
import X.C86654Ky;
import X.C88834as;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whatsapp.R;
import com.whatsapp.payments.ui.viewmodel.IndiaUpiNumberSettingsViewModel;

public class IndiaUpiNumberSettingsActivity extends AnonymousClass9DA {
    public ImageView A00;
    public ImageView A01;
    public LinearLayout A02;
    public LinearLayout A03;
    public TextView A04;
    public TextView A05;
    public TextView A06;
    public ConstraintLayout A07;
    public ConstraintLayout A08;
    public C22121Ep A09;
    public C166557yt A0A;
    public C166157yE A0B;
    public AnonymousClass9AE A0C;
    public C136986na A0D;
    public C153527bU A0E;
    public IndiaUpiNumberSettingsViewModel A0F;
    public C194259Se A0G;
    public boolean A0H;
    public final C160757oG A0I;

    public void A5r() {
        if (!this.A0H) {
            this.A0H = true;
            C88834as A0I2 = C18280x3.A0I(this);
            C64333Db r2 = A0I2.A4Z;
            C1899593h.A15(r2, this);
            C107695bk r1 = r2.A00;
            C1899593h.A0z(r2, r1, this, C1899593h.A0W(r2, r1, this));
            AnonymousClass97T.A0h(A0I2, r2, r1, this);
            AnonymousClass97T.A0i(A0I2, r2, r1, this, C1899693i.A0Y(r2));
            AnonymousClass97T.A0m(r2, r1, this);
            AnonymousClass97T.A0o(r2, r1, this);
            AnonymousClass97T.A0n(r2, r1, this);
            this.A09 = (C22121Ep) r2.A75.get();
            this.A0G = C1899593h.A0Q(r2);
            this.A0E = (C153527bU) r1.A6Q.get();
        }
    }

    public final void A7V(String str) {
        if (this.A0B != null) {
            AnonymousClass303 A0K = C1899593h.A0K();
            A0K.A03("alias_type", this.A0B.A03);
            A0K.A03("alias_status", str);
            this.A0S.BKE(A0K, AnonymousClass001.A0f(), 165, "alias_info", C1899593h.A0a(this));
        }
    }

    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        this.A0S.BKB(C18290x4.A0Z(), (Integer) null, "alias_info", C1899593h.A0a(this));
        AnonymousClass6C7.A0y(this);
        this.A0B = (C166157yE) getIntent().getParcelableExtra("extra_payment_upi_alias");
        this.A0A = (C166557yt) getIntent().getParcelableExtra("extra_payment_name");
        setContentView((int) R.layout.f8nameremoved);
        AnonymousClass0R8 supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            C166157yE r0 = this.A0B;
            if (r0 != null) {
                String str = r0.A03;
                if (!str.equals("numeric_id")) {
                    boolean equals = str.equals("mobile_number");
                    i = R.string.f11nameremoved;
                    if (!equals) {
                        i = R.string.f11nameremoved;
                    }
                } else {
                    i = R.string.f11nameremoved;
                }
                supportActionBar.A0B(i);
            }
            supportActionBar.A0N(true);
        }
        this.A08 = (ConstraintLayout) findViewById(R.id.upi_number_container);
        this.A00 = C86654Ky.A0M(this, R.id.upi_number_image);
        this.A06 = C18310x6.A0L(this, R.id.upi_number_update_status_text);
        this.A01 = C86654Ky.A0M(this, R.id.upi_number_update_status_image);
        this.A07 = (ConstraintLayout) findViewById(R.id.shimmer_layout_row);
        this.A02 = (LinearLayout) findViewById(R.id.remove_upi_number_container);
        this.A03 = (LinearLayout) findViewById(R.id.upi_number_update_status_container);
        this.A05 = C18310x6.A0L(this, R.id.upi_number_text);
        this.A04 = C18310x6.A0L(this, R.id.linked_upi_number_status);
        IndiaUpiNumberSettingsViewModel indiaUpiNumberSettingsViewModel = (IndiaUpiNumberSettingsViewModel) AnonymousClass4L0.A0F(new C204749pr(this, 0), this).A01(IndiaUpiNumberSettingsViewModel.class);
        this.A0F = indiaUpiNumberSettingsViewModel;
        C205049qL.A02(this, indiaUpiNumberSettingsViewModel.A00, 32);
        C69263Wi r6 = this.A05;
        C194259Se r11 = this.A0G;
        AnonymousClass9U1 r7 = this.A0L;
        AnonymousClass9U5 r9 = this.A0M;
        C197109ca r10 = this.A0S;
        C40602Ha r8 = this.A0K;
        this.A0C = new AnonymousClass9AE(this, r6, r7, r8, r9, r10, r11);
        this.A0D = new C136986na(this, r6, this.A0H, r7, r8, r9, r11);
        C204249p3.A02(this.A02, this, 54);
        C204249p3.A02(this.A03, this, 55);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        if (r0 == false) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Dialog onCreateDialog(int r4) {
        /*
            r3 = this;
            r0 = 38
            if (r4 == r0) goto L_0x0009
            android.app.Dialog r0 = super.onCreateDialog(r4)
            return r0
        L_0x0009:
            X.7yE r0 = r3.A0B
            if (r0 == 0) goto L_0x0023
            java.lang.String r2 = r0.A03
            int r1 = r2.hashCode()
            r0 = -1660330099(0xffffffff9d095f8d, float:-1.8181198E-21)
            if (r1 != r0) goto L_0x0023
            java.lang.String r0 = "numeric_id"
            boolean r0 = r2.equals(r0)
            r1 = 2131894703(0x7f1221af, float:1.9424218E38)
            if (r0 != 0) goto L_0x0026
        L_0x0023:
            r1 = 2131894843(0x7f12223b, float:1.9424502E38)
        L_0x0026:
            X.0zH r2 = X.AnonymousClass5V0.A00(r3)
            r0 = 2131894844(0x7f12223c, float:1.9424504E38)
            r2.A0U(r0)
            r2.A0T(r1)
            r1 = 2131893004(0x7f121b0c, float:1.9420772E38)
            r0 = 28
            X.C204219p0.A01(r2, r3, r0, r1)
            r1 = 2131895731(0x7f1225b3, float:1.9426303E38)
            r0 = 29
            X.C204219p0.A00(r2, r3, r0, r1)
            X.043 r0 = r2.create()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.IndiaUpiNumberSettingsActivity.onCreateDialog(int):android.app.Dialog");
    }

    public IndiaUpiNumberSettingsActivity(int i) {
        this.A0H = false;
        C204019og.A00(this, 68);
    }

    public IndiaUpiNumberSettingsActivity() {
        this(0);
        this.A0I = C160757oG.A00("IndiaUpiNumberSettingsActivity", "onboarding", "IN");
    }
}
