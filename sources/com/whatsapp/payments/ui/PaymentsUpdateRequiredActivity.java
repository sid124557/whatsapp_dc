package com.whatsapp.payments.ui;

import X.AnonymousClass0R8;
import X.AnonymousClass3DZ;
import X.C107695bk;
import X.C18310x6;
import X.C1899593h;
import X.C204019og;
import X.C204249p3;
import X.C50382i5;
import X.C53602nM;
import X.C64333Db;
import X.C89644eZ;
import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.WaImageView;

public class PaymentsUpdateRequiredActivity extends C89644eZ {
    public C50382i5 A00;
    public WaImageView A01;
    public C53602nM A02;
    public boolean A03;

    public void A5r() {
        if (!this.A03) {
            this.A03 = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            C1899593h.A15(A002, this);
            C107695bk r1 = A002.A00;
            C1899593h.A0z(A002, r1, this, C1899593h.A0W(A002, r1, this));
            this.A00 = (C50382i5) A002.AZG.get();
            this.A02 = (C53602nM) r1.A2g.get();
        }
    }

    public PaymentsUpdateRequiredActivity(int i) {
        this.A03 = false;
        C204019og.A00(this, 115);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        WaImageView waImageView = this.A01;
        int i = 0;
        if (configuration.orientation == 2) {
            i = 8;
        }
        waImageView.setVisibility(i);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass0R8 supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            C1899593h.A0n(supportActionBar, R.string.f11nameremoved);
        }
        setContentView((int) R.layout.f8nameremoved);
        findViewById(R.id.update_title);
        findViewById(R.id.update_description);
        TextView A0L = C18310x6.A0L(this, R.id.upgrade_button);
        A0L.setText(R.string.f11nameremoved);
        C204249p3.A02(A0L, this, 116);
        this.A01 = (WaImageView) findViewById(R.id.update_icon);
    }

    public PaymentsUpdateRequiredActivity() {
        this(0);
    }
}
