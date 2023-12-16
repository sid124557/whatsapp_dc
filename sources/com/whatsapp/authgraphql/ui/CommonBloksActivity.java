package com.whatsapp.authgraphql.ui;

import X.AnonymousClass0x9;
import X.AnonymousClass39C;
import X.AnonymousClass4HY;
import X.C08310eF;
import android.content.Intent;
import com.whatsapp.wabloks.ui.WaBloksActivity;

public final class CommonBloksActivity extends WaBloksActivity {
    public boolean A00;

    public void A5r() {
        if (!this.A00) {
            this.A00 = true;
            AnonymousClass0x9.A0K(this).ABM(this);
        }
    }

    public CommonBloksActivity(int i) {
        this.A00 = false;
        AnonymousClass4HY.A00(this, 12);
    }

    public C08310eF A75(Intent intent) {
        String stringExtra = intent.getStringExtra("screen_name");
        if (stringExtra == null) {
            stringExtra = "";
        }
        String stringExtra2 = intent.getStringExtra("screen_params");
        CommonBloksScreenFragment commonBloksScreenFragment = new CommonBloksScreenFragment();
        commonBloksScreenFragment.A1Q(stringExtra);
        commonBloksScreenFragment.A1P(stringExtra2);
        commonBloksScreenFragment.A1M((AnonymousClass39C) intent.getParcelableExtra("screen_cache_config"));
        return commonBloksScreenFragment;
    }

    public CommonBloksActivity() {
        this(0);
    }
}
